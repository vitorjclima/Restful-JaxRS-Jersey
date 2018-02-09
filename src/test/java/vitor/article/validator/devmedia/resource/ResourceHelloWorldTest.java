package vitor.article.validator.devmedia.resource;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.jayway.restassured.http.ContentType;

import vitor.article.validator.devmedia.server.Server;

/**
 * @author Vitor Lima
 * 
 * Feb 3, 2018
 *
 */
@TestInstance(Lifecycle.PER_CLASS)
class ResourceHelloWorldTest {

	/**
	 * 
	 * @throws IOException 
	 */	
	@BeforeAll
	public void setUp() throws IOException {
		Server.getServer().start();
	}
	
	@AfterAll
	public void tearDown() throws Exception {
		Server.getServer().stop();
	}

	/**
	 * Test method for {@link vitor.article.validator.devmedia.resource.ResourceHelloWorld#doGetAsXmlOrJson()}.
	 */
	@Test
	public void testDoGetAsText() {
		get("/helloworld").
		then().
		statusCode(200).
		and().
		contentType(ContentType.TEXT).
		and().
		body(equalTo("Get Hello World"));
		
	}
	
	@Test
	public void testDoPutAsText() {
		given().
		contentType(ContentType.JSON).
		body("{\"name\" : \"Batman\"}").
		post("helloworld").
		then().
		statusCode(200).
		and().body(equalTo("Post Hello World"));
	}
}
