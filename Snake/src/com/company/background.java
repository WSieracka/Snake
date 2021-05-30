package com.company;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class background extends JPanel{
    private final int bheight = 10;
    private final int bwidth = 10;
    public void paint(Graphics g){
        g.setColor(Color.RED);
        Font font = new Font("Serif", Font.PLAIN, 24);
        g.setFont(font);
        g.drawString("Snake", 380, 20);
        g.setColor(Color.BLACK);
        for (int wys = 0; wys < 60; wys++){
            int y = 60 + 10 * wys;
            for (int pro = 0; pro < 60; pro++) {
                int x = 100 + 10 * pro;
                g.drawRect(x, y, bwidth, bheight);;
            }
        }

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake");
        frame.getContentPane().add(new background(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}

