package resources; 
// Generated from src\main\resources\CX.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CXParser extends Parser {
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
		ODD=50, MINUSMINUS=51, PLUSPLUS=52, REPEAT=53, UNTIL=54, REAL=55, IDENTIFIER=56;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_statement = 2, RULE_compoundstatement = 3, 
		RULE_expressionstatement = 4, RULE_selectionstatement = 5, RULE_iterationstatement = 6, 
		RULE_expression = 7, RULE_assignmentexpression = 8, RULE_conditionalexpression = 9, 
		RULE_logicalorexpression = 10, RULE_logicalandexpression = 11, RULE_inclusiveorexpression = 12, 
		RULE_exclusiveorexpression = 13, RULE_andexpression = 14, RULE_equalityexpression = 15, 
		RULE_relationalexpression = 16, RULE_additiveexpression = 17, RULE_multiplicativeexpression = 18, 
		RULE_castexpression = 19, RULE_unaryexpression = 20, RULE_postfixexpression = 21, 
		RULE_primaryexpression = 22, RULE_constant = 23, RULE_basetype = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "statement", "compoundstatement", "expressionstatement", 
			"selectionstatement", "iterationstatement", "expression", "assignmentexpression", 
			"conditionalexpression", "logicalorexpression", "logicalandexpression", 
			"inclusiveorexpression", "exclusiveorexpression", "andexpression", "equalityexpression", 
			"relationalexpression", "additiveexpression", "multiplicativeexpression", 
			"castexpression", "unaryexpression", "postfixexpression", "primaryexpression", 
			"constant", "basetype"
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
			"'real'"
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
			"REPEAT", "UNTIL", "REAL", "IDENTIFIER"
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

	@Override
	public String getGrammarFileName() { return "CX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WRITELN) | (1L << INT) | (1L << BOOLEAN) | (1L << LEFTBRACE) | (1L << VOID) | (1L << RETURN) | (1L << SEMICOLON) | (1L << IF) | (1L << DO) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << REPEAT) | (1L << REAL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public List<BasetypeContext> basetype() {
			return getRuleContexts(BasetypeContext.class);
		}
		public BasetypeContext basetype(int i) {
			return getRuleContext(BasetypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CXParser.IDENTIFIER, i);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(CXParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(CXParser.RIGHTPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CXParser.SEMICOLON, 0); }
		public TerminalNode LEFTBRACE() { return getToken(CXParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(CXParser.RIGHTBRACE, 0); }
		public TerminalNode VOID() { return getToken(CXParser.VOID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CXParser.COMMA, i);
		}
		public TerminalNode RETURN() { return getToken(CXParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WRITE() { return getToken(CXParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(CXParser.WRITELN, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(CXParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CXParser.ASSIGN, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				compoundstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				selectionstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				iterationstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				basetype();
				setState(63);
				match(IDENTIFIER);
				setState(64);
				match(LEFTPARENTHESIS);
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(65);
					match(VOID);
					}
					break;
				case 2:
					{
					setState(66);
					basetype();
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(67);
						match(IDENTIFIER);
						}
					}

					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(70);
						match(COMMA);
						setState(71);
						basetype();
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(72);
							match(IDENTIFIER);
							}
						}

						}
						}
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(82);
				match(RIGHTPARENTHESIS);
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(83);
					match(SEMICOLON);
					}
					break;
				case LEFTBRACE:
					{
					setState(84);
					match(LEFTBRACE);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WRITELN) | (1L << INT) | (1L << BOOLEAN) | (1L << LEFTBRACE) | (1L << VOID) | (1L << RETURN) | (1L << SEMICOLON) | (1L << IF) | (1L << DO) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << REPEAT) | (1L << REAL) | (1L << IDENTIFIER))) != 0)) {
						{
						{
						setState(85);
						statement();
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(91);
					match(RIGHTBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(RETURN);
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFTPARENTHESIS:
				case TRUE:
				case FALSE:
				case MINUS:
				case NOT:
				case INTEGERNUMBER:
				case REALNUMBER:
				case ODD:
				case MINUSMINUS:
				case PLUSPLUS:
				case IDENTIFIER:
					{
					setState(95);
					expression();
					}
					break;
				case VOID:
					{
					setState(96);
					match(VOID);
					}
					break;
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(99);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(WRITE);
				setState(101);
				expression();
				setState(102);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				match(WRITELN);
				setState(105);
				expression();
				setState(106);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(108);
				basetype();
				setState(109);
				match(IDENTIFIER);
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(110);
						match(ASSIGN);
						setState(111);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(114);
						match(COMMA);
						setState(115);
						match(IDENTIFIER);
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(116);
							match(ASSIGN);
							setState(117);
							expression();
							}
						}

						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(127);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(CXParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(CXParser.RIGHTBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LEFTBRACE);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << WRITELN) | (1L << INT) | (1L << BOOLEAN) | (1L << LEFTBRACE) | (1L << VOID) | (1L << RETURN) | (1L << SEMICOLON) | (1L << IF) | (1L << DO) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << REPEAT) | (1L << REAL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CXParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(142);
				expression();
				}
			}

			setState(145);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CXParser.IF, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(CXParser.LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(CXParser.RIGHTPARENTHESIS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CXParser.ELSE, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectionstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			match(LEFTPARENTHESIS);
			setState(149);
			expression();
			setState(150);
			match(RIGHTPARENTHESIS);
			setState(151);
			statement();
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(152);
				match(ELSE);
				setState(153);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CXParser.WHILE, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(CXParser.LEFTPARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(CXParser.RIGHTPARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CXParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CXParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CXParser.SEMICOLON, i);
		}
		public TerminalNode DO() { return getToken(CXParser.DO, 0); }
		public TerminalNode REPEAT() { return getToken(CXParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(CXParser.UNTIL, 0); }
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iterationstatement);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(WHILE);
				setState(157);
				match(LEFTPARENTHESIS);
				setState(158);
				expression();
				setState(159);
				match(RIGHTPARENTHESIS);
				setState(160);
				statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(FOR);
				setState(163);
				match(LEFTPARENTHESIS);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(164);
					expression();
					}
				}

				setState(167);
				match(SEMICOLON);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(168);
					expression();
					}
				}

				setState(171);
				match(SEMICOLON);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(172);
					expression();
					}
				}

				setState(175);
				match(RIGHTPARENTHESIS);
				setState(176);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(DO);
				setState(178);
				statement();
				setState(179);
				match(WHILE);
				setState(180);
				match(LEFTPARENTHESIS);
				setState(181);
				expression();
				setState(182);
				match(RIGHTPARENTHESIS);
				setState(183);
				match(SEMICOLON);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(REPEAT);
				setState(186);
				statement();
				setState(187);
				match(UNTIL);
				setState(188);
				match(LEFTPARENTHESIS);
				setState(189);
				expression();
				setState(190);
				match(RIGHTPARENTHESIS);
				setState(191);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			assignmentexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CXParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(CXParser.ASSIGN, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentexpression);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(IDENTIFIER);
				setState(199);
				match(ASSIGN);
				setState(200);
				assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode QUESTIONMARK() { return getToken(CXParser.QUESTIONMARK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CXParser.COLON, 0); }
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionalexpression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				logicalorexpression(0);
				setState(205);
				match(QUESTIONMARK);
				setState(206);
				expression();
				setState(207);
				match(COLON);
				setState(208);
				conditionalexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode LOGICALOR() { return getToken(CXParser.LOGICALOR, 0); }
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(213);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(215);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(216);
					match(LOGICALOR);
					setState(217);
					logicalandexpression(0);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public TerminalNode LOGICALAND() { return getToken(CXParser.LOGICALAND, 0); }
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(226);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(227);
					match(LOGICALAND);
					setState(228);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public TerminalNode IOR() { return getToken(CXParser.IOR, 0); }
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(237);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(238);
					match(IOR);
					setState(239);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public TerminalNode XOR() { return getToken(CXParser.XOR, 0); }
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(248);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(249);
					match(XOR);
					setState(250);
					andexpression(0);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CXParser.AND, 0); }
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(259);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(260);
					match(AND);
					setState(261);
					equalityexpression(0);
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CXParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CXParser.NOTEQUAL, 0); }
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						match(EQUAL);
						setState(272);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(273);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(274);
						match(NOTEQUAL);
						setState(275);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(CXParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(CXParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANOREQUAL() { return getToken(CXParser.LESSTHANOREQUAL, 0); }
		public TerminalNode GREATERTHANOREQUAL() { return getToken(CXParser.GREATERTHANOREQUAL, 0); }
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285);
						match(LESSTHAN);
						setState(286);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(287);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(288);
						match(GREATERTHAN);
						setState(289);
						additiveexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(290);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(291);
						match(LESSTHANOREQUAL);
						setState(292);
						additiveexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(293);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(294);
						match(GREATERTHANOREQUAL);
						setState(295);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CXParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CXParser.MINUS, 0); }
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(304);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(305);
						match(PLUS);
						setState(306);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(307);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(308);
						match(MINUS);
						setState(309);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CXParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CXParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CXParser.MOD, 0); }
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(316);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319);
						match(MUL);
						setState(320);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(DIV);
						setState(323);
						castexpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						match(MOD);
						setState(326);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public TerminalNode LEFTPARENTHESIS() { return getToken(CXParser.LEFTPARENTHESIS, 0); }
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(CXParser.RIGHTPARENTHESIS, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_castexpression);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(LEFTPARENTHESIS);
				setState(333);
				basetype();
				setState(334);
				match(RIGHTPARENTHESIS);
				setState(335);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				unaryexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(CXParser.PLUSPLUS, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(CXParser.MINUSMINUS, 0); }
		public TerminalNode NOT() { return getToken(CXParser.NOT, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode ODD() { return getToken(CXParser.ODD, 0); }
		public TerminalNode MINUS() { return getToken(CXParser.MINUS, 0); }
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryexpression);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPARENTHESIS:
			case TRUE:
			case FALSE:
			case INTEGERNUMBER:
			case REALNUMBER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				postfixexpression(0);
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(PLUSPLUS);
				setState(342);
				unaryexpression();
				}
				break;
			case MINUSMINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(MINUSMINUS);
				setState(344);
				unaryexpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(NOT);
				setState(346);
				castexpression();
				}
				break;
			case ODD:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				match(ODD);
				setState(348);
				castexpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				match(MINUS);
				setState(350);
				castexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(CXParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(CXParser.MINUSMINUS, 0); }
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_postfixexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354);
			primaryexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(356);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(357);
						match(PLUSPLUS);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(358);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(359);
						match(MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CXParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LEFTPARENTHESIS() { return getToken(CXParser.LEFTPARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHTPARENTHESIS() { return getToken(CXParser.RIGHTPARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CXParser.COMMA, i);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primaryexpression);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(LEFTPARENTHESIS);
				setState(368);
				expression();
				setState(369);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(IDENTIFIER);
				setState(372);
				match(LEFTPARENTHESIS);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << INTEGERNUMBER) | (1L << REALNUMBER) | (1L << ODD) | (1L << MINUSMINUS) | (1L << PLUSPLUS) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(373);
					expression();
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(374);
						match(COMMA);
						setState(375);
						expression();
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(383);
				match(RIGHTPARENTHESIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CXParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CXParser.FALSE, 0); }
		public TerminalNode INTEGERNUMBER() { return getToken(CXParser.INTEGERNUMBER, 0); }
		public TerminalNode REALNUMBER() { return getToken(CXParser.REALNUMBER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INTEGERNUMBER) | (1L << REALNUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CXParser.INT, 0); }
		public TerminalNode VOID() { return getToken(CXParser.VOID, 0); }
		public TerminalNode BOOLEAN() { return getToken(CXParser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(CXParser.REAL, 0); }
		public BasetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterBasetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitBasetype(this);
		}
	}

	public final BasetypeContext basetype() throws RecognitionException {
		BasetypeContext _localctx = new BasetypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_basetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << VOID) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 11:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 12:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 13:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 14:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 15:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 16:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 17:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 18:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 21:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\5\4L\n\4\7\4N\n\4\f\4\16\4Q\13\4"+
		"\5\4S\n\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\5\4_\n\4\3\4\3"+
		"\4\3\4\5\4d\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4s\n\4\3\4\3\4\3\4\3\4\5\4y\n\4\7\4{\n\4\f\4\16\4~\13\4\5\4\u0080\n\4"+
		"\3\4\5\4\u0083\n\4\3\4\5\4\u0086\n\4\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d"+
		"\13\5\3\5\3\5\3\6\5\6\u0092\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u009d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a8\n\b\3\b\3\b"+
		"\5\b\u00ac\n\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c4\n\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\n\u00cc\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d5\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00dd\n\f\f\f\16\f\u00e0\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00e8\n\r\f\r\16\r\u00eb\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00f3\n\16\f\16\16\16\u00f6\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00fe\n\17\f\17\16\17\u0101\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0109\n\20\f\20\16\20\u010c\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0117\n\21\f\21\16\21\u011a\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u012b\n\22\f\22\16\22\u012e\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u0139\n\23\f\23\16\23\u013c\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u014a\n\24\f\24\16\24\u014d"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0155\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0162\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u016b\n\27\f\27\16\27\u016e\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u017b\n\30\f\30\16"+
		"\30\u017e\13\30\5\30\u0180\n\30\3\30\5\30\u0183\n\30\3\31\3\31\3\32\3"+
		"\32\3\32\2\f\26\30\32\34\36 \"$&,\33\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\2\4\4\2\26\27\60\61\5\2\b\t\f\f99\2\u01af\2\64\3"+
		"\2\2\2\49\3\2\2\2\6\u0085\3\2\2\2\b\u0087\3\2\2\2\n\u0091\3\2\2\2\f\u0095"+
		"\3\2\2\2\16\u00c3\3\2\2\2\20\u00c5\3\2\2\2\22\u00cb\3\2\2\2\24\u00d4\3"+
		"\2\2\2\26\u00d6\3\2\2\2\30\u00e1\3\2\2\2\32\u00ec\3\2\2\2\34\u00f7\3\2"+
		"\2\2\36\u0102\3\2\2\2 \u010d\3\2\2\2\"\u011b\3\2\2\2$\u012f\3\2\2\2&\u013d"+
		"\3\2\2\2(\u0154\3\2\2\2*\u0161\3\2\2\2,\u0163\3\2\2\2.\u0182\3\2\2\2\60"+
		"\u0184\3\2\2\2\62\u0186\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\668\5\6\4\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;9\3\2\2\2<\u0086"+
		"\5\n\6\2=\u0086\5\b\5\2>\u0086\5\f\7\2?\u0086\5\16\b\2@A\5\62\32\2AB\7"+
		":\2\2BR\7\21\2\2CS\7\f\2\2DF\5\62\32\2EG\7:\2\2FE\3\2\2\2FG\3\2\2\2GO"+
		"\3\2\2\2HI\7+\2\2IK\5\62\32\2JL\7:\2\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2M"+
		"H\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RC\3\2\2\2"+
		"RD\3\2\2\2RS\3\2\2\2ST\3\2\2\2T^\7\22\2\2U_\7\16\2\2VZ\7\n\2\2WY\5\6\4"+
		"\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]_\7\13"+
		"\2\2^U\3\2\2\2^V\3\2\2\2_\u0086\3\2\2\2`c\7\r\2\2ad\5\20\t\2bd\7\f\2\2"+
		"ca\3\2\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2e\u0086\7\16\2\2fg\7\6\2\2gh\5"+
		"\20\t\2hi\7\16\2\2i\u0086\3\2\2\2jk\7\7\2\2kl\5\20\t\2lm\7\16\2\2m\u0086"+
		"\3\2\2\2no\5\62\32\2o\177\7:\2\2pq\7\30\2\2qs\5\20\t\2rp\3\2\2\2rs\3\2"+
		"\2\2s\u0080\3\2\2\2tu\7+\2\2ux\7:\2\2vw\7\30\2\2wy\5\20\t\2xv\3\2\2\2"+
		"xy\3\2\2\2y{\3\2\2\2zt\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3"+
		"\2\2\2~|\3\2\2\2\177r\3\2\2\2\177|\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083"+
		"\7\16\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0086\7\16\2\2\u0085<\3\2\2\2\u0085=\3\2\2\2\u0085>\3\2\2\2\u0085"+
		"?\3\2\2\2\u0085@\3\2\2\2\u0085`\3\2\2\2\u0085f\3\2\2\2\u0085j\3\2\2\2"+
		"\u0085n\3\2\2\2\u0085\u0084\3\2\2\2\u0086\7\3\2\2\2\u0087\u008b\7\n\2"+
		"\2\u0088\u008a\5\6\4\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\13\2\2\u008f\t\3\2\2\2\u0090\u0092\5\20\t\2\u0091\u0090\3\2\2"+
		"\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\16\2\2\u0094"+
		"\13\3\2\2\2\u0095\u0096\7\17\2\2\u0096\u0097\7\21\2\2\u0097\u0098\5\20"+
		"\t\2\u0098\u0099\7\22\2\2\u0099\u009c\5\6\4\2\u009a\u009b\7\23\2\2\u009b"+
		"\u009d\5\6\4\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2"+
		"\u009e\u009f\7\24\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\5\20\t\2\u00a1"+
		"\u00a2\7\22\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00c4\3\2\2\2\u00a4\u00a5\7"+
		"\25\2\2\u00a5\u00a7\7\21\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\16\2\2\u00aa\u00ac"+
		"\5\20\t\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00af\7\16\2\2\u00ae\u00b0\5\20\t\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00c4\5\6\4\2"+
		"\u00b3\u00b4\7\20\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7"+
		"\7\21\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\7\16\2"+
		"\2\u00ba\u00c4\3\2\2\2\u00bb\u00bc\7\67\2\2\u00bc\u00bd\5\6\4\2\u00bd"+
		"\u00be\78\2\2\u00be\u00bf\7\21\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7"+
		"\22\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c4\3\2\2\2\u00c3\u009e\3\2\2\2\u00c3"+
		"\u00a4\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c4\17\3\2\2"+
		"\2\u00c5\u00c6\5\22\n\2\u00c6\21\3\2\2\2\u00c7\u00cc\5\24\13\2\u00c8\u00c9"+
		"\7:\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cc\5\22\n\2\u00cb\u00c7\3\2\2\2"+
		"\u00cb\u00c8\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00d5\5\26\f\2\u00ce\u00cf"+
		"\5\26\f\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d2\7\62\2\2"+
		"\u00d2\u00d3\5\24\13\2\u00d3\u00d5\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce"+
		"\3\2\2\2\u00d5\25\3\2\2\2\u00d6\u00d7\b\f\1\2\u00d7\u00d8\5\30\r\2\u00d8"+
		"\u00de\3\2\2\2\u00d9\u00da\f\3\2\2\u00da\u00db\7%\2\2\u00db\u00dd\5\30"+
		"\r\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\r\1"+
		"\2\u00e2\u00e3\5\32\16\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5\f\3\2\2\u00e5"+
		"\u00e6\7$\2\2\u00e6\u00e8\5\32\16\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\31\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\b\16\1\2\u00ed\u00ee\5\34\17\2\u00ee\u00f4"+
		"\3\2\2\2\u00ef\u00f0\f\3\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f3\5\34\17\2"+
		"\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\33\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\17\1\2\u00f8"+
		"\u00f9\5\36\20\2\u00f9\u00ff\3\2\2\2\u00fa\u00fb\f\3\2\2\u00fb\u00fc\7"+
		"\'\2\2\u00fc\u00fe\5\36\20\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\35\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102\u0103\b\20\1\2\u0103\u0104\5 \21\2\u0104\u010a\3\2\2\2\u0105"+
		"\u0106\f\3\2\2\u0106\u0107\7.\2\2\u0107\u0109\5 \21\2\u0108\u0105\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\37\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\b\21\1\2\u010e\u010f\5\"\22"+
		"\2\u010f\u0118\3\2\2\2\u0110\u0111\f\4\2\2\u0111\u0112\7\35\2\2\u0112"+
		"\u0117\5\"\22\2\u0113\u0114\f\3\2\2\u0114\u0115\7\36\2\2\u0115\u0117\5"+
		"\"\22\2\u0116\u0110\3\2\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119!\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u011c\b\22\1\2\u011c\u011d\5$\23\2\u011d\u012c\3\2\2\2\u011e\u011f"+
		"\f\6\2\2\u011f\u0120\7\37\2\2\u0120\u012b\5$\23\2\u0121\u0122\f\5\2\2"+
		"\u0122\u0123\7 \2\2\u0123\u012b\5$\23\2\u0124\u0125\f\4\2\2\u0125\u0126"+
		"\7!\2\2\u0126\u012b\5$\23\2\u0127\u0128\f\3\2\2\u0128\u0129\7\"\2\2\u0129"+
		"\u012b\5$\23\2\u012a\u011e\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0124\3\2"+
		"\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d#\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\b\23\1\2"+
		"\u0130\u0131\5&\24\2\u0131\u013a\3\2\2\2\u0132\u0133\f\4\2\2\u0133\u0134"+
		"\7\31\2\2\u0134\u0139\5&\24\2\u0135\u0136\f\3\2\2\u0136\u0137\7\32\2\2"+
		"\u0137\u0139\5&\24\2\u0138\u0132\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b%\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\b\24\1\2\u013e\u013f\5(\25\2\u013f\u014b\3"+
		"\2\2\2\u0140\u0141\f\5\2\2\u0141\u0142\7\33\2\2\u0142\u014a\5(\25\2\u0143"+
		"\u0144\f\4\2\2\u0144\u0145\7\34\2\2\u0145\u014a\5(\25\2\u0146\u0147\f"+
		"\3\2\2\u0147\u0148\7\63\2\2\u0148\u014a\5(\25\2\u0149\u0140\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\'\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f"+
		"\7\21\2\2\u014f\u0150\5\62\32\2\u0150\u0151\7\22\2\2\u0151\u0152\5(\25"+
		"\2\u0152\u0155\3\2\2\2\u0153\u0155\5*\26\2\u0154\u014e\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155)\3\2\2\2\u0156\u0162\5,\27\2\u0157\u0158\7\66\2\2\u0158"+
		"\u0162\5*\26\2\u0159\u015a\7\65\2\2\u015a\u0162\5*\26\2\u015b\u015c\7"+
		"#\2\2\u015c\u0162\5(\25\2\u015d\u015e\7\64\2\2\u015e\u0162\5(\25\2\u015f"+
		"\u0160\7\32\2\2\u0160\u0162\5(\25\2\u0161\u0156\3\2\2\2\u0161\u0157\3"+
		"\2\2\2\u0161\u0159\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015d\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162+\3\2\2\2\u0163\u0164\b\27\1\2\u0164\u0165\5.\30\2"+
		"\u0165\u016c\3\2\2\2\u0166\u0167\f\4\2\2\u0167\u016b\7\66\2\2\u0168\u0169"+
		"\f\3\2\2\u0169\u016b\7\65\2\2\u016a\u0166\3\2\2\2\u016a\u0168\3\2\2\2"+
		"\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d-\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016f\u0183\7:\2\2\u0170\u0183\5\60\31\2\u0171"+
		"\u0172\7\21\2\2\u0172\u0173\5\20\t\2\u0173\u0174\7\22\2\2\u0174\u0183"+
		"\3\2\2\2\u0175\u0176\7:\2\2\u0176\u017f\7\21\2\2\u0177\u017c\5\20\t\2"+
		"\u0178\u0179\7+\2\2\u0179\u017b\5\20\t\2\u017a\u0178\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\7\22\2\2\u0182\u016f\3\2\2\2\u0182\u0170\3\2\2\2\u0182"+
		"\u0171\3\2\2\2\u0182\u0175\3\2\2\2\u0183/\3\2\2\2\u0184\u0185\t\2\2\2"+
		"\u0185\61\3\2\2\2\u0186\u0187\t\3\2\2\u0187\63\3\2\2\2-9FKORZ^crx|\177"+
		"\u0082\u0085\u008b\u0091\u009c\u00a7\u00ab\u00af\u00c3\u00cb\u00d4\u00de"+
		"\u00e9\u00f4\u00ff\u010a\u0116\u0118\u012a\u012c\u0138\u013a\u0149\u014b"+
		"\u0154\u0161\u016a\u016c\u017c\u017f\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}