package prac_16.subprac_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField textField;
    private JButton button;
    private int randomNumber;
    private int attempts;

    public Main() {
        setTitle("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        textField = new JTextField(10);
        add(textField);

        button = new JButton("Guess");
        button.addActionListener(new GuessListener());
        add(button);

        randomNumber = (int) (Math.random() * 21);
        attempts = 0;
    }

    private class GuessListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int guess = Integer.parseInt(textField.getText());
            attempts++;

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "Верно!");
                System.exit(0);
            }
            else if (attempts == 3) {
                JOptionPane.showMessageDialog(null, "Неверно. Правильный ответ: " + randomNumber + ".");
                System.exit(0);
            }
            else {
                if (guess < randomNumber) {
                    JOptionPane.showMessageDialog(null, "Правильный ответ больше");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Правильный ответ меньше");
                }
            }

            textField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                                       public void run() {
                                           Main game = new Main();
                                           game.setVisible(true);
                                       }
                                   }
        );
    }
}

