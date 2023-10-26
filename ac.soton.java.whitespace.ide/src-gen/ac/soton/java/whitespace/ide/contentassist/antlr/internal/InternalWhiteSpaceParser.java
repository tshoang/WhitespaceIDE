package ac.soton.java.whitespace.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ac.soton.java.whitespace.services.WhiteSpaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhiteSpaceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_TAB", "RULE_LF", "RULE_ML_COMMENT", "RULE_NOTWS"
    };
    public static final int RULE_LF=6;
    public static final int RULE_TAB=5;
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

    	public void setGrammarAccess(WhiteSpaceGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWSProgram"
    // InternalWhiteSpace.g:53:1: entryRuleWSProgram : ruleWSProgram EOF ;
    public final void entryRuleWSProgram() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:54:1: ( ruleWSProgram EOF )
            // InternalWhiteSpace.g:55:1: ruleWSProgram EOF
            {
             before(grammarAccess.getWSProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleWSProgram();

            state._fsp--;

             after(grammarAccess.getWSProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWSProgram"


    // $ANTLR start "ruleWSProgram"
    // InternalWhiteSpace.g:62:1: ruleWSProgram : ( ( ( rule__WSProgram__StatementsAssignment ) ) ( ( rule__WSProgram__StatementsAssignment )* ) ) ;
    public final void ruleWSProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:66:2: ( ( ( ( rule__WSProgram__StatementsAssignment ) ) ( ( rule__WSProgram__StatementsAssignment )* ) ) )
            // InternalWhiteSpace.g:67:2: ( ( ( rule__WSProgram__StatementsAssignment ) ) ( ( rule__WSProgram__StatementsAssignment )* ) )
            {
            // InternalWhiteSpace.g:67:2: ( ( ( rule__WSProgram__StatementsAssignment ) ) ( ( rule__WSProgram__StatementsAssignment )* ) )
            // InternalWhiteSpace.g:68:3: ( ( rule__WSProgram__StatementsAssignment ) ) ( ( rule__WSProgram__StatementsAssignment )* )
            {
            // InternalWhiteSpace.g:68:3: ( ( rule__WSProgram__StatementsAssignment ) )
            // InternalWhiteSpace.g:69:4: ( rule__WSProgram__StatementsAssignment )
            {
             before(grammarAccess.getWSProgramAccess().getStatementsAssignment()); 
            // InternalWhiteSpace.g:70:4: ( rule__WSProgram__StatementsAssignment )
            // InternalWhiteSpace.g:70:5: rule__WSProgram__StatementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__WSProgram__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWSProgramAccess().getStatementsAssignment()); 

            }

            // InternalWhiteSpace.g:73:3: ( ( rule__WSProgram__StatementsAssignment )* )
            // InternalWhiteSpace.g:74:4: ( rule__WSProgram__StatementsAssignment )*
            {
             before(grammarAccess.getWSProgramAccess().getStatementsAssignment()); 
            // InternalWhiteSpace.g:75:4: ( rule__WSProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SPACE && LA1_0<=RULE_LF)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhiteSpace.g:75:5: rule__WSProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__WSProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWSProgramAccess().getStatementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWSProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalWhiteSpace.g:85:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:86:1: ( ruleStatement EOF )
            // InternalWhiteSpace.g:87:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalWhiteSpace.g:94:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:98:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalWhiteSpace.g:99:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalWhiteSpace.g:99:2: ( ( rule__Statement__Alternatives ) )
            // InternalWhiteSpace.g:100:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalWhiteSpace.g:101:3: ( rule__Statement__Alternatives )
            // InternalWhiteSpace.g:101:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStackManipulation"
    // InternalWhiteSpace.g:110:1: entryRuleStackManipulation : ruleStackManipulation EOF ;
    public final void entryRuleStackManipulation() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:111:1: ( ruleStackManipulation EOF )
            // InternalWhiteSpace.g:112:1: ruleStackManipulation EOF
            {
             before(grammarAccess.getStackManipulationRule()); 
            pushFollow(FOLLOW_1);
            ruleStackManipulation();

            state._fsp--;

             after(grammarAccess.getStackManipulationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStackManipulation"


    // $ANTLR start "ruleStackManipulation"
    // InternalWhiteSpace.g:119:1: ruleStackManipulation : ( ( rule__StackManipulation__Group__0 ) ) ;
    public final void ruleStackManipulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:123:2: ( ( ( rule__StackManipulation__Group__0 ) ) )
            // InternalWhiteSpace.g:124:2: ( ( rule__StackManipulation__Group__0 ) )
            {
            // InternalWhiteSpace.g:124:2: ( ( rule__StackManipulation__Group__0 ) )
            // InternalWhiteSpace.g:125:3: ( rule__StackManipulation__Group__0 )
            {
             before(grammarAccess.getStackManipulationAccess().getGroup()); 
            // InternalWhiteSpace.g:126:3: ( rule__StackManipulation__Group__0 )
            // InternalWhiteSpace.g:126:4: rule__StackManipulation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StackManipulation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStackManipulationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStackManipulation"


    // $ANTLR start "entryRulePush"
    // InternalWhiteSpace.g:135:1: entryRulePush : rulePush EOF ;
    public final void entryRulePush() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:136:1: ( rulePush EOF )
            // InternalWhiteSpace.g:137:1: rulePush EOF
            {
             before(grammarAccess.getPushRule()); 
            pushFollow(FOLLOW_1);
            rulePush();

            state._fsp--;

             after(grammarAccess.getPushRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePush"


    // $ANTLR start "rulePush"
    // InternalWhiteSpace.g:144:1: rulePush : ( ( rule__Push__Group__0 ) ) ;
    public final void rulePush() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:148:2: ( ( ( rule__Push__Group__0 ) ) )
            // InternalWhiteSpace.g:149:2: ( ( rule__Push__Group__0 ) )
            {
            // InternalWhiteSpace.g:149:2: ( ( rule__Push__Group__0 ) )
            // InternalWhiteSpace.g:150:3: ( rule__Push__Group__0 )
            {
             before(grammarAccess.getPushAccess().getGroup()); 
            // InternalWhiteSpace.g:151:3: ( rule__Push__Group__0 )
            // InternalWhiteSpace.g:151:4: rule__Push__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Push__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPushAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePush"


    // $ANTLR start "entryRuleDuplicate"
    // InternalWhiteSpace.g:160:1: entryRuleDuplicate : ruleDuplicate EOF ;
    public final void entryRuleDuplicate() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:161:1: ( ruleDuplicate EOF )
            // InternalWhiteSpace.g:162:1: ruleDuplicate EOF
            {
             before(grammarAccess.getDuplicateRule()); 
            pushFollow(FOLLOW_1);
            ruleDuplicate();

            state._fsp--;

             after(grammarAccess.getDuplicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuplicate"


    // $ANTLR start "ruleDuplicate"
    // InternalWhiteSpace.g:169:1: ruleDuplicate : ( ( rule__Duplicate__Group__0 ) ) ;
    public final void ruleDuplicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:173:2: ( ( ( rule__Duplicate__Group__0 ) ) )
            // InternalWhiteSpace.g:174:2: ( ( rule__Duplicate__Group__0 ) )
            {
            // InternalWhiteSpace.g:174:2: ( ( rule__Duplicate__Group__0 ) )
            // InternalWhiteSpace.g:175:3: ( rule__Duplicate__Group__0 )
            {
             before(grammarAccess.getDuplicateAccess().getGroup()); 
            // InternalWhiteSpace.g:176:3: ( rule__Duplicate__Group__0 )
            // InternalWhiteSpace.g:176:4: rule__Duplicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duplicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDuplicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuplicate"


    // $ANTLR start "entryRuleCopy"
    // InternalWhiteSpace.g:185:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:186:1: ( ruleCopy EOF )
            // InternalWhiteSpace.g:187:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalWhiteSpace.g:194:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:198:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalWhiteSpace.g:199:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalWhiteSpace.g:199:2: ( ( rule__Copy__Group__0 ) )
            // InternalWhiteSpace.g:200:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalWhiteSpace.g:201:3: ( rule__Copy__Group__0 )
            // InternalWhiteSpace.g:201:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleSwap"
    // InternalWhiteSpace.g:210:1: entryRuleSwap : ruleSwap EOF ;
    public final void entryRuleSwap() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:211:1: ( ruleSwap EOF )
            // InternalWhiteSpace.g:212:1: ruleSwap EOF
            {
             before(grammarAccess.getSwapRule()); 
            pushFollow(FOLLOW_1);
            ruleSwap();

            state._fsp--;

             after(grammarAccess.getSwapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSwap"


    // $ANTLR start "ruleSwap"
    // InternalWhiteSpace.g:219:1: ruleSwap : ( ( rule__Swap__Group__0 ) ) ;
    public final void ruleSwap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:223:2: ( ( ( rule__Swap__Group__0 ) ) )
            // InternalWhiteSpace.g:224:2: ( ( rule__Swap__Group__0 ) )
            {
            // InternalWhiteSpace.g:224:2: ( ( rule__Swap__Group__0 ) )
            // InternalWhiteSpace.g:225:3: ( rule__Swap__Group__0 )
            {
             before(grammarAccess.getSwapAccess().getGroup()); 
            // InternalWhiteSpace.g:226:3: ( rule__Swap__Group__0 )
            // InternalWhiteSpace.g:226:4: rule__Swap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Swap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSwapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwap"


    // $ANTLR start "entryRuleDiscard"
    // InternalWhiteSpace.g:235:1: entryRuleDiscard : ruleDiscard EOF ;
    public final void entryRuleDiscard() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:236:1: ( ruleDiscard EOF )
            // InternalWhiteSpace.g:237:1: ruleDiscard EOF
            {
             before(grammarAccess.getDiscardRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscard();

            state._fsp--;

             after(grammarAccess.getDiscardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscard"


    // $ANTLR start "ruleDiscard"
    // InternalWhiteSpace.g:244:1: ruleDiscard : ( ( rule__Discard__Group__0 ) ) ;
    public final void ruleDiscard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:248:2: ( ( ( rule__Discard__Group__0 ) ) )
            // InternalWhiteSpace.g:249:2: ( ( rule__Discard__Group__0 ) )
            {
            // InternalWhiteSpace.g:249:2: ( ( rule__Discard__Group__0 ) )
            // InternalWhiteSpace.g:250:3: ( rule__Discard__Group__0 )
            {
             before(grammarAccess.getDiscardAccess().getGroup()); 
            // InternalWhiteSpace.g:251:3: ( rule__Discard__Group__0 )
            // InternalWhiteSpace.g:251:4: rule__Discard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Discard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscard"


    // $ANTLR start "entryRuleSlide"
    // InternalWhiteSpace.g:260:1: entryRuleSlide : ruleSlide EOF ;
    public final void entryRuleSlide() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:261:1: ( ruleSlide EOF )
            // InternalWhiteSpace.g:262:1: ruleSlide EOF
            {
             before(grammarAccess.getSlideRule()); 
            pushFollow(FOLLOW_1);
            ruleSlide();

            state._fsp--;

             after(grammarAccess.getSlideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSlide"


    // $ANTLR start "ruleSlide"
    // InternalWhiteSpace.g:269:1: ruleSlide : ( ( rule__Slide__Group__0 ) ) ;
    public final void ruleSlide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:273:2: ( ( ( rule__Slide__Group__0 ) ) )
            // InternalWhiteSpace.g:274:2: ( ( rule__Slide__Group__0 ) )
            {
            // InternalWhiteSpace.g:274:2: ( ( rule__Slide__Group__0 ) )
            // InternalWhiteSpace.g:275:3: ( rule__Slide__Group__0 )
            {
             before(grammarAccess.getSlideAccess().getGroup()); 
            // InternalWhiteSpace.g:276:3: ( rule__Slide__Group__0 )
            // InternalWhiteSpace.g:276:4: rule__Slide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Slide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlide"


    // $ANTLR start "entryRuleArithmetic"
    // InternalWhiteSpace.g:285:1: entryRuleArithmetic : ruleArithmetic EOF ;
    public final void entryRuleArithmetic() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:286:1: ( ruleArithmetic EOF )
            // InternalWhiteSpace.g:287:1: ruleArithmetic EOF
            {
             before(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_1);
            ruleArithmetic();

            state._fsp--;

             after(grammarAccess.getArithmeticRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // InternalWhiteSpace.g:294:1: ruleArithmetic : ( ( rule__Arithmetic__Group__0 ) ) ;
    public final void ruleArithmetic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:298:2: ( ( ( rule__Arithmetic__Group__0 ) ) )
            // InternalWhiteSpace.g:299:2: ( ( rule__Arithmetic__Group__0 ) )
            {
            // InternalWhiteSpace.g:299:2: ( ( rule__Arithmetic__Group__0 ) )
            // InternalWhiteSpace.g:300:3: ( rule__Arithmetic__Group__0 )
            {
             before(grammarAccess.getArithmeticAccess().getGroup()); 
            // InternalWhiteSpace.g:301:3: ( rule__Arithmetic__Group__0 )
            // InternalWhiteSpace.g:301:4: rule__Arithmetic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleAddition"
    // InternalWhiteSpace.g:310:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:311:1: ( ruleAddition EOF )
            // InternalWhiteSpace.g:312:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalWhiteSpace.g:319:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:323:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalWhiteSpace.g:324:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalWhiteSpace.g:324:2: ( ( rule__Addition__Group__0 ) )
            // InternalWhiteSpace.g:325:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalWhiteSpace.g:326:3: ( rule__Addition__Group__0 )
            // InternalWhiteSpace.g:326:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleSubtraction"
    // InternalWhiteSpace.g:335:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:336:1: ( ruleSubtraction EOF )
            // InternalWhiteSpace.g:337:1: ruleSubtraction EOF
            {
             before(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getSubtractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalWhiteSpace.g:344:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:348:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // InternalWhiteSpace.g:349:2: ( ( rule__Subtraction__Group__0 ) )
            {
            // InternalWhiteSpace.g:349:2: ( ( rule__Subtraction__Group__0 ) )
            // InternalWhiteSpace.g:350:3: ( rule__Subtraction__Group__0 )
            {
             before(grammarAccess.getSubtractionAccess().getGroup()); 
            // InternalWhiteSpace.g:351:3: ( rule__Subtraction__Group__0 )
            // InternalWhiteSpace.g:351:4: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleMultiplication"
    // InternalWhiteSpace.g:360:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:361:1: ( ruleMultiplication EOF )
            // InternalWhiteSpace.g:362:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalWhiteSpace.g:369:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:373:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalWhiteSpace.g:374:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalWhiteSpace.g:374:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalWhiteSpace.g:375:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalWhiteSpace.g:376:3: ( rule__Multiplication__Group__0 )
            // InternalWhiteSpace.g:376:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalWhiteSpace.g:385:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:386:1: ( ruleDivision EOF )
            // InternalWhiteSpace.g:387:1: ruleDivision EOF
            {
             before(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getDivisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalWhiteSpace.g:394:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:398:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalWhiteSpace.g:399:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalWhiteSpace.g:399:2: ( ( rule__Division__Group__0 ) )
            // InternalWhiteSpace.g:400:3: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // InternalWhiteSpace.g:401:3: ( rule__Division__Group__0 )
            // InternalWhiteSpace.g:401:4: rule__Division__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleModulo"
    // InternalWhiteSpace.g:410:1: entryRuleModulo : ruleModulo EOF ;
    public final void entryRuleModulo() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:411:1: ( ruleModulo EOF )
            // InternalWhiteSpace.g:412:1: ruleModulo EOF
            {
             before(grammarAccess.getModuloRule()); 
            pushFollow(FOLLOW_1);
            ruleModulo();

            state._fsp--;

             after(grammarAccess.getModuloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalWhiteSpace.g:419:1: ruleModulo : ( ( rule__Modulo__Group__0 ) ) ;
    public final void ruleModulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:423:2: ( ( ( rule__Modulo__Group__0 ) ) )
            // InternalWhiteSpace.g:424:2: ( ( rule__Modulo__Group__0 ) )
            {
            // InternalWhiteSpace.g:424:2: ( ( rule__Modulo__Group__0 ) )
            // InternalWhiteSpace.g:425:3: ( rule__Modulo__Group__0 )
            {
             before(grammarAccess.getModuloAccess().getGroup()); 
            // InternalWhiteSpace.g:426:3: ( rule__Modulo__Group__0 )
            // InternalWhiteSpace.g:426:4: rule__Modulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRuleHeapAccess"
    // InternalWhiteSpace.g:435:1: entryRuleHeapAccess : ruleHeapAccess EOF ;
    public final void entryRuleHeapAccess() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:436:1: ( ruleHeapAccess EOF )
            // InternalWhiteSpace.g:437:1: ruleHeapAccess EOF
            {
             before(grammarAccess.getHeapAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleHeapAccess();

            state._fsp--;

             after(grammarAccess.getHeapAccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeapAccess"


    // $ANTLR start "ruleHeapAccess"
    // InternalWhiteSpace.g:444:1: ruleHeapAccess : ( ( rule__HeapAccess__Group__0 ) ) ;
    public final void ruleHeapAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:448:2: ( ( ( rule__HeapAccess__Group__0 ) ) )
            // InternalWhiteSpace.g:449:2: ( ( rule__HeapAccess__Group__0 ) )
            {
            // InternalWhiteSpace.g:449:2: ( ( rule__HeapAccess__Group__0 ) )
            // InternalWhiteSpace.g:450:3: ( rule__HeapAccess__Group__0 )
            {
             before(grammarAccess.getHeapAccessAccess().getGroup()); 
            // InternalWhiteSpace.g:451:3: ( rule__HeapAccess__Group__0 )
            // InternalWhiteSpace.g:451:4: rule__HeapAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeapAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeapAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeapAccess"


    // $ANTLR start "entryRuleStore"
    // InternalWhiteSpace.g:460:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:461:1: ( ruleStore EOF )
            // InternalWhiteSpace.g:462:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalWhiteSpace.g:469:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:473:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalWhiteSpace.g:474:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalWhiteSpace.g:474:2: ( ( rule__Store__Group__0 ) )
            // InternalWhiteSpace.g:475:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalWhiteSpace.g:476:3: ( rule__Store__Group__0 )
            // InternalWhiteSpace.g:476:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleRetrieve"
    // InternalWhiteSpace.g:485:1: entryRuleRetrieve : ruleRetrieve EOF ;
    public final void entryRuleRetrieve() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:486:1: ( ruleRetrieve EOF )
            // InternalWhiteSpace.g:487:1: ruleRetrieve EOF
            {
             before(grammarAccess.getRetrieveRule()); 
            pushFollow(FOLLOW_1);
            ruleRetrieve();

            state._fsp--;

             after(grammarAccess.getRetrieveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRetrieve"


    // $ANTLR start "ruleRetrieve"
    // InternalWhiteSpace.g:494:1: ruleRetrieve : ( ( rule__Retrieve__Group__0 ) ) ;
    public final void ruleRetrieve() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:498:2: ( ( ( rule__Retrieve__Group__0 ) ) )
            // InternalWhiteSpace.g:499:2: ( ( rule__Retrieve__Group__0 ) )
            {
            // InternalWhiteSpace.g:499:2: ( ( rule__Retrieve__Group__0 ) )
            // InternalWhiteSpace.g:500:3: ( rule__Retrieve__Group__0 )
            {
             before(grammarAccess.getRetrieveAccess().getGroup()); 
            // InternalWhiteSpace.g:501:3: ( rule__Retrieve__Group__0 )
            // InternalWhiteSpace.g:501:4: rule__Retrieve__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRetrieveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRetrieve"


    // $ANTLR start "entryRuleFlowControl"
    // InternalWhiteSpace.g:510:1: entryRuleFlowControl : ruleFlowControl EOF ;
    public final void entryRuleFlowControl() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:511:1: ( ruleFlowControl EOF )
            // InternalWhiteSpace.g:512:1: ruleFlowControl EOF
            {
             before(grammarAccess.getFlowControlRule()); 
            pushFollow(FOLLOW_1);
            ruleFlowControl();

            state._fsp--;

             after(grammarAccess.getFlowControlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlowControl"


    // $ANTLR start "ruleFlowControl"
    // InternalWhiteSpace.g:519:1: ruleFlowControl : ( ( rule__FlowControl__Group__0 ) ) ;
    public final void ruleFlowControl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:523:2: ( ( ( rule__FlowControl__Group__0 ) ) )
            // InternalWhiteSpace.g:524:2: ( ( rule__FlowControl__Group__0 ) )
            {
            // InternalWhiteSpace.g:524:2: ( ( rule__FlowControl__Group__0 ) )
            // InternalWhiteSpace.g:525:3: ( rule__FlowControl__Group__0 )
            {
             before(grammarAccess.getFlowControlAccess().getGroup()); 
            // InternalWhiteSpace.g:526:3: ( rule__FlowControl__Group__0 )
            // InternalWhiteSpace.g:526:4: rule__FlowControl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlowControl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowControlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlowControl"


    // $ANTLR start "entryRuleMarkLocation"
    // InternalWhiteSpace.g:535:1: entryRuleMarkLocation : ruleMarkLocation EOF ;
    public final void entryRuleMarkLocation() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:536:1: ( ruleMarkLocation EOF )
            // InternalWhiteSpace.g:537:1: ruleMarkLocation EOF
            {
             before(grammarAccess.getMarkLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkLocation();

            state._fsp--;

             after(grammarAccess.getMarkLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkLocation"


    // $ANTLR start "ruleMarkLocation"
    // InternalWhiteSpace.g:544:1: ruleMarkLocation : ( ( rule__MarkLocation__Group__0 ) ) ;
    public final void ruleMarkLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:548:2: ( ( ( rule__MarkLocation__Group__0 ) ) )
            // InternalWhiteSpace.g:549:2: ( ( rule__MarkLocation__Group__0 ) )
            {
            // InternalWhiteSpace.g:549:2: ( ( rule__MarkLocation__Group__0 ) )
            // InternalWhiteSpace.g:550:3: ( rule__MarkLocation__Group__0 )
            {
             before(grammarAccess.getMarkLocationAccess().getGroup()); 
            // InternalWhiteSpace.g:551:3: ( rule__MarkLocation__Group__0 )
            // InternalWhiteSpace.g:551:4: rule__MarkLocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkLocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkLocation"


    // $ANTLR start "entryRuleCallSubroutine"
    // InternalWhiteSpace.g:560:1: entryRuleCallSubroutine : ruleCallSubroutine EOF ;
    public final void entryRuleCallSubroutine() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:561:1: ( ruleCallSubroutine EOF )
            // InternalWhiteSpace.g:562:1: ruleCallSubroutine EOF
            {
             before(grammarAccess.getCallSubroutineRule()); 
            pushFollow(FOLLOW_1);
            ruleCallSubroutine();

            state._fsp--;

             after(grammarAccess.getCallSubroutineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCallSubroutine"


    // $ANTLR start "ruleCallSubroutine"
    // InternalWhiteSpace.g:569:1: ruleCallSubroutine : ( ( rule__CallSubroutine__Group__0 ) ) ;
    public final void ruleCallSubroutine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:573:2: ( ( ( rule__CallSubroutine__Group__0 ) ) )
            // InternalWhiteSpace.g:574:2: ( ( rule__CallSubroutine__Group__0 ) )
            {
            // InternalWhiteSpace.g:574:2: ( ( rule__CallSubroutine__Group__0 ) )
            // InternalWhiteSpace.g:575:3: ( rule__CallSubroutine__Group__0 )
            {
             before(grammarAccess.getCallSubroutineAccess().getGroup()); 
            // InternalWhiteSpace.g:576:3: ( rule__CallSubroutine__Group__0 )
            // InternalWhiteSpace.g:576:4: rule__CallSubroutine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallSubroutine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallSubroutineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallSubroutine"


    // $ANTLR start "entryRuleUnconditionalJump"
    // InternalWhiteSpace.g:585:1: entryRuleUnconditionalJump : ruleUnconditionalJump EOF ;
    public final void entryRuleUnconditionalJump() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:586:1: ( ruleUnconditionalJump EOF )
            // InternalWhiteSpace.g:587:1: ruleUnconditionalJump EOF
            {
             before(grammarAccess.getUnconditionalJumpRule()); 
            pushFollow(FOLLOW_1);
            ruleUnconditionalJump();

            state._fsp--;

             after(grammarAccess.getUnconditionalJumpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnconditionalJump"


    // $ANTLR start "ruleUnconditionalJump"
    // InternalWhiteSpace.g:594:1: ruleUnconditionalJump : ( ( rule__UnconditionalJump__Group__0 ) ) ;
    public final void ruleUnconditionalJump() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:598:2: ( ( ( rule__UnconditionalJump__Group__0 ) ) )
            // InternalWhiteSpace.g:599:2: ( ( rule__UnconditionalJump__Group__0 ) )
            {
            // InternalWhiteSpace.g:599:2: ( ( rule__UnconditionalJump__Group__0 ) )
            // InternalWhiteSpace.g:600:3: ( rule__UnconditionalJump__Group__0 )
            {
             before(grammarAccess.getUnconditionalJumpAccess().getGroup()); 
            // InternalWhiteSpace.g:601:3: ( rule__UnconditionalJump__Group__0 )
            // InternalWhiteSpace.g:601:4: rule__UnconditionalJump__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalJump__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalJumpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnconditionalJump"


    // $ANTLR start "entryRuleZeroJump"
    // InternalWhiteSpace.g:610:1: entryRuleZeroJump : ruleZeroJump EOF ;
    public final void entryRuleZeroJump() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:611:1: ( ruleZeroJump EOF )
            // InternalWhiteSpace.g:612:1: ruleZeroJump EOF
            {
             before(grammarAccess.getZeroJumpRule()); 
            pushFollow(FOLLOW_1);
            ruleZeroJump();

            state._fsp--;

             after(grammarAccess.getZeroJumpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZeroJump"


    // $ANTLR start "ruleZeroJump"
    // InternalWhiteSpace.g:619:1: ruleZeroJump : ( ( rule__ZeroJump__Group__0 ) ) ;
    public final void ruleZeroJump() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:623:2: ( ( ( rule__ZeroJump__Group__0 ) ) )
            // InternalWhiteSpace.g:624:2: ( ( rule__ZeroJump__Group__0 ) )
            {
            // InternalWhiteSpace.g:624:2: ( ( rule__ZeroJump__Group__0 ) )
            // InternalWhiteSpace.g:625:3: ( rule__ZeroJump__Group__0 )
            {
             before(grammarAccess.getZeroJumpAccess().getGroup()); 
            // InternalWhiteSpace.g:626:3: ( rule__ZeroJump__Group__0 )
            // InternalWhiteSpace.g:626:4: rule__ZeroJump__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ZeroJump__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZeroJumpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZeroJump"


    // $ANTLR start "entryRuleNegativeJump"
    // InternalWhiteSpace.g:635:1: entryRuleNegativeJump : ruleNegativeJump EOF ;
    public final void entryRuleNegativeJump() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:636:1: ( ruleNegativeJump EOF )
            // InternalWhiteSpace.g:637:1: ruleNegativeJump EOF
            {
             before(grammarAccess.getNegativeJumpRule()); 
            pushFollow(FOLLOW_1);
            ruleNegativeJump();

            state._fsp--;

             after(grammarAccess.getNegativeJumpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeJump"


    // $ANTLR start "ruleNegativeJump"
    // InternalWhiteSpace.g:644:1: ruleNegativeJump : ( ( rule__NegativeJump__Group__0 ) ) ;
    public final void ruleNegativeJump() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:648:2: ( ( ( rule__NegativeJump__Group__0 ) ) )
            // InternalWhiteSpace.g:649:2: ( ( rule__NegativeJump__Group__0 ) )
            {
            // InternalWhiteSpace.g:649:2: ( ( rule__NegativeJump__Group__0 ) )
            // InternalWhiteSpace.g:650:3: ( rule__NegativeJump__Group__0 )
            {
             before(grammarAccess.getNegativeJumpAccess().getGroup()); 
            // InternalWhiteSpace.g:651:3: ( rule__NegativeJump__Group__0 )
            // InternalWhiteSpace.g:651:4: rule__NegativeJump__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegativeJump__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegativeJumpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeJump"


    // $ANTLR start "entryRuleEndSubroutine"
    // InternalWhiteSpace.g:660:1: entryRuleEndSubroutine : ruleEndSubroutine EOF ;
    public final void entryRuleEndSubroutine() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:661:1: ( ruleEndSubroutine EOF )
            // InternalWhiteSpace.g:662:1: ruleEndSubroutine EOF
            {
             before(grammarAccess.getEndSubroutineRule()); 
            pushFollow(FOLLOW_1);
            ruleEndSubroutine();

            state._fsp--;

             after(grammarAccess.getEndSubroutineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndSubroutine"


    // $ANTLR start "ruleEndSubroutine"
    // InternalWhiteSpace.g:669:1: ruleEndSubroutine : ( ( rule__EndSubroutine__Group__0 ) ) ;
    public final void ruleEndSubroutine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:673:2: ( ( ( rule__EndSubroutine__Group__0 ) ) )
            // InternalWhiteSpace.g:674:2: ( ( rule__EndSubroutine__Group__0 ) )
            {
            // InternalWhiteSpace.g:674:2: ( ( rule__EndSubroutine__Group__0 ) )
            // InternalWhiteSpace.g:675:3: ( rule__EndSubroutine__Group__0 )
            {
             before(grammarAccess.getEndSubroutineAccess().getGroup()); 
            // InternalWhiteSpace.g:676:3: ( rule__EndSubroutine__Group__0 )
            // InternalWhiteSpace.g:676:4: rule__EndSubroutine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndSubroutine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndSubroutineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndSubroutine"


    // $ANTLR start "entryRuleEndProgram"
    // InternalWhiteSpace.g:685:1: entryRuleEndProgram : ruleEndProgram EOF ;
    public final void entryRuleEndProgram() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:686:1: ( ruleEndProgram EOF )
            // InternalWhiteSpace.g:687:1: ruleEndProgram EOF
            {
             before(grammarAccess.getEndProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleEndProgram();

            state._fsp--;

             after(grammarAccess.getEndProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndProgram"


    // $ANTLR start "ruleEndProgram"
    // InternalWhiteSpace.g:694:1: ruleEndProgram : ( ( rule__EndProgram__Group__0 ) ) ;
    public final void ruleEndProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:698:2: ( ( ( rule__EndProgram__Group__0 ) ) )
            // InternalWhiteSpace.g:699:2: ( ( rule__EndProgram__Group__0 ) )
            {
            // InternalWhiteSpace.g:699:2: ( ( rule__EndProgram__Group__0 ) )
            // InternalWhiteSpace.g:700:3: ( rule__EndProgram__Group__0 )
            {
             before(grammarAccess.getEndProgramAccess().getGroup()); 
            // InternalWhiteSpace.g:701:3: ( rule__EndProgram__Group__0 )
            // InternalWhiteSpace.g:701:4: rule__EndProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndProgram"


    // $ANTLR start "entryRuleIO"
    // InternalWhiteSpace.g:710:1: entryRuleIO : ruleIO EOF ;
    public final void entryRuleIO() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:711:1: ( ruleIO EOF )
            // InternalWhiteSpace.g:712:1: ruleIO EOF
            {
             before(grammarAccess.getIORule()); 
            pushFollow(FOLLOW_1);
            ruleIO();

            state._fsp--;

             after(grammarAccess.getIORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIO"


    // $ANTLR start "ruleIO"
    // InternalWhiteSpace.g:719:1: ruleIO : ( ( rule__IO__Group__0 ) ) ;
    public final void ruleIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:723:2: ( ( ( rule__IO__Group__0 ) ) )
            // InternalWhiteSpace.g:724:2: ( ( rule__IO__Group__0 ) )
            {
            // InternalWhiteSpace.g:724:2: ( ( rule__IO__Group__0 ) )
            // InternalWhiteSpace.g:725:3: ( rule__IO__Group__0 )
            {
             before(grammarAccess.getIOAccess().getGroup()); 
            // InternalWhiteSpace.g:726:3: ( rule__IO__Group__0 )
            // InternalWhiteSpace.g:726:4: rule__IO__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIOAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIO"


    // $ANTLR start "entryRuleOutputCharacter"
    // InternalWhiteSpace.g:735:1: entryRuleOutputCharacter : ruleOutputCharacter EOF ;
    public final void entryRuleOutputCharacter() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:736:1: ( ruleOutputCharacter EOF )
            // InternalWhiteSpace.g:737:1: ruleOutputCharacter EOF
            {
             before(grammarAccess.getOutputCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputCharacter();

            state._fsp--;

             after(grammarAccess.getOutputCharacterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputCharacter"


    // $ANTLR start "ruleOutputCharacter"
    // InternalWhiteSpace.g:744:1: ruleOutputCharacter : ( ( rule__OutputCharacter__Group__0 ) ) ;
    public final void ruleOutputCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:748:2: ( ( ( rule__OutputCharacter__Group__0 ) ) )
            // InternalWhiteSpace.g:749:2: ( ( rule__OutputCharacter__Group__0 ) )
            {
            // InternalWhiteSpace.g:749:2: ( ( rule__OutputCharacter__Group__0 ) )
            // InternalWhiteSpace.g:750:3: ( rule__OutputCharacter__Group__0 )
            {
             before(grammarAccess.getOutputCharacterAccess().getGroup()); 
            // InternalWhiteSpace.g:751:3: ( rule__OutputCharacter__Group__0 )
            // InternalWhiteSpace.g:751:4: rule__OutputCharacter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputCharacter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputCharacterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputCharacter"


    // $ANTLR start "entryRuleOutputNumber"
    // InternalWhiteSpace.g:760:1: entryRuleOutputNumber : ruleOutputNumber EOF ;
    public final void entryRuleOutputNumber() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:761:1: ( ruleOutputNumber EOF )
            // InternalWhiteSpace.g:762:1: ruleOutputNumber EOF
            {
             before(grammarAccess.getOutputNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputNumber();

            state._fsp--;

             after(grammarAccess.getOutputNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputNumber"


    // $ANTLR start "ruleOutputNumber"
    // InternalWhiteSpace.g:769:1: ruleOutputNumber : ( ( rule__OutputNumber__Group__0 ) ) ;
    public final void ruleOutputNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:773:2: ( ( ( rule__OutputNumber__Group__0 ) ) )
            // InternalWhiteSpace.g:774:2: ( ( rule__OutputNumber__Group__0 ) )
            {
            // InternalWhiteSpace.g:774:2: ( ( rule__OutputNumber__Group__0 ) )
            // InternalWhiteSpace.g:775:3: ( rule__OutputNumber__Group__0 )
            {
             before(grammarAccess.getOutputNumberAccess().getGroup()); 
            // InternalWhiteSpace.g:776:3: ( rule__OutputNumber__Group__0 )
            // InternalWhiteSpace.g:776:4: rule__OutputNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputNumber"


    // $ANTLR start "entryRuleReadCharacter"
    // InternalWhiteSpace.g:785:1: entryRuleReadCharacter : ruleReadCharacter EOF ;
    public final void entryRuleReadCharacter() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:786:1: ( ruleReadCharacter EOF )
            // InternalWhiteSpace.g:787:1: ruleReadCharacter EOF
            {
             before(grammarAccess.getReadCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleReadCharacter();

            state._fsp--;

             after(grammarAccess.getReadCharacterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadCharacter"


    // $ANTLR start "ruleReadCharacter"
    // InternalWhiteSpace.g:794:1: ruleReadCharacter : ( ( rule__ReadCharacter__Group__0 ) ) ;
    public final void ruleReadCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:798:2: ( ( ( rule__ReadCharacter__Group__0 ) ) )
            // InternalWhiteSpace.g:799:2: ( ( rule__ReadCharacter__Group__0 ) )
            {
            // InternalWhiteSpace.g:799:2: ( ( rule__ReadCharacter__Group__0 ) )
            // InternalWhiteSpace.g:800:3: ( rule__ReadCharacter__Group__0 )
            {
             before(grammarAccess.getReadCharacterAccess().getGroup()); 
            // InternalWhiteSpace.g:801:3: ( rule__ReadCharacter__Group__0 )
            // InternalWhiteSpace.g:801:4: rule__ReadCharacter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadCharacter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadCharacterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadCharacter"


    // $ANTLR start "entryRuleReadNumber"
    // InternalWhiteSpace.g:810:1: entryRuleReadNumber : ruleReadNumber EOF ;
    public final void entryRuleReadNumber() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:811:1: ( ruleReadNumber EOF )
            // InternalWhiteSpace.g:812:1: ruleReadNumber EOF
            {
             before(grammarAccess.getReadNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleReadNumber();

            state._fsp--;

             after(grammarAccess.getReadNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadNumber"


    // $ANTLR start "ruleReadNumber"
    // InternalWhiteSpace.g:819:1: ruleReadNumber : ( ( rule__ReadNumber__Group__0 ) ) ;
    public final void ruleReadNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:823:2: ( ( ( rule__ReadNumber__Group__0 ) ) )
            // InternalWhiteSpace.g:824:2: ( ( rule__ReadNumber__Group__0 ) )
            {
            // InternalWhiteSpace.g:824:2: ( ( rule__ReadNumber__Group__0 ) )
            // InternalWhiteSpace.g:825:3: ( rule__ReadNumber__Group__0 )
            {
             before(grammarAccess.getReadNumberAccess().getGroup()); 
            // InternalWhiteSpace.g:826:3: ( rule__ReadNumber__Group__0 )
            // InternalWhiteSpace.g:826:4: rule__ReadNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReadNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadNumber"


    // $ANTLR start "entryRuleNumber"
    // InternalWhiteSpace.g:835:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:836:1: ( ruleNumber EOF )
            // InternalWhiteSpace.g:837:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalWhiteSpace.g:844:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:848:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalWhiteSpace.g:849:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalWhiteSpace.g:849:2: ( ( rule__Number__Group__0 ) )
            // InternalWhiteSpace.g:850:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalWhiteSpace.g:851:3: ( rule__Number__Group__0 )
            // InternalWhiteSpace.g:851:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleLabel"
    // InternalWhiteSpace.g:860:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalWhiteSpace.g:861:1: ( ruleLabel EOF )
            // InternalWhiteSpace.g:862:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalWhiteSpace.g:869:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:873:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalWhiteSpace.g:874:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalWhiteSpace.g:874:2: ( ( rule__Label__Group__0 ) )
            // InternalWhiteSpace.g:875:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalWhiteSpace.g:876:3: ( rule__Label__Group__0 )
            // InternalWhiteSpace.g:876:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalWhiteSpace.g:884:1: rule__Statement__Alternatives : ( ( ruleStackManipulation ) | ( ruleArithmetic ) | ( ruleHeapAccess ) | ( ruleFlowControl ) | ( ruleIO ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:888:1: ( ( ruleStackManipulation ) | ( ruleArithmetic ) | ( ruleHeapAccess ) | ( ruleFlowControl ) | ( ruleIO ) )
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
                case RULE_TAB:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_SPACE:
                    {
                    alt2=2;
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
                    // InternalWhiteSpace.g:889:2: ( ruleStackManipulation )
                    {
                    // InternalWhiteSpace.g:889:2: ( ruleStackManipulation )
                    // InternalWhiteSpace.g:890:3: ruleStackManipulation
                    {
                     before(grammarAccess.getStatementAccess().getStackManipulationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStackManipulation();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStackManipulationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:895:2: ( ruleArithmetic )
                    {
                    // InternalWhiteSpace.g:895:2: ( ruleArithmetic )
                    // InternalWhiteSpace.g:896:3: ruleArithmetic
                    {
                     before(grammarAccess.getStatementAccess().getArithmeticParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArithmetic();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getArithmeticParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:901:2: ( ruleHeapAccess )
                    {
                    // InternalWhiteSpace.g:901:2: ( ruleHeapAccess )
                    // InternalWhiteSpace.g:902:3: ruleHeapAccess
                    {
                     before(grammarAccess.getStatementAccess().getHeapAccessParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHeapAccess();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getHeapAccessParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:907:2: ( ruleFlowControl )
                    {
                    // InternalWhiteSpace.g:907:2: ( ruleFlowControl )
                    // InternalWhiteSpace.g:908:3: ruleFlowControl
                    {
                     before(grammarAccess.getStatementAccess().getFlowControlParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFlowControl();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFlowControlParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:913:2: ( ruleIO )
                    {
                    // InternalWhiteSpace.g:913:2: ( ruleIO )
                    // InternalWhiteSpace.g:914:3: ruleIO
                    {
                     before(grammarAccess.getStatementAccess().getIOParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleIO();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIOParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__StackManipulation__Alternatives_1"
    // InternalWhiteSpace.g:923:1: rule__StackManipulation__Alternatives_1 : ( ( rulePush ) | ( ruleDuplicate ) | ( ruleCopy ) | ( ruleSwap ) | ( ruleDiscard ) | ( ruleSlide ) );
    public final void rule__StackManipulation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:927:1: ( ( rulePush ) | ( ruleDuplicate ) | ( ruleCopy ) | ( ruleSwap ) | ( ruleDiscard ) | ( ruleSlide ) )
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
                    // InternalWhiteSpace.g:928:2: ( rulePush )
                    {
                    // InternalWhiteSpace.g:928:2: ( rulePush )
                    // InternalWhiteSpace.g:929:3: rulePush
                    {
                     before(grammarAccess.getStackManipulationAccess().getPushParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    rulePush();

                    state._fsp--;

                     after(grammarAccess.getStackManipulationAccess().getPushParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:934:2: ( ruleDuplicate )
                    {
                    // InternalWhiteSpace.g:934:2: ( ruleDuplicate )
                    // InternalWhiteSpace.g:935:3: ruleDuplicate
                    {
                     before(grammarAccess.getStackManipulationAccess().getDuplicateParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDuplicate();

                    state._fsp--;

                     after(grammarAccess.getStackManipulationAccess().getDuplicateParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:940:2: ( ruleCopy )
                    {
                    // InternalWhiteSpace.g:940:2: ( ruleCopy )
                    // InternalWhiteSpace.g:941:3: ruleCopy
                    {
                     before(grammarAccess.getStackManipulationAccess().getCopyParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getStackManipulationAccess().getCopyParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:946:2: ( ruleSwap )
                    {
                    // InternalWhiteSpace.g:946:2: ( ruleSwap )
                    // InternalWhiteSpace.g:947:3: ruleSwap
                    {
                     before(grammarAccess.getStackManipulationAccess().getSwapParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSwap();

                    state._fsp--;

                     after(grammarAccess.getStackManipulationAccess().getSwapParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:952:2: ( ruleDiscard )
                    {
                    // InternalWhiteSpace.g:952:2: ( ruleDiscard )
                    // InternalWhiteSpace.g:953:3: ruleDiscard
                    {
                     before(grammarAccess.getStackManipulationAccess().getDiscardParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDiscard();

                    state._fsp--;

                     after(grammarAccess.getStackManipulationAccess().getDiscardParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWhiteSpace.g:958:2: ( ruleSlide )
                    {
                    // InternalWhiteSpace.g:958:2: ( ruleSlide )
                    // InternalWhiteSpace.g:959:3: ruleSlide
                    {
                     before(grammarAccess.getStackManipulationAccess().getSlideParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSlide();

                    state._fsp--;

                     after(grammarAccess.getStackManipulationAccess().getSlideParserRuleCall_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackManipulation__Alternatives_1"


    // $ANTLR start "rule__Arithmetic__Alternatives_2"
    // InternalWhiteSpace.g:968:1: rule__Arithmetic__Alternatives_2 : ( ( ruleAddition ) | ( ruleSubtraction ) | ( ruleMultiplication ) | ( ruleDivision ) | ( ruleModulo ) );
    public final void rule__Arithmetic__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:972:1: ( ( ruleAddition ) | ( ruleSubtraction ) | ( ruleMultiplication ) | ( ruleDivision ) | ( ruleModulo ) )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SPACE) ) {
                switch ( input.LA(2) ) {
                case RULE_SPACE:
                    {
                    alt4=1;
                    }
                    break;
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
                    // InternalWhiteSpace.g:973:2: ( ruleAddition )
                    {
                    // InternalWhiteSpace.g:973:2: ( ruleAddition )
                    // InternalWhiteSpace.g:974:3: ruleAddition
                    {
                     before(grammarAccess.getArithmeticAccess().getAdditionParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddition();

                    state._fsp--;

                     after(grammarAccess.getArithmeticAccess().getAdditionParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:979:2: ( ruleSubtraction )
                    {
                    // InternalWhiteSpace.g:979:2: ( ruleSubtraction )
                    // InternalWhiteSpace.g:980:3: ruleSubtraction
                    {
                     before(grammarAccess.getArithmeticAccess().getSubtractionParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtraction();

                    state._fsp--;

                     after(grammarAccess.getArithmeticAccess().getSubtractionParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:985:2: ( ruleMultiplication )
                    {
                    // InternalWhiteSpace.g:985:2: ( ruleMultiplication )
                    // InternalWhiteSpace.g:986:3: ruleMultiplication
                    {
                     before(grammarAccess.getArithmeticAccess().getMultiplicationParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiplication();

                    state._fsp--;

                     after(grammarAccess.getArithmeticAccess().getMultiplicationParserRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:991:2: ( ruleDivision )
                    {
                    // InternalWhiteSpace.g:991:2: ( ruleDivision )
                    // InternalWhiteSpace.g:992:3: ruleDivision
                    {
                     before(grammarAccess.getArithmeticAccess().getDivisionParserRuleCall_2_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDivision();

                    state._fsp--;

                     after(grammarAccess.getArithmeticAccess().getDivisionParserRuleCall_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:997:2: ( ruleModulo )
                    {
                    // InternalWhiteSpace.g:997:2: ( ruleModulo )
                    // InternalWhiteSpace.g:998:3: ruleModulo
                    {
                     before(grammarAccess.getArithmeticAccess().getModuloParserRuleCall_2_4()); 
                    pushFollow(FOLLOW_2);
                    ruleModulo();

                    state._fsp--;

                     after(grammarAccess.getArithmeticAccess().getModuloParserRuleCall_2_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Alternatives_2"


    // $ANTLR start "rule__HeapAccess__Alternatives_2"
    // InternalWhiteSpace.g:1007:1: rule__HeapAccess__Alternatives_2 : ( ( ruleStore ) | ( ruleRetrieve ) );
    public final void rule__HeapAccess__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1011:1: ( ( ruleStore ) | ( ruleRetrieve ) )
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
                    // InternalWhiteSpace.g:1012:2: ( ruleStore )
                    {
                    // InternalWhiteSpace.g:1012:2: ( ruleStore )
                    // InternalWhiteSpace.g:1013:3: ruleStore
                    {
                     before(grammarAccess.getHeapAccessAccess().getStoreParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getHeapAccessAccess().getStoreParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:1018:2: ( ruleRetrieve )
                    {
                    // InternalWhiteSpace.g:1018:2: ( ruleRetrieve )
                    // InternalWhiteSpace.g:1019:3: ruleRetrieve
                    {
                     before(grammarAccess.getHeapAccessAccess().getRetrieveParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRetrieve();

                    state._fsp--;

                     after(grammarAccess.getHeapAccessAccess().getRetrieveParserRuleCall_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Alternatives_2"


    // $ANTLR start "rule__FlowControl__Alternatives_1"
    // InternalWhiteSpace.g:1028:1: rule__FlowControl__Alternatives_1 : ( ( ruleMarkLocation ) | ( ruleCallSubroutine ) | ( ruleUnconditionalJump ) | ( ruleZeroJump ) | ( ruleNegativeJump ) | ( ruleEndSubroutine ) | ( ruleEndProgram ) );
    public final void rule__FlowControl__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1032:1: ( ( ruleMarkLocation ) | ( ruleCallSubroutine ) | ( ruleUnconditionalJump ) | ( ruleZeroJump ) | ( ruleNegativeJump ) | ( ruleEndSubroutine ) | ( ruleEndProgram ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalWhiteSpace.g:1033:2: ( ruleMarkLocation )
                    {
                    // InternalWhiteSpace.g:1033:2: ( ruleMarkLocation )
                    // InternalWhiteSpace.g:1034:3: ruleMarkLocation
                    {
                     before(grammarAccess.getFlowControlAccess().getMarkLocationParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkLocation();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getMarkLocationParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:1039:2: ( ruleCallSubroutine )
                    {
                    // InternalWhiteSpace.g:1039:2: ( ruleCallSubroutine )
                    // InternalWhiteSpace.g:1040:3: ruleCallSubroutine
                    {
                     before(grammarAccess.getFlowControlAccess().getCallSubroutineParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCallSubroutine();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getCallSubroutineParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:1045:2: ( ruleUnconditionalJump )
                    {
                    // InternalWhiteSpace.g:1045:2: ( ruleUnconditionalJump )
                    // InternalWhiteSpace.g:1046:3: ruleUnconditionalJump
                    {
                     before(grammarAccess.getFlowControlAccess().getUnconditionalJumpParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnconditionalJump();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getUnconditionalJumpParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:1051:2: ( ruleZeroJump )
                    {
                    // InternalWhiteSpace.g:1051:2: ( ruleZeroJump )
                    // InternalWhiteSpace.g:1052:3: ruleZeroJump
                    {
                     before(grammarAccess.getFlowControlAccess().getZeroJumpParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleZeroJump();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getZeroJumpParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWhiteSpace.g:1057:2: ( ruleNegativeJump )
                    {
                    // InternalWhiteSpace.g:1057:2: ( ruleNegativeJump )
                    // InternalWhiteSpace.g:1058:3: ruleNegativeJump
                    {
                     before(grammarAccess.getFlowControlAccess().getNegativeJumpParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNegativeJump();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getNegativeJumpParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWhiteSpace.g:1063:2: ( ruleEndSubroutine )
                    {
                    // InternalWhiteSpace.g:1063:2: ( ruleEndSubroutine )
                    // InternalWhiteSpace.g:1064:3: ruleEndSubroutine
                    {
                     before(grammarAccess.getFlowControlAccess().getEndSubroutineParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEndSubroutine();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getEndSubroutineParserRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWhiteSpace.g:1069:2: ( ruleEndProgram )
                    {
                    // InternalWhiteSpace.g:1069:2: ( ruleEndProgram )
                    // InternalWhiteSpace.g:1070:3: ruleEndProgram
                    {
                     before(grammarAccess.getFlowControlAccess().getEndProgramParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEndProgram();

                    state._fsp--;

                     after(grammarAccess.getFlowControlAccess().getEndProgramParserRuleCall_1_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlowControl__Alternatives_1"


    // $ANTLR start "rule__IO__Alternatives_2"
    // InternalWhiteSpace.g:1079:1: rule__IO__Alternatives_2 : ( ( ruleOutputCharacter ) | ( ruleOutputNumber ) | ( ruleReadCharacter ) | ( ruleReadNumber ) );
    public final void rule__IO__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1083:1: ( ( ruleOutputCharacter ) | ( ruleOutputNumber ) | ( ruleReadCharacter ) | ( ruleReadNumber ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SPACE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_SPACE) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_TAB) ) {
                    alt7=2;
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
                    // InternalWhiteSpace.g:1084:2: ( ruleOutputCharacter )
                    {
                    // InternalWhiteSpace.g:1084:2: ( ruleOutputCharacter )
                    // InternalWhiteSpace.g:1085:3: ruleOutputCharacter
                    {
                     before(grammarAccess.getIOAccess().getOutputCharacterParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOutputCharacter();

                    state._fsp--;

                     after(grammarAccess.getIOAccess().getOutputCharacterParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:1090:2: ( ruleOutputNumber )
                    {
                    // InternalWhiteSpace.g:1090:2: ( ruleOutputNumber )
                    // InternalWhiteSpace.g:1091:3: ruleOutputNumber
                    {
                     before(grammarAccess.getIOAccess().getOutputNumberParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOutputNumber();

                    state._fsp--;

                     after(grammarAccess.getIOAccess().getOutputNumberParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWhiteSpace.g:1096:2: ( ruleReadCharacter )
                    {
                    // InternalWhiteSpace.g:1096:2: ( ruleReadCharacter )
                    // InternalWhiteSpace.g:1097:3: ruleReadCharacter
                    {
                     before(grammarAccess.getIOAccess().getReadCharacterParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReadCharacter();

                    state._fsp--;

                     after(grammarAccess.getIOAccess().getReadCharacterParserRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWhiteSpace.g:1102:2: ( ruleReadNumber )
                    {
                    // InternalWhiteSpace.g:1102:2: ( ruleReadNumber )
                    // InternalWhiteSpace.g:1103:3: ruleReadNumber
                    {
                     before(grammarAccess.getIOAccess().getReadNumberParserRuleCall_2_3()); 
                    pushFollow(FOLLOW_2);
                    ruleReadNumber();

                    state._fsp--;

                     after(grammarAccess.getIOAccess().getReadNumberParserRuleCall_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Alternatives_2"


    // $ANTLR start "rule__Number__Alternatives_0"
    // InternalWhiteSpace.g:1112:1: rule__Number__Alternatives_0 : ( ( RULE_SPACE ) | ( RULE_TAB ) );
    public final void rule__Number__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1116:1: ( ( RULE_SPACE ) | ( RULE_TAB ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SPACE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_TAB) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWhiteSpace.g:1117:2: ( RULE_SPACE )
                    {
                    // InternalWhiteSpace.g:1117:2: ( RULE_SPACE )
                    // InternalWhiteSpace.g:1118:3: RULE_SPACE
                    {
                     before(grammarAccess.getNumberAccess().getSPACETerminalRuleCall_0_0()); 
                    match(input,RULE_SPACE,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getSPACETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:1123:2: ( RULE_TAB )
                    {
                    // InternalWhiteSpace.g:1123:2: ( RULE_TAB )
                    // InternalWhiteSpace.g:1124:3: RULE_TAB
                    {
                     before(grammarAccess.getNumberAccess().getTABTerminalRuleCall_0_1()); 
                    match(input,RULE_TAB,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getTABTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_0"


    // $ANTLR start "rule__Label__Alternatives_0"
    // InternalWhiteSpace.g:1133:1: rule__Label__Alternatives_0 : ( ( RULE_SPACE ) | ( RULE_TAB ) );
    public final void rule__Label__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1137:1: ( ( RULE_SPACE ) | ( RULE_TAB ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SPACE) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_TAB) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWhiteSpace.g:1138:2: ( RULE_SPACE )
                    {
                    // InternalWhiteSpace.g:1138:2: ( RULE_SPACE )
                    // InternalWhiteSpace.g:1139:3: RULE_SPACE
                    {
                     before(grammarAccess.getLabelAccess().getSPACETerminalRuleCall_0_0()); 
                    match(input,RULE_SPACE,FOLLOW_2); 
                     after(grammarAccess.getLabelAccess().getSPACETerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWhiteSpace.g:1144:2: ( RULE_TAB )
                    {
                    // InternalWhiteSpace.g:1144:2: ( RULE_TAB )
                    // InternalWhiteSpace.g:1145:3: RULE_TAB
                    {
                     before(grammarAccess.getLabelAccess().getTABTerminalRuleCall_0_1()); 
                    match(input,RULE_TAB,FOLLOW_2); 
                     after(grammarAccess.getLabelAccess().getTABTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Alternatives_0"


    // $ANTLR start "rule__StackManipulation__Group__0"
    // InternalWhiteSpace.g:1154:1: rule__StackManipulation__Group__0 : rule__StackManipulation__Group__0__Impl rule__StackManipulation__Group__1 ;
    public final void rule__StackManipulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1158:1: ( rule__StackManipulation__Group__0__Impl rule__StackManipulation__Group__1 )
            // InternalWhiteSpace.g:1159:2: rule__StackManipulation__Group__0__Impl rule__StackManipulation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StackManipulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StackManipulation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackManipulation__Group__0"


    // $ANTLR start "rule__StackManipulation__Group__0__Impl"
    // InternalWhiteSpace.g:1166:1: rule__StackManipulation__Group__0__Impl : ( RULE_SPACE ) ;
    public final void rule__StackManipulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1170:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1171:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1171:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1172:2: RULE_SPACE
            {
             before(grammarAccess.getStackManipulationAccess().getSPACETerminalRuleCall_0()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getStackManipulationAccess().getSPACETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackManipulation__Group__0__Impl"


    // $ANTLR start "rule__StackManipulation__Group__1"
    // InternalWhiteSpace.g:1181:1: rule__StackManipulation__Group__1 : rule__StackManipulation__Group__1__Impl ;
    public final void rule__StackManipulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1185:1: ( rule__StackManipulation__Group__1__Impl )
            // InternalWhiteSpace.g:1186:2: rule__StackManipulation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StackManipulation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackManipulation__Group__1"


    // $ANTLR start "rule__StackManipulation__Group__1__Impl"
    // InternalWhiteSpace.g:1192:1: rule__StackManipulation__Group__1__Impl : ( ( rule__StackManipulation__Alternatives_1 ) ) ;
    public final void rule__StackManipulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1196:1: ( ( ( rule__StackManipulation__Alternatives_1 ) ) )
            // InternalWhiteSpace.g:1197:1: ( ( rule__StackManipulation__Alternatives_1 ) )
            {
            // InternalWhiteSpace.g:1197:1: ( ( rule__StackManipulation__Alternatives_1 ) )
            // InternalWhiteSpace.g:1198:2: ( rule__StackManipulation__Alternatives_1 )
            {
             before(grammarAccess.getStackManipulationAccess().getAlternatives_1()); 
            // InternalWhiteSpace.g:1199:2: ( rule__StackManipulation__Alternatives_1 )
            // InternalWhiteSpace.g:1199:3: rule__StackManipulation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__StackManipulation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStackManipulationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StackManipulation__Group__1__Impl"


    // $ANTLR start "rule__Push__Group__0"
    // InternalWhiteSpace.g:1208:1: rule__Push__Group__0 : rule__Push__Group__0__Impl rule__Push__Group__1 ;
    public final void rule__Push__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1212:1: ( rule__Push__Group__0__Impl rule__Push__Group__1 )
            // InternalWhiteSpace.g:1213:2: rule__Push__Group__0__Impl rule__Push__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Push__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Push__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__0"


    // $ANTLR start "rule__Push__Group__0__Impl"
    // InternalWhiteSpace.g:1220:1: rule__Push__Group__0__Impl : ( () ) ;
    public final void rule__Push__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1224:1: ( ( () ) )
            // InternalWhiteSpace.g:1225:1: ( () )
            {
            // InternalWhiteSpace.g:1225:1: ( () )
            // InternalWhiteSpace.g:1226:2: ()
            {
             before(grammarAccess.getPushAccess().getPushAction_0()); 
            // InternalWhiteSpace.g:1227:2: ()
            // InternalWhiteSpace.g:1227:3: 
            {
            }

             after(grammarAccess.getPushAccess().getPushAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__0__Impl"


    // $ANTLR start "rule__Push__Group__1"
    // InternalWhiteSpace.g:1235:1: rule__Push__Group__1 : rule__Push__Group__1__Impl rule__Push__Group__2 ;
    public final void rule__Push__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1239:1: ( rule__Push__Group__1__Impl rule__Push__Group__2 )
            // InternalWhiteSpace.g:1240:2: rule__Push__Group__1__Impl rule__Push__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Push__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Push__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__1"


    // $ANTLR start "rule__Push__Group__1__Impl"
    // InternalWhiteSpace.g:1247:1: rule__Push__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Push__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1251:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1252:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1252:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1253:2: RULE_SPACE
            {
             before(grammarAccess.getPushAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getPushAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__1__Impl"


    // $ANTLR start "rule__Push__Group__2"
    // InternalWhiteSpace.g:1262:1: rule__Push__Group__2 : rule__Push__Group__2__Impl ;
    public final void rule__Push__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1266:1: ( rule__Push__Group__2__Impl )
            // InternalWhiteSpace.g:1267:2: rule__Push__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Push__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__2"


    // $ANTLR start "rule__Push__Group__2__Impl"
    // InternalWhiteSpace.g:1273:1: rule__Push__Group__2__Impl : ( ( rule__Push__NumberAssignment_2 ) ) ;
    public final void rule__Push__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1277:1: ( ( ( rule__Push__NumberAssignment_2 ) ) )
            // InternalWhiteSpace.g:1278:1: ( ( rule__Push__NumberAssignment_2 ) )
            {
            // InternalWhiteSpace.g:1278:1: ( ( rule__Push__NumberAssignment_2 ) )
            // InternalWhiteSpace.g:1279:2: ( rule__Push__NumberAssignment_2 )
            {
             before(grammarAccess.getPushAccess().getNumberAssignment_2()); 
            // InternalWhiteSpace.g:1280:2: ( rule__Push__NumberAssignment_2 )
            // InternalWhiteSpace.g:1280:3: rule__Push__NumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Push__NumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPushAccess().getNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__Group__2__Impl"


    // $ANTLR start "rule__Duplicate__Group__0"
    // InternalWhiteSpace.g:1289:1: rule__Duplicate__Group__0 : rule__Duplicate__Group__0__Impl rule__Duplicate__Group__1 ;
    public final void rule__Duplicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1293:1: ( rule__Duplicate__Group__0__Impl rule__Duplicate__Group__1 )
            // InternalWhiteSpace.g:1294:2: rule__Duplicate__Group__0__Impl rule__Duplicate__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Duplicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duplicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duplicate__Group__0"


    // $ANTLR start "rule__Duplicate__Group__0__Impl"
    // InternalWhiteSpace.g:1301:1: rule__Duplicate__Group__0__Impl : ( () ) ;
    public final void rule__Duplicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1305:1: ( ( () ) )
            // InternalWhiteSpace.g:1306:1: ( () )
            {
            // InternalWhiteSpace.g:1306:1: ( () )
            // InternalWhiteSpace.g:1307:2: ()
            {
             before(grammarAccess.getDuplicateAccess().getDuplicateAction_0()); 
            // InternalWhiteSpace.g:1308:2: ()
            // InternalWhiteSpace.g:1308:3: 
            {
            }

             after(grammarAccess.getDuplicateAccess().getDuplicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duplicate__Group__0__Impl"


    // $ANTLR start "rule__Duplicate__Group__1"
    // InternalWhiteSpace.g:1316:1: rule__Duplicate__Group__1 : rule__Duplicate__Group__1__Impl rule__Duplicate__Group__2 ;
    public final void rule__Duplicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1320:1: ( rule__Duplicate__Group__1__Impl rule__Duplicate__Group__2 )
            // InternalWhiteSpace.g:1321:2: rule__Duplicate__Group__1__Impl rule__Duplicate__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Duplicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duplicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duplicate__Group__1"


    // $ANTLR start "rule__Duplicate__Group__1__Impl"
    // InternalWhiteSpace.g:1328:1: rule__Duplicate__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Duplicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1332:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:1333:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:1333:1: ( RULE_LF )
            // InternalWhiteSpace.g:1334:2: RULE_LF
            {
             before(grammarAccess.getDuplicateAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getDuplicateAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duplicate__Group__1__Impl"


    // $ANTLR start "rule__Duplicate__Group__2"
    // InternalWhiteSpace.g:1343:1: rule__Duplicate__Group__2 : rule__Duplicate__Group__2__Impl ;
    public final void rule__Duplicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1347:1: ( rule__Duplicate__Group__2__Impl )
            // InternalWhiteSpace.g:1348:2: rule__Duplicate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duplicate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duplicate__Group__2"


    // $ANTLR start "rule__Duplicate__Group__2__Impl"
    // InternalWhiteSpace.g:1354:1: rule__Duplicate__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Duplicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1358:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1359:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1359:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1360:2: RULE_SPACE
            {
             before(grammarAccess.getDuplicateAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getDuplicateAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duplicate__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalWhiteSpace.g:1370:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1374:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalWhiteSpace.g:1375:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalWhiteSpace.g:1382:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1386:1: ( ( () ) )
            // InternalWhiteSpace.g:1387:1: ( () )
            {
            // InternalWhiteSpace.g:1387:1: ( () )
            // InternalWhiteSpace.g:1388:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalWhiteSpace.g:1389:2: ()
            // InternalWhiteSpace.g:1389:3: 
            {
            }

             after(grammarAccess.getCopyAccess().getCopyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalWhiteSpace.g:1397:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1401:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalWhiteSpace.g:1402:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalWhiteSpace.g:1409:1: rule__Copy__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1413:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:1414:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:1414:1: ( RULE_TAB )
            // InternalWhiteSpace.g:1415:2: RULE_TAB
            {
             before(grammarAccess.getCopyAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__2"
    // InternalWhiteSpace.g:1424:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1428:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalWhiteSpace.g:1429:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2"


    // $ANTLR start "rule__Copy__Group__2__Impl"
    // InternalWhiteSpace.g:1436:1: rule__Copy__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1440:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1441:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1441:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1442:2: RULE_SPACE
            {
             before(grammarAccess.getCopyAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__3"
    // InternalWhiteSpace.g:1451:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1455:1: ( rule__Copy__Group__3__Impl )
            // InternalWhiteSpace.g:1456:2: rule__Copy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3"


    // $ANTLR start "rule__Copy__Group__3__Impl"
    // InternalWhiteSpace.g:1462:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__NumberAssignment_3 ) ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1466:1: ( ( ( rule__Copy__NumberAssignment_3 ) ) )
            // InternalWhiteSpace.g:1467:1: ( ( rule__Copy__NumberAssignment_3 ) )
            {
            // InternalWhiteSpace.g:1467:1: ( ( rule__Copy__NumberAssignment_3 ) )
            // InternalWhiteSpace.g:1468:2: ( rule__Copy__NumberAssignment_3 )
            {
             before(grammarAccess.getCopyAccess().getNumberAssignment_3()); 
            // InternalWhiteSpace.g:1469:2: ( rule__Copy__NumberAssignment_3 )
            // InternalWhiteSpace.g:1469:3: rule__Copy__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Copy__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__3__Impl"


    // $ANTLR start "rule__Swap__Group__0"
    // InternalWhiteSpace.g:1478:1: rule__Swap__Group__0 : rule__Swap__Group__0__Impl rule__Swap__Group__1 ;
    public final void rule__Swap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1482:1: ( rule__Swap__Group__0__Impl rule__Swap__Group__1 )
            // InternalWhiteSpace.g:1483:2: rule__Swap__Group__0__Impl rule__Swap__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Swap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swap__Group__0"


    // $ANTLR start "rule__Swap__Group__0__Impl"
    // InternalWhiteSpace.g:1490:1: rule__Swap__Group__0__Impl : ( () ) ;
    public final void rule__Swap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1494:1: ( ( () ) )
            // InternalWhiteSpace.g:1495:1: ( () )
            {
            // InternalWhiteSpace.g:1495:1: ( () )
            // InternalWhiteSpace.g:1496:2: ()
            {
             before(grammarAccess.getSwapAccess().getSwapAction_0()); 
            // InternalWhiteSpace.g:1497:2: ()
            // InternalWhiteSpace.g:1497:3: 
            {
            }

             after(grammarAccess.getSwapAccess().getSwapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swap__Group__0__Impl"


    // $ANTLR start "rule__Swap__Group__1"
    // InternalWhiteSpace.g:1505:1: rule__Swap__Group__1 : rule__Swap__Group__1__Impl rule__Swap__Group__2 ;
    public final void rule__Swap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1509:1: ( rule__Swap__Group__1__Impl rule__Swap__Group__2 )
            // InternalWhiteSpace.g:1510:2: rule__Swap__Group__1__Impl rule__Swap__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Swap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Swap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swap__Group__1"


    // $ANTLR start "rule__Swap__Group__1__Impl"
    // InternalWhiteSpace.g:1517:1: rule__Swap__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Swap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1521:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:1522:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:1522:1: ( RULE_LF )
            // InternalWhiteSpace.g:1523:2: RULE_LF
            {
             before(grammarAccess.getSwapAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getSwapAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swap__Group__1__Impl"


    // $ANTLR start "rule__Swap__Group__2"
    // InternalWhiteSpace.g:1532:1: rule__Swap__Group__2 : rule__Swap__Group__2__Impl ;
    public final void rule__Swap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1536:1: ( rule__Swap__Group__2__Impl )
            // InternalWhiteSpace.g:1537:2: rule__Swap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Swap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swap__Group__2"


    // $ANTLR start "rule__Swap__Group__2__Impl"
    // InternalWhiteSpace.g:1543:1: rule__Swap__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__Swap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1547:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:1548:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:1548:1: ( RULE_TAB )
            // InternalWhiteSpace.g:1549:2: RULE_TAB
            {
             before(grammarAccess.getSwapAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getSwapAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Swap__Group__2__Impl"


    // $ANTLR start "rule__Discard__Group__0"
    // InternalWhiteSpace.g:1559:1: rule__Discard__Group__0 : rule__Discard__Group__0__Impl rule__Discard__Group__1 ;
    public final void rule__Discard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1563:1: ( rule__Discard__Group__0__Impl rule__Discard__Group__1 )
            // InternalWhiteSpace.g:1564:2: rule__Discard__Group__0__Impl rule__Discard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Discard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Group__0"


    // $ANTLR start "rule__Discard__Group__0__Impl"
    // InternalWhiteSpace.g:1571:1: rule__Discard__Group__0__Impl : ( () ) ;
    public final void rule__Discard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1575:1: ( ( () ) )
            // InternalWhiteSpace.g:1576:1: ( () )
            {
            // InternalWhiteSpace.g:1576:1: ( () )
            // InternalWhiteSpace.g:1577:2: ()
            {
             before(grammarAccess.getDiscardAccess().getDiscardAction_0()); 
            // InternalWhiteSpace.g:1578:2: ()
            // InternalWhiteSpace.g:1578:3: 
            {
            }

             after(grammarAccess.getDiscardAccess().getDiscardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Group__0__Impl"


    // $ANTLR start "rule__Discard__Group__1"
    // InternalWhiteSpace.g:1586:1: rule__Discard__Group__1 : rule__Discard__Group__1__Impl rule__Discard__Group__2 ;
    public final void rule__Discard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1590:1: ( rule__Discard__Group__1__Impl rule__Discard__Group__2 )
            // InternalWhiteSpace.g:1591:2: rule__Discard__Group__1__Impl rule__Discard__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Discard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Group__1"


    // $ANTLR start "rule__Discard__Group__1__Impl"
    // InternalWhiteSpace.g:1598:1: rule__Discard__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Discard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1602:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:1603:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:1603:1: ( RULE_LF )
            // InternalWhiteSpace.g:1604:2: RULE_LF
            {
             before(grammarAccess.getDiscardAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getDiscardAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Group__1__Impl"


    // $ANTLR start "rule__Discard__Group__2"
    // InternalWhiteSpace.g:1613:1: rule__Discard__Group__2 : rule__Discard__Group__2__Impl ;
    public final void rule__Discard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1617:1: ( rule__Discard__Group__2__Impl )
            // InternalWhiteSpace.g:1618:2: rule__Discard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Group__2"


    // $ANTLR start "rule__Discard__Group__2__Impl"
    // InternalWhiteSpace.g:1624:1: rule__Discard__Group__2__Impl : ( RULE_LF ) ;
    public final void rule__Discard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1628:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:1629:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:1629:1: ( RULE_LF )
            // InternalWhiteSpace.g:1630:2: RULE_LF
            {
             before(grammarAccess.getDiscardAccess().getLFTerminalRuleCall_2()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getDiscardAccess().getLFTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Group__2__Impl"


    // $ANTLR start "rule__Slide__Group__0"
    // InternalWhiteSpace.g:1640:1: rule__Slide__Group__0 : rule__Slide__Group__0__Impl rule__Slide__Group__1 ;
    public final void rule__Slide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1644:1: ( rule__Slide__Group__0__Impl rule__Slide__Group__1 )
            // InternalWhiteSpace.g:1645:2: rule__Slide__Group__0__Impl rule__Slide__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Slide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__0"


    // $ANTLR start "rule__Slide__Group__0__Impl"
    // InternalWhiteSpace.g:1652:1: rule__Slide__Group__0__Impl : ( () ) ;
    public final void rule__Slide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1656:1: ( ( () ) )
            // InternalWhiteSpace.g:1657:1: ( () )
            {
            // InternalWhiteSpace.g:1657:1: ( () )
            // InternalWhiteSpace.g:1658:2: ()
            {
             before(grammarAccess.getSlideAccess().getSlideAction_0()); 
            // InternalWhiteSpace.g:1659:2: ()
            // InternalWhiteSpace.g:1659:3: 
            {
            }

             after(grammarAccess.getSlideAccess().getSlideAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__0__Impl"


    // $ANTLR start "rule__Slide__Group__1"
    // InternalWhiteSpace.g:1667:1: rule__Slide__Group__1 : rule__Slide__Group__1__Impl rule__Slide__Group__2 ;
    public final void rule__Slide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1671:1: ( rule__Slide__Group__1__Impl rule__Slide__Group__2 )
            // InternalWhiteSpace.g:1672:2: rule__Slide__Group__1__Impl rule__Slide__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Slide__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__1"


    // $ANTLR start "rule__Slide__Group__1__Impl"
    // InternalWhiteSpace.g:1679:1: rule__Slide__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__Slide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1683:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:1684:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:1684:1: ( RULE_TAB )
            // InternalWhiteSpace.g:1685:2: RULE_TAB
            {
             before(grammarAccess.getSlideAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__1__Impl"


    // $ANTLR start "rule__Slide__Group__2"
    // InternalWhiteSpace.g:1694:1: rule__Slide__Group__2 : rule__Slide__Group__2__Impl rule__Slide__Group__3 ;
    public final void rule__Slide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1698:1: ( rule__Slide__Group__2__Impl rule__Slide__Group__3 )
            // InternalWhiteSpace.g:1699:2: rule__Slide__Group__2__Impl rule__Slide__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Slide__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Slide__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__2"


    // $ANTLR start "rule__Slide__Group__2__Impl"
    // InternalWhiteSpace.g:1706:1: rule__Slide__Group__2__Impl : ( RULE_LF ) ;
    public final void rule__Slide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1710:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:1711:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:1711:1: ( RULE_LF )
            // InternalWhiteSpace.g:1712:2: RULE_LF
            {
             before(grammarAccess.getSlideAccess().getLFTerminalRuleCall_2()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getSlideAccess().getLFTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__2__Impl"


    // $ANTLR start "rule__Slide__Group__3"
    // InternalWhiteSpace.g:1721:1: rule__Slide__Group__3 : rule__Slide__Group__3__Impl ;
    public final void rule__Slide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1725:1: ( rule__Slide__Group__3__Impl )
            // InternalWhiteSpace.g:1726:2: rule__Slide__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Slide__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__3"


    // $ANTLR start "rule__Slide__Group__3__Impl"
    // InternalWhiteSpace.g:1732:1: rule__Slide__Group__3__Impl : ( ( rule__Slide__NumberAssignment_3 ) ) ;
    public final void rule__Slide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1736:1: ( ( ( rule__Slide__NumberAssignment_3 ) ) )
            // InternalWhiteSpace.g:1737:1: ( ( rule__Slide__NumberAssignment_3 ) )
            {
            // InternalWhiteSpace.g:1737:1: ( ( rule__Slide__NumberAssignment_3 ) )
            // InternalWhiteSpace.g:1738:2: ( rule__Slide__NumberAssignment_3 )
            {
             before(grammarAccess.getSlideAccess().getNumberAssignment_3()); 
            // InternalWhiteSpace.g:1739:2: ( rule__Slide__NumberAssignment_3 )
            // InternalWhiteSpace.g:1739:3: rule__Slide__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Slide__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlideAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__Group__3__Impl"


    // $ANTLR start "rule__Arithmetic__Group__0"
    // InternalWhiteSpace.g:1748:1: rule__Arithmetic__Group__0 : rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 ;
    public final void rule__Arithmetic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1752:1: ( rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1 )
            // InternalWhiteSpace.g:1753:2: rule__Arithmetic__Group__0__Impl rule__Arithmetic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Arithmetic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__0"


    // $ANTLR start "rule__Arithmetic__Group__0__Impl"
    // InternalWhiteSpace.g:1760:1: rule__Arithmetic__Group__0__Impl : ( RULE_TAB ) ;
    public final void rule__Arithmetic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1764:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:1765:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:1765:1: ( RULE_TAB )
            // InternalWhiteSpace.g:1766:2: RULE_TAB
            {
             before(grammarAccess.getArithmeticAccess().getTABTerminalRuleCall_0()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getArithmeticAccess().getTABTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__0__Impl"


    // $ANTLR start "rule__Arithmetic__Group__1"
    // InternalWhiteSpace.g:1775:1: rule__Arithmetic__Group__1 : rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 ;
    public final void rule__Arithmetic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1779:1: ( rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2 )
            // InternalWhiteSpace.g:1780:2: rule__Arithmetic__Group__1__Impl rule__Arithmetic__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Arithmetic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__1"


    // $ANTLR start "rule__Arithmetic__Group__1__Impl"
    // InternalWhiteSpace.g:1787:1: rule__Arithmetic__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Arithmetic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1791:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1792:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1792:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1793:2: RULE_SPACE
            {
             before(grammarAccess.getArithmeticAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getArithmeticAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__1__Impl"


    // $ANTLR start "rule__Arithmetic__Group__2"
    // InternalWhiteSpace.g:1802:1: rule__Arithmetic__Group__2 : rule__Arithmetic__Group__2__Impl ;
    public final void rule__Arithmetic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1806:1: ( rule__Arithmetic__Group__2__Impl )
            // InternalWhiteSpace.g:1807:2: rule__Arithmetic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__2"


    // $ANTLR start "rule__Arithmetic__Group__2__Impl"
    // InternalWhiteSpace.g:1813:1: rule__Arithmetic__Group__2__Impl : ( ( rule__Arithmetic__Alternatives_2 ) ) ;
    public final void rule__Arithmetic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1817:1: ( ( ( rule__Arithmetic__Alternatives_2 ) ) )
            // InternalWhiteSpace.g:1818:1: ( ( rule__Arithmetic__Alternatives_2 ) )
            {
            // InternalWhiteSpace.g:1818:1: ( ( rule__Arithmetic__Alternatives_2 ) )
            // InternalWhiteSpace.g:1819:2: ( rule__Arithmetic__Alternatives_2 )
            {
             before(grammarAccess.getArithmeticAccess().getAlternatives_2()); 
            // InternalWhiteSpace.g:1820:2: ( rule__Arithmetic__Alternatives_2 )
            // InternalWhiteSpace.g:1820:3: rule__Arithmetic__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Arithmetic__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arithmetic__Group__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalWhiteSpace.g:1829:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1833:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalWhiteSpace.g:1834:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalWhiteSpace.g:1841:1: rule__Addition__Group__0__Impl : ( () ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1845:1: ( ( () ) )
            // InternalWhiteSpace.g:1846:1: ( () )
            {
            // InternalWhiteSpace.g:1846:1: ( () )
            // InternalWhiteSpace.g:1847:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionAction_0()); 
            // InternalWhiteSpace.g:1848:2: ()
            // InternalWhiteSpace.g:1848:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalWhiteSpace.g:1856:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl rule__Addition__Group__2 ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1860:1: ( rule__Addition__Group__1__Impl rule__Addition__Group__2 )
            // InternalWhiteSpace.g:1861:2: rule__Addition__Group__1__Impl rule__Addition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Addition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalWhiteSpace.g:1868:1: rule__Addition__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1872:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1873:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1873:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1874:2: RULE_SPACE
            {
             before(grammarAccess.getAdditionAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__2"
    // InternalWhiteSpace.g:1883:1: rule__Addition__Group__2 : rule__Addition__Group__2__Impl ;
    public final void rule__Addition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1887:1: ( rule__Addition__Group__2__Impl )
            // InternalWhiteSpace.g:1888:2: rule__Addition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2"


    // $ANTLR start "rule__Addition__Group__2__Impl"
    // InternalWhiteSpace.g:1894:1: rule__Addition__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Addition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1898:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1899:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1899:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1900:2: RULE_SPACE
            {
             before(grammarAccess.getAdditionAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__2__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // InternalWhiteSpace.g:1910:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1914:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // InternalWhiteSpace.g:1915:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0"


    // $ANTLR start "rule__Subtraction__Group__0__Impl"
    // InternalWhiteSpace.g:1922:1: rule__Subtraction__Group__0__Impl : ( () ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1926:1: ( ( () ) )
            // InternalWhiteSpace.g:1927:1: ( () )
            {
            // InternalWhiteSpace.g:1927:1: ( () )
            // InternalWhiteSpace.g:1928:2: ()
            {
             before(grammarAccess.getSubtractionAccess().getSubtractionAction_0()); 
            // InternalWhiteSpace.g:1929:2: ()
            // InternalWhiteSpace.g:1929:3: 
            {
            }

             after(grammarAccess.getSubtractionAccess().getSubtractionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0__Impl"


    // $ANTLR start "rule__Subtraction__Group__1"
    // InternalWhiteSpace.g:1937:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl rule__Subtraction__Group__2 ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1941:1: ( rule__Subtraction__Group__1__Impl rule__Subtraction__Group__2 )
            // InternalWhiteSpace.g:1942:2: rule__Subtraction__Group__1__Impl rule__Subtraction__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Subtraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1"


    // $ANTLR start "rule__Subtraction__Group__1__Impl"
    // InternalWhiteSpace.g:1949:1: rule__Subtraction__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1953:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:1954:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:1954:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:1955:2: RULE_SPACE
            {
             before(grammarAccess.getSubtractionAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1__Impl"


    // $ANTLR start "rule__Subtraction__Group__2"
    // InternalWhiteSpace.g:1964:1: rule__Subtraction__Group__2 : rule__Subtraction__Group__2__Impl ;
    public final void rule__Subtraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1968:1: ( rule__Subtraction__Group__2__Impl )
            // InternalWhiteSpace.g:1969:2: rule__Subtraction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__2"


    // $ANTLR start "rule__Subtraction__Group__2__Impl"
    // InternalWhiteSpace.g:1975:1: rule__Subtraction__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__Subtraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1979:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:1980:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:1980:1: ( RULE_TAB )
            // InternalWhiteSpace.g:1981:2: RULE_TAB
            {
             before(grammarAccess.getSubtractionAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalWhiteSpace.g:1991:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:1995:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalWhiteSpace.g:1996:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalWhiteSpace.g:2003:1: rule__Multiplication__Group__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2007:1: ( ( () ) )
            // InternalWhiteSpace.g:2008:1: ( () )
            {
            // InternalWhiteSpace.g:2008:1: ( () )
            // InternalWhiteSpace.g:2009:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationAction_0()); 
            // InternalWhiteSpace.g:2010:2: ()
            // InternalWhiteSpace.g:2010:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalWhiteSpace.g:2018:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2022:1: ( rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2 )
            // InternalWhiteSpace.g:2023:2: rule__Multiplication__Group__1__Impl rule__Multiplication__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalWhiteSpace.g:2030:1: rule__Multiplication__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2034:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2035:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2035:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2036:2: RULE_SPACE
            {
             before(grammarAccess.getMultiplicationAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__2"
    // InternalWhiteSpace.g:2045:1: rule__Multiplication__Group__2 : rule__Multiplication__Group__2__Impl ;
    public final void rule__Multiplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2049:1: ( rule__Multiplication__Group__2__Impl )
            // InternalWhiteSpace.g:2050:2: rule__Multiplication__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__2"


    // $ANTLR start "rule__Multiplication__Group__2__Impl"
    // InternalWhiteSpace.g:2056:1: rule__Multiplication__Group__2__Impl : ( RULE_LF ) ;
    public final void rule__Multiplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2060:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:2061:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:2061:1: ( RULE_LF )
            // InternalWhiteSpace.g:2062:2: RULE_LF
            {
             before(grammarAccess.getMultiplicationAccess().getLFTerminalRuleCall_2()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getLFTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__2__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // InternalWhiteSpace.g:2072:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2076:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalWhiteSpace.g:2077:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Division__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // InternalWhiteSpace.g:2084:1: rule__Division__Group__0__Impl : ( () ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2088:1: ( ( () ) )
            // InternalWhiteSpace.g:2089:1: ( () )
            {
            // InternalWhiteSpace.g:2089:1: ( () )
            // InternalWhiteSpace.g:2090:2: ()
            {
             before(grammarAccess.getDivisionAccess().getDivisionAction_0()); 
            // InternalWhiteSpace.g:2091:2: ()
            // InternalWhiteSpace.g:2091:3: 
            {
            }

             after(grammarAccess.getDivisionAccess().getDivisionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // InternalWhiteSpace.g:2099:1: rule__Division__Group__1 : rule__Division__Group__1__Impl rule__Division__Group__2 ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2103:1: ( rule__Division__Group__1__Impl rule__Division__Group__2 )
            // InternalWhiteSpace.g:2104:2: rule__Division__Group__1__Impl rule__Division__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Division__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // InternalWhiteSpace.g:2111:1: rule__Division__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2115:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2116:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2116:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2117:2: RULE_TAB
            {
             before(grammarAccess.getDivisionAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getDivisionAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Division__Group__2"
    // InternalWhiteSpace.g:2126:1: rule__Division__Group__2 : rule__Division__Group__2__Impl ;
    public final void rule__Division__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2130:1: ( rule__Division__Group__2__Impl )
            // InternalWhiteSpace.g:2131:2: rule__Division__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2"


    // $ANTLR start "rule__Division__Group__2__Impl"
    // InternalWhiteSpace.g:2137:1: rule__Division__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Division__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2141:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2142:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2142:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2143:2: RULE_SPACE
            {
             before(grammarAccess.getDivisionAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getDivisionAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Division__Group__2__Impl"


    // $ANTLR start "rule__Modulo__Group__0"
    // InternalWhiteSpace.g:2153:1: rule__Modulo__Group__0 : rule__Modulo__Group__0__Impl rule__Modulo__Group__1 ;
    public final void rule__Modulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2157:1: ( rule__Modulo__Group__0__Impl rule__Modulo__Group__1 )
            // InternalWhiteSpace.g:2158:2: rule__Modulo__Group__0__Impl rule__Modulo__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Modulo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0"


    // $ANTLR start "rule__Modulo__Group__0__Impl"
    // InternalWhiteSpace.g:2165:1: rule__Modulo__Group__0__Impl : ( () ) ;
    public final void rule__Modulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2169:1: ( ( () ) )
            // InternalWhiteSpace.g:2170:1: ( () )
            {
            // InternalWhiteSpace.g:2170:1: ( () )
            // InternalWhiteSpace.g:2171:2: ()
            {
             before(grammarAccess.getModuloAccess().getModuloAction_0()); 
            // InternalWhiteSpace.g:2172:2: ()
            // InternalWhiteSpace.g:2172:3: 
            {
            }

             after(grammarAccess.getModuloAccess().getModuloAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0__Impl"


    // $ANTLR start "rule__Modulo__Group__1"
    // InternalWhiteSpace.g:2180:1: rule__Modulo__Group__1 : rule__Modulo__Group__1__Impl rule__Modulo__Group__2 ;
    public final void rule__Modulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2184:1: ( rule__Modulo__Group__1__Impl rule__Modulo__Group__2 )
            // InternalWhiteSpace.g:2185:2: rule__Modulo__Group__1__Impl rule__Modulo__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Modulo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modulo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1"


    // $ANTLR start "rule__Modulo__Group__1__Impl"
    // InternalWhiteSpace.g:2192:1: rule__Modulo__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__Modulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2196:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2197:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2197:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2198:2: RULE_TAB
            {
             before(grammarAccess.getModuloAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1__Impl"


    // $ANTLR start "rule__Modulo__Group__2"
    // InternalWhiteSpace.g:2207:1: rule__Modulo__Group__2 : rule__Modulo__Group__2__Impl ;
    public final void rule__Modulo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2211:1: ( rule__Modulo__Group__2__Impl )
            // InternalWhiteSpace.g:2212:2: rule__Modulo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__2"


    // $ANTLR start "rule__Modulo__Group__2__Impl"
    // InternalWhiteSpace.g:2218:1: rule__Modulo__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__Modulo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2222:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2223:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2223:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2224:2: RULE_TAB
            {
             before(grammarAccess.getModuloAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getModuloAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__2__Impl"


    // $ANTLR start "rule__HeapAccess__Group__0"
    // InternalWhiteSpace.g:2234:1: rule__HeapAccess__Group__0 : rule__HeapAccess__Group__0__Impl rule__HeapAccess__Group__1 ;
    public final void rule__HeapAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2238:1: ( rule__HeapAccess__Group__0__Impl rule__HeapAccess__Group__1 )
            // InternalWhiteSpace.g:2239:2: rule__HeapAccess__Group__0__Impl rule__HeapAccess__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__HeapAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeapAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Group__0"


    // $ANTLR start "rule__HeapAccess__Group__0__Impl"
    // InternalWhiteSpace.g:2246:1: rule__HeapAccess__Group__0__Impl : ( RULE_TAB ) ;
    public final void rule__HeapAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2250:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2251:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2251:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2252:2: RULE_TAB
            {
             before(grammarAccess.getHeapAccessAccess().getTABTerminalRuleCall_0()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getHeapAccessAccess().getTABTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Group__0__Impl"


    // $ANTLR start "rule__HeapAccess__Group__1"
    // InternalWhiteSpace.g:2261:1: rule__HeapAccess__Group__1 : rule__HeapAccess__Group__1__Impl rule__HeapAccess__Group__2 ;
    public final void rule__HeapAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2265:1: ( rule__HeapAccess__Group__1__Impl rule__HeapAccess__Group__2 )
            // InternalWhiteSpace.g:2266:2: rule__HeapAccess__Group__1__Impl rule__HeapAccess__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HeapAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeapAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Group__1"


    // $ANTLR start "rule__HeapAccess__Group__1__Impl"
    // InternalWhiteSpace.g:2273:1: rule__HeapAccess__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__HeapAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2277:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2278:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2278:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2279:2: RULE_TAB
            {
             before(grammarAccess.getHeapAccessAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getHeapAccessAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Group__1__Impl"


    // $ANTLR start "rule__HeapAccess__Group__2"
    // InternalWhiteSpace.g:2288:1: rule__HeapAccess__Group__2 : rule__HeapAccess__Group__2__Impl ;
    public final void rule__HeapAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2292:1: ( rule__HeapAccess__Group__2__Impl )
            // InternalWhiteSpace.g:2293:2: rule__HeapAccess__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeapAccess__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Group__2"


    // $ANTLR start "rule__HeapAccess__Group__2__Impl"
    // InternalWhiteSpace.g:2299:1: rule__HeapAccess__Group__2__Impl : ( ( rule__HeapAccess__Alternatives_2 ) ) ;
    public final void rule__HeapAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2303:1: ( ( ( rule__HeapAccess__Alternatives_2 ) ) )
            // InternalWhiteSpace.g:2304:1: ( ( rule__HeapAccess__Alternatives_2 ) )
            {
            // InternalWhiteSpace.g:2304:1: ( ( rule__HeapAccess__Alternatives_2 ) )
            // InternalWhiteSpace.g:2305:2: ( rule__HeapAccess__Alternatives_2 )
            {
             before(grammarAccess.getHeapAccessAccess().getAlternatives_2()); 
            // InternalWhiteSpace.g:2306:2: ( rule__HeapAccess__Alternatives_2 )
            // InternalWhiteSpace.g:2306:3: rule__HeapAccess__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__HeapAccess__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getHeapAccessAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeapAccess__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalWhiteSpace.g:2315:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2319:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalWhiteSpace.g:2320:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalWhiteSpace.g:2327:1: rule__Store__Group__0__Impl : ( () ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2331:1: ( ( () ) )
            // InternalWhiteSpace.g:2332:1: ( () )
            {
            // InternalWhiteSpace.g:2332:1: ( () )
            // InternalWhiteSpace.g:2333:2: ()
            {
             before(grammarAccess.getStoreAccess().getStoreAction_0()); 
            // InternalWhiteSpace.g:2334:2: ()
            // InternalWhiteSpace.g:2334:3: 
            {
            }

             after(grammarAccess.getStoreAccess().getStoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalWhiteSpace.g:2342:1: rule__Store__Group__1 : rule__Store__Group__1__Impl ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2346:1: ( rule__Store__Group__1__Impl )
            // InternalWhiteSpace.g:2347:2: rule__Store__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalWhiteSpace.g:2353:1: rule__Store__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2357:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2358:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2358:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2359:2: RULE_SPACE
            {
             before(grammarAccess.getStoreAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Retrieve__Group__0"
    // InternalWhiteSpace.g:2369:1: rule__Retrieve__Group__0 : rule__Retrieve__Group__0__Impl rule__Retrieve__Group__1 ;
    public final void rule__Retrieve__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2373:1: ( rule__Retrieve__Group__0__Impl rule__Retrieve__Group__1 )
            // InternalWhiteSpace.g:2374:2: rule__Retrieve__Group__0__Impl rule__Retrieve__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Retrieve__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__0"


    // $ANTLR start "rule__Retrieve__Group__0__Impl"
    // InternalWhiteSpace.g:2381:1: rule__Retrieve__Group__0__Impl : ( () ) ;
    public final void rule__Retrieve__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2385:1: ( ( () ) )
            // InternalWhiteSpace.g:2386:1: ( () )
            {
            // InternalWhiteSpace.g:2386:1: ( () )
            // InternalWhiteSpace.g:2387:2: ()
            {
             before(grammarAccess.getRetrieveAccess().getRetrieveAction_0()); 
            // InternalWhiteSpace.g:2388:2: ()
            // InternalWhiteSpace.g:2388:3: 
            {
            }

             after(grammarAccess.getRetrieveAccess().getRetrieveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__0__Impl"


    // $ANTLR start "rule__Retrieve__Group__1"
    // InternalWhiteSpace.g:2396:1: rule__Retrieve__Group__1 : rule__Retrieve__Group__1__Impl ;
    public final void rule__Retrieve__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2400:1: ( rule__Retrieve__Group__1__Impl )
            // InternalWhiteSpace.g:2401:2: rule__Retrieve__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Retrieve__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__1"


    // $ANTLR start "rule__Retrieve__Group__1__Impl"
    // InternalWhiteSpace.g:2407:1: rule__Retrieve__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__Retrieve__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2411:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2412:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2412:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2413:2: RULE_TAB
            {
             before(grammarAccess.getRetrieveAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getRetrieveAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retrieve__Group__1__Impl"


    // $ANTLR start "rule__FlowControl__Group__0"
    // InternalWhiteSpace.g:2423:1: rule__FlowControl__Group__0 : rule__FlowControl__Group__0__Impl rule__FlowControl__Group__1 ;
    public final void rule__FlowControl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2427:1: ( rule__FlowControl__Group__0__Impl rule__FlowControl__Group__1 )
            // InternalWhiteSpace.g:2428:2: rule__FlowControl__Group__0__Impl rule__FlowControl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FlowControl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlowControl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlowControl__Group__0"


    // $ANTLR start "rule__FlowControl__Group__0__Impl"
    // InternalWhiteSpace.g:2435:1: rule__FlowControl__Group__0__Impl : ( RULE_LF ) ;
    public final void rule__FlowControl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2439:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:2440:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:2440:1: ( RULE_LF )
            // InternalWhiteSpace.g:2441:2: RULE_LF
            {
             before(grammarAccess.getFlowControlAccess().getLFTerminalRuleCall_0()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getFlowControlAccess().getLFTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlowControl__Group__0__Impl"


    // $ANTLR start "rule__FlowControl__Group__1"
    // InternalWhiteSpace.g:2450:1: rule__FlowControl__Group__1 : rule__FlowControl__Group__1__Impl ;
    public final void rule__FlowControl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2454:1: ( rule__FlowControl__Group__1__Impl )
            // InternalWhiteSpace.g:2455:2: rule__FlowControl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlowControl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlowControl__Group__1"


    // $ANTLR start "rule__FlowControl__Group__1__Impl"
    // InternalWhiteSpace.g:2461:1: rule__FlowControl__Group__1__Impl : ( ( rule__FlowControl__Alternatives_1 ) ) ;
    public final void rule__FlowControl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2465:1: ( ( ( rule__FlowControl__Alternatives_1 ) ) )
            // InternalWhiteSpace.g:2466:1: ( ( rule__FlowControl__Alternatives_1 ) )
            {
            // InternalWhiteSpace.g:2466:1: ( ( rule__FlowControl__Alternatives_1 ) )
            // InternalWhiteSpace.g:2467:2: ( rule__FlowControl__Alternatives_1 )
            {
             before(grammarAccess.getFlowControlAccess().getAlternatives_1()); 
            // InternalWhiteSpace.g:2468:2: ( rule__FlowControl__Alternatives_1 )
            // InternalWhiteSpace.g:2468:3: rule__FlowControl__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__FlowControl__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowControlAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlowControl__Group__1__Impl"


    // $ANTLR start "rule__MarkLocation__Group__0"
    // InternalWhiteSpace.g:2477:1: rule__MarkLocation__Group__0 : rule__MarkLocation__Group__0__Impl rule__MarkLocation__Group__1 ;
    public final void rule__MarkLocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2481:1: ( rule__MarkLocation__Group__0__Impl rule__MarkLocation__Group__1 )
            // InternalWhiteSpace.g:2482:2: rule__MarkLocation__Group__0__Impl rule__MarkLocation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MarkLocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkLocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__0"


    // $ANTLR start "rule__MarkLocation__Group__0__Impl"
    // InternalWhiteSpace.g:2489:1: rule__MarkLocation__Group__0__Impl : ( () ) ;
    public final void rule__MarkLocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2493:1: ( ( () ) )
            // InternalWhiteSpace.g:2494:1: ( () )
            {
            // InternalWhiteSpace.g:2494:1: ( () )
            // InternalWhiteSpace.g:2495:2: ()
            {
             before(grammarAccess.getMarkLocationAccess().getMarkLocationAction_0()); 
            // InternalWhiteSpace.g:2496:2: ()
            // InternalWhiteSpace.g:2496:3: 
            {
            }

             after(grammarAccess.getMarkLocationAccess().getMarkLocationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__0__Impl"


    // $ANTLR start "rule__MarkLocation__Group__1"
    // InternalWhiteSpace.g:2504:1: rule__MarkLocation__Group__1 : rule__MarkLocation__Group__1__Impl rule__MarkLocation__Group__2 ;
    public final void rule__MarkLocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2508:1: ( rule__MarkLocation__Group__1__Impl rule__MarkLocation__Group__2 )
            // InternalWhiteSpace.g:2509:2: rule__MarkLocation__Group__1__Impl rule__MarkLocation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MarkLocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkLocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__1"


    // $ANTLR start "rule__MarkLocation__Group__1__Impl"
    // InternalWhiteSpace.g:2516:1: rule__MarkLocation__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__MarkLocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2520:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2521:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2521:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2522:2: RULE_SPACE
            {
             before(grammarAccess.getMarkLocationAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getMarkLocationAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__1__Impl"


    // $ANTLR start "rule__MarkLocation__Group__2"
    // InternalWhiteSpace.g:2531:1: rule__MarkLocation__Group__2 : rule__MarkLocation__Group__2__Impl rule__MarkLocation__Group__3 ;
    public final void rule__MarkLocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2535:1: ( rule__MarkLocation__Group__2__Impl rule__MarkLocation__Group__3 )
            // InternalWhiteSpace.g:2536:2: rule__MarkLocation__Group__2__Impl rule__MarkLocation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MarkLocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkLocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__2"


    // $ANTLR start "rule__MarkLocation__Group__2__Impl"
    // InternalWhiteSpace.g:2543:1: rule__MarkLocation__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__MarkLocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2547:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2548:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2548:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2549:2: RULE_SPACE
            {
             before(grammarAccess.getMarkLocationAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getMarkLocationAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__2__Impl"


    // $ANTLR start "rule__MarkLocation__Group__3"
    // InternalWhiteSpace.g:2558:1: rule__MarkLocation__Group__3 : rule__MarkLocation__Group__3__Impl ;
    public final void rule__MarkLocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2562:1: ( rule__MarkLocation__Group__3__Impl )
            // InternalWhiteSpace.g:2563:2: rule__MarkLocation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkLocation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__3"


    // $ANTLR start "rule__MarkLocation__Group__3__Impl"
    // InternalWhiteSpace.g:2569:1: rule__MarkLocation__Group__3__Impl : ( ( rule__MarkLocation__LabelAssignment_3 ) ) ;
    public final void rule__MarkLocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2573:1: ( ( ( rule__MarkLocation__LabelAssignment_3 ) ) )
            // InternalWhiteSpace.g:2574:1: ( ( rule__MarkLocation__LabelAssignment_3 ) )
            {
            // InternalWhiteSpace.g:2574:1: ( ( rule__MarkLocation__LabelAssignment_3 ) )
            // InternalWhiteSpace.g:2575:2: ( rule__MarkLocation__LabelAssignment_3 )
            {
             before(grammarAccess.getMarkLocationAccess().getLabelAssignment_3()); 
            // InternalWhiteSpace.g:2576:2: ( rule__MarkLocation__LabelAssignment_3 )
            // InternalWhiteSpace.g:2576:3: rule__MarkLocation__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MarkLocation__LabelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMarkLocationAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__Group__3__Impl"


    // $ANTLR start "rule__CallSubroutine__Group__0"
    // InternalWhiteSpace.g:2585:1: rule__CallSubroutine__Group__0 : rule__CallSubroutine__Group__0__Impl rule__CallSubroutine__Group__1 ;
    public final void rule__CallSubroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2589:1: ( rule__CallSubroutine__Group__0__Impl rule__CallSubroutine__Group__1 )
            // InternalWhiteSpace.g:2590:2: rule__CallSubroutine__Group__0__Impl rule__CallSubroutine__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CallSubroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallSubroutine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__0"


    // $ANTLR start "rule__CallSubroutine__Group__0__Impl"
    // InternalWhiteSpace.g:2597:1: rule__CallSubroutine__Group__0__Impl : ( () ) ;
    public final void rule__CallSubroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2601:1: ( ( () ) )
            // InternalWhiteSpace.g:2602:1: ( () )
            {
            // InternalWhiteSpace.g:2602:1: ( () )
            // InternalWhiteSpace.g:2603:2: ()
            {
             before(grammarAccess.getCallSubroutineAccess().getCallSubroutineAction_0()); 
            // InternalWhiteSpace.g:2604:2: ()
            // InternalWhiteSpace.g:2604:3: 
            {
            }

             after(grammarAccess.getCallSubroutineAccess().getCallSubroutineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__0__Impl"


    // $ANTLR start "rule__CallSubroutine__Group__1"
    // InternalWhiteSpace.g:2612:1: rule__CallSubroutine__Group__1 : rule__CallSubroutine__Group__1__Impl rule__CallSubroutine__Group__2 ;
    public final void rule__CallSubroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2616:1: ( rule__CallSubroutine__Group__1__Impl rule__CallSubroutine__Group__2 )
            // InternalWhiteSpace.g:2617:2: rule__CallSubroutine__Group__1__Impl rule__CallSubroutine__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CallSubroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallSubroutine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__1"


    // $ANTLR start "rule__CallSubroutine__Group__1__Impl"
    // InternalWhiteSpace.g:2624:1: rule__CallSubroutine__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__CallSubroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2628:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2629:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2629:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2630:2: RULE_SPACE
            {
             before(grammarAccess.getCallSubroutineAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getCallSubroutineAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__1__Impl"


    // $ANTLR start "rule__CallSubroutine__Group__2"
    // InternalWhiteSpace.g:2639:1: rule__CallSubroutine__Group__2 : rule__CallSubroutine__Group__2__Impl rule__CallSubroutine__Group__3 ;
    public final void rule__CallSubroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2643:1: ( rule__CallSubroutine__Group__2__Impl rule__CallSubroutine__Group__3 )
            // InternalWhiteSpace.g:2644:2: rule__CallSubroutine__Group__2__Impl rule__CallSubroutine__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CallSubroutine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallSubroutine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__2"


    // $ANTLR start "rule__CallSubroutine__Group__2__Impl"
    // InternalWhiteSpace.g:2651:1: rule__CallSubroutine__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__CallSubroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2655:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2656:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2656:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2657:2: RULE_TAB
            {
             before(grammarAccess.getCallSubroutineAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getCallSubroutineAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__2__Impl"


    // $ANTLR start "rule__CallSubroutine__Group__3"
    // InternalWhiteSpace.g:2666:1: rule__CallSubroutine__Group__3 : rule__CallSubroutine__Group__3__Impl ;
    public final void rule__CallSubroutine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2670:1: ( rule__CallSubroutine__Group__3__Impl )
            // InternalWhiteSpace.g:2671:2: rule__CallSubroutine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallSubroutine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__3"


    // $ANTLR start "rule__CallSubroutine__Group__3__Impl"
    // InternalWhiteSpace.g:2677:1: rule__CallSubroutine__Group__3__Impl : ( ( rule__CallSubroutine__LabelAssignment_3 ) ) ;
    public final void rule__CallSubroutine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2681:1: ( ( ( rule__CallSubroutine__LabelAssignment_3 ) ) )
            // InternalWhiteSpace.g:2682:1: ( ( rule__CallSubroutine__LabelAssignment_3 ) )
            {
            // InternalWhiteSpace.g:2682:1: ( ( rule__CallSubroutine__LabelAssignment_3 ) )
            // InternalWhiteSpace.g:2683:2: ( rule__CallSubroutine__LabelAssignment_3 )
            {
             before(grammarAccess.getCallSubroutineAccess().getLabelAssignment_3()); 
            // InternalWhiteSpace.g:2684:2: ( rule__CallSubroutine__LabelAssignment_3 )
            // InternalWhiteSpace.g:2684:3: rule__CallSubroutine__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CallSubroutine__LabelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCallSubroutineAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__Group__3__Impl"


    // $ANTLR start "rule__UnconditionalJump__Group__0"
    // InternalWhiteSpace.g:2693:1: rule__UnconditionalJump__Group__0 : rule__UnconditionalJump__Group__0__Impl rule__UnconditionalJump__Group__1 ;
    public final void rule__UnconditionalJump__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2697:1: ( rule__UnconditionalJump__Group__0__Impl rule__UnconditionalJump__Group__1 )
            // InternalWhiteSpace.g:2698:2: rule__UnconditionalJump__Group__0__Impl rule__UnconditionalJump__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__UnconditionalJump__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnconditionalJump__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__0"


    // $ANTLR start "rule__UnconditionalJump__Group__0__Impl"
    // InternalWhiteSpace.g:2705:1: rule__UnconditionalJump__Group__0__Impl : ( () ) ;
    public final void rule__UnconditionalJump__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2709:1: ( ( () ) )
            // InternalWhiteSpace.g:2710:1: ( () )
            {
            // InternalWhiteSpace.g:2710:1: ( () )
            // InternalWhiteSpace.g:2711:2: ()
            {
             before(grammarAccess.getUnconditionalJumpAccess().getUnconditionalJumpAction_0()); 
            // InternalWhiteSpace.g:2712:2: ()
            // InternalWhiteSpace.g:2712:3: 
            {
            }

             after(grammarAccess.getUnconditionalJumpAccess().getUnconditionalJumpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__0__Impl"


    // $ANTLR start "rule__UnconditionalJump__Group__1"
    // InternalWhiteSpace.g:2720:1: rule__UnconditionalJump__Group__1 : rule__UnconditionalJump__Group__1__Impl rule__UnconditionalJump__Group__2 ;
    public final void rule__UnconditionalJump__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2724:1: ( rule__UnconditionalJump__Group__1__Impl rule__UnconditionalJump__Group__2 )
            // InternalWhiteSpace.g:2725:2: rule__UnconditionalJump__Group__1__Impl rule__UnconditionalJump__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__UnconditionalJump__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnconditionalJump__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__1"


    // $ANTLR start "rule__UnconditionalJump__Group__1__Impl"
    // InternalWhiteSpace.g:2732:1: rule__UnconditionalJump__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__UnconditionalJump__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2736:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2737:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2737:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2738:2: RULE_SPACE
            {
             before(grammarAccess.getUnconditionalJumpAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getUnconditionalJumpAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__1__Impl"


    // $ANTLR start "rule__UnconditionalJump__Group__2"
    // InternalWhiteSpace.g:2747:1: rule__UnconditionalJump__Group__2 : rule__UnconditionalJump__Group__2__Impl rule__UnconditionalJump__Group__3 ;
    public final void rule__UnconditionalJump__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2751:1: ( rule__UnconditionalJump__Group__2__Impl rule__UnconditionalJump__Group__3 )
            // InternalWhiteSpace.g:2752:2: rule__UnconditionalJump__Group__2__Impl rule__UnconditionalJump__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__UnconditionalJump__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnconditionalJump__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__2"


    // $ANTLR start "rule__UnconditionalJump__Group__2__Impl"
    // InternalWhiteSpace.g:2759:1: rule__UnconditionalJump__Group__2__Impl : ( RULE_LF ) ;
    public final void rule__UnconditionalJump__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2763:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:2764:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:2764:1: ( RULE_LF )
            // InternalWhiteSpace.g:2765:2: RULE_LF
            {
             before(grammarAccess.getUnconditionalJumpAccess().getLFTerminalRuleCall_2()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getUnconditionalJumpAccess().getLFTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__2__Impl"


    // $ANTLR start "rule__UnconditionalJump__Group__3"
    // InternalWhiteSpace.g:2774:1: rule__UnconditionalJump__Group__3 : rule__UnconditionalJump__Group__3__Impl ;
    public final void rule__UnconditionalJump__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2778:1: ( rule__UnconditionalJump__Group__3__Impl )
            // InternalWhiteSpace.g:2779:2: rule__UnconditionalJump__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalJump__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__3"


    // $ANTLR start "rule__UnconditionalJump__Group__3__Impl"
    // InternalWhiteSpace.g:2785:1: rule__UnconditionalJump__Group__3__Impl : ( ( rule__UnconditionalJump__LabelAssignment_3 ) ) ;
    public final void rule__UnconditionalJump__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2789:1: ( ( ( rule__UnconditionalJump__LabelAssignment_3 ) ) )
            // InternalWhiteSpace.g:2790:1: ( ( rule__UnconditionalJump__LabelAssignment_3 ) )
            {
            // InternalWhiteSpace.g:2790:1: ( ( rule__UnconditionalJump__LabelAssignment_3 ) )
            // InternalWhiteSpace.g:2791:2: ( rule__UnconditionalJump__LabelAssignment_3 )
            {
             before(grammarAccess.getUnconditionalJumpAccess().getLabelAssignment_3()); 
            // InternalWhiteSpace.g:2792:2: ( rule__UnconditionalJump__LabelAssignment_3 )
            // InternalWhiteSpace.g:2792:3: rule__UnconditionalJump__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalJump__LabelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalJumpAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__Group__3__Impl"


    // $ANTLR start "rule__ZeroJump__Group__0"
    // InternalWhiteSpace.g:2801:1: rule__ZeroJump__Group__0 : rule__ZeroJump__Group__0__Impl rule__ZeroJump__Group__1 ;
    public final void rule__ZeroJump__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2805:1: ( rule__ZeroJump__Group__0__Impl rule__ZeroJump__Group__1 )
            // InternalWhiteSpace.g:2806:2: rule__ZeroJump__Group__0__Impl rule__ZeroJump__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ZeroJump__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZeroJump__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__0"


    // $ANTLR start "rule__ZeroJump__Group__0__Impl"
    // InternalWhiteSpace.g:2813:1: rule__ZeroJump__Group__0__Impl : ( () ) ;
    public final void rule__ZeroJump__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2817:1: ( ( () ) )
            // InternalWhiteSpace.g:2818:1: ( () )
            {
            // InternalWhiteSpace.g:2818:1: ( () )
            // InternalWhiteSpace.g:2819:2: ()
            {
             before(grammarAccess.getZeroJumpAccess().getZeroJumpAction_0()); 
            // InternalWhiteSpace.g:2820:2: ()
            // InternalWhiteSpace.g:2820:3: 
            {
            }

             after(grammarAccess.getZeroJumpAccess().getZeroJumpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__0__Impl"


    // $ANTLR start "rule__ZeroJump__Group__1"
    // InternalWhiteSpace.g:2828:1: rule__ZeroJump__Group__1 : rule__ZeroJump__Group__1__Impl rule__ZeroJump__Group__2 ;
    public final void rule__ZeroJump__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2832:1: ( rule__ZeroJump__Group__1__Impl rule__ZeroJump__Group__2 )
            // InternalWhiteSpace.g:2833:2: rule__ZeroJump__Group__1__Impl rule__ZeroJump__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ZeroJump__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZeroJump__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__1"


    // $ANTLR start "rule__ZeroJump__Group__1__Impl"
    // InternalWhiteSpace.g:2840:1: rule__ZeroJump__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__ZeroJump__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2844:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2845:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2845:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2846:2: RULE_TAB
            {
             before(grammarAccess.getZeroJumpAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getZeroJumpAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__1__Impl"


    // $ANTLR start "rule__ZeroJump__Group__2"
    // InternalWhiteSpace.g:2855:1: rule__ZeroJump__Group__2 : rule__ZeroJump__Group__2__Impl rule__ZeroJump__Group__3 ;
    public final void rule__ZeroJump__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2859:1: ( rule__ZeroJump__Group__2__Impl rule__ZeroJump__Group__3 )
            // InternalWhiteSpace.g:2860:2: rule__ZeroJump__Group__2__Impl rule__ZeroJump__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ZeroJump__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZeroJump__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__2"


    // $ANTLR start "rule__ZeroJump__Group__2__Impl"
    // InternalWhiteSpace.g:2867:1: rule__ZeroJump__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__ZeroJump__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2871:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:2872:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:2872:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:2873:2: RULE_SPACE
            {
             before(grammarAccess.getZeroJumpAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getZeroJumpAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__2__Impl"


    // $ANTLR start "rule__ZeroJump__Group__3"
    // InternalWhiteSpace.g:2882:1: rule__ZeroJump__Group__3 : rule__ZeroJump__Group__3__Impl ;
    public final void rule__ZeroJump__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2886:1: ( rule__ZeroJump__Group__3__Impl )
            // InternalWhiteSpace.g:2887:2: rule__ZeroJump__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZeroJump__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__3"


    // $ANTLR start "rule__ZeroJump__Group__3__Impl"
    // InternalWhiteSpace.g:2893:1: rule__ZeroJump__Group__3__Impl : ( ( rule__ZeroJump__LabelAssignment_3 ) ) ;
    public final void rule__ZeroJump__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2897:1: ( ( ( rule__ZeroJump__LabelAssignment_3 ) ) )
            // InternalWhiteSpace.g:2898:1: ( ( rule__ZeroJump__LabelAssignment_3 ) )
            {
            // InternalWhiteSpace.g:2898:1: ( ( rule__ZeroJump__LabelAssignment_3 ) )
            // InternalWhiteSpace.g:2899:2: ( rule__ZeroJump__LabelAssignment_3 )
            {
             before(grammarAccess.getZeroJumpAccess().getLabelAssignment_3()); 
            // InternalWhiteSpace.g:2900:2: ( rule__ZeroJump__LabelAssignment_3 )
            // InternalWhiteSpace.g:2900:3: rule__ZeroJump__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ZeroJump__LabelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getZeroJumpAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__Group__3__Impl"


    // $ANTLR start "rule__NegativeJump__Group__0"
    // InternalWhiteSpace.g:2909:1: rule__NegativeJump__Group__0 : rule__NegativeJump__Group__0__Impl rule__NegativeJump__Group__1 ;
    public final void rule__NegativeJump__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2913:1: ( rule__NegativeJump__Group__0__Impl rule__NegativeJump__Group__1 )
            // InternalWhiteSpace.g:2914:2: rule__NegativeJump__Group__0__Impl rule__NegativeJump__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NegativeJump__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegativeJump__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__0"


    // $ANTLR start "rule__NegativeJump__Group__0__Impl"
    // InternalWhiteSpace.g:2921:1: rule__NegativeJump__Group__0__Impl : ( () ) ;
    public final void rule__NegativeJump__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2925:1: ( ( () ) )
            // InternalWhiteSpace.g:2926:1: ( () )
            {
            // InternalWhiteSpace.g:2926:1: ( () )
            // InternalWhiteSpace.g:2927:2: ()
            {
             before(grammarAccess.getNegativeJumpAccess().getNegativeJumpAction_0()); 
            // InternalWhiteSpace.g:2928:2: ()
            // InternalWhiteSpace.g:2928:3: 
            {
            }

             after(grammarAccess.getNegativeJumpAccess().getNegativeJumpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__0__Impl"


    // $ANTLR start "rule__NegativeJump__Group__1"
    // InternalWhiteSpace.g:2936:1: rule__NegativeJump__Group__1 : rule__NegativeJump__Group__1__Impl rule__NegativeJump__Group__2 ;
    public final void rule__NegativeJump__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2940:1: ( rule__NegativeJump__Group__1__Impl rule__NegativeJump__Group__2 )
            // InternalWhiteSpace.g:2941:2: rule__NegativeJump__Group__1__Impl rule__NegativeJump__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NegativeJump__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegativeJump__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__1"


    // $ANTLR start "rule__NegativeJump__Group__1__Impl"
    // InternalWhiteSpace.g:2948:1: rule__NegativeJump__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__NegativeJump__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2952:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2953:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2953:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2954:2: RULE_TAB
            {
             before(grammarAccess.getNegativeJumpAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getNegativeJumpAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__1__Impl"


    // $ANTLR start "rule__NegativeJump__Group__2"
    // InternalWhiteSpace.g:2963:1: rule__NegativeJump__Group__2 : rule__NegativeJump__Group__2__Impl rule__NegativeJump__Group__3 ;
    public final void rule__NegativeJump__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2967:1: ( rule__NegativeJump__Group__2__Impl rule__NegativeJump__Group__3 )
            // InternalWhiteSpace.g:2968:2: rule__NegativeJump__Group__2__Impl rule__NegativeJump__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__NegativeJump__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegativeJump__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__2"


    // $ANTLR start "rule__NegativeJump__Group__2__Impl"
    // InternalWhiteSpace.g:2975:1: rule__NegativeJump__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__NegativeJump__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2979:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:2980:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:2980:1: ( RULE_TAB )
            // InternalWhiteSpace.g:2981:2: RULE_TAB
            {
             before(grammarAccess.getNegativeJumpAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getNegativeJumpAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__2__Impl"


    // $ANTLR start "rule__NegativeJump__Group__3"
    // InternalWhiteSpace.g:2990:1: rule__NegativeJump__Group__3 : rule__NegativeJump__Group__3__Impl ;
    public final void rule__NegativeJump__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:2994:1: ( rule__NegativeJump__Group__3__Impl )
            // InternalWhiteSpace.g:2995:2: rule__NegativeJump__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegativeJump__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__3"


    // $ANTLR start "rule__NegativeJump__Group__3__Impl"
    // InternalWhiteSpace.g:3001:1: rule__NegativeJump__Group__3__Impl : ( ( rule__NegativeJump__LabelAssignment_3 ) ) ;
    public final void rule__NegativeJump__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3005:1: ( ( ( rule__NegativeJump__LabelAssignment_3 ) ) )
            // InternalWhiteSpace.g:3006:1: ( ( rule__NegativeJump__LabelAssignment_3 ) )
            {
            // InternalWhiteSpace.g:3006:1: ( ( rule__NegativeJump__LabelAssignment_3 ) )
            // InternalWhiteSpace.g:3007:2: ( rule__NegativeJump__LabelAssignment_3 )
            {
             before(grammarAccess.getNegativeJumpAccess().getLabelAssignment_3()); 
            // InternalWhiteSpace.g:3008:2: ( rule__NegativeJump__LabelAssignment_3 )
            // InternalWhiteSpace.g:3008:3: rule__NegativeJump__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NegativeJump__LabelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNegativeJumpAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__Group__3__Impl"


    // $ANTLR start "rule__EndSubroutine__Group__0"
    // InternalWhiteSpace.g:3017:1: rule__EndSubroutine__Group__0 : rule__EndSubroutine__Group__0__Impl rule__EndSubroutine__Group__1 ;
    public final void rule__EndSubroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3021:1: ( rule__EndSubroutine__Group__0__Impl rule__EndSubroutine__Group__1 )
            // InternalWhiteSpace.g:3022:2: rule__EndSubroutine__Group__0__Impl rule__EndSubroutine__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EndSubroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndSubroutine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndSubroutine__Group__0"


    // $ANTLR start "rule__EndSubroutine__Group__0__Impl"
    // InternalWhiteSpace.g:3029:1: rule__EndSubroutine__Group__0__Impl : ( () ) ;
    public final void rule__EndSubroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3033:1: ( ( () ) )
            // InternalWhiteSpace.g:3034:1: ( () )
            {
            // InternalWhiteSpace.g:3034:1: ( () )
            // InternalWhiteSpace.g:3035:2: ()
            {
             before(grammarAccess.getEndSubroutineAccess().getEndSubroutineAction_0()); 
            // InternalWhiteSpace.g:3036:2: ()
            // InternalWhiteSpace.g:3036:3: 
            {
            }

             after(grammarAccess.getEndSubroutineAccess().getEndSubroutineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndSubroutine__Group__0__Impl"


    // $ANTLR start "rule__EndSubroutine__Group__1"
    // InternalWhiteSpace.g:3044:1: rule__EndSubroutine__Group__1 : rule__EndSubroutine__Group__1__Impl rule__EndSubroutine__Group__2 ;
    public final void rule__EndSubroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3048:1: ( rule__EndSubroutine__Group__1__Impl rule__EndSubroutine__Group__2 )
            // InternalWhiteSpace.g:3049:2: rule__EndSubroutine__Group__1__Impl rule__EndSubroutine__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EndSubroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndSubroutine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndSubroutine__Group__1"


    // $ANTLR start "rule__EndSubroutine__Group__1__Impl"
    // InternalWhiteSpace.g:3056:1: rule__EndSubroutine__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__EndSubroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3060:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:3061:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:3061:1: ( RULE_TAB )
            // InternalWhiteSpace.g:3062:2: RULE_TAB
            {
             before(grammarAccess.getEndSubroutineAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getEndSubroutineAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndSubroutine__Group__1__Impl"


    // $ANTLR start "rule__EndSubroutine__Group__2"
    // InternalWhiteSpace.g:3071:1: rule__EndSubroutine__Group__2 : rule__EndSubroutine__Group__2__Impl ;
    public final void rule__EndSubroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3075:1: ( rule__EndSubroutine__Group__2__Impl )
            // InternalWhiteSpace.g:3076:2: rule__EndSubroutine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndSubroutine__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndSubroutine__Group__2"


    // $ANTLR start "rule__EndSubroutine__Group__2__Impl"
    // InternalWhiteSpace.g:3082:1: rule__EndSubroutine__Group__2__Impl : ( RULE_LF ) ;
    public final void rule__EndSubroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3086:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:3087:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:3087:1: ( RULE_LF )
            // InternalWhiteSpace.g:3088:2: RULE_LF
            {
             before(grammarAccess.getEndSubroutineAccess().getLFTerminalRuleCall_2()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getEndSubroutineAccess().getLFTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndSubroutine__Group__2__Impl"


    // $ANTLR start "rule__EndProgram__Group__0"
    // InternalWhiteSpace.g:3098:1: rule__EndProgram__Group__0 : rule__EndProgram__Group__0__Impl rule__EndProgram__Group__1 ;
    public final void rule__EndProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3102:1: ( rule__EndProgram__Group__0__Impl rule__EndProgram__Group__1 )
            // InternalWhiteSpace.g:3103:2: rule__EndProgram__Group__0__Impl rule__EndProgram__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EndProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProgram__Group__0"


    // $ANTLR start "rule__EndProgram__Group__0__Impl"
    // InternalWhiteSpace.g:3110:1: rule__EndProgram__Group__0__Impl : ( () ) ;
    public final void rule__EndProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3114:1: ( ( () ) )
            // InternalWhiteSpace.g:3115:1: ( () )
            {
            // InternalWhiteSpace.g:3115:1: ( () )
            // InternalWhiteSpace.g:3116:2: ()
            {
             before(grammarAccess.getEndProgramAccess().getEndProgramAction_0()); 
            // InternalWhiteSpace.g:3117:2: ()
            // InternalWhiteSpace.g:3117:3: 
            {
            }

             after(grammarAccess.getEndProgramAccess().getEndProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProgram__Group__0__Impl"


    // $ANTLR start "rule__EndProgram__Group__1"
    // InternalWhiteSpace.g:3125:1: rule__EndProgram__Group__1 : rule__EndProgram__Group__1__Impl rule__EndProgram__Group__2 ;
    public final void rule__EndProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3129:1: ( rule__EndProgram__Group__1__Impl rule__EndProgram__Group__2 )
            // InternalWhiteSpace.g:3130:2: rule__EndProgram__Group__1__Impl rule__EndProgram__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__EndProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProgram__Group__1"


    // $ANTLR start "rule__EndProgram__Group__1__Impl"
    // InternalWhiteSpace.g:3137:1: rule__EndProgram__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__EndProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3141:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:3142:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:3142:1: ( RULE_LF )
            // InternalWhiteSpace.g:3143:2: RULE_LF
            {
             before(grammarAccess.getEndProgramAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getEndProgramAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProgram__Group__1__Impl"


    // $ANTLR start "rule__EndProgram__Group__2"
    // InternalWhiteSpace.g:3152:1: rule__EndProgram__Group__2 : rule__EndProgram__Group__2__Impl ;
    public final void rule__EndProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3156:1: ( rule__EndProgram__Group__2__Impl )
            // InternalWhiteSpace.g:3157:2: rule__EndProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndProgram__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProgram__Group__2"


    // $ANTLR start "rule__EndProgram__Group__2__Impl"
    // InternalWhiteSpace.g:3163:1: rule__EndProgram__Group__2__Impl : ( RULE_LF ) ;
    public final void rule__EndProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3167:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:3168:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:3168:1: ( RULE_LF )
            // InternalWhiteSpace.g:3169:2: RULE_LF
            {
             before(grammarAccess.getEndProgramAccess().getLFTerminalRuleCall_2()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getEndProgramAccess().getLFTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndProgram__Group__2__Impl"


    // $ANTLR start "rule__IO__Group__0"
    // InternalWhiteSpace.g:3179:1: rule__IO__Group__0 : rule__IO__Group__0__Impl rule__IO__Group__1 ;
    public final void rule__IO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3183:1: ( rule__IO__Group__0__Impl rule__IO__Group__1 )
            // InternalWhiteSpace.g:3184:2: rule__IO__Group__0__Impl rule__IO__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__IO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IO__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Group__0"


    // $ANTLR start "rule__IO__Group__0__Impl"
    // InternalWhiteSpace.g:3191:1: rule__IO__Group__0__Impl : ( RULE_TAB ) ;
    public final void rule__IO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3195:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:3196:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:3196:1: ( RULE_TAB )
            // InternalWhiteSpace.g:3197:2: RULE_TAB
            {
             before(grammarAccess.getIOAccess().getTABTerminalRuleCall_0()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getIOAccess().getTABTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Group__0__Impl"


    // $ANTLR start "rule__IO__Group__1"
    // InternalWhiteSpace.g:3206:1: rule__IO__Group__1 : rule__IO__Group__1__Impl rule__IO__Group__2 ;
    public final void rule__IO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3210:1: ( rule__IO__Group__1__Impl rule__IO__Group__2 )
            // InternalWhiteSpace.g:3211:2: rule__IO__Group__1__Impl rule__IO__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IO__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Group__1"


    // $ANTLR start "rule__IO__Group__1__Impl"
    // InternalWhiteSpace.g:3218:1: rule__IO__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__IO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3222:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:3223:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:3223:1: ( RULE_LF )
            // InternalWhiteSpace.g:3224:2: RULE_LF
            {
             before(grammarAccess.getIOAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getIOAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Group__1__Impl"


    // $ANTLR start "rule__IO__Group__2"
    // InternalWhiteSpace.g:3233:1: rule__IO__Group__2 : rule__IO__Group__2__Impl ;
    public final void rule__IO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3237:1: ( rule__IO__Group__2__Impl )
            // InternalWhiteSpace.g:3238:2: rule__IO__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IO__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Group__2"


    // $ANTLR start "rule__IO__Group__2__Impl"
    // InternalWhiteSpace.g:3244:1: rule__IO__Group__2__Impl : ( ( rule__IO__Alternatives_2 ) ) ;
    public final void rule__IO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3248:1: ( ( ( rule__IO__Alternatives_2 ) ) )
            // InternalWhiteSpace.g:3249:1: ( ( rule__IO__Alternatives_2 ) )
            {
            // InternalWhiteSpace.g:3249:1: ( ( rule__IO__Alternatives_2 ) )
            // InternalWhiteSpace.g:3250:2: ( rule__IO__Alternatives_2 )
            {
             before(grammarAccess.getIOAccess().getAlternatives_2()); 
            // InternalWhiteSpace.g:3251:2: ( rule__IO__Alternatives_2 )
            // InternalWhiteSpace.g:3251:3: rule__IO__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__IO__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getIOAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Group__2__Impl"


    // $ANTLR start "rule__OutputCharacter__Group__0"
    // InternalWhiteSpace.g:3260:1: rule__OutputCharacter__Group__0 : rule__OutputCharacter__Group__0__Impl rule__OutputCharacter__Group__1 ;
    public final void rule__OutputCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3264:1: ( rule__OutputCharacter__Group__0__Impl rule__OutputCharacter__Group__1 )
            // InternalWhiteSpace.g:3265:2: rule__OutputCharacter__Group__0__Impl rule__OutputCharacter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OutputCharacter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputCharacter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputCharacter__Group__0"


    // $ANTLR start "rule__OutputCharacter__Group__0__Impl"
    // InternalWhiteSpace.g:3272:1: rule__OutputCharacter__Group__0__Impl : ( () ) ;
    public final void rule__OutputCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3276:1: ( ( () ) )
            // InternalWhiteSpace.g:3277:1: ( () )
            {
            // InternalWhiteSpace.g:3277:1: ( () )
            // InternalWhiteSpace.g:3278:2: ()
            {
             before(grammarAccess.getOutputCharacterAccess().getOutputCharacterAction_0()); 
            // InternalWhiteSpace.g:3279:2: ()
            // InternalWhiteSpace.g:3279:3: 
            {
            }

             after(grammarAccess.getOutputCharacterAccess().getOutputCharacterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputCharacter__Group__0__Impl"


    // $ANTLR start "rule__OutputCharacter__Group__1"
    // InternalWhiteSpace.g:3287:1: rule__OutputCharacter__Group__1 : rule__OutputCharacter__Group__1__Impl rule__OutputCharacter__Group__2 ;
    public final void rule__OutputCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3291:1: ( rule__OutputCharacter__Group__1__Impl rule__OutputCharacter__Group__2 )
            // InternalWhiteSpace.g:3292:2: rule__OutputCharacter__Group__1__Impl rule__OutputCharacter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__OutputCharacter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputCharacter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputCharacter__Group__1"


    // $ANTLR start "rule__OutputCharacter__Group__1__Impl"
    // InternalWhiteSpace.g:3299:1: rule__OutputCharacter__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__OutputCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3303:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:3304:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:3304:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:3305:2: RULE_SPACE
            {
             before(grammarAccess.getOutputCharacterAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getOutputCharacterAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputCharacter__Group__1__Impl"


    // $ANTLR start "rule__OutputCharacter__Group__2"
    // InternalWhiteSpace.g:3314:1: rule__OutputCharacter__Group__2 : rule__OutputCharacter__Group__2__Impl ;
    public final void rule__OutputCharacter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3318:1: ( rule__OutputCharacter__Group__2__Impl )
            // InternalWhiteSpace.g:3319:2: rule__OutputCharacter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputCharacter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputCharacter__Group__2"


    // $ANTLR start "rule__OutputCharacter__Group__2__Impl"
    // InternalWhiteSpace.g:3325:1: rule__OutputCharacter__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__OutputCharacter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3329:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:3330:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:3330:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:3331:2: RULE_SPACE
            {
             before(grammarAccess.getOutputCharacterAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getOutputCharacterAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputCharacter__Group__2__Impl"


    // $ANTLR start "rule__OutputNumber__Group__0"
    // InternalWhiteSpace.g:3341:1: rule__OutputNumber__Group__0 : rule__OutputNumber__Group__0__Impl rule__OutputNumber__Group__1 ;
    public final void rule__OutputNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3345:1: ( rule__OutputNumber__Group__0__Impl rule__OutputNumber__Group__1 )
            // InternalWhiteSpace.g:3346:2: rule__OutputNumber__Group__0__Impl rule__OutputNumber__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OutputNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputNumber__Group__0"


    // $ANTLR start "rule__OutputNumber__Group__0__Impl"
    // InternalWhiteSpace.g:3353:1: rule__OutputNumber__Group__0__Impl : ( () ) ;
    public final void rule__OutputNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3357:1: ( ( () ) )
            // InternalWhiteSpace.g:3358:1: ( () )
            {
            // InternalWhiteSpace.g:3358:1: ( () )
            // InternalWhiteSpace.g:3359:2: ()
            {
             before(grammarAccess.getOutputNumberAccess().getOutputNumberAction_0()); 
            // InternalWhiteSpace.g:3360:2: ()
            // InternalWhiteSpace.g:3360:3: 
            {
            }

             after(grammarAccess.getOutputNumberAccess().getOutputNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputNumber__Group__0__Impl"


    // $ANTLR start "rule__OutputNumber__Group__1"
    // InternalWhiteSpace.g:3368:1: rule__OutputNumber__Group__1 : rule__OutputNumber__Group__1__Impl rule__OutputNumber__Group__2 ;
    public final void rule__OutputNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3372:1: ( rule__OutputNumber__Group__1__Impl rule__OutputNumber__Group__2 )
            // InternalWhiteSpace.g:3373:2: rule__OutputNumber__Group__1__Impl rule__OutputNumber__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OutputNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputNumber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputNumber__Group__1"


    // $ANTLR start "rule__OutputNumber__Group__1__Impl"
    // InternalWhiteSpace.g:3380:1: rule__OutputNumber__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__OutputNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3384:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:3385:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:3385:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:3386:2: RULE_SPACE
            {
             before(grammarAccess.getOutputNumberAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getOutputNumberAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputNumber__Group__1__Impl"


    // $ANTLR start "rule__OutputNumber__Group__2"
    // InternalWhiteSpace.g:3395:1: rule__OutputNumber__Group__2 : rule__OutputNumber__Group__2__Impl ;
    public final void rule__OutputNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3399:1: ( rule__OutputNumber__Group__2__Impl )
            // InternalWhiteSpace.g:3400:2: rule__OutputNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputNumber__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputNumber__Group__2"


    // $ANTLR start "rule__OutputNumber__Group__2__Impl"
    // InternalWhiteSpace.g:3406:1: rule__OutputNumber__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__OutputNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3410:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:3411:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:3411:1: ( RULE_TAB )
            // InternalWhiteSpace.g:3412:2: RULE_TAB
            {
             before(grammarAccess.getOutputNumberAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getOutputNumberAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputNumber__Group__2__Impl"


    // $ANTLR start "rule__ReadCharacter__Group__0"
    // InternalWhiteSpace.g:3422:1: rule__ReadCharacter__Group__0 : rule__ReadCharacter__Group__0__Impl rule__ReadCharacter__Group__1 ;
    public final void rule__ReadCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3426:1: ( rule__ReadCharacter__Group__0__Impl rule__ReadCharacter__Group__1 )
            // InternalWhiteSpace.g:3427:2: rule__ReadCharacter__Group__0__Impl rule__ReadCharacter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ReadCharacter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadCharacter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCharacter__Group__0"


    // $ANTLR start "rule__ReadCharacter__Group__0__Impl"
    // InternalWhiteSpace.g:3434:1: rule__ReadCharacter__Group__0__Impl : ( () ) ;
    public final void rule__ReadCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3438:1: ( ( () ) )
            // InternalWhiteSpace.g:3439:1: ( () )
            {
            // InternalWhiteSpace.g:3439:1: ( () )
            // InternalWhiteSpace.g:3440:2: ()
            {
             before(grammarAccess.getReadCharacterAccess().getReadCharacterAction_0()); 
            // InternalWhiteSpace.g:3441:2: ()
            // InternalWhiteSpace.g:3441:3: 
            {
            }

             after(grammarAccess.getReadCharacterAccess().getReadCharacterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCharacter__Group__0__Impl"


    // $ANTLR start "rule__ReadCharacter__Group__1"
    // InternalWhiteSpace.g:3449:1: rule__ReadCharacter__Group__1 : rule__ReadCharacter__Group__1__Impl rule__ReadCharacter__Group__2 ;
    public final void rule__ReadCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3453:1: ( rule__ReadCharacter__Group__1__Impl rule__ReadCharacter__Group__2 )
            // InternalWhiteSpace.g:3454:2: rule__ReadCharacter__Group__1__Impl rule__ReadCharacter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReadCharacter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadCharacter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCharacter__Group__1"


    // $ANTLR start "rule__ReadCharacter__Group__1__Impl"
    // InternalWhiteSpace.g:3461:1: rule__ReadCharacter__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__ReadCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3465:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:3466:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:3466:1: ( RULE_TAB )
            // InternalWhiteSpace.g:3467:2: RULE_TAB
            {
             before(grammarAccess.getReadCharacterAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getReadCharacterAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCharacter__Group__1__Impl"


    // $ANTLR start "rule__ReadCharacter__Group__2"
    // InternalWhiteSpace.g:3476:1: rule__ReadCharacter__Group__2 : rule__ReadCharacter__Group__2__Impl ;
    public final void rule__ReadCharacter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3480:1: ( rule__ReadCharacter__Group__2__Impl )
            // InternalWhiteSpace.g:3481:2: rule__ReadCharacter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadCharacter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCharacter__Group__2"


    // $ANTLR start "rule__ReadCharacter__Group__2__Impl"
    // InternalWhiteSpace.g:3487:1: rule__ReadCharacter__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__ReadCharacter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3491:1: ( ( RULE_SPACE ) )
            // InternalWhiteSpace.g:3492:1: ( RULE_SPACE )
            {
            // InternalWhiteSpace.g:3492:1: ( RULE_SPACE )
            // InternalWhiteSpace.g:3493:2: RULE_SPACE
            {
             before(grammarAccess.getReadCharacterAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getReadCharacterAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadCharacter__Group__2__Impl"


    // $ANTLR start "rule__ReadNumber__Group__0"
    // InternalWhiteSpace.g:3503:1: rule__ReadNumber__Group__0 : rule__ReadNumber__Group__0__Impl rule__ReadNumber__Group__1 ;
    public final void rule__ReadNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3507:1: ( rule__ReadNumber__Group__0__Impl rule__ReadNumber__Group__1 )
            // InternalWhiteSpace.g:3508:2: rule__ReadNumber__Group__0__Impl rule__ReadNumber__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ReadNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadNumber__Group__0"


    // $ANTLR start "rule__ReadNumber__Group__0__Impl"
    // InternalWhiteSpace.g:3515:1: rule__ReadNumber__Group__0__Impl : ( () ) ;
    public final void rule__ReadNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3519:1: ( ( () ) )
            // InternalWhiteSpace.g:3520:1: ( () )
            {
            // InternalWhiteSpace.g:3520:1: ( () )
            // InternalWhiteSpace.g:3521:2: ()
            {
             before(grammarAccess.getReadNumberAccess().getReadNumberAction_0()); 
            // InternalWhiteSpace.g:3522:2: ()
            // InternalWhiteSpace.g:3522:3: 
            {
            }

             after(grammarAccess.getReadNumberAccess().getReadNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadNumber__Group__0__Impl"


    // $ANTLR start "rule__ReadNumber__Group__1"
    // InternalWhiteSpace.g:3530:1: rule__ReadNumber__Group__1 : rule__ReadNumber__Group__1__Impl rule__ReadNumber__Group__2 ;
    public final void rule__ReadNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3534:1: ( rule__ReadNumber__Group__1__Impl rule__ReadNumber__Group__2 )
            // InternalWhiteSpace.g:3535:2: rule__ReadNumber__Group__1__Impl rule__ReadNumber__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ReadNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReadNumber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadNumber__Group__1"


    // $ANTLR start "rule__ReadNumber__Group__1__Impl"
    // InternalWhiteSpace.g:3542:1: rule__ReadNumber__Group__1__Impl : ( RULE_TAB ) ;
    public final void rule__ReadNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3546:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:3547:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:3547:1: ( RULE_TAB )
            // InternalWhiteSpace.g:3548:2: RULE_TAB
            {
             before(grammarAccess.getReadNumberAccess().getTABTerminalRuleCall_1()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getReadNumberAccess().getTABTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadNumber__Group__1__Impl"


    // $ANTLR start "rule__ReadNumber__Group__2"
    // InternalWhiteSpace.g:3557:1: rule__ReadNumber__Group__2 : rule__ReadNumber__Group__2__Impl ;
    public final void rule__ReadNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3561:1: ( rule__ReadNumber__Group__2__Impl )
            // InternalWhiteSpace.g:3562:2: rule__ReadNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReadNumber__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadNumber__Group__2"


    // $ANTLR start "rule__ReadNumber__Group__2__Impl"
    // InternalWhiteSpace.g:3568:1: rule__ReadNumber__Group__2__Impl : ( RULE_TAB ) ;
    public final void rule__ReadNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3572:1: ( ( RULE_TAB ) )
            // InternalWhiteSpace.g:3573:1: ( RULE_TAB )
            {
            // InternalWhiteSpace.g:3573:1: ( RULE_TAB )
            // InternalWhiteSpace.g:3574:2: RULE_TAB
            {
             before(grammarAccess.getReadNumberAccess().getTABTerminalRuleCall_2()); 
            match(input,RULE_TAB,FOLLOW_2); 
             after(grammarAccess.getReadNumberAccess().getTABTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadNumber__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalWhiteSpace.g:3584:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3588:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalWhiteSpace.g:3589:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalWhiteSpace.g:3596:1: rule__Number__Group__0__Impl : ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3600:1: ( ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) ) )
            // InternalWhiteSpace.g:3601:1: ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) )
            {
            // InternalWhiteSpace.g:3601:1: ( ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* ) )
            // InternalWhiteSpace.g:3602:2: ( ( rule__Number__Alternatives_0 ) ) ( ( rule__Number__Alternatives_0 )* )
            {
            // InternalWhiteSpace.g:3602:2: ( ( rule__Number__Alternatives_0 ) )
            // InternalWhiteSpace.g:3603:3: ( rule__Number__Alternatives_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_0()); 
            // InternalWhiteSpace.g:3604:3: ( rule__Number__Alternatives_0 )
            // InternalWhiteSpace.g:3604:4: rule__Number__Alternatives_0
            {
            pushFollow(FOLLOW_9);
            rule__Number__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_0()); 

            }

            // InternalWhiteSpace.g:3607:2: ( ( rule__Number__Alternatives_0 )* )
            // InternalWhiteSpace.g:3608:3: ( rule__Number__Alternatives_0 )*
            {
             before(grammarAccess.getNumberAccess().getAlternatives_0()); 
            // InternalWhiteSpace.g:3609:3: ( rule__Number__Alternatives_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_SPACE && LA10_0<=RULE_TAB)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWhiteSpace.g:3609:4: rule__Number__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Number__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getNumberAccess().getAlternatives_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalWhiteSpace.g:3618:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3622:1: ( rule__Number__Group__1__Impl )
            // InternalWhiteSpace.g:3623:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalWhiteSpace.g:3629:1: rule__Number__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3633:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:3634:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:3634:1: ( RULE_LF )
            // InternalWhiteSpace.g:3635:2: RULE_LF
            {
             before(grammarAccess.getNumberAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalWhiteSpace.g:3645:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3649:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalWhiteSpace.g:3650:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalWhiteSpace.g:3657:1: rule__Label__Group__0__Impl : ( ( ( rule__Label__Alternatives_0 ) ) ( ( rule__Label__Alternatives_0 )* ) ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3661:1: ( ( ( ( rule__Label__Alternatives_0 ) ) ( ( rule__Label__Alternatives_0 )* ) ) )
            // InternalWhiteSpace.g:3662:1: ( ( ( rule__Label__Alternatives_0 ) ) ( ( rule__Label__Alternatives_0 )* ) )
            {
            // InternalWhiteSpace.g:3662:1: ( ( ( rule__Label__Alternatives_0 ) ) ( ( rule__Label__Alternatives_0 )* ) )
            // InternalWhiteSpace.g:3663:2: ( ( rule__Label__Alternatives_0 ) ) ( ( rule__Label__Alternatives_0 )* )
            {
            // InternalWhiteSpace.g:3663:2: ( ( rule__Label__Alternatives_0 ) )
            // InternalWhiteSpace.g:3664:3: ( rule__Label__Alternatives_0 )
            {
             before(grammarAccess.getLabelAccess().getAlternatives_0()); 
            // InternalWhiteSpace.g:3665:3: ( rule__Label__Alternatives_0 )
            // InternalWhiteSpace.g:3665:4: rule__Label__Alternatives_0
            {
            pushFollow(FOLLOW_9);
            rule__Label__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getAlternatives_0()); 

            }

            // InternalWhiteSpace.g:3668:2: ( ( rule__Label__Alternatives_0 )* )
            // InternalWhiteSpace.g:3669:3: ( rule__Label__Alternatives_0 )*
            {
             before(grammarAccess.getLabelAccess().getAlternatives_0()); 
            // InternalWhiteSpace.g:3670:3: ( rule__Label__Alternatives_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_SPACE && LA11_0<=RULE_TAB)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWhiteSpace.g:3670:4: rule__Label__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Label__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLabelAccess().getAlternatives_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalWhiteSpace.g:3679:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3683:1: ( rule__Label__Group__1__Impl )
            // InternalWhiteSpace.g:3684:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalWhiteSpace.g:3690:1: rule__Label__Group__1__Impl : ( RULE_LF ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3694:1: ( ( RULE_LF ) )
            // InternalWhiteSpace.g:3695:1: ( RULE_LF )
            {
            // InternalWhiteSpace.g:3695:1: ( RULE_LF )
            // InternalWhiteSpace.g:3696:2: RULE_LF
            {
             before(grammarAccess.getLabelAccess().getLFTerminalRuleCall_1()); 
            match(input,RULE_LF,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLFTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__WSProgram__StatementsAssignment"
    // InternalWhiteSpace.g:3706:1: rule__WSProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__WSProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3710:1: ( ( ruleStatement ) )
            // InternalWhiteSpace.g:3711:2: ( ruleStatement )
            {
            // InternalWhiteSpace.g:3711:2: ( ruleStatement )
            // InternalWhiteSpace.g:3712:3: ruleStatement
            {
             before(grammarAccess.getWSProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWSProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WSProgram__StatementsAssignment"


    // $ANTLR start "rule__Push__NumberAssignment_2"
    // InternalWhiteSpace.g:3721:1: rule__Push__NumberAssignment_2 : ( ruleNumber ) ;
    public final void rule__Push__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3725:1: ( ( ruleNumber ) )
            // InternalWhiteSpace.g:3726:2: ( ruleNumber )
            {
            // InternalWhiteSpace.g:3726:2: ( ruleNumber )
            // InternalWhiteSpace.g:3727:3: ruleNumber
            {
             before(grammarAccess.getPushAccess().getNumberNumberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPushAccess().getNumberNumberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Push__NumberAssignment_2"


    // $ANTLR start "rule__Copy__NumberAssignment_3"
    // InternalWhiteSpace.g:3736:1: rule__Copy__NumberAssignment_3 : ( ruleNumber ) ;
    public final void rule__Copy__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3740:1: ( ( ruleNumber ) )
            // InternalWhiteSpace.g:3741:2: ( ruleNumber )
            {
            // InternalWhiteSpace.g:3741:2: ( ruleNumber )
            // InternalWhiteSpace.g:3742:3: ruleNumber
            {
             before(grammarAccess.getCopyAccess().getNumberNumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getNumberNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__NumberAssignment_3"


    // $ANTLR start "rule__Slide__NumberAssignment_3"
    // InternalWhiteSpace.g:3751:1: rule__Slide__NumberAssignment_3 : ( ruleNumber ) ;
    public final void rule__Slide__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3755:1: ( ( ruleNumber ) )
            // InternalWhiteSpace.g:3756:2: ( ruleNumber )
            {
            // InternalWhiteSpace.g:3756:2: ( ruleNumber )
            // InternalWhiteSpace.g:3757:3: ruleNumber
            {
             before(grammarAccess.getSlideAccess().getNumberNumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getSlideAccess().getNumberNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slide__NumberAssignment_3"


    // $ANTLR start "rule__MarkLocation__LabelAssignment_3"
    // InternalWhiteSpace.g:3766:1: rule__MarkLocation__LabelAssignment_3 : ( ruleLabel ) ;
    public final void rule__MarkLocation__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3770:1: ( ( ruleLabel ) )
            // InternalWhiteSpace.g:3771:2: ( ruleLabel )
            {
            // InternalWhiteSpace.g:3771:2: ( ruleLabel )
            // InternalWhiteSpace.g:3772:3: ruleLabel
            {
             before(grammarAccess.getMarkLocationAccess().getLabelLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getMarkLocationAccess().getLabelLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkLocation__LabelAssignment_3"


    // $ANTLR start "rule__CallSubroutine__LabelAssignment_3"
    // InternalWhiteSpace.g:3781:1: rule__CallSubroutine__LabelAssignment_3 : ( ruleLabel ) ;
    public final void rule__CallSubroutine__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3785:1: ( ( ruleLabel ) )
            // InternalWhiteSpace.g:3786:2: ( ruleLabel )
            {
            // InternalWhiteSpace.g:3786:2: ( ruleLabel )
            // InternalWhiteSpace.g:3787:3: ruleLabel
            {
             before(grammarAccess.getCallSubroutineAccess().getLabelLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getCallSubroutineAccess().getLabelLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallSubroutine__LabelAssignment_3"


    // $ANTLR start "rule__UnconditionalJump__LabelAssignment_3"
    // InternalWhiteSpace.g:3796:1: rule__UnconditionalJump__LabelAssignment_3 : ( ruleLabel ) ;
    public final void rule__UnconditionalJump__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3800:1: ( ( ruleLabel ) )
            // InternalWhiteSpace.g:3801:2: ( ruleLabel )
            {
            // InternalWhiteSpace.g:3801:2: ( ruleLabel )
            // InternalWhiteSpace.g:3802:3: ruleLabel
            {
             before(grammarAccess.getUnconditionalJumpAccess().getLabelLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getUnconditionalJumpAccess().getLabelLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnconditionalJump__LabelAssignment_3"


    // $ANTLR start "rule__ZeroJump__LabelAssignment_3"
    // InternalWhiteSpace.g:3811:1: rule__ZeroJump__LabelAssignment_3 : ( ruleLabel ) ;
    public final void rule__ZeroJump__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3815:1: ( ( ruleLabel ) )
            // InternalWhiteSpace.g:3816:2: ( ruleLabel )
            {
            // InternalWhiteSpace.g:3816:2: ( ruleLabel )
            // InternalWhiteSpace.g:3817:3: ruleLabel
            {
             before(grammarAccess.getZeroJumpAccess().getLabelLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getZeroJumpAccess().getLabelLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZeroJump__LabelAssignment_3"


    // $ANTLR start "rule__NegativeJump__LabelAssignment_3"
    // InternalWhiteSpace.g:3826:1: rule__NegativeJump__LabelAssignment_3 : ( ruleLabel ) ;
    public final void rule__NegativeJump__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWhiteSpace.g:3830:1: ( ( ruleLabel ) )
            // InternalWhiteSpace.g:3831:2: ( ruleLabel )
            {
            // InternalWhiteSpace.g:3831:2: ( ruleLabel )
            // InternalWhiteSpace.g:3832:3: ruleLabel
            {
             before(grammarAccess.getNegativeJumpAccess().getLabelLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getNegativeJumpAccess().getLabelLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeJump__LabelAssignment_3"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\4\7\uffff";
    static final String dfa_3s = "\3\6\7\uffff";
    static final String dfa_4s = "\3\uffff\1\7\1\1\1\2\1\3\1\6\1\4\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3",
            "\1\4\1\5\1\6",
            "\1\10\1\11\1\7",
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
            return "1028:1: rule__FlowControl__Alternatives_1 : ( ( ruleMarkLocation ) | ( ruleCallSubroutine ) | ( ruleUnconditionalJump ) | ( ruleZeroJump ) | ( ruleNegativeJump ) | ( ruleEndSubroutine ) | ( ruleEndProgram ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});

}