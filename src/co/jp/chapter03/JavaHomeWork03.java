package co.jp.chapter03;

import java.util.Scanner;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//homework
		// 質問1：成績ランキング判断を作成する「90以上：A；80‐90：B；70‐80：C；60-70：D；60以下：E」
		
		// 回答：
		int a = 56;
		System.out.println("成績ランキング判断。入力値⁼" + a);
		
		if (a >= 90) {
			System.out.println("A");
		}else if (a >= 80) {
			System.out.println("B");
		}else if (a >= 70) {
			System.out.println("C");
		}else if (a >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		// 質問2：日本のコインを1円、5円、10円、100円、500円があります。3340円のコイン数をもとめてください。
		
		// 回答：
		int coin;

		Scanner C = new Scanner(System.in);
		System.out.println("金額を入力してください:");
		coin = C.nextInt();

		int[] money_type = { 500, 100, 10, 5, 1 };
		int[] money_type_amount = new int[5];

		System.out.println("最小コイン数は：");

		for (int i = 0; i < 5; i++) {

			money_type_amount[i] = coin / money_type[i];
			coin = coin - money_type[i] * money_type_amount[i];

			System.out.println(money_type[i] + "円のコイン数は" + money_type_amount[i] + "枚です");
		}
		
		
		
		// 質問3:输出菱形,环状菱形
		
		// 回答：
		// 输出菱形
		int l;
		
		Scanner L = new  Scanner(System.in);
		System.out.println("Enter l for length:");
		l = L.nextInt();
		
		if (l % 2 == 0) {      // 边长为偶数   
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < l; j++) {
					if (i + j == l/2 - 1 || j - i == l/2 || i - j == l/2 || i + j == l/2 - 1 + l) {
						System.out.print("" + i + j + " ");
					} else {
						System.out.print("    ");
					}
				}
				System.out.println();
			}
		} else {               // 边长为奇数 
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < l; j++) {
					if (i + j == l/2 || j - i == l/2 || i - j == l/2 || i + j == l/2 - 1 + l) {
						System.out.print("" + i + j + " ");
					} else {
						System.out.print("    ");
					}
				}
				System.out.println();
			}
		}
		
		// 输出环状菱形: 边长为12，内环菱形向内缩进3格
		
		int l_1 = 12;
		int	s = 3;
		
		for (int x = 0; x < l_1; x++) {
			for (int y = 0; y < l_1; y++) {
				if (x >= s && x <= l_1 - s - 1 && y >= s && y <= l_1 - s - 1) {
					if (x + y == l_1 / 2 - 1 + s || y - x == l_1 / 2 - s || x - y == l_1 / 2 - s
							|| x + y == l_1 / 2 - 1 + l_1 - s) {
						System.out.print("" + x + y + " ");
					} else {
						System.out.print("     ");
					}
				} else if (x + y == l_1 / 2 - 1 || y - x == l_1 / 2 || x - y == l_1 / 2 || x + y == l_1 / 2 - 1 + l_1) {
					System.out.print("" + x + y + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
}