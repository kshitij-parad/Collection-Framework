import java.util.LinkedList;
import java.util.Queue;

public class Learn{
    public static void main(String[] args) {
       
        Queue<String> queue = new LinkedList<>();
        
        // queue.offer("kp1");   //reruns tru or false
        // queue.offer("kp3");
        // queue.offer("kp4");
        // // System.out.println(queue);


        // queue.add("kp5");    //throws exception if fails to add item
        // System.out.println(queue);


        // System.out.println(queue.peek()); //returuns null if queue is empty else retuns next element to be serveed
        // System.out.println(queue.element()); //throws expection if queue is empty


        // System.out.println(queue.remove() );//retuns and removes, throws exeption if que is empty and no element is presenr to remove
        // System.out.println(queue);

       System.out.println( queue.poll()); //retuns and removes, retuns null if queue is empty
        System.out.println(queue);


    }
}