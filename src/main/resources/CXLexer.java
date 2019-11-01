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
		COMMENT=1, WHITESPACE=2, NEWLINE=3, WRITE=4, INT=5, BOOLEAN=6, LEFTBRACE=7, 
		RIGHTBRACE=8, VOID=9, RETURN=10, SEMICOLON=11, IF=12, LEFTPARENTHESIS=13, 
		RIGHTPARENTHESIS=14, ELSE=15, WHILE=16, FOR=17, TRUE=18, FALSE=19, ASSIGN=20, 
		PLUS=21, MINUS=22, MUL=23, DIV=24, EQUAL=25, NOTEQUAL=26, LESSTHAN=27, 
		GREATERTHAN=28, LESSTHANOREQUAL=29, GREATERTHANOREQUAL=30, NOT=31, AND=32, 
		OR=33, BEGININLINECOMMENT=34, BEGINCOMMENT=35, ENDCOMMENT=36, COMMA=37, 
		NUMBER=38, IDENTIFIER=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "WHITESPACE", "NEWLINE", "WRITE", "INT", "BOOLEAN", "LEFTBRACE", 
			"RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", "IF", "LEFTPARENTHESIS", 
			"RIGHTPARENTHESIS", "ELSE", "WHILE", "FOR", "TRUE", "FALSE", "ASSIGN", 
			"PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOTEQUAL", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", "AND", "OR", "BEGININLINECOMMENT", 
			"BEGINCOMMENT", "ENDCOMMENT", "COMMA", "NUMBER", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'write'", "'int'", "'bool'", "'{'", "'}'", "'void'", 
			"'return'", "';'", "'if'", "'('", "')'", "'else'", "'while'", "'for'", 
			"'true'", "'false'", "'='", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'!'", "'&&'", "'||'", "'//'", "'/*'", 
			"'*/'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WHITESPACE", "NEWLINE", "WRITE", "INT", "BOOLEAN", 
			"LEFTBRACE", "RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", "IF", "LEFTPARENTHESIS", 
			"RIGHTPARENTHESIS", "ELSE", "WHILE", "FOR", "TRUE", "FALSE", "ASSIGN", 
			"PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOTEQUAL", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", "AND", "OR", "BEGININLINECOMMENT", 
			"BEGINCOMMENT", "ENDCOMMENT", "COMMA", "NUMBER", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\7\2T\n\2\f\2"+
		"\16\2W\13\2\3\2\3\2\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2\5\2d\n\2\3"+
		"\2\3\2\3\3\6\3i\n\3\r\3\16\3j\3\3\3\3\3\4\5\4p\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3\'\7\'\u00e8\n\'\f\'\16\'\u00eb\13\'\5\'\u00ed\n\'\3(\3(\7(\u00f1"+
		"\n(\f(\16(\u00f4\13(\4U^\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\7\4\2\13\13\"\"\3"+
		"\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u00fc\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\3c\3\2\2\2\5h\3\2\2\2\7o\3\2\2\2\tu\3\2\2\2\13"+
		"{\3\2\2\2\r\177\3\2\2\2\17\u0084\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3\2"+
		"\2\2\25\u008d\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0099\3\2\2"+
		"\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u00a2\3\2\2\2#\u00a8\3\2\2\2%\u00ac"+
		"\3\2\2\2\'\u00b1\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2"+
		"/\u00bd\3\2\2\2\61\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00c4\3\2\2\2\67"+
		"\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00ce\3\2\2\2?\u00d1\3\2"+
		"\2\2A\u00d3\3\2\2\2C\u00d6\3\2\2\2E\u00d9\3\2\2\2G\u00dc\3\2\2\2I\u00df"+
		"\3\2\2\2K\u00e2\3\2\2\2M\u00ec\3\2\2\2O\u00ee\3\2\2\2QU\5E#\2RT\13\2\2"+
		"\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\7\4"+
		"\2Yd\3\2\2\2Z^\5G$\2[]\13\2\2\2\\[\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2"+
		"\2\2_a\3\2\2\2`^\3\2\2\2ab\5I%\2bd\3\2\2\2cQ\3\2\2\2cZ\3\2\2\2de\3\2\2"+
		"\2ef\b\2\2\2f\4\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2kl\3\2\2\2lm\b\3\2\2m\6\3\2\2\2np\7\17\2\2on\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qr\7\f\2\2rs\3\2\2\2st\b\4\2\2t\b\3\2\2\2uv\7y\2\2vw\7t\2\2wx\7"+
		"k\2\2xy\7v\2\2yz\7g\2\2z\n\3\2\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~\f\3\2\2"+
		"\2\177\u0080\7d\2\2\u0080\u0081\7q\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7n\2\2\u0083\16\3\2\2\2\u0084\u0085\7}\2\2\u0085\20\3\2\2\2\u0086\u0087"+
		"\7\177\2\2\u0087\22\3\2\2\2\u0088\u0089\7x\2\2\u0089\u008a\7q\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7f\2\2\u008c\24\3\2\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7p\2\2\u0093\26\3\2\2\2\u0094\u0095\7=\2\2\u0095\30\3\2\2"+
		"\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\32\3\2\2\2\u0099\u009a"+
		"\7*\2\2\u009a\34\3\2\2\2\u009b\u009c\7+\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7t\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7g\2\2\u00b0&\3\2\2\2\u00b1"+
		"\u00b2\7h\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7u\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8*\3\2\2\2\u00b9"+
		"\u00ba\7-\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc.\3\2\2\2\u00bd\u00be"+
		"\7,\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\62\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\u00c3\7?\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7>\2\2\u00c88\3\2\2\2\u00c9\u00ca"+
		"\7@\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\u00cd\7?\2\2\u00cd<\3"+
		"\2\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d0\7?\2\2\u00d0>\3\2\2\2\u00d1\u00d2"+
		"\7#\2\2\u00d2@\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\7(\2\2\u00d5B\3"+
		"\2\2\2\u00d6\u00d7\7~\2\2\u00d7\u00d8\7~\2\2\u00d8D\3\2\2\2\u00d9\u00da"+
		"\7\61\2\2\u00da\u00db\7\61\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"\u00de\7,\2\2\u00deH\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7\61\2\2\u00e1"+
		"J\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3L\3\2\2\2\u00e4\u00ed\7\62\2\2\u00e5"+
		"\u00e9\t\3\2\2\u00e6\u00e8\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e5\3\2\2\2\u00edN\3\2\2\2"+
		"\u00ee\u00f2\t\5\2\2\u00ef\u00f1\t\6\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3P\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\13\2U^cjo\u00e9\u00ec\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}