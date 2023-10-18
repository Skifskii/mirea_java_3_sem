package prac_10;

public class Student {
    private String name;
    private String lastname;
    private String spec;
    private int year;
    private int group;
    private int gpa;

    public Student(String name, String lastname, String spec, int year, int group, int gpa) {
        this.name = name;
        this.lastname = lastname;
        this.spec = spec;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSpec() {
        return spec;
    }

    public int getYear() {
        return year;
    }

    public int getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", spec='" + spec + '\'' +
                ", year=" + year +
                ", group=" + group +
                ", gpa=" + gpa +
                '}';
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
