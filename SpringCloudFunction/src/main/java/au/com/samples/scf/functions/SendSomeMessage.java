/**
 * 
 */
package au.com.samples.scf.functions;

import java.util.function.Supplier;

/**
 * @author abhin
 *
 */
public class SendSomeMessage implements Supplier<String> {

	@Override
	public String get() {
		return "Hello Folks";
	}

}
