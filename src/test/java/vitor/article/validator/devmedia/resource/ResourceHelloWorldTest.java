package vitor.article.validator.devmedia.resource;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jayway.restassured.http.ContentType;

import vitor.article.validator.devmedia.server.Server;

/**
 * @author Vitor Lima
 * 
 * Feb 3, 2018
 *
 */
class ResourceHelloWorldTest {
	
	/**
	 * 
	 * @throws IOException 
	 */
	@BeforeEach
	public void setUp() throws IOException {
		Server.main(new String[] {"test"});
	}
	
	@AfterEach
	public void tearDown() throws Exception {
	   
	}

	/**
	 * Test method for {@link vitor.article.validator.devmedia.resource.ResourceHelloWorld#doGetAsXmlOrJson()}.
	 */
	@Test
	public void testDoGetAsXmlOrJson() {
		get("/helloworld").
		then().
		statusCode(200).
		and().
		contentType(ContentType.TEXT).
		and().
		body(equalTo("Get Hello World"));
		
	}
}
