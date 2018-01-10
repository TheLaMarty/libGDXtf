package com.mygdx.game.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.MathUtils;
import com.mygdx.game.entities.Enemy;
import com.mygdx.game.interfaces.Renderable;
import com.mygdx.game.interfaces.Updatable;

import java.util.ArrayList;

public class EnemyFactory implements Renderable, Updatable {

    ArrayList<Enemy> enemies;
    Enemy enemy;

    public EnemyFactory() {
        enemies = new ArrayList<Enemy>();
        while (enemies.size() <= 10) {
            enemy = new Enemy();
            enemies.add(enemy);
        }
    }

    @Override
    public void update(float delta) {
        for (Enemy enemy : enemies) {
            enemy.update(delta);
        }
    }

    @Override
    public void render(Batch batch) {
        for (Enemy enemy : enemies) {
            enemy.render(batch);
        }
    }
}
