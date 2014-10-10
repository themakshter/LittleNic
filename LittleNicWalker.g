tree grammar LittleNicWalker;

options {
  language = Java;
  tokenVocab = LittleNic;
  ASTLabelType = CommonTree;
}

@header {
  import java.util.Map;
  import java.util.HashMap;
  import java.util.ArrayList;
}

@members {
	// using variables for tabs, new lines, spaces so that code looks cleaner.
	private String tab = "\t";
	private String nextLine = "\n";
	private String space = " ";
	//program name to check for name errors
	private String progName;
	//ArrayLists to keep track of names which have been declared
	ArrayList<String> vars = new ArrayList<String>();
	ArrayList<String> params = new ArrayList<String>();
	
    public ErrorReporter err;
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
    String msg = getErrorMessage(e, tokenNames);
	err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}



//parser rules
 
 
///main program
program         returns [String result]
        :      ^(PROGRAM
                        ^(name =IDENT {progName = $IDENT.text;} (d= declarations)? (s = statements )?))   
                          
                        {	
                        	//result is empty at the beginning
                        	result = "";
                        	
                        	//adding the declarations
                        	//declarations are added only if they are present.
                        	if(d!=null)
                        		result += nextLine + tab + d;
                        		
                        		//start of main method
                        		result += nextLine + nextLine + tab + "public static void main(String[] args){";
//                        		
//                        	}
                        		vars = new ArrayList<String>();
                        	//adding statements
                        	//statements are added oly if there are any
                        	if(s!=null){
                        	//tab is increased so that statements are indented
                        		tab += "\t";
                        		result += nextLine + tab + s;
                        		//once the statements finish, tab is decreased again.
                        		tab = tab.substring(0, tab.length()-1);
                        	}
                        	//curly braces added
                        	result += nextLine + tab + "}" + nextLine;                        
                        }    
        ;
 
 
//declarations
declarations    returns [String result]
        :   ^(DECLARATIONS d1 = declaration {result = d1;} (d2 = declaration {result += nextLine + d2;} )*)
        //the second bit only added if it is present
        ;
        
 varDecs	returns [String result]
 		:	^(VARS v1=varDec {result = v1;} (v2 =varDec {result +=nextLine + tab + v2;})*)
 			
 			
 		;
 
 
declaration	returns [String result]
        :     v =   varDec			{if(v!=null) result = "private static " + v;}
        |     p =   procDec			{if(p!=null) result = p;}
        |     f =   funcDec			{if(f!=null) result = f;}
        ;
 
varDec  returns [String result]
        :       ^(VAR_DEC IDENT t= type )        {result = t + space + $IDENT.text + ";";}
        		{	
        			//checked if variable name already doesn't exist
        			if(vars.contains($IDENT.text)|| $IDENT.text.equals(progName)){
        					//name error
        					err.reportNameError($IDENT.line, $IDENT.pos, $IDENT.text);
        		 	}
        		 	else{	
        		 		//name added to arraylist
        		 		vars.add($IDENT.text);
        		 	}
        		}
        ;
 
funcDec	returns [String result]
 				
        :  	^(FUNC_DEC ^(t = type IDENT  (p=parameters)?   (v = varDecs)? (s = statements )?)) 
        	{	
        		//checked if function name already doesn't exist
        		if(vars.contains($IDENT.text) || $IDENT.text.equals(progName)){
        			//name error
        		 	err.reportNameError($IDENT.line, $IDENT.pos, $IDENT.text);
        		 }else{	
        		 	//name added to arraylist
        		 	vars.add($IDENT.text);
        		}
        		//tabs, method declaration with the return type and name of method
        		result = tab + "public static " + t + space + $IDENT.text + "( ";
        		//parameters
        		//only added if present
        		//parameter list restarted
        		params = new ArrayList<String>();
        		if(p!= null)
        			result += p;
        		
        		//indentation	
        		tab += "\t";
        		//parameter list restarted
        		params = new ArrayList<String>();
        		//firstly, variable is created which is to be returned at the end
        		result += space + " ){" + nextLine + tab + t + space + $IDENT.text + ";" + nextLine;
        		
        		
        		//variable declarations
        		if(v!=null)
        			result += tab + v + nextLine;
        		
        		if(s!=null)
        			result += tab + s + nextLine;
        		
        		//the variable is returned	
           		result += tab + "return " + $IDENT.text + ";" + nextLine;
        		tab = tab.substring(0,tab.length() - 1);  		
        		result += tab + "}";
        	}        
        ;
       
procDec	returns [String result]
        :  		^(PROC_DEC ^(IDENT ( p=parameters)?  (v = varDecs )? (s = statements )?) )	
        	{
        		//checked if procedure name already doesn't exist
        		if(vars.contains($IDENT.text)|| $IDENT.text.equals(progName)){
        		 	err.reportNameError($IDENT.line, $IDENT.pos, $IDENT.text);
        		 }else{	
        		 	vars.add($IDENT.text);
        		}
        		
        		//parameter list restarted
        		params = new ArrayList<String>();
        		result = tab + "public static void " + $IDENT.text + "(";
        		//parameters
        		if(p!= null)
        			result += p;
        			
        		tab += "\t";
        		result += space + "){" + nextLine;
        		//parameter list restarted
        		params = new ArrayList<String>();
        		//variable declarations
        		//only added if not null
        		if(v!=null)
        			result += tab + v + nextLine;
        		//statements - only added if not null
        		if(s!=null)
        			result += tab + s + nextLine;
        			
        		tab = tab.substring(0,tab.length() - 1);  		
        		result += tab + "}";
        	}
        ;
 
