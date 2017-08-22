package ccamp.gamemanager;

import ccamp.Ball;
import ccamp.Player.Player;
import ccamp.blocks.Blocks;

import java.util.List;

public class GameManager {
    Player player;
    List<Ball> ballList;
    List<Blocks> blockList;

    int score;
    int maxPlayerSpeed;
    int minPlayerSpeed;
    int maxPlayerWidth;
    int minPlayerWidth;

    public void addBall(Ball ball){
        //Add a ball
    }

    public void decrementLife() {

        player.decrementLives();
    }

    public void constructGame() {
        //If item was hit
    }

    public boolean isGameOver() {
        if (player.getLives() <= 0){
            return false;
        }
        else{
            return true;
        }
    }
}