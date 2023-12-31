/*
 * generated by Xtext 2.15.0
 */
package ac.soton.java.whitespace.tests

import ac.soton.java.whitespace.whiteSpace.WSProgram
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Before
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(WhiteSpaceInjectorProvider)
class WhiteSpaceParsingTest {
	@Inject
	ParseHelper<WSProgram> parseHelper
	
	extension AssertWhiteSpace = new AssertWhiteSpace()
	
	/**
	 * Manually register any EPackage required for running the tests.
	 */
	@Before
	def void registerEPackages() {
		registerWhiteSpaceEPackage
	}
	
	/*
	 * Tests for stack push
	 */
	@Test
	def void testStackPush1() {
		val wsProgram = '''
		[S][S][S][T][LF]
		'''
		val expectedProgram = '''
		Push 1
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack push
	 */
	@Test
	def void testStackPush2() {
		val wsProgram = '''
		[S][S][T][T][LF]
		'''
		val expectedProgram = '''
		Push -1
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack push
	 */
	@Test
	def void testStackPush3() {
		val wsProgram = '''
		[S][S][S][S][LF]
		'''
		val expectedProgram = '''
		Push 0
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack push
	 */
	@Test
	def void testStackPush4() {
		val wsProgram = '''
		[S][S][T][S][LF]
		'''
		val expectedProgram = '''
		Push 0
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack push
	 */
	@Test
	def void testStackPush5() {
		val wsProgram = '''
		[S][S][S][T]''' // Missing LF
		val expectedProgram = '''
		Push 0
		''' // Program is still Push 0
		parseHelper.assertWSProgram(wsProgram, expectedProgram, 
				'XtextSyntaxDiagnostic: null:1 For input string: ""')
	}

	/*
	 * Tests for stack push
	 */
	@Test
	def void testStackPush6() {
		val wsProgram = '''
		[S][S][T][T]''' // Missing LF
		val expectedProgram = '''
		Push 0
		''' // Program is still Push 0
		parseHelper.assertWSProgram(wsProgram, expectedProgram, 
				'XtextSyntaxDiagnostic: null:1 For input string: ""')
	}

	/*
	 * Tests for stack duplicate
	 */
	@Test
	def void testStackDuplicate1() {
		val wsProgram = '''
		[S][LF]
		[S]'''
		val expectedProgram = '''
		Duplicate
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack copy
	 */
	@Test
	def void testStackCopy1() {
		val wsProgram = '''
		[S][T][S][S][T][LF]
		'''
		val expectedProgram = '''
		Copy 1
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack copy
	 */
	@Test
	def void testStackCopy2() {
		val wsProgram = '''
		[S][T][S][T][T][LF]
		'''
		val expectedProgram = '''
		Copy -1
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack copy
	 */
	@Test
	def void testStackCopy3() {
		val wsProgram = '''
		[S][T][S][S][S][LF]
		'''
		val expectedProgram = '''
		Copy 0
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack copy
	 */
	@Test
	def void testStackCopy4() {
		val wsProgram = '''
		[S][T][S][T][S][LF]
		'''
		val expectedProgram = '''
		Copy 0
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack copy
	 */
	@Test
	def void testStackCopy5() {
		val wsProgram = '''
		[S][T][S][S][T]''' // Missing LF
		val expectedProgram = '''
		Copy 0
		''' // Program is still Copy 0
		parseHelper.assertWSProgram(wsProgram, expectedProgram, 
				'XtextSyntaxDiagnostic: null:1 For input string: ""')
	}

	/*
	 * Tests for stack copy
	 */
	@Test
	def void testStackCopy6() {
		val wsProgram = '''
		[S][T][S][S][S]''' // Missing LF
		val expectedProgram = '''
		Copy 0
		''' // Program is still Copy 0
		parseHelper.assertWSProgram(wsProgram, expectedProgram, 
				'XtextSyntaxDiagnostic: null:1 For input string: ""')
	}

	/*
	 * Tests for stack swap
	 */
	@Test
	def void testStackSwap1() {
		val wsProgram = '''
		[S][LF]
		[T]'''
		val expectedProgram = '''
		Swap
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack swap
	 */
	@Test
	def void testStackDiscard1() {
		val wsProgram = '''
		[S][LF]
		[LF]
		'''
		val expectedProgram = '''
		Discard
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack slide
	 */
	@Test
	def void testStackSlide1() {
		val wsProgram = '''
		[S][T][LF]
		[S][T][LF]
		'''
		val expectedProgram = '''
		Slide 1
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack slide
	 */
	@Test
	def void testStackSlide2() {
		val wsProgram = '''
		[S][T][LF]
		[T][T][LF]
		'''
		val expectedProgram = '''
		Slide -1
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack slide
	 */
	@Test
	def void testStackSlide3() {
		val wsProgram = '''
		[S][T][LF]
		[S][S][LF]
		'''
		val expectedProgram = '''
		Slide 0
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack slide
	 */
	@Test
	def void testStackSlide4() {
		val wsProgram = '''
		[S][T][LF]
		[T][S][LF]
		'''
		val expectedProgram = '''
		Slide 0
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for stack slide
	 */
	@Test
	def void testStackSlide5() {
		val wsProgram = '''
		[S][T][LF]
		[S][T]''' // Missing LF
		val expectedProgram = '''
		Slide 0
		''' // Program is still Slide 0
		parseHelper.assertWSProgram(wsProgram, expectedProgram, 
				'XtextSyntaxDiagnostic: null:2 For input string: ""')
	}

	/*
	 * Tests for stack slide
	 */
	@Test
	def void testStackSlide6() {
		val wsProgram = '''
		[S][T][LF]
		[T][T]''' // Missing LF
		val expectedProgram = '''
		Slide 0
		''' // Program is still Slide 0
		parseHelper.assertWSProgram(wsProgram, expectedProgram, 
				'XtextSyntaxDiagnostic: null:2 For input string: ""')
	}
	
	
	/*
	 * Tests for Arithmetic Addition
	 */
	@Test
	def void testArithmeticAddition1() {
		val wsProgram = '''
		[T][S][S][S]'''
		val expectedProgram = '''
		Addition
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Arithmetic Subtraction
	 */
	@Test
	def void testArithmeticSubtraction1() {
		val wsProgram = '''
		[T][S][S][T]'''
		val expectedProgram = '''
		Subtraction
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Arithmetic Multiplication
	 */
	@Test
	def void testArithmeticMultiplication1() {
		val wsProgram = '''
		[T][S][S][LF]
		'''
		val expectedProgram = '''
		Multiplication
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Arithmetic Division
	 */
	@Test
	def void testArithmeticDivision1() {
		val wsProgram = '''
		[T][S][T][S]'''
		val expectedProgram = '''
		Division
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Arithmetic Modulo
	 */
	@Test
	def void testArithmeticModulo1() {
		val wsProgram = '''
		[T][S][T][T]'''
		val expectedProgram = '''
		Modulo
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Heap Access Store
	 */
	@Test
	def void testHeapAccessStore1() {
		val wsProgram = '''
		[T][T][S]'''
		val expectedProgram = '''
		Store
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Heap Access Retrieve
	 */
	@Test
	def void testHeapAccessRetrieve1() {
		val wsProgram = '''
		[T][T][T]'''
		val expectedProgram = '''
		Retrieve
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Mark Location
	 */
	@Test
	def void testFlowControlMarkLocation1() {
		val wsProgram = '''
		[LF]
		[S][S][S][S][LF]
		'''
		val expectedProgram = '''
		Mark 00
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Mark Location
	 */
	@Test
	def void testFlowControlMarkLocation2() {
		val wsProgram = '''
		[LF]
		[S][S][T][T][LF]
		'''
		val expectedProgram = '''
		Mark 11
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Call Subroutine
	 */
	@Test
	def void testFlowControlCallSubroutine1() {
		val wsProgram = '''
		[LF]
		[S][T][S][S][LF]
		'''
		val expectedProgram = '''
		Call 00
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Call Subroutine
	 */
	@Test
	def void testFlowControlCallSubroutine2() {
		val wsProgram = '''
		[LF]
		[S][T][T][T][LF]
		'''
		val expectedProgram = '''
		Call 11
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Unconditional Jump
	 */
	@Test
	def void testFlowControlUnconditionalJump1() {
		val wsProgram = '''
		[LF]
		[S][LF]
		[S][S][LF]
		'''
		val expectedProgram = '''
		UJump 00
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Unconditional Jump
	 */
	@Test
	def void testFlowControlUnconditionalJump2() {
		val wsProgram = '''
		[LF]
		[S][LF]
		[T][T][LF]
		'''
		val expectedProgram = '''
		UJump 11
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Zero Jump
	 */
	@Test
	def void testFlowControlZeroJump1() {
		val wsProgram = '''
		[LF]
		[T][S][S][S][LF]
		'''
		val expectedProgram = '''
		ZJump 00
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Zero Jump
	 */
	@Test
	def void testFlowControlZeroJump2() {
		val wsProgram = '''
		[LF]
		[T][S][T][T][LF]
		'''
		val expectedProgram = '''
		ZJump 11
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Negative Jump
	 */
	@Test
	def void testFlowControlNegativeJump1() {
		val wsProgram = '''
		[LF]
		[T][T][S][S][LF]
		'''
		val expectedProgram = '''
		NJump 00
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control Negative Jump
	 */
	@Test
	def void testFlowControlNegativeJump2() {
		val wsProgram = '''
		[LF]
		[T][T][T][T][LF]
		'''
		val expectedProgram = '''
		NJump 11
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control End Subroutine
	 */
	@Test
	def void testFlowControlEndSubroutine1() {
		val wsProgram = '''
		[LF]
		[T][LF]
		'''
		val expectedProgram = '''
		EndS
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for Flow Control End Subroutine
	 */
	@Test
	def void testFlowControlEndProgram1() {
		val wsProgram = '''
		[LF]
		[LF]
		[LF]
		'''
		val expectedProgram = '''
		EndP
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for I/O Output Character
	 */
	@Test
	def void testFlowControlOutputCharacter1() {
		val wsProgram = '''
		[T][LF]
		[S][S]'''
		val expectedProgram = '''
		OutC
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for I/O Output Number
	 */
	@Test
	def void testFlowControlOutputNumber1() {
		val wsProgram = '''
		[T][LF]
		[S][T]'''
		val expectedProgram = '''
		OutN
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for I/O Output Character
	 */
	@Test
	def void testFlowControlInputCharacter1() {
		val wsProgram = '''
		[T][LF]
		[T][S]'''
		val expectedProgram = '''
		InC
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

	/*
	 * Tests for I/O Output Character
	 */
	@Test
	def void testFlowControlInputNumber1() {
		val wsProgram = '''
		[T][LF]
		[T][T]'''
		val expectedProgram = '''
		InN
		'''
		parseHelper.assertWSProgram(wsProgram, expectedProgram)
	}

}
