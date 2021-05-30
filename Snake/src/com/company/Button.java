package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
public class Button extends JPanel{
    public static final int HEIGHT = 150;
    public static final int WIDTH = 150;
    private JButton greenButton;
    private JButton blueButton;
    private JButton redButton;
    public void ButtonPanel() {
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        greenButton.addActionListener((ActionListener) this);
        blueButton.addActionListener((ActionListener) this);
        redButton.addActionListener((ActionListener) this);


        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(greenButton);
        add(blueButton);
        add(redButton);

    }
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == greenButton)
            setBackground(Color.GREEN);

        else if(source == blueButton)
            setBackground(Color.BLUE);

        else if(source == redButton)
            setBackground(Color.RED);
    }
}
