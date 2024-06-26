package SpaceGame.src.graphics;

import java.awt.image.BufferedImage;

import SpaceGame.src.math.Vector2D;

public class Animation {
	
	private BufferedImage[] frames;
	private int speed;
	private int index;
	private boolean running;
	private Vector2D position;
	private long time;
	
	public Animation(BufferedImage[] frames, int speed, Vector2D position){
		this.frames = frames;
		this.speed = speed;
		this.position = position;
		index = 0;
		running = true;
	}
	
	public void update(float dt){
		
		time += dt;
		
		if(time > speed){
			time  = 0;
			index ++;
			if(index >= frames.length){
				running = false;
				index = 0;
			}
		}
	}

	public boolean isRunning() {
		return running;
	}

	public Vector2D getPosition() {
		return position;
	}
	
	public BufferedImage getCurrentFrame(){
		return frames[index];
	}
	
	
	
	
	
}