package ccamp.blocks;

import java.awt.*;

public abstract class blocks {
    private int posX; //Position X
    private int posY; //Position y
    private int HP;   //HealthPoints
    private Color color; //Farbe

    public blocks(int posX, int posY, int HP, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.HP = HP;
        this.color = color;
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
