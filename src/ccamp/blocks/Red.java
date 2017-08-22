package ccamp.blocks;

import java.awt.*;

public class Red extends Block {

    private int speedHigher;

    public red(int posX, int posY, int HP, Color farbe, int speedBoost) {
        super(posX, posY, HP, farbe);
        this.speedHigher = speedBoost;
    }

    @Override
    public void applyEffect(){
        //GameManager.addBallSpeed(this.speedHigher);
    }
}
