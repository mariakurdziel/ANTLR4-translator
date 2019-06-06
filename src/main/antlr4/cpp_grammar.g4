grammar cpp_grammar;

/*Parser rules*/

classdeclaration: CLASS VARIABLENAME LEFTBRACE (accessoperator COLON ((variabledeclaration|functiondeclaration)).*).* RIGHTBRACE;

classprefix: VARIABLENAME COLON COLON;

enumdeclaration: ENUM VARIABLENAME LEFTBRACE (VARIABLENAME COMMA).* RIGHTBRACE;

function: simpletypespecifier VARIABLENAME LEFTPAREN (simpletypespecifier VARIABLENAME (COMMA)?)* RIGHTPAREN LEFTBRACE body RIGHTBRACE;

switchloop: SWITCH LEFTPAREN VARIABLENAME RIGHTPAREN LEFTBRACE (CASE variablevalue COLON (assignoperation|operation|printtext) BREAK SEMICOLON).* (DEFAULT COLON (assignoperation|operation|printtext))? RIGHTBRACE;

forloop: FOR LEFTPAREN (VARIABLENAME (ASSIGN NUMBER)?)? SEMICOLON (VARIABLENAME (LESSEQUAL|GREATEREQUAL|NOTEQUAL|LESS|GREATER) NUMBER)? SEMICOLON ((PLUSPLUS|MINUSMINUS) VARIABLENAME)?  (VARIABLENAME(PLUSPLUS|MINUSMINUS))? LEFTBAREN BODY;

whileloop: WHILE  condition body;

ifoperation: IF condition BODY;

body: LEFTBRACE
(operation
|assignoperation
|ifoperation
|printtext
|inputtext
|variabledeclaration
|ifoperation
|whileloop
|forloop
|table
|switchloop
|tabledeclaration).*
RIGHTBRACE;

operation: (simpletypespecifier)? VARIABLENAME ASSIGN
(VARIABLENAME
|NUMBER
|NONDIGIT)
(PLUS
|MINUS
|STAR
|DIV
|MOD
|CARET
|AND
|OR
|TILDE
|NOT)
(VARIABLENAME
|NUMBER
|NONDIGIT)
SEMICOLON;

assignoperation: VARIABLENAME
(PLUSASSIGN
|MINUSASSIGN
|STARASSIGN
|DIVASSIGN
|MODASSIGN)
(VARIABLENAME
|NUMBER
|NONDIGIT)
SEMICOLON;

condition:LEFTPAREN VARIABLENAME(((PLUS|MINUS|MOD|STAR|)VARIABLENAME).* )?((EQUAL|NOTEQUAL) (VARIABLENAME|NUMBER))? RIGHTPAREN;

namespacedeclaration: USING NAMESPACE VARIABLENAME SEMICOLON;//OK

preprocessordirective: INCLUDE '<' LIBRARY '>'; //OK

functiondeclaration:  simpletypespecifier VARIABLENAME LEFTPAREN (simpletypespecifier VARIABLENAME (COMMA)?)* RIGHTPAREN SEMICOLON;

tabledeclaration: table ASSIGN LEFTBRACE (NUMBER).*(COMMA)* RIGHTBRACE SEMICOLON;

variabledeclaration: simpletypespecifier VARIABLENAME '=' variablevalue SEMICOLON; //OK

printtext:'cout' LEFTSHIFT (TEXT|VARIABLENAME) (LEFTSHIFT 'endl')? SEMICOLON;

inputtext: 'cin' RIGHTSHIFT VARIABLENAME SEMICOLON;

table: simpletypespecifier VARIABLENAME LEFTBRACKET (NUMBER|VARIABLENAME) RIGHTBRACKET (SEMICOLON)?;

accessoperator:
(PRIVATE
|PUBLIC
|PROTECTED)
;


simpletypespecifier:
   CHAR
   | BOOL
   | SHORT
   | INT
   | LONG
   | SIGNED
   | UNSIGNED
   | FLOAT
   | DOUBLE
   | VOID
   | AUTO
   ;

