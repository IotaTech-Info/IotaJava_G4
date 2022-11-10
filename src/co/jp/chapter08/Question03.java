package co.jp.chapter08;

public class Question03 {
	public static void print(Parent v) { //こちらを修正した．　Child　Parentどちらでもprintを利用できる
		 v.hello();
		 }
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		print(new Parent());
		print(new Child());
	}

}
