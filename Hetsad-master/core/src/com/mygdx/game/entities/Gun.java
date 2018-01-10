package com.mygdx.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.MainScreen;
import com.mygdx.game.SpaceShooter;
import com.mygdx.game.entities.Projectile;
import com.mygdx.game.interfaces.Renderable;
import com.mygdx.game.interfaces.Updatable;

import java.util.ArrayList;

public class Gun implements Renderable, Updatable {

    ArrayList<Projectile> round;
    Projectile projectile;

    public Gun() {
        round = new ArrayList<Projectile>();
    }

    public void update(float delta) {
        for (Projectile projectile : round) {
            projectile.update(delta);
        }
    }

    public void fireShot() {
        projectile = new Projectile(new Texture(Gdx.files.internal("missile.png")), (int) MainScreen.playerCharacter.x);
        round.add(projectile);
        System.out.println("Shot fired and " + round.size() + " bullets in round.");
    }

    public void render(Batch batch) {
        for (Projectile projectile : round) {
            projectile.render(batch);
        }
    }

}

