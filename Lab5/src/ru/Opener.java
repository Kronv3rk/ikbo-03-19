package ru;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Opener extends JComponent {
    int imageWidth;
    int imageHeight;
    private Image image;
    Opener(String path){
        try {
            image = ImageIO.read(new File(path));
            imageWidth = image.getWidth(this);
            imageHeight = image.getHeight(this);
        } catch (IOException e) {}
    }
    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
