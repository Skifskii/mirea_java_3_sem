package prac_9.subprac_3;

import java.util.Comparator;

public class SortingByID implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA() - o2.getGPA();
    }
}
