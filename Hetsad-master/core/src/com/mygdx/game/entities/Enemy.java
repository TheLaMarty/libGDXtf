package com.mygdx.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.interfaces.Renderable;
import com.mygdx.game.interfaces.Updatable;

public class Enemy implements Renderable, Updatable {

    private int speed;
    public float x;
    public float y;
    Texture img;
    Rectangle collision;


    public Enemy() {
        this.img = new Texture(Gdx.files.internal("enemy1.png"));
        this.x = MathUtils.random(0, 400 - 64);
        y = MathUtils.random(Gdx.graphics.getHeight(), Gdx.graphics.getHeight()+800);
        speed = 200;
        collision = new Rectangle();
    }

    @Override
    public void update(float delta) {
        y = y - speed * delta;
        if (y < -60) {
            y = MathUtils.random(Gdx.graphics.getHeight(),Gdx.graphics.getHeight()+200);
            x = MathUtils.random(0, Gdx.graphics.getWidth() - img.getWidth());
        }
    }

    @Override
    public void render(Batch batch) {
        batch.draw(img, x, y);
    }

/*    public boolean CheckCollision(Projectile projectile){
        if(collision.overlaps(projectile.collision));
        return true;
    }*/
}
