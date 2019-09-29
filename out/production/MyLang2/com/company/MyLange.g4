grammar MyLange;

main:'script:' statement* 'endscript';
primaryExpresion
:Identifier
|LangDigit
|'(' assigmentExpression ')';
postfixExpression
:primaryExpresion
|postfixExpression '++'
|postfixExpression '--'
|'(' postfixExpression ',' postfixExpression ')' OPERATOR;
unaryExpression
:postfixExpression
|'print' unaryExpression;
relationalExpression
:unaryExpression
|relationalExpression '<' unaryExpression
|relationalExpression '>' unaryExpression;
equalityExpression
:relationalExpression
|equalityExpression '=' relationalExpression;
assigmentExpression
:equalityExpression
|unaryExpression ':=' assigmentExpression;
statement
:expressionStatment
|compoundStatement
|ifStatment
|iterationStatement;
iterationStatement: DO statement While '(' assigmentExpression ')' ';';
expressionStatment: assigmentExpression? ';';
ifStatment: 'if' '(' assigmentExpression ')' statement ('else' statement)?;
compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem:statement;

OPERATOR:'+'|'-'|'*'|'/';
Print:'print';
LeftParen : '(';
RightParen : ')';
IF:'if';
DO:'do';
While:'while';
Less:'<';
Greater:'>';
MinusMinus:'--';
PlusPlus:'++';
Term:';';
Equal:'=';
Asign:':=';
LeftBrace : '{';
RightBrace : '}';
Identifier:Nondigit
(Nondigit|LangDigit)*;
fragment
Nondigit:[a-zA-Z_];
LangDigit:TDigit
(HexdecimalDigit)*;
fragment
TDigit:[0-9];
fragment
HexdecimalConstant:HexdecimalDigit+;
fragment
HexdecimalDigit:[0-9a-fA-F];
Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;