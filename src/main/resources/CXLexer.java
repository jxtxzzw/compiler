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
		ODD=50, MINUSMINUS=51, PLUSPLUS=52, REPEAT=53, UNTIL=54, IDENTIFIER=55;
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
			"REPEAT", "UNTIL", "IDENTIFIER"
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
			null, null, "':'", "'%'", "'odd'", "'--'", "'++'", "'repeat'", "'until'"
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
			"REPEAT", "UNTIL", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0162\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\2\3\2\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\5\2\u0084\n\2"+
		"\3\2\3\2\3\3\6\3\u0089\n\3\r\3\16\3\u008a\3\3\3\3\3\4\5\4\u0090\n\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u0121\n/\f/\16/\u0124\13/\5/"+
		"\u0126\n/\3\60\3\60\7\60\u012a\n\60\f\60\16\60\u012d\13\60\3\60\3\60\7"+
		"\60\u0131\n\60\f\60\16\60\u0134\13\60\3\60\3\60\3\60\3\60\7\60\u013a\n"+
		"\60\f\60\16\60\u013d\13\60\5\60\u013f\n\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\78\u015e\n8\f8\168\u0161"+
		"\138\4u~\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9\3\2\7\4\2\13\13\"\"\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\3\u0083\3\2\2\2\5\u0088\3\2\2\2\7\u008f\3\2\2"+
		"\2\t\u0095\3\2\2\2\13\u009b\3\2\2\2\r\u00a3\3\2\2\2\17\u00a7\3\2\2\2\21"+
		"\u00ac\3\2\2\2\23\u00ae\3\2\2\2\25\u00b0\3\2\2\2\27\u00b5\3\2\2\2\31\u00bc"+
		"\3\2\2\2\33\u00be\3\2\2\2\35\u00c1\3\2\2\2\37\u00c4\3\2\2\2!\u00c6\3\2"+
		"\2\2#\u00c8\3\2\2\2%\u00cd\3\2\2\2\'\u00d3\3\2\2\2)\u00d7\3\2\2\2+\u00dc"+
		"\3\2\2\2-\u00e2\3\2\2\2/\u00e4\3\2\2\2\61\u00e6\3\2\2\2\63\u00e8\3\2\2"+
		"\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ef\3\2\2\2;\u00f2\3\2\2\2=\u00f4"+
		"\3\2\2\2?\u00f6\3\2\2\2A\u00f9\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G"+
		"\u0101\3\2\2\2I\u0104\3\2\2\2K\u0106\3\2\2\2M\u0108\3\2\2\2O\u010b\3\2"+
		"\2\2Q\u010e\3\2\2\2S\u0111\3\2\2\2U\u0113\3\2\2\2W\u0116\3\2\2\2Y\u0119"+
		"\3\2\2\2[\u011b\3\2\2\2]\u0125\3\2\2\2_\u013e\3\2\2\2a\u0140\3\2\2\2c"+
		"\u0142\3\2\2\2e\u0144\3\2\2\2g\u0148\3\2\2\2i\u014b\3\2\2\2k\u014e\3\2"+
		"\2\2m\u0155\3\2\2\2o\u015b\3\2\2\2qu\5M\'\2rt\13\2\2\2sr\3\2\2\2tw\3\2"+
		"\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\5\7\4\2y\u0084\3\2\2\2"+
		"z~\5O(\2{}\13\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5Q)\2\u0082\u0084\3\2\2\2\u0083"+
		"q\3\2\2\2\u0083z\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\2\2\2\u0086"+
		"\4\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\b\3\2\2\u008d\6\3\2\2\2\u008e\u0090\7\17\2\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\f\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\b\4\2\2\u0094\b\3\2\2\2\u0095\u0096\7y\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a"+
		"\n\3\2\2\2\u009b\u009c\7y\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7p\2\2"+
		"\u00a2\f\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v"+
		"\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7n\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad\22"+
		"\3\2\2\2\u00ae\u00af\7\177\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7x\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7f\2\2\u00b4\26\3\2\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7w\2\2"+
		"\u00b9\u00ba\7t\2\2\u00ba\u00bb\7p\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7"+
		"=\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0\34"+
		"\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7q\2\2\u00c3\36\3\2\2\2\u00c4"+
		"\u00c5\7*\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\"\3\2\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc$\3\2\2\2\u00cd\u00ce\7y\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7k\2"+
		"\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7"+
		"h\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6(\3\2\2\2\u00d7\u00d8"+
		"\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7g\2\2\u00db"+
		"*\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7n\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3"+
		".\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\60\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7"+
		"\62\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb"+
		"\66\3\2\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\7?\2\2\u00ee8\3\2\2\2\u00ef"+
		"\u00f0\7#\2\2\u00f0\u00f1\7?\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3"+
		"<\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\7?\2\2\u00fbB\3"+
		"\2\2\2\u00fc\u00fd\7#\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100"+
		"\7(\2\2\u0100F\3\2\2\2\u0101\u0102\7~\2\2\u0102\u0103\7~\2\2\u0103H\3"+
		"\2\2\2\u0104\u0105\7~\2\2\u0105J\3\2\2\2\u0106\u0107\7`\2\2\u0107L\3\2"+
		"\2\2\u0108\u0109\7\61\2\2\u0109\u010a\7\61\2\2\u010aN\3\2\2\2\u010b\u010c"+
		"\7\61\2\2\u010c\u010d\7,\2\2\u010dP\3\2\2\2\u010e\u010f\7,\2\2\u010f\u0110"+
		"\7\61\2\2\u0110R\3\2\2\2\u0111\u0112\7.\2\2\u0112T\3\2\2\2\u0113\u0114"+
		"\7>\2\2\u0114\u0115\7>\2\2\u0115V\3\2\2\2\u0116\u0117\7@\2\2\u0117\u0118"+
		"\7@\2\2\u0118X\3\2\2\2\u0119\u011a\7(\2\2\u011aZ\3\2\2\2\u011b\u011c\7"+
		"A\2\2\u011c\\\3\2\2\2\u011d\u0126\7\62\2\2\u011e\u0122\t\3\2\2\u011f\u0121"+
		"\t\4\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u011d\3\2"+
		"\2\2\u0125\u011e\3\2\2\2\u0126^\3\2\2\2\u0127\u012b\t\3\2\2\u0128\u012a"+
		"\t\4\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0132\7\60"+
		"\2\2\u012f\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013f\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0136\7\62\2\2\u0136\u0137\7\60\2\2\u0137\u013b\3\2\2\2\u0138"+
		"\u013a\t\4\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0127\3\2\2\2\u013e\u0135\3\2\2\2\u013f`\3\2\2\2\u0140\u0141\7<\2\2\u0141"+
		"b\3\2\2\2\u0142\u0143\7\'\2\2\u0143d\3\2\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0146\7f\2\2\u0146\u0147\7f\2\2\u0147f\3\2\2\2\u0148\u0149\7/\2\2\u0149"+
		"\u014a\7/\2\2\u014ah\3\2\2\2\u014b\u014c\7-\2\2\u014c\u014d\7-\2\2\u014d"+
		"j\3\2\2\2\u014e\u014f\7t\2\2\u014f\u0150\7g\2\2\u0150\u0151\7r\2\2\u0151"+
		"\u0152\7g\2\2\u0152\u0153\7c\2\2\u0153\u0154\7v\2\2\u0154l\3\2\2\2\u0155"+
		"\u0156\7w\2\2\u0156\u0157\7p\2\2\u0157\u0158\7v\2\2\u0158\u0159\7k\2\2"+
		"\u0159\u015a\7n\2\2\u015an\3\2\2\2\u015b\u015f\t\5\2\2\u015c\u015e\t\6"+
		"\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160p\3\2\2\2\u0161\u015f\3\2\2\2\17\2u~\u0083\u008a\u008f"+
		"\u0122\u0125\u012b\u0132\u013b\u013e\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}