import java.util.HashMap;
import java.util.Map;

//🧪 Day 3 – Practice Problem
/* Problem: Student Directory
    Write a program using HashMap<Integer, String> to:
    Add 3 students:
        101 -> "Kshitij"
        102 -> "Priti"
        103 -> "Sanket"

    Print all entries
    Remove student with ID 102
    Check if ID 101 exists
    Print updated directory
*/
public class Revision {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();

        students.put(101,"Kshitij"); 
        students.put(102,"Priti"); 
        students.put(103,"Sanket"); 

       System.out.println("All the Entries: "+ students);

       students.remove(102);
       System.out.println("does id 101 exists?: "+students.containsKey(101));

        System.out.println("updated Entries: "+ students);
    }   
}
