package ccamp.gamemanager;

import ccamp.Ball;
import ccamp.Player.Player;
import ccamp.Renderable;
import ccamp.blocks.*;
import ccamp.items.*;

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
        this.blockList = new LinkedList<>();
        List <Block> blocklist;

    }

    public void addToBlocklist(Block block) {
        blockList.add(block);
    }

    public List<Block> getBlockList() {
        return blockList;
    }

    public List getBallList() {
        return ballList;
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

    public Block spawnNewBlock(Block.BlockType blockType, int posX, int posY, int width, int height){
        //Spawns new block with given type and adds it to "blockList"
        // Adjust spawn settings with arguments which should be self explaining
        Block block = null;
        switch (blockType) {
            case BALL_SPEED_UP:
                block = new Red(posX, posY, width, height, Block.BlockType.BALL_SPEED_UP);
                return block;
            case BALL_SPEED_DOWN:
                block = new Green(posX, posY, width, height, Block.BlockType.BALL_SPEED_DOWN);
                return block;
            case PLAYER_SIZE_UP:
                block = new Yellow(posX, posY, width, height, Block.BlockType.PLAYER_SIZE_UP);
                return block;
            case PLAYER_SIZE_DOWN:
                block = new Blue(posX, posY, width, height, Block.BlockType.PLAYER_SIZE_DOWN);
                return block;
            default:
                System.out.println("Please use one of the defined blocktypes");
                return block;
        }
    }

    public void addBallToList(Ball ball) {
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

    public boolean isBlockCollision(int x1, int y1, int x2, int y2, Block block, Ball ball){
        if (x1 < x2 + block.getWidth() && x2 + ball.getRadius()*2 > x2 && y1 < y2 + block.getWidth() && y1 + ball.getRadius()*2 > y2){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPlayerCollision(int x1, int y1, int x2, int y2, Player player, Ball ball) {
        if (x1 < x2 + player.getWidth() && x2 + ball.getRadius() * 2 > x2 && y1 < y2 + player.getWidth() && y1 + player.getWidth() > y2) {
            return true;
        } else {
            return false;
        }
    }

    public void updateGame() {
        for (Ball ball: ballList){

        }
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

    public List<Renderable> getRenderables(){
        List<Renderable> renderables = new LinkedList<>();
        renderables.add(player);
        renderables.addAll(ballList);
        renderables.addAll(blockList);
        return renderables;
    }
}