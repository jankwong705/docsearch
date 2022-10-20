import org.junit.Test;

public class DocSearchTest {
    
    @Test
    public void testHandleURLPre() {
        URLHandler handler = new Handler("technical/biomed");
        assertEquals("Don't know how to handle that path!", "localhost:4000");
    }
}
