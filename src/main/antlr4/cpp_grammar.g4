grammar cpp_grammar;

/*Parser rules*/

file: preprocessordirective namespacedeclaration (classdeclaration| (function function));

classdeclaration: classsign variablename extendsop stylesign accessection1 accessection2 stylesign;

accessection1:accessoperator colon variabledeclaration variabledeclaration constructor destructor;

accessection2:accessoperator colon variabledeclaration function noargfunction;

extendsop: colon accessoperator variablename;

body: stylesign
(printtext
|pointerassign
|inputtext
|variabledeclaration
|operation
|whileloop
|forloop
|table
|switchloop
|tabledeclaration
)*
(exproperator (variablename|variablevalue) stylesign)?
stylesign;

enumdeclaration: exproperator stylesign (variablename stylesign).* stylesign;

constructor: classprefix variablename stylesign (simpletypespecifier variablename(stylesign)?)* stylesign body;

destructor:'~' classprefix classname '(){}';

function: (specialtypes)* simpletypespecifier (classprefix)? variablename stylesign (simpletypespecifier variablename(stylesign)?)* stylesign body;

noargfunction: (specialtypes)* simpletypespecifier (classprefix)? variablename stylesign stylesign body;

classprefix: classname colon colon;

switchloop: exproperator stylesign variablename stylesign stylesign (exproperator variablevalue stylesign (operation|printtext) exproperator stylesign).* (exproperator stylesign (operation|printtext))? stylesign;

ifstatement: ifoperator condition body;

whileloop: exproperator  condition body;

forloop: exproperator stylesign (variablename(logicoperators variablevalue)?)? stylesign (variablename (logicoperators) variablevalue)? stylesign (decincoperator variablename)?  (variablename decincoperator)? stylesign body;

operation: (simpletypespecifier)? variablename (assignoperatior|decincoperator) (variablename|variablevalue|decincoperator).*  (simpleoperators|logicoperators).* (variablename|variablevalue).* stylesign;

condition:stylesign variablename(((simpleoperators)variablename).* )?((logicoperators) (variablename|variablevalue))? stylesign;

namespacedeclaration: USING NAMESPACE 'std;';//OK

pointerassign: variablename pointer variablename assignoperatior variablename stylesign;

preprocessordirective: INCLUDE '<' LIBRARY '>'; //OK

functiondeclaration:  simpletypespecifier variablename stylesign (simpletypespecifier variablename (stylesign)?)* stylesign stylesign;

tabledeclaration: table logicoperators stylesign (variablevalue).*(stylesign)* stylesign stylesign;

variabledeclaration: simpletypespecifier variablename logicoperators variablevalue stylesign; //OK

printtext: cincout textsign (text|variablename) (textsign cincout)? stylesign;

inputtext: cincout textsign variablename (textsign cincout)? stylesign;

table: simpletypespecifier variablename stylesign (variablevalue|variablename) stylesign (stylesign)?;

specialtypes:
STATIC;

accessoperator:
(PRIVATE
|PUBLIC
|PROTECTED)
;
simpleoperators:
PLUS
|MINUS
|MOD
|STAR
|DIV;

assignoperatior:
PLUSASSIGN
|MINUSASSIGN
|STARASSIGN
|DIVASSIGN
|MODASSIGN
|ASSIGN;

decincoperator:
PLUSPLUS
|MINUSMINUS;

cincout:
CIN
|COUT
|ENDL;

ifoperator: IF;
exproperator:
WHILE
|FOR
|SWITCH
|CASE
|ENUM
|BREAK
|DEFAULT
|RETURN
;
classsign: CLASS;

pointer:POINTER;

logicoperators:
EQUAL
|NOTEQUAL
|AND
|OR
|LESSEQUAL
|GREATEREQUAL
|ASSIGN
|LESS
|GREATER
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

 textsign:
  RIGHTSHIFT
 |LEFTSHIFT;

stylesign:
COMMA
|COLON
|SEMICOLON
|LEFTPAREN
|RIGHTPAREN
|LEFTBRACKET
|RIGHTBRACKET
|LEFTBRACE
|RIGHTBRACE
;
colon:COLON;

variablevalue:(NUMBER|  '\'' NONDIGIT '\''| );

classname:VARIABLENAME;

variablename:VARIABLENAME;

text: TEXT;



/* Lexer rules */
USING: 'using';

ENDL: 'endl';

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

CIN: 'cin';

COUT: 'cout';

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

POINTER: '->';

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


