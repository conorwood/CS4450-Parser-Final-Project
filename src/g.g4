grammar g;

// Arithmetic operations rule, allowing parentheses and following order of operations (PEMDAS)
arithmetic_operations : '(' arithmetic_operations ')'
                      | arithmetic_operations (MULTIPLY|DIVIDE|MOD) arithmetic_operations
                      | arithmetic_operations (PLUS|MINUS) arithmetic_operations
                      | NUM
                      ;

NUM : [-]?[0-9]*[.]*[0-9]+ ; // Define token INT as one or more digits
addition_operator : INT PLUS INT;
STRING : '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
INT : [0-9]+;

WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
FLOAT : INT+ '.' INT*;
BOOL : 'TRUE' | 'FALSE';

assign_operator: VAR_NAME ASSIGN (VAR_NAME | INT | STRING | FLOAT | BOOL);

plus_equal_operator: (VAR_NAME | INT) PLUS_EQUAL (VAR_NAME | INT);

minus_equal_operator: (VAR_NAME | INT) MINUS_EQUAL_EQUAL (VAR_NAME | INT);

multi_equal_operator: (VAR_NAME | INT) MULTI_EQUAL (VAR_NAME | INT);
/* Arithmetic Operators */
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

/* Assignment Operators */
ASSIGN : '=';
PLUS_EQUAL : '+=';
MINUS_EQUAL : '-=';
MULTI_EQUAL : '*=';
EQUAL_EQUAL : '==';
DIVIDE_EQUAL : '/=';
MOD_EQUAL : '%=';

/* Variable Names */
VAR_NAME: [a-zA-Z_] [a-zA-Z_0-9]*;
