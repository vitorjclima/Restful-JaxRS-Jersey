package vitor.article.validator.devmedia.server;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Vitor Lima
 * 
 * Feb 5, 2018
 *
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		ResourceConfig config = new ResourceConfig().packages("vitor.article.validator.devmedia.resource");
		URI uri = URI.create("http://localhost:8080");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		System.out.println("Server Running");
		if(!(args[0].equals("test"))) {
			System.in.read();
			server.stop();
			System.out.println("Stopped Server");
		}	
	}
}
