/**
 * 
 * @author Nathan Adams
 * 
 *
 */
import processing.core.PApplet;

public abstract class Pokemon {
	
	// Constants to be used in subclasses
	public static final String FIRE = "FIRE";
	public static final String GRASS = "GRASS";
	public static final String WATER = "WATER";
	public static final String NORMAL = "NORMAL";
	
	// Instance variables
	protected PApplet parent;
	// These can be accessed using the getter methods from inside a subclasses
	private String name;
	private String type; // Fire, Water, etc
	private int damage; // Damage the pokemon inflicts
	private int hp; // Hit points, health
	private double accuracy; // On a scale of 0 to 1.0
	
	// Constructors
	public Pokemon() {
		this(null, "Pokemon", "Normal", 10, 100);
	}
	// Override the constructor and call super(parent, name, type, damage, hp)
	public Pokemon(PApplet parent, String name, String type, int damage, int hp) {
		this.parent = parent;
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.hp = hp;
		this.accuracy = 0.9;
	}
	
	// Getters for each property
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getDamage() {
		return damage;
	}
	public int getHp() {
		return hp;
	}
	public double getAccuracy() {
		return accuracy;
	}
	
	// Setters
	public void setHp(int value) {
		hp = value;
	}
	public void setAccuracy(double value) {
		if (value > 0 && value <= 1.0) {
			accuracy = value;
		}
	}
	
	// Abstract methods that must be overridden in subclasses
	
	/** Reduces the pokemon's hp by a given amount
	 * 
	 * @param amount to reduce the this pokemon's hp
	 */
	public abstract void reduceHp(int amount);
	
	/** Attacks a pokemon with the specified attack
	 * Determine whether the attack misses or hits and apply the correct damage reducing the pokemon's hp
	 * Animate the attack
	 * 
	 * @param p The pokemon to be attacked
	 * @param which value 0, 1, 2, or 3 for the attack that should be used
	 */
	public abstract void attack(Pokemon p, int which);
		
	/** Draws the pokemon at the correct size and position on the screen
	 *  
	 */
	public abstract void drawNextFrame();	
}
