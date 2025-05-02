grammar Delphi;

// Fixed: Make declarations non-optional, but allow it to be empty
program: 'program' IDENTIFIER ';' declarations block '.' ;


// Allow empty declarations
declarations: 'var' variableDeclaration* ;

block: 'begin' statement* 'end' ;

classDeclaration: 'class' IDENTIFIER ('extends' IDENTIFIER)? ('implements' IDENTIFIER)? '{' classBody '}' ;

interfaceDeclaration: 'interface' IDENTIFIER '{' interfaceBody? '}' ;

interfaceBody: methodSignature+ ;

methodSignature: 'procedure' IDENTIFIER '(' parameterList? ')' ';' ;

parameterList: parameter (';' parameter)* ;

parameter: IDENTIFIER ':' IDENTIFIER ;

classBody: (variableDeclaration | methodDeclaration | constructorDeclaration | destructorDeclaration)* ;

variableDeclaration: visibilitySpecifier? IDENTIFIER ':' IDENTIFIER ';' ;

constructorDeclaration: 'constructor' IDENTIFIER '(' parameterList? ')' ';' ;

destructorDeclaration: 'destructor' IDENTIFIER '(' ')' ';' ;

methodDeclaration: visibilitySpecifier? 'procedure' IDENTIFIER '(' parameterList? ')' ';' ;

visibilitySpecifier: 'public' | 'private' | 'protected' ;

statement
    : assignment ';'
    | procedureCall ';'
    | ifStatement
    | whileStatement
    | forStatement
    | breakStatement ';'
    | continueStatement ';'
    | block
    | integerOutput ';'
    ;

assignment: IDENTIFIER ':=' expression ;

procedureCall: IDENTIFIER '(' expressionList? ')' ;

expressionList: expression (',' expression)* ;

ifStatement: 'if' expression 'then' statement ('else' statement)? ;

whileStatement: 'while' expression 'do' statement ;

forStatement: 'for' IDENTIFIER ':=' expression 'to' expression 'do' statement ;

breakStatement: 'break' ;

continueStatement: 'continue' ;

// Fixed: Make declarations and block non-optional
procedureDeclaration: 'procedure' IDENTIFIER '(' parameterList? ')' ';' declarations block ';' ;

// Fixed: Make declarations and block non-optional
functionDeclaration: 'function' IDENTIFIER '(' parameterList? ')' ':' IDENTIFIER ';' declarations block ';' ;

expression
    : INT                                  # intLiteral
    | IDENTIFIER                           # variable
    | functionCall                         # functionCallExpr
    | '(' expression ')'                   # parentheses
    | expression ('*' | '/') expression    # multDiv
    | expression ('+' | '-') expression    # addSub
    | expression ('=' | '<>' | '<' | '>' | '<=' | '>=') expression  # comparison
    ;

functionCall: IDENTIFIER '(' expressionList? ')' ;

integerOutput: 'print' '(' expression ')' ;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
INT: [0-9]+ ;
WS: [ \t\r\n]+ -> skip ;
COMMENT: '//' ~[\r\n]* -> skip ;