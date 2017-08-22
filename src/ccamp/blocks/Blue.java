package ccamp.blocks;

import java.awt.*;

public class Blue extends Block{

    private int sizeLower;

    public blue(int posX, int posY, int HP, Color color, int sizeLower) {
        super(posX, posY, HP, color);
        this.sizeLower = sizeLower;
    }

    @Override
    public void applyEffect() {
        //GameManager.removePlayersize(this.sizeLower);
    }
}
