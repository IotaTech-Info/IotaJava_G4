package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 2;

		System.out.println(sub(a, b));

		char[] x = new char[] { 'A', 1 };
		char[] y = new char[2];
		for (int i = 0; i < x.length; i++) {
			y[i] = x[i];
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(y[i]+" ");
		}

	}

	static int sub(int a, int b) {
		return (a - b);
	}

}
