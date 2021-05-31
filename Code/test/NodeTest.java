import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

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
    @Test
    void setPath() throws Exception {
        List<String> nodeNames = Arrays.asList("s0", "s1", "s2", "s3");
        LinkedHashMap<String, Node> nodeList = Node.createNodes(nodeNames);

        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s2", "s1"));
        nodeList.get("s1").setPaths(nodeList, Arrays.asList("s1", "s2"));
        nodeList.get("s2").setPaths(nodeList, Arrays.asList(null, "s3"));
        nodeList.get("s3").setPaths(nodeList, Arrays.asList("s3", "s0"));

        for (String name : nodeNames) {
            ;
        }
    }
}