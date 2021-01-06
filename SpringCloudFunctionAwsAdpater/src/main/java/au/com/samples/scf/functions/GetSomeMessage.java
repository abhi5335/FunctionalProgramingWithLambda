/**
 * 
 */
package au.com.samples.scf.functions;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

/**
 * @author abhinav
 *
 */
@Component
public class GetSomeMessage implements Consumer<String> {

	@Override
	public void accept(String input) {
		System.out.println("The input supplied is : " + input);
	}

}
