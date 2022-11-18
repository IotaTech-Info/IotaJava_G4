//11月18日　gitへアップ用更新
package co.jp.part2;

public class Cat extends Pet implements PetEat {
	private String CatFood;

	public Cat(String name, int age, String type, int COUNT) {
		super(name, age, type);
		Cat.COUNT = COUNT;
		this.CatFood = "猫餌";
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "は" + CatFood + "を食べました");
	}

}
