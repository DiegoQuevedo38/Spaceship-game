package SpaceGame.src.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener {
    
    public KeyBoard(){

    }

    @Override
    public void keyPressed(KeyEvent e){
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e){

    }

    @Override
    public void keyTyped(KeyEvent e){

    }
}
