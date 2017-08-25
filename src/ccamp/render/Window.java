package ccamp.render;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window extends JFrame {
    ccamp.render.Canvas canvas;
    public Window(){
        this.setSize(1000, 1000);
        canvas = new ccamp.render.Canvas(1000, 1000);
        this.add(canvas, BorderLayout.CENTER);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public Canvas getCanvas(){
        return this.canvas;
    }
}
