import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    public void getName() throws Exception {
        Node n10 = new Node("n10");
        assertEquals("n10" , n10.getName());
    }

    @Test
    void Test() throws Exception{
        Node n10 = new Node("n10");
    }
}