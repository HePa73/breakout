package ccamp.blocks;

import java.awt.*;

public class Red extends Block {

    private final int speedHigher = 5;

    public Red(int posX, int posY, int width, int height, BlockType type) {
        super(posX, posY,width, height, 3, Color.RED, type);
    }

    @Override
    public void applyEffect(){
        //GameManager.addBallSpeed(this.speedHigher);
    }
}
