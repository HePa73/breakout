package ccamp.blocks;

import java.awt.*;

public class red extends blocks {

    private int speedBoost;

    public red(int posX, int posY, int HP, Color farbe, int speedBoost) {
        super(posX, posY, HP, farbe);
        this.speedBoost = speedBoost;
    }

    @Override
    public void applyEffect(){
        //GameManager.addBallSpeed(this.speedBoost);
    }
}
