package co.jp.chapter12;

public class JavaChapter12 {
	public static void main(String[] args) {
		try {
			System.out.println(20 / 0);
		} catch (ArithmeticException e) {
			System.out.println("エラーを発生します");
			e.printStackTrace();
		}

	}
}
