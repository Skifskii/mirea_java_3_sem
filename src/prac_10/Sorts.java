package prac_10;

import java.util.ArrayList;
import java.util.List;

public class Sorts {
    private static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static ArrayList<Student> quicksort(ArrayList<Student> students) {
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
        ArrayList<Student> less = new ArrayList<>();
        ArrayList<Student> greater = new ArrayList<>();
        for (int i = 1; i < students.size(); i++) {
            if (comparator.compare(students.get(i), pivot) > 0) {
                greater.add(students.get(i));
            }
            else {
                less.add(students.get(i));
            }
        }
        ArrayList<Student> ans = new ArrayList<>(quicksort(greater));
        ans.add(pivot);
        ans.addAll(quicksort(less));
        return ans;
    }

    public static ArrayList<Student> mergeSort(ArrayList<Student> students1, ArrayList<Student> students2) {
        ArrayList<Student> ans = new ArrayList<>();
        if (students1.isEmpty() | students2.isEmpty()) {
            ans.addAll(students1);
            ans.addAll(students2);
            return ans;
        }

        students1 = mergeSort(new ArrayList<>(students1.subList(0, (students1.size() / 2))), new ArrayList<>(students1.subList((students1.size() / 2), students1.size())));
        students2 = mergeSort(new ArrayList<>(students2.subList(0, (students2.size() / 2))), new ArrayList<>(students2.subList((students2.size() / 2), students2.size())));
        int pointer1 = 0;
        int pointer2 = 0;
        while (!students1.isEmpty() & !students2.isEmpty()) {
            if (comparator.compare(students1.get(pointer1), students2.get(pointer2)) < 0) {
                ans.add(students1.get(0));
                students1.remove(0);
            }
            else {
                ans.add(students2.get(0));
                students2.remove(0);
            }
        }
        ans.addAll(students1);
        ans.addAll(students2);
        return ans;
    }
}
