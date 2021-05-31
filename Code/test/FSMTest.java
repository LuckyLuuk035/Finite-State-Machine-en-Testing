import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {
    @Test
    void formatieveOpdracht() throws Exception{
        // Test of de return het zelfde is als bij de formatieve opdracht 2a.
        String input = "BAAB"; // De input van het voorbeeld.
        List<String> result = Arrays.asList("s0", "s1", "s1", "s1", "s2"); // Het resultaat van het voorbeeld.
        assertEquals(result, Main.formatieveOpdracht("s0",input));
        if (result.equals(Main.formatieveOpdracht("s0",input))); {
            System.out.println("Het voorbeeld van de Formatieve Opdracht geeft het zelfde resultaat");
        }

        // Check of de FSM daadwerkelijk stopt als hij een a ontvangt bij 's2'.
        int test = Main.formatieveOpdracht("s2","ABABABABA").size();
        // Aangezien we beginnen bij 's2' wordt er verwacht dat de grote van de list 1 is (namelijk alleen s2).
        assertEquals(1, test);
        if(test == '1'); {
            System.out.println("De FSM stopt bij een input van B op s2");
        }
    }

    @Test
    void eigenFiniteStateMachine() throws Exception{
        // Check of de FSM echt stopt bij 's10' en 's11'.
        int s10 = Main.eigenFiniteStateMachine("s10","AAAAA").size();
        int s11 = Main.eigenFiniteStateMachine("s11","AAAAA").size();
        assertEquals(1,s10);
        assertEquals(1,s11);
        assertEquals(s10,s11);
        if (s10 == s11); {
            System.out.println("De lengtes zijn gelijk aan elkaar.\nEn die lengte is " + s10);
        }

        // Ook doen we een check of de 'RANDOM' wel random inputs geeft.
        List<List<String>> lst = new java.util.ArrayList<List<String>>(Collections.singletonList(Collections.<String>emptyList()));
        final Set<List<String>> setToReturn = new HashSet<>();
        final Set<List<String>> set1 = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            lst.add(Main.eigenFiniteStateMachine("s0","RANDOM"));
        }
        for (List<String> i : lst) {
            if (!set1.add(i))
            {
                setToReturn.add(i);
            }
        }
        // als 5% of minder dubbel is:
        if (setToReturn.size() <= 5) {
            System.out.println("De random input is daadwerkelijk random");
        }
    }
}