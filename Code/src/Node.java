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