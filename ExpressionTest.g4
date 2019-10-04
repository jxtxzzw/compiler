        grammar ExpressionTest;
        r: expr;
        expr: expr (ADD | SUB | MUL | DIV) expr # arithmetic
            | NUM # number
            ;
        NUM: INT;
        INT: [0-9]+;
        ADD: '+';
        SUB: '-';
        MUL: '*';
        DIV: '/';
        WS: [ \t\r\n]+ -> skip;