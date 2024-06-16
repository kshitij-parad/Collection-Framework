import java.util.ArrayList;

import java.util.Iterator;

public class P01_Learn {
    public static void main(String[] args) {
        ArrayList<String> stud = new ArrayList<>();
        stud.add("kshitij");
        stud.add("kaete"); // append at end
        stud.add("yuan");
        stud.add("jotue");
        stud.add("lslsaa");
        stud.add("tysu");
        // System.out.println(stud);
        stud.add(1, "jagu"); // adds at specified index and shift value at that index to right side
        stud.add(5, "kutsh");
        // >>>> Adding all list items from new list to existing list
        ArrayList<String> studeN = new ArrayList<>();
        studeN.add("kartin");
        studeN.add("kishinn");
        studeN.add("krubtain");
        studeN.add("artihk");
        stud.addAll(studeN);
        // >>> Functon to get item at specified index == get(ind)
        // System.out.println(stud.get(0));
        // System.out.println(stud.get(6));
        // >> Remove item form list == remove(index)
        // ArrayList<Integer> a = new ArrayList<>();
        // a.add(5);
        // a.add(4);
        // a.add(3);
        // a.add(9);

        // System.out.println(a);
        // a.remove(1);
        // System.out.println(a);

        // a.remove(Integer.valueOf(9)); // removes particular value
        // System.out.println(a);

        // <<< Update == set(ind, newVal);

        // a.set(1, 88);
        // System.out.println(a);

        // << empty entire listt
        // a.clear();
        // System.out.println(a);

        // Contains(item)

        // System.out.println(a.contains(889));

        // Note: when we are printing the list basically we are printing the object
        // which in converted into string typpe using toString( ) method.


        //Iterate list

        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(9);

        //for loop
        // for(int i =0 ; i<a.size();i++){
        //     // System.out.println(a.get(i));
        // }

        //for Each
        //  for(Integer e: a){
        //     System.out.println(e*e);
        //  }


        // <><.,.,>> Note: Provided Iterator: 
         Iterator<Integer> it = a.iterator();

         while (it.hasNext()) {
            System.out.println(it.next());
         }


    }
}