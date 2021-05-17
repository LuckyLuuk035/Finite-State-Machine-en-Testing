import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Node {

    private String name;
    private LinkedHashMap<String, Node> paths;


    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaths(LinkedHashMap<String, Node> nodeList, List<String> pathNames) {
        LinkedHashMap<String,Node> temp = new LinkedHashMap<String, Node>();
        for(String node : pathNames){
            temp.put(node,nodeList.get(node));
        }
        this.paths = temp;
    }

    public LinkedHashMap<String, Node> getPaths() {
        return paths;
    }

    public static LinkedHashMap<String,Node> createNodes(List<String> list){
        LinkedHashMap<String,Node> nodes = new LinkedHashMap<String, Node>();

        for (String nodeName : list) {
            nodes.put(nodeName, new Node(nodeName));
        }
        return nodes;
    }

    public Node getNext(char next) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Als dat nog niet duidelijk was ;)
        String inputOptions = alfabet.substring(0, this.getPaths().size()); // Dus een max van 26 verschillende paths.
        int position = 0;
        for (char ch : inputOptions.toCharArray()) {
            if (next == ch) {
//                System.out.println(paths.keySet().toArray()[position]);
                return paths.get(paths.keySet().toArray()[position]);
            }
            position++;
        }
        return null;
    }
}