import java.util.HashMap;
import java.util.Map;

public  class Learn{
    public static void main(String[] args) {
        
        Map<Integer, String> num = new HashMap<>();


        //as this is HashMap, hashing of elements us being performed... 
        // so, if we print this the o/p can be in any order, irrespective of order of items in code

        //this will be in key value pair

        num.put(1, "One");
        num.put(2, "Two");
        num.put(3, "Three");

        // num.put(1, "Ek");   //thid value get overwrite 
        num.put(1, "One"); //therr will me only one entryy

        num.put(4, "One");  //there can be multiple entry for a same value... but cant have multiple entry for same key.. new value get overwritten

        System.out.println(num);

        //as this overwirtes but we can stop this by implementing a finction
        //if we dont use this function value get overwrites but this func will check if therr is entry or not for that key, if there is no entry for key  then this will get added 
        //otherwise it will get ignored

        // num.putIfAbsent(2,"don");

        //above also can be done in following manner

        // if(!num.containsKey(2)){
        //     num.put(2, "don");
        // }

         System.out.println(num.containsValue("Two"));

        
        //Iterating

        //1
        // for(Map.Entry<Integer,String> e: num.entrySet()){
        //     System.out.println(e);
        // }

        //2
        //  for(int i = 1;i<=num.size();i++){
        //     System.out.println(num.get(i));  //getting valye using key
        //  }

        System.out.println(num);


        //Getting key
        // for(Map.Entry<Integer,String> e: num.entrySet()){
        //     System.out.println(e.getKey());  //to get all the keys
        // }


        //getting values
        // for(Map.Entry<Integer,String> e: num.entrySet()){
        //     System.out.println(e.getValue());
        // }

       
    }
}