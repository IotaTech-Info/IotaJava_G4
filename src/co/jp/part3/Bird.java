package co.jp.part3;

public class Bird extends Pet implements IFly{

	public Bird(String name, int masterCode, int age, Boolean health, int code) {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public Bird() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("鳥の餌を食べました！");
	}


	@Override
	public void Fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("飛べ！");
		
	}


	@Override
	void love() {

		// TODO 自動生成されたメソッド・スタブ
				System.out.println(name+"ちゃん：ありがとう！ありがとう！▶");
	}

}
