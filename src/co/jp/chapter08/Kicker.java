package co.jp.chapter08;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		print(new Parent());
		print(new Parent());

	}
	public static void print(Child v) {
		v.hello();
	}

	//修正１
	public static void print(Parent v) {
		v.hello();
	}

}
