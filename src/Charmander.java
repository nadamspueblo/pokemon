import processing.core.PApplet;
import processing.core.PImage;

public class Charmander extends Pokemon {
	
	private PImage charmander;
	
	public Charmander(PApplet parent) {
		super(parent, "Charmander", Pokemon.FIRE, 10, 100);
		charmander = parent.loadImage("charmander.png");
	}

	@Override
	public void reduceHp(int amount) {
		
	}
	
	@Override
	public void attack(Pokemon p, int which) {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawNextFrame() {
		parent.image(charmander, parent.width - charmander.width - 20, parent.height * 0.6667f - charmander.height);
	}

}
