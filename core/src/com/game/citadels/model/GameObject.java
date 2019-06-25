package com.game.citadels.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Rectangle;

public abstract class GameObject {

    Rectangle bounds; // позиция, ширина, высота
    Sprite object;

    GameObject(Texture texture, int x, int y, int width, int height)
    {
        bounds = new Rectangle(x, y, width, height);
        object = new Sprite(texture);
    }

    // отрисовать
    public void draw(SpriteBatch batch)
    {
        object.setBounds((float) bounds.getX(),
                (float) bounds.getY(),
                (float) bounds.getWidth(),
                (float) bounds.getHeight() );

        object.draw(batch); // отрисовываем объект
    }
}
