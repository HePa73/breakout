import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window extends JFrame {
    Canvas c;
    public Window(){
        this.setSize(1000, 1000);
        c = new Canvas();
        this.add(c, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public Canvas getCanvas(){
        return this.c;
    }
}
