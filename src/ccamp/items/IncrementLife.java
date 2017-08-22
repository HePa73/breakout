package ccamp.items;

import ccamp.gamemanager.GameManager;

public class IncrementLife extends Items {
    // Create constant for sprites

    @Override
    public void applyEffect(GameManager manage) {
        //Add 1 Live to player
        manage.incrementLife();
    }
}
