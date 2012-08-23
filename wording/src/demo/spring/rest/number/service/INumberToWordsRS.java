package demo.spring.rest.number.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;


/**
 * Class to route all rest-request for number to words operations.
 */
@Path("/")
public interface INumberToWordsRS {
	
	/**
	 * Rest Service to convert numbers to words.
	 * @return returns rest-response[json ].
	 */
	@GET
	@Path("/{number}")
	public Response convertNumberToWord(@PathParam("number") long number);

	
}
