package co.jp.chapter07;

public class JavaChapter06{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a =888;
		int b =666;
		int c = sum(a,b);
		int d = minus(a,b);
		
		System.out.println(d);
		
	}

	private static int minus(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		return a-b;
	}

	private static int sum(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		return a+b;
	}

}
