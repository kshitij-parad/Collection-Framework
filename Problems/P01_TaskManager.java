// package Problems;

import java.util.ArrayList;
import java.util.Collections;

//🔹 Easy – ArrayList / Basic CRUD
   /* ✅ Problem:
    Implement a simple Task Manager using ArrayList<String>:
    Add tasks: "Study", "Exercise", "Code"
    Remove "Exercise"
    Print updated task list
    🎯Goal: Practice ArrayList.add(), remove(), and print operations.
*/
public class P01_TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        
        Collections.addAll(tasks, "Study", "Exercise", "Code");

        tasks.remove("Exercise");

        System.out.println(tasks);
    }
}
