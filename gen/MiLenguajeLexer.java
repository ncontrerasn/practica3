// Generated from C:/Users/huber/OneDrive/Escritorio/Materias 2020-2/Lenguajes de programacion/practica3/grammar\MiLenguaje.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeLexer extends Lexer {
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
		DOUBLE=42, ID=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TK_AND", "TK_OR", "DATATYPE", "WS", "LINE_COMMENT", "TK_BOOL", 
			"TK_FUNCTION", "FID", "VAR", "TK_PRINT", "TK_INPUT", "TK_WHEN", "TK_IF", 
			"TK_UNLESS", "TK_END", "TK_WHILE", "TK_RETURN", "TK_UNTIL", "TK_LOOP", 
			"TK_DO", "TK_REPEAT", "TK_FOR", "TK_NEXT", "TK_BREAK", "TK_ELSE", "PIZQ", 
			"PDER", "CORIZQ", "CORDER", "ROP", "ASIGOP", "SMCOLON", "MULOP", "SUMOP", 
			"MODOP", "COLON", "INCR", "DCR", "TK_NOT", "TK_NUM", "DOUBLE", "ID"
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
			"MODOP", "COLON", "INCR", "DCR", "TK_NOT", "TK_NUM", "DOUBLE", "ID"
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5j\n\5\3\6\6\6m\n\6\r\6\16\6n\3\6\3\6\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\6\n\u0092\n\n\r\n\16\n\u0093\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u0101\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u010f\n!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\6*\u0126"+
		"\n*\r*\16*\u0127\3+\6+\u012b\n+\r+\16+\u012c\3+\3+\3+\6+\u0132\n+\r+\16"+
		"+\u0133\5+\u0136\n+\3,\3,\7,\u013a\n,\f,\16,\u013d\13,\2\2-\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-\3\2\13\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2BB\4"+
		"\2C\\c|\4\2,,\61\61\4\2--//\3\2\62;\3\2\60\60\6\2\62;C\\aac|\2\u0151\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7_\3\2\2\2\ti\3\2\2\2\13l\3"+
		"\2\2\2\rr\3\2\2\2\17\u0084\3\2\2\2\21\u0086\3\2\2\2\23\u008f\3\2\2\2\25"+
		"\u0095\3\2\2\2\27\u0099\3\2\2\2\31\u009f\3\2\2\2\33\u00a5\3\2\2\2\35\u00aa"+
		"\3\2\2\2\37\u00ad\3\2\2\2!\u00b4\3\2\2\2#\u00b8\3\2\2\2%\u00be\3\2\2\2"+
		"\'\u00c5\3\2\2\2)\u00cb\3\2\2\2+\u00d0\3\2\2\2-\u00d3\3\2\2\2/\u00da\3"+
		"\2\2\2\61\u00de\3\2\2\2\63\u00e3\3\2\2\2\65\u00e9\3\2\2\2\67\u00ee\3\2"+
		"\2\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u0100\3\2\2\2A\u010e"+
		"\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I\u0116\3\2\2\2K"+
		"\u0118\3\2\2\2M\u011a\3\2\2\2O\u011d\3\2\2\2Q\u0120\3\2\2\2S\u0125\3\2"+
		"\2\2U\u012a\3\2\2\2W\u0137\3\2\2\2YZ\7<\2\2Z\4\3\2\2\2[\\\7c\2\2\\]\7"+
		"p\2\2]^\7f\2\2^\6\3\2\2\2_`\7q\2\2`a\7t\2\2a\b\3\2\2\2bc\7p\2\2cd\7w\2"+
		"\2dj\7o\2\2ef\7d\2\2fg\7q\2\2gh\7q\2\2hj\7n\2\2ib\3\2\2\2ie\3\2\2\2j\n"+
		"\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2p"+
		"q\b\6\2\2q\f\3\2\2\2rv\7%\2\2su\n\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\b\7\2\2z\16\3\2\2\2{|\7v\2\2|}\7t\2\2"+
		"}~\7w\2\2~\u0085\7g\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7n\2\2\u0082\u0083\7u\2\2\u0083\u0085\7g\2\2\u0084{\3\2\2\2\u0084\177"+
		"\3\2\2\2\u0085\20\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2"+
		"\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e\22\3\2\2\2\u008f\u0091\t"+
		"\4\2\2\u0090\u0092\t\5\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\24\3\2\2\2\u0095\u0096\7x\2\2"+
		"\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\26\3\2\2\2\u0099\u009a\7"+
		"r\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7v\2\2\u009e\30\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2"+
		"\7r\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7v\2\2\u00a4\32\3\2\2\2\u00a5\u00a6"+
		"\7y\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7w\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7u\2\2\u00b2\u00b3\7u\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7g\2"+
		"\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7"+
		"y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd$\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"&\3\2\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7r\2\2\u00cf*\3\2\2\2\u00d0"+
		"\u00d1\7f\2\2\u00d1\u00d2\7q\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7c\2\2"+
		"\u00d8\u00d9\7v\2\2\u00d9.\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7q\2"+
		"\2\u00dc\u00dd\7t\2\2\u00dd\60\3\2\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7z\2\2\u00e1\u00e2\7v\2\2\u00e2\62\3\2\2\2\u00e3\u00e4"+
		"\7d\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7m\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef"+
		"8\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7}\2\2\u00f3<"+
		"\3\2\2\2\u00f4\u00f5\7\177\2\2\u00f5>\3\2\2\2\u00f6\u0101\7>\2\2\u00f7"+
		"\u00f8\7>\2\2\u00f8\u0101\7?\2\2\u00f9\u00fa\7@\2\2\u00fa\u0101\7?\2\2"+
		"\u00fb\u0101\7@\2\2\u00fc\u00fd\7?\2\2\u00fd\u0101\7?\2\2\u00fe\u00ff"+
		"\7#\2\2\u00ff\u0101\7?\2\2\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101@\3\2\2\2\u0102\u0103\7<\2\2\u0103\u010f\7?\2\2\u0104\u0105"+
		"\7-\2\2\u0105\u010f\7?\2\2\u0106\u0107\7/\2\2\u0107\u010f\7?\2\2\u0108"+
		"\u0109\7,\2\2\u0109\u010f\7?\2\2\u010a\u010b\7\61\2\2\u010b\u010f\7?\2"+
		"\2\u010c\u010d\7\'\2\2\u010d\u010f\7?\2\2\u010e\u0102\3\2\2\2\u010e\u0104"+
		"\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u010a\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010fB\3\2\2\2\u0110\u0111\7=\2\2\u0111D\3\2\2\2\u0112"+
		"\u0113\t\6\2\2\u0113F\3\2\2\2\u0114\u0115\t\7\2\2\u0115H\3\2\2\2\u0116"+
		"\u0117\7\'\2\2\u0117J\3\2\2\2\u0118\u0119\7.\2\2\u0119L\3\2\2\2\u011a"+
		"\u011b\7-\2\2\u011b\u011c\7-\2\2\u011cN\3\2\2\2\u011d\u011e\7/\2\2\u011e"+
		"\u011f\7/\2\2\u011fP\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122\7q\2\2\u0122"+
		"\u0123\7v\2\2\u0123R\3\2\2\2\u0124\u0126\t\b\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128T\3\2\2\2"+
		"\u0129\u012b\t\b\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0135\3\2\2\2\u012e\u0136\3\2\2\2\u012f"+
		"\u0131\t\t\2\2\u0130\u0132\t\b\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u012e\3\2\2\2\u0135\u012f\3\2\2\2\u0136V\3\2\2\2\u0137\u013b\t\5\2\2"+
		"\u0138\u013a\t\n\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013cX\3\2\2\2\u013d\u013b\3\2\2\2\17\2i"+
		"nv\u0084\u0093\u0100\u010e\u0127\u012c\u0133\u0135\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}