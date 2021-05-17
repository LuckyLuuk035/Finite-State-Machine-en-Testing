import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(formatieveOpdracht("s0","BABBBAAB"));
        //System.out.println(eigenFiniteStateMachine("s0","BABBAAB"));
        System.out.println(eigenFiniteStateMachine("s0","RANDOM"));
    }

    // De hieronder gemaakte netwerken staan ook in het mapje 'afbeelding' als png opgeslagen.
    public static List<String> formatieveOpdracht(String startNode, String input) {
        // Maak de nodes van de Formatieve Opdracht aan.
        LinkedHashMap<String, Node> nodeList = Node.createNodes(Arrays.asList("s0", "s1", "s2", "s3"));

        // Geef de nodes hun bijbehorende paths.
        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s2", "s1"));
        nodeList.get("s1").setPaths(nodeList, Arrays.asList("s1", "s2"));
        nodeList.get("s2").setPaths(nodeList, Arrays.asList(null, "s3"));
        nodeList.get("s3").setPaths(nodeList, Arrays.asList("s3", "s0"));

        // Maak de Finite State Machine en run deze met een gegeven input.
        FSM fsmOpdracht = new FSM(nodeList,nodeList.get(startNode));
        fsmOpdracht.setInput(input);

        System.out.println("Formatieve Opdracht output:");
        return fsmOpdracht.run();
    }

    public static List<String> eigenFiniteStateMachine(String startNode, String input) {
        // Maak de nodes voor de FSM.
        LinkedHashMap<String, Node> nodeList = Node.createNodes(Arrays.asList("s0", "s1", "s2", "s3","s4", "s5", "s6", "s7","s8", "s9", "s10", "s11"));

        // Geef de nodes hun bijbehorende paths.           | A    B    C    D  |
        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s1","s2","s3","s4"));
        nodeList.get("s1").setPaths(nodeList, Arrays.asList("s1","s5","s2"));
        nodeList.get("s2").setPaths(nodeList, Arrays.asList("s2","s5"));
        nodeList.get("s3").setPaths(nodeList, Arrays.asList("s3","s6"));
        nodeList.get("s4").setPaths(nodeList, Arrays.asList("s4","s5","s3"));
        nodeList.get("s5").setPaths(nodeList, Arrays.asList("s6","s7","s8"));
        nodeList.get("s6").setPaths(nodeList, Arrays.asList("s5","s9","s8"));
        nodeList.get("s7").setPaths(nodeList, Arrays.asList("s10"));
        nodeList.get("s8").setPaths(nodeList, Arrays.asList("s8","s5","s6"));
        nodeList.get("s9").setPaths(nodeList, Arrays.asList("s11"));
        nodeList.get("s10").setPaths(nodeList, Arrays.asList(null,"s8"));
        nodeList.get("s11").setPaths(nodeList, Arrays.asList(null,"s8"));

        // Maak de Finite State Machine en run deze met de input.
        FSM selfMadeFSM = new FSM(nodeList, nodeList.get(startNode));
        selfMadeFSM.setInput(input);

        System.out.println("Zelf gemaakte Finite State Machine output:");
        return selfMadeFSM.run();
    }
}