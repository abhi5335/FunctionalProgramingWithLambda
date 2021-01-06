/**
 * 
 */
package au.com.samples.scf.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * @author abhinav
 *
 */
/*
 * public class AWSLambdaHandler extends
 * SpringBootRequestHandler<APIGatewayProxyRequestEvent,
 * APIGatewayProxyResponseEvent> {
 * 
 * }
 */

public class AWSLambdaHandler extends SpringBootRequestHandler<String, String> {

}
