package ac.soton.java.whitespace

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

class WhiteSpaceValueConverter extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule="Number") def IValueConverter<Integer> Number() {
		return new IValueConverter<Integer>() {
			/** 
			 * Convert XLabel to string.
			 * @param stringthe XLabel string
			 * @param nodethe node in the semantics tree.
			 * @return the comment by stripping the leading "@" and the ending
			 * ":".
			 * @see IValueConverter#toValue(String, INode)
			 * @precondition the input string must be not <code>null</code>. 
			 * have "@" as its prefix and ended with a ":".
			 */
			override Integer toValue(String string, INode node) throws ValueConverterException {
				var number = string.substring(0, string.length - 1)
				number = number.replace(' ', '0')
				number = number.replace('\t', '1')
				number = number.substring(1)
				var parseInt = Integer.parseInt(number, 2)
				val sign = string.substring(0, 1)
				if (sign.equals('\t'))
					parseInt = -parseInt
				return parseInt
			}

			/** 
			 * Convert Integer to binary string value.
			 * @param valuethe label
			 * @return the XComment by prefixing "@" and suffixing ":" to the
			 * input value.
			 * @see IValueConverter#toString(Object)
			 */

			override String toString(Integer value) throws ValueConverterException {
				var string = Integer.toBinaryString(value)
				string = string.replace('0', ' ')
				string = string.replace('1', '\t')
				if (value < 0)
					return '1' + string
				else
					return '0' + string
			}
		}
	}

	@ValueConverter(rule="Label") def IValueConverter<String> Label() {
		return new IValueConverter<String>() {
			/** 
			 * Convert XLabel to string.
			 * @param stringthe XLabel string
			 * @param nodethe node in the semantics tree.
			 * @return the comment by stripping the leading "@" and the ending
			 * ":".
			 * @see IValueConverter#toValue(String, INode)
			 * @precondition the input string must be not <code>null</code>. 
			 * have "@" as its prefix and ended with a ":".
			 */
			override String toValue(String string, INode node) throws ValueConverterException {
				var label = string.substring(0, string.length-1)
				label = label.replace(' ', '0')
				label = label.replace('\t', '1')
				return label
			}

			/** 
			 * Convert Integer to binary string value.
			 * @param valuethe label
			 * @return the XComment by prefixing "@" and suffixing ":" to the
			 * input value.
			 * @see IValueConverter#toString(Object)
			 */
			override String toString(String value) throws ValueConverterException {
				var string = value.replace('0', ' ')
				string = string.replace('1', '\t')
				return string + '\n'
			}
			
		}
	}

}
