package SpaceGame.src.gameObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import SpaceGame.src.input.KeyBoard;
import SpaceGame.src.math.Vector2D;

public class Player extends GameObject{
    public Player (Vector2D position, BufferedImage texture){
        super(position, texture);
    }

    @Override
    public void update(){
        if(KeyBoard.RIGHT){
            position.setX(position.getX() + 4);
        } else if (KeyBoard.LEFT){
            position.setX(position.getX() - 4);
        } else if(KeyBoard.UP){
            position.setY(position.getY() - 4);
        } else position.setY(position.getY() + 0.5);
    }

    @Override
    public void draw(Graphics g){
        g.drawImage(texture, (int)position.getX(),  (int)position.getY(), null);
    }
}
