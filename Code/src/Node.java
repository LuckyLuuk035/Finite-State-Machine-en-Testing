import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Node {

    private String name;
    private HashMap<String, Node> paths;


    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaths(HashMap<String, Node> nodeList, List<String> pathNames) {
        HashMap<String,Node> temp = new HashMap<String, Node>();
        for(String node : pathNames){
            temp.put(node,nodeList.get(node));
        }
        this.paths = temp;
    }

    public HashMap<String, Node> getPaths() {
        return paths;
    }

    public static HashMap<String,Node> createNodes(List<String> list){
        HashMap<String,Node> nodes = new HashMap<String, Node>();

        for (String nodeName : list) {
            nodes.put(nodeName, new Node(nodeName));
        }
        return nodes;
    }

//    public Node getNext(char next) {
//        if (this.aPath != null) {
//            if (next == 'A') {
//                return aPath;
//            }
//        }
//        if (this.bPath != null) {
//            if (next == 'B') {
//                return bPath;
//            }
//        }
//        return null;
//    }
}