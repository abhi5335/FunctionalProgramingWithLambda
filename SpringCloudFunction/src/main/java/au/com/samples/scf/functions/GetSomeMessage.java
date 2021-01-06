/**
 * 
 */
package au.com.samples.scf.functions;

import java.util.function.Consumer;

/**
 * @author abhin
 *
 */
public class GetSomeMessage implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println("The input supplied is : " + t);
	}

}
