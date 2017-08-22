package ccamp.items;

import ccamp.gamemanager.GameManager;

public class LifeDown extends Items {

    @Override
    public void applyEffect(GameManager manage) {
        manage.decrementLife();

    }
}
