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
		T__9=10, T__10=11, T__11=12, T__12=13, TK_AND=14, TK_OR=15, DATATYPE=16, 
		WS=17, LINE_COMMENT=18, TK_BOOL=19, TK_FUNCTION=20, FID=21, VAR=22, TK_PRINT=23, 
		TK_INPUT=24, TK_WHEN=25, TK_IF=26, TK_UNLESS=27, TK_END=28, TK_WHILE=29, 
		TK_RETURN=30, TK_UNTIL=31, TK_LOOP=32, TK_DO=33, TK_REPEAT=34, TK_FOR=35, 
		TK_NEXT=36, TK_BREAK=37, TK_ELSE=38, PIZQ=39, PDER=40, ROP=41, ASIGOP=42, 
		SMCOLON=43, MULOP=44, SUMOP=45, MODOP=46, COLON=47, INCR=48, DCR=49, TK_NUM=50, 
		DOUBLE=51, ID=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "TK_AND", "TK_OR", "DATATYPE", "WS", 
			"LINE_COMMENT", "TK_BOOL", "TK_FUNCTION", "FID", "VAR", "TK_PRINT", "TK_INPUT", 
			"TK_WHEN", "TK_IF", "TK_UNLESS", "TK_END", "TK_WHILE", "TK_RETURN", "TK_UNTIL", 
			"TK_LOOP", "TK_DO", "TK_REPEAT", "TK_FOR", "TK_NEXT", "TK_BREAK", "TK_ELSE", 
			"PIZQ", "PDER", "ROP", "ASIGOP", "SMCOLON", "MULOP", "SUMOP", "MODOP", 
			"COLON", "INCR", "DCR", "TK_NUM", "DOUBLE", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", "'<'", "'=='", "'<='", "'>'", "'>='", "'!='", 
			"'+'", "'-'", "'*'", "'/'", null, null, null, null, null, null, "'function'", 
			null, "'var'", "'print'", "'input'", "'when'", "'if'", "'unless'", "'end'", 
			"'while'", "'return'", "'until'", "'loop'", "'do'", "'repeat'", "'for'", 
			"'next'", "'break'", "'else'", "'('", "')'", null, null, "';'", null, 
			null, "'%'", "','", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TK_AND", "TK_OR", "DATATYPE", "WS", "LINE_COMMENT", "TK_BOOL", 
			"TK_FUNCTION", "FID", "VAR", "TK_PRINT", "TK_INPUT", "TK_WHEN", "TK_IF", 
			"TK_UNLESS", "TK_END", "TK_WHILE", "TK_RETURN", "TK_UNTIL", "TK_LOOP", 
			"TK_DO", "TK_REPEAT", "TK_FOR", "TK_NEXT", "TK_BREAK", "TK_ELSE", "PIZQ", 
			"PDER", "ROP", "ASIGOP", "SMCOLON", "MULOP", "SUMOP", "MODOP", "COLON", 
			"INCR", "DCR", "TK_NUM", "DOUBLE", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0098\n\21\3\22\6\22\u009b\n\22\r\22\16\22\u009c\3\22\3\22\3\23"+
		"\3\23\7\23\u00a3\n\23\f\23\16\23\u00a6\13\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b3\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\6\26\u00c0\n\26\r\26\16\26\u00c1\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u012b\n*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0139\n+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\6\63\u014c\n\63\r\63\16"+
		"\63\u014d\3\64\6\64\u0151\n\64\r\64\16\64\u0152\3\64\3\64\3\64\6\64\u0158"+
		"\n\64\r\64\16\64\u0159\5\64\u015c\n\64\3\65\3\65\7\65\u0160\n\65\f\65"+
		"\16\65\u0163\13\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66\3\2\13\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2BB\4\2"+
		"C\\c|\4\2,,\61\61\4\2--//\3\2\62;\3\2\60\60\6\2\62;C\\aac|\2\u0177\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7"+
		"o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\rv\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23"+
		"~\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087"+
		"\3\2\2\2\35\u0089\3\2\2\2\37\u008d\3\2\2\2!\u0097\3\2\2\2#\u009a\3\2\2"+
		"\2%\u00a0\3\2\2\2\'\u00b2\3\2\2\2)\u00b4\3\2\2\2+\u00bd\3\2\2\2-\u00c3"+
		"\3\2\2\2/\u00c7\3\2\2\2\61\u00cd\3\2\2\2\63\u00d3\3\2\2\2\65\u00d8\3\2"+
		"\2\2\67\u00db\3\2\2\29\u00e2\3\2\2\2;\u00e6\3\2\2\2=\u00ec\3\2\2\2?\u00f3"+
		"\3\2\2\2A\u00f9\3\2\2\2C\u00fe\3\2\2\2E\u0101\3\2\2\2G\u0108\3\2\2\2I"+
		"\u010c\3\2\2\2K\u0111\3\2\2\2M\u0117\3\2\2\2O\u011c\3\2\2\2Q\u011e\3\2"+
		"\2\2S\u012a\3\2\2\2U\u0138\3\2\2\2W\u013a\3\2\2\2Y\u013c\3\2\2\2[\u013e"+
		"\3\2\2\2]\u0140\3\2\2\2_\u0142\3\2\2\2a\u0144\3\2\2\2c\u0147\3\2\2\2e"+
		"\u014b\3\2\2\2g\u0150\3\2\2\2i\u015d\3\2\2\2kl\7<\2\2l\4\3\2\2\2mn\7}"+
		"\2\2n\6\3\2\2\2op\7\177\2\2p\b\3\2\2\2qr\7>\2\2r\n\3\2\2\2st\7?\2\2tu"+
		"\7?\2\2u\f\3\2\2\2vw\7>\2\2wx\7?\2\2x\16\3\2\2\2yz\7@\2\2z\20\3\2\2\2"+
		"{|\7@\2\2|}\7?\2\2}\22\3\2\2\2~\177\7#\2\2\177\u0080\7?\2\2\u0080\24\3"+
		"\2\2\2\u0081\u0082\7-\2\2\u0082\26\3\2\2\2\u0083\u0084\7/\2\2\u0084\30"+
		"\3\2\2\2\u0085\u0086\7,\2\2\u0086\32\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\34\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c"+
		"\36\3\2\2\2\u008d\u008e\7q\2\2\u008e\u008f\7t\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7w\2\2\u0092\u0098\7o\2\2\u0093\u0094\7d\2\2"+
		"\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0098\7n\2\2\u0097\u0090"+
		"\3\2\2\2\u0097\u0093\3\2\2\2\u0098\"\3\2\2\2\u0099\u009b\t\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\22\2\2\u009f$\3\2\2\2\u00a0\u00a4"+
		"\7%\2\2\u00a1\u00a3\n\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\b\23\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7w\2\2\u00ac\u00b3\7g\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b3\7g\2\2"+
		"\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7"+
		"h\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"*\3\2\2\2\u00bd\u00bf\t\4\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2,\3"+
		"\2\2\2\u00c3\u00c4\7x\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		".\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\62\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7"+
		"g\2\2\u00d6\u00d7\7p\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da"+
		"\7h\2\2\u00da\66\3\2\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"8\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7f\2\2\u00e5"+
		":\3\2\2\2\u00e6\u00e7\7y\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7k\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7t\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7t\2\2"+
		"\u00f1\u00f2\7p\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5\7p\2"+
		"\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7n\2\2\u00f8@\3\2"+
		"\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd"+
		"\7r\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7q\2\2\u0100D\3"+
		"\2\2\2\u0101\u0102\7t\2\2\u0102\u0103\7g\2\2\u0103\u0104\7r\2\2\u0104"+
		"\u0105\7g\2\2\u0105\u0106\7c\2\2\u0106\u0107\7v\2\2\u0107F\3\2\2\2\u0108"+
		"\u0109\7h\2\2\u0109\u010a\7q\2\2\u010a\u010b\7t\2\2\u010bH\3\2\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7g\2\2\u010e\u010f\7z\2\2\u010f\u0110\7v\2\2"+
		"\u0110J\3\2\2\2\u0111\u0112\7d\2\2\u0112\u0113\7t\2\2\u0113\u0114\7g\2"+
		"\2\u0114\u0115\7c\2\2\u0115\u0116\7m\2\2\u0116L\3\2\2\2\u0117\u0118\7"+
		"g\2\2\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011bN"+
		"\3\2\2\2\u011c\u011d\7*\2\2\u011dP\3\2\2\2\u011e\u011f\7+\2\2\u011fR\3"+
		"\2\2\2\u0120\u012b\7>\2\2\u0121\u0122\7>\2\2\u0122\u012b\7?\2\2\u0123"+
		"\u0124\7@\2\2\u0124\u012b\7?\2\2\u0125\u012b\7@\2\2\u0126\u0127\7?\2\2"+
		"\u0127\u012b\7?\2\2\u0128\u0129\7#\2\2\u0129\u012b\7?\2\2\u012a\u0120"+
		"\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0125\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012bT\3\2\2\2\u012c\u012d\7<\2\2\u012d"+
		"\u0139\7?\2\2\u012e\u012f\7-\2\2\u012f\u0139\7?\2\2\u0130\u0131\7/\2\2"+
		"\u0131\u0139\7?\2\2\u0132\u0133\7,\2\2\u0133\u0139\7?\2\2\u0134\u0135"+
		"\7\61\2\2\u0135\u0139\7?\2\2\u0136\u0137\7\'\2\2\u0137\u0139\7?\2\2\u0138"+
		"\u012c\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0132\3\2"+
		"\2\2\u0138\u0134\3\2\2\2\u0138\u0136\3\2\2\2\u0139V\3\2\2\2\u013a\u013b"+
		"\7=\2\2\u013bX\3\2\2\2\u013c\u013d\t\6\2\2\u013dZ\3\2\2\2\u013e\u013f"+
		"\t\7\2\2\u013f\\\3\2\2\2\u0140\u0141\7\'\2\2\u0141^\3\2\2\2\u0142\u0143"+
		"\7.\2\2\u0143`\3\2\2\2\u0144\u0145\7-\2\2\u0145\u0146\7-\2\2\u0146b\3"+
		"\2\2\2\u0147\u0148\7/\2\2\u0148\u0149\7/\2\2\u0149d\3\2\2\2\u014a\u014c"+
		"\t\b\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014ef\3\2\2\2\u014f\u0151\t\b\2\2\u0150\u014f\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u015b"+
		"\3\2\2\2\u0154\u015c\3\2\2\2\u0155\u0157\t\t\2\2\u0156\u0158\t\b\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0154\3\2\2\2\u015b\u0155\3\2\2\2\u015c"+
		"h\3\2\2\2\u015d\u0161\t\5\2\2\u015e\u0160\t\n\2\2\u015f\u015e\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162j\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\17\2\u0097\u009c\u00a4\u00b2\u00c1\u012a\u0138"+
		"\u014d\u0152\u0159\u015b\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}