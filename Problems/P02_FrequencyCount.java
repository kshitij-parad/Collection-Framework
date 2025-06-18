// package Problems;
//🔄 2. Easy-Medium – HashMap + Input Count
    /*💡Topic: Map Interface
        📝 Problem:
            Given an array of integers, count the frequency of each number using HashMap<Integer, Integer>.
            Example: arr = [2, 3, 2, 4, 3, 5]
            Output: {2=2, 3=2, 4=1, 5=1}
            ✅ Tests iteration, put, and containsKey logic.
    */

import java.util.HashMap;
import java.util.Map;

public class P02_FrequencyCount {
   public static void main(String[] args){
     HashMap<Integer,Integer> elements = new HashMap<>();

     int[] arr = {2, 3, 2, 4, 3, 5};

     for(int i = 0 ; i < arr.length; i++){
        if(elements.containsKey(arr[i])){
            elements.put(arr[i], elements.get(arr[i])+1);
        }
        else{
            elements.put(arr[i], 1);
        }
     }

    
     for(Map.Entry<Integer,Integer> ele : elements.entrySet()){
        System.out.println(ele.getKey() + "-> " + ele.getValue());
     }

     
   }

}
