package ac.soton.java.whitespace.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhiteSpaceLexer extends Lexer {
    public static final int RULE_LF=5;
    public static final int RULE_TAB=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_SPACE=4;
    public static final int EOF=-1;
    public static final int RULE_NOTWS=8;

    // delegates
    // delegators

    public InternalWhiteSpaceLexer() {;} 
    public InternalWhiteSpaceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhiteSpaceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWhiteSpace.g"; }

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhiteSpace.g:1552:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWhiteSpace.g:1552:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWhiteSpace.g:1552:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhiteSpace.g:1552:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhiteSpace.g:1554:12: ( ' ' )
            // InternalWhiteSpace.g:1554:14: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhiteSpace.g:1556:10: ( '\\t' )
            // InternalWhiteSpace.g:1556:12: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_LF"
    public final void mRULE_LF() throws RecognitionException {
        try {
            int _type = RULE_LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhiteSpace.g:1558:9: ( '\\n' )
            // InternalWhiteSpace.g:1558:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LF"

    // $ANTLR start "RULE_NOTWS"
    public final void mRULE_NOTWS() throws RecognitionException {
        try {
            int _type = RULE_NOTWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWhiteSpace.g:1560:12: ( (~ ( ( ' ' | '\\t' | '\\n' ) ) )+ )
            // InternalWhiteSpace.g:1560:14: (~ ( ( ' ' | '\\t' | '\\n' ) ) )+
            {
            // InternalWhiteSpace.g:1560:14: (~ ( ( ' ' | '\\t' | '\\n' ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhiteSpace.g:1560:14: ~ ( ( ' ' | '\\t' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTWS"

    public void mTokens() throws RecognitionException {
        // InternalWhiteSpace.g:1:8: ( RULE_ML_COMMENT | RULE_SPACE | RULE_TAB | RULE_LF | RULE_NOTWS )
        int alt3=5;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // InternalWhiteSpace.g:1:10: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 2 :
                // InternalWhiteSpace.g:1:26: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 3 :
                // InternalWhiteSpace.g:1:37: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 4 :
                // InternalWhiteSpace.g:1:46: RULE_LF
                {
                mRULE_LF(); 

                }
                break;
            case 5 :
                // InternalWhiteSpace.g:1:54: RULE_NOTWS
                {
                mRULE_NOTWS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\1\5\4\uffff\2\5\1\uffff\1\5\1\10";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\0\1\52\4\uffff\2\0\1\uffff\2\0";
    static final String DFA3_maxS =
        "\1\uffff\1\52\4\uffff\2\uffff\1\uffff\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\2\uffff\1\1\2\uffff";
    static final String DFA3_specialS =
        "\1\3\5\uffff\1\0\1\1\1\uffff\1\4\1\2}>";
    static final String[] DFA3_transitionS = {
            "\11\5\1\3\1\4\25\5\1\2\16\5\1\1\uffd0\5",
            "\1\6",
            "",
            "",
            "",
            "",
            "\11\11\2\10\25\11\1\10\11\11\1\7\uffd5\11",
            "\11\11\2\10\25\11\1\10\11\11\1\7\4\11\1\12\uffd0\11",
            "",
            "\11\11\2\10\25\11\1\10\11\11\1\7\uffd5\11",
            "\11\11\2\uffff\25\11\1\uffff\11\11\1\7\uffd5\11"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ML_COMMENT | RULE_SPACE | RULE_TAB | RULE_LF | RULE_NOTWS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_6 = input.LA(1);

                        s = -1;
                        if ( (LA3_6=='*') ) {s = 7;}

                        else if ( ((LA3_6>='\t' && LA3_6<='\n')||LA3_6==' ') ) {s = 8;}

                        else if ( ((LA3_6>='\u0000' && LA3_6<='\b')||(LA3_6>='\u000B' && LA3_6<='\u001F')||(LA3_6>='!' && LA3_6<=')')||(LA3_6>='+' && LA3_6<='\uFFFF')) ) {s = 9;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_7 = input.LA(1);

                        s = -1;
                        if ( (LA3_7=='/') ) {s = 10;}

                        else if ( (LA3_7=='*') ) {s = 7;}

                        else if ( ((LA3_7>='\u0000' && LA3_7<='\b')||(LA3_7>='\u000B' && LA3_7<='\u001F')||(LA3_7>='!' && LA3_7<=')')||(LA3_7>='+' && LA3_7<='.')||(LA3_7>='0' && LA3_7<='\uFFFF')) ) {s = 9;}

                        else if ( ((LA3_7>='\t' && LA3_7<='\n')||LA3_7==' ') ) {s = 8;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_10 = input.LA(1);

                        s = -1;
                        if ( (LA3_10=='*') ) {s = 7;}

                        else if ( ((LA3_10>='\u0000' && LA3_10<='\b')||(LA3_10>='\u000B' && LA3_10<='\u001F')||(LA3_10>='!' && LA3_10<=')')||(LA3_10>='+' && LA3_10<='\uFFFF')) ) {s = 9;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_0 = input.LA(1);

                        s = -1;
                        if ( (LA3_0=='/') ) {s = 1;}

                        else if ( (LA3_0==' ') ) {s = 2;}

                        else if ( (LA3_0=='\t') ) {s = 3;}

                        else if ( (LA3_0=='\n') ) {s = 4;}

                        else if ( ((LA3_0>='\u0000' && LA3_0<='\b')||(LA3_0>='\u000B' && LA3_0<='\u001F')||(LA3_0>='!' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='\uFFFF')) ) {s = 5;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_9 = input.LA(1);

                        s = -1;
                        if ( (LA3_9=='*') ) {s = 7;}

                        else if ( ((LA3_9>='\u0000' && LA3_9<='\b')||(LA3_9>='\u000B' && LA3_9<='\u001F')||(LA3_9>='!' && LA3_9<=')')||(LA3_9>='+' && LA3_9<='\uFFFF')) ) {s = 9;}

                        else if ( ((LA3_9>='\t' && LA3_9<='\n')||LA3_9==' ') ) {s = 8;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}