package prac_9.subprac_1;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {new Student(3, "Peter"),
                                            new Student(2, "Pavel"),
                                            new Student(5, "Patric"),
                                            new Student(4, "John"),
                                            new Student(1, "Bob")};
        Student[] sortedStudents = new Student[students.length];
        for (Student student : students) {
            for (int j = 0; j < students.length; j++) {
                if (sortedStudents[j] == null) {
                    sortedStudents[j] = student;
                    break;
                }
                if (student.getiDNumber() <= sortedStudents[j].getiDNumber()) {
                    for (int pointer = students.length - 2; pointer >= j; pointer--) {
                        sortedStudents[pointer + 1] = sortedStudents[pointer];
                    }
                    sortedStudents[j] = student;
                    break;
                }
            }
        }
        for (Student sortedStudent : sortedStudents) {
            System.out.println(sortedStudent);
        }
    }
}
