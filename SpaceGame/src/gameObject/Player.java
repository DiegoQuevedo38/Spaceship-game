package SpaceGame.src.gameObject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import SpaceGame.src.graphics.Assets;
import SpaceGame.src.input.KeyBoard;
import SpaceGame.src.math.Vector2D;

public class Player extends MovingObject{
	
	private Vector2D heading;	
	private Vector2D acceleration;
	private final double ACC = 0.2;
	private final double DELTAANGLE = 0.1;
	
	public Player(Vector2D position, Vector2D speed, double maxVel, BufferedImage texture) {
		super(position, speed, maxVel, texture);
		heading = new Vector2D(0, 1);
		acceleration = new Vector2D();
	}
	
	@Override
	public void update() 
	{
		if(KeyBoard.RIGHT)
			angle += DELTAANGLE;
		if(KeyBoard.LEFT)
			angle -= DELTAANGLE;
		
		if(KeyBoard.UP)
		{
			acceleration = heading.scale(ACC);
		}else
		{
			if(speed.getMagnitude() != 0)
				acceleration = (speed.scale(-1).normalize()).scale(ACC/2);
		}
		
		speed = speed.add(acceleration);
		
		speed.limit(maxVel);
		
		heading = heading.setDirection(angle - Math.PI/2);
		
		position = position.add(speed);
		
		
	}
	
	
	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		
		at = AffineTransform.getTranslateInstance(position.getX(), position.getY());
		
		at.rotate(angle, Assets.player.getWidth()/2, Assets.player.getHeight()/2);
		
		g2d.drawImage(Assets.player, at, null);
		
		
	}
}
