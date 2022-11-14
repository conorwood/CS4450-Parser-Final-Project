grammar g;

// Arithmetic operations rule, allowing parentheses and following order of operations (PEMDAS)
arithmetic_operations : '(' arithmetic_operations ')'
                      | arithmetic_operations (MULTIPLY|DIVIDE|MOD) arithmetic_operations
                      | arithmetic_operations (PLUS|MINUS) arithmetic_operations
                      | NUM
                      | VAR_NAME
                      ;

WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
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

/*
    assign_operator: VAR_NAME ASSIGN (VAR_NAME | INT | STRING | FLOAT | BOOL);
    plus_equal_operator: (VAR_NAME | INT | FLOAT) PLUS_EQUAL (VAR_NAME | INT | FLOAT);
    minus_equal_operator: (VAR_NAME | INT | FLOAT) MINUS_EQUAL (VAR_NAME | INT | FLOAT);
    multi_equal_operator: (VAR_NAME | INT | FLOAT | BOOL) MULTI_EQUAL (VAR_NAME | INT | FLOAT | BOOL);
    divide_equal_op : (VAR_NAME | INT | FLOAT) DIVIDE_EQUAL (VAR_NAME | INT | FLOAT);
    mod_equal_op : (VAR_NAME | INT | FLOAT) MOD_EQUAL (VAR_NAME | INT | FLOAT);
    */
/**
    NOT NEEDED YET FOR THIS DELIVERABLE
    equal_equal_op : (VAR_NAME | INT | FLOAT | BOOL) EQUAL_EQUAL (VAR_NAME | INT | FLOAT | BOOL);
    */


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

/* These 2 aren't due yet for this deliverable */
//EQUAL_EQUAL : '==';
//DOESNOT_EQUAL : '!=';

/* Variable Names */
VAR_NAME: [a-zA-Z_] [a-zA-Z_0-9]*;
