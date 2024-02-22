package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		// 設問１︓1から100までの偶数の和を求める(for + if)。
		int x = 1;
		
		String y = "9";
		
		
		
		System.out.println( x + 1 );
		System.out.println( y + 1 );
		
		System.out.println("x % 2");
		
		System.out.println(x % 2);
		
		System.out.println(x % 2 == 0);
		
		
		int xxxxxxxxx = 0;
		
		// dead loop 
		for (;;) {
			if (x % 2 == 0) {
			
				// true 
				System.out.println("xは偶数");
				
				xxxxxxxxx += x;
				
			} else {
				
				// false
				System.out.println("xは偶数ではない");
			}
				
			
			
			if (x == 100) {
				break;
			}
			
			System.out.println( x += 1 );// x = x + 1
		}
		
		
		System.out.println(xxxxxxxxx);
		
		// dead code

		
		
		
	}
}
