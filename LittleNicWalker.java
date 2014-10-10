// $ANTLR 3.5 C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g 2013-04-25 14:31:55

  import java.util.Map;
  import java.util.HashMap;
  import java.util.ArrayList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LittleNicWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN_STATEMENT", "BLOCK_STATEMENT", 
		"BOOLEAN", "COMMENTS", "DECLARATION", "DECLARATIONS", "DIGIT", "EXPRESSIONS", 
		"FALSE", "FUNC_CALL", "FUNC_DEC", "IDENT", "IF_STATEMENT", "INTEGER", 
		"LETTER", "NEGATION", "OUT_STATEMENT", "PARAMETER", "PARAMETERS", "PROC_DEC", 
		"PROC_STATEMENT", "PROGRAM", "STATEMENT", "STATEMENTS", "STRING_LITERAL", 
		"TERM", "TRUE", "VARS", "VAR_DEC", "WHILE_STATEMENT", "WHITESPACE", "'!='", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "':'", "':='", "';'", "'<'", 
		"'<='", "'=='", "'>'", "'>='", "'BEGIN'", "'COUNT'", "'DO'", "'ELSE'", 
		"'END'", "'FUNCTION'", "'IF'", "'OUTPUT'", "'PROCEDURE'", "'PROGRAM'", 
		"'THEN'", "'TRUTH'", "'VAR'", "'WHILE'"
	};
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int ASSIGN_STATEMENT=4;
	public static final int BLOCK_STATEMENT=5;
	public static final int BOOLEAN=6;
	public static final int COMMENTS=7;
	public static final int DECLARATION=8;
	public static final int DECLARATIONS=9;
	public static final int DIGIT=10;
	public static final int EXPRESSIONS=11;
	public static final int FALSE=12;
	public static final int FUNC_CALL=13;
	public static final int FUNC_DEC=14;
	public static final int IDENT=15;
	public static final int IF_STATEMENT=16;
	public static final int INTEGER=17;
	public static final int LETTER=18;
	public static final int NEGATION=19;
	public static final int OUT_STATEMENT=20;
	public static final int PARAMETER=21;
	public static final int PARAMETERS=22;
	public static final int PROC_DEC=23;
	public static final int PROC_STATEMENT=24;
	public static final int PROGRAM=25;
	public static final int STATEMENT=26;
	public static final int STATEMENTS=27;
	public static final int STRING_LITERAL=28;
	public static final int TERM=29;
	public static final int TRUE=30;
	public static final int VARS=31;
	public static final int VAR_DEC=32;
	public static final int WHILE_STATEMENT=33;
	public static final int WHITESPACE=34;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public LittleNicWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LittleNicWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g"; }


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



	// $ANTLR start "program"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:40:1: program returns [String result] : ^( PROGRAM ^(name= IDENT (d= declarations )? (s= statements )? ) ) ;
	public final String program() throws RecognitionException {
		String result = null;


		CommonTree name=null;
		String d =null;
		String s =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:41:9: ( ^( PROGRAM ^(name= IDENT (d= declarations )? (s= statements )? ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:41:16: ^( PROGRAM ^(name= IDENT (d= declarations )? (s= statements )? ) )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program90); 
			match(input, Token.DOWN, null); 
			name=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_program120); 
			progName = (name!=null?name.getText():null);
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:42:65: (d= declarations )?
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECLARATIONS) ) {
					alt1=1;
				}
				switch (alt1) {
					case 1 :
						// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:42:66: d= declarations
						{
						pushFollow(FOLLOW_declarations_in_program128);
						d=declarations();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:42:84: (s= statements )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==STATEMENTS) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:42:85: s= statements
						{
						pushFollow(FOLLOW_statements_in_program137);
						s=statements();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

				
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:74:1: declarations returns [String result] : ^( DECLARATIONS d1= declaration (d2= declaration )* ) ;
	public final String declarations() throws RecognitionException {
		String result = null;


		String d1 =null;
		String d2 =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:75:9: ( ^( DECLARATIONS d1= declaration (d2= declaration )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:75:13: ^( DECLARATIONS d1= declaration (d2= declaration )* )
			{
			match(input,DECLARATIONS,FOLLOW_DECLARATIONS_in_declarations241); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_declaration_in_declarations247);
			d1=declaration();
			state._fsp--;

			result = d1;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:75:60: (d2= declaration )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==FUNC_DEC||LA3_0==PROC_DEC||LA3_0==VAR_DEC) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:75:61: d2= declaration
					{
					pushFollow(FOLLOW_declaration_in_declarations256);
					d2=declaration();
					state._fsp--;

					result += nextLine + d2;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "declarations"



	// $ANTLR start "varDecs"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:79:2: varDecs returns [String result] : ^( VARS v1= varDec (v2= varDec )* ) ;
	public final String varDecs() throws RecognitionException {
		String result = null;


		String v1 =null;
		String v2 =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:80:4: ( ^( VARS v1= varDec (v2= varDec )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:80:6: ^( VARS v1= varDec (v2= varDec )* )
			{
			match(input,VARS,FOLLOW_VARS_in_varDecs305); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_varDec_in_varDecs309);
			v1=varDec();
			state._fsp--;

			result = v1;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:80:38: (v2= varDec )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==VAR_DEC) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:80:39: v2= varDec
					{
					pushFollow(FOLLOW_varDec_in_varDecs317);
					v2=varDec();
					state._fsp--;

					result +=nextLine + tab + v2;
					}
					break;

				default :
					break loop4;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "varDecs"



	// $ANTLR start "declaration"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:86:1: declaration returns [String result] : (v= varDec |p= procDec |f= funcDec );
	public final String declaration() throws RecognitionException {
		String result = null;


		String v =null;
		String p =null;
		String f =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:87:9: (v= varDec |p= procDec |f= funcDec )
			int alt5=3;
			switch ( input.LA(1) ) {
			case VAR_DEC:
				{
				alt5=1;
				}
				break;
			case PROC_DEC:
				{
				alt5=2;
				}
				break;
			case FUNC_DEC:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:87:15: v= varDec
					{
					pushFollow(FOLLOW_varDec_in_declaration369);
					v=varDec();
					state._fsp--;

					if(v!=null) result = "private static " + v;
					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:88:15: p= procDec
					{
					pushFollow(FOLLOW_procDec_in_declaration395);
					p=procDec();
					state._fsp--;

					if(p!=null) result = p;
					}
					break;
				case 3 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:89:15: f= funcDec
					{
					pushFollow(FOLLOW_funcDec_in_declaration421);
					f=funcDec();
					state._fsp--;

					if(f!=null) result = f;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "varDec"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:92:1: varDec returns [String result] : ^( VAR_DEC IDENT t= type ) ;
	public final String varDec() throws RecognitionException {
		String result = null;


		CommonTree IDENT1=null;
		String t =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:93:9: ( ^( VAR_DEC IDENT t= type ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:93:17: ^( VAR_DEC IDENT t= type )
			{
			match(input,VAR_DEC,FOLLOW_VAR_DEC_in_varDec463); 
			match(input, Token.DOWN, null); 
			IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_varDec465); 
			pushFollow(FOLLOW_type_in_varDec470);
			t=type();
			state._fsp--;

			match(input, Token.UP, null); 

			result = t + space + (IDENT1!=null?IDENT1.getText():null) + ";";
				
			        			//checked if variable name already doesn't exist
			        			if(vars.contains((IDENT1!=null?IDENT1.getText():null))|| (IDENT1!=null?IDENT1.getText():null).equals(progName)){
			        					//name error
			        					err.reportNameError((IDENT1!=null?IDENT1.getLine():0), (IDENT1!=null?IDENT1.getCharPositionInLine():0), (IDENT1!=null?IDENT1.getText():null));
			        		 	}
			        		 	else{	
			        		 		//name added to arraylist
			        		 		vars.add((IDENT1!=null?IDENT1.getText():null));
			        		 	}
			        		
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "varDec"



	// $ANTLR start "funcDec"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:107:1: funcDec returns [String result] : ^( FUNC_DEC ^(t= type IDENT (p= parameters )? (v= varDecs )? (s= statements )? ) ) ;
	public final String funcDec() throws RecognitionException {
		String result = null;


		CommonTree IDENT2=null;
		String t =null;
		String p =null;
		String v =null;
		String s =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:9: ( ^( FUNC_DEC ^(t= type IDENT (p= parameters )? (v= varDecs )? (s= statements )? ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:13: ^( FUNC_DEC ^(t= type IDENT (p= parameters )? (v= varDecs )? (s= statements )? ) )
			{
			match(input,FUNC_DEC,FOLLOW_FUNC_DEC_in_funcDec532); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_type_in_funcDec539);
			t=type();
			state._fsp--;

			match(input, Token.DOWN, null); 
			IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcDec541); 
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:42: (p= parameters )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PARAMETERS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:43: p= parameters
					{
					pushFollow(FOLLOW_parameters_in_funcDec547);
					p=parameters();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:60: (v= varDecs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VARS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:61: v= varDecs
					{
					pushFollow(FOLLOW_varDecs_in_funcDec558);
					v=varDecs();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:75: (s= statements )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==STATEMENTS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:109:76: s= statements
					{
					pushFollow(FOLLOW_statements_in_funcDec567);
					s=statements();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

				
			        		//checked if function name already doesn't exist
			        		if(vars.contains((IDENT2!=null?IDENT2.getText():null)) || (IDENT2!=null?IDENT2.getText():null).equals(progName)){
			        			//name error
			        		 	err.reportNameError((IDENT2!=null?IDENT2.getLine():0), (IDENT2!=null?IDENT2.getCharPositionInLine():0), (IDENT2!=null?IDENT2.getText():null));
			        		 }else{	
			        		 	//name added to arraylist
			        		 	vars.add((IDENT2!=null?IDENT2.getText():null));
			        		}
			        		//tabs, method declaration with the return type and name of method
			        		result = tab + "public static " + t + space + (IDENT2!=null?IDENT2.getText():null) + "( ";
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
			        		result += space + " ){" + nextLine + tab + t + space + (IDENT2!=null?IDENT2.getText():null) + ";" + nextLine;
			        		
			        		
			        		//variable declarations
			        		if(v!=null)
			        			result += tab + v + nextLine;
			        		
			        		if(s!=null)
			        			result += tab + s + nextLine;
			        		
			        		//the variable is returned	
			           		result += tab + "return " + (IDENT2!=null?IDENT2.getText():null) + ";" + nextLine;
			        		tab = tab.substring(0,tab.length() - 1);  		
			        		result += tab + "}";
			        	
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "funcDec"



	// $ANTLR start "procDec"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:150:1: procDec returns [String result] : ^( PROC_DEC ^( IDENT (p= parameters )? (v= varDecs )? (s= statements )? ) ) ;
	public final String procDec() throws RecognitionException {
		String result = null;


		CommonTree IDENT3=null;
		String p =null;
		String v =null;
		String s =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:9: ( ^( PROC_DEC ^( IDENT (p= parameters )? (v= varDecs )? (s= statements )? ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:14: ^( PROC_DEC ^( IDENT (p= parameters )? (v= varDecs )? (s= statements )? ) )
			{
			match(input,PROC_DEC,FOLLOW_PROC_DEC_in_procDec632); 
			match(input, Token.DOWN, null); 
			IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_procDec635); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:33: (p= parameters )?
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==PARAMETERS) ) {
					alt9=1;
				}
				switch (alt9) {
					case 1 :
						// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:35: p= parameters
						{
						pushFollow(FOLLOW_parameters_in_procDec641);
						p=parameters();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:51: (v= varDecs )?
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==VARS) ) {
					alt10=1;
				}
				switch (alt10) {
					case 1 :
						// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:52: v= varDecs
						{
						pushFollow(FOLLOW_varDecs_in_procDec651);
						v=varDecs();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:67: (s= statements )?
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==STATEMENTS) ) {
					alt11=1;
				}
				switch (alt11) {
					case 1 :
						// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:151:68: s= statements
						{
						pushFollow(FOLLOW_statements_in_procDec661);
						s=statements();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 


			        		//checked if procedure name already doesn't exist
			        		if(vars.contains((IDENT3!=null?IDENT3.getText():null))|| (IDENT3!=null?IDENT3.getText():null).equals(progName)){
			        		 	err.reportNameError((IDENT3!=null?IDENT3.getLine():0), (IDENT3!=null?IDENT3.getCharPositionInLine():0), (IDENT3!=null?IDENT3.getText():null));
			        		 }else{	
			        		 	vars.add((IDENT3!=null?IDENT3.getText():null));
			        		}
			        		
			        		//parameter list restarted
			        		params = new ArrayList<String>();
			        		result = tab + "public static void " + (IDENT3!=null?IDENT3.getText():null) + "(";
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "procDec"



	// $ANTLR start "parameters"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:185:1: parameters returns [String result] : ^( PARAMETERS p1= parameter (p2= parameter )* ) ;
	public final String parameters() throws RecognitionException {
		String result = null;


		String p1 =null;
		String p2 =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:186:9: ( ^( PARAMETERS p1= parameter (p2= parameter )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:186:17: ^( PARAMETERS p1= parameter (p2= parameter )* )
			{
			match(input,PARAMETERS,FOLLOW_PARAMETERS_in_parameters722); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_parameter_in_parameters728);
			p1=parameter();
			state._fsp--;

			result = p1;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:186:59: (p2= parameter )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==PARAMETER) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:186:60: p2= parameter
					{
					pushFollow(FOLLOW_parameter_in_parameters736);
					p2=parameter();
					state._fsp--;

					result += ", " + p2;
					}
					break;

				default :
					break loop12;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "parameters"



	// $ANTLR start "parameter"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:189:1: parameter returns [String result] : ^( PARAMETER IDENT t= type ) ;
	public final String parameter() throws RecognitionException {
		String result = null;


		CommonTree IDENT4=null;
		String t =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:190:9: ( ^( PARAMETER IDENT t= type ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:191:17: ^( PARAMETER IDENT t= type )
			{
			match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter800); 
			match(input, Token.DOWN, null); 
			IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parameter802); 
			pushFollow(FOLLOW_type_in_parameter806);
			t=type();
			state._fsp--;

			match(input, Token.UP, null); 


			                //checked two paramaters don't have same name or same name as program
			                if(params.contains((IDENT4!=null?IDENT4.getText():null))|| (IDENT4!=null?IDENT4.getText():null).equals(progName)){
			        		 	err.reportNameError((IDENT4!=null?IDENT4.getLine():0), (IDENT4!=null?IDENT4.getCharPositionInLine():0), (IDENT4!=null?IDENT4.getText():null));
			        		 }else{	
			        		 	params.add((IDENT4!=null?IDENT4.getText():null));
			        		}
			                result = t + space + (IDENT4!=null?IDENT4.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "parameter"



	// $ANTLR start "type"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:203:1: type returns [String result] : ( 'COUNT' | 'TRUTH' );
	public final String type() throws RecognitionException {
		String result = null;


		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:204:9: ( 'COUNT' | 'TRUTH' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==51) ) {
				alt13=1;
			}
			else if ( (LA13_0==61) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:204:17: 'COUNT'
					{
					match(input,51,FOLLOW_51_in_type872); 
					result = "int";
					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:205:17: 'TRUTH'
					{
					match(input,61,FOLLOW_61_in_type900); 
					result = "boolean";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:209:1: statements returns [String result] : ^( STATEMENTS s1= statement (s2= statement )* ) ;
	public final String statements() throws RecognitionException {
		String result = null;


		String s1 =null;
		String s2 =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:210:9: ( ^( STATEMENTS s1= statement (s2= statement )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:210:17: ^( STATEMENTS s1= statement (s2= statement )* )
			{
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_statements952); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_statements958);
			s1=statement();
			state._fsp--;

			result = s1;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:210:60: (s2= statement )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= ASSIGN_STATEMENT && LA14_0 <= BLOCK_STATEMENT)||LA14_0==IF_STATEMENT||LA14_0==PROC_STATEMENT||LA14_0==WHILE_STATEMENT||LA14_0==57) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:210:61: s2= statement
					{
					pushFollow(FOLLOW_statement_in_statements967);
					s2=statement();
					state._fsp--;

					result += nextLine + tab + s2;
					}
					break;

				default :
					break loop14;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:213:1: statement returns [String result] : (a= assignStatement |o= outStatement |i= ifStatement |w= whileStatement |p= procStatement |b= blockStatement );
	public final String statement() throws RecognitionException {
		String result = null;


		String a =null;
		String o =null;
		String i =null;
		String w =null;
		String p =null;
		String b =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:214:9: (a= assignStatement |o= outStatement |i= ifStatement |w= whileStatement |p= procStatement |b= blockStatement )
			int alt15=6;
			switch ( input.LA(1) ) {
			case ASSIGN_STATEMENT:
				{
				alt15=1;
				}
				break;
			case 57:
				{
				alt15=2;
				}
				break;
			case IF_STATEMENT:
				{
				alt15=3;
				}
				break;
			case WHILE_STATEMENT:
				{
				alt15=4;
				}
				break;
			case PROC_STATEMENT:
				{
				alt15=5;
				}
				break;
			case BLOCK_STATEMENT:
				{
				alt15=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:214:17: a= assignStatement
					{
					pushFollow(FOLLOW_assignStatement_in_statement1013);
					a=assignStatement();
					state._fsp--;

					 result = a;
					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:215:17: o= outStatement
					{
					pushFollow(FOLLOW_outStatement_in_statement1038);
					o=outStatement();
					state._fsp--;

					 result = o;
					}
					break;
				case 3 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:216:17: i= ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement1063);
					i=ifStatement();
					state._fsp--;

					 result = i;
					}
					break;
				case 4 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:217:17: w= whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement1089);
					w=whileStatement();
					state._fsp--;

					 result = w;
					}
					break;
				case 5 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:218:17: p= procStatement
					{
					pushFollow(FOLLOW_procStatement_in_statement1114);
					p=procStatement();
					state._fsp--;

					 result = p;
					}
					break;
				case 6 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:219:17: b= blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_statement1139);
					b=blockStatement();
					state._fsp--;

					 result = b;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "statement"



	// $ANTLR start "assignStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:222:1: assignStatement returns [String result] : ^( ASSIGN_STATEMENT IDENT e= expression ) ;
	public final String assignStatement() throws RecognitionException {
		String result = null;


		CommonTree IDENT5=null;
		String e =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:223:9: ( ^( ASSIGN_STATEMENT IDENT e= expression ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:223:17: ^( ASSIGN_STATEMENT IDENT e= expression )
			{
			match(input,ASSIGN_STATEMENT,FOLLOW_ASSIGN_STATEMENT_in_assignStatement1185); 
			match(input, Token.DOWN, null); 
			IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignStatement1187); 
			pushFollow(FOLLOW_expression_in_assignStatement1193);
			e=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			result = (IDENT5!=null?IDENT5.getText():null) + " = " + e + ";";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "assignStatement"



	// $ANTLR start "outStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:227:1: outStatement returns [String result] : ( ^( 'OUTPUT' STRING_LITERAL ) | ^( 'OUTPUT' IDENT ) );
	public final String outStatement() throws RecognitionException {
		String result = null;


		CommonTree STRING_LITERAL6=null;
		CommonTree IDENT7=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:228:9: ( ^( 'OUTPUT' STRING_LITERAL ) | ^( 'OUTPUT' IDENT ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==57) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==DOWN) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==STRING_LITERAL) ) {
						alt16=1;
					}
					else if ( (LA16_2==IDENT) ) {
						alt16=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:228:17: ^( 'OUTPUT' STRING_LITERAL )
					{
					match(input,57,FOLLOW_57_in_outStatement1255); 
					match(input, Token.DOWN, null); 
					STRING_LITERAL6=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_outStatement1257); 
					match(input, Token.UP, null); 

					result = "System.out.print(" + (STRING_LITERAL6!=null?STRING_LITERAL6.getText():null) + ");";
					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:229:17: ^( 'OUTPUT' IDENT )
					{
					match(input,57,FOLLOW_57_in_outStatement1295); 
					match(input, Token.DOWN, null); 
					IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_outStatement1297); 
					match(input, Token.UP, null); 

					result = "System.out.print(" + (IDENT7!=null?IDENT7.getText():null) + ");";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "outStatement"



	// $ANTLR start "ifStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:232:1: ifStatement returns [String result] : ^( IF_STATEMENT e= expression ^( TRUE s1= statement ) ^( FALSE s2= statement ) ) ;
	public final String ifStatement() throws RecognitionException {
		String result = null;


		String e =null;
		String s1 =null;
		String s2 =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:233:9: ( ^( IF_STATEMENT e= expression ^( TRUE s1= statement ) ^( FALSE s2= statement ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:233:17: ^( IF_STATEMENT e= expression ^( TRUE s1= statement ) ^( FALSE s2= statement ) )
			{
			match(input,IF_STATEMENT,FOLLOW_IF_STATEMENT_in_ifStatement1369); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStatement1375);
			e=expression();
			state._fsp--;

			match(input,TRUE,FOLLOW_TRUE_in_ifStatement1378); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_ifStatement1384);
			s1=statement();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,FALSE,FOLLOW_FALSE_in_ifStatement1388); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_ifStatement1394);
			s2=statement();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 


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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "whileStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:250:1: whileStatement returns [String result] : ^( WHILE_STATEMENT e= expression s= statement ) ;
	public final String whileStatement() throws RecognitionException {
		String result = null;


		String e =null;
		String s =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:251:9: ( ^( WHILE_STATEMENT e= expression s= statement ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:251:17: ^( WHILE_STATEMENT e= expression s= statement )
			{
			match(input,WHILE_STATEMENT,FOLLOW_WHILE_STATEMENT_in_whileStatement1458); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement1464);
			e=expression();
			state._fsp--;

			pushFollow(FOLLOW_statement_in_whileStatement1470);
			s=statement();
			state._fsp--;

			match(input, Token.UP, null); 


			        			result = "while(" + e + "){" + nextLine + tab + s + nextLine + tab +"}";
			        		
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "procStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:259:1: procStatement returns [String result] : ^( PROC_STATEMENT IDENT (e= expressions )? ) ;
	public final String procStatement() throws RecognitionException {
		String result = null;


		CommonTree IDENT8=null;
		String e =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:260:9: ( ^( PROC_STATEMENT IDENT (e= expressions )? ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:260:17: ^( PROC_STATEMENT IDENT (e= expressions )? )
			{
			match(input,PROC_STATEMENT,FOLLOW_PROC_STATEMENT_in_procStatement1551); 
			match(input, Token.DOWN, null); 
			IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_procStatement1553); 
			result = tab + (IDENT8!=null?IDENT8.getText():null) + "( " ;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:260:77: (e= expressions )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==EXPRESSIONS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:260:78: e= expressions
					{
					pushFollow(FOLLOW_expressions_in_procStatement1560);
					e=expressions();
					state._fsp--;

					result += e;
					}
					break;

			}

			match(input, Token.UP, null); 

			result += " );";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "procStatement"



	// $ANTLR start "blockStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:263:2: blockStatement returns [String result] : ^( BLOCK_STATEMENT (s= statements )? ) ;
	public final String blockStatement() throws RecognitionException {
		String result = null;


		String s =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:264:9: ( ^( BLOCK_STATEMENT (s= statements )? ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:264:17: ^( BLOCK_STATEMENT (s= statements )? )
			{
			match(input,BLOCK_STATEMENT,FOLLOW_BLOCK_STATEMENT_in_blockStatement1614); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:264:35: (s= statements )?
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==STATEMENTS) ) {
					alt18=1;
				}
				switch (alt18) {
					case 1 :
						// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:264:36: s= statements
						{
						pushFollow(FOLLOW_statements_in_blockStatement1621);
						s=statements();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			if(s!=null) result = s; else result = "";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "blockStatement"



	// $ANTLR start "expression"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:269:1: expression returns [String result] : ( ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( NEGATION op= expression ) | '(' e= expression ')' | IDENT | INTEGER | BOOLEAN | ^( FUNC_CALL IDENT e= expressions ) );
	public final String expression() throws RecognitionException {
		String result = null;


		CommonTree IDENT9=null;
		CommonTree INTEGER10=null;
		CommonTree BOOLEAN11=null;
		CommonTree IDENT12=null;
		String op1 =null;
		String op2 =null;
		String op =null;
		String e =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:270:6: ( ^( '==' op1= expression op2= expression ) | ^( '!=' op1= expression op2= expression ) | ^( '<=' op1= expression op2= expression ) | ^( '<' op1= expression op2= expression ) | ^( '>' op1= expression op2= expression ) | ^( '>=' op1= expression op2= expression ) | ^( '+' op1= expression op2= expression ) | ^( '-' op1= expression op2= expression ) | ^( '*' op1= expression op2= expression ) | ^( NEGATION op= expression ) | '(' e= expression ')' | IDENT | INTEGER | BOOLEAN | ^( FUNC_CALL IDENT e= expressions ) )
			int alt19=15;
			switch ( input.LA(1) ) {
			case 47:
				{
				alt19=1;
				}
				break;
			case 35:
				{
				alt19=2;
				}
				break;
			case 46:
				{
				alt19=3;
				}
				break;
			case 45:
				{
				alt19=4;
				}
				break;
			case 48:
				{
				alt19=5;
				}
				break;
			case 49:
				{
				alt19=6;
				}
				break;
			case 39:
				{
				alt19=7;
				}
				break;
			case 41:
				{
				alt19=8;
				}
				break;
			case 38:
				{
				alt19=9;
				}
				break;
			case NEGATION:
				{
				alt19=10;
				}
				break;
			case 36:
				{
				alt19=11;
				}
				break;
			case IDENT:
				{
				alt19=12;
				}
				break;
			case INTEGER:
				{
				alt19=13;
				}
				break;
			case BOOLEAN:
				{
				alt19=14;
				}
				break;
			case FUNC_CALL:
				{
				alt19=15;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:270:10: ^( '==' op1= expression op2= expression )
					{
					match(input,47,FOLLOW_47_in_expression1677); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1683);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1689);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " == " + op2;
					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:271:10: ^( '!=' op1= expression op2= expression )
					{
					match(input,35,FOLLOW_35_in_expression1710); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1716);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1722);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " != " + op2;
					}
					break;
				case 3 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:272:10: ^( '<=' op1= expression op2= expression )
					{
					match(input,46,FOLLOW_46_in_expression1743); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1749);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1755);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " <= " + op2;
					}
					break;
				case 4 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:273:10: ^( '<' op1= expression op2= expression )
					{
					match(input,45,FOLLOW_45_in_expression1776); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1782);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1788);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " < " + op2;
					}
					break;
				case 5 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:274:10: ^( '>' op1= expression op2= expression )
					{
					match(input,48,FOLLOW_48_in_expression1810); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1816);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1822);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " > " + op2;
					}
					break;
				case 6 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:275:10: ^( '>=' op1= expression op2= expression )
					{
					match(input,49,FOLLOW_49_in_expression1844); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1850);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1856);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " >= " + op2;
					}
					break;
				case 7 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:276:10: ^( '+' op1= expression op2= expression )
					{
					match(input,39,FOLLOW_39_in_expression1877); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1883);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1889);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " + " + op2;
					}
					break;
				case 8 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:277:10: ^( '-' op1= expression op2= expression )
					{
					match(input,41,FOLLOW_41_in_expression1911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1917);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1923);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " - " + op2;
					}
					break;
				case 9 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:278:10: ^( '*' op1= expression op2= expression )
					{
					match(input,38,FOLLOW_38_in_expression1945); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1951);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1957);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result = op1 + " * " + op2;
					}
					break;
				case 10 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:279:10: ^( NEGATION op= expression )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expression1979); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1985);
					op=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					result =  "-" + op;
					}
					break;
				case 11 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:280:8: '(' e= expression ')'
					{
					match(input,36,FOLLOW_36_in_expression2017); 
					pushFollow(FOLLOW_expression_in_expression2023);
					e=expression();
					state._fsp--;

					match(input,37,FOLLOW_37_in_expression2025); 
					result = "(" + e + ")";
					}
					break;
				case 12 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:281:10: IDENT
					{
					IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression2044); 
					result = (IDENT9!=null?IDENT9.getText():null);
					}
					break;
				case 13 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:282:10: INTEGER
					{
					INTEGER10=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expression2099); 
					result = (INTEGER10!=null?INTEGER10.getText():null);
					}
					break;
				case 14 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:283:10: BOOLEAN
					{
					BOOLEAN11=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression2152); 
					result = (BOOLEAN11!=null?BOOLEAN11.getText():null);
					}
					break;
				case 15 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:284:10: ^( FUNC_CALL IDENT e= expressions )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_expression2206); 
					match(input, Token.DOWN, null); 
					IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression2208); 
					pushFollow(FOLLOW_expressions_in_expression2214);
					e=expressions();
					state._fsp--;

					match(input, Token.UP, null); 

					result = (IDENT12!=null?IDENT12.getText():null) + "(" + e + ")" ;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "expression"



	// $ANTLR start "expressions"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:287:1: expressions returns [String result] : ^( EXPRESSIONS e1= expression (e2= expression )* ) ;
	public final String expressions() throws RecognitionException {
		String result = null;


		String e1 =null;
		String e2 =null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:288:9: ( ^( EXPRESSIONS e1= expression (e2= expression )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:288:13: ^( EXPRESSIONS e1= expression (e2= expression )* )
			{
			match(input,EXPRESSIONS,FOLLOW_EXPRESSIONS_in_expressions2270); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_expressions2276);
			e1=expression();
			state._fsp--;

			result = e1;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:288:58: (e2= expression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BOOLEAN||LA20_0==FUNC_CALL||LA20_0==IDENT||LA20_0==INTEGER||LA20_0==NEGATION||(LA20_0 >= 35 && LA20_0 <= 36)||(LA20_0 >= 38 && LA20_0 <= 39)||LA20_0==41||(LA20_0 >= 45 && LA20_0 <= 49)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNicWalker.g:288:60: e2= expression
					{
					pushFollow(FOLLOW_expression_in_expressions2286);
					e2=expression();
					state._fsp--;

					result += ", " + e2;
					}
					break;

				default :
					break loop20;
				}
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "expressions"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program90 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_program120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declarations_in_program128 = new BitSet(new long[]{0x0000000008000008L});
	public static final BitSet FOLLOW_statements_in_program137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARATIONS_in_declarations241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_declarations247 = new BitSet(new long[]{0x0000000100804008L});
	public static final BitSet FOLLOW_declaration_in_declarations256 = new BitSet(new long[]{0x0000000100804008L});
	public static final BitSet FOLLOW_VARS_in_varDecs305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_varDec_in_varDecs309 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_varDec_in_varDecs317 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_varDec_in_declaration369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procDec_in_declaration395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDec_in_declaration421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DEC_in_varDec463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_varDec465 = new BitSet(new long[]{0x2008000000000000L});
	public static final BitSet FOLLOW_type_in_varDec470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_DEC_in_funcDec532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_funcDec539 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_funcDec541 = new BitSet(new long[]{0x0000000088400008L});
	public static final BitSet FOLLOW_parameters_in_funcDec547 = new BitSet(new long[]{0x0000000088000008L});
	public static final BitSet FOLLOW_varDecs_in_funcDec558 = new BitSet(new long[]{0x0000000008000008L});
	public static final BitSet FOLLOW_statements_in_funcDec567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_DEC_in_procDec632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_procDec635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameters_in_procDec641 = new BitSet(new long[]{0x0000000088000008L});
	public static final BitSet FOLLOW_varDecs_in_procDec651 = new BitSet(new long[]{0x0000000008000008L});
	public static final BitSet FOLLOW_statements_in_procDec661 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_parameters722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_in_parameters728 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_parameter_in_parameters736 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_PARAMETER_in_parameter800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_parameter802 = new BitSet(new long[]{0x2008000000000000L});
	public static final BitSet FOLLOW_type_in_parameter806 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_51_in_type872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_type900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATEMENTS_in_statements952 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statements958 = new BitSet(new long[]{0x0200000201010038L});
	public static final BitSet FOLLOW_statement_in_statements967 = new BitSet(new long[]{0x0200000201010038L});
	public static final BitSet FOLLOW_assignStatement_in_statement1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStatement_in_statement1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procStatement_in_statement1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStatement_in_statement1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_STATEMENT_in_assignStatement1185 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_assignStatement1187 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_assignStatement1193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_57_in_outStatement1255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_outStatement1257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_57_in_outStatement1295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_outStatement1297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_STATEMENT_in_ifStatement1369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement1375 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_TRUE_in_ifStatement1378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_ifStatement1384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FALSE_in_ifStatement1388 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_ifStatement1394 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILE_STATEMENT_in_whileStatement1458 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement1464 = new BitSet(new long[]{0x0200000201010030L});
	public static final BitSet FOLLOW_statement_in_whileStatement1470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_STATEMENT_in_procStatement1551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_procStatement1553 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_expressions_in_procStatement1560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_STATEMENT_in_blockStatement1614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statements_in_blockStatement1621 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_47_in_expression1677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1683 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_expression1710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1716 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1722 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_46_in_expression1743 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1749 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1755 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_expression1776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1782 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_expression1810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1816 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_49_in_expression1844 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1850 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_39_in_expression1877 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1883 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1889 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_41_in_expression1911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1917 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1923 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_expression1945 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1951 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression1957 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATION_in_expression1979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_expression2017 = new BitSet(new long[]{0x0003E2D8000AA040L});
	public static final BitSet FOLLOW_expression_in_expression2023 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_expression2025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_expression2044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_expression2099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_expression2152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNC_CALL_in_expression2206 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_expression2208 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_expressions_in_expression2214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPRESSIONS_in_expressions2270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expressions2276 = new BitSet(new long[]{0x0003E2D8000AA048L});
	public static final BitSet FOLLOW_expression_in_expressions2286 = new BitSet(new long[]{0x0003E2D8000AA048L});
}
