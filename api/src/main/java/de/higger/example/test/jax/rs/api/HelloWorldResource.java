package de.higger.example.test.jax.rs.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/helloworld")
@Consumes({"application/json"})
@Produces({"application/json"})
public interface HelloWorldResource {

    @GET
    @Path("gcm")
    public String getClichedMessage();

    @GET
    @Path("gaf")
    public Foo getAFoo();

    @POST
    @Path("paf")
    public void putAFoo(Foo foo);

    @POST
    @Path("pas")
    public void putAString(@QueryParam("astring") final String aString);

    @POST
    @Path("pas2/{astring}/")
    public void putAString2(@PathParam("astring") final String aString);
}
