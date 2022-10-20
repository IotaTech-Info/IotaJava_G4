package co.jp.chapter03;
public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=56;
		System.out.println("入力した成績は:" + a);
		if(a>=90) {
			System.out.println("A");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=70) {
			System.out.println("C");
		}else if(a>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		
		int coinCounts=0;
		int b=3340;
		while(b%500!=b) {
			coinCounts++;
			b=b-500;
		}
		while(b%100!=b) {
			coinCounts++;
			b=b-100;
		}
		while(b%10!=b) {
			coinCounts++;
			b=b-10;
		}
		while(b%5!=b) {
			coinCounts++;
			b=b-5;
		}
		coinCounts=coinCounts+b;
		
		System.out.print("3340 円のコイン数は "+ coinCounts+"です");
		
	}
}