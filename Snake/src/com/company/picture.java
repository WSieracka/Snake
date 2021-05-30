package com.company;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class picture extends JPanel{

    private BufferedImage image;

    public picture() {
        try {
            image = ImageIO.read(Objects.requireNonNull(picture.class.getResource("resources/images/k.png")));
        } catch (IOException e) {
            System.err.println("Blad obrazka");
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics ob) {
        super.paintComponent(ob);
        ob.drawImage(image, 0, 0, null);
    }


}
