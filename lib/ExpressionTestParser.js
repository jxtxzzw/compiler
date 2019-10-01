// Generated from ExpressionTest.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');
var ExpressionTestListener = require('./ExpressionTestListener').ExpressionTestListener;
var ExpressionTestVisitor = require('./ExpressionTestVisitor').ExpressionTestVisitor;

var grammarFileName = "ExpressionTest.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\n\u0014\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0003\u0002\u0003",
    "\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0007\u0003\u000f\n\u0003\f\u0003\u000e\u0003\u0012\u000b\u0003",
    "\u0003\u0003\u0002\u0003\u0004\u0004\u0002\u0004\u0002\u0002\u0002\u0012",
    "\u0002\u0006\u0003\u0002\u0002\u0002\u0004\b\u0003\u0002\u0002\u0002",
    "\u0006\u0007\u0005\u0004\u0003\u0002\u0007\u0003\u0003\u0002\u0002\u0002",
    "\b\t\b\u0003\u0001\u0002\t\n\u0007\u0003\u0002\u0002\n\u0010\u0003\u0002",
    "\u0002\u0002\u000b\f\f\u0004\u0002\u0002\f\r\u0007\u0004\u0002\u0002",
    "\r\u000f\u0005\u0004\u0003\u0005\u000e\u000b\u0003\u0002\u0002\u0002",
    "\u000f\u0012\u0003\u0002\u0002\u0002\u0010\u000e\u0003\u0002\u0002\u0002",
    "\u0010\u0011\u0003\u0002\u0002\u0002\u0011\u0005\u0003\u0002\u0002\u0002",
    "\u0012\u0010\u0003\u0002\u0002\u0002\u0003\u0010"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, null, null, null, null, "'*'", "'/'", "'+'", 
                     "'-'" ];

var symbolicNames = [ null, "NUM", "OP", "INT", "WS", "MUL", "DIV", "ADD", 
                      "SUB" ];

var ruleNames =  [ "r", "expr" ];

function ExpressionTestParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

ExpressionTestParser.prototype = Object.create(antlr4.Parser.prototype);
ExpressionTestParser.prototype.constructor = ExpressionTestParser;

Object.defineProperty(ExpressionTestParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

ExpressionTestParser.EOF = antlr4.Token.EOF;
ExpressionTestParser.NUM = 1;
ExpressionTestParser.OP = 2;
ExpressionTestParser.INT = 3;
ExpressionTestParser.WS = 4;
ExpressionTestParser.MUL = 5;
ExpressionTestParser.DIV = 6;
ExpressionTestParser.ADD = 7;
ExpressionTestParser.SUB = 8;

ExpressionTestParser.RULE_r = 0;
ExpressionTestParser.RULE_expr = 1;


function RContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionTestParser.RULE_r;
    return this;
}

RContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RContext.prototype.constructor = RContext;

RContext.prototype.expr = function() {
    return this.getTypedRuleContext(ExprContext,0);
};

RContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionTestListener ) {
        listener.enterR(this);
	}
};

RContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionTestListener ) {
        listener.exitR(this);
	}
};

RContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionTestVisitor ) {
        return visitor.visitR(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionTestParser.RContext = RContext;

ExpressionTestParser.prototype.r = function() {

    var localctx = new RContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, ExpressionTestParser.RULE_r);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 4;
        this.expr(0);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ExprContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionTestParser.RULE_expr;
    return this;
}

ExprContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExprContext.prototype.constructor = ExprContext;

ExprContext.prototype.NUM = function() {
    return this.getToken(ExpressionTestParser.NUM, 0);
};

ExprContext.prototype.expr = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExprContext);
    } else {
        return this.getTypedRuleContext(ExprContext,i);
    }
};

ExprContext.prototype.OP = function() {
    return this.getToken(ExpressionTestParser.OP, 0);
};

ExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionTestListener ) {
        listener.enterExpr(this);
	}
};

ExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionTestListener ) {
        listener.exitExpr(this);
	}
};

ExprContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionTestVisitor ) {
        return visitor.visitExpr(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ExpressionTestParser.prototype.expr = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new ExprContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 2;
    this.enterRecursionRule(localctx, 2, ExpressionTestParser.RULE_expr, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 7;
        this.match(ExpressionTestParser.NUM);
        this._ctx.stop = this._input.LT(-1);
        this.state = 14;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,0,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                localctx = new ExprContext(this, _parentctx, _parentState);
                this.pushNewRecursionContext(localctx, _startState, ExpressionTestParser.RULE_expr);
                this.state = 9;
                if (!( this.precpred(this._ctx, 2))) {
                    throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                }
                this.state = 10;
                this.match(ExpressionTestParser.OP);
                this.state = 11;
                this.expr(3); 
            }
            this.state = 16;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,0,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


ExpressionTestParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 1:
			return this.expr_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

ExpressionTestParser.prototype.expr_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.ExpressionTestParser = ExpressionTestParser;
