
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// package Collection Interface.List.ArrayList;

//1️⃣ Practice Question #3 (Iterator):
    /*
        Write Java code to:
            Create an ArrayList of: "Apple", "Banana", "Grapes", "Banana"
            Use Iterator to remove only the word "Banana"
            Print the final list using a for-each loop
    */


public class RevisionIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"Apple", "Banana", "Grapes", "Banana" );

        Iterator<String> itr = list.iterator();

        // while(itr.hasNext()){
        //     String item = itr.next();
        //     if(item.equals("Banana")){
        //         itr.remove();
        //     }
        // }


        //Note: This will throw java.lang.IllegalStateException
            // for(String item: list){
            //    if(item.equals("Banana")){
            //         itr.remove();
            //     }
            // }

        for(String item: list){
            System.out.print(item +" ");
        }
        
    }
}
