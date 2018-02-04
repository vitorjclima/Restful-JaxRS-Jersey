package vitor.article.validator.devmedia.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 

/**
 * @author Vitor Lima
 * 
 * Feb 3, 2018
 *
 */
@Path("helloworld")  
public class ResourceHelloWorld
{
	@GET
	@Produces({"application/xml", "application/json"})
	public String doGetAsXmlOrJson() {
		return "Hello World";
	}
}
