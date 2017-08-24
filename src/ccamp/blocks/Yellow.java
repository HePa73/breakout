package ccamp.blocks;

import java.awt.*;

public class Yellow extends Block {

    private final int sizeBoost = 5;

    public Yellow(int posX, int posY, int width, int height, ccamp.blocks.Block.BlockType type) {
        super(posX, posY, width, height, 1, Color.YELLOW, type);
    }

    @Override
    public void applyEffect() {
        //GameManager.addPlayerSize(this.sizeBoost);
    }
}
