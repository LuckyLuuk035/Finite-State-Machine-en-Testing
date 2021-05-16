import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node n0 = new Node("n0");



    @Test
    public void getName() throws Exception {
        assertEquals("n0" , n0.getName());
    }

    @Test
    void getNext() throws Exception{
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");

        n0.setAPath(n1);
        n0.setBPath(n2);

        assertEquals("n1",n0.getNext('A').getName());
        assertEquals("n2",n0.getNext('B').getName());
    }
}