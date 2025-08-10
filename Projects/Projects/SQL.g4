grammar SQL;

program : statement+ EOF ;

statement : expression ';' ;

expression
    : SELECT valueterm FROM term WHERE clause
    | INSERT INTO valueterm VALUES valueterm
    | UPDATE term SET setClause (WHERE clause)?
    ;
setClause : assignment(',' assignment)*;
assignment : IDENTIFIER '=' term;
clause
    : term comparator term
    | clause AND clause
    | clause OR clause
    ;
valueterm
    : term (',' term)*                           
    | '(' term (',' term)* ')' (',' '(' term (',' term)* ')')* 
    ;
comparator : '>' | '<' | '=' ;

term : STRING | FLOAT | INT | IDENTIFIER ;

SELECT      : 'SELECT' ;
FROM        : 'FROM' ;
WHERE       : 'WHERE' ;
INSERT      : 'INSERT' ;
INTO        : 'INTO' ;
VALUES      : 'VALUES' ;
AND         : 'AND' ;
OR          : 'OR' ;
UPDATE      : 'UPDATE';
SET         : 'SET';

FLOAT       : [0-9]+ '.' [0-9]+ ;
STRING      : '"' (~["\\] | '\\' .)* '"' ;
IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]* ;
INT         : [0-9]+ ;
WS          : [ \t\r\n]+ -> skip ;
