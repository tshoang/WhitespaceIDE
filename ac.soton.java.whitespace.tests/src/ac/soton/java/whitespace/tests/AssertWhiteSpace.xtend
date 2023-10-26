package ac.soton.java.whitespace.tests

import ac.soton.java.whitespace.WhiteSpacePrettyPrinter
import ac.soton.java.whitespace.whiteSpace.Statement
import ac.soton.java.whitespace.whiteSpace.WSProgram
import ac.soton.java.whitespace.whiteSpace.WhiteSpacePackage
import org.eclipse.xtext.testing.util.ParseHelper

import static org.junit.jupiter.api.Assertions.*

class AssertWhiteSpace {

	extension WhiteSpacePrettyPrinter = new WhiteSpacePrettyPrinter()
	
	/**
	 * Utility method to register the WhiteSpace EPackage. This is done by simply
	 * access the eClass of the WhiteSpace's {@link WhiteSpacePackage.eINSTANCE}. 
	 */
	def registerWhiteSpaceEPackage() {
		WhiteSpacePackage.eINSTANCE.eClass() // Register the WhiteSpace EPackage
	}

	def assertWSProgram(String message, ParseHelper<WSProgram> parseHelper, String wsProgram, String expectedProgram, String... expectedErrors) {
		val program = parseHelper.parse(wsProgram.hide)
		assertNotNull(program, "(" + message + ") " + 
				"Parsed program must not be null")
		assertEquals(program.prettyPrint, expectedProgram, "(" + message + ") " + 
				"Incorrect program")
		val errors = program.eResource.errors
		assertEquals(expectedErrors.join("\n"), errors.join("\n"), 'Incorrect errors')
	}

	def assertWSProgram(ParseHelper<WSProgram> parseHelper, String wsProgram, String expectedProgram, String... expectedErrors) {
		val program = parseHelper.parse(wsProgram.hide)
		assertNotNull(program, "Parsed program must not be null")
		assertEquals(expectedProgram, program.prettyPrint, "Incorrect program")
		val errors = program.eResource.errors
		assertEquals(expectedErrors.join("\n"), errors.join("\n"), 'Incorrect errors')
	}

	/**
	 * This method tests a WhiteSpace program by testing each statement of the
	 * program. 
	 * 
	 * @param message
	 * 	The message for debugging
	 * @param program
	 * 	The input program to be analysed.
	 * @param expected
	 * 	The expected pretty prints of the program's statements
	 * @precondition The input program must not be <code>null</code>
	 */
	def assertWSProgram(String message, WSProgram program, String expected) {
		assertEquals(program.prettyPrint, expected, "(" + message + ") " + 
				"Incorrect program")
	}

	/**
	 * This method tests a WhiteSpace program by testing each statement of the
	 * program. 
	 * 
	 * @param program
	 * 	The input program to be analysed.
	 * @param expected
	 * 	The expected pretty prints of the program's statements
	 * @precondition The input program must not be <code>null</code>
	 */
	def assertWSProgram(WSProgram program, String expected) {
		assertNotNull(program, "Input statement must not be null")
		assertEquals(program.prettyPrint, expected, "Incorrect program")
	}

	/**
	 * This method asserts statement by calling the appropriate assert method
	 * for each type of statements.
	 * 
	 * @param message
	 * 	The message for debugging
	 * @param statement
	 * 	The input statement to be analysed.
	 * @param expected
	 * 	The expected pretty print of the statement
	 * @precondition The input statement must not be <code>null</code>
	 */
	def assertStatement(String message, Statement statement, String expected) {
		assertNotNull(statement, "(" + message + ")" + "Input statement must not be null")
	}

	/**
	 * This method asserts statement by calling the appropriate assert method
	 * for each type of statements.
	 * 
	 * @param statement
	 * 	The input statement to be analysed.
	 * @param expected
	 * 	The expected pretty print of the statement
	 * @precondition The input statement must not be <code>null</code>
	 */
	def assertStatement(Statement statement, String expected) {
		assertNotNull(statement, "Input statement must not be null")
	}

}
