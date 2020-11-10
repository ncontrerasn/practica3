import java.util.HashMap;

public class MyVisitor<T> extends MiLenguajeBaseVisitor<T> {

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public T visitMain_prog(MiLenguajeParser.Main_progContext ctx) {
        System.out.println("mainProg");
        if(ctx.VAR() != null){
            String name = ctx.var_decl().getText();
            if(table.get(name) != null){
                int line = ctx.var_decl().ID().getSymbol().getLine();
                int col = ctx.var_decl().ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre: \""+name+"\"ya fue declarada. \n", line, col);
                System.exit(-1);
            }
            else{
                table.put(name, visitMain_stmt(ctx.main_stmt()));
            }
        }
        return super.visitMain_prog(ctx);
    }

    @Override
    public T visitMain_stmt(MiLenguajeParser.Main_stmtContext ctx) {
        System.out.println("mainSTMT");
        visitStmt(ctx.stmt());
        return super.visitMain_stmt(ctx);
    }

    @Override
    public T visitStmt(MiLenguajeParser.StmtContext ctx) {
        System.out.println("STMT");
        if(ctx.TK_PRINT() != null){
            //Object ans = visitLexpr(ctx.lexpr());
            System.out.println("puta "+ctx.lexpr().get(0).getRuleIndex());
        }
        return super.visitStmt(ctx);
    }

    @Override
    public T visitLexpr(MiLenguajeParser.LexprContext ctx) {
        System.out.println("LEXPR");
        Object ans = visitNexpr(ctx.nexpr());
        System.out.println(ans);
        return (T) ans;
    }

    @Override
    public T visitNexpr(MiLenguajeParser.NexprContext ctx) {
        System.out.println("nexpr");
        Object ans = visitRexpr(ctx.rexpr());
        System.out.println(ans);
        return (T) ans;
    }

    @Override
    public T visitRexpr(MiLenguajeParser.RexprContext ctx) {
        System.out.println("rexpr");
        Object ans = visitSimple_expr(ctx.simple_expr());
        System.out.println(ans);
        return (T) ans;
    }

    @Override
    public T visitSimple_expr(MiLenguajeParser.Simple_exprContext ctx) {
        System.out.println("simpleExp");
        Object ans = visitTerm(ctx.term());
        System.out.println(ans);
        return (T) ans;
    }

    @Override
    public T visitTerm(MiLenguajeParser.TermContext ctx) {
        System.out.println("term");
        Object ans = visitFactor(ctx.factor());
        System.out.println(ans);
        return (T) ans;
    }

    @Override
    public T visitFactor(MiLenguajeParser.FactorContext ctx) {
        System.out.println("factor");
        if(ctx.TK_NUM() != null){
            Object num = ctx.TK_NUM().getSymbol().getText();
            System.out.println(num);
            return (T) num;
        }
        return super.visitFactor(ctx);
    }
}
