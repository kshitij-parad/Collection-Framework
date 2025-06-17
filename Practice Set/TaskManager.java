
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;


//🔁 Problem 2: Task Manager with History
    /*A basic task manager where:
        Tasks are added in order (maintain order)
        You can remove a task
        You can check if a task existed (even if removed)

        🎯 Use: LinkedHashSet + HashSet
    */
public class TaskManager {
  static  HashSet<String> backupHashSet = new HashSet<>();
  static  HashSet<String> task = new LinkedHashSet<>();

    static Boolean addTask(String taskToAdd){
        return  task.add(taskToAdd);
    }

    static Boolean removetask(String taskToRemove){
        if(task.contains(taskToRemove)){
            backupHashSet.add(taskToRemove);
            return task.remove(taskToRemove);
        }
        else{
            System.out.println("Task done not exists in tasks to remove.");
        }
        return false;
    }

    static boolean  ifTaskExists(String taskToCheck){
        if(task.contains(taskToCheck)){
            System.out.println("Task is curretly Present.");
            return true;
        }
        else if(backupHashSet.contains(taskToCheck))   {
            System.out.println("Task was Present.");
            return  true;
        }

        return false;
    }

    public static void main(String[] args) {
    

       
        TaskManager.addTask("Wake up");
        TaskManager.addTask("Brush up");
        TaskManager.addTask("Bathing");

        TaskManager.removetask("Brush up");

        TaskManager.ifTaskExists("Bathing");
        TaskManager.ifTaskExists("Brush up");
        

    }    
}
