        grammar ExpressionTest;
        r: expr;
        expr: expr op expr # arithmetic
            | NUM # number
            ;
        op: ADD | SUB | MUL | DIV;
        NUM: INT;
        INT: [0-9]+;
        ADD: '+';
        SUB: '-';
        MUL: '*';
        DIV: '/';
        WS: [ \t\r\n]+ -> skip;