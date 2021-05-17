import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class Node {
    private String name;
    private LinkedHashMap<String, Node> paths;


    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LinkedHashMap<String, Node> getPaths() {
        return paths;
    }

    public void setPaths(LinkedHashMap<String, Node> nodeList, List<String> pathNames) {
        // De HashMap moet Linked zijn om zo gebruik te kunnen maken van de positie van een node.
        LinkedHashMap<String,Node> temp = new LinkedHashMap<String, Node>();

        // Voor alle namen van nodes waar de huidige node aan moet verbinden.
        for(String node : pathNames){
            // Voeg aan de tijdelijke LinkedHashMap de verbindingen met de naam als key toe.
            temp.put(node,nodeList.get(node));
        }
        this.paths = temp;
    }

    public static LinkedHashMap<String,Node> createNodes(List<String> list){
        LinkedHashMap<String,Node> nodes = new LinkedHashMap<String, Node>();

        // Maak voor alle meegegeven namen een node aan met de naam als key en stop deze in de LinkedHashMap.
        for (String nodeName : list) {
            nodes.put(nodeName, new Node(nodeName));
        }
        return nodes;
    }

    public Node getNext(char next, String input) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Als dat nog niet duidelijk was ;)
        String inputOptions = alfabet.substring(0, this.getPaths().size()); // Hiermee geven we de toegestane inputs aan.

        if(input == "RANDOM"){ // Check of de input Random is.
            // Maak een random aan die een random getal kiest op basis van het aantal paths.
            Random rand = new Random();
            int position = rand.nextInt(this.getPaths().size());
            return paths.get(paths.keySet().toArray()[position]);
        }

        else { // Wanneer de input een String van keuzes is.
            int position = 0; // Een teller om later de juiste node terug te vinden.

            for (char ch : inputOptions.toCharArray()) {
                // Check voor elke toegestane input of deze gelijk is aan de input.
                if (next == ch) {
                    // Geef de node waar de positie gelijk is aan de input terug.
                    return paths.get(paths.keySet().toArray()[position]);
                }
                position++;
            }
            // Als er een input word gegeven die niet tussen de opties staat return null.
            System.out.println("Onbekende input gedetecteerd");
            return null;
        }
    }
}