import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class FSM {
    private LinkedHashMap<String, Node> nodes;
    private Node state;
    private String input;


    public FSM (LinkedHashMap<String,Node> nodes, Node state) {
        this.nodes = nodes;
        this.state = state;
    }

    public void setState(Node state) {
        this.state = state;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public List<String> run() {
        // Begin met een lege lijst waar alle states in worden opgeslagen.
        List<String> pathTracker = new ArrayList<String>();
        pathTracker.add(this.state.getName()); // Voeg de begins state toe.

        for(char ch : input.toCharArray()) {
            Node nextNode = state.getNext(ch);
            if (nextNode == null) {
                break;
            }
            setState(nextNode);
            pathTracker.add(state.getName());
        }
        return pathTracker;
    }
}