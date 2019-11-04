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
		AND=44, QUESTIONMARK=45, NUMBER=46, COLON=47, MOD=48, MINUSMINUS=49, PLUSPLUS=50, 
		REPEAT=51, UNTIL=52, IDENTIFIER=53;
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
			"NUMBER", "COLON", "MOD", "MINUSMINUS", "PLUSPLUS", "REPEAT", "UNTIL", 
			"IDENTIFIER"
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
			null, "':'", "'%'", "'--'", "'++'", "'repeat'", "'until'"
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
			"NUMBER", "COLON", "MOD", "MINUSMINUS", "PLUSPLUS", "REPEAT", "UNTIL", 
			"IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\3\2\3\2"+
		"\3\2\7\2y\n\2\f\2\16\2|\13\2\3\2\3\2\5\2\u0080\n\2\3\2\3\2\3\3\6\3\u0085"+
		"\n\3\r\3\16\3\u0086\3\3\3\3\3\4\5\4\u008c\n\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3/\7/\u011d\n/\f/\16/\u0120\13/\5/\u0122\n/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u013d\n\66\f\66\16\66"+
		"\u0140\13\66\4qz\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67\3\2\7\4\2\13\13\"\"\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\2\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\3\177\3\2\2\2\5\u0084\3\2\2\2\7\u008b\3\2\2\2\t\u0091\3\2\2\2"+
		"\13\u0097\3\2\2\2\r\u009f\3\2\2\2\17\u00a3\3\2\2\2\21\u00a8\3\2\2\2\23"+
		"\u00aa\3\2\2\2\25\u00ac\3\2\2\2\27\u00b1\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba"+
		"\3\2\2\2\35\u00bd\3\2\2\2\37\u00c0\3\2\2\2!\u00c2\3\2\2\2#\u00c4\3\2\2"+
		"\2%\u00c9\3\2\2\2\'\u00cf\3\2\2\2)\u00d3\3\2\2\2+\u00d8\3\2\2\2-\u00de"+
		"\3\2\2\2/\u00e0\3\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2"+
		"\2\2\67\u00e8\3\2\2\29\u00eb\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f2"+
		"\3\2\2\2A\u00f5\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u0100\3\2\2\2K\u0102\3\2\2\2M\u0104\3\2\2\2O\u0107\3\2\2\2Q\u010a\3\2"+
		"\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0112\3\2\2\2Y\u0115\3\2\2\2[\u0117"+
		"\3\2\2\2]\u0121\3\2\2\2_\u0123\3\2\2\2a\u0125\3\2\2\2c\u0127\3\2\2\2e"+
		"\u012a\3\2\2\2g\u012d\3\2\2\2i\u0134\3\2\2\2k\u013a\3\2\2\2mq\5M\'\2n"+
		"p\13\2\2\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2\2rt\3\2\2\2sq\3\2\2\2"+
		"tu\5\7\4\2u\u0080\3\2\2\2vz\5O(\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2"+
		"\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\5Q)\2~\u0080\3\2\2\2\177m\3\2\2\2"+
		"\177v\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\2\2\2\u0082\4\3\2\2\2"+
		"\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\3\2\2\u0089"+
		"\6\3\2\2\2\u008a\u008c\7\17\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008e\7\f\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\b\4\2\2\u0090\b\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\n\3\2\2\2\u0097\u0098"+
		"\7y\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7p\2\2\u009e\f\3\2\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\16\3\2\2\2\u00a3"+
		"\u00a4\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\20\3\2\2\2\u00a8\u00a9\7}\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7\177"+
		"\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7f\2\2\u00b0\26\3\2\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7t\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9\32\3\2\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7f\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1 \3\2\2\2\u00c2"+
		"\u00c3\7+\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca"+
		"\u00cb\7j\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2"+
		"\u00ce&\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7t\2"+
		"\2\u00d2(\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7"+
		"w\2\2\u00d6\u00d7\7g\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		",\3\2\2\2\u00de\u00df\7?\2\2\u00df.\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1\60"+
		"\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5"+
		"\64\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9"+
		"\u00ea\7?\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7?\2\2\u00ed"+
		":\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1>"+
		"\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\7?\2\2\u00f4@\3\2\2\2\u00f5\u00f6"+
		"\7@\2\2\u00f6\u00f7\7?\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9D\3"+
		"\2\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7(\2\2\u00fcF\3\2\2\2\u00fd\u00fe"+
		"\7~\2\2\u00fe\u00ff\7~\2\2\u00ffH\3\2\2\2\u0100\u0101\7~\2\2\u0101J\3"+
		"\2\2\2\u0102\u0103\7`\2\2\u0103L\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106"+
		"\7\61\2\2\u0106N\3\2\2\2\u0107\u0108\7\61\2\2\u0108\u0109\7,\2\2\u0109"+
		"P\3\2\2\2\u010a\u010b\7,\2\2\u010b\u010c\7\61\2\2\u010cR\3\2\2\2\u010d"+
		"\u010e\7.\2\2\u010eT\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111\7>\2\2\u0111"+
		"V\3\2\2\2\u0112\u0113\7@\2\2\u0113\u0114\7@\2\2\u0114X\3\2\2\2\u0115\u0116"+
		"\7(\2\2\u0116Z\3\2\2\2\u0117\u0118\7A\2\2\u0118\\\3\2\2\2\u0119\u0122"+
		"\7\62\2\2\u011a\u011e\t\3\2\2\u011b\u011d\t\4\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011a\3\2\2\2\u0122"+
		"^\3\2\2\2\u0123\u0124\7<\2\2\u0124`\3\2\2\2\u0125\u0126\7\'\2\2\u0126"+
		"b\3\2\2\2\u0127\u0128\7/\2\2\u0128\u0129\7/\2\2\u0129d\3\2\2\2\u012a\u012b"+
		"\7-\2\2\u012b\u012c\7-\2\2\u012cf\3\2\2\2\u012d\u012e\7t\2\2\u012e\u012f"+
		"\7g\2\2\u012f\u0130\7r\2\2\u0130\u0131\7g\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7v\2\2\u0133h\3\2\2\2\u0134\u0135\7w\2\2\u0135\u0136\7p\2\2\u0136"+
		"\u0137\7v\2\2\u0137\u0138\7k\2\2\u0138\u0139\7n\2\2\u0139j\3\2\2\2\u013a"+
		"\u013e\t\5\2\2\u013b\u013d\t\6\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fl\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\13\2qz\177\u0086\u008b\u011e\u0121\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}