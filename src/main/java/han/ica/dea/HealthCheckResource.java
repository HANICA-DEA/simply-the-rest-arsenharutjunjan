package han.ica.dea;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/health")
public class HealthCheckResource {

    @GET
    @Path("/")
    public String healthy() {
        return "Up & Running";
    }
}
