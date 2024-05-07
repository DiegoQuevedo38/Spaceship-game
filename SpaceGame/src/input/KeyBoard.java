package SpaceGame.src.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener {
    
    private boolean[] keys = new boolean[256];

    public static boolean UP, LEFT, RIGHT;

    public KeyBoard(){
        UP = false;
        LEFT = false;
        RIGHT = false;
    }

    public void update (){
        UP = keys[KeyEvent.VK_UP];
        RIGHT = keys[KeyEvent.VK_RIGHT];
        LEFT = keys[KeyEvent.VK_LEFT];
    }
    @Override
    public void keyPressed(KeyEvent e){
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e){
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e){

    }
}
