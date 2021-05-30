package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.border.Border;

public class menu extends JPanel{
    public menu(){
        ImageIcon background = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("resources/images/k.png")));
        ImageIcon tsnake = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("resources/images/q.jpg")));
        JLabel mylabel = new JLabel(background);
        JLabel mylabel2 = new JLabel(tsnake);
        mylabel.setSize(800,600);
        mylabel2.setSize(800,200);
        JFrame frame = new JFrame("Snake Menu");
        frame.add(mylabel);
        String[] o = { "Play!", "Results", "Close" };
        for (int i=0; i<3; i++) {
            int width= 100+200*i;
            JButton b = new JButton(o[i]);
            b.setFont( new Font("Serif", Font.PLAIN, 24));
            b.setVerticalTextPosition(SwingConstants.BOTTOM);
            b.setHorizontalTextPosition(SwingConstants.CENTER);
            b.setBounds(width,300,150,50);
            int finalI = i;
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch(finalI){
                        case 0:
                            JFrame f = new JFrame("Snake Game");
                            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            f.getContentPane().add(new background(), BorderLayout.CENTER);
                            f.setSize(800, 800);
                            f.setLocationRelativeTo(null);
                            f.setVisible(true);
                            break;
                        case 1:
                            JFrame sta = new JFrame("Statystyki");
                            sta.getContentPane().add(new statistics().Paint(), BorderLayout.CENTER);
                            sta.setSize(600, 600);
                            sta.setLocationRelativeTo(null);
                            sta.setVisible(true);
                            /*JFrame a = new JFrame("Gameover");
                            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            a.getContentPane().add(new endgame().ButtonPanel(), BorderLayout.CENTER);
                            a.setSize(800, 600);
                            a.setLocationRelativeTo(null);
                            a.setVisible(true);*/
                            break;
                        case 2:
                            System.exit(0);
                    }
                }
            });
            mylabel.add(b);
        }
        mylabel.add(mylabel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
    public static void main(String[] args) {
        new menu();
        /*JFrame frame = new JFrame("Snake Menu");
        frame.getContentPane().add(new menu(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(1500, 800);
        JPanel picture = new picture();
        frame.add(picture);
        JLabel napis = new JLabel ("Witaj Java!");
        frame.getContentPane().add( napis);
        frame.setVisible( true );
        String[] opis = { "Zagraj!", "Wyniki", "Wyjdź" };
        for (int i=0; i<3; i++) {
            JButton b = new JButton(opis[i]);
            b.setFont( new Font("Arial", Font.BOLD | Font.ITALIC, 30));
            b.setForeground(Color.green);
            b.setVerticalTextPosition(SwingConstants.BOTTOM);
            b.setHorizontalTextPosition(SwingConstants.CENTER);
            b.setBackground(Color.BLACK);
            b.getLocationOnScreen();
            frame.add(b);
        }

        frame.setVisible( true );
        //frame.setVisible(true);
        //JPanel Button = new Button();
        //frame.add(Button);
        frame.setVisible(true);
*/
    }
}
