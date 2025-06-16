
import java.util.ArrayList;
import java.util.Collections;

// package Collection Interface.List.ArrayList;

//🧪 Practice Question #4:
    /* Write Java code to:
        Create an ArrayList of Integers: 5, 2, 8, 2, 7
        Sort the list in ascending order
        Reverse the list
        Count how many times 2 appears
        Print final list and frequency
    */
public class RevisionUtility {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers,5, 2, 8, 2);
        numbers.add(7);

        Collections.sort(numbers);

        Collections.reverse(numbers);

        int frequency = Collections.frequency(numbers, 2);

        System.out.println(numbers );
        System.out.println(frequency);

    }
}
