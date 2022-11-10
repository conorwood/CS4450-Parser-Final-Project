grammar g;

/** A rule called init that matches comma-separated values between {...}. */
//init  : '{' value (',' value)* '}' ;  // must match at least one value

/** A value can be either a nested array/struct or a simple integer (INT) */
//value : init
//      | INT
//      ;
addition_operator : NUM '+' NUM;

division_operator : NUM '/' NUM;
// parser rules start with lowercase letters, lexer rules with uppercase
NUM :   [0-9]*[.]*[0-9]+ ;             // Define token INT as one or more digits
//VAR :
WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
