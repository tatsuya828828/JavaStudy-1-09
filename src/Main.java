import job.Hero;
import job.Thief;
import job.Wizard;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.setHp(thief.getHp()+10);
	}

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp +":"+ t.getHp());

		Hero h1 = new Hero();
		h1.setHp(100);
		Hero h2 = h1;
		h2.setHp(200);
		// h2はh1を参照しているためh2の変更=h1の変更となる
		System.out.println(h1.getHp());
		Hero h3 = new Hero();
		h3.setHp(h1.getHp());
		System.out.println(h3.getHp() +":"+ h1.getHp());
		h3.setHp(300);
		System.out.println(h3.getHp() +":"+ h1.getHp());

		h1.getSword().setName("炎の剣");
		String swordName = h1.getSword().getName();
		System.out.println(swordName);

		System.out.println(h1.getHp());
		Wizard wizard = new Wizard();
		wizard.heal(h1);
		System.out.println(wizard.getName() +"は"+ h1.getName() +"のHPを10回復した");
		System.out.println(h1.getHp());
	}
}
