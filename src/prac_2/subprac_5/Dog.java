package prac_2.subprac_5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageTranslator() {
        return this.age * 8;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name=" + name + ", " +
                "age=" + age +
                "}";
    }
}
