package han.ica.dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/items")
public class ItemsCheckResource {
    @GET
    @Path("/")
    @Produces("text/plain")
    public String items() {
        return "bread, butter";
    }
}
