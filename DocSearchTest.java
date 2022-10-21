import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testHandleURL() throws URISyntaxException{
        Handler h = new Handler();
        URI nothing = new URI("http://localhost/");
        assertEquals(h.handleRequest(nothing), "Don't know how to handle that path!");
    }
}