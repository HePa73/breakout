package ccamp.blocks;

import java.awt.*;

public class Green extends Block{

    private final int speedLower = 5;

    public Green(int posX, int posY, int width, int height, BlockType type) {
        super(posX, posY, width, height,1, Color.GREEN, type);
    }

    @Override
    public void applyEffect() {
        //GameManager.removeBallSpeed(this.speedLower);

    }
}
