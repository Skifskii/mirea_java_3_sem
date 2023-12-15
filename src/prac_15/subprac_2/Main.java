package prac_15.subprac_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame {
    private JComboBox<String> menuComboBox;
    private JTextArea infoTextArea;

    public Main() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

//        String[] menuItems = {"Россия", "США", "Китай", "Япония", "Германия"};
        String[] menuItems = {"Russia", "Australia", "China", "England"};
        menuComboBox = new JComboBox<>(menuItems);
        menuComboBox.addActionListener(new MenuComboBoxListener());

        infoTextArea = new JTextArea();
        infoTextArea.setEditable(false);

        setLayout(new BorderLayout());
        add(menuComboBox, BorderLayout.NORTH);
        add(new JScrollPane(infoTextArea), BorderLayout.CENTER);
    }

    private class MenuComboBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedCountry = (String) menuComboBox.getSelectedItem();
            String countryInfo = "";

            switch (selectedCountry) {
                case "Russia":
                    countryInfo = "Росси́я, или Росси́йская Федера́ция (сокр. РФ), — государство в Восточной Европе и Северной Азии";
                    break;
                case "Australia":
                    countryInfo = "Австралийский Союз — государство в Южном полушарии площадью 7 692 024 км²";
                    break;
                case "China":
                    countryInfo = "Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом";
                    break;
                case "England":
                    countryInfo = "Англия, родина Шекспира и группы The Beatles, входит в состав Соединенного Королевства Великобритании и Северной Ирландии";
                    break;
            }

            infoTextArea.setText(countryInfo);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}


