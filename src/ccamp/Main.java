package ccamp;

import ccamp.Player.Player;
import ccamp.blocks.Block;
import ccamp.blocks.Yellow;
import ccamp.gamemanager.GameManager;
import ccamp.render.Window;
import ccamp.render.render.Renderer;

import java.awt.*;
import java.util.List;

public class Main {

    public static Boolean isInCanvasX(int x, int difference, Window window) {
        if (x <= (window.getWidth() - difference)){
            return true;
        }
        else{
            return false;
        }
    }

    public static Boolean isInCanvasY(int y, int difference, Window window){
        if (y <= (window.getHeight() - difference)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void placeBlocks(GameManager manage, Window window) {
        for(int y = 0; isInCanvasY(y, 400, window); y += 40){
            for(int x = 0; isInCanvasX(x, 0,window); x += 110) {
                Block block = manage.spawnNewBlock(Block.BlockType.BALL_SPEED_UP, x, y, 100, 20 );
                manage.addToBlocklist(block);
            }
        }
    }

    public static void addListToRender(List<Block> blockList, Renderer renderer) {
        for (Block block: blockList){
            renderer.addRenderable(block);
        }
    }

    public static void main(String[] args) {
        GameManager manage = new GameManager();
        manage.constructGame();
        Window window = new Window();

        placeBlocks(manage, window);

        Player player = new Player(Color.BLUE, 10, 100, 20, 3, 700, 100);
        manage.setPlayer(player);

        Renderer renderer = new Renderer();
        renderer.addRenderable(player);
        addListToRender(manage.getBlockList(), renderer);

        renderer.renderScene(window.getCanvas());

    }
}
