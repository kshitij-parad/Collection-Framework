// package CollectionInterface.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RevisionProblem {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        Collections.addAll(names,"Kshitij","Priti","Sanket");

        for(String name: names){
            System.out.print(name + " ");
        }
    }
}
