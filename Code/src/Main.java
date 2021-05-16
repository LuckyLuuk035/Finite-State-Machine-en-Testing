import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        formatieveOpdracht();
    }

    private static void formatieveOpdracht() {
        List<String> list = Arrays.asList("s0", "s1", "s2", "s3");
        List<Node> nodeList = Node.createNodes(list);


        FSM fsmOpdracht = new FSM(nodeList,nodeList.get(0),"BBABA");
        System.out.println(fsmOpdracht.run());
    }
}

//        s0.setAPath(s2);
//        s0.setBPath(s1);
//
//        s1.setAPath(s1);
//        s1.setBPath(s2);
//
//        s2.setBPath(s3);
//
//        s3.setAPath(s3);
//        s3.setBPath(s0);
//
//        nodeList.add(s0);
//        nodeList.add(s1);
//        nodeList.add(s2);
//        nodeList.add(s3);
//
//        FSM fsm1 = new FSM(nodeList, s0 ,"BBABA");
//        assertEquals(l1, fsm1.run());