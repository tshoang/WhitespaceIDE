/*
 * generated by Xtext 2.27.0
 */
package ac.soton.java.whitespace.ide.contentassist.antlr;

import ac.soton.java.whitespace.ide.contentassist.antlr.internal.InternalWhiteSpaceParser;
import ac.soton.java.whitespace.services.WhiteSpaceGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class WhiteSpaceParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WhiteSpaceGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WhiteSpaceGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getStackManipulationAccess().getAlternatives_1(), "rule__StackManipulation__Alternatives_1");
			builder.put(grammarAccess.getArithmeticAccess().getAlternatives_2(), "rule__Arithmetic__Alternatives_2");
			builder.put(grammarAccess.getHeapAccessAccess().getAlternatives_2(), "rule__HeapAccess__Alternatives_2");
			builder.put(grammarAccess.getFlowControlAccess().getAlternatives_1(), "rule__FlowControl__Alternatives_1");
			builder.put(grammarAccess.getIOAccess().getAlternatives_2(), "rule__IO__Alternatives_2");
			builder.put(grammarAccess.getNumberAccess().getAlternatives_0(), "rule__Number__Alternatives_0");
			builder.put(grammarAccess.getLabelAccess().getAlternatives_0(), "rule__Label__Alternatives_0");
			builder.put(grammarAccess.getStackManipulationAccess().getGroup(), "rule__StackManipulation__Group__0");
			builder.put(grammarAccess.getPushAccess().getGroup(), "rule__Push__Group__0");
			builder.put(grammarAccess.getDuplicateAccess().getGroup(), "rule__Duplicate__Group__0");
			builder.put(grammarAccess.getCopyAccess().getGroup(), "rule__Copy__Group__0");
			builder.put(grammarAccess.getSwapAccess().getGroup(), "rule__Swap__Group__0");
			builder.put(grammarAccess.getDiscardAccess().getGroup(), "rule__Discard__Group__0");
			builder.put(grammarAccess.getSlideAccess().getGroup(), "rule__Slide__Group__0");
			builder.put(grammarAccess.getArithmeticAccess().getGroup(), "rule__Arithmetic__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getSubtractionAccess().getGroup(), "rule__Subtraction__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
			builder.put(grammarAccess.getModuloAccess().getGroup(), "rule__Modulo__Group__0");
			builder.put(grammarAccess.getHeapAccessAccess().getGroup(), "rule__HeapAccess__Group__0");
			builder.put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
			builder.put(grammarAccess.getRetrieveAccess().getGroup(), "rule__Retrieve__Group__0");
			builder.put(grammarAccess.getFlowControlAccess().getGroup(), "rule__FlowControl__Group__0");
			builder.put(grammarAccess.getMarkLocationAccess().getGroup(), "rule__MarkLocation__Group__0");
			builder.put(grammarAccess.getCallSubroutineAccess().getGroup(), "rule__CallSubroutine__Group__0");
			builder.put(grammarAccess.getUnconditionalJumpAccess().getGroup(), "rule__UnconditionalJump__Group__0");
			builder.put(grammarAccess.getZeroJumpAccess().getGroup(), "rule__ZeroJump__Group__0");
			builder.put(grammarAccess.getNegativeJumpAccess().getGroup(), "rule__NegativeJump__Group__0");
			builder.put(grammarAccess.getEndSubroutineAccess().getGroup(), "rule__EndSubroutine__Group__0");
			builder.put(grammarAccess.getEndProgramAccess().getGroup(), "rule__EndProgram__Group__0");
			builder.put(grammarAccess.getIOAccess().getGroup(), "rule__IO__Group__0");
			builder.put(grammarAccess.getOutputCharacterAccess().getGroup(), "rule__OutputCharacter__Group__0");
			builder.put(grammarAccess.getOutputNumberAccess().getGroup(), "rule__OutputNumber__Group__0");
			builder.put(grammarAccess.getReadCharacterAccess().getGroup(), "rule__ReadCharacter__Group__0");
			builder.put(grammarAccess.getReadNumberAccess().getGroup(), "rule__ReadNumber__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getWSProgramAccess().getStatementsAssignment(), "rule__WSProgram__StatementsAssignment");
			builder.put(grammarAccess.getPushAccess().getNumberAssignment_2(), "rule__Push__NumberAssignment_2");
			builder.put(grammarAccess.getCopyAccess().getNumberAssignment_3(), "rule__Copy__NumberAssignment_3");
			builder.put(grammarAccess.getSlideAccess().getNumberAssignment_3(), "rule__Slide__NumberAssignment_3");
			builder.put(grammarAccess.getMarkLocationAccess().getLabelAssignment_3(), "rule__MarkLocation__LabelAssignment_3");
			builder.put(grammarAccess.getCallSubroutineAccess().getLabelAssignment_3(), "rule__CallSubroutine__LabelAssignment_3");
			builder.put(grammarAccess.getUnconditionalJumpAccess().getLabelAssignment_3(), "rule__UnconditionalJump__LabelAssignment_3");
			builder.put(grammarAccess.getZeroJumpAccess().getLabelAssignment_3(), "rule__ZeroJump__LabelAssignment_3");
			builder.put(grammarAccess.getNegativeJumpAccess().getLabelAssignment_3(), "rule__NegativeJump__LabelAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WhiteSpaceGrammarAccess grammarAccess;

	@Override
	protected InternalWhiteSpaceParser createParser() {
		InternalWhiteSpaceParser result = new InternalWhiteSpaceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_NOTWS", "RULE_ML_COMMENT" };
	}

	public WhiteSpaceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhiteSpaceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}