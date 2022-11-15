package co.jp.part2;

public class Bird extends Hotel implements Fly{

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getName() + "(" + getType() + ")に餌をあげました");
	}

	@Override
	public void fly() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getName()+"は飛んでいる");
	}

}
