import java.util.HashSet;
import java.util.Set;

public class Learn {
    public static void main(String[] args) {

        // NOte: NO duplicate elements are allowed

        // Hash of evry element is created, and it stores in collection

        Set<Integer> s1 = new HashSet<>();

        // System.out.println( s1.isEmpty());

        s1.add(45);
        s1.add(78);
        s1.add(45); // this 45 will not be there....
        s1.add(67);
        s1.add(56);
        s1.add(76);
        s1.add(96);
        s1.add(36);
        s1.add(16);
        s1.add(6);

        System.out.println(s1);

        // System.out.println(s1.contains(36));

        // s1.remove(36);
        // System.out.println(s1);

        // System.out.println(s1.contains(36));

        // System.out.println(s1.isEmpty());

        // System.out.println(s1.size());
        s1.clear();
        System.out.println(s1);

    }
}