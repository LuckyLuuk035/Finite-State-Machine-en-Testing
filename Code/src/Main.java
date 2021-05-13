import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setAPath(s2);
        s0.setBPath(s1);

        s1.setAPath(s1);
        s1.setBPath(s2);

        s2.setBPath(s3);

        s3.setAPath(s3);
        s3.setBPath(s0);

        List<Node> nodeList = new ArrayList<>();
        nodeList.add(s0);
        nodeList.add(s1);
        nodeList.add(s2);
        nodeList.add(s3);

        FSM fsm1 = new FSM(nodeList, s0 ,"BBABA");
        System.out.println(fsm1.run());
    }
}