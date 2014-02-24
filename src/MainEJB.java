import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Stateless
@Path("/test")
public class MainEJB {

    @EJB
    AsyncHandler asyncHandler;

    @GET
    @Produces("text/plain")
    public String doTest() {
        asyncHandler.doAsync("One", 1000);
        asyncHandler.doAsync("Two", 1000);
        asyncHandler.doAsync("Three", 1000);
        asyncHandler.doAsync("Four", 1000);
        asyncHandler.doAsync("Five", 1000);

        return "Done, check the logs";
    }

}
