package co.jp.presentation;

public class Bird extends Pet implements Fly{

	public Bird(String name, String type, int age) {
		super(name, type, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("bird正在吃食");
	}
	

}
