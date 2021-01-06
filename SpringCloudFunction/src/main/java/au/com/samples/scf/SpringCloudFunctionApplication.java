package au.com.samples.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}

	/*
	 * @Bean public Function<Double, BigDecimal> getSquareRootValue() { return num ->
	 * BigDecimal.valueOf(Math.sqrt(num)).setScale(3, RoundingMode.HALF_UP); }
	 * 
	 * @Bean public Consumer<String> getSomeMessage() { return input ->
	 * System.out.println(input); }
	 * 
	 * @Bean public Supplier<String> sendSomeMessage() { return () ->
	 * "Hello Folks!"; }
	 */

}
