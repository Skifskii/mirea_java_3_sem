package prac_5.subprac_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Interface extends JPanel {
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;
    private static final int FRAME_DELAY = 100;
    private int frameNumber = 1;

    BufferedImage[] images = new BufferedImage[8];

    public Interface() {
        String path = "animation_frames/000";

        for (int i=1; i<=8; i++) {
            try {
                images[i-1] = ImageIO.read(new File(path + i + ".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));

        Timer timer = new Timer(FRAME_DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameNumber++;
                frameNumber = frameNumber % images.length;

                repaint();
            }
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage currentFrame = images[frameNumber];
        g.drawImage(currentFrame, 0, 0, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Interface());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
