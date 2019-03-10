package com.ninjasquad.quarkustest.web

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

data class Greeting(val name: String)

@Path("/")
class GreetingResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = Greeting("JB")
}
