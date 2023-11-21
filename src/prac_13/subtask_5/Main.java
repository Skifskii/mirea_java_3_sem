package prac_13.subtask_5;

public class Main {
    public static String transformNumber(String oldNumber) {
        if (oldNumber.charAt(0) == '8') {
            oldNumber = "+7" + oldNumber.substring(1);
        }
        String newNumber = "+" + oldNumber.charAt(1);
        newNumber += oldNumber.substring(2, 5) + '-' + oldNumber.substring(5,8) + '-' + oldNumber.substring(8);
        return newNumber;
    }

    public static void main(String[] args) {
        System.out.println(transformNumber("89175655655"));
    }
}
