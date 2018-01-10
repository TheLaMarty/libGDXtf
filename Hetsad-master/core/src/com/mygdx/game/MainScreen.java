package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.entities.PlayerCharacter;
import com.mygdx.game.entities.Gun;
import com.mygdx.game.managers.EnemyFactory;
import com.mygdx.game.managers.InputManager;

public class MainScreen implements Screen {

    private InputManager inputManager;
    private Music backgroundMusic;
    Batch batch;
    public static PlayerCharacter playerCharacter;
    EnemyFactory enemyFactory;
    Gun gun;
    Texture background;

    public MainScreen(SpriteBatch batch) {

        this.batch = batch;
        backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("Background.mp3"));
        backgroundMusic.setLooping(true);
        playerCharacter = new PlayerCharacter(new Texture(Gdx.files.internal("player.png")));
        gun = new Gun();
        inputManager = new InputManager(playerCharacter, gun);
        Gdx.input.setInputProcessor(inputManager);
        enemyFactory = new EnemyFactory();
        background = new Texture(Gdx.files.internal("background.png"));
    }

    @Override
    public void show() {
         backgroundMusic.play();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        playerCharacter.update(delta);
        enemyFactory.update(delta);
        gun.update(delta);

        batch.begin();
        batch.draw(background, 0,0);
        playerCharacter.render(batch);
        enemyFactory.render(batch);
        gun.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
}
