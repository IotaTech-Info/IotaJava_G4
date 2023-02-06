package co.jp.part3;

public class Dog extends Pet implements IRun{

	public Dog(String name, int masterCode, int age, Boolean health, int code) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Dog() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("犬の餌を食べました！ワン！");
	}


	@Override
	void love() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name+"ちゃん：ワン！ワン！♡");
	}

	@Override
	public void Run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("犬歩くぞ！");
	}

}
