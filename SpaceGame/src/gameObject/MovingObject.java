package SpaceGame.src.gameObject;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import SpaceGame.src.math.Vector2D;

public abstract class MovingObject extends GameObject{
    
    protected Vector2D speed;
	protected AffineTransform at;
	protected double angle;
	protected double maxVel;
	
	public MovingObject(Vector2D position, Vector2D speed, double maxVel, BufferedImage texture) {
		super(position, texture);
		this.speed = speed;
		this.maxVel = maxVel;
		angle = 0;
		
	}
}
