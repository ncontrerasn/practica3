import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MyVisitor<T> extends MiLenguajeBaseVisitor<T> {

    HashMap<String, Object> table = new HashMap<>();
    ArrayList<String> tableToDelete = new ArrayList<String>();
    boolean delete = false;
    boolean a = false;
    int varNum = 0;
    Object retornar = null;
    boolean retornado = false;
    boolean canPrint = true;

    @Override
    public T visitProg(MiLenguajeParser.ProgContext ctx) {
        System.out.println("Prog");
        visitProg_fn(ctx.prog_fn());
        visitMain_prog(ctx.main_prog());
        return null;
    }

    @Override
    public T visitProg_fn(MiLenguajeParser.Prog_fnContext ctx) {
        System.out.println("Prog_fn");
        if(ctx.fn_decl_list()!=null){
            visitFn_decl_list(ctx.fn_decl_list());
            visitProg_fn(ctx.prog_fn());
        }else{
            /*nada*/
        }
        return null;
    }

    @Override
    public T visitFn_decl_list(MiLenguajeParser.Fn_decl_listContext ctx) {
        System.out.println("Fn_decl_list");
        String functionName = ctx.FID().toString();
        table.put(functionName,ctx);
        delete = true;
        canPrint = false;
        visitVar_decl(ctx.var_decl());
        visitFn_decl_list_withVAR(ctx.fn_decl_list_withVAR());
        visitStmt_block(ctx.stmt_block());
        Object ans = null;
        if(retornar==null) {
            System.err.println("Error, la funcion "+ctx.FID().toString()+" no tiene RETURN o retorna null");
            System.exit(-1);
        }else if ((retornar.toString().equals("true")||retornar.toString().equals("false"))&&(ctx.DATATYPE().toString().equals("num"))){
            System.err.println("Error, la funcion "+ctx.FID().toString()+" es de tipo NUM pero retorna BOOL");
            System.exit(-1);
        }else if (!(retornar.toString().equals("true")||retornar.toString().equals("false"))&&(ctx.DATATYPE().toString().equals("bool"))){
            System.err.println("Error, la funcion "+ctx.FID().toString()+" es de tipo BOOL pero retorna NUM");
            System.exit(-1);
        }
        retornar=null;
        int numToRemove = tableToDelete.size();
        for (int i=0; i<numToRemove; i++){
            String var = tableToDelete.remove(0);
            if (table.containsKey(var)){
                table.remove(var);
            }
        }
        canPrint = true;
        delete = false;
        return null;
    }

    @Override
    public T visitMain_prog(MiLenguajeParser.Main_progContext ctx) {
        System.out.println("mainProg");
        if(ctx.VAR() != null){
            visitVar_decl(ctx.var_decl());
            visitMain_stmt(ctx.main_stmt());
        }else{
            visitMain_stmt(ctx.main_stmt());
        }
        return null;
    }

    @Override
    public T visitMain_stmt(MiLenguajeParser.Main_stmtContext ctx) {
        System.out.println("MAIN_STMT");
        if(ctx.stmt() != null){
            visitStmt(ctx.stmt());
            if (retornado){
                retornado = false;
                return null;
            }
            visitMain_stmt(ctx.main_stmt());
        }
        return null;
    }

    @Override
    public T visitVar_decl (MiLenguajeParser.Var_declContext ctx){
        System.out.println("Var_decl");
        String TYPE = ctx.DATATYPE().toString();
        String name = ctx.ID().toString();
        if(table.get(name) != null){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre: \""+name+"\"ya fue declarada. \n", line, col);
            System.exit(-1);
        }
        else if (TYPE.equals("num")){
            Object value = 0.0;
            table.put(name,value);
            if (delete){
                tableToDelete.add(name);
            }
        }else{
            Object value = false;
            table.put(name,value);
            if (delete){
                tableToDelete.add(name);
            }
        }
        visitCont_data(ctx.cont_data());
        return null;
    }

    @Override
    public T visitCont_data (MiLenguajeParser.Cont_dataContext ctx){
        System.out.println("Cont_data");
        if (ctx.ID() != null) {
            String TYPE = ctx.DATATYPE().toString();
            String name = ctx.ID().toString();
            if(table.get(name) != null){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \""+name+"\"ya fue declarada. \n", line, col);
                System.exit(-1);
            }
            else if (TYPE.equals("num")) {
                Object value = 0.0;
                table.put(name, value);
                if (delete){
                    tableToDelete.add(name);
                }
            } else {
                Object value = false;
                table.put(name, value);
                if (delete){
                    tableToDelete.add(name);
                }
            }
            visitCont_data(ctx.cont_data());
        }
        return null;
    }

    @Override
    public T visitStmt(MiLenguajeParser.StmtContext ctx) {
        System.out.println("Stmt");
        if(a) return null;
        if(ctx.TK_BREAK() != null){
            a = true;
        }else if(ctx.TK_NEXT() != null){

        }else if(ctx.TK_IF() != null){
            System.out.println("IF");
            Object check = visitLexpr(ctx.lexpr().get(0));
            Object ans;
            if (check.toString().equals("true")||check.toString().equals("false")){
                if (Boolean.parseBoolean(check.toString())){
                    ans = visitStmt_block(ctx.stmt_block().get(0));
                }else{
                    ans = visitStmt_block(ctx.stmt_block().get(1));
                }
                return (T) ans;
            }else{
                System.err.println("La operacion if require un booleano");
                System.exit(-1);
            }
        }else if(ctx.TK_RETURN() != null){
            retornar = visitLexpr(ctx.lexpr().get(0));
            System.out.println("RETURN ES "+retornar.toString());
            retornado = true;
            return null;
        }else if(ctx.TK_PRINT() != null){
            Object ans = visitLexpr(ctx.lexpr(0));
            if (canPrint) {
                System.out.println(ans.toString());
            }
            return (T) ans;
        }else if(ctx.TK_INPUT() != null){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el valor de " + ctx.ID().toString() + ": ");
            if(table.get(ctx.ID().toString()).toString().equals("false") || table.get(ctx.ID().toString()).toString().equals("true")){
                String input = sc.next();
                if(input.equals("false") || input.equals("true"))
                    table.put(ctx.ID().toString(), input);
                else{
                    System.err.println("La entrada no coincide con el tipo de dato de la variable "+ ctx.ID().toString());
                    System.exit(-1);
                }
            }else{
                String cadena = sc.next();
                double numero;
                try {
                    numero = Double.parseDouble(cadena);
                    table.put(ctx.ID().toString(), numero);
                } catch (NumberFormatException nfe){
                    System.err.println("La entrada no coincide con el tipo de dato de la variable "+ ctx.ID().toString());
                    System.exit(-1);
                }
            }
            return null;
        }else if(ctx.TK_FOR() != null){
            Object check = visitLexpr(ctx.lexpr().get(1));
            Object ans = null;
            if (check.toString().equals("true")||check.toString().equals("false")){
                while (Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(1)).toString()))){
                    if(a){
                        a = false;
                        break;
                    }
                    ans = visitStmt_block(ctx.stmt_block().get(0));
                    visitLexpr(ctx.lexpr().get(2));
                    if(ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(2).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    }
                }
                return (T) ans;
            }else{
                System.err.println("La operacion for require un booleano");
                System.exit(-1);
            }
        }else if(ctx.TK_WHEN() != null){
            Object check = visitLexpr(ctx.lexpr().get(0));
            Object ans = null;
            if (check.toString().equals("true")||check.toString().equals("false")){
                if (Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(0)).toString()))){
                    ans = visitStmt_block(ctx.stmt_block().get(0));
                }
                return (T) ans;
            }else{
                System.err.println("La operacion when require un booleano");
                System.exit(-1);
            }
        }else if(ctx.TK_UNLESS() != null){
            Object check = visitLexpr(ctx.lexpr().get(0));
            Object ans = null;
            if (check.toString().equals("true")||check.toString().equals("false")){
                if (!Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(0)).toString()))){
                    ans = visitStmt_block(ctx.stmt_block().get(0));
                }
                return (T) ans;
            }else{
                System.err.println("La operacion unless require un booleano");
                System.exit(-1);
            }
        }else if(ctx.TK_WHILE() != null){
            Object check = visitLexpr(ctx.lexpr().get(0));
            if (check.toString().equals("true")||check.toString().equals("false")){
                while (Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(0)).toString()))) {
                    if (a) {
                        a = false;
                        break;
                    }
                    if (ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s().INCR() != null) {
                        Object var = ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    } else if (ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s().DCR() != null) {
                        Object var = ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    visitStmt_block(ctx.stmt_block(0));
                }
            }else{
                System.err.println("La operacion while require un booleano");
                System.exit(-1);
            }
        }else if(ctx.TK_UNTIL() != null){
            Object check = visitLexpr(ctx.lexpr().get(0));
            if (check.toString().equals("true")||check.toString().equals("false")){
                while (!Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(0)).toString()))){
                    if (a) {
                        a = false;
                        break;
                    }
                    if (ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s().INCR() != null) {
                        Object var = ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    } else if (ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s().DCR() != null) {
                        Object var = ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    visitStmt_block(ctx.stmt_block(0));
                }
            }else{
                System.err.println("La operacion until require un booleano");
                System.exit(-1);
            }
        }else if(ctx.TK_DO() != null){
            Object ans = null;
            ans = visitStmt_block(ctx.stmt_block().get(0));
            if(ctx.do_sig().TK_WHILE() != null){
                Object check = visitLexpr(ctx.do_sig().lexpr());
                if (check.toString().equals("true")||check.toString().equals("false")){
                    while (Boolean.parseBoolean((visitLexpr(ctx.do_sig().lexpr()).toString()))){
                        if(a){
                            a = false;
                            break;
                        }
                        if(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s().INCR() != null){
                            Object var = ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString();
                            Double jtt = Double.parseDouble(table.get(var).toString());
                            jtt++;
                            table.remove(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString());
                            table.put(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                        }else if(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s().DCR() != null){
                            Object var = ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString();
                            Double jtt = Double.parseDouble(table.get(var).toString());
                            jtt--;
                            table.remove(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString());
                            table.put(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                        }
                        visitStmt_block(ctx.stmt_block(0));
                    }

                }else{
                    System.err.println("La operacion while require un booleano");
                    System.exit(-1);
                }
            }else if(ctx.do_sig().TK_UNTIL() != null){
                Object check = visitLexpr(ctx.do_sig().lexpr());
                if (check.toString().equals("true")||check.toString().equals("false")){
                    while (!Boolean.parseBoolean((visitLexpr(ctx.do_sig().lexpr()).toString()))){
                        if(a){
                            a = false;
                            break;
                        }
                        if(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s().INCR() != null){
                            Object var = ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString();
                            Double jtt = Double.parseDouble(table.get(var).toString());
                            jtt++;
                            table.remove(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString());
                            table.put(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                        }else if(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().s().DCR() != null){
                            Object var = ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString();
                            Double jtt = Double.parseDouble(table.get(var).toString());
                            jtt--;
                            table.remove(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString());
                            table.put(ctx.do_sig().lexpr().nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                        }
                        visitStmt_block(ctx.stmt_block(0));
                    }
                }else{
                    System.err.println("La operacion until require un booleano");
                    System.exit(-1);
                }
            }
            return (T) ans;
        }else if(ctx.TK_LOOP() != null){
            Object ans = null;
            while (true){
                if(a){
                    a = false;
                    break;
                }
                ans = visitStmt_block(ctx.stmt_block().get(0));
            }
            return (T) ans;
        }else if(ctx.TK_REPEAT() != null){
            Object ans = null;
            for (int i = 0; i < Integer.parseInt(ctx.TK_NUM().toString()); i++){
                if(a){
                    a = false;
                    break;
                }
                ans = visitStmt_block(ctx.stmt_block().get(0));
            }
            return (T) ans;
        }else if (ctx.INCR() != null) {
            if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                System.err.println("La operacion ++ y -- no funcionan con booleanos");
                System.exit(-1);
            }else {
                Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                Object ans = value + 1;
                table.put(ctx.ID().toString(),ans);
                return (T) ans;
            }
        }else if (ctx.DCR() != null) {
            if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                System.err.println("La operacion ++ y -- no funcionan con booleanos");
                System.exit(-1);
            }else {
                Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                Object ans = value - 1;
                table.put(ctx.ID().toString(),ans);
                return (T) ans;
            }
        }
        else if(ctx.ID() != null){
            if (ctx.signo().ASIGOP()!=null) {
                String ASGOP = ctx.signo().ASIGOP().toString();
                Object ans = visitSigno(ctx.signo());
                if (ans.toString().equals("true") || ans.toString().equals("false")) {
                    switch (ASGOP) {
                        case ":=":
                            /*nada*/
                            break;
                        case "+=":
                            System.err.println("La operacion += no funciona con booleanos");
                            System.exit(-1);
                            break;
                        case "-=":
                            System.err.println("La operacion -= no funciona con booleanos");
                            System.exit(-1);
                            break;
                        case "*=":
                            System.err.println("La operacion *= no funciona con booleanos");
                            System.exit(-1);
                            break;
                        case "/=":
                            System.err.println("La operacion /= no funciona con booleanos");
                            System.exit(-1);
                            break;
                        case "%=":
                            System.err.println("La operacion %= no funciona con booleanos");
                            System.exit(-1);
                            break;
                    }
                } else {
                    Double value =  Double.parseDouble(table.get(ctx.ID().toString()).toString());
                    Double valotToOperate =  Double.parseDouble(ans.toString());
                    switch (ASGOP) {
                        case ":=":
                            /*nada*/
                            break;
                        case "+=":
                            ans =  value + valotToOperate;
                            break;
                        case "-=":
                            ans = value - valotToOperate;
                            break;
                        case "*=":
                            ans = value * valotToOperate;
                            break;
                        case "/=":
                            ans = value / valotToOperate;
                            break;
                        case "%=":
                            ans = value % valotToOperate;
                            break;
                    }
                }
                table.put(ctx.ID().toString(), ans);
                return (T) ans;
            }else {
                Object ans = 0.0;
                String INCRDCR = visitSigno(ctx.signo()).toString();
                if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                    System.err.println("La operacion ++ y -- no funcionan con booleanos");
                    System.exit(-1);
                }else {
                    Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                    switch (INCRDCR) {
                        case "++":
                            ans = value + 1;
                            break;
                        case "--":
                            ans = value - 1;
                            break;
                    }
                    table.put(ctx.ID().toString(), ans);
                    return (T) ans;
                }
            }
        }
        return null;
    }

    @Override
    public T visitStmt_mas(MiLenguajeParser.Stmt_masContext ctx) {
        System.out.println("Stmt_mas");
        if(ctx.stmt() != null){
            visitStmt(ctx.stmt());
            if (retornado){
                retornado = false;
                return null;
            }
            visitStmt_mas(ctx.stmt_mas());
            return null;
        }else{
            /*nada*/
        }
        return null;
    }

    @Override
    public T visitStmt_block(MiLenguajeParser.Stmt_blockContext ctx) {
        System.out.println("Stmt_block");
        if(ctx.CORIZQ() != null){
            Object ans2 = visitStmt(ctx.stmt());
            if (retornado){
                retornado = false;
                return (T) ans2;
            }
            visitStmt_mas(ctx.stmt_mas());
            return (T) ans2;
        }else if(ctx.stmt() != null){
            Object ans = visitStmt(ctx.stmt());
            if (retornado){
                retornado = false;
                return (T) ans;
            }
            return (T) ans;
        }
        return null;
    }

    @Override
    public T visitLexpr(MiLenguajeParser.LexprContext ctx) {
        System.out.println("Lexpr");
        Object ans = visitNexpr(ctx.nexpr());
        if (ctx.nexpr_prima().TK_AND() != null){
            Object ans2 = visitLexpr_and(ctx.nexpr_prima().lexpr_and());
            Object ret = Boolean.parseBoolean(ans.toString()) && Boolean.parseBoolean(ans2.toString());
            return (T) ret;
        }else if (ctx.nexpr_prima().TK_OR() != null){
            Object ans2 = visitLexpr_or(ctx.nexpr_prima().lexpr_or());
            Object ret = Boolean.parseBoolean(ans.toString()) || Boolean.parseBoolean(ans2.toString());
            return (T) ret;
        }
        else {
            return (T) ans;
        }
    }

    @Override
    public T visitLexpr_and(MiLenguajeParser.Lexpr_andContext ctx){
        System.out.println("Lexpr_and");
        Object ans = visitNexpr(ctx.nexpr());
        if (ctx.nexpr_primab().TK_AND() != null){
            Object ans2 = visitLexpr_and(ctx.nexpr_primab().lexpr_and());
            Object ret = Boolean.parseBoolean(ans.toString()) && Boolean.parseBoolean(ans2.toString());
            return (T) ret;
        }else{
            return (T) ans;
        }
    }

    @Override
    public T visitLexpr_or(MiLenguajeParser.Lexpr_orContext ctx){
        System.out.println("Lexpr_or");
        Object ans = visitNexpr(ctx.nexpr());
        if (ctx.nexpr_primac().TK_OR() != null){
            Object ans2 = visitLexpr_or(ctx.nexpr_primac().lexpr_or());
            Object ret = Boolean.parseBoolean(ans.toString()) || Boolean.parseBoolean(ans2.toString());
            return (T) ret;
        }else{
            return (T) ans;
        }
    }

    @Override
    public T visitSigno(MiLenguajeParser.SignoContext ctx) {
        System.out.println("SIGNO");
        if (ctx.ASIGOP() != null){
            Object ans = visitLexpr2(ctx.lexpr2()).toString();
            return (T) ans;
        }
        else if (ctx.INCR() != null){
            Object ans = ctx.INCR().toString();
            return (T) ans;
        }
        else {
            Object ans = ctx.DCR().toString();
            return (T) ans;
        }
    }

    @Override
    public T visitLexpr2(MiLenguajeParser.Lexpr2Context ctx) {
        System.out.println("LEXPR2");
        Object ans = visitNexpr(ctx.nexpr());
        return (T) ans;
    }

    @Override
    public T visitNexpr(MiLenguajeParser.NexprContext ctx) {
        System.out.println("Nexpr");
        Object ans = null;
        if(ctx.rexpr() != null){
            ans = visitRexpr(ctx.rexpr());
            if(ctx.rexpr().sig().ROP() != null){
                if (ctx.rexpr().sig().ROP().toString().equals("<")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    System.out.println("|||||||||||||||||||||||| "+ans2);
                    Double ans1 = Double.parseDouble(ans.toString());
                    System.out.println("|||||||||||||||||||||||| "+ans1);
                    boolean ret2 = ans1 < ans2;
                    Object ret = (Object) ret2;
                    if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    return (T) ret;
                }
                else if(ctx.rexpr().sig().ROP().toString().equals(">")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    Double ans1 = Double.parseDouble(ans.toString());
                    boolean ret2 = ans1 > ans2;
                    Object ret = (Object) ret2;
                    if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    return (T) ret;
                }
                else if(ctx.rexpr().sig().ROP().toString().equals("<=")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    Double ans1 = Double.parseDouble(ans.toString());
                    boolean ret2 = ans1 <= ans2;
                    Object ret = (Object) ret2;
                    if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    return (T) ret;
                }
                else if(ctx.rexpr().sig().ROP().toString().equals(">=")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    Double ans1 = Double.parseDouble(ans.toString());
                    boolean ret2 = ans1 >= ans2;
                    Object ret = (Object) ret2;
                    if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    return (T) ret;
                }
                else if(ctx.rexpr().sig().ROP().toString().equals("==")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    Double ans1 = Double.parseDouble(ans.toString());
                    double resta = Math.abs(ans1 - ans2);
                    boolean ret2;
                    if(resta <= 0.00001)
                        ret2 = true;
                    else
                        ret2 = false;
                    Object ret = (Object) ret2;
                    if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    return (T) ret;
                }
                else if(ctx.rexpr().sig().ROP().toString().equals("!=")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    Double ans1 = Double.parseDouble(ans.toString());
                    double resta = Math.abs(ans1 - ans2);
                    boolean ret2;
                    if(resta <= 0.00001)
                        ret2 = false;
                    else
                        ret2 = true;
                    Object ret = (Object) ret2;
                    if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.rexpr().sig().simple_expr().term().factor().s() != null && ctx.rexpr().sig().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.rexpr().sig().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.rexpr().sig().simple_expr().term().factor().ID().toString());
                        table.put(ctx.rexpr().sig().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    return (T) ret;
                }
            }
        }else if(ctx.TK_NOT() != null){
            Object ans2 = visitLexpr(ctx.lexpr());
            String res = String.valueOf(ans2);
            boolean a = !Boolean.parseBoolean(res);
            Object ret = (Object) a;
            return (T) ret;
        }
        return (T) ans;
    }

    @Override
    public T visitRexpr(MiLenguajeParser.RexprContext ctx) {
        System.out.println("Rexpr");
        Object ans = visitSimple_expr(ctx.simple_expr());
        return (T) ans;
    }

    @Override
    public T visitSimple_expr(MiLenguajeParser.Simple_exprContext ctx) {
        System.out.println("simpleExp");
        Object ans = visitTerm(ctx.term());
        if (ctx.t2().SUMOP()!=null){
            if (ans.toString().equals("true")||ans.toString().equals("false")){
                System.err.println("La operacion + no funciona con booleanos");
                System.exit(-1);
            }
            String op = ctx.t2().SUMOP().toString();
            Object ans2 = visitT2(ctx.t2());
            if (ans2.toString().equals("true")||ans2.toString().equals("false")){
                System.err.println("La operacion + no funciona con booleanos");
                System.exit(-1);
            }
            switch(op){
                case "+":ans = Double.parseDouble(ans.toString()) + Double.parseDouble(ans2.toString());
                break;
                case "-":ans = Double.parseDouble(ans.toString()) - Double.parseDouble(ans2.toString());
                break;
            }
        }
        return (T) ans;
    }

    @Override
    public T visitT2(MiLenguajeParser.T2Context ctx) {
        System.out.println("simpleExp");
        Object ans = visitTerm(ctx.term());
        if (ctx.t2().SUMOP()!=null){
            if (ans.toString().equals("true")||ans.toString().equals("false")){
                System.err.println("La operacion + no funciona con booleanos");
                System.exit(-1);
            }
            String op = ctx.t2().SUMOP().toString();
            Object ans2 = visitT2(ctx.t2());
            if (ans2.toString().equals("true")||ans2.toString().equals("false")){
                System.err.println("La operacion + no funciona con booleanos");
                System.exit(-1);
            }
            switch(op){
                case "+":ans = Double.parseDouble(ans.toString()) + Double.parseDouble(ans2.toString());
                    break;
                case "-":ans = Double.parseDouble(ans.toString()) - Double.parseDouble(ans2.toString());
                    break;
            }
        }
        return (T) ans;
    }

    @Override
    public T visitTerm(MiLenguajeParser.TermContext ctx) {
        System.out.println("term");
        Object ans = visitFactor(ctx.factor());
        return (T) ans;
    }

    @Override
    public T visitFactor(MiLenguajeParser.FactorContext ctx) {
        System.out.println("Factor");
        System.out.println("FID? "+ctx.FID());
        if(ctx.TK_NUM() != null){
            System.out.println("TK_NUM");
            Object num = ctx.TK_NUM().getSymbol().getText();
            System.out.println("|||||||||||||returnfactor||||||||||| "+num.toString());
            return (T) num;
        }else if(ctx.TK_BOOL() != null){
            System.out.println("TK_BOOL");
            Object bool = ctx.TK_BOOL().getSymbol().getText();
            return (T) bool;
        }else if (ctx.FID()!=null){
            System.out.println("FID");
            MiLenguajeParser.Fn_decl_listContext FunctionCtx = (MiLenguajeParser.Fn_decl_listContext) table.get(ctx.FID().getText());

            delete = true;

            visitVar_decl(FunctionCtx.var_decl());
            Object var1 = visitLexpr(ctx.lexpr());
            if ((var1.toString().equals("true")||var1.toString().equals("false"))&&(table.get(tableToDelete.get(0)).toString().equals("0.0"))){
                System.err.println("La variable "+tableToDelete.get(0)+" es de tipo NUM y no acepta booleanos");
                System.exit(-1);
            }else if (!(var1.toString().equals("true") || var1.toString().equals("false")) && (table.get(tableToDelete.get(0)).toString().equals("true")||table.get(tableToDelete.get(0)).toString().equals("false"))){
                System.err.println("La variable " + tableToDelete.get(0) + " es de tipo BOOL y no acepta numeros");
                System.exit(-1);
            }else{
                table.put(tableToDelete.get(0),var1);
            }
            varNum = 1;
            visitF2(ctx.f2());

            visitFn_decl_list_withVAR(FunctionCtx.fn_decl_list_withVAR());
            System.out.println("------------------------------------------------------------");
            System.out.println(table);
            System.out.println(tableToDelete);
            System.out.println("------------------------------------------------------------");

            visitStmt_block(FunctionCtx.stmt_block());
            Object ans = null;
            if(retornar==null) {
                if (FunctionCtx.DATATYPE().toString().equals("num")) {
                    ans = 0.0;
                } else {
                    ans = false;
                }
            }else if ((retornar.toString().equals("true")||retornar.toString().equals("false"))&&(FunctionCtx.DATATYPE().toString().equals("num"))){
                System.err.println("Error, la funcion "+ctx.FID().toString()+" es de tipo NUM pero retorna BOOL");
                System.exit(-1);
            }else if (!(retornar.toString().equals("true")||retornar.toString().equals("false"))&&(FunctionCtx.DATATYPE().toString().equals("bool"))){
                System.err.println("Error, la funcion "+ctx.FID().toString()+" es de tipo BOOL pero retorna NUM");
                System.exit(-1);
            }else {
                ans = retornar;
            }

            retornar=null;
            int numToRemove = tableToDelete.size();
            for (int i=0; i<numToRemove; i++){
                String var = tableToDelete.remove(0);
                if (table.containsKey(var)){
                    table.remove(var);
                }
            }
            delete = false;
            System.out.println("------------------------------------------------------------");
            System.out.println(table);
            System.out.println(tableToDelete);
            System.out.println("------------------------------------------------------------");
            return (T) ans;
        }else if (ctx.PIZQ() != null){
            System.out.println("PIZQ");
            Object ans = visitLexpr(ctx.lexpr());
            return (T) ans;
        }else if (ctx.INCR() != null){
            System.out.println("INCR");
            Object var = ctx.ID().toString();
            Double ans = Double.parseDouble(table.get(var).toString());
            ans++;
            table.remove(ctx.ID().toString());
            table.put(ctx.ID().toString(), ans);
            return (T) ans;
        }else if (ctx.DCR() != null){
            System.out.println("DCR");
            Object var = ctx.ID().toString();
            Double ans = Double.parseDouble(table.get(var).toString());
            ans--;
            table.remove(ctx.ID().toString());
            table.put(ctx.ID().toString(), ans);
            return (T) ans;
        }else if (ctx.ID() != null){
            System.out.println("ID");
            if (ctx.s().INCR() != null || ctx.s().DCR() != null){
                Object var = ctx.ID().toString();
                Double ans = Double.parseDouble(table.get(var).toString());
                return (T) ans;
            }
        }
        return (T) table.get(ctx.ID().getText());
    }

    @Override
    public T visitFn_decl_list_withVAR(MiLenguajeParser.Fn_decl_list_withVARContext ctx) {
        System.out.println("Fn_decl_list_withVAR");
        if(ctx.VAR() != null){
            visitVar_decl(ctx.var_decl());
        }else{
            /*nada*/
        }
        return null;
    }

    @Override
    public T visitF2(MiLenguajeParser.F2Context ctx) {
        System.out.println("F2");
        if (ctx.COLON()!=null) {
            Object var1 = visitLexpr(ctx.lexpr());
            if ((var1.toString().equals("true") || var1.toString().equals("false")) && (table.get(tableToDelete.get(varNum)).toString().equals("0.0"))) {
                System.err.println("La variable " + tableToDelete.get(varNum) + " es de tipo NUM y no acepta booleanos");
                System.exit(-1);
            } else if (!(var1.toString().equals("true") || var1.toString().equals("false")) && (table.get(tableToDelete.get(varNum)).toString().equals("true")||table.get(tableToDelete.get(varNum)).toString().equals("false"))){
                System.err.println("La variable " + tableToDelete.get(varNum) + " es de tipo BOOL y no acepta numeros");
                System.exit(-1);
            }
            else {
                table.put(tableToDelete.get(varNum), var1);
            }
            varNum++;
            visitF2(ctx.f2());
        }else{
            /*nada*/
        }
        return null;
    }
}
