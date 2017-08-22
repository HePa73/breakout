package ccamp.blocks;

import java.awt.*;

public class Green extends Block{

    private int speedLower;

    public green(int posX, int posY, int HP, Color color, int speedLower, int width, int height, BlockType type) {
        super(posX, posY, HP, color, width, height, type);
        this.speedLower = speedLower;
    }

    @Override
    public void applyEffect() {
        //GameManager.removeBallSpeed(this.speedLower);

    }
}
