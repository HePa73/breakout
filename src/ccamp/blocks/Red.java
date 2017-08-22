package ccamp.blocks;

import java.awt.*;

public class Red extends Block {

    private int speedHigher;

    public Red(int posX, int posY, int HP, Color farbe, int speedHigher, int width, int height, BlockType type) {
        super(posX, posY, HP, farbe, width, height, type);
        this.speedHigher = speedHigher;
    }

    @Override
    public void applyEffect(){
        //GameManager.addBallSpeed(this.speedHigher);
    }
}
