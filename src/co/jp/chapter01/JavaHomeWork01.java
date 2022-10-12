package co.jp.chapter01;

public class JavaHomeWork01 {

	static int num;

	public static void main(String[] args) {

		// 質問０１
		int i = 10;
		int n = i%5;
		System.out.println("質問１: N = " + n);

		// 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		int a = 20;
		if(a > 10) {
			System.out.println("質問２: a = 11");
		}else
			System.out.println("質問２: a = 0");

		// 質問３︓変数値を⽐較する演算⼦は = or == ?
		// ==です
		System.out.println("質問３: == ");
		// 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		int x = 3;
		int y = 5;
		System.out.println("質問４:");
		boolean z = x > y;
		System.out.println(z);
		boolean w = x < y;
		System.out.println(w);
		//質問４:false true
	}

}
