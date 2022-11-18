//11月18日　gitへアップ用更新
package co.jp.part2;

public class Bird extends Pet implements PetEat {
	private String BirdFood;

	public Bird(String name, int age, String type, int COUNT) {
		super(name, age, type);
		Bird.COUNT = COUNT;
		this.BirdFood = "鳥餌";
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "は" + BirdFood + "を食べました");
	}

}
