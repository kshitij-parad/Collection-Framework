import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortCustom{
    public static void main(String[] args) {
        List<Student> stdLs = new ArrayList<>();

        stdLs.add(new Student(4, "karan"));
        stdLs.add(new Student(1, "kartik"));
        stdLs.add(new Student(5, "kshtij"));
        stdLs.add(new Student(3, "raj"));
        stdLs.add(new Student(2, "Anup"));

        System.out.println(stdLs.toString());

        Collections.sort(stdLs);  // this sort fun uses comparable interface and its compareTo(_) method
        System.out.println(stdLs.toString());


    }
}

/**
 *  Student
 */ 
 class  Student  implements Comparable<Student>{

    int roll;
    String name;

    Student(int roll , String name){
        this.roll = roll;
        this.name = name;
    }

    public String toString(){
        return " Roll no: "+ roll + " Name: "+name  ;

    }

   public int  compareTo(Student that){

        return this.roll - that.roll;
    }
    
}