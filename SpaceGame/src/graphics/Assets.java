package SpaceGame.src.graphics;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage player;

    public static void init (){
        player = Loader.ImageLoader("../../res/ships/player.png");
    }
}