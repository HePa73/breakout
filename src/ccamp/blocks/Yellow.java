package ccamp.blocks;


import java.awt.*;

public class Yellow extends Block{

    private int sizeBoost;

    public yellow(int posX, int posY, int HP, Color color, int sizeBoost) {
        super(posX, posY, HP, color);
        this.sizeBoost = sizeBoost;
    }

    @Override
    public void applyEffect() {
        //GameManager.addPlayerSize(this.sizeBoost);
    }
}
