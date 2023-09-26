package prac_6.subprac_10;

import java.util.HashMap;

public class Shop {

    private final HashMap<ComputerName, Computer> computers = new HashMap<>();

    public void addComputer(Computer computer) {
        this.computers.put(computer.getName(), computer);
    }

    public void deleteComputer(Computer computer) {
        this.computers.remove(computer.getName());
    }

    public Computer getComputer(ComputerName name) {
        return this.computers.get(name);
    }
}
