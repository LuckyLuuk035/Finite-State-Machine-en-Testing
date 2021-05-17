import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node n0 = new Node("n0");


    @Test
    public void getName() throws Exception {
        assertEquals("n0" , n0.getName());
    }


    @Test
    void createNodes() throws Exception {
        List<String> list = Arrays.asList("s0", "s1", "s2", "s3");
        HashMap<String,Node> nodes = new HashMap<String, Node>();

        for (String nodeName : list) {
            nodes.put(nodeName, new Node(nodeName));
        }
//        System.out.println(nodeArr.get(0).getName());
    }
}