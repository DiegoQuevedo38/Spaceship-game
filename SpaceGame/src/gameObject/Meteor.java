package SpaceGame.src.gameObject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import SpaceGame.src.math.Vector2D;
import SpaceGame.src.states.GameState;

public class Meteor extends MovingObject{

	private Size size;
	
	public Meteor(Vector2D position, Vector2D speed, double maxVel, BufferedImage texture, GameState gameState, Size size) {
		super(position, speed, maxVel, texture, gameState);
		this.size = size;
		this.speed = speed.scale(maxVel);
		
	}

	@Override
	public void update() {
		position = position.add(speed);
		
		if(position.getX() > Constants.WIDTH)
			position.setX(-width);
		if(position.getY() > Constants.HEIGHT)
			position.setY(-height);
		
		if(position.getX() < -width)
			position.setX(Constants.WIDTH);
		if(position.getY() < -height)
			position.setY(Constants.HEIGHT);
		
		angle += Constants.DELTAANGLE/2;
		
	}
	
	@Override
	public void Destroy(){
		gameState.divideMeteor(this);
		gameState.addScore(Constants.METEOR_SCORE, position);
		super.Destroy();
	}
	
	
	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		
		at = AffineTransform.getTranslateInstance(position.getX(), position.getY());
		
		at.rotate(angle, width/2, height/2);
		
		g2d.drawImage(texture, at, null);
	}

	public Size getSize(){
		return size;
	}
	
	
}