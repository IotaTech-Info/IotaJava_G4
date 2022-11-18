package co.jp.part2;

public class Dog extends Pet implements IRun {

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("犬の餌を食べました！ワン！");
	}

	@Override
	public void Run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("犬歩き");
	}

}
