// Generated from C:/Users/huber/OneDrive/Escritorio/Materias 2020-2/Lenguajes de programacion/practica3/grammar\MiLenguaje.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MiLenguajeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#prog_fn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_fn(MiLenguajeParser.Prog_fnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#main_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_prog(MiLenguajeParser.Main_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#main_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_stmt(MiLenguajeParser.Main_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MiLenguajeParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#do_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_sig(MiLenguajeParser.Do_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#signo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno(MiLenguajeParser.SignoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#fn_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list(MiLenguajeParser.Fn_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#fn_decl_list_withVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list_withVAR(MiLenguajeParser.Fn_decl_list_withVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(MiLenguajeParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#cont_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont_data(MiLenguajeParser.Cont_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(MiLenguajeParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stmt_mas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_mas(MiLenguajeParser.Stmt_masContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(MiLenguajeParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#lexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr2(MiLenguajeParser.Lexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#nexpr_prima_l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr_prima_l2(MiLenguajeParser.Nexpr_prima_l2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#nexpr_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr_prima(MiLenguajeParser.Nexpr_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#lexpr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr_and(MiLenguajeParser.Lexpr_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#nexpr_primab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr_primab(MiLenguajeParser.Nexpr_primabContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#lexpr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr_or(MiLenguajeParser.Lexpr_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#nexpr_primac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr_primac(MiLenguajeParser.Nexpr_primacContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(MiLenguajeParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpr(MiLenguajeParser.RexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSig(MiLenguajeParser.SigContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(MiLenguajeParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#t2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT2(MiLenguajeParser.T2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiLenguajeParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#fa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFa(MiLenguajeParser.FaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiLenguajeParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(MiLenguajeParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#f2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF2(MiLenguajeParser.F2Context ctx);
}