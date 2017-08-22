package ccamp.blocks;

import java.awt.*;

public class Green extends Block{

    private int speedLower;

    public green(int posX, int posY, int HP, Color color, int speedLower) {
        super(posX, posY, HP, color);
        this.speedLower = speedLower;
    }

    @Override
    public void applyEffect() {
        //GameManager.removeBallSpeed(this.speedLower);

    }
}
