//🧪 Day 8 Practice Problem: Student Sorter

/* Problem Statement:
    Create a class Student with:
        String name
        int marks
        Add 3 students:
            "Kshitij", 85
            "Priti", 92
            "Sanket", 78
        Sort students in ascending order of marks using Comparable.
        Print the sorted list.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevisionComparable {

    static class Student implements Comparable<Student> {

        private String name;
        private int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student std) {
            return this.marks - std.marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

    }

    public static void main(String[] args) {
        List<Student> classs = new ArrayList<>();

        classs.add(new Student("Kshitij", 85));
        classs.add(new Student("Priti", 92));
        classs.add(new Student("Sanket", 78));

        // Collections.sort(classs);
        Collections.sort(classs);

        // System.out.println(classs);
        for (Student student : classs) {

            System.out.printf("%s(%d).\n", student.getName(), student.getMarks());
            System.out.println();
        }
    }
}