//parameters
parameters      returns [String result]
        :       ^(PARAMETERS p1 = parameter {result = p1;}(p2 = parameter {result += ", " + p2;})*)
        ;
 
parameter       returns [String result]
        :      
                ^(PARAMETER IDENT t=type)       
                {
                //checked two paramaters don't have same name or same name as program
                if(params.contains($IDENT.text)|| $IDENT.text.equals(progName)){
        		 	err.reportNameError($IDENT.line, $IDENT.pos, $IDENT.text);
        		 }else{	
        		 	params.add($IDENT.text);
        		}
                result = t + space + $IDENT.text;}
        ;
 
//type
type    returns [String result]
        :       'COUNT'         {result = "int";}
        |       'TRUTH'         {result = "boolean";}
        ;
//statements

statements      returns [String result]
        :       ^(STATEMENTS s1 = statement {result = s1;} (s2 = statement {result += nextLine + tab + s2;})*)
        ;
 
statement		returns [String result]
        :       a = assignStatement		{ result = a;}
        |       o = outStatement		{ result = o;}
        |       i = ifStatement			{ result = i;}
        |       w = whileStatement		{ result = w;}
        |       p = procStatement		{ result = p;}
        |       b = blockStatement		{ result = b;}
        ;
       
assignStatement	returns [String result]
        :       ^(ASSIGN_STATEMENT IDENT e = expression)        {result = $IDENT.text + " = " + e + ";";}
        
        ;
       
outStatement	returns [String result]
        :       ^('OUTPUT' STRING_LITERAL)                 {result = "System.out.print(" + $STRING_LITERAL.text + ");";}
        |       ^('OUTPUT' IDENT)                          {result = "System.out.print(" + $IDENT.text + ");";}
        ;
       
ifStatement		returns [String result]
        :       ^(IF_STATEMENT e = expression ^(TRUE s1 = statement) ^(FALSE s2 = statement))     
        		{
        		//if with expression
        		result = "if(" + e + "){" + nextLine;
        		//indentation
        		tab+= "\t";
        		result += tab + s1 + nextLine;
        		//decreased indentaion
        		tab = tab.substring(0,tab.length() - 1);
        		result += tab + "}else{" + nextLine;
        		tab +="\t";
        		result += tab + s2 + nextLine;
        		tab = tab.substring(0,tab.length() - 1);
        		result += tab + "}";
        		}  
        ;
       
whileStatement	returns [String result]
        :       ^(WHILE_STATEMENT e = expression s = statement)         
        		
        		{
        			result = "while(" + e + "){" + nextLine + tab + s + nextLine + tab +"}";
        		}
        		
        ;
 
procStatement	returns [String result]
        :       ^(PROC_STATEMENT IDENT {result = tab + $IDENT.text + "( " ;}(e= expressions {result += e;})?)   {result += " );";}       
        ;
 
 blockStatement	returns [String result]
        :       ^(BLOCK_STATEMENT (s = statements)?)              {if(s!=null) result = s; else result = "";}
        ;
 
 
//expressions
expression      returns [String result]
    	:   ^('==' op1 = expression op2 = expression)       {result = op1 + " == " + op2;}
    	|   ^('!=' op1 = expression op2 = expression)       {result = op1 + " != " + op2;}
    	|   ^('<=' op1 = expression op2 = expression)       {result = op1 + " <= " + op2;}
    	|   ^('<' op1 = expression op2 = expression)        {result = op1 + " < " + op2;}
    	|   ^('>' op1 = expression op2 = expression)        {result = op1 + " > " + op2;}
    	|   ^('>=' op1 = expression op2 = expression)       {result = op1 + " >= " + op2;}
    	|   ^('+' op1 = expression op2 = expression)        {result = op1 + " + " + op2;}
    	|   ^('-' op1 = expression op2 = expression)        {result = op1 + " - " + op2;}
    	|   ^('*' op1 = expression op2 = expression)        {result = op1 + " * " + op2;}
    	|   ^(NEGATION op = expression)                     {result =  "-" + op;}
    	|	'(' e = expression ')'							{result = "(" + e + ")";}
    	|   IDENT                                           {result = $IDENT.text;}
    	|   INTEGER                                         {result = $INTEGER.text;}
    	|   BOOLEAN                                         {result = $BOOLEAN.text;}
    	|   ^(FUNC_CALL IDENT e = expressions)              {result = $IDENT.text + "(" + e + ")" ;}
    	;      
 
expressions     returns [String result]
        :   ^(EXPRESSIONS e1 = expression {result = e1;} ( e2 = expression {result += ", " + e2;} )*)  
        ;