package job;

import weapon.Sword;

public class Hero {
	private int hp;
	private Sword sword;
	private String name;


	public Hero(String name) {
		this.name = name;
		Sword sword = new Sword();
		this.sword = sword;
	}

	public Hero() {
		this("たかし");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Sword getSword() {
		return this.sword;
	}

	public Sword setSword(Sword sword) {
		return this.sword = sword;
	}

	public String getName() {
		return this.name;
	}
}
