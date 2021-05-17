import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        formatieveOpdracht();
    }

    private static void formatieveOpdracht() {
        HashMap<String, Node> nodeList = Node.createNodes(Arrays.asList("s0", "s1", "s2", "s3"));

        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s2", "s1"));
        System.out.println(nodeList.get("s0").getPaths());


        FSM fsmOpdracht = new FSM(nodeList,nodeList.get("s0"),"BBABA");
//        System.out.println(fsmOpdracht.run());
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
//        FSM fsm1 = new FSM(nodeList, s0 ,"BBABA");