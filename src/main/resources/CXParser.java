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
		WHITESPACE=1, NEWLINE=2, COMMENT=3, LEFTBRACE=4, RIGHTBRACE=5, IDENTIFIER=6, 
		SEMICOLON=7, IF=8, LEFTPARENTHESIS=9, RIGHTPARENTHESIS=10, ELSE=11, WHILE=12, 
		FOR=13, TRUE=14, FALSE=15, NUMBER=16, ASSIGN=17, PLUS=18, MINUS=19, MUL=20, 
		DIV=21, INT=22, BOOLEAN=23, EQUAL=24, NOTEQUAL=25, LESSTHAN=26, GREATERTHAN=27, 
		LESSTHANOREQUAL=28, GREATERTHANOREQUAL=29, NOT=30, AND=31, OR=32, BEGININLINECOMMENT=33, 
		BEGINCOMMENT=34, ENDCOMMENT=35, COMMA=36, VOID=37;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_variable = 4, RULE_basetype = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "statement", "expression", "variable", "basetype"
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
			setState(12);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTBRACE) | (1L << IDENTIFIER) | (1L << SEMICOLON) | (1L << IF) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << MINUS) | (1L << INT) | (1L << BOOLEAN) | (1L << NOT))) != 0)) {
				{
				{
				setState(14);
				statement();
				}
				}
				setState(19);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(CXParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CXParser.SEMICOLON, i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(CXParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(CXParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CXParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(CXParser.FOR, 0); }
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(SEMICOLON);
				}
				break;
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				basetype();
				setState(22);
				match(IDENTIFIER);
				setState(23);
				match(LEFTPARENTHESIS);
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(24);
					match(VOID);
					}
					break;
				case INT:
				case BOOLEAN:
					{
					setState(25);
					basetype();
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(26);
						match(IDENTIFIER);
						}
					}

					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(29);
						match(COMMA);
						setState(30);
						basetype();
						setState(32);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(31);
							match(IDENTIFIER);
							}
						}

						}
						}
						setState(38);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RIGHTPARENTHESIS:
					break;
				default:
					break;
				}
				setState(41);
				match(RIGHTPARENTHESIS);
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(42);
					match(SEMICOLON);
					}
					break;
				case LEFTBRACE:
					{
					setState(43);
					match(LEFTBRACE);
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTBRACE) | (1L << IDENTIFIER) | (1L << SEMICOLON) | (1L << IF) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << MINUS) | (1L << INT) | (1L << BOOLEAN) | (1L << NOT))) != 0)) {
						{
						{
						setState(44);
						statement();
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(50);
					match(RIGHTBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IDENTIFIER:
			case LEFTPARENTHESIS:
			case TRUE:
			case FALSE:
			case NUMBER:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				expression(0);
				setState(54);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(IF);
				setState(57);
				match(LEFTPARENTHESIS);
				setState(58);
				expression(0);
				setState(59);
				match(RIGHTPARENTHESIS);
				setState(60);
				statement();
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(61);
					match(ELSE);
					setState(62);
					statement();
					}
					break;
				}
				}
				break;
			case LEFTBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(LEFTBRACE);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFTBRACE) | (1L << IDENTIFIER) | (1L << SEMICOLON) | (1L << IF) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << MINUS) | (1L << INT) | (1L << BOOLEAN) | (1L << NOT))) != 0)) {
					{
					{
					setState(66);
					statement();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(RIGHTBRACE);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(WHILE);
				setState(74);
				match(LEFTPARENTHESIS);
				setState(75);
				expression(0);
				setState(76);
				match(RIGHTPARENTHESIS);
				setState(77);
				statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(FOR);
				setState(80);
				match(LEFTPARENTHESIS);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(81);
					expression(0);
					}
				}

				setState(84);
				match(SEMICOLON);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(85);
					expression(0);
					}
				}

				setState(88);
				match(SEMICOLON);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(89);
					expression(0);
					}
				}

				setState(92);
				match(RIGHTPARENTHESIS);
				setState(93);
				statement();
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
		public TerminalNode TRUE() { return getToken(CXParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CXParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(CXParser.NUMBER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CXParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CXParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CXParser.MINUS, i);
		}
		public TerminalNode NOT() { return getToken(CXParser.NOT, 0); }
		public TerminalNode LEFTPARENTHESIS() { return getToken(CXParser.LEFTPARENTHESIS, 0); }
		public TerminalNode RIGHTPARENTHESIS() { return getToken(CXParser.RIGHTPARENTHESIS, 0); }
		public List<TerminalNode> PLUS() { return getTokens(CXParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CXParser.PLUS, i);
		}
		public TerminalNode EQUAL() { return getToken(CXParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CXParser.NOTEQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(CXParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(CXParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANOREQUAL() { return getToken(CXParser.GREATERTHANOREQUAL, 0); }
		public TerminalNode LESSTHANOREQUAL() { return getToken(CXParser.LESSTHANOREQUAL, 0); }
		public TerminalNode AND() { return getToken(CXParser.AND, 0); }
		public TerminalNode OR() { return getToken(CXParser.OR, 0); }
		public TerminalNode MUL() { return getToken(CXParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CXParser.DIV, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(97);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(98);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(99);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(100);
				variable();
				setState(101);
				match(ASSIGN);
				setState(102);
				expression(10);
				}
				break;
			case 5:
				{
				setState(104);
				variable();
				}
				break;
			case 6:
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				expression(8);
				}
				break;
			case 7:
				{
				setState(107);
				variable();
				}
				break;
			case 8:
				{
				setState(108);
				match(LEFTPARENTHESIS);
				setState(109);
				expression(0);
				setState(110);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 9:
				{
				setState(112);
				variable();
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(113);
					match(PLUS);
					setState(114);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(115);
					match(MINUS);
					setState(116);
					match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(122);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANOREQUAL) | (1L << GREATERTHANOREQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CXParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CXListener ) ((CXListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IDENTIFIER);
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
		public TerminalNode BOOLEAN() { return getToken(CXParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 10, RULE_basetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOLEAN) ) {
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0091\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\7\3\22\n\3\f\3\16\3"+
		"\25\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\5\4#\n\4\7"+
		"\4%\n\4\f\4\16\4(\13\4\5\4*\n\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\5\4\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4"+
		"\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4U\n\4\3\4\3\4\5\4Y\n\4\3\4\3\4\5\4]\n\4\3\4\3\4\5\4a\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5x\n\5\5\5z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\3\6\3\6\3\7\3\7\3\7\2\3\b\b\2\4\6"+
		"\b\n\f\2\b\4\2\25\25  \3\2\32\37\3\2!\"\3\2\26\27\3\2\24\25\3\2\30\31"+
		"\2\u00aa\2\16\3\2\2\2\4\23\3\2\2\2\6`\3\2\2\2\by\3\2\2\2\n\u008c\3\2\2"+
		"\2\f\u008e\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\22\5\6\4\2\21\20\3\2"+
		"\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2"+
		"\2\2\26a\7\t\2\2\27\30\5\f\7\2\30\31\7\b\2\2\31)\7\13\2\2\32*\7\'\2\2"+
		"\33\35\5\f\7\2\34\36\7\b\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36&\3\2\2\2\37"+
		" \7&\2\2 \"\5\f\7\2!#\7\b\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\37\3\2"+
		"\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)\32\3\2\2\2)"+
		"\33\3\2\2\2)*\3\2\2\2*+\3\2\2\2+\65\7\f\2\2,\66\7\t\2\2-\61\7\6\2\2.\60"+
		"\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\61\3\2\2\2\64\66\7\7\2\2\65,\3\2\2\2\65-\3\2\2\2\66a\3\2\2\2\67"+
		"8\5\b\5\289\7\t\2\29a\3\2\2\2:;\7\n\2\2;<\7\13\2\2<=\5\b\5\2=>\7\f\2\2"+
		">A\5\6\4\2?@\7\r\2\2@B\5\6\4\2A?\3\2\2\2AB\3\2\2\2Ba\3\2\2\2CG\7\6\2\2"+
		"DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"Ja\7\7\2\2KL\7\16\2\2LM\7\13\2\2MN\5\b\5\2NO\7\f\2\2OP\5\6\4\2Pa\3\2\2"+
		"\2QR\7\17\2\2RT\7\13\2\2SU\5\b\5\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7\t"+
		"\2\2WY\5\b\5\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\t\2\2[]\5\b\5\2\\[\3"+
		"\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\f\2\2_a\5\6\4\2`\26\3\2\2\2`\27\3\2\2"+
		"\2`\67\3\2\2\2`:\3\2\2\2`C\3\2\2\2`K\3\2\2\2`Q\3\2\2\2a\7\3\2\2\2bc\b"+
		"\5\1\2cz\7\20\2\2dz\7\21\2\2ez\7\22\2\2fg\5\n\6\2gh\7\23\2\2hi\5\b\5\f"+
		"iz\3\2\2\2jz\5\n\6\2kl\t\2\2\2lz\5\b\5\nmz\5\n\6\2no\7\13\2\2op\5\b\5"+
		"\2pq\7\f\2\2qz\3\2\2\2rw\5\n\6\2st\7\24\2\2tx\7\24\2\2uv\7\25\2\2vx\7"+
		"\25\2\2ws\3\2\2\2wu\3\2\2\2xz\3\2\2\2yb\3\2\2\2yd\3\2\2\2ye\3\2\2\2yf"+
		"\3\2\2\2yj\3\2\2\2yk\3\2\2\2ym\3\2\2\2yn\3\2\2\2yr\3\2\2\2z\u0089\3\2"+
		"\2\2{|\f\7\2\2|}\t\3\2\2}\u0088\5\b\5\b~\177\f\6\2\2\177\u0080\t\4\2\2"+
		"\u0080\u0088\5\b\5\7\u0081\u0082\f\4\2\2\u0082\u0083\t\5\2\2\u0083\u0088"+
		"\5\b\5\5\u0084\u0085\f\3\2\2\u0085\u0086\t\6\2\2\u0086\u0088\5\b\5\4\u0087"+
		"{\3\2\2\2\u0087~\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0084\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\t\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008d\7\b\2\2\u008d\13\3\2\2\2\u008e\u008f"+
		"\t\7\2\2\u008f\r\3\2\2\2\23\23\35\"&)\61\65AGTX\\`wy\u0087\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}