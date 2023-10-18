package prac_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    ArrayList<Student> iDNumber = new ArrayList<>();

    public void setArray(ArrayList<Student> students) {
        iDNumber = students;
    }

    public void quicksort() {
        iDNumber = Sorts.quicksort(iDNumber);
    }

    public void mergesort() {
        List<Student> firstL = iDNumber.subList(0, (iDNumber.size()) / 2);
        ArrayList<Student> first = new ArrayList<>(firstL);

        List<Student> secondL = iDNumber.subList((iDNumber.size() / 2), iDNumber.size());
        ArrayList<Student> second = new ArrayList<>(secondL);

        iDNumber = Sorts.mergeSort(first, second);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGpa() - o2.getGpa());
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "iDNumber=" + iDNumber +
                '}';
    }
}
