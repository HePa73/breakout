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

        Renderer renderer = new Renderer();
        renderer.addRenderable(player);

        renderer.renderScene(window.getCanvas());

    }
}
