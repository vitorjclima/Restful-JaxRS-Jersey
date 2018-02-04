package vitor.article.validator.devmedia.resource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		assertEquals("Hello World", "Hello World");
	}

}
