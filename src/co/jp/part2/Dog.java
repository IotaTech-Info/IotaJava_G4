package co.jp.presentation;

public class Dog extends Pet implements Run{

	public Dog(String name, String type, int age) {
		super(name, type, age);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("dog正在吃食");
	}
	


}
