//🔄 4. Medium-Hard – Remove Duplicates While Preserving Order
        /*💡Topics: Set + List Conversion + Wrapper Logic
            📝 Problem:
                Given a List<Integer>, remove all duplicates but keep the original order.
                Input: [4, 5, 4, 2, 2, 8]
                Output: [4, 5, 2, 8]

                ✅ Tests use of LinkedHashSet, conversion techniques.
        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class P04_RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList= Arrays.asList(4, 5, 4, 2, 2, 8,10,10);
        LinkedHashSet<Integer> uniquHashSet = new LinkedHashSet<>(numList);

        // for(int i = 0 ; i<numList.size();i++){
        //     uniquHashSet.add(numList.get(i));
        // }

        System.out.println(uniquHashSet);
    }
}
