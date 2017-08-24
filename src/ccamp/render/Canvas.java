package ccamp.render;

import javax.swing.*;
import java.awt.*;
import java.awt.font.GraphicAttribute;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Canvas extends JComponent {
    private BufferedImage image;

    public Canvas(){
        this.image = new BufferedImage(200, 200,
                BufferedImage.TYPE_BYTE_INDEXED);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 0, 0, null);
    }


    public BufferedImage getImage() {
        return image;
    }
}