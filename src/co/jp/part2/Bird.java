package co.jp.part2;

public class Bird extends Pet implements IFly{

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

}
