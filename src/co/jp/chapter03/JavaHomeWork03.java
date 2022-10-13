package co.jp.chapter03;

public class JavaHomeWork03 {
	
	void question1() {
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if(a >= 90) System.out.println("A");
		else if (a < 90 && a >= 80) System.out.println("B");
		else if (a < 80 && a >= 70) System.out.println("C");
		else if (a < 70 && a >= 60) System.out.println("D");
		else  System.out.println("E");
	}

	void question2() {
		int amount = 3340;
		int y500 = amount / 500;
		amount %= 500;
		int y100 = amount / 100;
		amount %= 100;
		int y10 = amount / 10;
		amount %= 10;
		int y5 = amount / 5;
		amount %= 5;
		int num = y500 + y100 + y10 + y5 + amount;
		System.out.println(amount);
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//

	}
	
}