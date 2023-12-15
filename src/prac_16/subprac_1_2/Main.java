package prac_16.subprac_1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel centerLabel;
    private JLabel westLabel;
    private JLabel southLabel;
    private JLabel northLabel;
    private JLabel eastLabel;
    private int randomNumber;
    private int attempts;

    public Main() {
        setTitle("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        textField = new JTextField(10);
        add(textField);

        button = new JButton("Guess");
        button.addActionListener(new GuessListener());
        add(button);

        randomNumber = (int) (Math.random() * 21);
        attempts = 0;

        centerLabel = new JLabel("CENTER");
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        centerLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centerLabel.addMouseListener(new MouseListener("Добро пожаловать в ЦАО"));
        centerLabel.add(textField);
        centerLabel.add(button);
        add(centerLabel, BorderLayout.CENTER);

        westLabel = new JLabel("WEST");
        westLabel.setHorizontalAlignment(JLabel.CENTER);
        westLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        westLabel.addMouseListener(new MouseListener("Добро пожаловать в ЗАО"));
        add(westLabel, BorderLayout.WEST);

        southLabel = new JLabel("SOUTH");
        southLabel.setHorizontalAlignment(JLabel.CENTER);
        southLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        southLabel.addMouseListener(new MouseListener("Добро пожаловать в ЮАО"));
        add(southLabel, BorderLayout.SOUTH);

        northLabel = new JLabel("NORTH");
        northLabel.setHorizontalAlignment(JLabel.CENTER);
        northLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        northLabel.addMouseListener(new MouseListener("Добро пожаловать в САО"));
        add(northLabel, BorderLayout.NORTH);

        eastLabel = new JLabel("EAST");
        eastLabel.setHorizontalAlignment(JLabel.CENTER);
        eastLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        eastLabel.addMouseListener(new MouseListener("Добро пожаловать в ВАО"));
        add(eastLabel, BorderLayout.EAST);
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

    private class MouseListener extends MouseAdapter {
        private String message;

        public MouseListener(String message) {
            this.message = message;
        }

        public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(null, message);
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

