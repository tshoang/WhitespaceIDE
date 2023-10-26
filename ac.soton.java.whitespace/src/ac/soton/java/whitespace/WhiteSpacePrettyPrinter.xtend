package ac.soton.java.whitespace

import ac.soton.java.whitespace.whiteSpace.Addition
import ac.soton.java.whitespace.whiteSpace.CallSubroutine
import ac.soton.java.whitespace.whiteSpace.Copy
import ac.soton.java.whitespace.whiteSpace.Discard
import ac.soton.java.whitespace.whiteSpace.Division
import ac.soton.java.whitespace.whiteSpace.Duplicate
import ac.soton.java.whitespace.whiteSpace.EndProgram
import ac.soton.java.whitespace.whiteSpace.EndSubroutine
import ac.soton.java.whitespace.whiteSpace.MarkLocation
import ac.soton.java.whitespace.whiteSpace.Modulo
import ac.soton.java.whitespace.whiteSpace.Multiplication
import ac.soton.java.whitespace.whiteSpace.NegativeJump
import ac.soton.java.whitespace.whiteSpace.OutputCharacter
import ac.soton.java.whitespace.whiteSpace.OutputNumber
import ac.soton.java.whitespace.whiteSpace.Push
import ac.soton.java.whitespace.whiteSpace.ReadCharacter
import ac.soton.java.whitespace.whiteSpace.Retrieve
import ac.soton.java.whitespace.whiteSpace.Slide
import ac.soton.java.whitespace.whiteSpace.Statement
import ac.soton.java.whitespace.whiteSpace.Store
import ac.soton.java.whitespace.whiteSpace.Subtraction
import ac.soton.java.whitespace.whiteSpace.Swap
import ac.soton.java.whitespace.whiteSpace.UnconditionalJump
import ac.soton.java.whitespace.whiteSpace.WSProgram
import ac.soton.java.whitespace.whiteSpace.ZeroJump
import ac.soton.java.whitespace.whiteSpace.ReadNumber

class WhiteSpacePrettyPrinter {
	
	def String reveal(String wsProgram) {
		var ppwsProgram = wsProgram.replace(' ', '[S]')
		ppwsProgram = ppwsProgram.replace('\t', '[T]')
		ppwsProgram = ppwsProgram.replace('\n', '[LF]\n')
	}
	
	def String hide(String ppwsProgram) {
		var wsProgram = ppwsProgram.replace('[S]', ' ')
		wsProgram = wsProgram.replace('[T]', '\t')
		wsProgram = wsProgram.replace('[LF]\n', '\n')
	}
	
	def String prettyPrint(WSProgram wsProgram) {
		val statements = wsProgram.statements
		val strBld = new StringBuilder()
		statements.forEach[statement |
			strBld.append(prettyPrint(statement))
			strBld.append("\n")
		]
		
		return strBld.toString()
	}
	
	def String prettyPrint(Statement statement) {
		// Stack manipulation
		if (statement instanceof Push) {
			return "Push " + statement.number
		}
		if (statement instanceof Duplicate) {
			return "Duplicate"
		}
		if (statement instanceof Copy) {
			return "Copy " + statement.number
		}
		if (statement instanceof Swap) {
			return "Swap"
		}
		if (statement instanceof Discard) {
			return "Discard"
		}
		if (statement instanceof Slide) {
			return "Slide " + statement.number
		}
		
		// Arithmetic
		if (statement instanceof Addition) {
			return "Addition"
		}
		if (statement instanceof Subtraction) {
			return "Subtraction"
		}
		if (statement instanceof Multiplication) {
			return "Multiplication"
		}
		if (statement instanceof Division) {
			return "Division"
		}
		if (statement instanceof Modulo) {
			return "Modulo"
		}
		
		// Heap Access
		if (statement instanceof Store) {
			return "Store"
		}
		if (statement instanceof Retrieve) {
			return "Retrieve"
		}
		
		// Flow Control
		if (statement instanceof MarkLocation) {
			val label = statement.label
			return "Mark " + label
		}
		if (statement instanceof CallSubroutine) {
			val label = statement.label
			return "Call " + label
		}
		if (statement instanceof UnconditionalJump) {
			val label = statement.label
			return "UJump " + label
		}
		if (statement instanceof ZeroJump) {
			val label = statement.label
			return "ZJump " + label
		}
		if (statement instanceof NegativeJump) {
			val label = statement.label
			return "NJump " + label
		}
		if (statement instanceof EndSubroutine) {
			return "EndS"
		}
		if (statement instanceof EndProgram) {
			return "EndP"
		}
		
		// I/O
		if (statement instanceof OutputCharacter) {
			return "OutC"
		}
		if (statement instanceof OutputNumber) {
			return "OutN"
		}
		if (statement instanceof ReadCharacter) {
			return "InC"
		}
		if (statement instanceof ReadNumber) {
			return "InN"
		}

		throw new UnsupportedOperationException("Unknown statement " + statement)
	}
}