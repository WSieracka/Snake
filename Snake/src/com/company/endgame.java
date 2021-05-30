package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class endgame extends JPanel {
    public Component ButtonPanel() {
        ImageIcon background = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("resources/images/c.jpg")));
        JLabel mylabel1 = new JLabel(background);
        mylabel1.setSize(800,600);
        String[] o = { "Play again!", "Close" };
        for (int i=0; i<2; i++) {
            int width = 180 + 250 * i;
            JButton b = new JButton(o[i]);
            b.setFont(new Font("Serif", Font.PLAIN, 24));
            b.setVerticalTextPosition(SwingConstants.BOTTOM);
            b.setHorizontalTextPosition(SwingConstants.CENTER);
            b.setBounds(width, 450, 200, 50);
            int finalI = i;
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (finalI) {
                        case 0:
                            JFrame f = new JFrame("Snake Game");
                            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            f.getContentPane().add(new background(), BorderLayout.CENTER);
                            f.setSize(800, 800);
                            f.setLocationRelativeTo(null);
                            f.setVisible(true);
                            break;
                        case 1:
                            System.exit(0);
                    }
                }
            });

            mylabel1.add(b);
        }
        return mylabel1;
    }
}
