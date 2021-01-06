/**
 * 
 */
package au.com.samples.scf.functions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;

/**
 * @author abhin
 *
 */
public class GetSquareRootValue implements Function<Double, BigDecimal> {

	@Override
	public BigDecimal apply(Double t) {
		return BigDecimal.valueOf(Math.sqrt(t)).setScale(3, RoundingMode.HALF_UP);
	}

}
