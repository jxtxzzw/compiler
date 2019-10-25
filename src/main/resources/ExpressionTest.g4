        grammar ExpressionTest;
        r: expr;
        expr: expr (ADD | SUB | MUL | DIV) expr # arithmetic
            | NUM # number
            | X ASSIGN expr # assignment
            ;
        NUM: INT;
        INT: [0-9]+;
        ADD: '+';
        SUB: '-';
        MUL: '*';
        DIV: '/';
        X: 'x' | 'y'; // TODO: use left-value, x is for test
        ASSIGN: '='; // TODO: use = for test
        WS: [ \t\r\n]+ -> skip;
        // TODO: Arithematic expression priority, eg: *|/ > +|-