package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1，成績ランキング判断を作成する
		/*
		int a = 56;
		System.out.println("成績ランキング判断。入力値＝"+a);
		
		if(a >= 90) {
			System.out.println("A");
		}else if(a >= 80 && a < 90) {
			System.out.println("B");
		}else if(a >= 70 && a < 80) {
			System.out.println("C");
		}else if(a >= 60 && a < 70) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		*/
		
		//2,日本のコインを1円、5円、10円、100円、500円があります。3347円をもとめてください。
		
		int money = 5;
		
		do {
			System.out.println("500円の個数＝"+money/500);
			money %= 500;
			
			System.out.println("100円の個数＝"+money/100);
			money %= 100;
			
			System.out.println("10円の個数＝"+money/10);
			money %= 10;
			
			System.out.println("5円の個数＝"+money/5);
			money %= 5;
			
			System.out.println("1円の個数＝"+money/1);
			money %= 1;
		}while(money != 0);
	}
}