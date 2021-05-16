import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

    private String name;
    private Node aPath;
    private Node bPath;


    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAPath(Node aPath) {
        this.aPath = aPath;
    }

    public void setBPath(Node bPath) {
        this.bPath = bPath;
    }

    public static ArrayList<Node> createNodes(List<String> list){
        ArrayList<Node> nodeArr = new ArrayList<Node>();

        for(String nodeName : list) {
            nodeArr.add(new Node(nodeName));
        }
        return nodeArr;
    }

    public Node getNext(char next) {
        if (this.aPath != null) {
            if (next == 'A') {
                return aPath;
            }
        }
        if (this.bPath != null) {
            if (next == 'B') {
                return bPath;
            }
        }
        return null;
    }
}