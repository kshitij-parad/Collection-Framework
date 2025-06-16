
import java.util.ArrayList;
import java.util.Iterator;

// package Collection Interface.List.ArrayList;

//🧠 Final Phase 1 Practice Problem (To-Do List App):
    /*
        Write Java code to simulate a basic to-do list using ArrayList<String>:
            Add 3 tasks
            Display all tasks
            Remove 2nd task
            Print updated task list
    */

public class RevisionTodoApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("app design");
        tasks.add("app frontend dev");
        tasks.add("app backend dev");

        Iterator<String> itr = tasks.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }

        System.out.println();
        
        tasks.remove(1);

        for(String task: tasks){
            System.out.print(task + ", ");
        }

    }
}
