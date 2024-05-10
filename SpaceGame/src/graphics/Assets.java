package SpaceGame.src.graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Assets {
	
	public static boolean loaded = false;
	public static float count = 0;
	public static float MAX_COUNT = 57;
	
	
	public static BufferedImage player;
	public static BufferedImage doubleGunPlayer;
	
	// effects
	
	public static BufferedImage speed;
	
	public static BufferedImage[] shieldEffect = new BufferedImage[3];
	
	// explosion
	
	public static BufferedImage[] exp = new BufferedImage[9];
	
	// lasers
	
	public static BufferedImage blueLaser, greenLaser, redLaser;
	
	// Meteors
	
	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];
	
	// ufo
	
	public static BufferedImage ufo;
	
	// numbers
	
	public static BufferedImage[] numbers = new BufferedImage[11];
	
	public static BufferedImage life;
	
	// fonts
	
	public static Font fontBig;
	public static Font fontMed;
	
	public static Clip backgroundMusic, explosion, playerLoose, playerShoot, ufoShoot, powerUp;
	
	// ui
	
	public static BufferedImage blueBtn;
	public static BufferedImage greyBtn;
	
	// power ups
	
	public static BufferedImage orb, doubleScore, doubleGun, fastFire, shield, star;
	
	public static void init()
	{
		player = loadImage("../../res/ships/player.png");
		doubleGunPlayer = loadImage("../../res/ships/doubleGunPlayer.png");
		
		speed = loadImage("../../res/effects/fire08.png");
		
		blueLaser = loadImage("../../res/lasers/laserBlue01.png");
		
		greenLaser = loadImage("../../res/lasers/laserGreen11.png");
		
		redLaser = loadImage("../../res/lasers/laserRed01.png");
		
		ufo = loadImage("../../res/ships/ufo.png");
		
		life = loadImage("../../res/others/life.png");
		
		fontBig = loadFont("../../res/fonts/futureFont.ttf", 42);
		
		fontMed = loadFont("../../res/fonts/futureFont.ttf", 20);
		
		for(int i = 0; i < 3; i++)
			shieldEffect[i] = loadImage("../../res/effects/shield" + (i + 1) +".png"); 
		
		for(int i = 0; i < bigs.length; i++)
			bigs[i] = loadImage("../../res/meteors/big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = loadImage("../../res/meteors/med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = loadImage("../../res/meteors/small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = loadImage("../../res/meteors/tiny"+(i+1)+".png");
		
		for(int i = 0; i < exp.length; i++)
			exp[i] = loadImage("../../res/explosion/"+i+".png");
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = loadImage("../../res/numbers/"+i+".png");
		
		backgroundMusic = loadSound("../../res/sounds/backgroundMusic.wav");
		explosion = loadSound("../../res/sounds/explosion.wav");
		playerLoose = loadSound("../../res/sounds/playerLoose.wav");
		playerShoot = loadSound("../../res/sounds/playerShoot.wav");
		ufoShoot = loadSound("../../res/sounds/ufoShoot.wav");
		powerUp = loadSound("../../res/sounds/powerUp.wav");
		
		greyBtn = loadImage("../../res/ui/grey_button.png");
		blueBtn = loadImage("../../res/ui/blue_button.png");
		
		orb = loadImage("../../res/powers/orb.png");
		doubleScore = loadImage("../../res/powers/doubleScore.png");
		doubleGun = loadImage("../../res/powers/doubleGun.png");
		fastFire = loadImage("../../res/powers/fastFire.png");
		star = loadImage("../../res/powers/star.png");
		shield = loadImage("../../res/powers/shield.png");
		
		// ===========================================================
		
		loaded = true;
		
	}

	public static BufferedImage loadImage(String path) {
		count ++;
		return Loader.ImageLoader(path);
	}
	public static Font loadFont(String path, int size) {
		count ++;
		return Loader.loadFont(path, size);
	}
	public static Clip loadSound(String path) {
		count ++;
		return Loader.loadSound(path);
	}
	
}