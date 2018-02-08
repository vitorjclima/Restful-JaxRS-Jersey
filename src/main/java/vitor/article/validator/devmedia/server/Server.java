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
	private static ResourceConfig config = new ResourceConfig().packages("vitor.article.validator.devmedia.resource");
	private static URI uri = URI.create("http://localhost:8080");
	private static HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		server.start();
		System.out.println("Server Running");
		System.in.read();
		server.stop();
		System.out.println("Stopped Server");
	}

	/**
	 * @return the server
	 */
	public static HttpServer getServer() {
		return server;
	}
}
