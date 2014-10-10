// $ANTLR 3.5 C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g 2013-04-25 14:32:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LittleNicLexer extends Lexer {
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

	    public ErrorReporter err;
	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String msg = getErrorMessage(e, tokenNames);
		err.reportSyntaxError(e.line, e.charPositionInLine, msg);
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LittleNicLexer() {} 
	public LittleNicLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:16:7: ( '!=' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:16:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:17:7: ( '(' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:17:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:18:7: ( ')' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:18:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:19:7: ( '*' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:19:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:20:7: ( '+' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:20:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:21:7: ( ',' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:21:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:22:7: ( '-' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:22:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:23:7: ( ':' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:23:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:24:7: ( ':=' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:24:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:25:7: ( ';' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:25:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:26:7: ( '<' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:26:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:27:7: ( '<=' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:27:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:28:7: ( '==' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:28:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:29:7: ( '>' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:29:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:30:7: ( '>=' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:30:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:31:7: ( 'BEGIN' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:31:9: 'BEGIN'
			{
			match("BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:32:7: ( 'COUNT' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:32:9: 'COUNT'
			{
			match("COUNT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:33:7: ( 'DO' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:33:9: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:34:7: ( 'ELSE' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:34:9: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:35:7: ( 'END' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:35:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:36:7: ( 'FUNCTION' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:36:9: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:37:7: ( 'IF' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:37:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:38:7: ( 'OUTPUT' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:38:9: 'OUTPUT'
			{
			match("OUTPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:39:7: ( 'PROCEDURE' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:39:9: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:40:7: ( 'PROGRAM' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:40:9: 'PROGRAM'
			{
			match("PROGRAM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:41:7: ( 'THEN' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:41:9: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:42:7: ( 'TRUTH' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:42:9: 'TRUTH'
			{
			match("TRUTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:43:7: ( 'VAR' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:43:9: 'VAR'
			{
			match("VAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:44:7: ( 'WHILE' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:44:9: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:221:15: ( '0' .. '9' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:222:9: ( ( DIGIT )+ )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:222:11: ( DIGIT )+
			{
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:222:11: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:225:9: ( ( 'T' | 'F' ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='T' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:228:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:229:7: ( LETTER ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:229:9: LETTER ( LETTER | DIGIT | '_' )*
			{
			mLETTER(); 

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:229:16: ( LETTER | DIGIT | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:232:12: ( ( ' ' | '\\n' | '\\r' | '\\t' | '\\f' )+ )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:232:14: ( ' ' | '\\n' | '\\r' | '\\t' | '\\f' )+
			{
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:232:14: ( ' ' | '\\n' | '\\r' | '\\t' | '\\f' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "COMMENTS"
	public final void mCOMMENTS() throws RecognitionException {
		try {
			int _type = COMMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:233:10: ( '/*' ( . )* '*/' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:233:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:233:17: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='*') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='/') ) {
						alt4=2;
					}
					else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:233:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match("*/"); 

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENTS"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:237:9: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:237:17: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:238:17: (~ ( '\"' | '\\n' | '\\r' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | INTEGER | BOOLEAN | IDENT | WHITESPACE | COMMENTS | STRING_LITERAL )
		int alt6=35;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:52: T__42
				{
				mT__42(); 

				}
				break;
			case 9 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:58: T__43
				{
				mT__43(); 

				}
				break;
			case 10 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:64: T__44
				{
				mT__44(); 

				}
				break;
			case 11 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:70: T__45
				{
				mT__45(); 

				}
				break;
			case 12 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:76: T__46
				{
				mT__46(); 

				}
				break;
			case 13 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:82: T__47
				{
				mT__47(); 

				}
				break;
			case 14 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:88: T__48
				{
				mT__48(); 

				}
				break;
			case 15 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:94: T__49
				{
				mT__49(); 

				}
				break;
			case 16 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:100: T__50
				{
				mT__50(); 

				}
				break;
			case 17 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:106: T__51
				{
				mT__51(); 

				}
				break;
			case 18 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:112: T__52
				{
				mT__52(); 

				}
				break;
			case 19 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:118: T__53
				{
				mT__53(); 

				}
				break;
			case 20 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:124: T__54
				{
				mT__54(); 

				}
				break;
			case 21 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:130: T__55
				{
				mT__55(); 

				}
				break;
			case 22 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:136: T__56
				{
				mT__56(); 

				}
				break;
			case 23 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:142: T__57
				{
				mT__57(); 

				}
				break;
			case 24 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:148: T__58
				{
				mT__58(); 

				}
				break;
			case 25 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:154: T__59
				{
				mT__59(); 

				}
				break;
			case 26 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:160: T__60
				{
				mT__60(); 

				}
				break;
			case 27 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:166: T__61
				{
				mT__61(); 

				}
				break;
			case 28 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:172: T__62
				{
				mT__62(); 

				}
				break;
			case 29 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:178: T__63
				{
				mT__63(); 

				}
				break;
			case 30 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:184: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 31 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:192: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 32 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:200: IDENT
				{
				mIDENT(); 

				}
				break;
			case 33 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:206: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 34 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:217: COMMENTS
				{
				mCOMMENTS(); 

				}
				break;
			case 35 :
				// C:\\Users\\Mohammad Ali\\workspace\\COMP2010_LittleNicProject\\src\\LittleNic.g:1:226: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\10\uffff\1\36\1\uffff\1\40\1\uffff\1\42\4\31\1\51\3\31\1\51\2\31\13\uffff"+
		"\2\31\1\63\3\31\1\uffff\1\67\10\31\1\uffff\1\31\1\101\1\31\1\uffff\4\31"+
		"\1\110\3\31\1\114\1\uffff\4\31\1\121\1\31\1\uffff\1\31\1\124\1\125\1\uffff"+
		"\4\31\1\uffff\1\132\1\133\2\uffff\1\31\1\135\2\31\2\uffff\1\31\1\uffff"+
		"\1\31\1\142\1\143\1\31\2\uffff\1\145\1\uffff";
	static final String DFA6_eofS =
		"\146\uffff";
	static final String DFA6_minS =
		"\1\11\7\uffff\1\75\1\uffff\1\75\1\uffff\1\75\1\105\2\117\1\114\1\60\1"+
		"\106\1\125\1\122\1\60\1\101\1\110\13\uffff\1\107\1\125\1\60\1\123\1\104"+
		"\1\116\1\uffff\1\60\1\124\1\117\1\105\1\125\1\122\2\111\1\116\1\uffff"+
		"\1\105\1\60\1\103\1\uffff\1\120\1\103\1\116\1\124\1\60\1\114\1\116\1\124"+
		"\1\60\1\uffff\1\124\1\125\1\105\1\122\1\60\1\110\1\uffff\1\105\2\60\1"+
		"\uffff\1\111\1\124\1\104\1\101\1\uffff\2\60\2\uffff\1\117\1\60\1\125\1"+
		"\115\2\uffff\1\116\1\uffff\1\122\2\60\1\105\2\uffff\1\60\1\uffff";
	static final String DFA6_maxS =
		"\1\172\7\uffff\1\75\1\uffff\1\75\1\uffff\1\75\1\105\2\117\1\116\1\172"+
		"\1\106\1\125\1\122\1\172\1\101\1\110\13\uffff\1\107\1\125\1\172\1\123"+
		"\1\104\1\116\1\uffff\1\172\1\124\1\117\1\105\1\125\1\122\2\111\1\116\1"+
		"\uffff\1\105\1\172\1\103\1\uffff\1\120\1\107\1\116\1\124\1\172\1\114\1"+
		"\116\1\124\1\172\1\uffff\1\124\1\125\1\105\1\122\1\172\1\110\1\uffff\1"+
		"\105\2\172\1\uffff\1\111\1\124\1\104\1\101\1\uffff\2\172\2\uffff\1\117"+
		"\1\172\1\125\1\115\2\uffff\1\116\1\uffff\1\122\2\172\1\105\2\uffff\1\172"+
		"\1\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\15\14\uffff"+
		"\1\36\1\40\1\41\1\42\1\43\1\11\1\10\1\14\1\13\1\17\1\16\6\uffff\1\37\11"+
		"\uffff\1\22\3\uffff\1\26\11\uffff\1\24\6\uffff\1\34\3\uffff\1\23\4\uffff"+
		"\1\32\2\uffff\1\20\1\21\4\uffff\1\33\1\35\1\uffff\1\27\4\uffff\1\31\1"+
		"\25\1\uffff\1\30";
	static final String DFA6_specialS =
		"\146\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\32\1\uffff\2\32\22\uffff\1\32\1\1\1\34\5\uffff\1\2\1\3\1\4\1\5\1\6"+
			"\1\7\1\uffff\1\33\12\30\1\10\1\11\1\12\1\13\1\14\2\uffff\1\31\1\15\1"+
			"\16\1\17\1\20\1\21\2\31\1\22\5\31\1\23\1\24\3\31\1\25\1\31\1\26\1\27"+
			"\3\31\6\uffff\32\31",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\35",
			"",
			"\1\37",
			"",
			"\1\41",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46\1\uffff\1\47",
			"\12\31\7\uffff\24\31\1\50\5\31\4\uffff\1\31\1\uffff\32\31",
			"\1\52",
			"\1\53",
			"\1\54",
			"\12\31\7\uffff\7\31\1\55\11\31\1\56\10\31\4\uffff\1\31\1\uffff\32\31",
			"\1\57",
			"\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\61",
			"\1\62",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\64",
			"\1\65",
			"\1\66",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"",
			"\1\100",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\102",
			"",
			"\1\103",
			"\1\104\3\uffff\1\105",
			"\1\106",
			"\1\107",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\122",
			"",
			"\1\123",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\134",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\136",
			"\1\137",
			"",
			"",
			"\1\140",
			"",
			"\1\141",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\144",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | INTEGER | BOOLEAN | IDENT | WHITESPACE | COMMENTS | STRING_LITERAL );";
		}
	}

}
