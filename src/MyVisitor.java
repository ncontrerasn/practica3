import java.util.HashMap;

public class MyVisitor<T> extends MiLenguajeBaseVisitor<T> {

    String comodin = "";
    double NUMcomodin = 0;

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public T visitMain_prog(MiLenguajeParser.Main_progContext ctx) {
        //System.out.println("mainProg");
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
        //System.out.println("MAIN_STMT");
        //System.out.println(table);
        if(ctx.stmt() != null){
            visitStmt(ctx.stmt());
            //System.out.println(table);
            visitMain_stmt(ctx.main_stmt());
        }
        return null;
    }

    @Override
    public T visitVar_decl (MiLenguajeParser.Var_declContext ctx){

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
        }else{
            //System.out.println("bool");
            Object value = false;
            table.put(name,value);
        }

        visitCont_data(ctx.cont_data());

        return null;

    }

    @Override
    public T visitCont_data (MiLenguajeParser.Cont_dataContext ctx){

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
            } else {
                //System.out.println("bool");
                Object value = false;
                table.put(name, value);
            }

            visitCont_data(ctx.cont_data());
        }
        return null;
    }

    @Override
    public T visitStmt(MiLenguajeParser.StmtContext ctx) {
        System.out.println("STMT SOLO");
        if(ctx.TK_BREAK() != null){
            Object ans2 = "break";
            System.out.println("BREAK");
            return (T) ans2;
        }
        //System.out.println(table);
        int sum = 0;
        if(ctx.TK_PRINT() != null){
            //System.out.println("print");
            //System.out.println("PRINT "+ctx.TK_PRINT());
            //Object ans = visitLexpr(ctx.lexpr());
            Object ans = visitLexpr(ctx.lexpr(0));
            System.out.println(ans.toString());
            return (T) ans;
            //System.out.println("puta "+ctx.lexpr());
        }else if(ctx.TK_FOR() != null){
            //System.out.println("IF");
            Object check = visitLexpr(ctx.lexpr().get(1));
            Object ans = null;

            //System.out.println("check: "+Boolean.parseBoolean(check.toString()));

            if (check.toString().equals("true")||check.toString().equals("false")){
                while (Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(1)).toString()))){
                    //System.out.println("ENTER IF");
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
                    //System.out.println("LEXPR 2"+ctx.lexpr().get(2));
                    //System.out.println("TABLA "+ table.get("z"));

                }
                //System.out.println("IF/ELSE ans "+ans.toString());
                return (T) ans;
            }else{
                System.err.println("La operacion IF require un booleano");
                System.exit(-1);
            }

        }else if(ctx.TK_WHEN() != null){
            //System.out.println("IF");
            Object check = visitLexpr(ctx.lexpr().get(0));
            Object ans = null;

            //System.out.println("check: "+Boolean.parseBoolean(check.toString()));

            if (check.toString().equals("true")||check.toString().equals("false")){
                if (Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(0)).toString()))){
                    //System.out.println("ENTER IF");
                    ans = visitStmt_block(ctx.stmt_block().get(0));
                }
                //System.out.println("IF/ELSE ans "+ans.toString());
                return (T) ans;
            }else{
                System.err.println("La operacion IF require un booleano");
                System.exit(-1);
            }

        }else if(ctx.TK_WHILE() != null){
            //System.out.println("IF");
            Object check = visitLexpr(ctx.lexpr().get(0));
            Object ans = null;

            //System.out.println("check: "+Boolean.parseBoolean(check.toString()));

            if (check.toString().equals("true")||check.toString().equals("false")){
                do{

                    if(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s().INCR() != null){
                        Object var = ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt++;
                        table.remove(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    }else if(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s() != null && ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().s().DCR() != null){
                        Object var = ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString();
                        Double jtt = Double.parseDouble(table.get(var).toString());
                        jtt--;
                        table.remove(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString());
                        table.put(ctx.lexpr().get(0).nexpr().rexpr().simple_expr().term().factor().ID().toString(), jtt);
                    }
                    ans = visitStmt_block(ctx.stmt_block().get(0));
                    if(ans.toString().equals("break")){
                        System.out.println("CHAO");
                        break;
                    }
                }
                while (Boolean.parseBoolean((visitLexpr(ctx.lexpr().get(0)).toString())));
                    //System.out.println("ENTER IF");
                //System.out.println("IF/ELSE ans "+ans.toString());
                return (T) ans;
            }else{
                System.err.println("La operacion IF require un booleano");
                System.exit(-1);
            }

        }else if(ctx.TK_IF() != null){
            //System.out.println("IF");
            Object check = visitLexpr(ctx.lexpr().get(0));
            Object ans;

            //System.out.println("check: "+Boolean.parseBoolean(check.toString()));

            if (check.toString().equals("true")||check.toString().equals("false")){
                if (Boolean.parseBoolean(check.toString())){
                    //System.out.println("ENTER IF");
                    ans = visitStmt_block(ctx.stmt_block().get(0));

                }else{
                    //System.out.println("ENTER ELSE");
                    ans = visitStmt_block(ctx.stmt_block().get(1));
                }
                //System.out.println("IF/ELSE ans "+ans.toString());
                return (T) ans;
            }else{
                System.err.println("La operacion IF require un booleano");
                System.exit(-1);
            }

        }else if (ctx.INCR() != null) {
            //System.out.println("INCR");
            if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                System.err.println("La operacion ++ y -- no funciona con booleanos");
                System.exit(-1);
            }else {
                Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                Object ans = value + 1;
                table.put(ctx.ID().toString(),ans);
                return (T) ans;
            }
        }else if (ctx.DCR() != null) {
            //System.out.println("DCR");
            if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                System.err.println("La operacion ++ y -- no funciona con booleanos");
                System.exit(-1);
            }else {
                Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                Object ans = value - 1;
                table.put(ctx.ID().toString(),ans);
                return (T) ans;
            }
        }
        else if(ctx.ID() != null){
            //System.out.println("id");
            //System.out.println("ID " + ctx.ID().getText());
            /*if(table.get(ctx.ID().getText())==null){
                System.out.println("ERROR");
            }*/
            //System.out.println("ID " + table.get(ctx.ID().getText()));
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
                //System.out.println("beforePUT IDASIG"+table);
                table.put(ctx.ID().toString(), ans);
                //System.out.println("AfterPUT IDASIG"+table);
                return (T) ans;
            }else {
                Object ans = 0.0;
                String INCRDCR = visitSigno(ctx.signo()).toString();
                if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                    System.err.println("La operacion ++ y -- no funciona con booleanos");
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
                    //System.out.println("beforePUT IDnoASIG "+table);
                    table.put(ctx.ID().toString(), ans);
                    //System.out.println("AfterPUT IDnoASIG "+table);
                    return (T) ans;
                }
            }
        }
        return null;
    }

    @Override
    public T visitStmt_mas(MiLenguajeParser.Stmt_masContext ctx) {
        if(ctx.stmt() != null){
            visitStmt(ctx.stmt());
            visitStmt_mas(ctx.stmt_mas());
            return null;
        }else if(ctx.stmt() != null){
            Object ans = visitStmt(ctx.stmt());
            return (T) ans;
        }
        return null;
    }

    @Override
    public T visitStmt_block(MiLenguajeParser.Stmt_blockContext ctx) {
        System.out.println("STMT BLOCK");
        if(ctx.CORIZQ() != null){

            visitStmt(ctx.stmt());
            visitStmt_mas(ctx.stmt_mas());
            if(ctx.stmt().TK_BREAK() != null){
                Object ans2 = "break";
                System.out.println("BREAK");
                return (T) ans2;
            }
            return null;
        }else if(ctx.stmt() != null){
            System.out.println("STMT");
            if(ctx.stmt().TK_BREAK() != null){
                Object ans2 = "break";
                System.out.println("BREAK");
                return (T) ans2;
            }
            Object ans = visitStmt(ctx.stmt());
            return (T) ans;
        }
        return null;
    }

    @Override
    public T visitLexpr(MiLenguajeParser.LexprContext ctx) {
        //System.out.println("LEXPR");
        //System.out.println(table);
        Object ans = visitNexpr(ctx.nexpr());
        //System.out.println(table);
        //System.out.println("ans de lexpr "+ans);
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
        //System.out.println("SIGNO");
        //System.out.println(table);
        if (ctx.ASIGOP() != null){
            Object ans = visitLexpr2(ctx.lexpr2()).toString();
            //System.out.println(table);
            //System.out.println("ans de signo "+ans);
            return (T) ans;
        }
        else if (ctx.INCR() != null){
            Object ans = ctx.INCR().toString();
            //System.out.println(table);
            //System.out.println("ans de signo "+ans);
            return (T) ans;
        }
        else {
            Object ans = ctx.DCR().toString();
            //System.out.println(table);
            //System.out.println("ans de signo "+ans);
            return (T) ans;
        }
    }

    @Override
    public T visitLexpr2(MiLenguajeParser.Lexpr2Context ctx) {
        //System.out.println("LEXPR2");
        //System.out.println(table);
        Object ans = visitNexpr(ctx.nexpr());
        //System.out.println(table);
        //System.out.println("ans de lexpr2 "+ans);
        return (T) ans;
    }

    @Override
    public T visitNexpr(MiLenguajeParser.NexprContext ctx) {
        Object ans = null;
        if(ctx.rexpr() != null){
            ans = visitRexpr(ctx.rexpr());
            if(ctx.rexpr().sig().ROP() != null){
                if (ctx.rexpr().sig().ROP().toString().equals("<")){
                    Double ans2 = Double.parseDouble(visitSimple_expr(ctx.rexpr().sig().simple_expr()).toString());
                    Double ans1 = Double.parseDouble(ans.toString());
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
        Object ans = visitSimple_expr(ctx.simple_expr());
        //Object ans2 = visitSig(ctx.sig());
        //System.out.println(table);
        //System.out.println("ans de rexpr "+ans);
        return (T) ans;
    }

    @Override
    public T visitSimple_expr(MiLenguajeParser.Simple_exprContext ctx) {
        //System.out.println("simpleExp");
        //System.out.println(table);
        Object ans = visitTerm(ctx.term());
        //System.out.println(table);
        //System.out.println("ans de simple-rexpr "+ans);
        return (T) ans;
    }

    @Override
    public T visitTerm(MiLenguajeParser.TermContext ctx) {
        //System.out.println("term");
        //System.out.println(table);
        Object ans = visitFactor(ctx.factor());
        //System.out.println(table);
        //System.out.println("ans de term "+ans);
        return (T) ans;
    }

    @Override
    public T visitFactor(MiLenguajeParser.FactorContext ctx) {
        if(ctx.TK_NUM() != null){
            Object num = ctx.TK_NUM().getSymbol().getText();
            //System.out.println("imprime num = "+num + " fin");
            return (T) num;
        }else if(ctx.TK_BOOL() != null){
            Object bool = ctx.TK_BOOL().getSymbol().getText();
            return (T) bool;
        }else if (ctx.PIZQ() != null){
            Object ans = visitLexpr(ctx.lexpr());
            return (T) ans;
        }else if (ctx.INCR() != null){
            Object var = ctx.ID().toString();
            Double ans = Double.parseDouble(table.get(var).toString());
            ans++;
            table.remove(ctx.ID().toString());
            table.put(ctx.ID().toString(), ans);
            return (T) ans;
        }else if (ctx.DCR() != null){
            Object var = ctx.ID().toString();
            Double ans = Double.parseDouble(table.get(var).toString());
            ans--;
            table.remove(ctx.ID().toString());
            table.put(ctx.ID().toString(), ans);
            return (T) ans;
        }else if (ctx.ID() != null){
            if (ctx.s().INCR() != null || ctx.s().DCR() != null){
                Object var = ctx.ID().toString();
                Double ans = Double.parseDouble(table.get(var).toString());
                return (T) ans;
            }
        }
        else{
            return (T) table.get(ctx.ID().getText());
        }
        return (T) table.get(ctx.ID().getText());
    }
}
