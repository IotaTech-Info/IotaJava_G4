package co.jp.part2;

public class Dog extends Pet implements PetEat {
	private String DogFood;

	public Dog(String name, int age, String type, int COUNT) {
		super(name, age, type);
		Dog.COUNT = COUNT;
		this.DogFood = "犬餌";
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "は" + DogFood + "を食べました");
	}

}
