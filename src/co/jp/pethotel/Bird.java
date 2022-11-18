package co.jp.pethotel;

public class Bird extends Pet implements Fly{
	public Bird(String name, int age, String type) {
		super(name, age, type);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	void eat() {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("吃鸟粮");
	}

}
