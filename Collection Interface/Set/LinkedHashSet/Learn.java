import java.util.LinkedHashSet;
import java.util.Set;

public class Learn {
    public static void main(String[] args) {

        // NOte: NO duplicate elements are allowed

        // Hash of evry element is created, and it stores in collection

        //NOTE: here imp is that element will be in same order after printing as it was added in set.

        Set<Integer> s1 = new LinkedHashSet<>();

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