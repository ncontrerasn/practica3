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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DATATYPE=14, WS=15, LINE_COMMENT=16, 
		TK_BOOL=17, TK_FUNCTION=18, FID=19, VAR=20, TK_PRINT=21, TK_INPUT=22, 
		TK_WHEN=23, TK_IF=24, TK_UNLESS=25, TK_END=26, TK_WHILE=27, TK_RETURN=28, 
		TK_UNTIL=29, TK_LOOP=30, TK_DO=31, TK_REPEAT=32, TK_FOR=33, TK_NEXT=34, 
		TK_BREAK=35, TK_ELSE=36, PIZQ=37, PDER=38, ROP=39, ASIGOP=40, SMCOLON=41, 
		MULOP=42, SUMOP=43, MODOP=44, COLON=45, INCR=46, DCR=47, TK_NUM=48, DOUBLE=49, 
		ID=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "DATATYPE", "WS", "LINE_COMMENT", 
			"TK_BOOL", "TK_FUNCTION", "FID", "VAR", "TK_PRINT", "TK_INPUT", "TK_WHEN", 
			"TK_IF", "TK_UNLESS", "TK_END", "TK_WHILE", "TK_RETURN", "TK_UNTIL", 
			"TK_LOOP", "TK_DO", "TK_REPEAT", "TK_FOR", "TK_NEXT", "TK_BREAK", "TK_ELSE", 
			"PIZQ", "PDER", "ROP", "ASIGOP", "SMCOLON", "MULOP", "SUMOP", "MODOP", 
			"COLON", "INCR", "DCR", "TK_NUM", "DOUBLE", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", "'<'", "'=='", "'<='", "'>'", "'>='", "'!='", 
			"'+'", "'-'", "'*'", "'/'", null, null, null, null, "'function'", null, 
			"'var'", "'print'", "'input'", "'when'", "'if'", "'unless'", "'end'", 
			"'while'", "'return'", "'until'", "'loop'", "'do'", "'repeat'", "'for'", 
			"'next'", "'break'", "'else'", "'('", "')'", null, null, "';'", null, 
			null, "'%'", "','", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DATATYPE", "WS", "LINE_COMMENT", "TK_BOOL", "TK_FUNCTION", 
			"FID", "VAR", "TK_PRINT", "TK_INPUT", "TK_WHEN", "TK_IF", "TK_UNLESS", 
			"TK_END", "TK_WHILE", "TK_RETURN", "TK_UNTIL", "TK_LOOP", "TK_DO", "TK_REPEAT", 
			"TK_FOR", "TK_NEXT", "TK_BREAK", "TK_ELSE", "PIZQ", "PDER", "ROP", "ASIGOP", 
			"SMCOLON", "MULOP", "SUMOP", "MODOP", "COLON", "INCR", "DCR", "TK_NUM", 
			"DOUBLE", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0159\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u008d\n\17\3\20\6\20\u0090\n\20\r\20\16\20\u0091"+
		"\3\20\3\20\3\21\3\21\7\21\u0098\n\21\f\21\16\21\u009b\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a8\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\6\24\u00b5\n\24\r\24\16"+
		"\24\u00b6\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0120\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u012e\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\6\61\u0141\n\61\r\61\16\61\u0142\3\62\6\62\u0146\n\62\r\62\16\62"+
		"\u0147\3\62\3\62\3\62\6\62\u014d\n\62\r\62\16\62\u014e\5\62\u0151\n\62"+
		"\3\63\3\63\7\63\u0155\n\63\f\63\16\63\u0158\13\63\2\2\64\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\13\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\3\2BB\4\2C\\c|\4\2,,\61\61\4\2--//\3\2\62;\3\2\60\60\6\2"+
		"\62;C\\aac|\2\u016c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2"+
		"\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rr\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2"+
		"\23z\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2"+
		"\2\2\35\u008c\3\2\2\2\37\u008f\3\2\2\2!\u0095\3\2\2\2#\u00a7\3\2\2\2%"+
		"\u00a9\3\2\2\2\'\u00b2\3\2\2\2)\u00b8\3\2\2\2+\u00bc\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00c8\3\2\2\2\61\u00cd\3\2\2\2\63\u00d0\3\2\2\2\65\u00d7\3\2\2"+
		"\2\67\u00db\3\2\2\29\u00e1\3\2\2\2;\u00e8\3\2\2\2=\u00ee\3\2\2\2?\u00f3"+
		"\3\2\2\2A\u00f6\3\2\2\2C\u00fd\3\2\2\2E\u0101\3\2\2\2G\u0106\3\2\2\2I"+
		"\u010c\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u011f\3\2\2\2Q\u012d\3\2"+
		"\2\2S\u012f\3\2\2\2U\u0131\3\2\2\2W\u0133\3\2\2\2Y\u0135\3\2\2\2[\u0137"+
		"\3\2\2\2]\u0139\3\2\2\2_\u013c\3\2\2\2a\u0140\3\2\2\2c\u0145\3\2\2\2e"+
		"\u0152\3\2\2\2gh\7<\2\2h\4\3\2\2\2ij\7}\2\2j\6\3\2\2\2kl\7\177\2\2l\b"+
		"\3\2\2\2mn\7>\2\2n\n\3\2\2\2op\7?\2\2pq\7?\2\2q\f\3\2\2\2rs\7>\2\2st\7"+
		"?\2\2t\16\3\2\2\2uv\7@\2\2v\20\3\2\2\2wx\7@\2\2xy\7?\2\2y\22\3\2\2\2z"+
		"{\7#\2\2{|\7?\2\2|\24\3\2\2\2}~\7-\2\2~\26\3\2\2\2\177\u0080\7/\2\2\u0080"+
		"\30\3\2\2\2\u0081\u0082\7,\2\2\u0082\32\3\2\2\2\u0083\u0084\7\61\2\2\u0084"+
		"\34\3\2\2\2\u0085\u0086\7p\2\2\u0086\u0087\7w\2\2\u0087\u008d\7o\2\2\u0088"+
		"\u0089\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b\7q\2\2\u008b\u008d\7n\2\2"+
		"\u008c\u0085\3\2\2\2\u008c\u0088\3\2\2\2\u008d\36\3\2\2\2\u008e\u0090"+
		"\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\20\2\2\u0094 \3\2\2\2"+
		"\u0095\u0099\7%\2\2\u0096\u0098\n\3\2\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\b\21\2\2\u009d\"\3\2\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a8\7g\2\2\u00a2\u00a3"+
		"\7h\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a8\7g\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8$\3\2\2\2\u00a9"+
		"\u00aa\7h\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7e\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1&\3\2\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"(\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"*\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7v\2\2"+
		"\u00c7.\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7g\2"+
		"\2\u00cb\u00cc\7p\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7u\2\2\u00d6"+
		"\64\3\2\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da"+
		"\66\3\2\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e08\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2"+
		"\u00e6\u00e7\7p\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7p\2"+
		"\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7n\2\2\u00ed<\3\2"+
		"\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2"+
		"\7r\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\7q\2\2\u00f5@\3"+
		"\2\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7r\2\2\u00f9"+
		"\u00fa\7g\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fcB\3\2\2\2\u00fd"+
		"\u00fe\7h\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100D\3\2\2\2\u0101"+
		"\u0102\7p\2\2\u0102\u0103\7g\2\2\u0103\u0104\7z\2\2\u0104\u0105\7v\2\2"+
		"\u0105F\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108\7t\2\2\u0108\u0109\7g\2"+
		"\2\u0109\u010a\7c\2\2\u010a\u010b\7m\2\2\u010bH\3\2\2\2\u010c\u010d\7"+
		"g\2\2\u010d\u010e\7n\2\2\u010e\u010f\7u\2\2\u010f\u0110\7g\2\2\u0110J"+
		"\3\2\2\2\u0111\u0112\7*\2\2\u0112L\3\2\2\2\u0113\u0114\7+\2\2\u0114N\3"+
		"\2\2\2\u0115\u0120\7>\2\2\u0116\u0117\7>\2\2\u0117\u0120\7?\2\2\u0118"+
		"\u0119\7@\2\2\u0119\u0120\7?\2\2\u011a\u0120\7@\2\2\u011b\u011c\7?\2\2"+
		"\u011c\u0120\7?\2\2\u011d\u011e\7#\2\2\u011e\u0120\7?\2\2\u011f\u0115"+
		"\3\2\2\2\u011f\u0116\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u011a\3\2\2\2\u011f"+
		"\u011b\3\2\2\2\u011f\u011d\3\2\2\2\u0120P\3\2\2\2\u0121\u0122\7<\2\2\u0122"+
		"\u012e\7?\2\2\u0123\u0124\7-\2\2\u0124\u012e\7?\2\2\u0125\u0126\7/\2\2"+
		"\u0126\u012e\7?\2\2\u0127\u0128\7,\2\2\u0128\u012e\7?\2\2\u0129\u012a"+
		"\7\61\2\2\u012a\u012e\7?\2\2\u012b\u012c\7\'\2\2\u012c\u012e\7?\2\2\u012d"+
		"\u0121\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0127\3\2"+
		"\2\2\u012d\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012eR\3\2\2\2\u012f\u0130"+
		"\7=\2\2\u0130T\3\2\2\2\u0131\u0132\t\6\2\2\u0132V\3\2\2\2\u0133\u0134"+
		"\t\7\2\2\u0134X\3\2\2\2\u0135\u0136\7\'\2\2\u0136Z\3\2\2\2\u0137\u0138"+
		"\7.\2\2\u0138\\\3\2\2\2\u0139\u013a\7-\2\2\u013a\u013b\7-\2\2\u013b^\3"+
		"\2\2\2\u013c\u013d\7/\2\2\u013d\u013e\7/\2\2\u013e`\3\2\2\2\u013f\u0141"+
		"\t\b\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143b\3\2\2\2\u0144\u0146\t\b\2\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0150"+
		"\3\2\2\2\u0149\u0151\3\2\2\2\u014a\u014c\t\t\2\2\u014b\u014d\t\b\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u0149\3\2\2\2\u0150\u014a\3\2\2\2\u0151"+
		"d\3\2\2\2\u0152\u0156\t\5\2\2\u0153\u0155\t\n\2\2\u0154\u0153\3\2\2\2"+
		"\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157f\3"+
		"\2\2\2\u0158\u0156\3\2\2\2\17\2\u008c\u0091\u0099\u00a7\u00b6\u011f\u012d"+
		"\u0142\u0147\u014e\u0150\u0156\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}