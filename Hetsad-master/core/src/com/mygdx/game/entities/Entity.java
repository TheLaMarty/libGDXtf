package com.mygdx.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import org.w3c.dom.css.Rect;

public abstract class Entity {

    protected Texture texture;
    protected Vector2 position;

    public Entity(Texture texture, Vector2 position){
        this.texture = texture;
        this.position = position;
    }

    public abstract void update();

    public void render(Batch batch){
        batch.draw(texture, position.x, position.y);
    }

    public Rectangle getBounds(){
        return new Rectangle(position.x, position.y, texture.getWidth(), texture.getHeight());
    }
}
