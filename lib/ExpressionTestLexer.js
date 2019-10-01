// Generated from ExpressionTest.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');



var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0002\n/\b\u0001\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007",
    "\u0004\b\t\b\u0004\t\t\t\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0005\u0003\u001a\n\u0003\u0003\u0004\u0006",
    "\u0004\u001d\n\u0004\r\u0004\u000e\u0004\u001e\u0003\u0005\u0006\u0005",
    "\"\n\u0005\r\u0005\u000e\u0005#\u0003\u0005\u0003\u0005\u0003\u0006",
    "\u0003\u0006\u0003\u0007\u0003\u0007\u0003\b\u0003\b\u0003\t\u0003\t",
    "\u0002\u0002\n\u0003\u0003\u0005\u0004\u0007\u0005\t\u0006\u000b\u0007",
    "\r\b\u000f\t\u0011\n\u0003\u0002\u0004\u0003\u00022;\u0004\u0002\u000b",
    "\u000b\"\"\u00023\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003",
    "\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\t\u0003",
    "\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\r\u0003",
    "\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003",
    "\u0002\u0002\u0002\u0003\u0013\u0003\u0002\u0002\u0002\u0005\u0019\u0003",
    "\u0002\u0002\u0002\u0007\u001c\u0003\u0002\u0002\u0002\t!\u0003\u0002",
    "\u0002\u0002\u000b\'\u0003\u0002\u0002\u0002\r)\u0003\u0002\u0002\u0002",
    "\u000f+\u0003\u0002\u0002\u0002\u0011-\u0003\u0002\u0002\u0002\u0013",
    "\u0014\u0005\u0007\u0004\u0002\u0014\u0004\u0003\u0002\u0002\u0002\u0015",
    "\u001a\u0005\u000b\u0006\u0002\u0016\u001a\u0005\r\u0007\u0002\u0017",
    "\u001a\u0005\u000f\b\u0002\u0018\u001a\u0005\u0011\t\u0002\u0019\u0015",
    "\u0003\u0002\u0002\u0002\u0019\u0016\u0003\u0002\u0002\u0002\u0019\u0017",
    "\u0003\u0002\u0002\u0002\u0019\u0018\u0003\u0002\u0002\u0002\u001a\u0006",
    "\u0003\u0002\u0002\u0002\u001b\u001d\t\u0002\u0002\u0002\u001c\u001b",
    "\u0003\u0002\u0002\u0002\u001d\u001e\u0003\u0002\u0002\u0002\u001e\u001c",
    "\u0003\u0002\u0002\u0002\u001e\u001f\u0003\u0002\u0002\u0002\u001f\b",
    "\u0003\u0002\u0002\u0002 \"\t\u0003\u0002\u0002! \u0003\u0002\u0002",
    "\u0002\"#\u0003\u0002\u0002\u0002#!\u0003\u0002\u0002\u0002#$\u0003",
    "\u0002\u0002\u0002$%\u0003\u0002\u0002\u0002%&\b\u0005\u0002\u0002&",
    "\n\u0003\u0002\u0002\u0002\'(\u0007,\u0002\u0002(\f\u0003\u0002\u0002",
    "\u0002)*\u00071\u0002\u0002*\u000e\u0003\u0002\u0002\u0002+,\u0007-",
    "\u0002\u0002,\u0010\u0003\u0002\u0002\u0002-.\u0007/\u0002\u0002.\u0012",
    "\u0003\u0002\u0002\u0002\u0006\u0002\u0019\u001e#\u0003\b\u0002\u0002"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

function ExpressionTestLexer(input) {
	antlr4.Lexer.call(this, input);
    this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    return this;
}

ExpressionTestLexer.prototype = Object.create(antlr4.Lexer.prototype);
ExpressionTestLexer.prototype.constructor = ExpressionTestLexer;

Object.defineProperty(ExpressionTestLexer.prototype, "atn", {
        get : function() {
                return atn;
        }
});

ExpressionTestLexer.EOF = antlr4.Token.EOF;
ExpressionTestLexer.NUM = 1;
ExpressionTestLexer.OP = 2;
ExpressionTestLexer.INT = 3;
ExpressionTestLexer.WS = 4;
ExpressionTestLexer.MUL = 5;
ExpressionTestLexer.DIV = 6;
ExpressionTestLexer.ADD = 7;
ExpressionTestLexer.SUB = 8;

ExpressionTestLexer.prototype.channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];

ExpressionTestLexer.prototype.modeNames = [ "DEFAULT_MODE" ];

ExpressionTestLexer.prototype.literalNames = [ null, null, null, null, null, 
                                               "'*'", "'/'", "'+'", "'-'" ];

ExpressionTestLexer.prototype.symbolicNames = [ null, "NUM", "OP", "INT", 
                                                "WS", "MUL", "DIV", "ADD", 
                                                "SUB" ];

ExpressionTestLexer.prototype.ruleNames = [ "NUM", "OP", "INT", "WS", "MUL", 
                                            "DIV", "ADD", "SUB" ];

ExpressionTestLexer.prototype.grammarFileName = "ExpressionTest.g4";



exports.ExpressionTestLexer = ExpressionTestLexer;

