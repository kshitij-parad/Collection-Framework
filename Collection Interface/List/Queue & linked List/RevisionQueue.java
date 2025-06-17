//🧪 Day 6 Practice Problem: Queue Simulator
  /*  Create a Queue<String>

    Add: "Task1", "Task2", "Task3"
    Print queue
    Remove one task
    Peek next task
    Print updated queue
*/

import java.util.LinkedList;
import java.util.Queue;

class RevisionQueue {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.add("task1");
        tasks.add("task2");
        tasks.add("task3");

        System.out.println(tasks);

        tasks.poll();
        tasks.poll();
        tasks.poll();


        tasks.peek();
        // tasks.remove(); //Exception
        System.out.println(tasks);
    }
}
