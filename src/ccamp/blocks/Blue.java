package ccamp.blocks;

import java.awt.*;

public class Blue extends Block{

    private int sizeLower;

    public blue(int posX, int posY, int HP, Color color, int sizeLower, int width, int height, BlockType type) {
        super(posX, posY, HP, color, width, height, type);
        this.sizeLower = sizeLower;
    }

    @Override
    public void applyEffect() {
        //GameManager.removePlayersize(this.sizeLower);
    }
}
