
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//🔢 3. Medium – Custom Sorting with Comparator
    /*💡 Topic: Comparable vs Comparator
            📝 Problem:
                Create a Student class with name and marks.
                Add 5 students to a list.
                Sort them in descending order of marks using a custom Comparator.

                ✅ Tests compare(), lambda usage, and Collections.sort().
    */

public class P03_CustomSorting {

    static class Student{

        private String name;
        private int marks;

        Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }


        
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Kshitij", 77));
        students.add(new Student("raj", 88));
        students.add(new Student("priti", 7));

        Comparator<Student> byMarks = (a,b) -> b.getMarks() - a.getMarks();

        Collections.sort(students,byMarks);

        // Iterator<Student> itr = students.iterator();

        for(Student student: students){
            System.out.printf("%s(%d).\n",student.getName(),student.getMarks() );
        }
    }
}
