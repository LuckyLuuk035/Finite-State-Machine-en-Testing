import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {
    List<String> l1 = Arrays.asList("s0","s1", "s2", "s3");

//    Node s0 = new Node("s0");
//    Node s1 = new Node("s1");
//    Node s2 = new Node("s2");
//    Node s3 = new Node("s3");

    List<Node> nodeList = new ArrayList<Node>();


    @Test
    void run() throws Exception {
        ArrayList<Node> nodeArr = new ArrayList<Node>();
        for (int i = 0; i < 4; i++) {
            String name = "s" + i;
            nodeArr.add(new Node(name));
        }
        for (Node n : nodeArr){
            System.out.println(n.getName());
        }
    }

    @Test
    void run1() throws Exception{
        for (int i = 0; i < 4; i++) {
            String name = "s" + i;
            new Node(name);
        }
        //System.out.println(s3);
    }
}

//    @Test
//    void run() throws Exception{
