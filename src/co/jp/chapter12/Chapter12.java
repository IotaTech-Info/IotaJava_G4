package co.jp.chapter12;

public class Chapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			System.out.println( 20 / 0 );
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
