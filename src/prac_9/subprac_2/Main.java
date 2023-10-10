package prac_9.subprac_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static List<Student> quicksort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }
        if (students.size() == 2) {
            if (comparator.compare(students.get(0), students.get(1)) < 0) {
                Student temp = students.get(0);
                students.set(0, students.get(1));
                students.set(1, temp);
            }
            return students;
        }
        Student pivot = students.get(0);
        List<Student> less = new ArrayList<>();
        List<Student> greater = new ArrayList<>();
        for (int i = 1; i < students.size(); i++) {
            if (comparator.compare(students.get(i), pivot) > 0) {
                greater.add(students.get(i));
            }
            else {
                less.add(students.get(i));
            }
        }
        List<Student> ans = new ArrayList<>(quicksort(greater));
        ans.add(pivot);
        ans.addAll(quicksort(less));
        return ans;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Peter", 5));
        students.add(new Student(2, "Pavel", 4));
        students.add(new Student(5, "Patric", 1));
        students.add(new Student(4, "John", 3));
        students.add(new Student(1, "Bob", 2));

        students = quicksort(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
