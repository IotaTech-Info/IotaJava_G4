package co.jp.part3;

public class Bird extends Pet implements Fly {

	public Bird(String name, String type, int age) {
		super(name, type, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("BIRD正在吃食");
	}

}
