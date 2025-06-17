//🧪 Day 9 Practice Problem: Custom Sorter

/* Problem Statement:
    Create a class Student with:
        String name
        int marks

    Add 3 students:
        "Kshitij", 85
        "Priti", 92
        "Sanket", 78

    Sort by:
        1. Descending marks
        2. Alphabetical name

    Print sorted list in both cases
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RevisionComparator {
     static class Student {

        private String name;
        private int marks;

        public Student(String name, int marks) {
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
        List<Student> students = new ArrayList<>();

        
        students.add(new Student("Kshitij", 85));
        students.add(new Student("Priti", 92));
        students.add(new Student("Sanket", 78));

        Comparator<Student> byMarks = (a,b) ->b.getMarks()- a.getMarks() ;
        Collections.sort(students,byMarks);

        System.out.println("Sorted By Marks: ");
        for(Student student: students){
             System.out.printf("%s(%d).\n", student.getName(), student.getMarks());
            System.out.println();
        }

        Comparator<Student> byName = (a,b) -> a.getName().compareTo(b.getName());
        Collections.sort(students,byName);

         System.out.println("Sorted By Name: ");
        for(Student student: students){
             System.out.printf("%s(%d).\n", student.getName(), student.getMarks());
            System.out.println();
        }

   } 
}
