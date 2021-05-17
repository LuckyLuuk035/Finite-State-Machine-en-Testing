import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FSMTest {

    @Test    // Deze test checkt of de FSM stopt nadat het een null ontvangt bij de formatieve opdracht.
    public void formatieveOpdracht() throws Exception {
        // Maak de nodes van de FSM aan.
        LinkedHashMap<String, Node> nodeList = Node.createNodes(Arrays.asList("s0", "s1", "s2", "s3"));

        // Geeft de nodes van het voorbeeld hun paths.
        nodeList.get("s0").setPaths(nodeList, Arrays.asList("s2", "s1"));
        nodeList.get("s1").setPaths(nodeList, Arrays.asList("s1", "s2"));
        nodeList.get("s2").setPaths(nodeList, Arrays.asList(null, "s3"));
        nodeList.get("s3").setPaths(nodeList, Arrays.asList("s3", "s0"));

        // Maak de FSM en geef deze een input.
        FSM fsmOpdracht = new FSM(nodeList,nodeList.get("s0"));
        fsmOpdracht.setInput("AAAAAAAAAAA");

        // Volgens het figuur zou de machine bij een input van A bij s2 moeten stoppen.
        // Bij de FSM hier boven aangemaakt zou de output dus een list van 2 lang moeten zijn.
        assertEquals(2 ,fsmOpdracht.run().size());
    }

    // Maak een test waar je de FSM meerdere inputs geeft.
}
