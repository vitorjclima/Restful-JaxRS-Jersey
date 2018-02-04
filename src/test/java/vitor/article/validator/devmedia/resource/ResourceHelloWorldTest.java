package vitor.article.validator.devmedia.resource;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import com.jayway.restassured.http.ContentType;

/**
 * @author Vitor Lima
 * 
 * Feb 3, 2018
 *
 */
class ResourceHelloWorldTest {

	/**
	 * Test method for {@link vitor.article.validator.devmedia.resource.ResourceHelloWorld#doGetAsXmlOrJson()}.
	 */
	@Test
	void testDoGetAsXmlOrJson() {
		get("/WebService/helloworld").
		then().
		statusCode(200).
		and().
		contentType(ContentType.XML).
		and().
		body(equalTo("Hello World"));
		
	}
}
