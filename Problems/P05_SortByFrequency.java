import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

public class P05_SortByFrequency {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1,1,1,1,2,3,3,2,2,3,4);

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        for(int i = 0 ; i < nums.size();i++){
            if(linkedHashMap.containsKey(nums.get(i))){
                linkedHashMap.put(nums.get(i), linkedHashMap.get(nums.get(i))+1);
            }
            else{
                linkedHashMap.put(nums.get(i), 1);
            }
        }


        Comparator<Integer> byFrequency = (a,b) -> {
            if(linkedHashMap.get(b) != linkedHashMap.get(a))
                return linkedHashMap.get(b) - linkedHashMap.get(a) ;

            return 0;
        };

        List<Integer> uIntegers = new ArrayList<>(linkedHashMap.keySet());
        Collections.sort(uIntegers,byFrequency);

        System.out.println(uIntegers);
    }
}
