package com.skc.rest.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/token")
public class TokenGenerator {
	
	static final String DATE_TOKEN="ddMMyyyyhhmmssS";
	
	@GET
	@Path("/generate")
	@Consumes(value=MediaType.APPLICATION_XML)
	@Produces(value=MediaType.APPLICATION_XML)
	public Response getToken(){
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_TOKEN);
		String result = dateFormat.format(new Date());
		
		return Response.status(200).entity(result).build();
	}
}
