package com.game.citadels.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.citadels.model.Assassin;

public class GameScreen implements Screen {

    private Texture assassinTexture; // текстура (фото)
    private SpriteBatch batch;       // область отрисовки
    private Assassin assassin;

    // вызывается когда мы в игре переключаемся на этот экран
    @Override
    public void show()
    {
        batch = new SpriteBatch();
        assassinTexture = new Texture(Gdx.files.internal("h1.png"));
        assassin = new Assassin(assassinTexture, 10, 10, assassinTexture.getWidth()/5, assassinTexture.getHeight()/5);
    }

    @Override // рисование/отрисовка (вызывается циклически)
    public void render(float delta) // delta - время между кадрами
    {
        update(); // обновление игровой логики

        // очистка экрана
        Gdx.gl.glClearColor(0.9f, 0.9f, 0.9f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();        // начать отрисовку
        assassin.draw(batch); // отрисовка
        batch.end();          // закончить отрисовку
    }

    // ???
    public void update() // обновление игровой логики
    {

    }

    @Override // вызывается при изменение размеров экрана
    public void resize(int width, int height)
    {

    }

    @Override // вызывается при сворачивании игры
    public void pause()
    {

    }

    @Override // вызывается при разворачивании игры
    public void resume()
    {

    }

    @Override // вызывается при переходе (с меню) в игру
    public void hide()
    {

    }

    // вызывается когда закрываем игру. Уничтожение всех ресурсов
    @Override
    public void dispose()
    {
        assassinTexture.dispose();
        batch.dispose();
    }
}
