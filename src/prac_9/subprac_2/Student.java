package prac_9.subprac_2;

public class Student {
    private final int iDNumber;
    private final String name;
    private final int GPA;


    public Student(int iDNumber, String name, int GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
