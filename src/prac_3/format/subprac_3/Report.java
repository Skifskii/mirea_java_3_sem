package prac_3.format.subprac_3;

import java.util.ArrayList;

public class Report {
    public void generateReport(ArrayList<Employee> employees) {
        System.out.println("Отчет о сотрудниках:");
        for (int i=0; i<employees.size(); i++) {
            System.out.printf("%-1s %50.2f\n", employees.get(i).getFullname(), employees.get(i).getSalary());
        }
    }
}
