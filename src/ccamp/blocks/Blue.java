package ccamp.blocks;


import java.awt.*;

public class Blue extends Block {

    private final int sizeLower = 20;

    public Blue(int posX, int posY, int width, int height, BlockType type) {
        super(posX, posY, width, height, 2, Color.BLUE, type);
    }

    @Override
    public void applyEffect() {
        //GameManager.removePlayersize(this.sizeLower);
    }
}
