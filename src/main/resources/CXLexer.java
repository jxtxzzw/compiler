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
		IDENTIFIER=51;
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
			"NUMBER", "COLON", "MOD", "MINUSMINUS", "PLUSPLUS", "IDENTIFIER"
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
			null, "':'", "'%'", "'--'", "'++'"
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
			"NUMBER", "COLON", "MOD", "MINUSMINUS", "PLUSPLUS", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0130\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\2\3\2\7\2u\n\2\f\2\16"+
		"\2x\13\2\3\2\3\2\5\2|\n\2\3\2\3\2\3\3\6\3\u0081\n\3\r\3\16\3\u0082\3\3"+
		"\3\3\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u0119"+
		"\n/\f/\16/\u011c\13/\5/\u011e\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\7\64\u012c\n\64\f\64\16\64\u012f\13\64\4mv\2\65"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\7\4\2\13"+
		"\13\"\"\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u0137\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\3{\3\2\2\2\5\u0080\3\2\2\2\7\u0087\3\2\2\2"+
		"\t\u008d\3\2\2\2\13\u0093\3\2\2\2\r\u009b\3\2\2\2\17\u009f\3\2\2\2\21"+
		"\u00a4\3\2\2\2\23\u00a6\3\2\2\2\25\u00a8\3\2\2\2\27\u00ad\3\2\2\2\31\u00b4"+
		"\3\2\2\2\33\u00b6\3\2\2\2\35\u00b9\3\2\2\2\37\u00bc\3\2\2\2!\u00be\3\2"+
		"\2\2#\u00c0\3\2\2\2%\u00c5\3\2\2\2\'\u00cb\3\2\2\2)\u00cf\3\2\2\2+\u00d4"+
		"\3\2\2\2-\u00da\3\2\2\2/\u00dc\3\2\2\2\61\u00de\3\2\2\2\63\u00e0\3\2\2"+
		"\2\65\u00e2\3\2\2\2\67\u00e4\3\2\2\29\u00e7\3\2\2\2;\u00ea\3\2\2\2=\u00ec"+
		"\3\2\2\2?\u00ee\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G"+
		"\u00f9\3\2\2\2I\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u0100\3\2\2\2O\u0103\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u0109\3\2\2\2U\u010b\3\2\2\2W\u010e\3\2\2\2Y\u0111"+
		"\3\2\2\2[\u0113\3\2\2\2]\u011d\3\2\2\2_\u011f\3\2\2\2a\u0121\3\2\2\2c"+
		"\u0123\3\2\2\2e\u0126\3\2\2\2g\u0129\3\2\2\2im\5M\'\2jl\13\2\2\2kj\3\2"+
		"\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2\2np\3\2\2\2om\3\2\2\2pq\5\7\4\2q|\3\2"+
		"\2\2rv\5O(\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2"+
		"\2\2xv\3\2\2\2yz\5Q)\2z|\3\2\2\2{i\3\2\2\2{r\3\2\2\2|}\3\2\2\2}~\b\2\2"+
		"\2~\4\3\2\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085"+
		"\b\3\2\2\u0085\6\3\2\2\2\u0086\u0088\7\17\2\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\4\2\2\u008c\b\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2\u0092"+
		"\n\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7p\2\2"+
		"\u009a\f\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v"+
		"\2\2\u009e\16\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7n\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5\22"+
		"\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7x\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7f\2\2\u00ac\26\3\2\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7w\2\2"+
		"\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7"+
		"=\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7h\2\2\u00b8\34"+
		"\3\2\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb\36\3\2\2\2\u00bc"+
		"\u00bd\7*\2\2\u00bd \3\2\2\2\u00be\u00bf\7+\2\2\u00bf\"\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4$\3\2\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7k\2"+
		"\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7"+
		"h\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce(\3\2\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"*\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7n\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9,\3\2\2\2\u00da\u00db\7?\2\2\u00db"+
		".\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\60\3\2\2\2\u00de\u00df\7/\2\2\u00df"+
		"\62\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3"+
		"\66\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5\u00e6\7?\2\2\u00e68\3\2\2\2\u00e7"+
		"\u00e8\7#\2\2\u00e8\u00e9\7?\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb"+
		"<\3\2\2\2\u00ec\u00ed\7@\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef\u00f0"+
		"\7?\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\7?\2\2\u00f3B\3"+
		"\2\2\2\u00f4\u00f5\7#\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f8"+
		"\7(\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7~\2\2\u00fa\u00fb\7~\2\2\u00fbH\3"+
		"\2\2\2\u00fc\u00fd\7~\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7`\2\2\u00ffL\3\2"+
		"\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7\61\2\2\u0102N\3\2\2\2\u0103\u0104"+
		"\7\61\2\2\u0104\u0105\7,\2\2\u0105P\3\2\2\2\u0106\u0107\7,\2\2\u0107\u0108"+
		"\7\61\2\2\u0108R\3\2\2\2\u0109\u010a\7.\2\2\u010aT\3\2\2\2\u010b\u010c"+
		"\7>\2\2\u010c\u010d\7>\2\2\u010dV\3\2\2\2\u010e\u010f\7@\2\2\u010f\u0110"+
		"\7@\2\2\u0110X\3\2\2\2\u0111\u0112\7(\2\2\u0112Z\3\2\2\2\u0113\u0114\7"+
		"A\2\2\u0114\\\3\2\2\2\u0115\u011e\7\62\2\2\u0116\u011a\t\3\2\2\u0117\u0119"+
		"\t\4\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2"+
		"\2\2\u011d\u0116\3\2\2\2\u011e^\3\2\2\2\u011f\u0120\7<\2\2\u0120`\3\2"+
		"\2\2\u0121\u0122\7\'\2\2\u0122b\3\2\2\2\u0123\u0124\7/\2\2\u0124\u0125"+
		"\7/\2\2\u0125d\3\2\2\2\u0126\u0127\7-\2\2\u0127\u0128\7-\2\2\u0128f\3"+
		"\2\2\2\u0129\u012d\t\5\2\2\u012a\u012c\t\6\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012eh\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\13\2mv{\u0082\u0087\u011a\u011d\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}