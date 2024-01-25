package entities;

public class Champion {
	private String name;
	private int life;
	private int damage;
	private int armor;

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.damage = damage;
		this.armor = armor;
	}

	public int getLife() {
		return this.life;
	}

	public void takeDamage(Champion champion) {
		if (armor >= champion.damage) {
			life -= 1;
		} else {
			life += armor;
			life -= champion.damage;
		}
	}

	public String status() {
		if (life <= 0) {
			life = 0;
			return name + ": " + life + " de vida (morreu)";
		} else {
			return name + ": " + life + " de vida";
		}
	}
}