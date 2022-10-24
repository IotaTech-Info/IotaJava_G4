package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=10;
		int b=24;
		System.out.println(sum(a,b));
		System.out.println(minus(a,b));

	}
	
	static int sum (int item1, int item2) {
		return item1+item2;
	}

	static int minus (int item1, int item2) {
		return item1-item2;
	}
}
