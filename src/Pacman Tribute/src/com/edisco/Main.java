package com.edisco;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame{
	
	public Main(String name) {
		super(name);
	}

	public static void main(String[] args) throws SlickException {
			AppGameContainer app = new AppGameContainer(new Main("TEST"));
			app.setDisplayMode(app.getScreenWidth(), app.getScreenHeight(), true);
			app.start();
	}

	@Override
	public boolean closeRequested() {
		return true;
	}

	@Override
	public String getTitle() {
		return null;
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		
	}


}
