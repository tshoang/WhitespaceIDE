/*
 * generated by Xtext 2.27.0
 */
package ac.soton.java.whitespace.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class WhiteSpaceAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ac/soton/java/whitespace/parser/antlr/internal/InternalWhiteSpace.tokens");
	}
}