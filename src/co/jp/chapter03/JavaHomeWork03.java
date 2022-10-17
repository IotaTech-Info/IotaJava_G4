package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaHomeWork03 test=new JavaHomeWork03();
		test.Q1();
		test.Q2();
	}
	public void Q1() {
		int a=56;
		System.out.println("成績ランキング判断。入力値="+a);
		if (a>90) {
			System.out.println("A");
		}
		else if (a>=80&&a<90) {
			System.out.println("B");
		}
		else if (a>=80&&a<90) {
			System.out.println("C");
		}
		else if (a>=80&&a<90) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}
	public void Q2() {
		int m=3340;
		int c1=0;
		int c5=0;
		int c10=0;
		int c100=0;
		int c500=0;
		if (m>500) {
			c500=m/500;
			m=m%500;
		}
		if (m>100) {
			c100=m/100;
			m=m%100;
		}
		if (m>10) {
			c10=m/10;
			m=m%10;
		}
		if (m>5) {
			c5=m/5;
			m=m%5;
		}
		c1=m;
		System.out.println("1円は"+c1+"　5円は"+c5+"　10円は"+c10+"　"
				+ "　100円は"+c100+"　500円は"+c500+"枚あります");
		
	}
	
}