package co.jp.part2;

public class Cat extends Hotel implements Run{

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getName() + "(" + getType() + ")に餌をあげました");
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getName()+"は走っている");
	}

}
