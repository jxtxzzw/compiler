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
		WHITESPACE=1, NEWLINE=2, COMMENT=3, INT=4, BOOLEAN=5, LEFTBRACE=6, RIGHTBRACE=7, 
		VOID=8, RETURN=9, SEMICOLON=10, IF=11, LEFTPARENTHESIS=12, RIGHTPARENTHESIS=13, 
		ELSE=14, WHILE=15, FOR=16, TRUE=17, FALSE=18, ASSIGN=19, PLUS=20, MINUS=21, 
		MUL=22, DIV=23, EQUAL=24, NOTEQUAL=25, LESSTHAN=26, GREATERTHAN=27, LESSTHANOREQUAL=28, 
		GREATERTHANOREQUAL=29, NOT=30, AND=31, OR=32, BEGININLINECOMMENT=33, BEGINCOMMENT=34, 
		ENDCOMMENT=35, COMMA=36, NUMBER=37, IDENTIFIER=38;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LEFTBRACE) | (1L << VOID) | (1L << RETURN) | (1L << SEMICOLON) | (1L << IF) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
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
		public TerminalNode RETURN() { return getToken(CXParser.RETURN, 0); }
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(SEMICOLON);
				}
				break;
			case 2:
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
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(24);
					match(VOID);
					}
					break;
				case 2:
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
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LEFTBRACE) | (1L << VOID) | (1L << RETURN) | (1L << SEMICOLON) | (1L << IF) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(RETURN);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(54);
					expression(0);
					}
					break;
				case 2:
					{
					setState(55);
					match(VOID);
					}
					break;
				}
				setState(58);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				expression(0);
				setState(60);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(IF);
				setState(63);
				match(LEFTPARENTHESIS);
				setState(64);
				expression(0);
				setState(65);
				match(RIGHTPARENTHESIS);
				setState(66);
				statement();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(67);
					match(ELSE);
					setState(68);
					statement();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(LEFTBRACE);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LEFTBRACE) | (1L << VOID) | (1L << RETURN) | (1L << SEMICOLON) | (1L << IF) | (1L << LEFTPARENTHESIS) | (1L << WHILE) | (1L << FOR) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(72);
					statement();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(RIGHTBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(WHILE);
				setState(80);
				match(LEFTPARENTHESIS);
				setState(81);
				expression(0);
				setState(82);
				match(RIGHTPARENTHESIS);
				setState(83);
				statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				match(FOR);
				setState(86);
				match(LEFTPARENTHESIS);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(87);
					expression(0);
					}
				}

				setState(90);
				match(SEMICOLON);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(91);
					expression(0);
					}
				}

				setState(94);
				match(SEMICOLON);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << LEFTPARENTHESIS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << NOT) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(95);
					expression(0);
					}
				}

				setState(98);
				match(RIGHTPARENTHESIS);
				setState(99);
				statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CXParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CXParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(CXParser.NUMBER, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CXParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CXParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CXParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CXParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CXParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CXParser.COMMA, i);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(103);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(104);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(105);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(106);
				variable();
				setState(107);
				match(ASSIGN);
				setState(108);
				expression(11);
				}
				break;
			case 5:
				{
				setState(110);
				variable();
				}
				break;
			case 6:
				{
				setState(111);
				basetype();
				setState(112);
				match(IDENTIFIER);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						match(COMMA);
						setState(114);
						match(IDENTIFIER);
						setState(117);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(115);
							match(ASSIGN);
							setState(116);
							expression(0);
							}
							break;
						}
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 7:
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				expression(8);
				}
				break;
			case 8:
				{
				setState(126);
				variable();
				}
				break;
			case 9:
				{
				setState(127);
				match(LEFTPARENTHESIS);
				setState(128);
				expression(0);
				setState(129);
				match(RIGHTPARENTHESIS);
				}
				break;
			case 10:
				{
				setState(131);
				variable();
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(132);
					match(PLUS);
					setState(133);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(134);
					match(MINUS);
					setState(135);
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
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANOREQUAL) | (1L << GREATERTHANOREQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(142);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(150);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public BasetypeContext basetype() {
			return getRuleContext(BasetypeContext.class,0);
		}
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(IDENTIFIER);
				}
				break;
			case INT:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				basetype();
				setState(159);
				match(IDENTIFIER);
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

	public static class BasetypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CXParser.INT, 0); }
		public TerminalNode VOID() { return getToken(CXParser.VOID, 0); }
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
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VOID) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\7\3\22\n\3\f\3\16\3"+
		"\25\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\5\4#\n\4\7"+
		"\4%\n\4\f\4\16\4(\13\4\5\4*\n\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63"+
		"\13\4\3\4\5\4\66\n\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\5\4_\n\4\3\4\3\4\5\4c\n"+
		"\4\3\4\3\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5x\n\5\7\5z\n\5\f\5\16\5}\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\5\5\u008d\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009b\n\5\f\5\16\5\u009e\13\5\3\6\3\6"+
		"\3\6\3\6\5\6\u00a4\n\6\3\7\3\7\3\7\2\3\b\b\2\4\6\b\n\f\2\b\4\2\27\27 "+
		" \3\2\32\37\3\2!\"\3\2\30\31\3\2\26\27\4\2\6\6\n\n\2\u00c8\2\16\3\2\2"+
		"\2\4\23\3\2\2\2\6f\3\2\2\2\b\u008c\3\2\2\2\n\u00a3\3\2\2\2\f\u00a5\3\2"+
		"\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\22\5\6\4\2\21\20\3\2\2\2\22\25\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2\2\2\26g\7\f\2"+
		"\2\27\30\5\f\7\2\30\31\7(\2\2\31)\7\16\2\2\32*\7\n\2\2\33\35\5\f\7\2\34"+
		"\36\7(\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36&\3\2\2\2\37 \7&\2\2 \"\5\f\7"+
		"\2!#\7(\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\37\3\2\2\2%(\3\2\2\2&$\3"+
		"\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)\32\3\2\2\2)\33\3\2\2\2)*\3\2\2"+
		"\2*+\3\2\2\2+\65\7\17\2\2,\66\7\f\2\2-\61\7\b\2\2.\60\5\6\4\2/.\3\2\2"+
		"\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2"+
		"\64\66\7\t\2\2\65,\3\2\2\2\65-\3\2\2\2\66g\3\2\2\2\67:\7\13\2\28;\5\b"+
		"\5\29;\7\n\2\2:8\3\2\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<g\7\f\2\2=>\5\b"+
		"\5\2>?\7\f\2\2?g\3\2\2\2@A\7\r\2\2AB\7\16\2\2BC\5\b\5\2CD\7\17\2\2DG\5"+
		"\6\4\2EF\7\20\2\2FH\5\6\4\2GE\3\2\2\2GH\3\2\2\2Hg\3\2\2\2IM\7\b\2\2JL"+
		"\5\6\4\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2P"+
		"g\7\t\2\2QR\7\21\2\2RS\7\16\2\2ST\5\b\5\2TU\7\17\2\2UV\5\6\4\2Vg\3\2\2"+
		"\2WX\7\22\2\2XZ\7\16\2\2Y[\5\b\5\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7"+
		"\f\2\2]_\5\b\5\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`b\7\f\2\2ac\5\b\5\2ba\3"+
		"\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\17\2\2eg\5\6\4\2f\26\3\2\2\2f\27\3\2\2"+
		"\2f\67\3\2\2\2f=\3\2\2\2f@\3\2\2\2fI\3\2\2\2fQ\3\2\2\2fW\3\2\2\2g\7\3"+
		"\2\2\2hi\b\5\1\2i\u008d\7\23\2\2j\u008d\7\24\2\2k\u008d\7\'\2\2lm\5\n"+
		"\6\2mn\7\25\2\2no\5\b\5\ro\u008d\3\2\2\2p\u008d\5\n\6\2qr\5\f\7\2r{\7"+
		"(\2\2st\7&\2\2tw\7(\2\2uv\7\25\2\2vx\5\b\5\2wu\3\2\2\2wx\3\2\2\2xz\3\2"+
		"\2\2ys\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u008d\3\2\2\2}{\3\2\2\2"+
		"~\177\t\2\2\2\177\u008d\5\b\5\n\u0080\u008d\5\n\6\2\u0081\u0082\7\16\2"+
		"\2\u0082\u0083\5\b\5\2\u0083\u0084\7\17\2\2\u0084\u008d\3\2\2\2\u0085"+
		"\u008a\5\n\6\2\u0086\u0087\7\26\2\2\u0087\u008b\7\26\2\2\u0088\u0089\7"+
		"\27\2\2\u0089\u008b\7\27\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008ch\3\2\2\2\u008cj\3\2\2\2\u008ck\3\2\2\2\u008cl\3\2"+
		"\2\2\u008cp\3\2\2\2\u008cq\3\2\2\2\u008c~\3\2\2\2\u008c\u0080\3\2\2\2"+
		"\u008c\u0081\3\2\2\2\u008c\u0085\3\2\2\2\u008d\u009c\3\2\2\2\u008e\u008f"+
		"\f\7\2\2\u008f\u0090\t\3\2\2\u0090\u009b\5\b\5\b\u0091\u0092\f\6\2\2\u0092"+
		"\u0093\t\4\2\2\u0093\u009b\5\b\5\7\u0094\u0095\f\4\2\2\u0095\u0096\t\5"+
		"\2\2\u0096\u009b\5\b\5\5\u0097\u0098\f\3\2\2\u0098\u0099\t\6\2\2\u0099"+
		"\u009b\5\b\5\4\u009a\u008e\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0094\3\2"+
		"\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\t\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4\7(\2\2"+
		"\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7(\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\13\3\2\2\2\u00a5\u00a6\t\7\2\2\u00a6"+
		"\r\3\2\2\2\27\23\35\"&)\61\65:GMZ^bfw{\u008a\u008c\u009a\u009c\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}