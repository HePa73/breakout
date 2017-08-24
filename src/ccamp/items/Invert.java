package ccamp.items;

import ccamp.gamemanager.GameManager;

public class Invert extends Items {
    private int timeout = 10;

    @Override
    public void applyEffect(GameManager manage) {
        manage.invertPlayerSpeed();
    }
}
