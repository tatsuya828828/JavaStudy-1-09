package job;

public class Wizard {
	private String name;

	public Wizard(String name){
		this.name = name;
	}

	public Wizard() {
		this("さいとう");
	}

	public void heal(Hero hero) {
		hero.setHp(hero.getHp()+10);
	}

	public String getName() {
		return this.name;
	}
}
