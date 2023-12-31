/*
 * generated by Xtext 2.27.0
 */
package ac.soton.java.whitespace.serializer;

import ac.soton.java.whitespace.services.WhiteSpaceGrammarAccess;
import ac.soton.java.whitespace.whiteSpace.Addition;
import ac.soton.java.whitespace.whiteSpace.CallSubroutine;
import ac.soton.java.whitespace.whiteSpace.Copy;
import ac.soton.java.whitespace.whiteSpace.Discard;
import ac.soton.java.whitespace.whiteSpace.Division;
import ac.soton.java.whitespace.whiteSpace.Duplicate;
import ac.soton.java.whitespace.whiteSpace.EndProgram;
import ac.soton.java.whitespace.whiteSpace.EndSubroutine;
import ac.soton.java.whitespace.whiteSpace.MarkLocation;
import ac.soton.java.whitespace.whiteSpace.Modulo;
import ac.soton.java.whitespace.whiteSpace.Multiplication;
import ac.soton.java.whitespace.whiteSpace.NegativeJump;
import ac.soton.java.whitespace.whiteSpace.OutputCharacter;
import ac.soton.java.whitespace.whiteSpace.OutputNumber;
import ac.soton.java.whitespace.whiteSpace.Push;
import ac.soton.java.whitespace.whiteSpace.ReadCharacter;
import ac.soton.java.whitespace.whiteSpace.ReadNumber;
import ac.soton.java.whitespace.whiteSpace.Retrieve;
import ac.soton.java.whitespace.whiteSpace.Slide;
import ac.soton.java.whitespace.whiteSpace.Store;
import ac.soton.java.whitespace.whiteSpace.Subtraction;
import ac.soton.java.whitespace.whiteSpace.Swap;
import ac.soton.java.whitespace.whiteSpace.UnconditionalJump;
import ac.soton.java.whitespace.whiteSpace.WSProgram;
import ac.soton.java.whitespace.whiteSpace.WhiteSpacePackage;
import ac.soton.java.whitespace.whiteSpace.ZeroJump;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class WhiteSpaceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WhiteSpaceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WhiteSpacePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WhiteSpacePackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case WhiteSpacePackage.CALL_SUBROUTINE:
				sequence_CallSubroutine(context, (CallSubroutine) semanticObject); 
				return; 
			case WhiteSpacePackage.COPY:
				sequence_Copy(context, (Copy) semanticObject); 
				return; 
			case WhiteSpacePackage.DISCARD:
				sequence_Discard(context, (Discard) semanticObject); 
				return; 
			case WhiteSpacePackage.DIVISION:
				sequence_Division(context, (Division) semanticObject); 
				return; 
			case WhiteSpacePackage.DUPLICATE:
				sequence_Duplicate(context, (Duplicate) semanticObject); 
				return; 
			case WhiteSpacePackage.END_PROGRAM:
				sequence_EndProgram(context, (EndProgram) semanticObject); 
				return; 
			case WhiteSpacePackage.END_SUBROUTINE:
				sequence_EndSubroutine(context, (EndSubroutine) semanticObject); 
				return; 
			case WhiteSpacePackage.MARK_LOCATION:
				sequence_MarkLocation(context, (MarkLocation) semanticObject); 
				return; 
			case WhiteSpacePackage.MODULO:
				sequence_Modulo(context, (Modulo) semanticObject); 
				return; 
			case WhiteSpacePackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case WhiteSpacePackage.NEGATIVE_JUMP:
				sequence_NegativeJump(context, (NegativeJump) semanticObject); 
				return; 
			case WhiteSpacePackage.OUTPUT_CHARACTER:
				sequence_OutputCharacter(context, (OutputCharacter) semanticObject); 
				return; 
			case WhiteSpacePackage.OUTPUT_NUMBER:
				sequence_OutputNumber(context, (OutputNumber) semanticObject); 
				return; 
			case WhiteSpacePackage.PUSH:
				sequence_Push(context, (Push) semanticObject); 
				return; 
			case WhiteSpacePackage.READ_CHARACTER:
				sequence_ReadCharacter(context, (ReadCharacter) semanticObject); 
				return; 
			case WhiteSpacePackage.READ_NUMBER:
				sequence_ReadNumber(context, (ReadNumber) semanticObject); 
				return; 
			case WhiteSpacePackage.RETRIEVE:
				sequence_Retrieve(context, (Retrieve) semanticObject); 
				return; 
			case WhiteSpacePackage.SLIDE:
				sequence_Slide(context, (Slide) semanticObject); 
				return; 
			case WhiteSpacePackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case WhiteSpacePackage.SUBTRACTION:
				sequence_Subtraction(context, (Subtraction) semanticObject); 
				return; 
			case WhiteSpacePackage.SWAP:
				sequence_Swap(context, (Swap) semanticObject); 
				return; 
			case WhiteSpacePackage.UNCONDITIONAL_JUMP:
				sequence_UnconditionalJump(context, (UnconditionalJump) semanticObject); 
				return; 
			case WhiteSpacePackage.WS_PROGRAM:
				sequence_WSProgram(context, (WSProgram) semanticObject); 
				return; 
			case WhiteSpacePackage.ZERO_JUMP:
				sequence_ZeroJump(context, (ZeroJump) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Addition
	 *     Arithmetic returns Addition
	 *     Addition returns Addition
	 *
	 * Constraint:
	 *     {Addition}
	 * </pre>
	 */
	protected void sequence_Addition(ISerializationContext context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns CallSubroutine
	 *     FlowControl returns CallSubroutine
	 *     CallSubroutine returns CallSubroutine
	 *
	 * Constraint:
	 *     label=Label
	 * </pre>
	 */
	protected void sequence_CallSubroutine(ISerializationContext context, CallSubroutine semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.CALL_SUBROUTINE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.CALL_SUBROUTINE__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCallSubroutineAccess().getLabelLabelParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Copy
	 *     StackManipulation returns Copy
	 *     Copy returns Copy
	 *
	 * Constraint:
	 *     number=Number
	 * </pre>
	 */
	protected void sequence_Copy(ISerializationContext context, Copy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.COPY__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.COPY__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCopyAccess().getNumberNumberParserRuleCall_3_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Discard
	 *     StackManipulation returns Discard
	 *     Discard returns Discard
	 *
	 * Constraint:
	 *     {Discard}
	 * </pre>
	 */
	protected void sequence_Discard(ISerializationContext context, Discard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Division
	 *     Arithmetic returns Division
	 *     Division returns Division
	 *
	 * Constraint:
	 *     {Division}
	 * </pre>
	 */
	protected void sequence_Division(ISerializationContext context, Division semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Duplicate
	 *     StackManipulation returns Duplicate
	 *     Duplicate returns Duplicate
	 *
	 * Constraint:
	 *     {Duplicate}
	 * </pre>
	 */
	protected void sequence_Duplicate(ISerializationContext context, Duplicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns EndProgram
	 *     FlowControl returns EndProgram
	 *     EndProgram returns EndProgram
	 *
	 * Constraint:
	 *     {EndProgram}
	 * </pre>
	 */
	protected void sequence_EndProgram(ISerializationContext context, EndProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns EndSubroutine
	 *     FlowControl returns EndSubroutine
	 *     EndSubroutine returns EndSubroutine
	 *
	 * Constraint:
	 *     {EndSubroutine}
	 * </pre>
	 */
	protected void sequence_EndSubroutine(ISerializationContext context, EndSubroutine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns MarkLocation
	 *     FlowControl returns MarkLocation
	 *     MarkLocation returns MarkLocation
	 *
	 * Constraint:
	 *     label=Label
	 * </pre>
	 */
	protected void sequence_MarkLocation(ISerializationContext context, MarkLocation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.MARK_LOCATION__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.MARK_LOCATION__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMarkLocationAccess().getLabelLabelParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Modulo
	 *     Arithmetic returns Modulo
	 *     Modulo returns Modulo
	 *
	 * Constraint:
	 *     {Modulo}
	 * </pre>
	 */
	protected void sequence_Modulo(ISerializationContext context, Modulo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Multiplication
	 *     Arithmetic returns Multiplication
	 *     Multiplication returns Multiplication
	 *
	 * Constraint:
	 *     {Multiplication}
	 * </pre>
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns NegativeJump
	 *     FlowControl returns NegativeJump
	 *     NegativeJump returns NegativeJump
	 *
	 * Constraint:
	 *     label=Label
	 * </pre>
	 */
	protected void sequence_NegativeJump(ISerializationContext context, NegativeJump semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.NEGATIVE_JUMP__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.NEGATIVE_JUMP__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegativeJumpAccess().getLabelLabelParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns OutputCharacter
	 *     IO returns OutputCharacter
	 *     OutputCharacter returns OutputCharacter
	 *
	 * Constraint:
	 *     {OutputCharacter}
	 * </pre>
	 */
	protected void sequence_OutputCharacter(ISerializationContext context, OutputCharacter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns OutputNumber
	 *     IO returns OutputNumber
	 *     OutputNumber returns OutputNumber
	 *
	 * Constraint:
	 *     {OutputNumber}
	 * </pre>
	 */
	protected void sequence_OutputNumber(ISerializationContext context, OutputNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Push
	 *     StackManipulation returns Push
	 *     Push returns Push
	 *
	 * Constraint:
	 *     number=Number
	 * </pre>
	 */
	protected void sequence_Push(ISerializationContext context, Push semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.PUSH__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.PUSH__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPushAccess().getNumberNumberParserRuleCall_2_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ReadCharacter
	 *     IO returns ReadCharacter
	 *     ReadCharacter returns ReadCharacter
	 *
	 * Constraint:
	 *     {ReadCharacter}
	 * </pre>
	 */
	protected void sequence_ReadCharacter(ISerializationContext context, ReadCharacter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ReadNumber
	 *     IO returns ReadNumber
	 *     ReadNumber returns ReadNumber
	 *
	 * Constraint:
	 *     {ReadNumber}
	 * </pre>
	 */
	protected void sequence_ReadNumber(ISerializationContext context, ReadNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Retrieve
	 *     HeapAccess returns Retrieve
	 *     Retrieve returns Retrieve
	 *
	 * Constraint:
	 *     {Retrieve}
	 * </pre>
	 */
	protected void sequence_Retrieve(ISerializationContext context, Retrieve semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Slide
	 *     StackManipulation returns Slide
	 *     Slide returns Slide
	 *
	 * Constraint:
	 *     number=Number
	 * </pre>
	 */
	protected void sequence_Slide(ISerializationContext context, Slide semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.SLIDE__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.SLIDE__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSlideAccess().getNumberNumberParserRuleCall_3_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Store
	 *     HeapAccess returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     {Store}
	 * </pre>
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Subtraction
	 *     Arithmetic returns Subtraction
	 *     Subtraction returns Subtraction
	 *
	 * Constraint:
	 *     {Subtraction}
	 * </pre>
	 */
	protected void sequence_Subtraction(ISerializationContext context, Subtraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Swap
	 *     StackManipulation returns Swap
	 *     Swap returns Swap
	 *
	 * Constraint:
	 *     {Swap}
	 * </pre>
	 */
	protected void sequence_Swap(ISerializationContext context, Swap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns UnconditionalJump
	 *     FlowControl returns UnconditionalJump
	 *     UnconditionalJump returns UnconditionalJump
	 *
	 * Constraint:
	 *     label=Label
	 * </pre>
	 */
	protected void sequence_UnconditionalJump(ISerializationContext context, UnconditionalJump semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.UNCONDITIONAL_JUMP__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.UNCONDITIONAL_JUMP__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnconditionalJumpAccess().getLabelLabelParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WSProgram returns WSProgram
	 *
	 * Constraint:
	 *     statements+=Statement+
	 * </pre>
	 */
	protected void sequence_WSProgram(ISerializationContext context, WSProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ZeroJump
	 *     FlowControl returns ZeroJump
	 *     ZeroJump returns ZeroJump
	 *
	 * Constraint:
	 *     label=Label
	 * </pre>
	 */
	protected void sequence_ZeroJump(ISerializationContext context, ZeroJump semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhiteSpacePackage.Literals.ZERO_JUMP__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhiteSpacePackage.Literals.ZERO_JUMP__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getZeroJumpAccess().getLabelLabelParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
}
