
import java.util.HashSet;

//⏳ Problem 5: Fail-Fast Simulation
/*
    Create a HashSet, add some values. While looping with a for-each, try adding a new element mid-loop.
    Catch and print the exception message cleanly.

🎯 Purpose: Practice fail-fast behavior.

 */
public class FailFastSimulation {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(2);

        try {
            for (int e : hs) {
                if (e == 2) {
                    hs.add(4);
                }
            }
        } catch (Exception es) {
            System.out.println("Error: Concurrnt Modification");
        }

    }
}
