package resources; 
// Generated from src\main\resources\CX.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WHITESPACE=2, NEWLINE=3, WRITE=4, WRITELN=5, INT=6, BOOLEAN=7, 
		LEFTBRACE=8, RIGHTBRACE=9, VOID=10, RETURN=11, SEMICOLON=12, IF=13, DO=14, 
		LEFTPARENTHESIS=15, RIGHTPARENTHESIS=16, ELSE=17, WHILE=18, FOR=19, TRUE=20, 
		FALSE=21, ASSIGN=22, PLUS=23, MINUS=24, MUL=25, DIV=26, EQUAL=27, NOTEQUAL=28, 
		LESSTHAN=29, GREATERTHAN=30, LESSTHANOREQUAL=31, GREATERTHANOREQUAL=32, 
		NOT=33, LOGICALAND=34, LOGICALOR=35, IOR=36, XOR=37, BEGININLINECOMMENT=38, 
		BEGINCOMMENT=39, ENDCOMMENT=40, COMMA=41, LEFTSHIFT=42, RIGHTSHIFT=43, 
		AND=44, QUESTIONMARK=45, INTEGERNUMBER=46, REALNUMBER=47, COLON=48, MOD=49, 
		ODD=50, MINUSMINUS=51, PLUSPLUS=52, REPEAT=53, UNTIL=54, REAL=55, READ=56, 
		EXIT=57, CONST=58, IDENTIFIER=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "WHITESPACE", "NEWLINE", "WRITE", "WRITELN", "INT", "BOOLEAN", 
			"LEFTBRACE", "RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", "IF", "DO", 
			"LEFTPARENTHESIS", "RIGHTPARENTHESIS", "ELSE", "WHILE", "FOR", "TRUE", 
			"FALSE", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOTEQUAL", 
			"LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", 
			"LOGICALAND", "LOGICALOR", "IOR", "XOR", "BEGININLINECOMMENT", "BEGINCOMMENT", 
			"ENDCOMMENT", "COMMA", "LEFTSHIFT", "RIGHTSHIFT", "AND", "QUESTIONMARK", 
			"INTEGERNUMBER", "REALNUMBER", "COLON", "MOD", "ODD", "MINUSMINUS", "PLUSPLUS", 
			"REPEAT", "UNTIL", "REAL", "READ", "EXIT", "CONST", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'write'", "'writeln'", "'int'", "'bool'", "'{'", 
			"'}'", "'void'", "'return'", "';'", "'if'", "'do'", "'('", "')'", "'else'", 
			"'while'", "'for'", "'true'", "'false'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'!'", "'&&'", "'||'", 
			"'|'", "'^'", "'//'", "'/*'", "'*/'", "','", "'<<'", "'>>'", "'&'", "'?'", 
			null, null, "':'", "'%'", "'odd'", "'--'", "'++'", "'repeat'", "'until'", 
			"'real'", "'read'", "'exit'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WHITESPACE", "NEWLINE", "WRITE", "WRITELN", "INT", 
			"BOOLEAN", "LEFTBRACE", "RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", 
			"IF", "DO", "LEFTPARENTHESIS", "RIGHTPARENTHESIS", "ELSE", "WHILE", "FOR", 
			"TRUE", "FALSE", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOTEQUAL", 
			"LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", 
			"LOGICALAND", "LOGICALOR", "IOR", "XOR", "BEGININLINECOMMENT", "BEGINCOMMENT", 
			"ENDCOMMENT", "COMMA", "LEFTSHIFT", "RIGHTSHIFT", "AND", "QUESTIONMARK", 
			"INTEGERNUMBER", "REALNUMBER", "COLON", "MOD", "ODD", "MINUSMINUS", "PLUSPLUS", 
			"REPEAT", "UNTIL", "REAL", "READ", "EXIT", "CONST", "IDENTIFIER"
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


	public CXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CX.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u017f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\2\3\2\7\2\u0085\n\2\f\2\16\2\u0088"+
		"\13\2\3\2\3\2\5\2\u008c\n\2\3\2\3\2\3\3\6\3\u0091\n\3\r\3\16\3\u0092\3"+
		"\3\3\3\3\4\5\4\u0098\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u0129"+
		"\n/\f/\16/\u012c\13/\5/\u012e\n/\3\60\3\60\7\60\u0132\n\60\f\60\16\60"+
		"\u0135\13\60\3\60\3\60\7\60\u0139\n\60\f\60\16\60\u013c\13\60\3\60\3\60"+
		"\3\60\3\60\7\60\u0142\n\60\f\60\16\60\u0145\13\60\5\60\u0147\n\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\7<\u017b"+
		"\n<\f<\16<\u017e\13<\4}\u0086\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2\7\4\2\13\13\"\"\3\2\63;\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u018a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3\u008b\3\2\2\2\5\u0090\3\2\2\2\7\u0097\3"+
		"\2\2\2\t\u009d\3\2\2\2\13\u00a3\3\2\2\2\r\u00ab\3\2\2\2\17\u00af\3\2\2"+
		"\2\21\u00b4\3\2\2\2\23\u00b6\3\2\2\2\25\u00b8\3\2\2\2\27\u00bd\3\2\2\2"+
		"\31\u00c4\3\2\2\2\33\u00c6\3\2\2\2\35\u00c9\3\2\2\2\37\u00cc\3\2\2\2!"+
		"\u00ce\3\2\2\2#\u00d0\3\2\2\2%\u00d5\3\2\2\2\'\u00db\3\2\2\2)\u00df\3"+
		"\2\2\2+\u00e4\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00ee\3\2\2\2\63"+
		"\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f7\3\2\2\2;\u00fa"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2\2\2A\u0101\3\2\2\2C\u0104\3\2\2\2E"+
		"\u0106\3\2\2\2G\u0109\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2"+
		"\2\2O\u0113\3\2\2\2Q\u0116\3\2\2\2S\u0119\3\2\2\2U\u011b\3\2\2\2W\u011e"+
		"\3\2\2\2Y\u0121\3\2\2\2[\u0123\3\2\2\2]\u012d\3\2\2\2_\u0146\3\2\2\2a"+
		"\u0148\3\2\2\2c\u014a\3\2\2\2e\u014c\3\2\2\2g\u0150\3\2\2\2i\u0153\3\2"+
		"\2\2k\u0156\3\2\2\2m\u015d\3\2\2\2o\u0163\3\2\2\2q\u0168\3\2\2\2s\u016d"+
		"\3\2\2\2u\u0172\3\2\2\2w\u0178\3\2\2\2y}\5M\'\2z|\13\2\2\2{z\3\2\2\2|"+
		"\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\5\7\4\2\u0081\u008c\3\2\2\2\u0082\u0086\5O(\2\u0083\u0085\13\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5Q)\2\u008a\u008c"+
		"\3\2\2\2\u008by\3\2\2\2\u008b\u0082\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\2\2\2\u008e\4\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\b\3\2\2\u0095\6\3\2\2\2\u0096\u0098\7\17\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\f"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\4\2\2\u009c\b\3\2\2\2\u009d\u009e"+
		"\7y\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\u00aa\7p\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p"+
		"\2\2\u00ad\u00ae\7v\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7n\2\2\u00b3\20\3\2\2\2\u00b4\u00b5"+
		"\7}\2\2\u00b5\22\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7\24\3\2\2\2\u00b8"+
		"\u00b9\7x\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7f\2\2"+
		"\u00bc\26\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7"+
		"v\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7p\2\2\u00c3\30"+
		"\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7h\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\36\3\2\2\2\u00cc\u00cd\7*\2\2\u00cd \3\2\2\2\u00ce\u00cf\7+\2\2\u00cf"+
		"\"\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da&\3\2\2\2\u00db"+
		"\u00dc\7h\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de(\3\2\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3*\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2"+
		"\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7"+
		"?\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7"+
		"/\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\64\3\2\2\2\u00f2\u00f3"+
		"\7\61\2\2\u00f3\66\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5\u00f6\7?\2\2\u00f6"+
		"8\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\7?\2\2\u00f9:\3\2\2\2\u00fa\u00fb"+
		"\7>\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7"+
		">\2\2\u00ff\u0100\7?\2\2\u0100@\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103"+
		"\7?\2\2\u0103B\3\2\2\2\u0104\u0105\7#\2\2\u0105D\3\2\2\2\u0106\u0107\7"+
		"(\2\2\u0107\u0108\7(\2\2\u0108F\3\2\2\2\u0109\u010a\7~\2\2\u010a\u010b"+
		"\7~\2\2\u010bH\3\2\2\2\u010c\u010d\7~\2\2\u010dJ\3\2\2\2\u010e\u010f\7"+
		"`\2\2\u010fL\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7\61\2\2\u0112N"+
		"\3\2\2\2\u0113\u0114\7\61\2\2\u0114\u0115\7,\2\2\u0115P\3\2\2\2\u0116"+
		"\u0117\7,\2\2\u0117\u0118\7\61\2\2\u0118R\3\2\2\2\u0119\u011a\7.\2\2\u011a"+
		"T\3\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7>\2\2\u011dV\3\2\2\2\u011e\u011f"+
		"\7@\2\2\u011f\u0120\7@\2\2\u0120X\3\2\2\2\u0121\u0122\7(\2\2\u0122Z\3"+
		"\2\2\2\u0123\u0124\7A\2\2\u0124\\\3\2\2\2\u0125\u012e\7\62\2\2\u0126\u012a"+
		"\t\3\2\2\u0127\u0129\t\4\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012e^\3\2\2\2\u012f\u0133"+
		"\t\3\2\2\u0130\u0132\t\4\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u013a\7\60\2\2\u0137\u0139\t\4\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0147\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\62\2\2\u013e\u013f\7\60\2\2\u013f"+
		"\u0143\3\2\2\2\u0140\u0142\t\4\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u012f\3\2\2\2\u0146\u013d\3\2\2\2\u0147`\3\2\2\2"+
		"\u0148\u0149\7<\2\2\u0149b\3\2\2\2\u014a\u014b\7\'\2\2\u014bd\3\2\2\2"+
		"\u014c\u014d\7q\2\2\u014d\u014e\7f\2\2\u014e\u014f\7f\2\2\u014ff\3\2\2"+
		"\2\u0150\u0151\7/\2\2\u0151\u0152\7/\2\2\u0152h\3\2\2\2\u0153\u0154\7"+
		"-\2\2\u0154\u0155\7-\2\2\u0155j\3\2\2\2\u0156\u0157\7t\2\2\u0157\u0158"+
		"\7g\2\2\u0158\u0159\7r\2\2\u0159\u015a\7g\2\2\u015a\u015b\7c\2\2\u015b"+
		"\u015c\7v\2\2\u015cl\3\2\2\2\u015d\u015e\7w\2\2\u015e\u015f\7p\2\2\u015f"+
		"\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7n\2\2\u0162n\3\2\2\2\u0163"+
		"\u0164\7t\2\2\u0164\u0165\7g\2\2\u0165\u0166\7c\2\2\u0166\u0167\7n\2\2"+
		"\u0167p\3\2\2\2\u0168\u0169\7t\2\2\u0169\u016a\7g\2\2\u016a\u016b\7c\2"+
		"\2\u016b\u016c\7f\2\2\u016cr\3\2\2\2\u016d\u016e\7g\2\2\u016e\u016f\7"+
		"z\2\2\u016f\u0170\7k\2\2\u0170\u0171\7v\2\2\u0171t\3\2\2\2\u0172\u0173"+
		"\7e\2\2\u0173\u0174\7q\2\2\u0174\u0175\7p\2\2\u0175\u0176\7u\2\2\u0176"+
		"\u0177\7v\2\2\u0177v\3\2\2\2\u0178\u017c\t\5\2\2\u0179\u017b\t\6\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017dx\3\2\2\2\u017e\u017c\3\2\2\2\17\2}\u0086\u008b\u0092\u0097"+
		"\u012a\u012d\u0133\u013a\u0143\u0146\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}