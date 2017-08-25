package ccamp;

import ccamp.Player.Player;
import ccamp.gamemanager.GameManager;
import ccamp.render.Window;
import ccamp.render.render.Renderer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GameManager manage = new GameManager();
        manage.constructGame();
        Window window = new Window();

        Player player = new Player(Color.BLUE, 10, 100, 20, 3, 100, 100);
        manage.setPlayer(player);

        Ball ball = new Ball(400,400,5,5,50,Color.RED);

        Renderer renderer = new Renderer();
        renderer.addRenderable(player);
        renderer.addRenderable(ball);


        renderer.renderScene(window.getCanvas());

    }
}
