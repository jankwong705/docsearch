import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import static org.junit.Assert.*;
import org.junit.*;

public class DocSearchTest {
    
    @Test
    public void testHandleURLPre() throws IOException, URISyntaxException {
        URLHandler handler = new Handler("technical/biomed");
        URI url = new URI("https://localhost:4001");
        assertEquals("Don't know how to handle that path!", handler.handleRequest(url));
    }
}
