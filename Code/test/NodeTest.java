import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test // Check of de getName werkt.
    public void getName() throws Exception {
        Node n0 = new Node("n0");
        assertEquals("n0" , n0.getName());
    }


    @Test // Check voor alle notes in de lijst of ze correct zijn aangemaakt.
    void createNodes() throws Exception {
        ArrayList<String> array = new ArrayList<String>(); // Create an ArrayList object
        array.addAll(Arrays.asList("s0", "s1", "s2", "s3"));
        LinkedHashMap<String, Node> nodeList = Node.createNodes(array);
        for(String nodeName: array) {
            assertEquals(nodeName, nodeList.get(nodeName).getName());
        }
    }
}