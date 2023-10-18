package prac_10;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<prac_10.Student> students = new ArrayList<>();
        students.add(new prac_10.Student("Peter", "Koreshkov", "06", 2, 1, 5));
        students.add(new prac_10.Student("Pavel", "Fursov", "01", 1, 2, 3));
        students.add(new prac_10.Student("Patric", "Grebenkin", "03", 3, 1, 1));
        students.add(new prac_10.Student("John", "Saveliev", "03", 1, 3, 2));
        students.add(new prac_10.Student("Bob", "Chernichenko", "02", 2, 3, 4));

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.setArray(students);
        System.out.println("BEFORE:");
        System.out.println(sortingStudentsByGPA);

        System.out.println("\nQUICKSORT:");
        sortingStudentsByGPA.quicksort();
        System.out.println(sortingStudentsByGPA);

        System.out.println("\nMERGESORT:");
        sortingStudentsByGPA.setArray(students);
        sortingStudentsByGPA.mergesort();
        System.out.println(sortingStudentsByGPA);

        System.out.println("\nTask_3:");
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("a", "b", "08", 1, 2, 3));
        SortingStudentsByGPA sortingStudentsByGPA1 = new SortingStudentsByGPA();
        sortingStudentsByGPA1.setArray(students1);
        System.out.println(Sorts.mergeSort(students, students1));
    }
}
