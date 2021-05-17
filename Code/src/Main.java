import java.util.*;

public class Main {

    public static void main(String[] args) {
        formatieveOpdracht();
    }

    private static void formatieveOpdracht() {
        LinkedHashMap<String, Node> nodeList = Node.createNodes(Arrays.asList("s0", "s1", "s2", "s3"));

        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s2", "s1"));
        nodeList.get("s1").setPaths(nodeList, Arrays.asList("s1", "s2"));
        nodeList.get("s2").setPaths(nodeList, Arrays.asList(null, "s3"));
        nodeList.get("s3").setPaths(nodeList, Arrays.asList("s3", "s0"));


        FSM fsmOpdracht = new FSM(nodeList,nodeList.get("s0"),"BAABA");
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