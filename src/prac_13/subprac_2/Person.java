package prac_13.subprac_2;

public class Person {
    private String name = "";
    private String lastname = "";
    private String surname = "";

    public Person(String lastname, String name, String surname) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
    }

    public Person(String lastname, String name) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String lastname) {
        this.lastname = lastname;
    }

    public String getLastnameWitInitials() {
        String answer = lastname;
        if (!name.isEmpty()) {
            answer += (" " + name.charAt(0) + ".");
        }
        if (!surname.isEmpty()) {
            answer += (surname.charAt(0) + ".");
        }
        return answer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
