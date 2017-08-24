package ccamp;

import ccamp.Player.Player;
import ccamp.blocks.Block;
import ccamp.blocks.Yellow;
import ccamp.gamemanager.GameManager;
import ccamp.render.Window;
import ccamp.render.render.Renderer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GameManager manage = new GameManager();
        manage.constructGame();
        Window window = new Window();

        Player player = new Player(Color.BLUE, 10, 100, 20, 3, 600, 100);
        manage.setPlayer(player);

        Block block1 = manage.spawnNewBlock(Block.BlockType.BALL_SPEED_UP, 100, 100, 100, 20);

        Renderer renderer = new Renderer();
        renderer.addRenderable(player);
        renderer.addRenderable(block1);

        renderer.renderScene(window.getCanvas());

    }
}
