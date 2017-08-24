package ccamp.gamemanager;

import ccamp.Ball;
import ccamp.Player.Player;
import ccamp.blocks.Block;

import java.awt.*;
import java.util.List;

public class GameManager {
    Player player;
    List<Ball> ballList;
    List<Block> blockList;

    // Size of the canvas
    private int canvasHeight = 500;
    private final int canvasLength = 700;

    // Center of the screen
    private final int ballSpawnY =  canvasHeight - 20;
    private final int ballSpawnX = canvasLength / 2;

    // Set vars for speed
    int ballSX;
    int ballSY;

    // Ball radius
    int ballRadius;

    // Player's geometric
    private final int playerHeight = 10;
    private final int playerSpawnLength = 50;

    //Player spawn position and spawn speed
    private final int playerSpawnX = canvasLength / 2;
    private final int playerSpawnY = canvasHeight - 10;
    private final int playerSpawnSpeed = 3;

    // Player spawn lives are fixed
    private final int playerSpawnLives = 3;

    int score;
    int maxPlayerSpeed;
    int minPlayerSpeed;
    int maxPlayerWidth;
    int minPlayerWidth;


    public void addBall(Ball ball){
        //Add a ball
    }

    public void decrementLife() {
        // Decrement life if player is not already dead
        if (!isGameOver()) {
            player.decrementLives();
        }
    }
    public void incrementLife () {
        player.incrementLife();
    }

    public Ball spawnNewBall() {
        // Spawns new ball at ballSpawnY and ballSpawnX
        // Returns: Ball object
        Ball ball = new Ball(ballSpawnX, ballSpawnY, ballSX, ballSY, ballRadius, Color.RED);

        return ball;
    }

    public Player spawnPlayer() {
        // Spawns player at playerSpawnX and playerSpawnY
        // Player is blue, has playerSpawnSpeed, playerSpawnLength, playerSpawnHeight and playerSpawnLives
        Player player = new Player(Color.BLUE, playerSpawnSpeed, playerSpawnLength, playerHeight, playerSpawnLives, playerSpawnY, playerSpawnX);

        return player;
    }

    public void constructGame() {
        ballList.add(spawnNewBall());
        player = spawnPlayer();
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