grammar g;

// Arithmetic operations rule, allowing parentheses and following order of operations (PEMDAS)
arithmetic_operations : '(' arithmetic_operations ')'
                      | arithmetic_operations (MULTIPLY|DIVIDE|MOD) arithmetic_operations
                      | arithmetic_operations (PLUS|MINUS) arithmetic_operations
                      | NUM
                      | VAR_NAME
                      ;

WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
TAB : '   '; // tab is 3 spaces
NUM : [-]?[0-9]*[.]*[0-9]+ ; // Define token INT as one or more digits
INT : [0-9]+;
FLOAT : INT+ '.' INT*;
BOOL : 'TRUE' | 'FALSE';
STRING : '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;

/** Assignment Operations Rule:
    Allows for variables to be assigned to other variables [i.e. var1 += var2],
        an arithmetic expression [i.e. var = (4+4)],
        or a data type [i.e. var = 2.1 | var = "Hello World"

*/
assignment_operations : '(' (assignment_operations | arithmetic_operations) ')'
                      | assignment_operations ASSIGN assignment_operations
                      | assignment_operations (PLUS_EQUAL | MINUS_EQUAL | MULTI_EQUAL | DIVIDE_EQUAL | MOD_EQUAL) assignment_operations
                      | VAR_NAME
                      | FLOAT
                      | INT
                      | NUM
                      | STRING
                      ;


conditional_statements :
                       | conditional_statements (EQUAL_EQUAL | DOESNOT_EQUAL) conditional_statements
                       | conditional_statements (LESS_THAN | LESS_THAN_EQUAL) conditional_statements
                       | conditional_statements (GREATER_THAN | GREATER_THAN_EQUAL) conditional_statements
                       | conditional_statements (OR | AND) conditional_statements
                       | VAR_NAME
                       | FLOAT
                       | INT
                       | NUM
                       | STRING
                       ;


if_else_block : '(' (if_else_block | if_else_block) ')'
              | IF (VAR_NAME | NUM | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | NUM | INT | FLOAT | BOOL)*
              | ELSE WS (VAR_NAME | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | INT | FLOAT | BOOL)*
              | ELIF WS (VAR_NAME | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | INT | FLOAT | BOOL)*
              ;

IF : 'if';
ELSE : 'else';
ELIF : 'elif';
COLON: ':';


/* Arithmetic Operators */
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MOD : '%';

/* Assignment Operators */
ASSIGN : '=';
PLUS_EQUAL : '+=';
MINUS_EQUAL : '-=';
MULTI_EQUAL : '*=';
DIVIDE_EQUAL : '/=';
MOD_EQUAL : '%=';

/* Conditional Statements */
EQUAL_EQUAL : '==';
DOESNOT_EQUAL : '!=';
LESS_THAN : '<';
LESS_THAN_EQUAL : '<=';
GREATER_THAN : '>';
GREATER_THAN_EQUAL : '>=';
AND : 'and';
OR : 'or';

/* Variable Names */
VAR_NAME: [a-zA-Z_] [a-zA-Z_0-9]*;
