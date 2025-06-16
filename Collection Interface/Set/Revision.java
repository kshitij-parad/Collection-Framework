// package Collection Interface.Set;

//Day 1 – Practice Problem (Unique Tags App)
/*      Problem Statement:
            Write a Java program that does the following:
            Adds the following tags to a Set: "java", "collections", "hashset", "java", "treeset"
            Print all unique tags.
            Print the number of unique tags.
 */

import java.util.HashSet;
import java.util.Set;

public class Revision {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();

        tags.add("java");
        tags.add("collections");
        tags.add("hashset");
        tags.add("java");
        tags.add("treeset");

        System.out.println(tags);
        System.out.println(tags.size());
    }
}
