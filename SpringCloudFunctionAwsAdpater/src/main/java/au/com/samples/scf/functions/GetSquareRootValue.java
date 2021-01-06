/**
 * 
 */
package au.com.samples.scf.functions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * @author abhinav
 *
 */
//@Component
//public class GetSquareRootValue implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
//
//	@Override
//	public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
//
//		/* Business logic to be performed */
//		BigDecimal sqrt = BigDecimal.valueOf(Math.sqrt(Double.valueOf(input.getBody()))).setScale(3,
//				RoundingMode.HALF_UP);
//
//		/* For response header */
//		Map<String, String> headers = new HashMap<String, String>();
//		headers.put("Content-Type", "text/plain");
//
//		APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
//		response.setStatusCode(200);
//		response.setHeaders(headers);
//		response.setBody(String.valueOf(sqrt));
//		return response;
//	}
//
//}

@Component
public class GetSquareRootValue implements Function<String, String> {

	@Override
	public String apply(String input) {
		BigDecimal sqrt = BigDecimal.valueOf(Math.sqrt(Double.valueOf(input))).setScale(3, RoundingMode.HALF_UP);
		return String.valueOf(sqrt);
	}

}



