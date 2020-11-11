import java.util.HashMap;

public class MyVisitor<T> extends MiLenguajeBaseVisitor<T> {

    String comodin = "";
    double NUMcomodin = 0;

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public T visitMain_prog(MiLenguajeParser.Main_progContext ctx) {
        //System.out.println("mainProg");
        if(ctx.VAR() != null){
            String name = ctx.var_decl().ID().getText();
            if(table.get(name) != null){
                int line = ctx.var_decl().ID().getSymbol().getLine();
                int col = ctx.var_decl().ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \""+name+"\"ya fue declarada. \n", line, col);
                System.exit(-1);
            }
            else{
                //System.out.println("NAME " + name);
                String TYPE = ctx.var_decl().DATATYPE().toString();
                if (TYPE.equals("num")){
                    Object value = 0.0;
                    table.put(name,value);
                }else{
                    //System.out.println("bool");
                    Object value = false;
                    table.put(name,value);
                }
                comodin = name;
                visitMain_stmt(ctx.main_stmt());
                //System.out.println("BUSQUEDA "+table.get(name));
            }
        }
        //return super.visitMain_prog(ctx);
        return null;
    }

    @Override
    public T visitMain_stmt(MiLenguajeParser.Main_stmtContext ctx) {
        if(ctx.stmt()!=null){


        //System.out.println("mainSTMT");
        //visitStmt(ctx.stmt());
        Object ans = visitStmt(ctx.stmt());
        //String name = ctx.getParent().;
        table.put(comodin, ans);
        //System.out.println("BUSQUEDA "+table.get(comodin));
        Object ans2 = visitMain_stmt(ctx.main_stmt());
        return (T) ans;
        //
        }
        return null;
    }

    @Override
    public T visitStmt(MiLenguajeParser.StmtContext ctx) {
        //System.out.println("STMT");
        int sum = 0;
        if(ctx.TK_PRINT() != null){
            //System.out.println("print");
            //System.out.println("PRINT "+ctx.TK_PRINT());
            //Object ans = visitLexpr(ctx.lexpr());
            for (MiLenguajeParser.LexprContext elemContext : ctx.lexpr()) {
                System.out.println(this.visitLexpr(elemContext));
            }
            //System.out.println("puta "+ctx.lexpr());
        }else if (ctx.INCR()!=null) {
            //System.out.println("INCR");
            if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                System.err.println("La operacion ++ y -- no funciona con booleanos");
                System.exit(-1);
            }else {
                Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                Object ans = value + 1;
                return (T) ans;
            }
        }else if (ctx.DCR()!=null) {
            //System.out.println("DCR");
            if (table.get(ctx.ID().toString()).equals("true") || table.get(ctx.ID().toString()).equals("true")){
                System.err.println("La operacion ++ y -- no funciona con booleanos");
                System.exit(-1);
            }else {
                Double value = Double.parseDouble(table.get(ctx.ID().toString()).toString());
                Object ans = value - 1;
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
                table.put(ctx.ID().toString(), ans);
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
                    table.put(ctx.ID().toString(), ans);
                    return (T) ans;
                }
            }
        }
        return null;
    }

    @Override
    public T visitLexpr(MiLenguajeParser.LexprContext ctx) {
        //System.out.println("LEXPR");
        Object ans = visitNexpr(ctx.nexpr());
        //System.out.println("ans de lexpr"+ans);
        return (T) ans;
    }

    @Override
    public T visitSigno(MiLenguajeParser.SignoContext ctx) {
        //System.out.println("SIGNO");
        if (ctx.ASIGOP() != null){
            Object ans = visitLexpr2(ctx.lexpr2()).toString();
            //System.out.println("ans de signo "+ans);
            return (T) ans;
        }
        else if (ctx.INCR() != null){
            Object ans = ctx.INCR().toString();
            //System.out.println("ans de signo "+ans);
            return (T) ans;
        }
        else {
            Object ans = ctx.DCR().toString();
            //System.out.println("ans de signo "+ans);
            return (T) ans;
        }
    }

    @Override
    public T visitLexpr2(MiLenguajeParser.Lexpr2Context ctx) {
        //System.out.println("LEXPR2");
        Object ans = visitNexpr(ctx.nexpr());
        //System.out.println("ans de lexpr2"+ans);
        return (T) ans;
    }

    @Override
    public T visitNexpr(MiLenguajeParser.NexprContext ctx) {
        //System.out.println("nexpr");
        Object ans = visitRexpr(ctx.rexpr());
        //System.out.println("ans de nexpr"+ans);
        return (T) ans;
    }

    @Override
    public T visitRexpr(MiLenguajeParser.RexprContext ctx) {
        //System.out.println("rexpr");
        Object ans = visitSimple_expr(ctx.simple_expr());
        //System.out.println("ans de rexpr"+ans);
        return (T) ans;
    }

    @Override
    public T visitSimple_expr(MiLenguajeParser.Simple_exprContext ctx) {
        //System.out.println("simpleExp");
        Object ans = visitTerm(ctx.term());
        //System.out.println("ans de simple-rexpr"+ans);
        return (T) ans;
    }

    @Override
    public T visitTerm(MiLenguajeParser.TermContext ctx) {
        //System.out.println("term");
        Object ans = visitFactor(ctx.factor());
        //System.out.println("ans de term"+ans);
        return (T) ans;
    }

    @Override
    public T visitFactor(MiLenguajeParser.FactorContext ctx) {
        //System.out.println("factor");
        if(ctx.TK_NUM() != null){
            Object num = ctx.TK_NUM().getSymbol().getText();
            //System.out.println("imprime num = "+num + " fin");
            return (T) num;
        }else if(ctx.TK_BOOL() != null){
            Object bool = ctx.TK_BOOL().getSymbol().getText();
            return (T) bool;
        }else{
            //System.out.println("ALOHA");
            //System.out.println("print de table de aloha " + table.get(ctx.ID().getText()));
            //System.out.println(ctx.ID());
            //System.out.println(table.get(ctx.ID()));
            return (T) table.get(ctx.ID().getText());
        }
        //return super.visitFactor(ctx);
        //return super.visitFactor(ctx);
    }
}
