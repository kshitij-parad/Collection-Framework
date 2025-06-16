// package Collection Interface.Set;

//🧪 Day 2 – Practice Problem
    /*
    Problem:
        Write a Java program that:
            Uses all 3 sets (HashSet, LinkedHashSet, TreeSet)
            Adds: "mango", "apple", "banana", "apple", "kiwi"
            Removes "banana" from all
            Prints each set and checks if "apple" exists
    */


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RevisionAll3 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        List<String> items = Arrays.asList("mango", "apple", "banana", "apple", "kiwi");

        for(String item: items){
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        }

        hashSet.remove("banana");
        linkedHashSet.remove("banana");
        treeSet.remove("banana");

       System.out.println("HashSet: "+ hashSet + ", Apple exists?: " + hashSet.contains("apple"));
       System.out.println("LinkedHashSet: "+ linkedHashSet+ ", Apple exists?: " + linkedHashSet.contains("apple"));
       System.out.println("TreeSet: "+ treeSet +", Apple exists?: " + treeSet.contains("apple"));
    }
}
