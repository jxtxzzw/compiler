/**
 * Define a grammar called Calculator
 */
grammar ExpressionTest;
// 程序起始规则，语法分析的起点
r: expr;
// #开头的标签。如果备选分支上没有标签，ANTLR 就只为每条规则生成一个方法；
expr : expr op expr # Calc
    | NUM # number
    ;
NUM : INT;
op : MUL | DIV | ADD | SUB;
INT : [0-9]+;
WS : [ \t\r\n]+ -> skip;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;