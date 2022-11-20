package co.jp.part2t;

public class Cat extends Animal {
	Leg[] leg;

	/*
		public Cat(String name, int age, int legs, String mao) {
			super(name, age, legs);
			this.leg = leg;
			this.mao = mao;
		}
	*/
	public Cat() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String mao;

	void food() {
		System.out.println("猫が餌をたべました");
	}

	public void speck() {
		System.out.println("nya-");

	}
}
