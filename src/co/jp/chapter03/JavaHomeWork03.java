package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int a = 56;
//		System.out.println("成績ランキング判断。入力値＝"+ a );
//		if(a>=90) {
//			System.out.println("A");
//		}else if(a>=80&&a<90) {
//			System.out.println("B");
//		}else if(a>=70&&a<80) {
//			System.out.println("C");
//		}else if(a>=60&&a<70) {
//			System.out.println("D");
//		}else {
//			System.out.println("E");
//		}
//
//		コンソール:
//		成績ランキング判断。入力値＝56
//		E
//		
		int coins= 3377;
		coin_compute(coins);
		
	}
	public static void coin_compute(int coins) {
		int nokori_coins = 0;
		int num_500=0,num_100=0,num_50=0,num_10=0,num_5=0,num_1 = 0;
		for (;;) {
			num_500 = coins/500;
			nokori_coins = coins % 500;
			if (nokori_coins == 0) {
				break;
			}
			num_100 = nokori_coins/100;
			nokori_coins = coins % 100;
			if (nokori_coins == 0) {
				break;
			}
			num_50 = nokori_coins/50;
			nokori_coins = coins % 50;
			if (nokori_coins == 0) {
				break;
			}
			num_10 = nokori_coins/10;
			nokori_coins = coins % 10;
			if (nokori_coins == 0) {
				break;
			}
			num_5 = nokori_coins/5;
			nokori_coins = coins % 5;
			if (nokori_coins == 0) {
				break;
			}
			num_1 = nokori_coins/1;
			nokori_coins = coins % 1;
			if (nokori_coins == 0) {
				break;
			}
		}
		
		System.out.println("500円の枚数は"+ num_500 +", "+ "100円の枚数は"+ num_100+", " + "50円の枚数は"+ num_50+", "+"10円の枚数は"+ num_10+", "+"5円の枚数は"+ num_5+", "+"1円の枚数は"+ num_1+".");
		}
}
	