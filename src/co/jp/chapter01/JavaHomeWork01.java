package co.jp.chapter01;

import java.util.Scanner;

public class JavaHomeWork01 {


	public static void main(String[] args) {

		// 質問０１
		// int i = 10;
		// int n = i%5;

		// N = XXXXX
		
		//質問01 回答
		
		int i = 10;
		int n = i % 5;
		System.out.println("nの値:" + n); // 0
				
		
		
		// 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		// 回答XXXXXXX
		//質問２ 回答
		//回答：変数aに数値を入力する、10と比較して、ように大きい場合、“11”を出力する
		//      10と比較して、ように大きくなければ、“0”を出力する。(例を参考お願いします)
		//例
		Scanner Y = new Scanner(System.in);
		System.out.println("请输入a的值:");
		
		// aはint型だけではなく、longなども可能
		int a  = Y.nextInt();
		
		System.out.println(a);
		 a = a > 10 ? 11 : 0;
		 System.out.println(a);
		
		
		 
		// 質問３︓変数値を⽐較する演算⼦は = or == ?
		//回答：“==”である。
		// 例
		 int b = 12;
		 int c = 24;
		 boolean result = b == c;
		 System.out.println(result);

		// 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		//boolean変数に設定可能の値は[ture]と[false]である。
		 int d = 12;
		 int f = 24;
		 int g = 24;
		 boolean result1 = d == f;
		 boolean result2 = f == g;
		 System.out.println(result1);
		 System.out.println(result2);

		


	}

}
