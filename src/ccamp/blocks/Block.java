package ccamp.blocks;

import java.awt.*;

public abstract class Block {
    public enum BlockType{
        BALL_SPEED_UP, BALL_SPEED_DOWN, PLAYER_SIZE_UP, PLAYER_SIZE_DOWN;
    }

    // Set vars

    private int posX; //Position X
    private int posY; //Position y
    private int HP;   //HealthPoints
    private Color color; //Farbe
    private int width; //Breite
    private int height; //Höhe
    private BlockType type; //Blockart

    public Block(int posX, int posY, int width, int height, int HP, Color color,  BlockType type) {
        this.posX = posX;
        this.posY = posY;
        this.HP = HP;
        this.color = color;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public abstract void applyEffect(); //Effekt aktiveren

    //Getter und Setter
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
