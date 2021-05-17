import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        formatieveOpdracht();
    }

    private static void formatieveOpdracht() {
        // Maak de nodes van de Formatieve Opdracht aan.
        LinkedHashMap<String, Node> nodeList = Node.createNodes(Arrays.asList("s0", "s1", "s2", "s3"));

        // Geef de nodes hun bijbehorende paths.
        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s2", "s1"));
        nodeList.get("s1").setPaths(nodeList, Arrays.asList("s1", "s2"));
        nodeList.get("s2").setPaths(nodeList, Arrays.asList(null, "s3"));
        nodeList.get("s3").setPaths(nodeList, Arrays.asList("s3", "s0"));

        // Maak de Finite State Machine en run deze met een gegeven input.
        FSM fsmOpdracht = new FSM(nodeList,nodeList.get("s0"));
        fsmOpdracht.setInput("BABBBAAB");
        System.out.println(fsmOpdracht.run());
    }
}