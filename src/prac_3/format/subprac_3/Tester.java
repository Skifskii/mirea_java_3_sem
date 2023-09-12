package prac_3.format.subprac_3;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Petrov Petr", 100.566));
        employees.add(new Employee("Ivanov Ivan", 50.2412));
        employees.add(new Employee("Pavlov Pavel", 70.89));

        Report report = new Report();
        report.generateReport(employees);
    }
}
