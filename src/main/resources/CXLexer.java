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
		LEFTBRACE=8, RIGHTBRACE=9, VOID=10, RETURN=11, SEMICOLON=12, IF=13, LEFTPARENTHESIS=14, 
		RIGHTPARENTHESIS=15, ELSE=16, WHILE=17, FOR=18, TRUE=19, FALSE=20, ASSIGN=21, 
		PLUS=22, MINUS=23, MUL=24, DIV=25, EQUAL=26, NOTEQUAL=27, LESSTHAN=28, 
		GREATERTHAN=29, LESSTHANOREQUAL=30, GREATERTHANOREQUAL=31, NOT=32, AND=33, 
		OR=34, BEGININLINECOMMENT=35, BEGINCOMMENT=36, ENDCOMMENT=37, COMMA=38, 
		NUMBER=39, IDENTIFIER=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "WHITESPACE", "NEWLINE", "WRITE", "WRITELN", "INT", "BOOLEAN", 
			"LEFTBRACE", "RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", "IF", "LEFTPARENTHESIS", 
			"RIGHTPARENTHESIS", "ELSE", "WHILE", "FOR", "TRUE", "FALSE", "ASSIGN", 
			"PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOTEQUAL", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", "AND", "OR", "BEGININLINECOMMENT", 
			"BEGINCOMMENT", "ENDCOMMENT", "COMMA", "NUMBER", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'write'", "'writeln'", "'int'", "'bool'", "'{'", 
			"'}'", "'void'", "'return'", "';'", "'if'", "'('", "')'", "'else'", "'while'", 
			"'for'", "'true'", "'false'", "'='", "'+'", "'-'", "'*'", "'/'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'!'", "'&&'", "'||'", "'//'", 
			"'/*'", "'*/'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WHITESPACE", "NEWLINE", "WRITE", "WRITELN", "INT", 
			"BOOLEAN", "LEFTBRACE", "RIGHTBRACE", "VOID", "RETURN", "SEMICOLON", 
			"IF", "LEFTPARENTHESIS", "RIGHTPARENTHESIS", "ELSE", "WHILE", "FOR", 
			"TRUE", "FALSE", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOTEQUAL", 
			"LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", 
			"AND", "OR", "BEGININLINECOMMENT", "BEGINCOMMENT", "ENDCOMMENT", "COMMA", 
			"NUMBER", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\7\2V\n"+
		"\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2\3\2\5\2"+
		"f\n\2\3\2\3\2\3\3\6\3k\n\3\r\3\16\3l\3\3\3\3\3\4\5\4r\n\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\7(\u00f2\n(\f(\16(\u00f5"+
		"\13(\5(\u00f7\n(\3)\3)\7)\u00fb\n)\f)\16)\u00fe\13)\4W`\2*\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*\3\2\7\4\2\13\13\"\"\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\2\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3"+
		"e\3\2\2\2\5j\3\2\2\2\7q\3\2\2\2\tw\3\2\2\2\13}\3\2\2\2\r\u0085\3\2\2\2"+
		"\17\u0089\3\2\2\2\21\u008e\3\2\2\2\23\u0090\3\2\2\2\25\u0092\3\2\2\2\27"+
		"\u0097\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5"+
		"\3\2\2\2!\u00a7\3\2\2\2#\u00ac\3\2\2\2%\u00b2\3\2\2\2\'\u00b6\3\2\2\2"+
		")\u00bb\3\2\2\2+\u00c1\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61\u00c7"+
		"\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00ce\3\2\2\29\u00d1\3\2"+
		"\2\2;\u00d3\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C\u00dd"+
		"\3\2\2\2E\u00e0\3\2\2\2G\u00e3\3\2\2\2I\u00e6\3\2\2\2K\u00e9\3\2\2\2M"+
		"\u00ec\3\2\2\2O\u00f6\3\2\2\2Q\u00f8\3\2\2\2SW\5G$\2TV\13\2\2\2UT\3\2"+
		"\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5\7\4\2[f\3\2"+
		"\2\2\\`\5I%\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2"+
		"\2\2b`\3\2\2\2cd\5K&\2df\3\2\2\2eS\3\2\2\2e\\\3\2\2\2fg\3\2\2\2gh\b\2"+
		"\2\2h\4\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3"+
		"\2\2\2no\b\3\2\2o\6\3\2\2\2pr\7\17\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2s"+
		"t\7\f\2\2tu\3\2\2\2uv\b\4\2\2v\b\3\2\2\2wx\7y\2\2xy\7t\2\2yz\7k\2\2z{"+
		"\7v\2\2{|\7g\2\2|\n\3\2\2\2}~\7y\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7p\2\2"+
		"\u0084\f\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v"+
		"\2\2\u0088\16\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7n\2\2\u008d\20\3\2\2\2\u008e\u008f\7}\2\2\u008f\22"+
		"\3\2\2\2\u0090\u0091\7\177\2\2\u0091\24\3\2\2\2\u0092\u0093\7x\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7k\2\2\u0095\u0096\7f\2\2\u0096\26\3\2\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a\7v\2\2\u009a\u009b\7w\2\2"+
		"\u009b\u009c\7t\2\2\u009c\u009d\7p\2\2\u009d\30\3\2\2\2\u009e\u009f\7"+
		"=\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\34"+
		"\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6"+
		" \3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7j\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1$\3\2\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5&\3\2\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba(\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2"+
		"\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7"+
		"?\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7/"+
		"\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\62\3\2\2\2\u00c9\u00ca"+
		"\7\61\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7?\2\2\u00cd"+
		"\66\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf\u00d0\7?\2\2\u00d08\3\2\2\2\u00d1"+
		"\u00d2\7>\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4<\3\2\2\2\u00d5\u00d6"+
		"\7>\2\2\u00d6\u00d7\7?\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da"+
		"\7?\2\2\u00da@\3\2\2\2\u00db\u00dc\7#\2\2\u00dcB\3\2\2\2\u00dd\u00de\7"+
		"(\2\2\u00de\u00df\7(\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7~\2\2\u00e1\u00e2"+
		"\7~\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7\61\2\2\u00e5"+
		"H\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7,\2\2\u00e8J\3\2\2\2\u00e9"+
		"\u00ea\7,\2\2\u00ea\u00eb\7\61\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed"+
		"N\3\2\2\2\u00ee\u00f7\7\62\2\2\u00ef\u00f3\t\3\2\2\u00f0\u00f2\t\4\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f7P\3\2\2\2\u00f8\u00fc\t\5\2\2\u00f9\u00fb\t\6\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fdR\3\2\2\2\u00fe\u00fc\3\2\2\2\13\2W`elq\u00f3\u00f6\u00fc"+
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