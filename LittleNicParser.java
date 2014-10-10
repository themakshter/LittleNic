// $ANTLR 3.5 C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g 2013-04-25 14:32:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LittleNicParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LittleNicParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LittleNicParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g"; }


	    public ErrorReporter err;
	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	      String msg = getErrorMessage(e, tokenNames);
		  err.reportSyntaxError(e.line, e.charPositionInLine, msg);
	    }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:59:1: program : 'PROGRAM' IDENT ';' ( declarations )? 'BEGIN' ( statements )? 'END' ';' EOF -> ^( PROGRAM ^( IDENT ( declarations )? ( statements )? ) ) ;
	public final LittleNicParser.program_return program() throws RecognitionException {
		LittleNicParser.program_return retval = new LittleNicParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token IDENT2=null;
		Token char_literal3=null;
		Token string_literal5=null;
		Token string_literal7=null;
		Token char_literal8=null;
		Token EOF9=null;
		ParserRuleReturnScope declarations4 =null;
		ParserRuleReturnScope statements6 =null;

		CommonTree string_literal1_tree=null;
		CommonTree IDENT2_tree=null;
		CommonTree char_literal3_tree=null;
		CommonTree string_literal5_tree=null;
		CommonTree string_literal7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree EOF9_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:60:9: ( 'PROGRAM' IDENT ';' ( declarations )? 'BEGIN' ( statements )? 'END' ';' EOF -> ^( PROGRAM ^( IDENT ( declarations )? ( statements )? ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:60:17: 'PROGRAM' IDENT ';' ( declarations )? 'BEGIN' ( statements )? 'END' ';' EOF
			{
			string_literal1=(Token)match(input,59,FOLLOW_59_in_program172);  
			stream_59.add(string_literal1);

			IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_program174);  
			stream_IDENT.add(IDENT2);

			char_literal3=(Token)match(input,44,FOLLOW_44_in_program176);  
			stream_44.add(char_literal3);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:61:17: ( declarations )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==55||LA1_0==58||LA1_0==62) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:61:17: declarations
					{
					pushFollow(FOLLOW_declarations_in_program194);
					declarations4=declarations();
					state._fsp--;

					stream_declarations.add(declarations4.getTree());
					}
					break;

			}

			string_literal5=(Token)match(input,50,FOLLOW_50_in_program213);  
			stream_50.add(string_literal5);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:63:17: ( statements )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==IDENT||LA2_0==50||(LA2_0 >= 56 && LA2_0 <= 57)||LA2_0==63) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:63:17: statements
					{
					pushFollow(FOLLOW_statements_in_program231);
					statements6=statements();
					state._fsp--;

					stream_statements.add(statements6.getTree());
					}
					break;

			}

			string_literal7=(Token)match(input,54,FOLLOW_54_in_program250);  
			stream_54.add(string_literal7);

			char_literal8=(Token)match(input,44,FOLLOW_44_in_program252);  
			stream_44.add(char_literal8);

			EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_program254);  
			stream_EOF.add(EOF9);

			// AST REWRITE
			// elements: declarations, statements, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 65:17: -> ^( PROGRAM ^( IDENT ( declarations )? ( statements )? ) )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:65:20: ^( PROGRAM ^( IDENT ( declarations )? ( statements )? ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:65:30: ^( IDENT ( declarations )? ( statements )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:65:38: ( declarations )?
				if ( stream_declarations.hasNext() ) {
					adaptor.addChild(root_2, stream_declarations.nextTree());
				}
				stream_declarations.reset();

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:65:52: ( statements )?
				if ( stream_statements.hasNext() ) {
					adaptor.addChild(root_2, stream_statements.nextTree());
				}
				stream_statements.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:69:1: declarations : declaration ( ';' declaration )* -> ^( DECLARATIONS declaration ( declaration )* ) ;
	public final LittleNicParser.declarations_return declarations() throws RecognitionException {
		LittleNicParser.declarations_return retval = new LittleNicParser.declarations_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal11=null;
		ParserRuleReturnScope declaration10 =null;
		ParserRuleReturnScope declaration12 =null;

		CommonTree char_literal11_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:70:9: ( declaration ( ';' declaration )* -> ^( DECLARATIONS declaration ( declaration )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:70:17: declaration ( ';' declaration )*
			{
			pushFollow(FOLLOW_declaration_in_declarations319);
			declaration10=declaration();
			state._fsp--;

			stream_declaration.add(declaration10.getTree());
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:70:29: ( ';' declaration )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==44) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:70:30: ';' declaration
					{
					char_literal11=(Token)match(input,44,FOLLOW_44_in_declarations322);  
					stream_44.add(char_literal11);

					pushFollow(FOLLOW_declaration_in_declarations324);
					declaration12=declaration();
					state._fsp--;

					stream_declaration.add(declaration12.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: declaration, declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 71:10: -> ^( DECLARATIONS declaration ( declaration )* )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:71:13: ^( DECLARATIONS declaration ( declaration )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);
				adaptor.addChild(root_1, stream_declaration.nextTree());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:71:40: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:74:1: declaration : ( varDec | procDec | funcDec );
	public final LittleNicParser.declaration_return declaration() throws RecognitionException {
		LittleNicParser.declaration_return retval = new LittleNicParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope varDec13 =null;
		ParserRuleReturnScope procDec14 =null;
		ParserRuleReturnScope funcDec15 =null;


		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:75:9: ( varDec | procDec | funcDec )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 62:
				{
				alt4=1;
				}
				break;
			case 58:
				{
				alt4=2;
				}
				break;
			case 55:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:75:17: varDec
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varDec_in_declaration380);
					varDec13=varDec();
					state._fsp--;

					adaptor.addChild(root_0, varDec13.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:76:17: procDec
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procDec_in_declaration398);
					procDec14=procDec();
					state._fsp--;

					adaptor.addChild(root_0, procDec14.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:77:17: funcDec
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_funcDec_in_declaration416);
					funcDec15=funcDec();
					state._fsp--;

					adaptor.addChild(root_0, funcDec15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class varDec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varDec"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:80:1: varDec : 'VAR' IDENT ':' type -> ^( VAR_DEC IDENT type ) ;
	public final LittleNicParser.varDec_return varDec() throws RecognitionException {
		LittleNicParser.varDec_return retval = new LittleNicParser.varDec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal16=null;
		Token IDENT17=null;
		Token char_literal18=null;
		ParserRuleReturnScope type19 =null;

		CommonTree string_literal16_tree=null;
		CommonTree IDENT17_tree=null;
		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:81:9: ( 'VAR' IDENT ':' type -> ^( VAR_DEC IDENT type ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:81:17: 'VAR' IDENT ':' type
			{
			string_literal16=(Token)match(input,62,FOLLOW_62_in_varDec448);  
			stream_62.add(string_literal16);

			IDENT17=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDec450);  
			stream_IDENT.add(IDENT17);

			char_literal18=(Token)match(input,42,FOLLOW_42_in_varDec452);  
			stream_42.add(char_literal18);

			pushFollow(FOLLOW_type_in_varDec454);
			type19=type();
			state._fsp--;

			stream_type.add(type19.getTree());
			// AST REWRITE
			// elements: IDENT, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 82:11: -> ^( VAR_DEC IDENT type )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:82:14: ^( VAR_DEC IDENT type )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DEC, "VAR_DEC"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varDec"


	public static class varDecs_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varDecs"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:85:1: varDecs : varDec ( ';' varDec )* -> ^( VARS varDec ( varDec )* ) ;
	public final LittleNicParser.varDecs_return varDecs() throws RecognitionException {
		LittleNicParser.varDecs_return retval = new LittleNicParser.varDecs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal21=null;
		ParserRuleReturnScope varDec20 =null;
		ParserRuleReturnScope varDec22 =null;

		CommonTree char_literal21_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_varDec=new RewriteRuleSubtreeStream(adaptor,"rule varDec");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:86:3: ( varDec ( ';' varDec )* -> ^( VARS varDec ( varDec )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:86:6: varDec ( ';' varDec )*
			{
			pushFollow(FOLLOW_varDec_in_varDecs502);
			varDec20=varDec();
			state._fsp--;

			stream_varDec.add(varDec20.getTree());
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:86:13: ( ';' varDec )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==44) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:86:14: ';' varDec
					{
					char_literal21=(Token)match(input,44,FOLLOW_44_in_varDecs505);  
					stream_44.add(char_literal21);

					pushFollow(FOLLOW_varDec_in_varDecs507);
					varDec22=varDec();
					state._fsp--;

					stream_varDec.add(varDec22.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: varDec, varDec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:5: -> ^( VARS varDec ( varDec )* )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:87:8: ^( VARS varDec ( varDec )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARS, "VARS"), root_1);
				adaptor.addChild(root_1, stream_varDec.nextTree());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:87:22: ( varDec )*
				while ( stream_varDec.hasNext() ) {
					adaptor.addChild(root_1, stream_varDec.nextTree());
				}
				stream_varDec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varDecs"


	public static class funcDec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "funcDec"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:90:1: funcDec : 'FUNCTION' IDENT '(' ( parameters )? ')' ':' type ':=' ( varDecs )? 'BEGIN' ( statements )? 'END' -> ^( FUNC_DEC ^( type IDENT ( parameters )? ( varDecs )? ( statements )? ) ) ;
	public final LittleNicParser.funcDec_return funcDec() throws RecognitionException {
		LittleNicParser.funcDec_return retval = new LittleNicParser.funcDec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal23=null;
		Token IDENT24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token char_literal28=null;
		Token string_literal30=null;
		Token string_literal32=null;
		Token string_literal34=null;
		ParserRuleReturnScope parameters26 =null;
		ParserRuleReturnScope type29 =null;
		ParserRuleReturnScope varDecs31 =null;
		ParserRuleReturnScope statements33 =null;

		CommonTree string_literal23_tree=null;
		CommonTree IDENT24_tree=null;
		CommonTree char_literal25_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree char_literal28_tree=null;
		CommonTree string_literal30_tree=null;
		CommonTree string_literal32_tree=null;
		CommonTree string_literal34_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_varDecs=new RewriteRuleSubtreeStream(adaptor,"rule varDecs");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:91:9: ( 'FUNCTION' IDENT '(' ( parameters )? ')' ':' type ':=' ( varDecs )? 'BEGIN' ( statements )? 'END' -> ^( FUNC_DEC ^( type IDENT ( parameters )? ( varDecs )? ( statements )? ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:91:17: 'FUNCTION' IDENT '(' ( parameters )? ')' ':' type ':=' ( varDecs )? 'BEGIN' ( statements )? 'END'
			{
			string_literal23=(Token)match(input,55,FOLLOW_55_in_funcDec552);  
			stream_55.add(string_literal23);

			IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcDec554);  
			stream_IDENT.add(IDENT24);

			char_literal25=(Token)match(input,36,FOLLOW_36_in_funcDec556);  
			stream_36.add(char_literal25);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:91:38: ( parameters )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IDENT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:91:38: parameters
					{
					pushFollow(FOLLOW_parameters_in_funcDec558);
					parameters26=parameters();
					state._fsp--;

					stream_parameters.add(parameters26.getTree());
					}
					break;

			}

			char_literal27=(Token)match(input,37,FOLLOW_37_in_funcDec561);  
			stream_37.add(char_literal27);

			char_literal28=(Token)match(input,42,FOLLOW_42_in_funcDec563);  
			stream_42.add(char_literal28);

			pushFollow(FOLLOW_type_in_funcDec565);
			type29=type();
			state._fsp--;

			stream_type.add(type29.getTree());
			string_literal30=(Token)match(input,43,FOLLOW_43_in_funcDec567);  
			stream_43.add(string_literal30);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:92:17: ( varDecs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==62) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:92:17: varDecs
					{
					pushFollow(FOLLOW_varDecs_in_funcDec585);
					varDecs31=varDecs();
					state._fsp--;

					stream_varDecs.add(varDecs31.getTree());
					}
					break;

			}

			string_literal32=(Token)match(input,50,FOLLOW_50_in_funcDec604);  
			stream_50.add(string_literal32);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:94:17: ( statements )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENT||LA8_0==50||(LA8_0 >= 56 && LA8_0 <= 57)||LA8_0==63) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:94:17: statements
					{
					pushFollow(FOLLOW_statements_in_funcDec622);
					statements33=statements();
					state._fsp--;

					stream_statements.add(statements33.getTree());
					}
					break;

			}

			string_literal34=(Token)match(input,54,FOLLOW_54_in_funcDec641);  
			stream_54.add(string_literal34);

			// AST REWRITE
			// elements: parameters, statements, type, IDENT, varDecs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 96:17: -> ^( FUNC_DEC ^( type IDENT ( parameters )? ( varDecs )? ( statements )? ) )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:96:20: ^( FUNC_DEC ^( type IDENT ( parameters )? ( varDecs )? ( statements )? ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DEC, "FUNC_DEC"), root_1);
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:96:31: ^( type IDENT ( parameters )? ( varDecs )? ( statements )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_type.nextNode(), root_2);
				adaptor.addChild(root_2, stream_IDENT.nextNode());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:96:44: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_2, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:96:57: ( varDecs )?
				if ( stream_varDecs.hasNext() ) {
					adaptor.addChild(root_2, stream_varDecs.nextTree());
				}
				stream_varDecs.reset();

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:96:66: ( statements )?
				if ( stream_statements.hasNext() ) {
					adaptor.addChild(root_2, stream_statements.nextTree());
				}
				stream_statements.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funcDec"


	public static class procDec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procDec"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:99:1: procDec : 'PROCEDURE' IDENT '(' ( parameters )? ')' ':=' ( varDecs )? 'BEGIN' ( statements )? 'END' -> ^( PROC_DEC ^( IDENT ( parameters )? ( varDecs )? ( statements )? ) ) ;
	public final LittleNicParser.procDec_return procDec() throws RecognitionException {
		LittleNicParser.procDec_return retval = new LittleNicParser.procDec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal35=null;
		Token IDENT36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		Token string_literal40=null;
		Token string_literal42=null;
		Token string_literal44=null;
		ParserRuleReturnScope parameters38 =null;
		ParserRuleReturnScope varDecs41 =null;
		ParserRuleReturnScope statements43 =null;

		CommonTree string_literal35_tree=null;
		CommonTree IDENT36_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree char_literal39_tree=null;
		CommonTree string_literal40_tree=null;
		CommonTree string_literal42_tree=null;
		CommonTree string_literal44_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_varDecs=new RewriteRuleSubtreeStream(adaptor,"rule varDecs");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:100:9: ( 'PROCEDURE' IDENT '(' ( parameters )? ')' ':=' ( varDecs )? 'BEGIN' ( statements )? 'END' -> ^( PROC_DEC ^( IDENT ( parameters )? ( varDecs )? ( statements )? ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:100:17: 'PROCEDURE' IDENT '(' ( parameters )? ')' ':=' ( varDecs )? 'BEGIN' ( statements )? 'END'
			{
			string_literal35=(Token)match(input,58,FOLLOW_58_in_procDec718);  
			stream_58.add(string_literal35);

			IDENT36=(Token)match(input,IDENT,FOLLOW_IDENT_in_procDec720);  
			stream_IDENT.add(IDENT36);

			char_literal37=(Token)match(input,36,FOLLOW_36_in_procDec722);  
			stream_36.add(char_literal37);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:100:39: ( parameters )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENT) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:100:39: parameters
					{
					pushFollow(FOLLOW_parameters_in_procDec724);
					parameters38=parameters();
					state._fsp--;

					stream_parameters.add(parameters38.getTree());
					}
					break;

			}

			char_literal39=(Token)match(input,37,FOLLOW_37_in_procDec727);  
			stream_37.add(char_literal39);

			string_literal40=(Token)match(input,43,FOLLOW_43_in_procDec729);  
			stream_43.add(string_literal40);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:101:17: ( varDecs )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==62) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:101:17: varDecs
					{
					pushFollow(FOLLOW_varDecs_in_procDec747);
					varDecs41=varDecs();
					state._fsp--;

					stream_varDecs.add(varDecs41.getTree());
					}
					break;

			}

			string_literal42=(Token)match(input,50,FOLLOW_50_in_procDec766);  
			stream_50.add(string_literal42);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:103:17: ( statements )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IDENT||LA11_0==50||(LA11_0 >= 56 && LA11_0 <= 57)||LA11_0==63) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:103:17: statements
					{
					pushFollow(FOLLOW_statements_in_procDec784);
					statements43=statements();
					state._fsp--;

					stream_statements.add(statements43.getTree());
					}
					break;

			}

			string_literal44=(Token)match(input,54,FOLLOW_54_in_procDec803);  
			stream_54.add(string_literal44);

			// AST REWRITE
			// elements: IDENT, varDecs, statements, parameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 105:17: -> ^( PROC_DEC ^( IDENT ( parameters )? ( varDecs )? ( statements )? ) )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:105:20: ^( PROC_DEC ^( IDENT ( parameters )? ( varDecs )? ( statements )? ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_DEC, "PROC_DEC"), root_1);
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:105:31: ^( IDENT ( parameters )? ( varDecs )? ( statements )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:105:39: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_2, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:105:52: ( varDecs )?
				if ( stream_varDecs.hasNext() ) {
					adaptor.addChild(root_2, stream_varDecs.nextTree());
				}
				stream_varDecs.reset();

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:105:61: ( statements )?
				if ( stream_statements.hasNext() ) {
					adaptor.addChild(root_2, stream_statements.nextTree());
				}
				stream_statements.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procDec"


	public static class parameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:109:1: parameters : parameter ( ',' parameter )* -> ^( PARAMETERS parameter ( parameter )* ) ;
	public final LittleNicParser.parameters_return parameters() throws RecognitionException {
		LittleNicParser.parameters_return retval = new LittleNicParser.parameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal46=null;
		ParserRuleReturnScope parameter45 =null;
		ParserRuleReturnScope parameter47 =null;

		CommonTree char_literal46_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:110:9: ( parameter ( ',' parameter )* -> ^( PARAMETERS parameter ( parameter )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:110:11: parameter ( ',' parameter )*
			{
			pushFollow(FOLLOW_parameter_in_parameters866);
			parameter45=parameter();
			state._fsp--;

			stream_parameter.add(parameter45.getTree());
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:110:21: ( ',' parameter )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==40) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:110:22: ',' parameter
					{
					char_literal46=(Token)match(input,40,FOLLOW_40_in_parameters869);  
					stream_40.add(char_literal46);

					pushFollow(FOLLOW_parameter_in_parameters871);
					parameter47=parameter();
					state._fsp--;

					stream_parameter.add(parameter47.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: parameter, parameter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 111:10: -> ^( PARAMETERS parameter ( parameter )* )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:111:13: ^( PARAMETERS parameter ( parameter )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);
				adaptor.addChild(root_1, stream_parameter.nextTree());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:111:36: ( parameter )*
				while ( stream_parameter.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter.nextTree());
				}
				stream_parameter.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameters"


	public static class parameter_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:114:1: parameter : IDENT ':' type -> ^( PARAMETER IDENT type ) ;
	public final LittleNicParser.parameter_return parameter() throws RecognitionException {
		LittleNicParser.parameter_return retval = new LittleNicParser.parameter_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT48=null;
		Token char_literal49=null;
		ParserRuleReturnScope type50 =null;

		CommonTree IDENT48_tree=null;
		CommonTree char_literal49_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:115:9: ( IDENT ':' type -> ^( PARAMETER IDENT type ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:115:12: IDENT ':' type
			{
			IDENT48=(Token)match(input,IDENT,FOLLOW_IDENT_in_parameter922);  
			stream_IDENT.add(IDENT48);

			char_literal49=(Token)match(input,42,FOLLOW_42_in_parameter924);  
			stream_42.add(char_literal49);

			pushFollow(FOLLOW_type_in_parameter926);
			type50=type();
			state._fsp--;

			stream_type.add(type50.getTree());
			// AST REWRITE
			// elements: type, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 116:10: -> ^( PARAMETER IDENT type )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:116:13: ^( PARAMETER IDENT type )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:120:1: type : ( 'COUNT' | 'TRUTH' );
	public final LittleNicParser.type_return type() throws RecognitionException {
		LittleNicParser.type_return retval = new LittleNicParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set51=null;

		CommonTree set51_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:121:9: ( 'COUNT' | 'TRUTH' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set51=input.LT(1);
			if ( input.LA(1)==51||input.LA(1)==61 ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set51));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class blockStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blockStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:126:1: blockStatement : 'BEGIN' ( statements )? 'END' -> ^( BLOCK_STATEMENT ( statements )? ) ;
	public final LittleNicParser.blockStatement_return blockStatement() throws RecognitionException {
		LittleNicParser.blockStatement_return retval = new LittleNicParser.blockStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal52=null;
		Token string_literal54=null;
		ParserRuleReturnScope statements53 =null;

		CommonTree string_literal52_tree=null;
		CommonTree string_literal54_tree=null;
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:127:9: ( 'BEGIN' ( statements )? 'END' -> ^( BLOCK_STATEMENT ( statements )? ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:127:17: 'BEGIN' ( statements )? 'END'
			{
			string_literal52=(Token)match(input,50,FOLLOW_50_in_blockStatement1029);  
			stream_50.add(string_literal52);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:128:17: ( statements )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENT||LA13_0==50||(LA13_0 >= 56 && LA13_0 <= 57)||LA13_0==63) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:128:17: statements
					{
					pushFollow(FOLLOW_statements_in_blockStatement1047);
					statements53=statements();
					state._fsp--;

					stream_statements.add(statements53.getTree());
					}
					break;

			}

			string_literal54=(Token)match(input,54,FOLLOW_54_in_blockStatement1066);  
			stream_54.add(string_literal54);

			// AST REWRITE
			// elements: statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 130:17: -> ^( BLOCK_STATEMENT ( statements )? )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:130:20: ^( BLOCK_STATEMENT ( statements )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_STATEMENT, "BLOCK_STATEMENT"), root_1);
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:130:38: ( statements )?
				if ( stream_statements.hasNext() ) {
					adaptor.addChild(root_1, stream_statements.nextTree());
				}
				stream_statements.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blockStatement"


	public static class statements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:133:1: statements : statement ( ';' statement )* -> ^( STATEMENTS statement ( statement )* ) ;
	public final LittleNicParser.statements_return statements() throws RecognitionException {
		LittleNicParser.statements_return retval = new LittleNicParser.statements_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal56=null;
		ParserRuleReturnScope statement55 =null;
		ParserRuleReturnScope statement57 =null;

		CommonTree char_literal56_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:134:9: ( statement ( ';' statement )* -> ^( STATEMENTS statement ( statement )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:134:12: statement ( ';' statement )*
			{
			pushFollow(FOLLOW_statement_in_statements1118);
			statement55=statement();
			state._fsp--;

			stream_statement.add(statement55.getTree());
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:134:22: ( ';' statement )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==44) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:134:23: ';' statement
					{
					char_literal56=(Token)match(input,44,FOLLOW_44_in_statements1121);  
					stream_44.add(char_literal56);

					pushFollow(FOLLOW_statement_in_statements1123);
					statement57=statement();
					state._fsp--;

					stream_statement.add(statement57.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			// AST REWRITE
			// elements: statement, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:10: -> ^( STATEMENTS statement ( statement )* )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:135:13: ^( STATEMENTS statement ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);
				adaptor.addChild(root_1, stream_statement.nextTree());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:135:36: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:138:1: statement : ( assignStatement | outStatement | ifStatement | whileStatement | procStatement | blockStatement );
	public final LittleNicParser.statement_return statement() throws RecognitionException {
		LittleNicParser.statement_return retval = new LittleNicParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope assignStatement58 =null;
		ParserRuleReturnScope outStatement59 =null;
		ParserRuleReturnScope ifStatement60 =null;
		ParserRuleReturnScope whileStatement61 =null;
		ParserRuleReturnScope procStatement62 =null;
		ParserRuleReturnScope blockStatement63 =null;


		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:139:9: ( assignStatement | outStatement | ifStatement | whileStatement | procStatement | blockStatement )
			int alt15=6;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA15_1 = input.LA(2);
				if ( (LA15_1==43) ) {
					alt15=1;
				}
				else if ( (LA15_1==36) ) {
					alt15=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 57:
				{
				alt15=2;
				}
				break;
			case 56:
				{
				alt15=3;
				}
				break;
			case 63:
				{
				alt15=4;
				}
				break;
			case 50:
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
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:139:17: assignStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignStatement_in_statement1179);
					assignStatement58=assignStatement();
					state._fsp--;

					adaptor.addChild(root_0, assignStatement58.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:140:17: outStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_outStatement_in_statement1199);
					outStatement59=outStatement();
					state._fsp--;

					adaptor.addChild(root_0, outStatement59.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:141:17: ifStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement1219);
					ifStatement60=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement60.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:142:17: whileStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement1240);
					whileStatement61=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement61.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:143:17: procStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procStatement_in_statement1260);
					procStatement62=procStatement();
					state._fsp--;

					adaptor.addChild(root_0, procStatement62.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:144:17: blockStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_blockStatement_in_statement1280);
					blockStatement63=blockStatement();
					state._fsp--;

					adaptor.addChild(root_0, blockStatement63.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class assignStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:147:1: assignStatement : IDENT ':=' expression -> ^( ASSIGN_STATEMENT IDENT expression ) ;
	public final LittleNicParser.assignStatement_return assignStatement() throws RecognitionException {
		LittleNicParser.assignStatement_return retval = new LittleNicParser.assignStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT64=null;
		Token string_literal65=null;
		ParserRuleReturnScope expression66 =null;

		CommonTree IDENT64_tree=null;
		CommonTree string_literal65_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:148:9: ( IDENT ':=' expression -> ^( ASSIGN_STATEMENT IDENT expression ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:148:17: IDENT ':=' expression
			{
			IDENT64=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignStatement1320);  
			stream_IDENT.add(IDENT64);

			string_literal65=(Token)match(input,43,FOLLOW_43_in_assignStatement1322);  
			stream_43.add(string_literal65);

			pushFollow(FOLLOW_expression_in_assignStatement1324);
			expression66=expression();
			state._fsp--;

			stream_expression.add(expression66.getTree());
			// AST REWRITE
			// elements: IDENT, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 149:11: -> ^( ASSIGN_STATEMENT IDENT expression )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:149:14: ^( ASSIGN_STATEMENT IDENT expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_STATEMENT, "ASSIGN_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignStatement"


	public static class outStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "outStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:152:1: outStatement : 'OUTPUT' ^ ( STRING_LITERAL | IDENT ) ;
	public final LittleNicParser.outStatement_return outStatement() throws RecognitionException {
		LittleNicParser.outStatement_return retval = new LittleNicParser.outStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal67=null;
		Token set68=null;

		CommonTree string_literal67_tree=null;
		CommonTree set68_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:153:9: ( 'OUTPUT' ^ ( STRING_LITERAL | IDENT ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:153:17: 'OUTPUT' ^ ( STRING_LITERAL | IDENT )
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal67=(Token)match(input,57,FOLLOW_57_in_outStatement1382); 
			string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal67_tree, root_0);

			set68=input.LT(1);
			if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set68));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "outStatement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:156:1: ifStatement : 'IF' expression 'THEN' statement 'ELSE' statement -> ^( IF_STATEMENT expression ^( TRUE statement ) ^( FALSE statement ) ) ;
	public final LittleNicParser.ifStatement_return ifStatement() throws RecognitionException {
		LittleNicParser.ifStatement_return retval = new LittleNicParser.ifStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal69=null;
		Token string_literal71=null;
		Token string_literal73=null;
		ParserRuleReturnScope expression70 =null;
		ParserRuleReturnScope statement72 =null;
		ParserRuleReturnScope statement74 =null;

		CommonTree string_literal69_tree=null;
		CommonTree string_literal71_tree=null;
		CommonTree string_literal73_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:157:9: ( 'IF' expression 'THEN' statement 'ELSE' statement -> ^( IF_STATEMENT expression ^( TRUE statement ) ^( FALSE statement ) ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:157:17: 'IF' expression 'THEN' statement 'ELSE' statement
			{
			string_literal69=(Token)match(input,56,FOLLOW_56_in_ifStatement1429);  
			stream_56.add(string_literal69);

			pushFollow(FOLLOW_expression_in_ifStatement1431);
			expression70=expression();
			state._fsp--;

			stream_expression.add(expression70.getTree());
			string_literal71=(Token)match(input,60,FOLLOW_60_in_ifStatement1433);  
			stream_60.add(string_literal71);

			pushFollow(FOLLOW_statement_in_ifStatement1451);
			statement72=statement();
			state._fsp--;

			stream_statement.add(statement72.getTree());
			string_literal73=(Token)match(input,53,FOLLOW_53_in_ifStatement1469);  
			stream_53.add(string_literal73);

			pushFollow(FOLLOW_statement_in_ifStatement1487);
			statement74=statement();
			state._fsp--;

			stream_statement.add(statement74.getTree());
			// AST REWRITE
			// elements: statement, statement, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 161:17: -> ^( IF_STATEMENT expression ^( TRUE statement ) ^( FALSE statement ) )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:161:20: ^( IF_STATEMENT expression ^( TRUE statement ) ^( FALSE statement ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF_STATEMENT, "IF_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:161:46: ^( TRUE statement )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRUE, "TRUE"), root_2);
				adaptor.addChild(root_2, stream_statement.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:161:64: ^( FALSE statement )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FALSE, "FALSE"), root_2);
				adaptor.addChild(root_2, stream_statement.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:163:1: whileStatement : 'WHILE' expression 'DO' ( statement )? -> ^( WHILE_STATEMENT expression statement ) ;
	public final LittleNicParser.whileStatement_return whileStatement() throws RecognitionException {
		LittleNicParser.whileStatement_return retval = new LittleNicParser.whileStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal75=null;
		Token string_literal77=null;
		ParserRuleReturnScope expression76 =null;
		ParserRuleReturnScope statement78 =null;

		CommonTree string_literal75_tree=null;
		CommonTree string_literal77_tree=null;
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:164:9: ( 'WHILE' expression 'DO' ( statement )? -> ^( WHILE_STATEMENT expression statement ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:164:17: 'WHILE' expression 'DO' ( statement )?
			{
			string_literal75=(Token)match(input,63,FOLLOW_63_in_whileStatement1560);  
			stream_63.add(string_literal75);

			pushFollow(FOLLOW_expression_in_whileStatement1562);
			expression76=expression();
			state._fsp--;

			stream_expression.add(expression76.getTree());
			string_literal77=(Token)match(input,52,FOLLOW_52_in_whileStatement1564);  
			stream_52.add(string_literal77);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:165:17: ( statement )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENT||LA16_0==50||(LA16_0 >= 56 && LA16_0 <= 57)||LA16_0==63) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:165:17: statement
					{
					pushFollow(FOLLOW_statement_in_whileStatement1582);
					statement78=statement();
					state._fsp--;

					stream_statement.add(statement78.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 166:17: -> ^( WHILE_STATEMENT expression statement )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:166:20: ^( WHILE_STATEMENT expression statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE_STATEMENT, "WHILE_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class procStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procStatement"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:169:1: procStatement : IDENT '(' ( expressions )? ')' -> ^( PROC_STATEMENT IDENT ( expressions )? ) ;
	public final LittleNicParser.procStatement_return procStatement() throws RecognitionException {
		LittleNicParser.procStatement_return retval = new LittleNicParser.procStatement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		ParserRuleReturnScope expressions81 =null;

		CommonTree IDENT79_tree=null;
		CommonTree char_literal80_tree=null;
		CommonTree char_literal82_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:170:9: ( IDENT '(' ( expressions )? ')' -> ^( PROC_STATEMENT IDENT ( expressions )? ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:170:17: IDENT '(' ( expressions )? ')'
			{
			IDENT79=(Token)match(input,IDENT,FOLLOW_IDENT_in_procStatement1641);  
			stream_IDENT.add(IDENT79);

			char_literal80=(Token)match(input,36,FOLLOW_36_in_procStatement1643);  
			stream_36.add(char_literal80);

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:170:27: ( expressions )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BOOLEAN||LA17_0==IDENT||LA17_0==INTEGER||LA17_0==36||LA17_0==39||LA17_0==41) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:170:27: expressions
					{
					pushFollow(FOLLOW_expressions_in_procStatement1645);
					expressions81=expressions();
					state._fsp--;

					stream_expressions.add(expressions81.getTree());
					}
					break;

			}

			char_literal82=(Token)match(input,37,FOLLOW_37_in_procStatement1648);  
			stream_37.add(char_literal82);

			// AST REWRITE
			// elements: IDENT, expressions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 171:11: -> ^( PROC_STATEMENT IDENT ( expressions )? )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:171:14: ^( PROC_STATEMENT IDENT ( expressions )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_STATEMENT, "PROC_STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:171:37: ( expressions )?
				if ( stream_expressions.hasNext() ) {
					adaptor.addChild(root_1, stream_expressions.nextTree());
				}
				stream_expressions.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procStatement"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:175:1: term : ( IDENT | '(' expression ')' | functionalExp | INTEGER | BOOLEAN );
	public final LittleNicParser.term_return term() throws RecognitionException {
		LittleNicParser.term_return retval = new LittleNicParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token INTEGER88=null;
		Token BOOLEAN89=null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope functionalExp87 =null;

		CommonTree IDENT83_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree char_literal86_tree=null;
		CommonTree INTEGER88_tree=null;
		CommonTree BOOLEAN89_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:176:9: ( IDENT | '(' expression ')' | functionalExp | INTEGER | BOOLEAN )
			int alt18=5;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				int LA18_1 = input.LA(2);
				if ( (LA18_1==36) ) {
					alt18=3;
				}
				else if ( (LA18_1==35||(LA18_1 >= 37 && LA18_1 <= 41)||(LA18_1 >= 44 && LA18_1 <= 49)||(LA18_1 >= 52 && LA18_1 <= 54)||LA18_1==60) ) {
					alt18=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 36:
				{
				alt18=2;
				}
				break;
			case INTEGER:
				{
				alt18=4;
				}
				break;
			case BOOLEAN:
				{
				alt18=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:176:11: IDENT
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENT83=(Token)match(input,IDENT,FOLLOW_IDENT_in_term1696); 
					IDENT83_tree = (CommonTree)adaptor.create(IDENT83);
					adaptor.addChild(root_0, IDENT83_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:177:13: '(' expression ')'
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal84=(Token)match(input,36,FOLLOW_36_in_term1717); 
					char_literal84_tree = (CommonTree)adaptor.create(char_literal84);
					adaptor.addChild(root_0, char_literal84_tree);

					pushFollow(FOLLOW_expression_in_term1719);
					expression85=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression85.getTree());

					char_literal86=(Token)match(input,37,FOLLOW_37_in_term1721); 
					char_literal86_tree = (CommonTree)adaptor.create(char_literal86);
					adaptor.addChild(root_0, char_literal86_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:178:11: functionalExp
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionalExp_in_term1736);
					functionalExp87=functionalExp();
					state._fsp--;

					adaptor.addChild(root_0, functionalExp87.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:179:13: INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					INTEGER88=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term1750); 
					INTEGER88_tree = (CommonTree)adaptor.create(INTEGER88);
					adaptor.addChild(root_0, INTEGER88_tree);

					}
					break;
				case 5 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:180:11: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN89=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_term1769); 
					BOOLEAN89_tree = (CommonTree)adaptor.create(BOOLEAN89);
					adaptor.addChild(root_0, BOOLEAN89_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class negatableTerm_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negatableTerm"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:183:1: negatableTerm : INTEGER ;
	public final LittleNicParser.negatableTerm_return negatableTerm() throws RecognitionException {
		LittleNicParser.negatableTerm_return retval = new LittleNicParser.negatableTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INTEGER90=null;

		CommonTree INTEGER90_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:184:8: ( INTEGER )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:184:10: INTEGER
			{
			root_0 = (CommonTree)adaptor.nil();


			INTEGER90=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_negatableTerm1807); 
			INTEGER90_tree = (CommonTree)adaptor.create(INTEGER90);
			adaptor.addChild(root_0, INTEGER90_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negatableTerm"


	public static class unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:187:1: unary : ( ( '+' !)* term | ( negation ^) negatableTerm );
	public final LittleNicParser.unary_return unary() throws RecognitionException {
		LittleNicParser.unary_return retval = new LittleNicParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal91=null;
		ParserRuleReturnScope term92 =null;
		ParserRuleReturnScope negation93 =null;
		ParserRuleReturnScope negatableTerm94 =null;

		CommonTree char_literal91_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:188:9: ( ( '+' !)* term | ( negation ^) negatableTerm )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==BOOLEAN||LA20_0==IDENT||LA20_0==INTEGER||LA20_0==36||LA20_0==39) ) {
				alt20=1;
			}
			else if ( (LA20_0==41) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:188:17: ( '+' !)* term
					{
					root_0 = (CommonTree)adaptor.nil();


					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:188:17: ( '+' !)*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==39) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:188:18: '+' !
							{
							char_literal91=(Token)match(input,39,FOLLOW_39_in_unary1845); 
							}
							break;

						default :
							break loop19;
						}
					}

					pushFollow(FOLLOW_term_in_unary1850);
					term92=term();
					state._fsp--;

					adaptor.addChild(root_0, term92.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:189:12: ( negation ^) negatableTerm
					{
					root_0 = (CommonTree)adaptor.nil();


					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:189:12: ( negation ^)
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:189:13: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary1864);
					negation93=negation();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(negation93.getTree(), root_0);
					}

					pushFollow(FOLLOW_negatableTerm_in_unary1868);
					negatableTerm94=negatableTerm();
					state._fsp--;

					adaptor.addChild(root_0, negatableTerm94.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class negation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:192:1: negation : '-' -> NEGATION ;
	public final LittleNicParser.negation_return negation() throws RecognitionException {
		LittleNicParser.negation_return retval = new LittleNicParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal95=null;

		CommonTree char_literal95_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:193:9: ( '-' -> NEGATION )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:193:12: '-'
			{
			char_literal95=(Token)match(input,41,FOLLOW_41_in_negation1894);  
			stream_41.add(char_literal95);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 193:16: -> NEGATION
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negation"


	public static class mult_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:197:1: mult : unary ( '*' ^ unary )* ;
	public final LittleNicParser.mult_return mult() throws RecognitionException {
		LittleNicParser.mult_return retval = new LittleNicParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal97=null;
		ParserRuleReturnScope unary96 =null;
		ParserRuleReturnScope unary98 =null;

		CommonTree char_literal97_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:198:9: ( unary ( '*' ^ unary )* )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:198:17: unary ( '*' ^ unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult1946);
			unary96=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary96.getTree());

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:198:23: ( '*' ^ unary )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==38) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:198:24: '*' ^ unary
					{
					char_literal97=(Token)match(input,38,FOLLOW_38_in_mult1949); 
					char_literal97_tree = (CommonTree)adaptor.create(char_literal97);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal97_tree, root_0);

					pushFollow(FOLLOW_unary_in_mult1952);
					unary98=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary98.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class add_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:201:1: add : mult ( ( '+' ^| '-' ^) mult )* ;
	public final LittleNicParser.add_return add() throws RecognitionException {
		LittleNicParser.add_return retval = new LittleNicParser.add_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal100=null;
		Token char_literal101=null;
		ParserRuleReturnScope mult99 =null;
		ParserRuleReturnScope mult102 =null;

		CommonTree char_literal100_tree=null;
		CommonTree char_literal101_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:9: ( mult ( ( '+' ^| '-' ^) mult )* )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:17: mult ( ( '+' ^| '-' ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add1986);
			mult99=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult99.getTree());

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:22: ( ( '+' ^| '-' ^) mult )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==39||LA23_0==41) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:23: ( '+' ^| '-' ^) mult
					{
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:23: ( '+' ^| '-' ^)
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==39) ) {
						alt22=1;
					}
					else if ( (LA22_0==41) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:24: '+' ^
							{
							char_literal100=(Token)match(input,39,FOLLOW_39_in_add1990); 
							char_literal100_tree = (CommonTree)adaptor.create(char_literal100);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal100_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:202:31: '-' ^
							{
							char_literal101=(Token)match(input,41,FOLLOW_41_in_add1995); 
							char_literal101_tree = (CommonTree)adaptor.create(char_literal101);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal101_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_add1999);
					mult102=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult102.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:205:1: expression : add ( ( '==' ^| '!=' ^| '<=' ^| '<' ^| '>=' ^| '>' ^) add )* ;
	public final LittleNicParser.expression_return expression() throws RecognitionException {
		LittleNicParser.expression_return retval = new LittleNicParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal104=null;
		Token string_literal105=null;
		Token string_literal106=null;
		Token char_literal107=null;
		Token string_literal108=null;
		Token char_literal109=null;
		ParserRuleReturnScope add103 =null;
		ParserRuleReturnScope add110 =null;

		CommonTree string_literal104_tree=null;
		CommonTree string_literal105_tree=null;
		CommonTree string_literal106_tree=null;
		CommonTree char_literal107_tree=null;
		CommonTree string_literal108_tree=null;
		CommonTree char_literal109_tree=null;

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:9: ( add ( ( '==' ^| '!=' ^| '<=' ^| '<' ^| '>=' ^| '>' ^) add )* )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:13: add ( ( '==' ^| '!=' ^| '<=' ^| '<' ^| '>=' ^| '>' ^) add )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_add_in_expression2029);
			add103=add();
			state._fsp--;

			adaptor.addChild(root_0, add103.getTree());

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:17: ( ( '==' ^| '!=' ^| '<=' ^| '<' ^| '>=' ^| '>' ^) add )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==35||(LA25_0 >= 45 && LA25_0 <= 49)) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:18: ( '==' ^| '!=' ^| '<=' ^| '<' ^| '>=' ^| '>' ^) add
					{
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:18: ( '==' ^| '!=' ^| '<=' ^| '<' ^| '>=' ^| '>' ^)
					int alt24=6;
					switch ( input.LA(1) ) {
					case 47:
						{
						alt24=1;
						}
						break;
					case 35:
						{
						alt24=2;
						}
						break;
					case 46:
						{
						alt24=3;
						}
						break;
					case 45:
						{
						alt24=4;
						}
						break;
					case 49:
						{
						alt24=5;
						}
						break;
					case 48:
						{
						alt24=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:19: '==' ^
							{
							string_literal104=(Token)match(input,47,FOLLOW_47_in_expression2033); 
							string_literal104_tree = (CommonTree)adaptor.create(string_literal104);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal104_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:27: '!=' ^
							{
							string_literal105=(Token)match(input,35,FOLLOW_35_in_expression2038); 
							string_literal105_tree = (CommonTree)adaptor.create(string_literal105);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal105_tree, root_0);

							}
							break;
						case 3 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:35: '<=' ^
							{
							string_literal106=(Token)match(input,46,FOLLOW_46_in_expression2043); 
							string_literal106_tree = (CommonTree)adaptor.create(string_literal106);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal106_tree, root_0);

							}
							break;
						case 4 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:43: '<' ^
							{
							char_literal107=(Token)match(input,45,FOLLOW_45_in_expression2048); 
							char_literal107_tree = (CommonTree)adaptor.create(char_literal107);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal107_tree, root_0);

							}
							break;
						case 5 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:50: '>=' ^
							{
							string_literal108=(Token)match(input,49,FOLLOW_49_in_expression2053); 
							string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
							root_0 = (CommonTree)adaptor.becomeRoot(string_literal108_tree, root_0);

							}
							break;
						case 6 :
							// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:206:58: '>' ^
							{
							char_literal109=(Token)match(input,48,FOLLOW_48_in_expression2058); 
							char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal109_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_add_in_expression2062);
					add110=add();
					state._fsp--;

					adaptor.addChild(root_0, add110.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expressions_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressions"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:209:1: expressions : expression ( ',' expression )* -> ^( EXPRESSIONS expression ( expression )* ) ;
	public final LittleNicParser.expressions_return expressions() throws RecognitionException {
		LittleNicParser.expressions_return retval = new LittleNicParser.expressions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope expression111 =null;
		ParserRuleReturnScope expression113 =null;

		CommonTree char_literal112_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:210:9: ( expression ( ',' expression )* -> ^( EXPRESSIONS expression ( expression )* ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:210:17: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressions2101);
			expression111=expression();
			state._fsp--;

			stream_expression.add(expression111.getTree());
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:210:28: ( ',' expression )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==40) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:210:30: ',' expression
					{
					char_literal112=(Token)match(input,40,FOLLOW_40_in_expressions2105);  
					stream_40.add(char_literal112);

					pushFollow(FOLLOW_expression_in_expressions2107);
					expression113=expression();
					state._fsp--;

					stream_expression.add(expression113.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			// AST REWRITE
			// elements: expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 211:10: -> ^( EXPRESSIONS expression ( expression )* )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:211:13: ^( EXPRESSIONS expression ( expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:211:38: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressions"


	public static class functionalExp_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionalExp"
	// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:214:2: functionalExp : IDENT '(' expressions ')' -> ^( FUNC_CALL IDENT expressions ) ;
	public final LittleNicParser.functionalExp_return functionalExp() throws RecognitionException {
		LittleNicParser.functionalExp_return retval = new LittleNicParser.functionalExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT114=null;
		Token char_literal115=null;
		Token char_literal117=null;
		ParserRuleReturnScope expressions116 =null;

		CommonTree IDENT114_tree=null;
		CommonTree char_literal115_tree=null;
		CommonTree char_literal117_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:215:5: ( IDENT '(' expressions ')' -> ^( FUNC_CALL IDENT expressions ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:215:7: IDENT '(' expressions ')'
			{
			IDENT114=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionalExp2155);  
			stream_IDENT.add(IDENT114);

			char_literal115=(Token)match(input,36,FOLLOW_36_in_functionalExp2157);  
			stream_36.add(char_literal115);

			pushFollow(FOLLOW_expressions_in_functionalExp2159);
			expressions116=expressions();
			state._fsp--;

			stream_expressions.add(expressions116.getTree());
			char_literal117=(Token)match(input,37,FOLLOW_37_in_functionalExp2161);  
			stream_37.add(char_literal117);

			// AST REWRITE
			// elements: IDENT, expressions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 215:34: -> ^( FUNC_CALL IDENT expressions )
			{
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:215:37: ^( FUNC_CALL IDENT expressions )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_expressions.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionalExp"

	// Delegated rules



	public static final BitSet FOLLOW_59_in_program172 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_program174 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_program176 = new BitSet(new long[]{0x4484000000000000L});
	public static final BitSet FOLLOW_declarations_in_program194 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_program213 = new BitSet(new long[]{0x8344000000008000L});
	public static final BitSet FOLLOW_statements_in_program231 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_program250 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_program252 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations319 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_declarations322 = new BitSet(new long[]{0x4480000000000000L});
	public static final BitSet FOLLOW_declaration_in_declarations324 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_varDec_in_declaration380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procDec_in_declaration398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDec_in_declaration416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_varDec448 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_varDec450 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_varDec452 = new BitSet(new long[]{0x2008000000000000L});
	public static final BitSet FOLLOW_type_in_varDec454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDec_in_varDecs502 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_varDecs505 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_varDec_in_varDecs507 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_55_in_funcDec552 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_funcDec554 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_funcDec556 = new BitSet(new long[]{0x0000002000008000L});
	public static final BitSet FOLLOW_parameters_in_funcDec558 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_funcDec561 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_funcDec563 = new BitSet(new long[]{0x2008000000000000L});
	public static final BitSet FOLLOW_type_in_funcDec565 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_funcDec567 = new BitSet(new long[]{0x4004000000000000L});
	public static final BitSet FOLLOW_varDecs_in_funcDec585 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_funcDec604 = new BitSet(new long[]{0x8344000000008000L});
	public static final BitSet FOLLOW_statements_in_funcDec622 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_funcDec641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_procDec718 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_procDec720 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_procDec722 = new BitSet(new long[]{0x0000002000008000L});
	public static final BitSet FOLLOW_parameters_in_procDec724 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_procDec727 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_procDec729 = new BitSet(new long[]{0x4004000000000000L});
	public static final BitSet FOLLOW_varDecs_in_procDec747 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_procDec766 = new BitSet(new long[]{0x8344000000008000L});
	public static final BitSet FOLLOW_statements_in_procDec784 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_procDec803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_parameters866 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_parameters869 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_parameter_in_parameters871 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_IDENT_in_parameter922 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_parameter924 = new BitSet(new long[]{0x2008000000000000L});
	public static final BitSet FOLLOW_type_in_parameter926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_blockStatement1029 = new BitSet(new long[]{0x8344000000008000L});
	public static final BitSet FOLLOW_statements_in_blockStatement1047 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_blockStatement1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements1118 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_statements1121 = new BitSet(new long[]{0x8304000000008000L});
	public static final BitSet FOLLOW_statement_in_statements1123 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_assignStatement_in_statement1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStatement_in_statement1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procStatement_in_statement1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockStatement_in_statement1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignStatement1320 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_assignStatement1322 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_expression_in_assignStatement1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_outStatement1382 = new BitSet(new long[]{0x0000000010008000L});
	public static final BitSet FOLLOW_set_in_outStatement1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_ifStatement1429 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_expression_in_ifStatement1431 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_ifStatement1433 = new BitSet(new long[]{0x8304000000008000L});
	public static final BitSet FOLLOW_statement_in_ifStatement1451 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_ifStatement1469 = new BitSet(new long[]{0x8304000000008000L});
	public static final BitSet FOLLOW_statement_in_ifStatement1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_whileStatement1560 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_expression_in_whileStatement1562 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_whileStatement1564 = new BitSet(new long[]{0x8304000000008002L});
	public static final BitSet FOLLOW_statement_in_whileStatement1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_procStatement1641 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_procStatement1643 = new BitSet(new long[]{0x000002B000028040L});
	public static final BitSet FOLLOW_expressions_in_procStatement1645 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_procStatement1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_term1717 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_expression_in_term1719 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_term1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionalExp_in_term1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_term1750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_term1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_negatableTerm1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_unary1845 = new BitSet(new long[]{0x0000009000028040L});
	public static final BitSet FOLLOW_term_in_unary1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negation_in_unary1864 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_negatableTerm_in_unary1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_negation1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult1946 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_mult1949 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_unary_in_mult1952 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_mult_in_add1986 = new BitSet(new long[]{0x0000028000000002L});
	public static final BitSet FOLLOW_39_in_add1990 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_41_in_add1995 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_mult_in_add1999 = new BitSet(new long[]{0x0000028000000002L});
	public static final BitSet FOLLOW_add_in_expression2029 = new BitSet(new long[]{0x0003E00800000002L});
	public static final BitSet FOLLOW_47_in_expression2033 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_35_in_expression2038 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_46_in_expression2043 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_45_in_expression2048 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_49_in_expression2053 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_48_in_expression2058 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_add_in_expression2062 = new BitSet(new long[]{0x0003E00800000002L});
	public static final BitSet FOLLOW_expression_in_expressions2101 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_expressions2105 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_expression_in_expressions2107 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_IDENT_in_functionalExp2155 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_functionalExp2157 = new BitSet(new long[]{0x0000029000028040L});
	public static final BitSet FOLLOW_expressions_in_functionalExp2159 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_functionalExp2161 = new BitSet(new long[]{0x0000000000000002L});
}
