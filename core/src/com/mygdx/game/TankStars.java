package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.screens.*;

public class TankStars extends Game {
	public static final String TITLE="TankStars";
	public static final float VERSION = 0.1f;
	public static final int V_WIDTH = 1800;
	public static final int V_HEIGHT = 900;

	public OrthographicCamera camera;
	public SpriteBatch batch;
	public BitmapFont font;

	public AssetManager assets;
	public LoadingScreen loadingScreen;
	public SplashScreen splashScreen;
	public MainMenuScreen mainMenuScreen;
	public Tanks tanks;
	public PlayGround playGround;
	public Options options;
	public Pause pause;
	public Resume resumee;

	@Override
	public void create () {
		assets = new AssetManager();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, V_WIDTH, V_HEIGHT);
		batch = new SpriteBatch();

		font = new BitmapFont();
		font.setColor(Color.BLACK);

		loadingScreen=new LoadingScreen(this);
		splashScreen=new SplashScreen(this);
		mainMenuScreen= new MainMenuScreen(this);
		tanks= new Tanks(this);
		playGround=new PlayGround(this);
		options=new Options(this);
		pause = new Pause(this);
		resumee=new Resume(this);
		this.setScreen(loadingScreen);
	}

	@Override
	public void render () {
		super.render();
		if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)){
			Gdx.app.exit();
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		assets.dispose();
		loadingScreen.dispose();
		splashScreen.dispose();
		mainMenuScreen.dispose();
		tanks.dispose();
		playGround.dispose();
		options.dispose();
		pause.dispose();
		resumee.dispose();
	}
}
