package com.game.citadels.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.game.citadels.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		/*LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Main(), config);*/
		new Main().create(); // ???
	}
}
