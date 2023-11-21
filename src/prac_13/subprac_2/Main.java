package prac_13.subprac_2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov", "Ivan", "Ivanovich");
        Person person2 = new Person("Pavlov", "Pavel");
        Person person3 = new Person("Petrov");

        System.out.println(person1.getLastnameWitInitials());
        System.out.println(person2.getLastnameWitInitials());
        System.out.println(person3.getLastnameWitInitials());
    }
}
