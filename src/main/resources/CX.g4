grammar CX;
r: program;
program: block;
block: LEFTBRACE declarations statements RIGHTBRACE;
declarations: (declaration declarations)?;
declaration: basetype IDENTIFIER;
statements: (statement statements)?;

statement
: SEMICOLON
| expression SEMICOLON
| IF LEFTPARENTHESIS expression RIGHTPARENTHESIS statement (ELSE statement)?
| LEFTBRACE statement* RIGHTBRACE
| WHILE LEFTPARENTHESIS expression RIGHTPARENTHESIS statement
| FOR LEFTPARENTHESIS expression? SEMICOLON expression? SEMICOLON expression? RIGHTPARENTHESIS statement
| basetype IDENTIFIER LEFTPARENTHESIS (VOID|basetype IDENTIFIER? (COMMA basetype IDENTIFIER?)*)? RIGHTPARENTHESIS (SEMICOLON|LEFTBRACE statement* RIGHTBRACE)
;

expression
: TRUE | FALSE | NUMBER
| variable ASSIGN expression
| variable
| (MINUS|NOT) expression|variable
| LEFTPARENTHESIS expression RIGHTPARENTHESIS
| expression (EQUAL|NOTEQUAL|GREATERTHAN|LESSTHAN|GREATERTHANOREQUAL|LESSTHANOREQUAL) expression
| expression (AND|OR) expression
| variable (PLUS PLUS|MINUS MINUS)
| expression (MUL|DIV) expression
| expression (PLUS|MINUS) expression
;

// TODO priority: *, / > +, -

variable
: IDENTIFIER
| basetype IDENTIFIER
;

basetype: INT | BOOLEAN;

WHITESPACE: (' '|'\t')+ -> skip;
NEWLINE: '\r'? '\n' -> skip;
COMMENT
: (BEGININLINECOMMENT .*? NEWLINE
| BEGINCOMMENT .*? ENDCOMMENT) -> skip
;

LEFTBRACE: '{';
RIGHTBRACE: '}';
IDENTIFIER: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
SEMICOLON: ';';
IF: 'if';
LEFTPARENTHESIS: '(';
RIGHTPARENTHESIS: ')';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';
NUMBER: '0' | [1-9][0-9]*;
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
INT: 'int';
BOOLEAN: 'bool';
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
VOID: 'void';




