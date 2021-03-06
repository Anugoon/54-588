import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Anugoon
 */
public class Bullet extends Sprite {
    public static final int Y_TO_FADE = 400;
	public static final int Y_TO_DIE = 600;
	
	private int step = 12;
	private boolean alive = true;
	
	public Bullet(int x, int y) {
		super(x, y, 30, 50);
		
	}

	@Override
	public void draw(Graphics2D g) {
		
		//g.setColor(Color.WHITE);
		//g.fillRect(x, y, width, height);
                Image img = Toolkit.getDefaultToolkit().getImage("fire.gif");
                g.drawImage(img, x, y, width, height, null);
		
	}

	public void proceed(){
		y -= step;
		if(y > Y_TO_DIE){
			alive = false;
		}
	}
	
	public boolean isAlive(){
		return alive;
	}
        public boolean destroy(){
            alive = false;
            return alive;
        }
}
