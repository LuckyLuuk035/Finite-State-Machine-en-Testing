import java.util.ArrayList;
import java.util.List;

public class FSM {
    private List<Node> nodes;
    private Node state;
    private String input;


    public FSM (List<Node> nodes, Node state, String input) {
        this.nodes = nodes;
        this.state = state;
        this.input = input;
    }

    public void setState(Node state) {
        this.state = state;
    }

    public List<String> run() {
        List<String> path = new ArrayList<>();
        path.add(this.state.getName());
        for(char ch : input.toCharArray()) {
            Node nextNode = state.getNext(ch);
            if (nextNode == null) {
                break;
            }
            setState(nextNode);
            path.add(state.getName());
        }
        return path;
    }
}