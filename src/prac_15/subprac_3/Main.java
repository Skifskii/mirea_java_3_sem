package prac_15.subprac_3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int width = 500, height = 170;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);

        // File
        JMenu file = new JMenu("Файл");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");
        file.add(save); file.add(exit);

        // Edit
        JMenu edit = new JMenu("Правка");
        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");
        edit.add(copy); edit.add(cut); edit.add(paste);

        // Help
        JMenu help = new JMenu("Справка");

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file); menuBar.add(edit); menuBar.add(help);
        frame.setJMenuBar(menuBar);

        // Grid Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,2, 10, 10));
        panel.setSize(width, 40);

        // Buttons
        Button button1 = new Button("Кнопка 1");
        Button button2 = new Button("Кнопка 2");

        panel.add(button1); panel.add(button2);

        frame.add(panel);

        JTextField text = new JTextField("Текстовое поле");
        text.setHorizontalAlignment(JTextField.CENTER);
        frame.add(text);

        frame.setVisible(true);
    }
}

