package prac_2.subprac_4;

import java.util.HashMap;

public class Shop {

    private HashMap<String, Computer> computers = new HashMap<>();

    public void addComputer(Computer computer) {
        this.computers.put(computer.getName(), computer);
    }

    public void deleteComputer(Computer computer) {
        this.computers.remove(computer.getName());
    }

    public Computer getComputer(String name) {
        return this.computers.get(name);
    }
}
