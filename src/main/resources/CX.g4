grammar CX;
r: program;
program: statement*;

statement
: SEMICOLON
| basetype IDENTIFIER LEFTPARENTHESIS (VOID|basetype IDENTIFIER? (COMMA basetype IDENTIFIER?)*)? RIGHTPARENTHESIS (SEMICOLON|LEFTBRACE statement* RIGHTBRACE)
| RETURN (expression|VOID)? SEMICOLON
| expression SEMICOLON
| IF LEFTPARENTHESIS expression RIGHTPARENTHESIS statement (ELSE statement)?
| LEFTBRACE statement* RIGHTBRACE
| WHILE LEFTPARENTHESIS expression RIGHTPARENTHESIS statement
| FOR LEFTPARENTHESIS expression? SEMICOLON expression? SEMICOLON expression? RIGHTPARENTHESIS statement
;
// TODO break and continue

expression
: TRUE | FALSE | NUMBER
| variable ASSIGN expression
| variable
| basetype IDENTIFIER (COMMA IDENTIFIER(ASSIGN expression)?)*
| (MINUS|NOT) expression|variable
| LEFTPARENTHESIS expression RIGHTPARENTHESIS
| expression (EQUAL|NOTEQUAL|GREATERTHAN|LESSTHAN|GREATERTHANOREQUAL|LESSTHANOREQUAL) expression
| expression (AND|OR) expression
| variable (PLUS PLUS|MINUS MINUS)
| expression (MUL|DIV) expression
| expression (PLUS|MINUS) expression
;
// TODO function call expression

// TODO priority: *, / > +, -

variable
: IDENTIFIER
| basetype IDENTIFIER
;

basetype: INT | VOID;

WHITESPACE: (' '|'\t')+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
COMMENT
: (BEGININLINECOMMENT .*? NEWLINE
| BEGINCOMMENT .*? ENDCOMMENT) -> skip
;

INT: 'int';
BOOLEAN: 'bool';
LEFTBRACE: '{';
RIGHTBRACE: '}';
VOID: 'void';
RETURN: 'return';
SEMICOLON: ';';
IF: 'if';
LEFTPARENTHESIS: '(';
RIGHTPARENTHESIS: ')';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EQUAL: '==';
NOTEQUAL: '!=';
LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANOREQUAL: '<=';
GREATERTHANOREQUAL: '>=';
NOT: '!';
AND: '&&';
OR: '||';
BEGININLINECOMMENT: '//';
BEGINCOMMENT: '/*';
ENDCOMMENT: '*/';
COMMA: ',';
NUMBER: '0' | [1-9][0-9]*;
IDENTIFIER: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
