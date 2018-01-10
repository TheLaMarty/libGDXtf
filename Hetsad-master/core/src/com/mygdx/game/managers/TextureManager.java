package com.mygdx.game.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureManager {

    public static Texture bullet = new Texture(Gdx.files.internal("missile.png"));
    public static Texture player = new Texture(Gdx.files.internal("player.png"));
    public static Texture enemy = new Texture(Gdx.files.internal("projectile.png"));
}
