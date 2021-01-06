/**
 * 
 */
package au.com.sample.functional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;

public class FunctionalProgramming {

	public static void main(String[] args) {

		double number = 105;

		System.out.println(getSquareRootValue(105));
		System.out.println(getSquareRootValueFunc.apply(number));

	}

	static Function<Double, BigDecimal> getSquareRootValueFunc = (num) -> BigDecimal.valueOf(Math.sqrt(num)).setScale(3,
			RoundingMode.HALF_UP);

	public static BigDecimal getSquareRootValue(double num) {
		return BigDecimal.valueOf(Math.sqrt(num)).setScale(3, RoundingMode.HALF_UP);
	}

}
