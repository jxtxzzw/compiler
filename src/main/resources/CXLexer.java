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
		WHITESPACE=1, NEWLINE=2, COMMENT=3, LEFTBRACE=4, RIGHTBRACE=5, IDENTIFIER=6, 
		SEMICOLON=7, IF=8, LEFTPARENTHESIS=9, RIGHTPARENTHESIS=10, ELSE=11, WHILE=12, 
		FOR=13, TRUE=14, FALSE=15, NUMBER=16, ASSIGN=17, PLUS=18, MINUS=19, MUL=20, 
		DIV=21, INT=22, BOOLEAN=23, EQUAL=24, NOTEQUAL=25, LESSTHAN=26, GREATERTHAN=27, 
		LESSTHANOREQUAL=28, GREATERTHANOREQUAL=29, NOT=30, AND=31, OR=32, BEGININLINECOMMENT=33, 
		BEGINCOMMENT=34, ENDCOMMENT=35, COMMA=36, VOID=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "NEWLINE", "COMMENT", "LEFTBRACE", "RIGHTBRACE", "IDENTIFIER", 
			"SEMICOLON", "IF", "LEFTPARENTHESIS", "RIGHTPARENTHESIS", "ELSE", "WHILE", 
			"FOR", "TRUE", "FALSE", "NUMBER", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", 
			"INT", "BOOLEAN", "EQUAL", "NOTEQUAL", "LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", 
			"GREATERTHANOREQUAL", "NOT", "AND", "OR", "BEGININLINECOMMENT", "BEGINCOMMENT", 
			"ENDCOMMENT", "COMMA", "VOID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{'", "'}'", null, "';'", "'if'", "'('", "')'", 
			"'else'", "'while'", "'for'", "'true'", "'false'", null, "'='", "'+'", 
			"'-'", "'*'", "'/'", "'int'", "'bool'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'!'", "'&&'", "'||'", "'//'", "'/*'", "'*/'", "','", 
			"'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "NEWLINE", "COMMENT", "LEFTBRACE", "RIGHTBRACE", 
			"IDENTIFIER", "SEMICOLON", "IF", "LEFTPARENTHESIS", "RIGHTPARENTHESIS", 
			"ELSE", "WHILE", "FOR", "TRUE", "FALSE", "NUMBER", "ASSIGN", "PLUS", 
			"MINUS", "MUL", "DIV", "INT", "BOOLEAN", "EQUAL", "NOTEQUAL", "LESSTHAN", 
			"GREATERTHAN", "LESSTHANOREQUAL", "GREATERTHANOREQUAL", "NOT", "AND", 
			"OR", "BEGININLINECOMMENT", "BEGINCOMMENT", "ENDCOMMENT", "COMMA", "VOID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2O\n\2\r\2\16\2P\3\2\3\2\3\3"+
		"\5\3V\n\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4\3\4\3\4"+
		"\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\5\4n\n\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u00a3\n\21\f\21\16\21\u00a6\13\21\5\21\u00a8\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3&\3&\3&\3&\3&\4_h\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\7\4\2\13\13\"\""+
		"\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\2\u00eb\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\3N\3\2\2\2\5U\3\2\2\2\7m\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2"+
		"\17|\3\2\2\2\21~\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3"+
		"\2\2\2\31\u008a\3\2\2\2\33\u0090\3\2\2\2\35\u0094\3\2\2\2\37\u0099\3\2"+
		"\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af"+
		"\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b7\3\2\2\2\61\u00bc\3\2\2\2"+
		"\63\u00bf\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3\2\2\29\u00c6\3\2\2\2;\u00c9"+
		"\3\2\2\2=\u00cc\3\2\2\2?\u00ce\3\2\2\2A\u00d1\3\2\2\2C\u00d4\3\2\2\2E"+
		"\u00d7\3\2\2\2G\u00da\3\2\2\2I\u00dd\3\2\2\2K\u00df\3\2\2\2MO\t\2\2\2"+
		"NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\2\2\2S\4\3\2\2"+
		"\2TV\7\17\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\f\2\2XY\3\2\2\2YZ\b\3"+
		"\2\2Z\6\3\2\2\2[_\5C\"\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2\2_]"+
		"\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\5\3\2cn\3\2\2\2dh\5E#\2eg\13\2\2\2fe"+
		"\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5G$\2ln\3"+
		"\2\2\2m[\3\2\2\2md\3\2\2\2no\3\2\2\2op\b\4\2\2p\b\3\2\2\2qr\7}\2\2r\n"+
		"\3\2\2\2st\7\177\2\2t\f\3\2\2\2uy\t\3\2\2vx\t\4\2\2wv\3\2\2\2x{\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z\16\3\2\2\2{y\3\2\2\2|}\7=\2\2}\20\3\2\2\2~\177"+
		"\7k\2\2\177\u0080\7h\2\2\u0080\22\3\2\2\2\u0081\u0082\7*\2\2\u0082\24"+
		"\3\2\2\2\u0083\u0084\7+\2\2\u0084\26\3\2\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\30\3\2\2\2\u008a"+
		"\u008b\7y\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2"+
		"\u008e\u008f\7g\2\2\u008f\32\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7"+
		"q\2\2\u0092\u0093\7t\2\2\u0093\34\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7t\2\2\u0096\u0097\7w\2\2\u0097\u0098\7g\2\2\u0098\36\3\2\2\2\u0099\u009a"+
		"\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d"+
		"\u009e\7g\2\2\u009e \3\2\2\2\u009f\u00a8\7\62\2\2\u00a0\u00a4\t\5\2\2"+
		"\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7?\2\2"+
		"\u00aa$\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae"+
		"(\3\2\2\2\u00af\u00b0\7,\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2"+
		",\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		".\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be"+
		"\62\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7?\2\2\u00c1\64\3\2\2\2\u00c2"+
		"\u00c3\7>\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7@\2\2\u00c58\3\2\2\2\u00c6"+
		"\u00c7\7>\2\2\u00c7\u00c8\7?\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca"+
		"\u00cb\7?\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd>\3\2\2\2\u00ce\u00cf"+
		"\7(\2\2\u00cf\u00d0\7(\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2\u00d3"+
		"\7~\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7\61\2\2\u00d6"+
		"D\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7,\2\2\u00d9F\3\2\2\2\u00da"+
		"\u00db\7,\2\2\u00db\u00dc\7\61\2\2\u00dcH\3\2\2\2\u00dd\u00de\7.\2\2\u00de"+
		"J\3\2\2\2\u00df\u00e0\7x\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7k\2\2\u00e2"+
		"\u00e3\7f\2\2\u00e3L\3\2\2\2\13\2PU_hmy\u00a4\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}