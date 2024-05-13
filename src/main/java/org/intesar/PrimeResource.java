package org.intesar;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/prime")
public class PrimeResource {

    @Inject
    PrimeService service;

    @GET
    @Path("/{nThElement}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPrimeBySieve(@PathParam("nThElement") int nThElement) {
        return service.sieve(nThElement);
    }
}
