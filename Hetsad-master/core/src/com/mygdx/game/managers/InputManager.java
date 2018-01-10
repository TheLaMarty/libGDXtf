package com.mygdx.game.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.entities.Gun;
import com.mygdx.game.entities.PlayerCharacter;

public class InputManager implements InputProcessor {

    private PlayerCharacter player;
    private Gun gun;

    public InputManager(PlayerCharacter player, Gun gun){
        this.player = player;
        this.gun = gun;
    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.LEFT || keycode == Input.Keys.A){
            player.moveLeft(true);
        }
        if(keycode == Input.Keys.RIGHT || keycode == Input.Keys.D){
            player.moveRight(true);
        }
        if ( Gdx.input.isKeyPressed( Input.Keys.SPACE)) {
            gun.fireShot();
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.LEFT || keycode == Input.Keys.A){
            player.moveLeft(false);
        }

        if (keycode == Input.Keys.RIGHT || keycode == Input.Keys.D ){
            player.moveRight(false);
        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}