variablevalue:(NUMBER|  '\'' NONDIGIT '\''| );


/* Lexer rules */
USING: 'using';

INCLUDE: '#include';

EQUAL: '==';

NOTEQUAL: '!=';

LESSEQUAL: '<=';

GREATEREQUAL: '>=';

ANDAND: '&&'|'and';

OROR: '||'| 'or';

PLUSPLUS: '++';

MINUSMINUS: '--';

COMMA: ',';

LEFTSHIFT: '<<';

RIGHTSHIFT:'>>';

AUTO: 'auto';

BOOL: 'bool';

BREAK: 'break';

CASE: 'case';

CATCH: 'catch';

CHAR: 'char';

CLASS: 'class';

CONST: 'const';

CONTINUE: 'continue';

DEFAULT: 'default';

DELETE: 'delete';

DO: 'do';

DOUBLE: 'double';

ELSE: 'else';

ENUM: 'enum';

FALSE: 'false';

FINAL: 'final';

FLOAT: 'float';

FOR: 'for';

FRIEND: 'friend';

GOTO: 'goto';

IF: 'if';

INLINE: 'inline';

INT: 'int';

LONG: 'long';

NAMESPACE: 'namespace';

NEW: 'new';

NOEXCEPT: 'noexcept';

NULLPTR: 'nullptr';

OVERRIDE: 'override';

PRIVATE: 'private';

PROTECTED: 'protected';

PUBLIC: 'public';

REINTERPRET_CAST: 'reinterpret_cast';

RETURN: 'return';

SHORT: 'short';

SIGNED: 'signed';

SIZEOF: 'sizeof';

STATIC: 'static';

STRUCT: 'struct';

SWITCH: 'switch';

THIS: 'this';

THROW: 'throw';

TRUE: 'true';

TRY: 'try';

UNSIGNED: 'unsigned';

VIRTUAL: 'virtual';

VOID: 'void';

WHILE: 'while';

/*Operators*/

LEFTPAREN: '(';

RIGHTPAREN: ')';

LEFTBRACKET: '[';

RIGHTBRACKET: ']';

LEFTBRACE: '{';

RIGHTBRACE: '}';

PLUS: '+';

MINUS: '-';

STAR: '*';

DIV: '/';

MOD: '%';

CARET: '^';

AND: '&';

OR: '|';

TILDE: '~';

NOT: '!'| 'not';

ASSIGN: '=';

LESS: '<';

GREATER: '>';

PLUSASSIGN: '+=';

MINUSASSIGN: '-=';

STARASSIGN: '*=';

DIVASSIGN: '/=';

MODASSIGN: '%=';

SEMICOLON: ';';

COLON: ':';

QUOTEMARK: '"';

OPERATOR:
     NEW
   | DELETE
   | NEW '[' ']'
   | DELETE'[' ']'
   | '+'
   | '-'
   | '*'
   | '/'
   | '%'
   | '^'
   | '&'
   | '|'
   | '~'
   | '!'
   | 'not'
   | '='
   | '<'
   | '>'
   | '+='
   | '-='
   | '*='
   | '/='
   | '%='
   | '^='
   | '&='
   | '|='
   | '=='
   | '!='
   | '<='
   | '>='
   | '&&'
   | 'and'
   | '||'
   | 'or'
   | '++'
   | '--'
   | ','
   | '->*'
   | '->'
   | '(' ')'
   | '[' ']'
   ;
fragment SIGN: [+-];

TEXT : QUOTEMARK (WORD (WHITESPACE)?)+ QUOTEMARK;

VARIABLENAME: WORD DIGIT*;

WORD: NONDIGIT+;

LIBRARY: WORD('.h')?;

fragment NONDIGIT: [a-zA-Z_];

NUMBER : DIGIT+ ([.,] DIGIT+)? ;

fragment DIGIT: [0-9];

LINECOMMENT:'//' ~ [\r\n]* -> skip;

BLOCKCOMMENT:'/*' .*? '*/' -> skip;

NEWLINE: ('\r' '\n'? | '\n') -> skip;

WHITESPACE: [ \t]+ -> skip;


