package ccamp.render.renderinfo;


import java.awt.*;

public class RawRenderInfo extends RenderInfo {

    private Color color;

    public RawRenderInfo(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
