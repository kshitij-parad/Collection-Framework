import java.util.ArrayDeque;

public class Learns{
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.offer("Rajendra");
        adq.offerFirst("kshitij");
        adq.offerLast("Parad");

        System.out.println(adq);

        adq.offer("Darshana");
        System.out.println(adq);


        System.out.println(adq.peek());
        System.out.println("peek first; "+ adq.peekFirst());
        System.out.println("peek Last; "+ adq.peekLast());


        adq.poll();
        System.out.println(adq);

        System.out.println("Poll Last: "+adq.pollLast());
        System.out.println(adq);

        System.out.println("Poll First: "+adq.pollFirst());
        System.out.println(adq);
        
    }
}