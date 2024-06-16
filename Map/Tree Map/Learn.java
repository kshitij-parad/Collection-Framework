import java.util.TreeMap;
import java.util.Map;

public  class Learn{
    public static void main(String[] args) {
        
        Map< String,Integer> num = new TreeMap<>();


        //as this is TreeMap, binary search tree of elements is being created. 
        // so, if we print this the o/p can be in sorted manned, irrespective of order of items in code
           // key is in string form so alpabetical order will be performed

        //this will be in key value pair

        num.put("One",1 );
        num.put("Two",2);
        num.put("Three",3);

        // num.put(1, "Ek");   //thid value get overwrite 
        // num.put(1, "One"); //therr will me only one entryy

        // num.put(4, "One");  //there can be multiple entry for a same value... but cant have multiple entry for same key.. new value get overwritten

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