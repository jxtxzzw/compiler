// Generated from ExpressionTest.g4 by ANTLR 4.7.2
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by ExpressionTestParser.

function ExpressionTestVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

ExpressionTestVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
ExpressionTestVisitor.prototype.constructor = ExpressionTestVisitor;

// Visit a parse tree produced by ExpressionTestParser#r.
ExpressionTestVisitor.prototype.visitR = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionTestParser#expr.
ExpressionTestVisitor.prototype.visitExpr = function(ctx) {
  return this.visitChildren(ctx);
};



exports.ExpressionTestVisitor = ExpressionTestVisitor;