package ccamp.render;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window extends JFrame {
    ccamp.render.Canvas canvas;
    int width = 1000;
    int height = 700;
    public Window(){
        this.setSize(width, height);
        canvas = new ccamp.render.Canvas(width, height);
        this.add(canvas, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public Canvas getCanvas(){
        return this.canvas;
    }
}
