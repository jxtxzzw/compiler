var antlr4 = require('antlr4');
const {ExpressionTestVisitor} = require("./ExpressionTestVisitor");
var ExpressionTestLexer = require('./ExpressionTestLexer').ExpressionTestLexer;
var ExpressionTestParser = require('./ExpressionTestParser').ExpressionTestParser;

function aa(input) {
    var chars = new antlr4.InputStream(input);
    var lexer = new ExpressionTestLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new ExpressionTestParser(tokens);
    parser.buildParseTrees = true;
    var tree = parser.r();

    var v = new ExpressionTestVisitor();
    v.visitR = function (ctx) {
        console.log("123");
    }
    v.visitExpr = function (ctx) {
        console.log("456");
    }
    var r = tree.accept(v);
    console.log(r);
}

rrr = aa(process.argv[2])
