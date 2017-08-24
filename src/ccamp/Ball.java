package ccamp;

import ccamp.render.renderinfo.RectRenderInfo;
import ccamp.render.renderinfo.RenderInfo;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Ball {
    private int x;
    private int y;
    private int sx;
    private int sy;
    private int radius;
    private Color color;

    public Ball(int x, int y, int sx, int sy, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.sx = sx;
        this.sy = sy;
        this.radius = radius;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getSy() {
        return sy;
    }

    public void setSy(int sy) {
        this.sy = sy;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
