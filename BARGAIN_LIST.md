1. Support Arithmetic Expression with more than 2 items
    + With right priority
    + Support `NEGATIVE` unary, with right priority
2. Support Assignment Expression, instead of Assignment Statement
3. Support Declaration
    + Support more than one variable, with `COMMA`
    + Support initialization
    + Can be done anywhere
4. Support Function
    + With or without params
    + With or without return value
    + Function scope
    + Function call
    + Recursively function call
5. Support Condition Statement
    + Single `if` statement can have no braces
    + Same as C-rule when handling trailing `else`
    + Support empty condition body
6. Support Comparison Expression
    + With right priority
7. Support Logic Expression
    + Support `NOT`, with right priority
8. Support Loop Statement
    + Support `repeat until`
    + Support `for`
    + Support `do while`
    + Support `while`
9. Support `MOD`
10. Support `ODD`
11. Support `XOR`
12. Support `int`, `real`, `bool`, `void`
13. Support `i++`, `++i`. Same as C-rule
14. Support Type Cast.
15. Support `exit`
16. Support `const`
    + Exception check
    + Constant variable must be initialized in declaration
17. Support array
    + Can be regarded as left value or right value
    + Index can be calculated from Expression
    + Same as C89 grammar: array size should be an constant integer
    + Does not support initializer list yet
    + Does not support boundary check yet
18. Ignore inline comment and comment
19. `Read` and `write`
    + Support `writeln`