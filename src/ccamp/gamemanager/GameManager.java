package ccamp.gamemanager;

import ccamp.Ball;
import ccamp.Player.Player;
import ccamp.blocks.*;
import ccamp.items.*;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class GameManager {
    Player player;
    List<Ball> ballList;
    List<Block> blockList;
    List<Items> itemList;

    private final Random rand = new Random();


    // Size of the canvas
    private int canvasHeight = 500;
    private final int canvasLength = 700;

    // Center of the screen
    private final int ballSpawnY =  canvasHeight - 20;
    private final int ballSpawnX = canvasLength / 2;

    // Set vars for speed (player and ball)
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
    private int playerSpeed = 3;

    // Player spawn lives are fixed
    private final int playerSpawnLives = 3;

    int score;
    int maxPlayerSpeed;
    int minPlayerSpeed;
    int maxPlayerWidth;
    int minPlayerWidth;

    public GameManager() {
        this.ballList = new LinkedList<>();

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

    public void spawnNewBlock(Block.BlockType blockType, int posX, int posY, int width, int height){
        //Spawns new block with given type and adds it to "blockList"
        // Adjust spawn settings with arguments which should be self explaining
        Block block = null;
        switch (blockType) {
            case BALL_SPEED_UP:
                block = new Red(posX, posY, width, height, Block.BlockType.BALL_SPEED_UP);
                break;
            case BALL_SPEED_DOWN:
                block = new Green(posX, posY, width, height, Block.BlockType.BALL_SPEED_DOWN);
                break;
            case PLAYER_SIZE_UP:
                block = new Yellow(posX, posY, width, height, Block.BlockType.PLAYER_SIZE_UP);
                break;
            case PLAYER_SIZE_DOWN:
                block = new Blue(posX, posY, width, height, Block.BlockType.PLAYER_SIZE_DOWN);
                break;
            default:
                System.out.println("Please use one of the defined blocktypes");
                break;
        }
        blockList.add(block);
    }

    public void spawnNewBall() {
        // Spawns new ball at ballSpawnY and ballSpawnX
        // Returns: Ball object
        Ball ball = new Ball(ballSpawnX, ballSpawnY, ballSX, ballSY, ballRadius, Color.RED);

        ballList.add(ball);
    }

    public void invertPlayerSpeed() {
        // Invert player speed
        playerSpeed = -playerSpeed;
    }

    public void spawnNewRandomItem(int posX, int posY){
        // Spawns new Item of random type at given position
        Items item = null;
        switch (rand.nextInt(4)) {
            case 0:
                item = new DecrementLife();
                break;
            case 1:
                item = new Explosion();
                break;
            case 2:
                item = new IncrementLife();
                break;
            case 3:
                item = new Invert();
                break;
            case 4:
                item = new MoreBalls();
                break;
            default:
                System.out.println("Something bad happened...");
                break;
        }
        itemList.add(item);
    }

    public void constructGame() {
        spawnNewBall();
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public boolean isGameOver() {
        // Return true if player is lower or equal than 0 lives
        if (player.getLives() <= 0){
            return false;
        }
        else{
            return true;
        }
    }
}