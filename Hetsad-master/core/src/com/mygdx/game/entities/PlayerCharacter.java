package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.Pool;
import com.mygdx.game.interfaces.Renderable;
import com.mygdx.game.interfaces.Updatable;

public class PlayerCharacter implements Renderable, Updatable, Pool.Poolable {

    private boolean left;
    private boolean right;
    public Texture img;
    private int speed;
    public float x;
    public float y;

    public PlayerCharacter(Texture img) {

        this.img = img;
        speed = 200;
        x = 0;
        y = 0;
    }

    @Override
    public void update(float delta) {

        if (left) {
            x -= speed * delta;
            if (x <= 0) {
                x = 0;
            }
        }

        if (right) {
            x += speed * delta;
        }
    }

    @Override
    public void render(Batch batch) {

        batch.draw(img, x, y);
    }

    public void moveLeft(boolean left) {
        this.left = left;
    }

    public void moveRight(boolean right) {
        this.right = right;
    }

    @Override
    public void reset() {
    }
}


