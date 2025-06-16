import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;

public class Revision {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        Collections.addAll(name, "kshitij", "raj", "lata","Karan","Priti");

        for(String names: name){
            System.out.print(names +" ");
        }

        Collections.sort(name);
        Collections.reverse(name);
        
        System.out.println();

        for(String newNames: name){
            System.out.print(newNames +" ");
        }
    }
}
