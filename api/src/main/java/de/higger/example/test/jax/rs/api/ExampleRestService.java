package de.higger.example.test.jax.rs.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/example")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface ExampleRestService {

    @GET
    @Path("getexamplestring")
    public String getExampleString();

    @POST
    @Path("postexamplestringbyquery")
    public void postExampleStringByQuery(@QueryParam("astring") final String aString);

    @POST
    @Path("postexamplestringbyurl/{estring}/")
    public void postExampleStringByUrl(@PathParam("estring") final String aString);

    @GET
    @Path("getexamplefoo")
    public Foo getExampleFoo();

    @POST
    @Path("postexamplefoo")
    public void postExampleFoo(Foo foo);
}
