package co.jp.chapter09;

public class Kicker {

	public static void print(Child v) {
		v.hello();
	}
	public static void print(Parent v) {
		v.hello();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		print(new Parent());
		print(new Child());
	}

}
