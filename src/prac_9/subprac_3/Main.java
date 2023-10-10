package prac_9.subprac_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static final SortingByID comparator = new SortingByID();
    public static List<Student> mergeSort(List<Student> students1, List<Student> students2) {
        List<Student> ans = new ArrayList<>();
        if (students1.isEmpty() | students2.isEmpty()) {
            ans.addAll(students1);
            ans.addAll(students2);
            return ans;
        }

        students1 = mergeSort(students1.subList(0, (students1.size() / 2)), students1.subList((students1.size() / 2), students1.size()));
        students2 = mergeSort(students2.subList(0, (students2.size() / 2)), students2.subList((students2.size() / 2), students2.size()));
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

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(3, "Peter", 5));
        students1.add(new Student(2, "Pavel", 4));
        students1.add(new Student(5, "Patric", 1));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student(4, "John", 3));
        students2.add(new Student(1, "Bob", 2));

        List<Student> ans = mergeSort(students1, students2);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
}
