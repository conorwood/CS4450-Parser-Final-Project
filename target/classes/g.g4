grammar g;

tokens {INDENT, DEDENT}
/*
INDENT : '->';
DEDENT : '<-';
*/
@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
    public static final int COMMENTS = 1;

    private final DenterHelper denter = new DenterHelper(NL,
                                                           gParser.INDENT,
                                                           gParser.DEDENT)
      {
        @Override
        public Token pullToken() {
          return gLexer.super.nextToken();
        }
      };

      @Override
      public Token nextToken() {
        return denter.nextToken();
      }
}

NL: ('\r'? '\n' ' '*);


// Arithmetic operations rule, allowing parentheses and following order of operations (PEMDAS)
arithmetic_operations : '(' arithmetic_operations ')'
                      | arithmetic_operations (MULTIPLY|DIVIDE|MOD) arithmetic_operations
                      | arithmetic_operations (PLUS|MINUS) arithmetic_operations
                      | NUM
                      | VAR_NAME
                      ;

WS  :   [\r]+ -> skip ; // Define whitespace rule, toss it out
TAB : '   '; // tab is 3 spaces
//TAB : [\t];
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

/*
if_else_block : '(' (if_else_block | if_else_block) ')'
              | 'if(' (VAR_NAME | NUM | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | NUM | INT | FLOAT | BOOL)* ')' COLON (block| if_else_block)
              | 'else(' (VAR_NAME | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | INT | FLOAT | BOOL)* ')' COLON block
              | 'else if(' (VAR_NAME | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | INT | FLOAT | BOOL)* ')' COLON block
              ;

while_block : '(' (while_block |  while_block) ')'
            |   'while(' (VAR_NAME | NUM | INT | FLOAT | BOOL) (conditional_statements | assignment_operations | ASSIGN | COLON) (VAR_NAME | NUM | INT | FLOAT | BOOL)*  ')' COLON '\n' TAB
            block;
*/

if_else_block : 'if' '(' (assignment_operations | conditional_statements | BOOL | VAR_NAME) '):' '\n' TAB block* if_else_block*
              | 'elif' '(' (assignment_operations | conditional_statements | BOOL | VAR_NAME) '):' '\n' TAB block* if_else_block*
              | 'else' ':' '\n' TAB block* if_else_block*
              ;


while_block : 'while' '(' assignment_operations '):' '\n' TAB block*
            | 'while' '(' conditional_statements '):' '\n' TAB block*
            ;

/*
for_block : '(' (for_block |  for_block) ')'
          | 'for(' (VAR_NAME) (conditional_statements) (VAR_NAME | NUM | INT | FLOAT | BOOL)* ')'
          block
          ;
*/

for_block : 'for (' assignment_operations '):' '\n' TAB block*
          | 'for (' conditional_statements '):' '\n' TAB block*
          ;

//IF : 'if';
//ELSE : 'else';
//ELIF : 'elif';

comments : (SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT) *
         ;

SINGLE_LINE_COMMENT : '#' ~[\n\r]* -> channel(1);
MULTI_LINE_COMMENT : '"""' [.*] '"""' -> channel(1);

COLON: ':';
//WHILE : 'while';
FOR : 'for';


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


ANYTHING : [.*?];
//ANYTHING_BUT_NEWLINES : ~[\n\r]*;


function_args : (VAR_NAME (',' VAR_NAME)*)
     ;


function_call_args : (VAR_NAME (',' VAR_NAME)*)
          | (NUM (',' NUM)*)
          | (STRING (',' STRING)*)
          | (BOOL (',' BOOL)*)
          ;

function_call : VAR_NAME '(' function_call_args* ')';

function_declaration : 'def ' VAR_NAME '(' function_args* '):';

function_block: function_declaration '\n' TAB block* '<-';

block :   statement* '\n' TAB statement*
      ;


statement :  while_block | for_block | arithmetic_operations | assignment_operations | VAR_NAME | function_call
;



denter_tester : 'hello' INDENT 'there' DEDENT
              ;