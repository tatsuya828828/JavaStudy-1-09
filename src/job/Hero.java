package job;

import weapon.Sword;

public class Hero {
	private int hp;
	private Sword sword;
	private String name;

	// 引数が違えばコンストラクタもオーバーロードできる
	public Hero(String name) {
		this.name = name;
		Sword sword = new Sword();
		this.sword = sword;
	}
	// コンストラクタ
	// インスタンス化する際は、必ずコンストラクタが呼び出される
	// 未定義の場合は、デフォルトコンストラクタが呼び出される
	// 引数はなし、メソッド名がクラス名と完全に等しい
	public Hero() {
		// コンストラクタの中でもコンストラクタを呼び出せる
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
