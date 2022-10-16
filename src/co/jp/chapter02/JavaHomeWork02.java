package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		
		// 質問１：1行
		
		// 質問２︓ Stringを比較方法は equals
		
		// 質問３︓ Float値⇒String文字列変更する場合、String.valueOf(“1.0F“) と 1.0F + ““、両方を利用します
		String str1 = 1.23f + "";
		System.out.println(str1);
		String str2 = String.valueOf(1.23f);
		System.out.println(str2);
		
		//質問４:
		//double b = 1.0;
		System.out.println(1.0 + 2.0);  //3.0
		System.out.println(1.0 + "2.0");   //1.02.0
		
		//質問５:
		int a = 10;
		System.out.println("a");   //a
		
	}
}
