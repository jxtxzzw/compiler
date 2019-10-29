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
		WHITESPACE=1, NEWLINE=2, COMMENT=3, INT=4, BOOLEAN=5, LEFTBRACE=6, RIGHTBRACE=7, 
		VOID=8, RETURN=9, SEMICOLON=10, IF=11, LEFTPARENTHESIS=12, RIGHTPARENTHESIS=13, 
		ELSE=14, WHILE=15, FOR=16, TRUE=17, FALSE=18, ASSIGN=19, PLUS=20, MINUS=21, 
		MUL=22, DIV=23, EQUAL=24, NOTEQUAL=25, LESSTHAN=26, GREATERTHAN=27, LESSTHANOREQUAL=28, 
		GREATERTHANOREQUAL=29, NOT=30, AND=31, OR=32, BEGININLINECOMMENT=33, BEGINCOMMENT=34, 
		ENDCOMMENT=35, COMMA=36, NUMBER=37, IDENTIFIER=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "NEWLINE", "COMMENT", "INT", "BOOLEAN", "LEFTBRACE", "RIGHTBRACE", 
			"VOID", "RETURN", "SEMICOLON", "IF", "LEFTPARENTHESIS", "RIGHTPARENTHESIS", 
			"ELSE", "WHILE", "FOR", "TRUE", "FALSE", "ASSIGN", "PLUS", "MINUS", "MUL", 
			"DIV", "EQUAL", "NOTEQUAL", "LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", 
			"GREATERTHANOREQUAL", "NOT", "AND", "OR", "BEGININLINECOMMENT", "BEGINCOMMENT", 
			"ENDCOMMENT", "COMMA", "NUMBER", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'int'", "'bool'", "'{'", "'}'", "'void'", "'return'", 
			"';'", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "'true'", 
			"'false'", "'='", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'!'", "'&&'", "'||'", "'//'", "'/*'", "'*/'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "NEWLINE", "COMMENT", "INT", "BOOLEAN", "LEFTBRACE", 
			"RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", "IF", "LEFTPARENTHESIS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2Q\n\2\r\2\16\2R\3\2"+
		"\3\2\3\3\5\3X\n\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4\3\4"+
		"\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\7&\u00e0\n&\f&\16&\u00e3"+
		"\13&\5&\u00e5\n&\3\'\3\'\7\'\u00e9\n\'\f\'\16\'\u00ec\13\'\4aj\2(\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(\3\2\7\4\2\13\13\"\"\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62"+
		";C\\aac|\2\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3P\3\2\2\2\5W\3\2"+
		"\2\2\7o\3\2\2\2\ts\3\2\2\2\13w\3\2\2\2\r|\3\2\2\2\17~\3\2\2\2\21\u0080"+
		"\3\2\2\2\23\u0085\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0091\3"+
		"\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3\2\2\2!\u00a0\3\2\2"+
		"\2#\u00a4\3\2\2\2%\u00a9\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b3"+
		"\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bc\3\2\2"+
		"\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c6\3\2\2\2=\u00c9"+
		"\3\2\2\2?\u00cb\3\2\2\2A\u00ce\3\2\2\2C\u00d1\3\2\2\2E\u00d4\3\2\2\2G"+
		"\u00d7\3\2\2\2I\u00da\3\2\2\2K\u00e4\3\2\2\2M\u00e6\3\2\2\2OQ\t\2\2\2"+
		"PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\2\2\2U\4\3\2\2"+
		"\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\f\2\2Z[\3\2\2\2[\\\b\3"+
		"\2\2\\\6\3\2\2\2]a\5C\"\2^`\13\2\2\2_^\3\2\2\2`c\3\2\2\2ab\3\2\2\2a_\3"+
		"\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\5\3\2ep\3\2\2\2fj\5E#\2gi\13\2\2\2hg\3"+
		"\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\5G$\2np\3\2"+
		"\2\2o]\3\2\2\2of\3\2\2\2pq\3\2\2\2qr\b\4\2\2r\b\3\2\2\2st\7k\2\2tu\7p"+
		"\2\2uv\7v\2\2v\n\3\2\2\2wx\7d\2\2xy\7q\2\2yz\7q\2\2z{\7n\2\2{\f\3\2\2"+
		"\2|}\7}\2\2}\16\3\2\2\2~\177\7\177\2\2\177\20\3\2\2\2\u0080\u0081\7x\2"+
		"\2\u0081\u0082\7q\2\2\u0082\u0083\7k\2\2\u0083\u0084\7f\2\2\u0084\22\3"+
		"\2\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7w\2\2\u0089\u008a\7t\2\2\u008a\u008b\7p\2\2\u008b\24\3\2\2\2\u008c"+
		"\u008d\7=\2\2\u008d\26\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7*\2\2\u0092\32\3\2\2\2\u0093\u0094\7+\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7g\2\2\u0099\36\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c\7j\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f \3\2\2\2\u00a0"+
		"\u00a1\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3\"\3\2\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8$\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2"+
		"\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae&\3\2\2\2\u00af\u00b0\7"+
		"?\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7/"+
		"\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7\61"+
		"\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\u00bb\7?\2\2\u00bb\62\3"+
		"\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7>\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7@\2\2\u00c28\3\2\2\2\u00c3\u00c4"+
		"\7>\2\2\u00c4\u00c5\7?\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7"+
		"(\2\2\u00cc\u00cd\7(\2\2\u00cd@\3\2\2\2\u00ce\u00cf\7~\2\2\u00cf\u00d0"+
		"\7~\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2\2\u00d3"+
		"D\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7,\2\2\u00d6F\3\2\2\2\u00d7"+
		"\u00d8\7,\2\2\u00d8\u00d9\7\61\2\2\u00d9H\3\2\2\2\u00da\u00db\7.\2\2\u00db"+
		"J\3\2\2\2\u00dc\u00e5\7\62\2\2\u00dd\u00e1\t\3\2\2\u00de\u00e0\t\4\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00dd\3\2\2\2\u00e5L\3\2\2\2\u00e6\u00ea\t\5\2\2\u00e7\u00e9\t\6\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00ebN\3\2\2\2\u00ec\u00ea\3\2\2\2\13\2RWajo\u00e1\u00e4\u00ea"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}