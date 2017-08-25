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
import java.util.LinkedList;
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
        for (int y = 0; isInCanvasY(y, 400, window); y += 40) {
            for (int x = 0; isInCanvasX(x, 0, window); x += 110) {
                Block block = manage.spawnNewBlock(Block.BlockType.BALL_SPEED_UP, x, y, 100, 20);
                manage.addToBlocklist(block);
            }
        }
    }



    public static void main(String[] args) {
        GameManager manage = new GameManager();

        manage.updateGame();
        Window window = new Window();

        placeBlocks(manage, window);

        Player player = new Player(Color.BLUE, 10, 100, 20, 3, 700, 100);
        manage.setPlayer(player);

        Renderer renderer = new Renderer();
        List<Renderable> renderables = manage.getRenderables();
        Ball ball = new Ball(400,400,15,15,50,Color.RED);
        manage.addBallToList(ball);


        renderer.renderScene(window.getCanvas(), renderables);

        window.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyChar()){
                    case 'a' :
                        if (player.getX()>10){
                            player.setX(player.getX()-10);
                        }
                        break;
                    case'd' :
                        if (player.getX()<window.getWidth()-player.getWidth()){
                            player.setX(player.getX()+10);
                        }
                        break;
                }
            }
        });


        while (true){
            manage.updateGame();
            List<Renderable> RenderList = new LinkedList<>();
            RenderList = manage.getRenderables();
            renderer.renderScene(window.getCanvas(), renderables);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
