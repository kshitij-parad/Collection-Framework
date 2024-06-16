import java.util.Comparator;
import java.util.PriorityQueue;

public class Learn {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        // pq.offer("caran");
        // pq.offer("baj");
        // pq.offer("ashish");
        // System.out.println(pq);

        // System.out.println(pq.poll()); //will work in natual order and alphabetical
        // order
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        // The PriorityQueue in Java is implemented as a heap, which is a complete
        // binary tree that maintains the heap property. This means that for a min-heap
        // (which is the default for PriorityQueue), the smallest element is always at
        // the root of the heap.

        // Why [Ashish, raj, karan]?
        // Given your input and the natural lexicographical order:
        // "Ashish" is lexicographically smaller than "karan" and "raj".
        // "karan" and "raj" are ordered lexicographically, with "karan" coming before
        // "raj".

        // PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        // pq1.add(5);
        // pq1.add(88);
        // pq1.add(7);
        // pq1.add(56);
        // System.out.println(pq1); // will pritn [5, 88, 7] as

        // while (!pq1.isEmpty()) {
        // System.out.println(pq1.poll()); // his process shows that the elements are
        // retrieved in ascending order,
        // // even though the internal structure of the heap (when printed directly)
        // // doesn't reflect this sorted order.
        // }

        // Peak

        // System.out.println(pq1.peek());




        //Implementing Comparator

        // PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); //pass comparator in constructor, this will reverse the order as it was woring in min heap now it will wor din max heap
        // pq2.add(5);
        // pq2.add(88);
        // pq2.add(7);
        // pq2.add(56);
        // System.out.println(pq2); 

        // pq2.poll();
        // System.out.println(pq2);

    }
}