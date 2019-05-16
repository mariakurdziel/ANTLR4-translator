grammar cpp_grammar;

/*Parser rules*/

function: simpletypespecifier VARIABLENAME LEFTPAREN (simpletypespecifier VARIABLENAME (COMMA)?)* RIGHTPAREN LEFTBRACE (operation)* (assignoperation)* (variabledeclaration)* (printtext)* (inputtext)* (RETURN (VARIABLENAME|variablevalue) SEMICOLON)? RIGHTBRACE;

operation: (simpletypespecifier)? VARIABLENAME ASSIGN (VARIABLENAME|NUMBER|NONDIGIT) (PLUS| MINUS|STAR|DIV|MOD|CARET|AND|OR|TILDE|NOT) (VARIABLENAME|NUMBER|NONDIGIT) SEMICOLON;

assignoperation: VARIABLENAME (PLUSASSIGN|MINUSASSIGN|STARASSIGN|DIVASSIGN|MODASSIGN) (VARIABLENAME|NUMBER|NONDIGIT) SEMICOLON;

namespacedeclaration: USING NAMESPACE VARIABLENAME SEMICOLON;//OK

preprocessordirective: INCLUDE '<' LIBRARY '>'; //OK

variabledeclaration: simpletypespecifier VARIABLENAME '=' variablevalue SEMICOLON; //OK

printtext:'cout' LEFTSHIFT (TEXT|VARIABLENAME) (LEFTSHIFT 'endl')? SEMICOLON;

inputtext: 'cin' RIGHTSHIFT VARIABLENAME SEMICOLON;

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


