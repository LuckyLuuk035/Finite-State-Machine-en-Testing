import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {
    List<String> l1 = Arrays.asList("s0","s1", "s2");

    Node s0 = new Node("s0");
    Node s1 = new Node("s1");
    Node s2 = new Node("s2");
    Node s3 = new Node("s3");



    List<Node> nodeList = new ArrayList<Node>();

    FSM fsm1 = new FSM(nodeList, s0 ,"BBABA");
    @Test
    void run() throws Exception{
        s0.setAPath(s2);
        s0.setBPath(s1);

        s1.setAPath(s1);
        s1.setBPath(s2);

        s2.setBPath(s3);

        s3.setAPath(s3);
        s3.setBPath(s0);

        nodeList.add(s0);
        nodeList.add(s1);
        nodeList.add(s2);
        nodeList.add(s3);

        assertEquals(l1, fsm1.run());
    }
}