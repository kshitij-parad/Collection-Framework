//🧪 Day 7 Practice Problem: Task Scheduler with Priorities
    /*Create a class Task with:
        String name
        int priority
        Add tasks:
            "Email" → 3
            "Workout" → 1
            "Study" → 2
        Use a PriorityQueue<Task> to process based on lowest priority first

        Print tasks in order of processing
    */

import java.util.PriorityQueue;


class RevisionPrioQueue{
    static class Task{
            String name;
            int prio;

            Task(String name,int prio){
                this.name= name;
                this.prio= prio;
            }
        }
    public static void main(String[] args){
        PriorityQueue<Task> queue = new PriorityQueue<>((a,b)-> (a.prio - b.prio));

        queue.add(new Task("Email",3));
        queue.add(new Task("Workout",1));
        queue.add(new Task("Study",2));

        for(Task t: queue){
            System.out.println(t.name + ": " + t.prio);
        }

        while(!queue.isEmpty()){
            Task t = queue.poll();
            System.out.println(t.name + ": " + t.prio);
            // System.out.println(queue.poll().name + ": " + queue.poll().prio ); //exception: because pollinng 2 time (for name and prio)
        }
    }
}