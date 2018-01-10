package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.interfaces.Renderable;
import com.mygdx.game.interfaces.Updatable;


public class Projectile implements Renderable, Updatable {

    private int speed;
    public float x;
    public float y;
    Texture img;
    Rectangle collision;

    public Projectile(Texture img, int x) {
        this.img = img;
        this.x = x;
        speed = 200;
        collision = new Rectangle();
    }

    public void update(float delta) {
        y = y + speed * delta;
    }

    @Override
    public void render(Batch batch) {
            batch.draw(img, x, y);
        }
    }