package ccamp.Player;

import ccamp.Renderable;
import ccamp.render.renderinfo.RectRenderInfo;
import ccamp.render.renderinfo.RenderInfo;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Player implements Renderable{
    private Color color;
    private int speed;
    private int width;
    private int height;
    private int lives;
    private int y;
    private int x;

    public Player(Color color, int speed,int width, int height, int lives, int y, int x) {
        this.color = color;
        this.speed = speed;
        this.width = width;
        this.height = height;
        this.lives = lives;
        this.y = y;
        this.x = x;
    }

    public void decrementLives() {
        if (this.lives != 0){
            this.lives--;
        }

    }

    public void incrementLife () {
        setLives(getLives() + 1);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public List<RenderInfo> getRenderInfo() {
        List<RenderInfo> renderInfos = new LinkedList<>();
        RectRenderInfo rectRenderInfo = new RectRenderInfo(this.x, this.y, this.color, this.width, this.height);
        renderInfos.add(rectRenderInfo);
        return renderInfos;
    }
}
