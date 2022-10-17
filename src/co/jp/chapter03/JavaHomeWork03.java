package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if (a >= 90) {
			System.out.println("A");
		} else if (a >= 80) {
			System.out.println("B");
		} else if (a >= 70) {
			System.out.println("C");
		} else if (a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

//		質問2
		int b = 3347;
		int coins = 0;

		while (b >= 0) {
			if (b > 500) {
				coins = b / 500;
				b = b % 500;
			} else if(b > 100){
				coins = coins + b / 100;
				b = b % 100;
			} else if(b > 10) {
				coins = coins + b / 10;
				b = b % 10;
			}else if (b > 5) {
				coins = coins + b / 5;
				b = b % 5;
			}else {
				coins = coins + b / 1;
				System.out.println("合計コイン"	+coins+"枚");
				b = b % 1;
				break;
			}
		}

	}
}