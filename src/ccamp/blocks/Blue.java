package ccamp.blocks;


import java.awt.*;

public class Blue extends Block {

    private int sizeLower;

    public Blue(int posX, int posY, int HP, Color color, int sizeLower, int width, int height, ccamp.blocks.Block.BlockType type) {
        super(posX, posY, HP, color, width, height, type);
        this.sizeLower = sizeLower;
    }

    @Override
    public void applyEffect() {
        //GameManager.removePlayersize(this.sizeLower);
    }
}
