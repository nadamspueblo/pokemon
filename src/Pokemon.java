
public abstract class Pokemon {
	
	// instance variables this.
	private String name;
	private String type; // Fire, Water, etc
	private int damage; // Damage the pokemon inflicts
	private int hp; // Hit points, health
	private double accuracy; // On a scale of 0 to 1.0
	
	// Constructors
	public Pokemon(String name, String type, int damage, int hp) {
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.hp = hp;
	}
	public Pokemon(String name, String type) {
		this(name, type, 10, 100);
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
	
	/** Attacks a pokemon with the specified attack
	 * This method determines whether the attack misses or hits and apply the correct damage reducing p's hp
	 * This method animates the attack
	 * 
	 * @param p The pokemon to be attacked
	 * @param which 0, 1, or 2 for which attack should be used
	 */
	public abstract void attack(Pokemon p, int which);
	
}
