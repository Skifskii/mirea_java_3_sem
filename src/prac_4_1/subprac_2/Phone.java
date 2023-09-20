package prac_4_1.subprac_2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + number + " (" + name + ")");
    }

    public void sendMessage(int ... numbers) {
        for (int i=0; i<numbers.length; i++) {
            System.out.println("Сообщение отправлено: " + numbers[i]);
        }
    }
}
