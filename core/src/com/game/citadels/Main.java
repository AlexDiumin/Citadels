package com.game.citadels;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.game.citadels.view.GameScreen;

public class Main extends Game {

	private Screen gameScreen;

	@Override // вызывается при запуске
	public void create()
	{
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}
