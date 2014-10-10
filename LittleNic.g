grammar LittleNic;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

tokens{
	PROGRAM;
	DECLARATION;
	VAR_DEC;
	FUNC_DEC;
	PROC_DEC;
	PARAMETER;
	STATEMENT;
	ASSIGN_STATEMENT;
	OUT_STATEMENT;
	IF_STATEMENT;
	TRUE;
	FALSE;
	WHILE_STATEMENT;
	BLOCK_STATEMENT;
	PROC_STATEMENT;
	TERM;
	FUNC_CALL;
	PARAMETERS;
	STATEMENTS;
	EXPRESSIONS;
	DECLARATIONS;
	VARS;
	NEGATION;
}



@members {
    public ErrorReporter err;
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
      String msg = getErrorMessage(e, tokenNames);
	  err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}


@lexer::members {
    public ErrorReporter err;
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String msg = getErrorMessage(e, tokenNames);
	err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}
//parser rules
 
 
//main program
program
        :       'PROGRAM' IDENT ';'
                declarations?
                'BEGIN'
                statements?
                'END' ';' EOF
                -> ^(PROGRAM ^(IDENT declarations? statements?))
        ;
 
//declarations
declarations
        :       declaration (';' declaration)*
        	-> ^(DECLARATIONS declaration (declaration)*)
        ;
 
declaration
        :       varDec
        |       procDec
        |       funcDec
        ;
 
varDec
        :       'VAR' IDENT ':' type
        		-> ^(VAR_DEC IDENT type)
        ;
        
varDecs
		:		varDec (';' varDec)*
				-> ^(VARS varDec (varDec)*)
		;
 
funcDec
        :       'FUNCTION' IDENT '(' parameters? ')' ':' type ':='
               	varDecs?
                'BEGIN'
                statements?
                'END'
                -> ^(FUNC_DEC ^(type IDENT parameters?  varDecs? statements?)) 
        ;
       
procDec
        :       'PROCEDURE' IDENT '(' parameters? ')' ':='
                varDecs?
                'BEGIN'
                statements?
                'END'
                -> ^(PROC_DEC ^(IDENT parameters?  varDecs? statements?))
        ;
 
//parameters
parameters
        :	parameter (',' parameter)*
        	-> ^(PARAMETERS parameter (parameter)*)
        ;
 
parameter
        : 	IDENT ':' type
        	-> ^(PARAMETER IDENT type)
        ;
 
//type
type
        :       'COUNT'
        |       'TRUTH'
        ;
 
//statements
blockStatement
        :       'BEGIN'
                statements?
                'END'
                -> ^(BLOCK_STATEMENT statements?)
        ;
 
statements
        : 	statement (';' statement)*
        	-> ^(STATEMENTS statement (statement)*)
        ;
 
statement
        :       assignStatement		
        |       outStatement		
        |       ifStatement			
        |       whileStatement		
        |       procStatement		
        |       blockStatement		
        ;
       
assignStatement
        :       IDENT ':=' expression
        		-> ^(ASSIGN_STATEMENT IDENT expression)
        ;
       
outStatement
        :       'OUTPUT'^ (STRING_LITERAL | IDENT)
        ;
       
ifStatement
        :       'IF' expression 'THEN'
                statement
                'ELSE'
                statement
                -> ^(IF_STATEMENT expression ^(TRUE statement) ^(FALSE statement))        ;
       
whileStatement
        :       'WHILE' expression 'DO'
                statement?
                -> ^(WHILE_STATEMENT expression statement)
        ;
 
procStatement
        :       IDENT '(' expressions? ')'
        		-> ^(PROC_STATEMENT IDENT expressions?)
        ;
 
//expressions
term
        :	IDENT							
        |   '(' expression ')'			
        |	functionalExp
        |   INTEGER							
        |	BOOLEAN							
        ;
       
negatableTerm
       :	INTEGER
       ;
       
unary
        :       ('+'!)* term
        |		(negation^) negatableTerm
        ;

negation
        :		'-' -> NEGATION	
        ;
        
       
mult
        :       unary ('*'^ unary)*
        ;
 
add
        :       mult (('+'^ | '-'^) mult)*
        ;
 
expression
        :   add (('=='^ | '!='^ | '<='^ | '<'^ | '>='^ | '>'^) add)*
        ;      

expressions
        :       expression ( ',' expression)*
        	-> ^(EXPRESSIONS expression (expression)*)
        ;
  
 functionalExp
  		:	IDENT	'(' expressions	')'		-> ^(FUNC_CALL	IDENT expressions)
  		;
 
//Lexer rules
 
//Definition for Integers. To avoid repetition,
fragment DIGIT: '0'..'9';
INTEGER : DIGIT+;
 
 
BOOLEAN : ('T' | 'F');
 
//Definition for Identifiers. To avoid repetition DIGIT and LETTER were used.
fragment LETTER: ('a'..'z' | 'A'..'Z');
IDENT : LETTER (LETTER | DIGIT | '_')* ;
 
//Ignoring whitespaces and comments
WHITESPACE : (' ' | '\n' | '\r' | '\t' | '\f')+ {$channel = HIDDEN;};
COMMENTS : '/*' .* '*/' {$channel = HIDDEN;};
 
//String literals
STRING_LITERAL
        :       '"'    
                ~('"' | '\n' | '\r')*  
                '"'
        ;
