package com.notes.restfulervice;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/notes")
public class ApplicationService {
 
	@GET
	@Path("/getNote/{id}")
	public Response getNoteById(@PathParam("id") String msg) {
		String output = "Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}
 
	@POST
	@Path("/saveNote")
	public Response saveNote() {
		
		//String output = "Jersey say : " + msg;
		return Response.status(200).entity("").build();
	}
}