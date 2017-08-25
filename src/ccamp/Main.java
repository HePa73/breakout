package ccamp;

import ccamp.Player.Player;
import ccamp.blocks.Block;
import ccamp.blocks.Yellow;
import ccamp.gamemanager.GameManager;
import ccamp.render.Window;
import ccamp.render.render.Renderer;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random rand = new Random();

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
        int width = 100;
        int height = 20;

        for (int y = 0; isInCanvasY(y, 200, window); y += 50) {
            for (int x = 0; isInCanvasX(x, 0, window); x += 110) {
                Block block = null;
                switch (rand.nextInt(3)) {
                    case 0:
                        block = manage.spawnNewBlock(Block.BlockType.BALL_SPEED_UP, x, y, width, height);
                        break;
                    case 1:
                        block = manage.spawnNewBlock(Block.BlockType.BALL_SPEED_DOWN, x, y, width, height);
                        break;
                    case 2:
                        block = manage.spawnNewBlock(Block.BlockType.PLAYER_SIZE_DOWN, x, y, width, height);
                        break;
                    case 3:
                        block = manage.spawnNewBlock(Block.BlockType.PLAYER_SIZE_UP, x, y, width, height);
                        break;
                }
                manage.addToBlocklist(block);
            }
        }
    }



    public static void main(String[] args) {
        GameManager manage = new GameManager();

        Window window = new Window();

        placeBlocks(manage, window);

        Player player = new Player(Color.BLUE, 30, 100, 20, 3, 700, 100);
        manage.setPlayer(player);

        Renderer renderer = new Renderer();

        Ball ball = new Ball(400,640,10, 10,20, Color.GREEN);

        manage.addBallToList(ball);

        window.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                int mousePosition = e.getX();
                player.setX(mousePosition);
            }
        });

        while (true){
            manage.updateGame(window);
            List<Renderable> RenderList = new LinkedList<>();
            RenderList = manage.getRenderables();
            renderer.renderScene(window.getCanvas(), RenderList);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
