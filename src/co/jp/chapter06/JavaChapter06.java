package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		
		int a = 3;
		
		int b = 4;
		
		int c = sum(a,b);
		
		int d = minus(a, b);
		
		System.out.println(c);
		
		System.out.println(d);

		fact(0);
	}

	
		static int sum(int a, int b) {
			int c = a + b;
			return c;
		}
	
	static int minus (int item1, int item2) {
			return item1 - item2;
	}
	

	static int fact(int n) {
		System.out.println(n);
		if (n == 0)
			return 2;
		else
			return fact(n-1);
	}
	
}
