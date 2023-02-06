package co.jp.part3;

public class Cat extends Pet implements IRun{

	public Cat(String name, int masterCode, int age, Boolean health, int code) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Cat() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("猫の餌を食べました！");

	}

	@Override
	public void Run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("猫歩き");
	}

	@Override
	void love() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name+"ちゃん：ニャン！☆w☆");
	}

}
