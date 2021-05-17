import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node n0 = new Node("n0");


    @Test // Check of de getName werkt.
    public void getName() throws Exception {
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

    @Test // check of de FSM daadwerkelijk stopt als hij een a ontvangt bij s2.
    void FSMformatieveOpddracht() throws Exception {
        assertEquals(1,Main.formatieveOpdracht("s2","ABABABABA").size());
    }
}