package ccamp.blocks;

import java.awt.*;

public class Yellow extends Block {

    private int sizeBoost;

    public Yellow(int posX, int posY, int HP, Color color, int sizeBoost, int width, int height, ccamp.blocks.Block.BlockType type) {
        super(posX, posY, HP, color, width, height, type);
        this.sizeBoost = sizeBoost;
    }

    @Override
    public void applyEffect() {
        //GameManager.addPlayerSize(this.sizeBoost);
    }
}
