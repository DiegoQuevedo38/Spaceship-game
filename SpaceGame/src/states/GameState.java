package SpaceGame.src.states;

import java.awt.Graphics;

import SpaceGame.src.gameObject.Player;
import SpaceGame.src.graphics.Assets;
import SpaceGame.src.math.Vector2D;

public class GameState {
	
	private Player player;
	
	public GameState()
	{
		player = new Player(new Vector2D(400, 300), new Vector2D(), Assets.player);
	}
	
	public void update()
	{
		player.update();
	}
	
	public void draw(Graphics g)
	{
		player.draw(g);
	}
}
