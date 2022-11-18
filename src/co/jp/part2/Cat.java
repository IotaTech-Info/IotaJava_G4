package co.jp.part2;

public class Cat extends Pet implements IRun{

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("猫の餌を食べました！ニャン！");

	}

	@Override
	public void Run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("猫歩き");
	}

}
