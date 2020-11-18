// Generated from C:/Users/huber/OneDrive/Escritorio/Materias 2020-2/Lenguajes de programacion/practica3/grammar\MiLenguaje.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TK_AND=2, TK_OR=3, DATATYPE=4, WS=5, LINE_COMMENT=6, TK_BOOL=7, 
		TK_FUNCTION=8, FID=9, VAR=10, TK_PRINT=11, TK_INPUT=12, TK_WHEN=13, TK_IF=14, 
		TK_UNLESS=15, TK_END=16, TK_WHILE=17, TK_RETURN=18, TK_UNTIL=19, TK_LOOP=20, 
		TK_DO=21, TK_REPEAT=22, TK_FOR=23, TK_NEXT=24, TK_BREAK=25, TK_ELSE=26, 
		PIZQ=27, PDER=28, CORIZQ=29, CORDER=30, ROP=31, ASIGOP=32, SMCOLON=33, 
		MULOP=34, SUMOP=35, MODOP=36, COLON=37, INCR=38, DCR=39, TK_NOT=40, TK_NUM=41, 
		ID=42;
	public static final int
		RULE_prog = 0, RULE_prog_fn = 1, RULE_main_prog = 2, RULE_main_stmt = 3, 
		RULE_stmt = 4, RULE_do_sig = 5, RULE_signo = 6, RULE_fn_decl_list = 7, 
		RULE_fn_decl_list_withVAR = 8, RULE_var_decl = 9, RULE_cont_data = 10, 
		RULE_stmt_block = 11, RULE_stmt_mas = 12, RULE_lexpr = 13, RULE_lexpr2 = 14, 
		RULE_nexpr_prima_l2 = 15, RULE_nexpr_prima = 16, RULE_lexpr_and = 17, 
		RULE_nexpr_primab = 18, RULE_lexpr_or = 19, RULE_nexpr_primac = 20, RULE_nexpr = 21, 
		RULE_rexpr = 22, RULE_sig = 23, RULE_simple_expr = 24, RULE_t2 = 25, RULE_term = 26, 
		RULE_fa = 27, RULE_factor = 28, RULE_s = 29, RULE_f2 = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "prog_fn", "main_prog", "main_stmt", "stmt", "do_sig", "signo", 
			"fn_decl_list", "fn_decl_list_withVAR", "var_decl", "cont_data", "stmt_block", 
			"stmt_mas", "lexpr", "lexpr2", "nexpr_prima_l2", "nexpr_prima", "lexpr_and", 
			"nexpr_primab", "lexpr_or", "nexpr_primac", "nexpr", "rexpr", "sig", 
			"simple_expr", "t2", "term", "fa", "factor", "s", "f2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", null, null, null, null, null, null, "'function'", null, 
			"'var'", "'print'", "'input'", "'when'", "'if'", "'unless'", "'end'", 
			"'while'", "'return'", "'until'", "'loop'", "'do'", "'repeat'", "'for'", 
			"'next'", "'break'", "'else'", "'('", "')'", "'{'", "'}'", null, null, 
			"';'", null, null, "'%'", "','", "'++'", "'--'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TK_AND", "TK_OR", "DATATYPE", "WS", "LINE_COMMENT", "TK_BOOL", 
			"TK_FUNCTION", "FID", "VAR", "TK_PRINT", "TK_INPUT", "TK_WHEN", "TK_IF", 
			"TK_UNLESS", "TK_END", "TK_WHILE", "TK_RETURN", "TK_UNTIL", "TK_LOOP", 
			"TK_DO", "TK_REPEAT", "TK_FOR", "TK_NEXT", "TK_BREAK", "TK_ELSE", "PIZQ", 
			"PDER", "CORIZQ", "CORDER", "ROP", "ASIGOP", "SMCOLON", "MULOP", "SUMOP", 
			"MODOP", "COLON", "INCR", "DCR", "TK_NOT", "TK_NUM", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Prog_fnContext prog_fn() {
			return getRuleContext(Prog_fnContext.class,0);
		}
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			prog_fn();
			setState(63);
			main_prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prog_fnContext extends ParserRuleContext {
		public Fn_decl_listContext fn_decl_list() {
			return getRuleContext(Fn_decl_listContext.class,0);
		}
		public Prog_fnContext prog_fn() {
			return getRuleContext(Prog_fnContext.class,0);
		}
		public Prog_fnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_fn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProg_fn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prog_fnContext prog_fn() throws RecognitionException {
		Prog_fnContext _localctx = new Prog_fnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog_fn);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				fn_decl_list();
				setState(66);
				prog_fn();
				}
				break;
			case VAR:
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_END:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case INCR:
			case DCR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiLenguajeParser.VAR, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MiLenguajeParser.SMCOLON, 0); }
		public Main_stmtContext main_stmt() {
			return getRuleContext(Main_stmtContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(MiLenguajeParser.TK_END, 0); }
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMain_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_prog);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(VAR);
				setState(72);
				var_decl();
				setState(73);
				match(SMCOLON);
				setState(74);
				main_stmt();
				setState(75);
				match(TK_END);
				}
				break;
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_END:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case INCR:
			case DCR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				main_stmt();
				setState(78);
				match(TK_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_stmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Main_stmtContext main_stmt() {
			return getRuleContext(Main_stmtContext.class,0);
		}
		public Main_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMain_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_stmtContext main_stmt() throws RecognitionException {
		Main_stmtContext _localctx = new Main_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main_stmt);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case INCR:
			case DCR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				stmt();
				setState(83);
				main_stmt();
				}
				break;
			case TK_END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode TK_PRINT() { return getToken(MiLenguajeParser.TK_PRINT, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(MiLenguajeParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(MiLenguajeParser.SMCOLON, i);
		}
		public TerminalNode TK_INPUT() { return getToken(MiLenguajeParser.TK_INPUT, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_WHEN() { return getToken(MiLenguajeParser.TK_WHEN, 0); }
		public TerminalNode PIZQ() { return getToken(MiLenguajeParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiLenguajeParser.PDER, 0); }
		public TerminalNode TK_DO() { return getToken(MiLenguajeParser.TK_DO, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode TK_IF() { return getToken(MiLenguajeParser.TK_IF, 0); }
		public TerminalNode TK_ELSE() { return getToken(MiLenguajeParser.TK_ELSE, 0); }
		public TerminalNode TK_UNLESS() { return getToken(MiLenguajeParser.TK_UNLESS, 0); }
		public TerminalNode TK_WHILE() { return getToken(MiLenguajeParser.TK_WHILE, 0); }
		public TerminalNode TK_RETURN() { return getToken(MiLenguajeParser.TK_RETURN, 0); }
		public TerminalNode TK_UNTIL() { return getToken(MiLenguajeParser.TK_UNTIL, 0); }
		public TerminalNode TK_LOOP() { return getToken(MiLenguajeParser.TK_LOOP, 0); }
		public Do_sigContext do_sig() {
			return getRuleContext(Do_sigContext.class,0);
		}
		public TerminalNode TK_REPEAT() { return getToken(MiLenguajeParser.TK_REPEAT, 0); }
		public TerminalNode TK_NUM() { return getToken(MiLenguajeParser.TK_NUM, 0); }
		public TerminalNode TK_FOR() { return getToken(MiLenguajeParser.TK_FOR, 0); }
		public TerminalNode TK_NEXT() { return getToken(MiLenguajeParser.TK_NEXT, 0); }
		public TerminalNode TK_BREAK() { return getToken(MiLenguajeParser.TK_BREAK, 0); }
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public TerminalNode INCR() { return getToken(MiLenguajeParser.INCR, 0); }
		public TerminalNode DCR() { return getToken(MiLenguajeParser.DCR, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(TK_PRINT);
				setState(89);
				lexpr();
				setState(90);
				match(SMCOLON);
				}
				break;
			case TK_INPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(TK_INPUT);
				setState(93);
				match(ID);
				setState(94);
				match(SMCOLON);
				}
				break;
			case TK_WHEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(TK_WHEN);
				setState(96);
				match(PIZQ);
				setState(97);
				lexpr();
				setState(98);
				match(PDER);
				setState(99);
				match(TK_DO);
				setState(100);
				stmt_block();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(TK_IF);
				setState(103);
				match(PIZQ);
				setState(104);
				lexpr();
				setState(105);
				match(PDER);
				setState(106);
				match(TK_DO);
				setState(107);
				stmt_block();
				setState(108);
				match(TK_ELSE);
				setState(109);
				stmt_block();
				}
				break;
			case TK_UNLESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(TK_UNLESS);
				setState(112);
				match(PIZQ);
				setState(113);
				lexpr();
				setState(114);
				match(PDER);
				setState(115);
				match(TK_DO);
				setState(116);
				stmt_block();
				}
				break;
			case TK_WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				match(TK_WHILE);
				setState(119);
				match(PIZQ);
				setState(120);
				lexpr();
				setState(121);
				match(PDER);
				setState(122);
				match(TK_DO);
				setState(123);
				stmt_block();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(TK_RETURN);
				setState(126);
				lexpr();
				setState(127);
				match(SMCOLON);
				}
				break;
			case TK_UNTIL:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				match(TK_UNTIL);
				setState(130);
				match(PIZQ);
				setState(131);
				lexpr();
				setState(132);
				match(PDER);
				setState(133);
				match(TK_DO);
				setState(134);
				stmt_block();
				}
				break;
			case TK_LOOP:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				match(TK_LOOP);
				setState(137);
				stmt_block();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				match(TK_DO);
				setState(139);
				stmt_block();
				setState(140);
				do_sig();
				}
				break;
			case TK_REPEAT:
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				match(TK_REPEAT);
				setState(143);
				match(TK_NUM);
				setState(144);
				match(T__0);
				setState(145);
				stmt_block();
				}
				break;
			case TK_FOR:
				enterOuterAlt(_localctx, 12);
				{
				setState(146);
				match(TK_FOR);
				setState(147);
				match(PIZQ);
				setState(148);
				lexpr();
				setState(149);
				match(SMCOLON);
				setState(150);
				lexpr();
				setState(151);
				match(SMCOLON);
				setState(152);
				lexpr();
				setState(153);
				match(PDER);
				setState(154);
				match(TK_DO);
				setState(155);
				stmt_block();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 13);
				{
				setState(157);
				match(TK_NEXT);
				setState(158);
				match(SMCOLON);
				}
				break;
			case TK_BREAK:
				enterOuterAlt(_localctx, 14);
				{
				setState(159);
				match(TK_BREAK);
				setState(160);
				match(SMCOLON);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 15);
				{
				setState(161);
				match(ID);
				setState(162);
				signo();
				}
				break;
			case INCR:
				enterOuterAlt(_localctx, 16);
				{
				setState(163);
				match(INCR);
				setState(164);
				match(ID);
				setState(165);
				match(SMCOLON);
				}
				break;
			case DCR:
				enterOuterAlt(_localctx, 17);
				{
				setState(166);
				match(DCR);
				setState(167);
				match(ID);
				setState(168);
				match(SMCOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_sigContext extends ParserRuleContext {
		public TerminalNode TK_WHILE() { return getToken(MiLenguajeParser.TK_WHILE, 0); }
		public TerminalNode PIZQ() { return getToken(MiLenguajeParser.PIZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiLenguajeParser.PDER, 0); }
		public TerminalNode TK_UNTIL() { return getToken(MiLenguajeParser.TK_UNTIL, 0); }
		public Do_sigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDo_sig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_sigContext do_sig() throws RecognitionException {
		Do_sigContext _localctx = new Do_sigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_do_sig);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(TK_WHILE);
				setState(172);
				match(PIZQ);
				setState(173);
				lexpr();
				setState(174);
				match(PDER);
				}
				break;
			case TK_UNTIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(TK_UNTIL);
				setState(177);
				match(PIZQ);
				setState(178);
				lexpr();
				setState(179);
				match(PDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignoContext extends ParserRuleContext {
		public TerminalNode ASIGOP() { return getToken(MiLenguajeParser.ASIGOP, 0); }
		public Lexpr2Context lexpr2() {
			return getRuleContext(Lexpr2Context.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MiLenguajeParser.SMCOLON, 0); }
		public TerminalNode INCR() { return getToken(MiLenguajeParser.INCR, 0); }
		public TerminalNode DCR() { return getToken(MiLenguajeParser.DCR, 0); }
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSigno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signo);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(ASIGOP);
				setState(184);
				lexpr2();
				setState(185);
				match(SMCOLON);
				}
				break;
			case INCR:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(INCR);
				setState(188);
				match(SMCOLON);
				}
				break;
			case DCR:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(DCR);
				setState(190);
				match(SMCOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_decl_listContext extends ParserRuleContext {
		public TerminalNode TK_FUNCTION() { return getToken(MiLenguajeParser.TK_FUNCTION, 0); }
		public TerminalNode FID() { return getToken(MiLenguajeParser.FID, 0); }
		public TerminalNode DATATYPE() { return getToken(MiLenguajeParser.DATATYPE, 0); }
		public TerminalNode PIZQ() { return getToken(MiLenguajeParser.PIZQ, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiLenguajeParser.PDER, 0); }
		public Fn_decl_list_withVARContext fn_decl_list_withVAR() {
			return getRuleContext(Fn_decl_list_withVARContext.class,0);
		}
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFn_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fn_decl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(TK_FUNCTION);
			setState(194);
			match(FID);
			setState(195);
			match(T__0);
			setState(196);
			match(DATATYPE);
			setState(197);
			match(PIZQ);
			setState(198);
			var_decl();
			setState(199);
			match(PDER);
			setState(200);
			fn_decl_list_withVAR();
			setState(201);
			stmt_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_decl_list_withVARContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiLenguajeParser.VAR, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MiLenguajeParser.SMCOLON, 0); }
		public Fn_decl_list_withVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list_withVAR; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFn_decl_list_withVAR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_list_withVARContext fn_decl_list_withVAR() throws RecognitionException {
		Fn_decl_list_withVARContext _localctx = new Fn_decl_list_withVARContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fn_decl_list_withVAR);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(VAR);
				setState(204);
				var_decl();
				setState(205);
				match(SMCOLON);
				}
				break;
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case CORIZQ:
			case INCR:
			case DCR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode DATATYPE() { return getToken(MiLenguajeParser.DATATYPE, 0); }
		public Cont_dataContext cont_data() {
			return getRuleContext(Cont_dataContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(T__0);
			setState(212);
			match(DATATYPE);
			setState(213);
			cont_data();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cont_dataContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MiLenguajeParser.COLON, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode DATATYPE() { return getToken(MiLenguajeParser.DATATYPE, 0); }
		public Cont_dataContext cont_data() {
			return getRuleContext(Cont_dataContext.class,0);
		}
		public Cont_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCont_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_dataContext cont_data() throws RecognitionException {
		Cont_dataContext _localctx = new Cont_dataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cont_data);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(COLON);
				setState(216);
				match(ID);
				setState(217);
				match(T__0);
				setState(218);
				match(DATATYPE);
				setState(219);
				cont_data();
				}
				break;
			case PDER:
			case SMCOLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode CORIZQ() { return getToken(MiLenguajeParser.CORIZQ, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_masContext stmt_mas() {
			return getRuleContext(Stmt_masContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(MiLenguajeParser.CORDER, 0); }
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt_block);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(CORIZQ);
				setState(224);
				stmt();
				setState(225);
				stmt_mas();
				setState(226);
				match(CORDER);
				}
				break;
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case INCR:
			case DCR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_masContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_masContext stmt_mas() {
			return getRuleContext(Stmt_masContext.class,0);
		}
		public Stmt_masContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_mas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStmt_mas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_masContext stmt_mas() throws RecognitionException {
		Stmt_masContext _localctx = new Stmt_masContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt_mas);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_IF:
			case TK_UNLESS:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_DO:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case INCR:
			case DCR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				stmt();
				setState(232);
				stmt_mas();
				}
				break;
			case CORDER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexprContext extends ParserRuleContext {
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public Nexpr_primaContext nexpr_prima() {
			return getRuleContext(Nexpr_primaContext.class,0);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			nexpr();
			setState(238);
			nexpr_prima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lexpr2Context extends ParserRuleContext {
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public Nexpr_prima_l2Context nexpr_prima_l2() {
			return getRuleContext(Nexpr_prima_l2Context.class,0);
		}
		public Lexpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLexpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexpr2Context lexpr2() throws RecognitionException {
		Lexpr2Context _localctx = new Lexpr2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_lexpr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			nexpr();
			setState(241);
			nexpr_prima_l2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nexpr_prima_l2Context extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(MiLenguajeParser.TK_AND, 0); }
		public Lexpr_andContext lexpr_and() {
			return getRuleContext(Lexpr_andContext.class,0);
		}
		public TerminalNode TK_OR() { return getToken(MiLenguajeParser.TK_OR, 0); }
		public Lexpr_orContext lexpr_or() {
			return getRuleContext(Lexpr_orContext.class,0);
		}
		public Nexpr_prima_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr_prima_l2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNexpr_prima_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nexpr_prima_l2Context nexpr_prima_l2() throws RecognitionException {
		Nexpr_prima_l2Context _localctx = new Nexpr_prima_l2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_nexpr_prima_l2);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(TK_AND);
				setState(244);
				lexpr_and();
				}
				break;
			case TK_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(TK_OR);
				setState(246);
				lexpr_or();
				}
				break;
			case SMCOLON:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nexpr_primaContext extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(MiLenguajeParser.TK_AND, 0); }
		public Lexpr_andContext lexpr_and() {
			return getRuleContext(Lexpr_andContext.class,0);
		}
		public TerminalNode TK_OR() { return getToken(MiLenguajeParser.TK_OR, 0); }
		public Lexpr_orContext lexpr_or() {
			return getRuleContext(Lexpr_orContext.class,0);
		}
		public Nexpr_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr_prima; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNexpr_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nexpr_primaContext nexpr_prima() throws RecognitionException {
		Nexpr_primaContext _localctx = new Nexpr_primaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nexpr_prima);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(TK_AND);
				setState(251);
				lexpr_and();
				}
				break;
			case TK_OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(TK_OR);
				setState(253);
				lexpr_or();
				}
				break;
			case PDER:
			case SMCOLON:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lexpr_andContext extends ParserRuleContext {
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public Nexpr_primabContext nexpr_primab() {
			return getRuleContext(Nexpr_primabContext.class,0);
		}
		public Lexpr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLexpr_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexpr_andContext lexpr_and() throws RecognitionException {
		Lexpr_andContext _localctx = new Lexpr_andContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lexpr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			nexpr();
			setState(258);
			nexpr_primab();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nexpr_primabContext extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(MiLenguajeParser.TK_AND, 0); }
		public Lexpr_andContext lexpr_and() {
			return getRuleContext(Lexpr_andContext.class,0);
		}
		public Nexpr_primabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr_primab; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNexpr_primab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nexpr_primabContext nexpr_primab() throws RecognitionException {
		Nexpr_primabContext _localctx = new Nexpr_primabContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nexpr_primab);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(TK_AND);
				setState(261);
				lexpr_and();
				}
				break;
			case PDER:
			case SMCOLON:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lexpr_orContext extends ParserRuleContext {
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public Nexpr_primacContext nexpr_primac() {
			return getRuleContext(Nexpr_primacContext.class,0);
		}
		public Lexpr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLexpr_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexpr_orContext lexpr_or() throws RecognitionException {
		Lexpr_orContext _localctx = new Lexpr_orContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lexpr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			nexpr();
			setState(266);
			nexpr_primac();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nexpr_primacContext extends ParserRuleContext {
		public TerminalNode TK_OR() { return getToken(MiLenguajeParser.TK_OR, 0); }
		public Lexpr_orContext lexpr_or() {
			return getRuleContext(Lexpr_orContext.class,0);
		}
		public Nexpr_primacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr_primac; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNexpr_primac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nexpr_primacContext nexpr_primac() throws RecognitionException {
		Nexpr_primacContext _localctx = new Nexpr_primacContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nexpr_primac);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(TK_OR);
				setState(269);
				lexpr_or();
				}
				break;
			case PDER:
			case SMCOLON:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(MiLenguajeParser.TK_NOT, 0); }
		public TerminalNode PIZQ() { return getToken(MiLenguajeParser.PIZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiLenguajeParser.PDER, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nexpr);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(TK_NOT);
				setState(274);
				match(PIZQ);
				setState(275);
				lexpr();
				setState(276);
				match(PDER);
				}
				break;
			case TK_BOOL:
			case FID:
			case PIZQ:
			case INCR:
			case DCR:
			case TK_NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				rexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RexprContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SigContext sig() {
			return getRuleContext(SigContext.class,0);
		}
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			simple_expr();
			setState(282);
			sig();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SigContext extends ParserRuleContext {
		public TerminalNode ROP() { return getToken(MiLenguajeParser.ROP, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigContext sig() throws RecognitionException {
		SigContext _localctx = new SigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sig);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(ROP);
				setState(285);
				simple_expr();
				}
				break;
			case TK_AND:
			case TK_OR:
			case PDER:
			case SMCOLON:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simple_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			term();
			setState(290);
			t2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T2Context extends ParserRuleContext {
		public TerminalNode SUMOP() { return getToken(MiLenguajeParser.SUMOP, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitT2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_t2);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(SUMOP);
				setState(293);
				term();
				setState(294);
				t2();
				}
				break;
			case TK_AND:
			case TK_OR:
			case PDER:
			case ROP:
			case SMCOLON:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			factor();
			setState(300);
			fa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaContext extends ParserRuleContext {
		public TerminalNode MULOP() { return getToken(MiLenguajeParser.MULOP, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public TerminalNode MODOP() { return getToken(MiLenguajeParser.MODOP, 0); }
		public FaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaContext fa() throws RecognitionException {
		FaContext _localctx = new FaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fa);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(MULOP);
				setState(303);
				factor();
				setState(304);
				fa();
				}
				break;
			case MODOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(MODOP);
				setState(307);
				factor();
				setState(308);
				fa();
				}
				break;
			case TK_AND:
			case TK_OR:
			case PDER:
			case ROP:
			case SMCOLON:
			case SUMOP:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TK_NUM() { return getToken(MiLenguajeParser.TK_NUM, 0); }
		public TerminalNode TK_BOOL() { return getToken(MiLenguajeParser.TK_BOOL, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode INCR() { return getToken(MiLenguajeParser.INCR, 0); }
		public TerminalNode DCR() { return getToken(MiLenguajeParser.DCR, 0); }
		public TerminalNode PIZQ() { return getToken(MiLenguajeParser.PIZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiLenguajeParser.PDER, 0); }
		public TerminalNode FID() { return getToken(MiLenguajeParser.FID, 0); }
		public F2Context f2() {
			return getRuleContext(F2Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(TK_NUM);
				}
				break;
			case TK_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(TK_BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(ID);
				setState(316);
				s();
				}
				break;
			case INCR:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(INCR);
				setState(318);
				match(ID);
				}
				break;
			case DCR:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				match(DCR);
				setState(320);
				match(ID);
				}
				break;
			case PIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				match(PIZQ);
				setState(322);
				lexpr();
				setState(323);
				match(PDER);
				}
				break;
			case FID:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(FID);
				setState(326);
				match(PIZQ);
				setState(327);
				lexpr();
				setState(328);
				f2();
				setState(329);
				match(PDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(MiLenguajeParser.INCR, 0); }
		public TerminalNode DCR() { return getToken(MiLenguajeParser.DCR, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_s);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(INCR);
				}
				break;
			case DCR:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(DCR);
				}
				break;
			case TK_AND:
			case TK_OR:
			case PDER:
			case ROP:
			case SMCOLON:
			case MULOP:
			case SUMOP:
			case MODOP:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F2Context extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MiLenguajeParser.COLON, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public F2Context f2() {
			return getRuleContext(F2Context.class,0);
		}
		public F2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitF2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F2Context f2() throws RecognitionException {
		F2Context _localctx = new F2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_f2);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(COLON);
				setState(339);
				lexpr();
				setState(340);
				f2();
				}
				break;
			case PDER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4S\n\4\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00ac\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b8"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c2\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d3\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00e8\n\r\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00fb\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0102\n\22\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u010a\n"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u011a\n\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u0122\n"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u012c\n\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u013a\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u014e\n\36\3\37\3\37\3\37\5\37\u0153\n\37\3 \3 \3"+
		" \3 \3 \5 \u015a\n \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>\2\2\2\u016a\2@\3\2\2\2\4G\3\2\2\2\6R\3\2\2\2\b"+
		"X\3\2\2\2\n\u00ab\3\2\2\2\f\u00b7\3\2\2\2\16\u00c1\3\2\2\2\20\u00c3\3"+
		"\2\2\2\22\u00d2\3\2\2\2\24\u00d4\3\2\2\2\26\u00df\3\2\2\2\30\u00e7\3\2"+
		"\2\2\32\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u00f2\3\2\2\2 \u00fa\3\2\2\2"+
		"\"\u0101\3\2\2\2$\u0103\3\2\2\2&\u0109\3\2\2\2(\u010b\3\2\2\2*\u0111\3"+
		"\2\2\2,\u0119\3\2\2\2.\u011b\3\2\2\2\60\u0121\3\2\2\2\62\u0123\3\2\2\2"+
		"\64\u012b\3\2\2\2\66\u012d\3\2\2\28\u0139\3\2\2\2:\u014d\3\2\2\2<\u0152"+
		"\3\2\2\2>\u0159\3\2\2\2@A\5\4\3\2AB\5\6\4\2B\3\3\2\2\2CD\5\20\t\2DE\5"+
		"\4\3\2EH\3\2\2\2FH\3\2\2\2GC\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\7\f\2\2JK"+
		"\5\24\13\2KL\7#\2\2LM\5\b\5\2MN\7\22\2\2NS\3\2\2\2OP\5\b\5\2PQ\7\22\2"+
		"\2QS\3\2\2\2RI\3\2\2\2RO\3\2\2\2S\7\3\2\2\2TU\5\n\6\2UV\5\b\5\2VY\3\2"+
		"\2\2WY\3\2\2\2XT\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z[\7\r\2\2[\\\5\34\17\2\\"+
		"]\7#\2\2]\u00ac\3\2\2\2^_\7\16\2\2_`\7,\2\2`\u00ac\7#\2\2ab\7\17\2\2b"+
		"c\7\35\2\2cd\5\34\17\2de\7\36\2\2ef\7\27\2\2fg\5\30\r\2g\u00ac\3\2\2\2"+
		"hi\7\20\2\2ij\7\35\2\2jk\5\34\17\2kl\7\36\2\2lm\7\27\2\2mn\5\30\r\2no"+
		"\7\34\2\2op\5\30\r\2p\u00ac\3\2\2\2qr\7\21\2\2rs\7\35\2\2st\5\34\17\2"+
		"tu\7\36\2\2uv\7\27\2\2vw\5\30\r\2w\u00ac\3\2\2\2xy\7\23\2\2yz\7\35\2\2"+
		"z{\5\34\17\2{|\7\36\2\2|}\7\27\2\2}~\5\30\r\2~\u00ac\3\2\2\2\177\u0080"+
		"\7\24\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7#\2\2\u0082\u00ac\3\2\2\2"+
		"\u0083\u0084\7\25\2\2\u0084\u0085\7\35\2\2\u0085\u0086\5\34\17\2\u0086"+
		"\u0087\7\36\2\2\u0087\u0088\7\27\2\2\u0088\u0089\5\30\r\2\u0089\u00ac"+
		"\3\2\2\2\u008a\u008b\7\26\2\2\u008b\u00ac\5\30\r\2\u008c\u008d\7\27\2"+
		"\2\u008d\u008e\5\30\r\2\u008e\u008f\5\f\7\2\u008f\u00ac\3\2\2\2\u0090"+
		"\u0091\7\30\2\2\u0091\u0092\7+\2\2\u0092\u0093\7\3\2\2\u0093\u00ac\5\30"+
		"\r\2\u0094\u0095\7\31\2\2\u0095\u0096\7\35\2\2\u0096\u0097\5\34\17\2\u0097"+
		"\u0098\7#\2\2\u0098\u0099\5\34\17\2\u0099\u009a\7#\2\2\u009a\u009b\5\34"+
		"\17\2\u009b\u009c\7\36\2\2\u009c\u009d\7\27\2\2\u009d\u009e\5\30\r\2\u009e"+
		"\u00ac\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0\u00ac\7#\2\2\u00a1\u00a2\7\33"+
		"\2\2\u00a2\u00ac\7#\2\2\u00a3\u00a4\7,\2\2\u00a4\u00ac\5\16\b\2\u00a5"+
		"\u00a6\7(\2\2\u00a6\u00a7\7,\2\2\u00a7\u00ac\7#\2\2\u00a8\u00a9\7)\2\2"+
		"\u00a9\u00aa\7,\2\2\u00aa\u00ac\7#\2\2\u00abZ\3\2\2\2\u00ab^\3\2\2\2\u00ab"+
		"a\3\2\2\2\u00abh\3\2\2\2\u00abq\3\2\2\2\u00abx\3\2\2\2\u00ab\177\3\2\2"+
		"\2\u00ab\u0083\3\2\2\2\u00ab\u008a\3\2\2\2\u00ab\u008c\3\2\2\2\u00ab\u0090"+
		"\3\2\2\2\u00ab\u0094\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\13\3\2\2"+
		"\2\u00ad\u00ae\7\23\2\2\u00ae\u00af\7\35\2\2\u00af\u00b0\5\34\17\2\u00b0"+
		"\u00b1\7\36\2\2\u00b1\u00b8\3\2\2\2\u00b2\u00b3\7\25\2\2\u00b3\u00b4\7"+
		"\35\2\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\7\36\2\2\u00b6\u00b8\3\2\2\2"+
		"\u00b7\u00ad\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00ba\7"+
		"\"\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7#\2\2\u00bc\u00c2\3\2\2\2\u00bd"+
		"\u00be\7(\2\2\u00be\u00c2\7#\2\2\u00bf\u00c0\7)\2\2\u00c0\u00c2\7#\2\2"+
		"\u00c1\u00b9\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\17"+
		"\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\7\3\2\2"+
		"\u00c6\u00c7\7\6\2\2\u00c7\u00c8\7\35\2\2\u00c8\u00c9\5\24\13\2\u00c9"+
		"\u00ca\7\36\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\5\30\r\2\u00cc\21\3\2"+
		"\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7#\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\23\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d6\7\3\2\2\u00d6\u00d7"+
		"\7\6\2\2\u00d7\u00d8\5\26\f\2\u00d8\25\3\2\2\2\u00d9\u00da\7\'\2\2\u00da"+
		"\u00db\7,\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\7\6\2\2\u00dd\u00e0\5\26"+
		"\f\2\u00de\u00e0\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\5\32"+
		"\16\2\u00e4\u00e5\7 \2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e8\5\n\6\2\u00e7"+
		"\u00e1\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\31\3\2\2\2\u00e9\u00ea\5\n\6"+
		"\2\u00ea\u00eb\5\32\16\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f0\5,\27"+
		"\2\u00f0\u00f1\5\"\22\2\u00f1\35\3\2\2\2\u00f2\u00f3\5,\27\2\u00f3\u00f4"+
		"\5 \21\2\u00f4\37\3\2\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00fb\5$\23\2\u00f7"+
		"\u00f8\7\5\2\2\u00f8\u00fb\5(\25\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5\3\2"+
		"\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb!\3\2\2\2\u00fc\u00fd"+
		"\7\4\2\2\u00fd\u0102\5$\23\2\u00fe\u00ff\7\5\2\2\u00ff\u0102\5(\25\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0100\3\2"+
		"\2\2\u0102#\3\2\2\2\u0103\u0104\5,\27\2\u0104\u0105\5&\24\2\u0105%\3\2"+
		"\2\2\u0106\u0107\7\4\2\2\u0107\u010a\5$\23\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0106\3\2\2\2\u0109\u0108\3\2\2\2\u010a\'\3\2\2\2\u010b\u010c\5,\27\2"+
		"\u010c\u010d\5*\26\2\u010d)\3\2\2\2\u010e\u010f\7\5\2\2\u010f\u0112\5"+
		"(\25\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"+\3\2\2\2\u0113\u0114\7*\2\2\u0114\u0115\7\35\2\2\u0115\u0116\5\34\17"+
		"\2\u0116\u0117\7\36\2\2\u0117\u011a\3\2\2\2\u0118\u011a\5.\30\2\u0119"+
		"\u0113\3\2\2\2\u0119\u0118\3\2\2\2\u011a-\3\2\2\2\u011b\u011c\5\62\32"+
		"\2\u011c\u011d\5\60\31\2\u011d/\3\2\2\2\u011e\u011f\7!\2\2\u011f\u0122"+
		"\5\62\32\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\61\3\2\2\2\u0123\u0124\5\66\34\2\u0124\u0125\5\64\33\2\u0125\63"+
		"\3\2\2\2\u0126\u0127\7%\2\2\u0127\u0128\5\66\34\2\u0128\u0129\5\64\33"+
		"\2\u0129\u012c\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u012a"+
		"\3\2\2\2\u012c\65\3\2\2\2\u012d\u012e\5:\36\2\u012e\u012f\58\35\2\u012f"+
		"\67\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132\5:\36\2\u0132\u0133\58\35\2"+
		"\u0133\u013a\3\2\2\2\u0134\u0135\7&\2\2\u0135\u0136\5:\36\2\u0136\u0137"+
		"\58\35\2\u0137\u013a\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0130\3\2\2\2\u0139"+
		"\u0134\3\2\2\2\u0139\u0138\3\2\2\2\u013a9\3\2\2\2\u013b\u014e\7+\2\2\u013c"+
		"\u014e\7\t\2\2\u013d\u013e\7,\2\2\u013e\u014e\5<\37\2\u013f\u0140\7(\2"+
		"\2\u0140\u014e\7,\2\2\u0141\u0142\7)\2\2\u0142\u014e\7,\2\2\u0143\u0144"+
		"\7\35\2\2\u0144\u0145\5\34\17\2\u0145\u0146\7\36\2\2\u0146\u014e\3\2\2"+
		"\2\u0147\u0148\7\13\2\2\u0148\u0149\7\35\2\2\u0149\u014a\5\34\17\2\u014a"+
		"\u014b\5> \2\u014b\u014c\7\36\2\2\u014c\u014e\3\2\2\2\u014d\u013b\3\2"+
		"\2\2\u014d\u013c\3\2\2\2\u014d\u013d\3\2\2\2\u014d\u013f\3\2\2\2\u014d"+
		"\u0141\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0147\3\2\2\2\u014e;\3\2\2\2"+
		"\u014f\u0153\7(\2\2\u0150\u0153\7)\2\2\u0151\u0153\3\2\2\2\u0152\u014f"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153=\3\2\2\2\u0154"+
		"\u0155\7\'\2\2\u0155\u0156\5\34\17\2\u0156\u0157\5> \2\u0157\u015a\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"?\3\2\2\2\27GRX\u00ab\u00b7\u00c1\u00d2\u00df\u00e7\u00ed\u00fa\u0101"+
		"\u0109\u0111\u0119\u0121\u012b\u0139\u014d\u0152\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}