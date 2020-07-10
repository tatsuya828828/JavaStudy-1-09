package job;

public class Thief {
	private String name;
	private int hp;
	private int mp;

	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		this(name, hp, 5);
	}

	public Thief(String name) {
		this(name, 40, 5);
	}

	public int getHp() {
		return this.hp;
	}

	public int setHp(int hp) {
		return this.hp = hp;
	}
}
