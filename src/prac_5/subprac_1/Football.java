package prac_5.subprac_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Football extends JFrame {
    int milan_score = 0;
    int madrid_score = 0;

    JButton btn_milan = new JButton("AC Milan");
    JButton btn_madrid = new JButton("Real Madrid");

    JLabel lbl_result = new JLabel("Result: 0 X 0");
    JLabel lbl_last_scorer = new JLabel("Last Scorer: N/A");
    JLabel lbl_winner = new JLabel("Winner: DRAW");

    JPanel panel = new JPanel(new BorderLayout());
    public Football() {
        super("AC Milan vs. Real Madrid");
        panel.setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 250);

        Font btn_font = new Font("Arial Black", Font.BOLD, 14);

        btn_milan.setPreferredSize(new Dimension(150, 150));
        btn_milan.setBackground(Color.RED);
        btn_milan.setForeground(Color.WHITE);
        btn_milan.setFont(btn_font);
        btn_milan.setBorderPainted(false);
        btn_milan.setFocusPainted(false);
        panel.add(btn_milan, BorderLayout.WEST);

        btn_madrid.setPreferredSize(new Dimension(150, 150));
        btn_madrid.setBackground(Color.BLUE);
        btn_madrid.setForeground(Color.WHITE);
        btn_madrid.setFont(btn_font);
        btn_madrid.setBorderPainted(false);
        btn_madrid.setFocusPainted(false);
        panel.add(btn_madrid, BorderLayout.EAST);

        lbl_result.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_result.setFont(new Font("Times New Roman", Font.BOLD, 54));
        panel.add(lbl_result, BorderLayout.CENTER);

        lbl_last_scorer.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_last_scorer.setPreferredSize(new Dimension(100, 30));
        lbl_last_scorer.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        panel.add(lbl_last_scorer, BorderLayout.SOUTH);

        lbl_winner.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_winner.setPreferredSize(new Dimension(100, 30));
        lbl_winner.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        panel.add(lbl_winner, BorderLayout.NORTH);

        btn_milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan_score++;
                lbl_last_scorer.setText("Last Scorer: AC Milan");
                lbl_result.setText("Result: " + milan_score + " X " + madrid_score);
                if (milan_score > madrid_score) {
                    lbl_winner.setText("Winner: AC Milan");
                }
                else if (milan_score == madrid_score) {
                    lbl_winner.setText("Winner: DRAW");
                }
            }
        });

        btn_madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid_score++;
                lbl_last_scorer.setText("Last Scorer: Real Madrid");
                lbl_result.setText("Result: " + milan_score + " X " + madrid_score);
                if (milan_score < madrid_score) {
                    lbl_winner.setText("Winner: Real Madrid");
                }
                else if (milan_score == madrid_score) {
                    lbl_winner.setText("Winner: DRAW");
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Football();
    }
}
