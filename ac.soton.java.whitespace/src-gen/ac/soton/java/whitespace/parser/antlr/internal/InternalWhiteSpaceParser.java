package ac.soton.java.whitespace.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.java.whitespace.services.WhiteSpaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhiteSpaceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_LF", "RULE_TAB", "RULE_ML_COMMENT", "RULE_NOTWS"
    };
    public static final int RULE_LF=5;
    public static final int RULE_TAB=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_SPACE=4;
    public static final int EOF=-1;
    public static final int RULE_NOTWS=8;

    // delegates
    // delegators


        public InternalWhiteSpaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhiteSpaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhiteSpaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWhiteSpace.g"; }



     	private WhiteSpaceGrammarAccess grammarAccess;

        public InternalWhiteSpaceParser(TokenStream input, WhiteSpaceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WSProgram";
       	}

       	@Override
       	protected WhiteSpaceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWSProgram"
    // InternalWhiteSpace.g:64:1: entryRuleWSProgram returns [EObject current=null] : iv_ruleWSProgram= ruleWSProgram EOF ;
    public final EObject entryRuleWSProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWSProgram = null;


        try {
            // InternalWhiteSpace.g:64:50: (iv_ruleWSProgram= ruleWSProgram EOF )
            // InternalWhiteSpace.g:65:2: iv_ruleWSProgram= ruleWSProgram EOF
            {
             newCompositeNode(grammarAccess.getWSProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWSProgram=ruleWSProgram();

            state._fsp--;

             current =iv_ruleWSProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWSProgram"


    // $ANTLR start "ruleWSProgram"
    // InternalWhiteSpace.g:71:1: ruleWSProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )+ ;
    public final EObject ruleWSProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )+ )
            // InternalWhiteSpace.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            {
            // InternalWhiteSpace.g:78:2: ( (lv_statements_0_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SPACE && LA1_0<=RULE_TAB)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhiteSpace.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalWhiteSpace.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalWhiteSpace.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getWSProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWSProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"ac.soton.java.whitespace.WhiteSpace.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWSProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalWhiteSpace.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalWhiteSpace.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalWhiteSpace.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalWhiteSpace.g:107:1: ruleStatement returns [EObject current=null] : (this_StackManipulation_0= ruleStackManipulation | this_Arithmetic_1= ruleArithmetic | this_HeapAccess_2= ruleHeapAccess | this_FlowControl_3= ruleFlowControl | this_IO_4= ruleIO ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_StackManipulation_0 = null;

        EObject this_Arithmetic_1 = null;

        EObject this_HeapAccess_2 = null;

        EObject this_FlowControl_3 = null;

        EObject this_IO_4 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:113:2: ( (this_StackManipulation_0= ruleStackManipulation | this_Arithmetic_1= ruleArithmetic | this_HeapAccess_2= ruleHeapAccess | this_FlowControl_3= ruleFlowControl | this_IO_4= ruleIO ) )
            // InternalWhiteSpace.g:114:2: (this_StackManipulation_0= ruleStackManipulation | this_Arithmetic_1= ruleArithmetic | this_HeapAccess_2= ruleHeapAccess | this_FlowControl_3= ruleFlowControl | this_IO_4= ruleIO )
            {
            // InternalWhiteSpace.g:114:2: (this_StackManipulation_0= ruleStackManipulation | this_Arithmetic_1= ruleArithmetic | this_HeapAccess_2= ruleHeapAccess | this_FlowControl_3= ruleFlowControl | this_IO_4= ruleIO )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_SPACE:
                {
                alt2=1;
                }
                break;
            case RULE_TAB:
                {
                switch ( input.LA(2) ) {
                case RULE_LF:
                    {
                    alt2=5;
                    }
                    break;
                case RULE_SPACE:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_TAB:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LF:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWhiteSpace.g:115:3: this_StackManipulation_0= ruleStackManipulation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStackManipulationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StackManipulation_0=ruleStackManipulation();

                    state._fsp--;


                    			current = this_StackManipulation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:124:3: this_Arithmetic_1= ruleArithmetic
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getArithmeticParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arithmetic_1=ruleArithmetic();

                    state._fsp--;


                    			current = this_Arithmetic_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:133:3: this_HeapAccess_2= ruleHeapAccess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getHeapAccessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeapAccess_2=ruleHeapAccess();

                    state._fsp--;


                    			current = this_HeapAccess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:142:3: this_FlowControl_3= ruleFlowControl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFlowControlParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlowControl_3=ruleFlowControl();

                    state._fsp--;


                    			current = this_FlowControl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:151:3: this_IO_4= ruleIO
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIOParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IO_4=ruleIO();

                    state._fsp--;


                    			current = this_IO_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStackManipulation"
    // InternalWhiteSpace.g:163:1: entryRuleStackManipulation returns [EObject current=null] : iv_ruleStackManipulation= ruleStackManipulation EOF ;
    public final EObject entryRuleStackManipulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStackManipulation = null;


        try {
            // InternalWhiteSpace.g:163:58: (iv_ruleStackManipulation= ruleStackManipulation EOF )
            // InternalWhiteSpace.g:164:2: iv_ruleStackManipulation= ruleStackManipulation EOF
            {
             newCompositeNode(grammarAccess.getStackManipulationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStackManipulation=ruleStackManipulation();

            state._fsp--;

             current =iv_ruleStackManipulation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStackManipulation"


    // $ANTLR start "ruleStackManipulation"
    // InternalWhiteSpace.g:170:1: ruleStackManipulation returns [EObject current=null] : (this_SPACE_0= RULE_SPACE (this_Push_1= rulePush | this_Duplicate_2= ruleDuplicate | this_Copy_3= ruleCopy | this_Swap_4= ruleSwap | this_Discard_5= ruleDiscard | this_Slide_6= ruleSlide ) ) ;
    public final EObject ruleStackManipulation() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_0=null;
        EObject this_Push_1 = null;

        EObject this_Duplicate_2 = null;

        EObject this_Copy_3 = null;

        EObject this_Swap_4 = null;

        EObject this_Discard_5 = null;

        EObject this_Slide_6 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:176:2: ( (this_SPACE_0= RULE_SPACE (this_Push_1= rulePush | this_Duplicate_2= ruleDuplicate | this_Copy_3= ruleCopy | this_Swap_4= ruleSwap | this_Discard_5= ruleDiscard | this_Slide_6= ruleSlide ) ) )
            // InternalWhiteSpace.g:177:2: (this_SPACE_0= RULE_SPACE (this_Push_1= rulePush | this_Duplicate_2= ruleDuplicate | this_Copy_3= ruleCopy | this_Swap_4= ruleSwap | this_Discard_5= ruleDiscard | this_Slide_6= ruleSlide ) )
            {
            // InternalWhiteSpace.g:177:2: (this_SPACE_0= RULE_SPACE (this_Push_1= rulePush | this_Duplicate_2= ruleDuplicate | this_Copy_3= ruleCopy | this_Swap_4= ruleSwap | this_Discard_5= ruleDiscard | this_Slide_6= ruleSlide ) )
            // InternalWhiteSpace.g:178:3: this_SPACE_0= RULE_SPACE (this_Push_1= rulePush | this_Duplicate_2= ruleDuplicate | this_Copy_3= ruleCopy | this_Swap_4= ruleSwap | this_Discard_5= ruleDiscard | this_Slide_6= ruleSlide )
            {
            this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_4); 

            			newLeafNode(this_SPACE_0, grammarAccess.getStackManipulationAccess().getSPACETerminalRuleCall_0());
            		
            // InternalWhiteSpace.g:182:3: (this_Push_1= rulePush | this_Duplicate_2= ruleDuplicate | this_Copy_3= ruleCopy | this_Swap_4= ruleSwap | this_Discard_5= ruleDiscard | this_Slide_6= ruleSlide )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_SPACE:
                {
                alt3=1;
                }
                break;
            case RULE_LF:
                {
                switch ( input.LA(2) ) {
                case RULE_SPACE:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_LF:
                    {
                    alt3=5;
                    }
                    break;
                case RULE_TAB:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_TAB:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_SPACE) ) {
                    alt3=3;
                }
                else if ( (LA3_3==RULE_LF) ) {
                    alt3=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWhiteSpace.g:183:4: this_Push_1= rulePush
                    {

                    				newCompositeNode(grammarAccess.getStackManipulationAccess().getPushParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Push_1=rulePush();

                    state._fsp--;


                    				current = this_Push_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:192:4: this_Duplicate_2= ruleDuplicate
                    {

                    				newCompositeNode(grammarAccess.getStackManipulationAccess().getDuplicateParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Duplicate_2=ruleDuplicate();

                    state._fsp--;


                    				current = this_Duplicate_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:201:4: this_Copy_3= ruleCopy
                    {

                    				newCompositeNode(grammarAccess.getStackManipulationAccess().getCopyParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Copy_3=ruleCopy();

                    state._fsp--;


                    				current = this_Copy_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:210:4: this_Swap_4= ruleSwap
                    {

                    				newCompositeNode(grammarAccess.getStackManipulationAccess().getSwapParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_Swap_4=ruleSwap();

                    state._fsp--;


                    				current = this_Swap_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:219:4: this_Discard_5= ruleDiscard
                    {

                    				newCompositeNode(grammarAccess.getStackManipulationAccess().getDiscardParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_Discard_5=ruleDiscard();

                    state._fsp--;


                    				current = this_Discard_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalWhiteSpace.g:228:4: this_Slide_6= ruleSlide
                    {

                    				newCompositeNode(grammarAccess.getStackManipulationAccess().getSlideParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_Slide_6=ruleSlide();

                    state._fsp--;


                    				current = this_Slide_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStackManipulation"


    // $ANTLR start "entryRulePush"
    // InternalWhiteSpace.g:241:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalWhiteSpace.g:241:45: (iv_rulePush= rulePush EOF )
            // InternalWhiteSpace.g:242:2: iv_rulePush= rulePush EOF
            {
             newCompositeNode(grammarAccess.getPushRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePush=rulePush();

            state._fsp--;

             current =iv_rulePush; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePush"


    // $ANTLR start "rulePush"
    // InternalWhiteSpace.g:248:1: rulePush returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE ( (lv_number_2_0= ruleNumber ) ) ) ;
    public final EObject rulePush() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        AntlrDatatypeRuleToken lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:254:2: ( ( () this_SPACE_1= RULE_SPACE ( (lv_number_2_0= ruleNumber ) ) ) )
            // InternalWhiteSpace.g:255:2: ( () this_SPACE_1= RULE_SPACE ( (lv_number_2_0= ruleNumber ) ) )
            {
            // InternalWhiteSpace.g:255:2: ( () this_SPACE_1= RULE_SPACE ( (lv_number_2_0= ruleNumber ) ) )
            // InternalWhiteSpace.g:256:3: () this_SPACE_1= RULE_SPACE ( (lv_number_2_0= ruleNumber ) )
            {
            // InternalWhiteSpace.g:256:3: ()
            // InternalWhiteSpace.g:257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_5); 

            			newLeafNode(this_SPACE_1, grammarAccess.getPushAccess().getSPACETerminalRuleCall_1());
            		
            // InternalWhiteSpace.g:267:3: ( (lv_number_2_0= ruleNumber ) )
            // InternalWhiteSpace.g:268:4: (lv_number_2_0= ruleNumber )
            {
            // InternalWhiteSpace.g:268:4: (lv_number_2_0= ruleNumber )
            // InternalWhiteSpace.g:269:5: lv_number_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getPushAccess().getNumberNumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPushRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_2_0,
            						"ac.soton.java.whitespace.WhiteSpace.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePush"


    // $ANTLR start "entryRuleDuplicate"
    // InternalWhiteSpace.g:290:1: entryRuleDuplicate returns [EObject current=null] : iv_ruleDuplicate= ruleDuplicate EOF ;
    public final EObject entryRuleDuplicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuplicate = null;


        try {
            // InternalWhiteSpace.g:290:50: (iv_ruleDuplicate= ruleDuplicate EOF )
            // InternalWhiteSpace.g:291:2: iv_ruleDuplicate= ruleDuplicate EOF
            {
             newCompositeNode(grammarAccess.getDuplicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuplicate=ruleDuplicate();

            state._fsp--;

             current =iv_ruleDuplicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuplicate"


    // $ANTLR start "ruleDuplicate"
    // InternalWhiteSpace.g:297:1: ruleDuplicate returns [EObject current=null] : ( () this_LF_1= RULE_LF this_SPACE_2= RULE_SPACE ) ;
    public final EObject ruleDuplicate() throws RecognitionException {
        EObject current = null;

        Token this_LF_1=null;
        Token this_SPACE_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:303:2: ( ( () this_LF_1= RULE_LF this_SPACE_2= RULE_SPACE ) )
            // InternalWhiteSpace.g:304:2: ( () this_LF_1= RULE_LF this_SPACE_2= RULE_SPACE )
            {
            // InternalWhiteSpace.g:304:2: ( () this_LF_1= RULE_LF this_SPACE_2= RULE_SPACE )
            // InternalWhiteSpace.g:305:3: () this_LF_1= RULE_LF this_SPACE_2= RULE_SPACE
            {
            // InternalWhiteSpace.g:305:3: ()
            // InternalWhiteSpace.g:306:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDuplicateAccess().getDuplicateAction_0(),
            					current);
            			

            }

            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_6); 

            			newLeafNode(this_LF_1, grammarAccess.getDuplicateAccess().getLFTerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_2); 

            			newLeafNode(this_SPACE_2, grammarAccess.getDuplicateAccess().getSPACETerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuplicate"


    // $ANTLR start "entryRuleCopy"
    // InternalWhiteSpace.g:324:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalWhiteSpace.g:324:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalWhiteSpace.g:325:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalWhiteSpace.g:331:1: ruleCopy returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_number_3_0= ruleNumber ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_SPACE_2=null;
        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:337:2: ( ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_number_3_0= ruleNumber ) ) ) )
            // InternalWhiteSpace.g:338:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_number_3_0= ruleNumber ) ) )
            {
            // InternalWhiteSpace.g:338:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_number_3_0= ruleNumber ) ) )
            // InternalWhiteSpace.g:339:3: () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_number_3_0= ruleNumber ) )
            {
            // InternalWhiteSpace.g:339:3: ()
            // InternalWhiteSpace.g:340:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCopyAccess().getCopyAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_6); 

            			newLeafNode(this_TAB_1, grammarAccess.getCopyAccess().getTABTerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_5); 

            			newLeafNode(this_SPACE_2, grammarAccess.getCopyAccess().getSPACETerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:354:3: ( (lv_number_3_0= ruleNumber ) )
            // InternalWhiteSpace.g:355:4: (lv_number_3_0= ruleNumber )
            {
            // InternalWhiteSpace.g:355:4: (lv_number_3_0= ruleNumber )
            // InternalWhiteSpace.g:356:5: lv_number_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getCopyAccess().getNumberNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCopyRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleSwap"
    // InternalWhiteSpace.g:377:1: entryRuleSwap returns [EObject current=null] : iv_ruleSwap= ruleSwap EOF ;
    public final EObject entryRuleSwap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwap = null;


        try {
            // InternalWhiteSpace.g:377:45: (iv_ruleSwap= ruleSwap EOF )
            // InternalWhiteSpace.g:378:2: iv_ruleSwap= ruleSwap EOF
            {
             newCompositeNode(grammarAccess.getSwapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwap=ruleSwap();

            state._fsp--;

             current =iv_ruleSwap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwap"


    // $ANTLR start "ruleSwap"
    // InternalWhiteSpace.g:384:1: ruleSwap returns [EObject current=null] : ( () this_LF_1= RULE_LF this_TAB_2= RULE_TAB ) ;
    public final EObject ruleSwap() throws RecognitionException {
        EObject current = null;

        Token this_LF_1=null;
        Token this_TAB_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:390:2: ( ( () this_LF_1= RULE_LF this_TAB_2= RULE_TAB ) )
            // InternalWhiteSpace.g:391:2: ( () this_LF_1= RULE_LF this_TAB_2= RULE_TAB )
            {
            // InternalWhiteSpace.g:391:2: ( () this_LF_1= RULE_LF this_TAB_2= RULE_TAB )
            // InternalWhiteSpace.g:392:3: () this_LF_1= RULE_LF this_TAB_2= RULE_TAB
            {
            // InternalWhiteSpace.g:392:3: ()
            // InternalWhiteSpace.g:393:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSwapAccess().getSwapAction_0(),
            					current);
            			

            }

            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_7); 

            			newLeafNode(this_LF_1, grammarAccess.getSwapAccess().getLFTerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_2); 

            			newLeafNode(this_TAB_2, grammarAccess.getSwapAccess().getTABTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwap"


    // $ANTLR start "entryRuleDiscard"
    // InternalWhiteSpace.g:411:1: entryRuleDiscard returns [EObject current=null] : iv_ruleDiscard= ruleDiscard EOF ;
    public final EObject entryRuleDiscard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscard = null;


        try {
            // InternalWhiteSpace.g:411:48: (iv_ruleDiscard= ruleDiscard EOF )
            // InternalWhiteSpace.g:412:2: iv_ruleDiscard= ruleDiscard EOF
            {
             newCompositeNode(grammarAccess.getDiscardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscard=ruleDiscard();

            state._fsp--;

             current =iv_ruleDiscard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscard"


    // $ANTLR start "ruleDiscard"
    // InternalWhiteSpace.g:418:1: ruleDiscard returns [EObject current=null] : ( () this_LF_1= RULE_LF this_LF_2= RULE_LF ) ;
    public final EObject ruleDiscard() throws RecognitionException {
        EObject current = null;

        Token this_LF_1=null;
        Token this_LF_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:424:2: ( ( () this_LF_1= RULE_LF this_LF_2= RULE_LF ) )
            // InternalWhiteSpace.g:425:2: ( () this_LF_1= RULE_LF this_LF_2= RULE_LF )
            {
            // InternalWhiteSpace.g:425:2: ( () this_LF_1= RULE_LF this_LF_2= RULE_LF )
            // InternalWhiteSpace.g:426:3: () this_LF_1= RULE_LF this_LF_2= RULE_LF
            {
            // InternalWhiteSpace.g:426:3: ()
            // InternalWhiteSpace.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiscardAccess().getDiscardAction_0(),
            					current);
            			

            }

            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_8); 

            			newLeafNode(this_LF_1, grammarAccess.getDiscardAccess().getLFTerminalRuleCall_1());
            		
            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_2); 

            			newLeafNode(this_LF_2, grammarAccess.getDiscardAccess().getLFTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscard"


    // $ANTLR start "entryRuleSlide"
    // InternalWhiteSpace.g:445:1: entryRuleSlide returns [EObject current=null] : iv_ruleSlide= ruleSlide EOF ;
    public final EObject entryRuleSlide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlide = null;


        try {
            // InternalWhiteSpace.g:445:46: (iv_ruleSlide= ruleSlide EOF )
            // InternalWhiteSpace.g:446:2: iv_ruleSlide= ruleSlide EOF
            {
             newCompositeNode(grammarAccess.getSlideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlide=ruleSlide();

            state._fsp--;

             current =iv_ruleSlide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSlide"


    // $ANTLR start "ruleSlide"
    // InternalWhiteSpace.g:452:1: ruleSlide returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ( (lv_number_3_0= ruleNumber ) ) ) ;
    public final EObject ruleSlide() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_LF_2=null;
        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:458:2: ( ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ( (lv_number_3_0= ruleNumber ) ) ) )
            // InternalWhiteSpace.g:459:2: ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ( (lv_number_3_0= ruleNumber ) ) )
            {
            // InternalWhiteSpace.g:459:2: ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ( (lv_number_3_0= ruleNumber ) ) )
            // InternalWhiteSpace.g:460:3: () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ( (lv_number_3_0= ruleNumber ) )
            {
            // InternalWhiteSpace.g:460:3: ()
            // InternalWhiteSpace.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSlideAccess().getSlideAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_8); 

            			newLeafNode(this_TAB_1, grammarAccess.getSlideAccess().getTABTerminalRuleCall_1());
            		
            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_5); 

            			newLeafNode(this_LF_2, grammarAccess.getSlideAccess().getLFTerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:475:3: ( (lv_number_3_0= ruleNumber ) )
            // InternalWhiteSpace.g:476:4: (lv_number_3_0= ruleNumber )
            {
            // InternalWhiteSpace.g:476:4: (lv_number_3_0= ruleNumber )
            // InternalWhiteSpace.g:477:5: lv_number_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getSlideAccess().getNumberNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_number_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlideRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlide"


    // $ANTLR start "entryRuleArithmetic"
    // InternalWhiteSpace.g:498:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // InternalWhiteSpace.g:498:51: (iv_ruleArithmetic= ruleArithmetic EOF )
            // InternalWhiteSpace.g:499:2: iv_ruleArithmetic= ruleArithmetic EOF
            {
             newCompositeNode(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArithmetic=ruleArithmetic();

            state._fsp--;

             current =iv_ruleArithmetic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalWhiteSpace.g:505:1: ruleArithmetic returns [EObject current=null] : (this_TAB_0= RULE_TAB this_SPACE_1= RULE_SPACE (this_Addition_2= ruleAddition | this_Subtraction_3= ruleSubtraction | this_Multiplication_4= ruleMultiplication | this_Division_5= ruleDivision | this_Modulo_6= ruleModulo ) ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        Token this_TAB_0=null;
        Token this_SPACE_1=null;
        EObject this_Addition_2 = null;

        EObject this_Subtraction_3 = null;

        EObject this_Multiplication_4 = null;

        EObject this_Division_5 = null;

        EObject this_Modulo_6 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:511:2: ( (this_TAB_0= RULE_TAB this_SPACE_1= RULE_SPACE (this_Addition_2= ruleAddition | this_Subtraction_3= ruleSubtraction | this_Multiplication_4= ruleMultiplication | this_Division_5= ruleDivision | this_Modulo_6= ruleModulo ) ) )
            // InternalWhiteSpace.g:512:2: (this_TAB_0= RULE_TAB this_SPACE_1= RULE_SPACE (this_Addition_2= ruleAddition | this_Subtraction_3= ruleSubtraction | this_Multiplication_4= ruleMultiplication | this_Division_5= ruleDivision | this_Modulo_6= ruleModulo ) )
            {
            // InternalWhiteSpace.g:512:2: (this_TAB_0= RULE_TAB this_SPACE_1= RULE_SPACE (this_Addition_2= ruleAddition | this_Subtraction_3= ruleSubtraction | this_Multiplication_4= ruleMultiplication | this_Division_5= ruleDivision | this_Modulo_6= ruleModulo ) )
            // InternalWhiteSpace.g:513:3: this_TAB_0= RULE_TAB this_SPACE_1= RULE_SPACE (this_Addition_2= ruleAddition | this_Subtraction_3= ruleSubtraction | this_Multiplication_4= ruleMultiplication | this_Division_5= ruleDivision | this_Modulo_6= ruleModulo )
            {
            this_TAB_0=(Token)match(input,RULE_TAB,FOLLOW_6); 

            			newLeafNode(this_TAB_0, grammarAccess.getArithmeticAccess().getTABTerminalRuleCall_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_5); 

            			newLeafNode(this_SPACE_1, grammarAccess.getArithmeticAccess().getSPACETerminalRuleCall_1());
            		
            // InternalWhiteSpace.g:521:3: (this_Addition_2= ruleAddition | this_Subtraction_3= ruleSubtraction | this_Multiplication_4= ruleMultiplication | this_Division_5= ruleDivision | this_Modulo_6= ruleModulo )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SPACE) ) {
                switch ( input.LA(2) ) {
                case RULE_LF:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_TAB:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_SPACE:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==RULE_TAB) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_TAB) ) {
                    alt4=5;
                }
                else if ( (LA4_2==RULE_SPACE) ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWhiteSpace.g:522:4: this_Addition_2= ruleAddition
                    {

                    				newCompositeNode(grammarAccess.getArithmeticAccess().getAdditionParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Addition_2=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:531:4: this_Subtraction_3= ruleSubtraction
                    {

                    				newCompositeNode(grammarAccess.getArithmeticAccess().getSubtractionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Subtraction_3=ruleSubtraction();

                    state._fsp--;


                    				current = this_Subtraction_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:540:4: this_Multiplication_4= ruleMultiplication
                    {

                    				newCompositeNode(grammarAccess.getArithmeticAccess().getMultiplicationParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Multiplication_4=ruleMultiplication();

                    state._fsp--;


                    				current = this_Multiplication_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:549:4: this_Division_5= ruleDivision
                    {

                    				newCompositeNode(grammarAccess.getArithmeticAccess().getDivisionParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_Division_5=ruleDivision();

                    state._fsp--;


                    				current = this_Division_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:558:4: this_Modulo_6= ruleModulo
                    {

                    				newCompositeNode(grammarAccess.getArithmeticAccess().getModuloParserRuleCall_2_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_Modulo_6=ruleModulo();

                    state._fsp--;


                    				current = this_Modulo_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleAddition"
    // InternalWhiteSpace.g:571:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalWhiteSpace.g:571:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalWhiteSpace.g:572:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalWhiteSpace.g:578:1: ruleAddition returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_SPACE_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:584:2: ( ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ) )
            // InternalWhiteSpace.g:585:2: ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE )
            {
            // InternalWhiteSpace.g:585:2: ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE )
            // InternalWhiteSpace.g:586:3: () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE
            {
            // InternalWhiteSpace.g:586:3: ()
            // InternalWhiteSpace.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdditionAccess().getAdditionAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_6); 

            			newLeafNode(this_SPACE_1, grammarAccess.getAdditionAccess().getSPACETerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_2); 

            			newLeafNode(this_SPACE_2, grammarAccess.getAdditionAccess().getSPACETerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtraction"
    // InternalWhiteSpace.g:605:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalWhiteSpace.g:605:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalWhiteSpace.g:606:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalWhiteSpace.g:612:1: ruleSubtraction returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_TAB_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:618:2: ( ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ) )
            // InternalWhiteSpace.g:619:2: ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB )
            {
            // InternalWhiteSpace.g:619:2: ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB )
            // InternalWhiteSpace.g:620:3: () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB
            {
            // InternalWhiteSpace.g:620:3: ()
            // InternalWhiteSpace.g:621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubtractionAccess().getSubtractionAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_7); 

            			newLeafNode(this_SPACE_1, grammarAccess.getSubtractionAccess().getSPACETerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_2); 

            			newLeafNode(this_TAB_2, grammarAccess.getSubtractionAccess().getTABTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalWhiteSpace.g:639:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalWhiteSpace.g:639:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalWhiteSpace.g:640:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalWhiteSpace.g:646:1: ruleMultiplication returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_LF_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:652:2: ( ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ) )
            // InternalWhiteSpace.g:653:2: ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF )
            {
            // InternalWhiteSpace.g:653:2: ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF )
            // InternalWhiteSpace.g:654:3: () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF
            {
            // InternalWhiteSpace.g:654:3: ()
            // InternalWhiteSpace.g:655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultiplicationAccess().getMultiplicationAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_8); 

            			newLeafNode(this_SPACE_1, grammarAccess.getMultiplicationAccess().getSPACETerminalRuleCall_1());
            		
            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_2); 

            			newLeafNode(this_LF_2, grammarAccess.getMultiplicationAccess().getLFTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalWhiteSpace.g:673:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalWhiteSpace.g:673:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalWhiteSpace.g:674:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalWhiteSpace.g:680:1: ruleDivision returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_SPACE_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:686:2: ( ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ) )
            // InternalWhiteSpace.g:687:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE )
            {
            // InternalWhiteSpace.g:687:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE )
            // InternalWhiteSpace.g:688:3: () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE
            {
            // InternalWhiteSpace.g:688:3: ()
            // InternalWhiteSpace.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDivisionAccess().getDivisionAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_6); 

            			newLeafNode(this_TAB_1, grammarAccess.getDivisionAccess().getTABTerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_2); 

            			newLeafNode(this_SPACE_2, grammarAccess.getDivisionAccess().getSPACETerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleModulo"
    // InternalWhiteSpace.g:707:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalWhiteSpace.g:707:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalWhiteSpace.g:708:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalWhiteSpace.g:714:1: ruleModulo returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_TAB_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:720:2: ( ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ) )
            // InternalWhiteSpace.g:721:2: ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB )
            {
            // InternalWhiteSpace.g:721:2: ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB )
            // InternalWhiteSpace.g:722:3: () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB
            {
            // InternalWhiteSpace.g:722:3: ()
            // InternalWhiteSpace.g:723:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModuloAccess().getModuloAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_7); 

            			newLeafNode(this_TAB_1, grammarAccess.getModuloAccess().getTABTerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_2); 

            			newLeafNode(this_TAB_2, grammarAccess.getModuloAccess().getTABTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRuleHeapAccess"
    // InternalWhiteSpace.g:741:1: entryRuleHeapAccess returns [EObject current=null] : iv_ruleHeapAccess= ruleHeapAccess EOF ;
    public final EObject entryRuleHeapAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeapAccess = null;


        try {
            // InternalWhiteSpace.g:741:51: (iv_ruleHeapAccess= ruleHeapAccess EOF )
            // InternalWhiteSpace.g:742:2: iv_ruleHeapAccess= ruleHeapAccess EOF
            {
             newCompositeNode(grammarAccess.getHeapAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeapAccess=ruleHeapAccess();

            state._fsp--;

             current =iv_ruleHeapAccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeapAccess"


    // $ANTLR start "ruleHeapAccess"
    // InternalWhiteSpace.g:748:1: ruleHeapAccess returns [EObject current=null] : (this_TAB_0= RULE_TAB this_TAB_1= RULE_TAB (this_Store_2= ruleStore | this_Retrieve_3= ruleRetrieve ) ) ;
    public final EObject ruleHeapAccess() throws RecognitionException {
        EObject current = null;

        Token this_TAB_0=null;
        Token this_TAB_1=null;
        EObject this_Store_2 = null;

        EObject this_Retrieve_3 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:754:2: ( (this_TAB_0= RULE_TAB this_TAB_1= RULE_TAB (this_Store_2= ruleStore | this_Retrieve_3= ruleRetrieve ) ) )
            // InternalWhiteSpace.g:755:2: (this_TAB_0= RULE_TAB this_TAB_1= RULE_TAB (this_Store_2= ruleStore | this_Retrieve_3= ruleRetrieve ) )
            {
            // InternalWhiteSpace.g:755:2: (this_TAB_0= RULE_TAB this_TAB_1= RULE_TAB (this_Store_2= ruleStore | this_Retrieve_3= ruleRetrieve ) )
            // InternalWhiteSpace.g:756:3: this_TAB_0= RULE_TAB this_TAB_1= RULE_TAB (this_Store_2= ruleStore | this_Retrieve_3= ruleRetrieve )
            {
            this_TAB_0=(Token)match(input,RULE_TAB,FOLLOW_7); 

            			newLeafNode(this_TAB_0, grammarAccess.getHeapAccessAccess().getTABTerminalRuleCall_0());
            		
            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_5); 

            			newLeafNode(this_TAB_1, grammarAccess.getHeapAccessAccess().getTABTerminalRuleCall_1());
            		
            // InternalWhiteSpace.g:764:3: (this_Store_2= ruleStore | this_Retrieve_3= ruleRetrieve )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SPACE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_TAB) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWhiteSpace.g:765:4: this_Store_2= ruleStore
                    {

                    				newCompositeNode(grammarAccess.getHeapAccessAccess().getStoreParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Store_2=ruleStore();

                    state._fsp--;


                    				current = this_Store_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:774:4: this_Retrieve_3= ruleRetrieve
                    {

                    				newCompositeNode(grammarAccess.getHeapAccessAccess().getRetrieveParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Retrieve_3=ruleRetrieve();

                    state._fsp--;


                    				current = this_Retrieve_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeapAccess"


    // $ANTLR start "entryRuleStore"
    // InternalWhiteSpace.g:787:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalWhiteSpace.g:787:46: (iv_ruleStore= ruleStore EOF )
            // InternalWhiteSpace.g:788:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalWhiteSpace.g:794:1: ruleStore returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:800:2: ( ( () this_SPACE_1= RULE_SPACE ) )
            // InternalWhiteSpace.g:801:2: ( () this_SPACE_1= RULE_SPACE )
            {
            // InternalWhiteSpace.g:801:2: ( () this_SPACE_1= RULE_SPACE )
            // InternalWhiteSpace.g:802:3: () this_SPACE_1= RULE_SPACE
            {
            // InternalWhiteSpace.g:802:3: ()
            // InternalWhiteSpace.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoreAccess().getStoreAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_2); 

            			newLeafNode(this_SPACE_1, grammarAccess.getStoreAccess().getSPACETerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleRetrieve"
    // InternalWhiteSpace.g:817:1: entryRuleRetrieve returns [EObject current=null] : iv_ruleRetrieve= ruleRetrieve EOF ;
    public final EObject entryRuleRetrieve() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetrieve = null;


        try {
            // InternalWhiteSpace.g:817:49: (iv_ruleRetrieve= ruleRetrieve EOF )
            // InternalWhiteSpace.g:818:2: iv_ruleRetrieve= ruleRetrieve EOF
            {
             newCompositeNode(grammarAccess.getRetrieveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetrieve=ruleRetrieve();

            state._fsp--;

             current =iv_ruleRetrieve; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetrieve"


    // $ANTLR start "ruleRetrieve"
    // InternalWhiteSpace.g:824:1: ruleRetrieve returns [EObject current=null] : ( () this_TAB_1= RULE_TAB ) ;
    public final EObject ruleRetrieve() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:830:2: ( ( () this_TAB_1= RULE_TAB ) )
            // InternalWhiteSpace.g:831:2: ( () this_TAB_1= RULE_TAB )
            {
            // InternalWhiteSpace.g:831:2: ( () this_TAB_1= RULE_TAB )
            // InternalWhiteSpace.g:832:3: () this_TAB_1= RULE_TAB
            {
            // InternalWhiteSpace.g:832:3: ()
            // InternalWhiteSpace.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRetrieveAccess().getRetrieveAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_2); 

            			newLeafNode(this_TAB_1, grammarAccess.getRetrieveAccess().getTABTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetrieve"


    // $ANTLR start "entryRuleFlowControl"
    // InternalWhiteSpace.g:847:1: entryRuleFlowControl returns [EObject current=null] : iv_ruleFlowControl= ruleFlowControl EOF ;
    public final EObject entryRuleFlowControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowControl = null;


        try {
            // InternalWhiteSpace.g:847:52: (iv_ruleFlowControl= ruleFlowControl EOF )
            // InternalWhiteSpace.g:848:2: iv_ruleFlowControl= ruleFlowControl EOF
            {
             newCompositeNode(grammarAccess.getFlowControlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowControl=ruleFlowControl();

            state._fsp--;

             current =iv_ruleFlowControl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowControl"


    // $ANTLR start "ruleFlowControl"
    // InternalWhiteSpace.g:854:1: ruleFlowControl returns [EObject current=null] : (this_LF_0= RULE_LF (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram ) ) ;
    public final EObject ruleFlowControl() throws RecognitionException {
        EObject current = null;

        Token this_LF_0=null;
        EObject this_MarkLocation_1 = null;

        EObject this_CallSubroutine_2 = null;

        EObject this_UnconditionalJump_3 = null;

        EObject this_ZeroJump_4 = null;

        EObject this_NegativeJump_5 = null;

        EObject this_EndSubroutine_6 = null;

        EObject this_EndProgram_7 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:860:2: ( (this_LF_0= RULE_LF (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram ) ) )
            // InternalWhiteSpace.g:861:2: (this_LF_0= RULE_LF (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram ) )
            {
            // InternalWhiteSpace.g:861:2: (this_LF_0= RULE_LF (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram ) )
            // InternalWhiteSpace.g:862:3: this_LF_0= RULE_LF (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram )
            {
            this_LF_0=(Token)match(input,RULE_LF,FOLLOW_4); 

            			newLeafNode(this_LF_0, grammarAccess.getFlowControlAccess().getLFTerminalRuleCall_0());
            		
            // InternalWhiteSpace.g:866:3: (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalWhiteSpace.g:867:4: this_MarkLocation_1= ruleMarkLocation
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getMarkLocationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_MarkLocation_1=ruleMarkLocation();

                    state._fsp--;


                    				current = this_MarkLocation_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:876:4: this_CallSubroutine_2= ruleCallSubroutine
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getCallSubroutineParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_CallSubroutine_2=ruleCallSubroutine();

                    state._fsp--;


                    				current = this_CallSubroutine_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:885:4: this_UnconditionalJump_3= ruleUnconditionalJump
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getUnconditionalJumpParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_UnconditionalJump_3=ruleUnconditionalJump();

                    state._fsp--;


                    				current = this_UnconditionalJump_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:894:4: this_ZeroJump_4= ruleZeroJump
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getZeroJumpParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_ZeroJump_4=ruleZeroJump();

                    state._fsp--;


                    				current = this_ZeroJump_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:903:4: this_NegativeJump_5= ruleNegativeJump
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getNegativeJumpParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_NegativeJump_5=ruleNegativeJump();

                    state._fsp--;


                    				current = this_NegativeJump_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalWhiteSpace.g:912:4: this_EndSubroutine_6= ruleEndSubroutine
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getEndSubroutineParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_EndSubroutine_6=ruleEndSubroutine();

                    state._fsp--;


                    				current = this_EndSubroutine_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalWhiteSpace.g:921:4: this_EndProgram_7= ruleEndProgram
                    {

                    				newCompositeNode(grammarAccess.getFlowControlAccess().getEndProgramParserRuleCall_1_6());
                    			
                    pushFollow(FOLLOW_2);
                    this_EndProgram_7=ruleEndProgram();

                    state._fsp--;


                    				current = this_EndProgram_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowControl"


    // $ANTLR start "entryRuleMarkLocation"
    // InternalWhiteSpace.g:934:1: entryRuleMarkLocation returns [EObject current=null] : iv_ruleMarkLocation= ruleMarkLocation EOF ;
    public final EObject entryRuleMarkLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkLocation = null;


        try {
            // InternalWhiteSpace.g:934:53: (iv_ruleMarkLocation= ruleMarkLocation EOF )
            // InternalWhiteSpace.g:935:2: iv_ruleMarkLocation= ruleMarkLocation EOF
            {
             newCompositeNode(grammarAccess.getMarkLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkLocation=ruleMarkLocation();

            state._fsp--;

             current =iv_ruleMarkLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkLocation"


    // $ANTLR start "ruleMarkLocation"
    // InternalWhiteSpace.g:941:1: ruleMarkLocation returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) ) ;
    public final EObject ruleMarkLocation() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_SPACE_2=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:947:2: ( ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) ) )
            // InternalWhiteSpace.g:948:2: ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) )
            {
            // InternalWhiteSpace.g:948:2: ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) )
            // InternalWhiteSpace.g:949:3: () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) )
            {
            // InternalWhiteSpace.g:949:3: ()
            // InternalWhiteSpace.g:950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarkLocationAccess().getMarkLocationAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_6); 

            			newLeafNode(this_SPACE_1, grammarAccess.getMarkLocationAccess().getSPACETerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_5); 

            			newLeafNode(this_SPACE_2, grammarAccess.getMarkLocationAccess().getSPACETerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:964:3: ( (lv_label_3_0= ruleLabel ) )
            // InternalWhiteSpace.g:965:4: (lv_label_3_0= ruleLabel )
            {
            // InternalWhiteSpace.g:965:4: (lv_label_3_0= ruleLabel )
            // InternalWhiteSpace.g:966:5: lv_label_3_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getMarkLocationAccess().getLabelLabelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkLocationRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkLocation"


    // $ANTLR start "entryRuleCallSubroutine"
    // InternalWhiteSpace.g:987:1: entryRuleCallSubroutine returns [EObject current=null] : iv_ruleCallSubroutine= ruleCallSubroutine EOF ;
    public final EObject entryRuleCallSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallSubroutine = null;


        try {
            // InternalWhiteSpace.g:987:55: (iv_ruleCallSubroutine= ruleCallSubroutine EOF )
            // InternalWhiteSpace.g:988:2: iv_ruleCallSubroutine= ruleCallSubroutine EOF
            {
             newCompositeNode(grammarAccess.getCallSubroutineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallSubroutine=ruleCallSubroutine();

            state._fsp--;

             current =iv_ruleCallSubroutine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallSubroutine"


    // $ANTLR start "ruleCallSubroutine"
    // InternalWhiteSpace.g:994:1: ruleCallSubroutine returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) ) ;
    public final EObject ruleCallSubroutine() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_TAB_2=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:1000:2: ( ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) ) )
            // InternalWhiteSpace.g:1001:2: ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) )
            {
            // InternalWhiteSpace.g:1001:2: ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) )
            // InternalWhiteSpace.g:1002:3: () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) )
            {
            // InternalWhiteSpace.g:1002:3: ()
            // InternalWhiteSpace.g:1003:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallSubroutineAccess().getCallSubroutineAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_7); 

            			newLeafNode(this_SPACE_1, grammarAccess.getCallSubroutineAccess().getSPACETerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_5); 

            			newLeafNode(this_TAB_2, grammarAccess.getCallSubroutineAccess().getTABTerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:1017:3: ( (lv_label_3_0= ruleLabel ) )
            // InternalWhiteSpace.g:1018:4: (lv_label_3_0= ruleLabel )
            {
            // InternalWhiteSpace.g:1018:4: (lv_label_3_0= ruleLabel )
            // InternalWhiteSpace.g:1019:5: lv_label_3_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getCallSubroutineAccess().getLabelLabelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallSubroutineRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallSubroutine"


    // $ANTLR start "entryRuleUnconditionalJump"
    // InternalWhiteSpace.g:1040:1: entryRuleUnconditionalJump returns [EObject current=null] : iv_ruleUnconditionalJump= ruleUnconditionalJump EOF ;
    public final EObject entryRuleUnconditionalJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionalJump = null;


        try {
            // InternalWhiteSpace.g:1040:58: (iv_ruleUnconditionalJump= ruleUnconditionalJump EOF )
            // InternalWhiteSpace.g:1041:2: iv_ruleUnconditionalJump= ruleUnconditionalJump EOF
            {
             newCompositeNode(grammarAccess.getUnconditionalJumpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnconditionalJump=ruleUnconditionalJump();

            state._fsp--;

             current =iv_ruleUnconditionalJump; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnconditionalJump"


    // $ANTLR start "ruleUnconditionalJump"
    // InternalWhiteSpace.g:1047:1: ruleUnconditionalJump returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ( (lv_label_3_0= ruleLabel ) ) ) ;
    public final EObject ruleUnconditionalJump() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_LF_2=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:1053:2: ( ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ( (lv_label_3_0= ruleLabel ) ) ) )
            // InternalWhiteSpace.g:1054:2: ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ( (lv_label_3_0= ruleLabel ) ) )
            {
            // InternalWhiteSpace.g:1054:2: ( () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ( (lv_label_3_0= ruleLabel ) ) )
            // InternalWhiteSpace.g:1055:3: () this_SPACE_1= RULE_SPACE this_LF_2= RULE_LF ( (lv_label_3_0= ruleLabel ) )
            {
            // InternalWhiteSpace.g:1055:3: ()
            // InternalWhiteSpace.g:1056:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnconditionalJumpAccess().getUnconditionalJumpAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_8); 

            			newLeafNode(this_SPACE_1, grammarAccess.getUnconditionalJumpAccess().getSPACETerminalRuleCall_1());
            		
            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_5); 

            			newLeafNode(this_LF_2, grammarAccess.getUnconditionalJumpAccess().getLFTerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:1070:3: ( (lv_label_3_0= ruleLabel ) )
            // InternalWhiteSpace.g:1071:4: (lv_label_3_0= ruleLabel )
            {
            // InternalWhiteSpace.g:1071:4: (lv_label_3_0= ruleLabel )
            // InternalWhiteSpace.g:1072:5: lv_label_3_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getUnconditionalJumpAccess().getLabelLabelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnconditionalJumpRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnconditionalJump"


    // $ANTLR start "entryRuleZeroJump"
    // InternalWhiteSpace.g:1093:1: entryRuleZeroJump returns [EObject current=null] : iv_ruleZeroJump= ruleZeroJump EOF ;
    public final EObject entryRuleZeroJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZeroJump = null;


        try {
            // InternalWhiteSpace.g:1093:49: (iv_ruleZeroJump= ruleZeroJump EOF )
            // InternalWhiteSpace.g:1094:2: iv_ruleZeroJump= ruleZeroJump EOF
            {
             newCompositeNode(grammarAccess.getZeroJumpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZeroJump=ruleZeroJump();

            state._fsp--;

             current =iv_ruleZeroJump; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleZeroJump"


    // $ANTLR start "ruleZeroJump"
    // InternalWhiteSpace.g:1100:1: ruleZeroJump returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) ) ;
    public final EObject ruleZeroJump() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_SPACE_2=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:1106:2: ( ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) ) )
            // InternalWhiteSpace.g:1107:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) )
            {
            // InternalWhiteSpace.g:1107:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) ) )
            // InternalWhiteSpace.g:1108:3: () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ( (lv_label_3_0= ruleLabel ) )
            {
            // InternalWhiteSpace.g:1108:3: ()
            // InternalWhiteSpace.g:1109:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getZeroJumpAccess().getZeroJumpAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_6); 

            			newLeafNode(this_TAB_1, grammarAccess.getZeroJumpAccess().getTABTerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_5); 

            			newLeafNode(this_SPACE_2, grammarAccess.getZeroJumpAccess().getSPACETerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:1123:3: ( (lv_label_3_0= ruleLabel ) )
            // InternalWhiteSpace.g:1124:4: (lv_label_3_0= ruleLabel )
            {
            // InternalWhiteSpace.g:1124:4: (lv_label_3_0= ruleLabel )
            // InternalWhiteSpace.g:1125:5: lv_label_3_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getZeroJumpAccess().getLabelLabelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZeroJumpRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleZeroJump"


    // $ANTLR start "entryRuleNegativeJump"
    // InternalWhiteSpace.g:1146:1: entryRuleNegativeJump returns [EObject current=null] : iv_ruleNegativeJump= ruleNegativeJump EOF ;
    public final EObject entryRuleNegativeJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeJump = null;


        try {
            // InternalWhiteSpace.g:1146:53: (iv_ruleNegativeJump= ruleNegativeJump EOF )
            // InternalWhiteSpace.g:1147:2: iv_ruleNegativeJump= ruleNegativeJump EOF
            {
             newCompositeNode(grammarAccess.getNegativeJumpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegativeJump=ruleNegativeJump();

            state._fsp--;

             current =iv_ruleNegativeJump; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeJump"


    // $ANTLR start "ruleNegativeJump"
    // InternalWhiteSpace.g:1153:1: ruleNegativeJump returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) ) ;
    public final EObject ruleNegativeJump() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_TAB_2=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:1159:2: ( ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) ) )
            // InternalWhiteSpace.g:1160:2: ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) )
            {
            // InternalWhiteSpace.g:1160:2: ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) ) )
            // InternalWhiteSpace.g:1161:3: () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ( (lv_label_3_0= ruleLabel ) )
            {
            // InternalWhiteSpace.g:1161:3: ()
            // InternalWhiteSpace.g:1162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegativeJumpAccess().getNegativeJumpAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_7); 

            			newLeafNode(this_TAB_1, grammarAccess.getNegativeJumpAccess().getTABTerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_5); 

            			newLeafNode(this_TAB_2, grammarAccess.getNegativeJumpAccess().getTABTerminalRuleCall_2());
            		
            // InternalWhiteSpace.g:1176:3: ( (lv_label_3_0= ruleLabel ) )
            // InternalWhiteSpace.g:1177:4: (lv_label_3_0= ruleLabel )
            {
            // InternalWhiteSpace.g:1177:4: (lv_label_3_0= ruleLabel )
            // InternalWhiteSpace.g:1178:5: lv_label_3_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getNegativeJumpAccess().getLabelLabelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_3_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeJumpRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_3_0,
            						"ac.soton.java.whitespace.WhiteSpace.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeJump"


    // $ANTLR start "entryRuleEndSubroutine"
    // InternalWhiteSpace.g:1199:1: entryRuleEndSubroutine returns [EObject current=null] : iv_ruleEndSubroutine= ruleEndSubroutine EOF ;
    public final EObject entryRuleEndSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndSubroutine = null;


        try {
            // InternalWhiteSpace.g:1199:54: (iv_ruleEndSubroutine= ruleEndSubroutine EOF )
            // InternalWhiteSpace.g:1200:2: iv_ruleEndSubroutine= ruleEndSubroutine EOF
            {
             newCompositeNode(grammarAccess.getEndSubroutineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndSubroutine=ruleEndSubroutine();

            state._fsp--;

             current =iv_ruleEndSubroutine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndSubroutine"


    // $ANTLR start "ruleEndSubroutine"
    // InternalWhiteSpace.g:1206:1: ruleEndSubroutine returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ) ;
    public final EObject ruleEndSubroutine() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_LF_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1212:2: ( ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF ) )
            // InternalWhiteSpace.g:1213:2: ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF )
            {
            // InternalWhiteSpace.g:1213:2: ( () this_TAB_1= RULE_TAB this_LF_2= RULE_LF )
            // InternalWhiteSpace.g:1214:3: () this_TAB_1= RULE_TAB this_LF_2= RULE_LF
            {
            // InternalWhiteSpace.g:1214:3: ()
            // InternalWhiteSpace.g:1215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndSubroutineAccess().getEndSubroutineAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_8); 

            			newLeafNode(this_TAB_1, grammarAccess.getEndSubroutineAccess().getTABTerminalRuleCall_1());
            		
            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_2); 

            			newLeafNode(this_LF_2, grammarAccess.getEndSubroutineAccess().getLFTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndSubroutine"


    // $ANTLR start "entryRuleEndProgram"
    // InternalWhiteSpace.g:1233:1: entryRuleEndProgram returns [EObject current=null] : iv_ruleEndProgram= ruleEndProgram EOF ;
    public final EObject entryRuleEndProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndProgram = null;


        try {
            // InternalWhiteSpace.g:1233:51: (iv_ruleEndProgram= ruleEndProgram EOF )
            // InternalWhiteSpace.g:1234:2: iv_ruleEndProgram= ruleEndProgram EOF
            {
             newCompositeNode(grammarAccess.getEndProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndProgram=ruleEndProgram();

            state._fsp--;

             current =iv_ruleEndProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndProgram"


    // $ANTLR start "ruleEndProgram"
    // InternalWhiteSpace.g:1240:1: ruleEndProgram returns [EObject current=null] : ( () this_LF_1= RULE_LF this_LF_2= RULE_LF ) ;
    public final EObject ruleEndProgram() throws RecognitionException {
        EObject current = null;

        Token this_LF_1=null;
        Token this_LF_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1246:2: ( ( () this_LF_1= RULE_LF this_LF_2= RULE_LF ) )
            // InternalWhiteSpace.g:1247:2: ( () this_LF_1= RULE_LF this_LF_2= RULE_LF )
            {
            // InternalWhiteSpace.g:1247:2: ( () this_LF_1= RULE_LF this_LF_2= RULE_LF )
            // InternalWhiteSpace.g:1248:3: () this_LF_1= RULE_LF this_LF_2= RULE_LF
            {
            // InternalWhiteSpace.g:1248:3: ()
            // InternalWhiteSpace.g:1249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndProgramAccess().getEndProgramAction_0(),
            					current);
            			

            }

            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_8); 

            			newLeafNode(this_LF_1, grammarAccess.getEndProgramAccess().getLFTerminalRuleCall_1());
            		
            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_2); 

            			newLeafNode(this_LF_2, grammarAccess.getEndProgramAccess().getLFTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndProgram"


    // $ANTLR start "entryRuleIO"
    // InternalWhiteSpace.g:1267:1: entryRuleIO returns [EObject current=null] : iv_ruleIO= ruleIO EOF ;
    public final EObject entryRuleIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIO = null;


        try {
            // InternalWhiteSpace.g:1267:43: (iv_ruleIO= ruleIO EOF )
            // InternalWhiteSpace.g:1268:2: iv_ruleIO= ruleIO EOF
            {
             newCompositeNode(grammarAccess.getIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIO=ruleIO();

            state._fsp--;

             current =iv_ruleIO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIO"


    // $ANTLR start "ruleIO"
    // InternalWhiteSpace.g:1274:1: ruleIO returns [EObject current=null] : (this_TAB_0= RULE_TAB this_LF_1= RULE_LF (this_OutputCharacter_2= ruleOutputCharacter | this_OutputNumber_3= ruleOutputNumber | this_ReadCharacter_4= ruleReadCharacter | this_ReadNumber_5= ruleReadNumber ) ) ;
    public final EObject ruleIO() throws RecognitionException {
        EObject current = null;

        Token this_TAB_0=null;
        Token this_LF_1=null;
        EObject this_OutputCharacter_2 = null;

        EObject this_OutputNumber_3 = null;

        EObject this_ReadCharacter_4 = null;

        EObject this_ReadNumber_5 = null;



        	enterRule();

        try {
            // InternalWhiteSpace.g:1280:2: ( (this_TAB_0= RULE_TAB this_LF_1= RULE_LF (this_OutputCharacter_2= ruleOutputCharacter | this_OutputNumber_3= ruleOutputNumber | this_ReadCharacter_4= ruleReadCharacter | this_ReadNumber_5= ruleReadNumber ) ) )
            // InternalWhiteSpace.g:1281:2: (this_TAB_0= RULE_TAB this_LF_1= RULE_LF (this_OutputCharacter_2= ruleOutputCharacter | this_OutputNumber_3= ruleOutputNumber | this_ReadCharacter_4= ruleReadCharacter | this_ReadNumber_5= ruleReadNumber ) )
            {
            // InternalWhiteSpace.g:1281:2: (this_TAB_0= RULE_TAB this_LF_1= RULE_LF (this_OutputCharacter_2= ruleOutputCharacter | this_OutputNumber_3= ruleOutputNumber | this_ReadCharacter_4= ruleReadCharacter | this_ReadNumber_5= ruleReadNumber ) )
            // InternalWhiteSpace.g:1282:3: this_TAB_0= RULE_TAB this_LF_1= RULE_LF (this_OutputCharacter_2= ruleOutputCharacter | this_OutputNumber_3= ruleOutputNumber | this_ReadCharacter_4= ruleReadCharacter | this_ReadNumber_5= ruleReadNumber )
            {
            this_TAB_0=(Token)match(input,RULE_TAB,FOLLOW_8); 

            			newLeafNode(this_TAB_0, grammarAccess.getIOAccess().getTABTerminalRuleCall_0());
            		
            this_LF_1=(Token)match(input,RULE_LF,FOLLOW_5); 

            			newLeafNode(this_LF_1, grammarAccess.getIOAccess().getLFTerminalRuleCall_1());
            		
            // InternalWhiteSpace.g:1290:3: (this_OutputCharacter_2= ruleOutputCharacter | this_OutputNumber_3= ruleOutputNumber | this_ReadCharacter_4= ruleReadCharacter | this_ReadNumber_5= ruleReadNumber )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SPACE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_TAB) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_SPACE) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_TAB) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_TAB) ) {
                    alt7=4;
                }
                else if ( (LA7_2==RULE_SPACE) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWhiteSpace.g:1291:4: this_OutputCharacter_2= ruleOutputCharacter
                    {

                    				newCompositeNode(grammarAccess.getIOAccess().getOutputCharacterParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_OutputCharacter_2=ruleOutputCharacter();

                    state._fsp--;


                    				current = this_OutputCharacter_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:1300:4: this_OutputNumber_3= ruleOutputNumber
                    {

                    				newCompositeNode(grammarAccess.getIOAccess().getOutputNumberParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_OutputNumber_3=ruleOutputNumber();

                    state._fsp--;


                    				current = this_OutputNumber_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:1309:4: this_ReadCharacter_4= ruleReadCharacter
                    {

                    				newCompositeNode(grammarAccess.getIOAccess().getReadCharacterParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReadCharacter_4=ruleReadCharacter();

                    state._fsp--;


                    				current = this_ReadCharacter_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:1318:4: this_ReadNumber_5= ruleReadNumber
                    {

                    				newCompositeNode(grammarAccess.getIOAccess().getReadNumberParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_ReadNumber_5=ruleReadNumber();

                    state._fsp--;


                    				current = this_ReadNumber_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIO"


    // $ANTLR start "entryRuleOutputCharacter"
    // InternalWhiteSpace.g:1331:1: entryRuleOutputCharacter returns [EObject current=null] : iv_ruleOutputCharacter= ruleOutputCharacter EOF ;
    public final EObject entryRuleOutputCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputCharacter = null;


        try {
            // InternalWhiteSpace.g:1331:56: (iv_ruleOutputCharacter= ruleOutputCharacter EOF )
            // InternalWhiteSpace.g:1332:2: iv_ruleOutputCharacter= ruleOutputCharacter EOF
            {
             newCompositeNode(grammarAccess.getOutputCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputCharacter=ruleOutputCharacter();

            state._fsp--;

             current =iv_ruleOutputCharacter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputCharacter"


    // $ANTLR start "ruleOutputCharacter"
    // InternalWhiteSpace.g:1338:1: ruleOutputCharacter returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ) ;
    public final EObject ruleOutputCharacter() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_SPACE_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1344:2: ( ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE ) )
            // InternalWhiteSpace.g:1345:2: ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE )
            {
            // InternalWhiteSpace.g:1345:2: ( () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE )
            // InternalWhiteSpace.g:1346:3: () this_SPACE_1= RULE_SPACE this_SPACE_2= RULE_SPACE
            {
            // InternalWhiteSpace.g:1346:3: ()
            // InternalWhiteSpace.g:1347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputCharacterAccess().getOutputCharacterAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_6); 

            			newLeafNode(this_SPACE_1, grammarAccess.getOutputCharacterAccess().getSPACETerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_2); 

            			newLeafNode(this_SPACE_2, grammarAccess.getOutputCharacterAccess().getSPACETerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputCharacter"


    // $ANTLR start "entryRuleOutputNumber"
    // InternalWhiteSpace.g:1365:1: entryRuleOutputNumber returns [EObject current=null] : iv_ruleOutputNumber= ruleOutputNumber EOF ;
    public final EObject entryRuleOutputNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputNumber = null;


        try {
            // InternalWhiteSpace.g:1365:53: (iv_ruleOutputNumber= ruleOutputNumber EOF )
            // InternalWhiteSpace.g:1366:2: iv_ruleOutputNumber= ruleOutputNumber EOF
            {
             newCompositeNode(grammarAccess.getOutputNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputNumber=ruleOutputNumber();

            state._fsp--;

             current =iv_ruleOutputNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputNumber"


    // $ANTLR start "ruleOutputNumber"
    // InternalWhiteSpace.g:1372:1: ruleOutputNumber returns [EObject current=null] : ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ) ;
    public final EObject ruleOutputNumber() throws RecognitionException {
        EObject current = null;

        Token this_SPACE_1=null;
        Token this_TAB_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1378:2: ( ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB ) )
            // InternalWhiteSpace.g:1379:2: ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB )
            {
            // InternalWhiteSpace.g:1379:2: ( () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB )
            // InternalWhiteSpace.g:1380:3: () this_SPACE_1= RULE_SPACE this_TAB_2= RULE_TAB
            {
            // InternalWhiteSpace.g:1380:3: ()
            // InternalWhiteSpace.g:1381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputNumberAccess().getOutputNumberAction_0(),
            					current);
            			

            }

            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_7); 

            			newLeafNode(this_SPACE_1, grammarAccess.getOutputNumberAccess().getSPACETerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_2); 

            			newLeafNode(this_TAB_2, grammarAccess.getOutputNumberAccess().getTABTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputNumber"


    // $ANTLR start "entryRuleReadCharacter"
    // InternalWhiteSpace.g:1399:1: entryRuleReadCharacter returns [EObject current=null] : iv_ruleReadCharacter= ruleReadCharacter EOF ;
    public final EObject entryRuleReadCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadCharacter = null;


        try {
            // InternalWhiteSpace.g:1399:54: (iv_ruleReadCharacter= ruleReadCharacter EOF )
            // InternalWhiteSpace.g:1400:2: iv_ruleReadCharacter= ruleReadCharacter EOF
            {
             newCompositeNode(grammarAccess.getReadCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadCharacter=ruleReadCharacter();

            state._fsp--;

             current =iv_ruleReadCharacter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadCharacter"


    // $ANTLR start "ruleReadCharacter"
    // InternalWhiteSpace.g:1406:1: ruleReadCharacter returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ) ;
    public final EObject ruleReadCharacter() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_SPACE_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1412:2: ( ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE ) )
            // InternalWhiteSpace.g:1413:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE )
            {
            // InternalWhiteSpace.g:1413:2: ( () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE )
            // InternalWhiteSpace.g:1414:3: () this_TAB_1= RULE_TAB this_SPACE_2= RULE_SPACE
            {
            // InternalWhiteSpace.g:1414:3: ()
            // InternalWhiteSpace.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReadCharacterAccess().getReadCharacterAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_6); 

            			newLeafNode(this_TAB_1, grammarAccess.getReadCharacterAccess().getTABTerminalRuleCall_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_2); 

            			newLeafNode(this_SPACE_2, grammarAccess.getReadCharacterAccess().getSPACETerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadCharacter"


    // $ANTLR start "entryRuleReadNumber"
    // InternalWhiteSpace.g:1433:1: entryRuleReadNumber returns [EObject current=null] : iv_ruleReadNumber= ruleReadNumber EOF ;
    public final EObject entryRuleReadNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadNumber = null;


        try {
            // InternalWhiteSpace.g:1433:51: (iv_ruleReadNumber= ruleReadNumber EOF )
            // InternalWhiteSpace.g:1434:2: iv_ruleReadNumber= ruleReadNumber EOF
            {
             newCompositeNode(grammarAccess.getReadNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadNumber=ruleReadNumber();

            state._fsp--;

             current =iv_ruleReadNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadNumber"


    // $ANTLR start "ruleReadNumber"
    // InternalWhiteSpace.g:1440:1: ruleReadNumber returns [EObject current=null] : ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ) ;
    public final EObject ruleReadNumber() throws RecognitionException {
        EObject current = null;

        Token this_TAB_1=null;
        Token this_TAB_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1446:2: ( ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB ) )
            // InternalWhiteSpace.g:1447:2: ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB )
            {
            // InternalWhiteSpace.g:1447:2: ( () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB )
            // InternalWhiteSpace.g:1448:3: () this_TAB_1= RULE_TAB this_TAB_2= RULE_TAB
            {
            // InternalWhiteSpace.g:1448:3: ()
            // InternalWhiteSpace.g:1449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReadNumberAccess().getReadNumberAction_0(),
            					current);
            			

            }

            this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_7); 

            			newLeafNode(this_TAB_1, grammarAccess.getReadNumberAccess().getTABTerminalRuleCall_1());
            		
            this_TAB_2=(Token)match(input,RULE_TAB,FOLLOW_2); 

            			newLeafNode(this_TAB_2, grammarAccess.getReadNumberAccess().getTABTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadNumber"


    // $ANTLR start "entryRuleNumber"
    // InternalWhiteSpace.g:1467:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalWhiteSpace.g:1467:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalWhiteSpace.g:1468:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalWhiteSpace.g:1474:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_0=null;
        Token this_TAB_1=null;
        Token this_LF_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1480:2: ( ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF ) )
            // InternalWhiteSpace.g:1481:2: ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF )
            {
            // InternalWhiteSpace.g:1481:2: ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF )
            // InternalWhiteSpace.g:1482:3: (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF
            {
            // InternalWhiteSpace.g:1482:3: (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SPACE) ) {
                    alt8=1;
                }
                else if ( (LA8_0==RULE_TAB) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWhiteSpace.g:1483:4: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_4); 

            	    				current.merge(this_SPACE_0);
            	    			

            	    				newLeafNode(this_SPACE_0, grammarAccess.getNumberAccess().getSPACETerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalWhiteSpace.g:1491:4: this_TAB_1= RULE_TAB
            	    {
            	    this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_4); 

            	    				current.merge(this_TAB_1);
            	    			

            	    				newLeafNode(this_TAB_1, grammarAccess.getNumberAccess().getTABTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_2); 

            			current.merge(this_LF_2);
            		

            			newLeafNode(this_LF_2, grammarAccess.getNumberAccess().getLFTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleLabel"
    // InternalWhiteSpace.g:1510:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalWhiteSpace.g:1510:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalWhiteSpace.g:1511:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalWhiteSpace.g:1517:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF ) ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SPACE_0=null;
        Token this_TAB_1=null;
        Token this_LF_2=null;


        	enterRule();

        try {
            // InternalWhiteSpace.g:1523:2: ( ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF ) )
            // InternalWhiteSpace.g:1524:2: ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF )
            {
            // InternalWhiteSpace.g:1524:2: ( (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF )
            // InternalWhiteSpace.g:1525:3: (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+ this_LF_2= RULE_LF
            {
            // InternalWhiteSpace.g:1525:3: (this_SPACE_0= RULE_SPACE | this_TAB_1= RULE_TAB )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SPACE) ) {
                    alt9=1;
                }
                else if ( (LA9_0==RULE_TAB) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWhiteSpace.g:1526:4: this_SPACE_0= RULE_SPACE
            	    {
            	    this_SPACE_0=(Token)match(input,RULE_SPACE,FOLLOW_4); 

            	    				current.merge(this_SPACE_0);
            	    			

            	    				newLeafNode(this_SPACE_0, grammarAccess.getLabelAccess().getSPACETerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalWhiteSpace.g:1534:4: this_TAB_1= RULE_TAB
            	    {
            	    this_TAB_1=(Token)match(input,RULE_TAB,FOLLOW_4); 

            	    				current.merge(this_TAB_1);
            	    			

            	    				newLeafNode(this_TAB_1, grammarAccess.getLabelAccess().getTABTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            this_LF_2=(Token)match(input,RULE_LF,FOLLOW_2); 

            			current.merge(this_LF_2);
            		

            			newLeafNode(this_LF_2, grammarAccess.getLabelAccess().getLFTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\4\7\uffff";
    static final String dfa_3s = "\3\6\7\uffff";
    static final String dfa_4s = "\3\uffff\1\7\1\2\1\3\1\1\1\4\1\5\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\2",
            "\1\6\1\5\1\4",
            "\1\7\1\11\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "866:3: (this_MarkLocation_1= ruleMarkLocation | this_CallSubroutine_2= ruleCallSubroutine | this_UnconditionalJump_3= ruleUnconditionalJump | this_ZeroJump_4= ruleZeroJump | this_NegativeJump_5= ruleNegativeJump | this_EndSubroutine_6= ruleEndSubroutine | this_EndProgram_7= ruleEndProgram )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}