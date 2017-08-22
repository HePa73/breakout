package ccamp.items;

import ccamp.gamemanager.GameManager;

public abstract class Items {
    // x and y represent the position
    private int x;
    private int y;

    public abstract void applyEffect(GameManager manage);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
