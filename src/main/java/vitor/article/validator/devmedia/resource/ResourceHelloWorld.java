package vitor.article.validator.devmedia.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces; 

/**
 * @author Vitor Lima
 * 
 * Feb 3, 2018
 *
 */
@Path("/helloworld")  
public class ResourceHelloWorld
{
	@GET
	@Produces({"text/plain","application/xml", "application/json"})
	public String doGetAsXmlOrJson() {
		return "Get Hello World";
	}
	
	@POST
	@Consumes({"text/plain","application/xml", "application/json"})
	public String doPostAsXmlOrJson() {
		return "Post Hello World";
	}
}
