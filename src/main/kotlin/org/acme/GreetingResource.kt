package org.acme

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.MediaType
import org.acme.rest.Greeting

@Path("/hello")
class GreetingResource {

    @GET
    fun hello() = Greeting("hello")
}