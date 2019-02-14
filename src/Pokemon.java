
public abstract class Pokemon {
	
	// instance variables this.
	private String name;
	private int damage; // Damage the pokemon inflicts
	private int hp; // Hit points, health
	
	// Constructors
	public Pokemon(String name, int damage, int hp) {
		
	}
	public Pokemon(String name) {
		this(name, 10, 100);
	}
	
	// Returns the name of the Pokemon
	public String getName() {
		return name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getHp() {
		return hp;
	}
	
	// Attacks Pokemon p with the specified attack
	public abstract void attack(Pokemon p, int which);
	
	public abstract void draw();
	
}
