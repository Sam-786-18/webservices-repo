package com.nareshit.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/cookies")
public class CookieResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response getCookie(@CookieParam("name") Cookie cookie){
        return Response.ok().build();
    }

    @GET
    @Path("/value")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response getCookieValue(@CookieParam("name") String cookie){
    	System.out.println(Response.status(200).entity(cookie));
        return Response.ok().build();
        
    }
    @Path("/create")
    @POST
    @Produces("text/plain")
    public Response createCookie(){
        return Response
                .ok()
                .cookie(new NewCookie("name", "value"))
                .build();
    }

    @PUT
    @Produces("text/plain")
    public Response updateCookie(@CookieParam("name") Cookie cookie){
        if (cookie != null){
            return Response
                    .ok()
                    .cookie(new NewCookie("name", "new-value"))
                    .build();
        }
        return Response.ok().build();
    }

    @DELETE
    @Produces("text/plain")
    public Response deleteCookie(@CookieParam("name") Cookie cookie){
        if (cookie != null){
            NewCookie newCookie = new NewCookie(cookie, "delete cookie", 0, false);
            return Response
                    .ok()
                    .cookie(newCookie)
                    .build();
        }
        return Response.ok().build();
    }

    @GET
    @Produces("text/plain")
    public Response list(@Context HttpHeaders headers){
        for (String name : headers.getCookies().keySet()) {
            Cookie cookie = headers.getCookies().get(name);
            System.out.println("Cookie: " + name + "=" + cookie.getValue());
        }
        return Response.ok().build();
    }

}

