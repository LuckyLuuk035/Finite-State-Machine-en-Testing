import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {

    @Test
    void setState() {
    }

    @Test // Deze test functie test of de input correct is en zo niet wat er mee gebeurd.
    void setInput() {

    }

    @Test
    void run() {

    }

    @Test
    void formatieveOpdracht() throws Exception{
        // Test of de return het zelfde is als bij de formatieve opdracht 2a.
        String input = "BAAB"; // De input van het voorbeeld.
        List<String> result = Arrays.asList("s0", "s1", "s1", "s1", "s2"); // Het resultaat van het voorbeeld.
        assertEquals(result, Main.formatieveOpdracht("s0",input));
        if (result.equals(Main.formatieveOpdracht("s0",input))); { System.out.println("Het voorbeeld van de Formatieve Opdracht geeft het zelfde resultaat"); }


        //
        // check of de FSM daadwerkelijk stopt als hij een a ontvangt bij s2.
        int test = Main.formatieveOpdracht("s2","ABABABABA").size();
        assertEquals(1, test);
    }
}