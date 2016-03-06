package com.notes.restfulservice;
 
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.notes.model.Note;
import com.notes.service.NoteService;
 
@Path("/notes")
public class ApplicationService {
	@Autowired
	NoteService noteService;
	@GET
	@Path("/getNote/{emailId}")
	public Response getNoteByUser(@PathParam("emailId") String emailId) {
		List<Note> output = noteService.findAllNotes(emailId);
		return Response.status(200).entity(output).build();
	}
 
	@POST
	@Path("/saveNote")
	public Response saveNote() {
		
		//String output = "Jersey say : " + msg;
		return Response.status(200).entity("").build();
	}
}