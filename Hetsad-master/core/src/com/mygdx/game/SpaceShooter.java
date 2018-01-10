package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SpaceShooter extends Game {

	SpriteBatch batch;
	MainScreen mainScreen;

	@Override
	public void create () {
		batch = new SpriteBatch();
		mainScreen = new MainScreen(batch);
		setScreen(mainScreen);
	}

	@Override
	public void render () {
		screen.render(Gdx.graphics.getDeltaTime());
	}
	
	@Override
	public void dispose () {}
}
