import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
public class AsyncHandler {

    @Asynchronous
    public void doAsync(String name, int delay) {
        System.out.println("Starting: " + name);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done with: " + name);
    }
}
