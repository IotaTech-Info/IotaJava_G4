package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {

		// 質問１︓ System.out.println(“this is line1\tthis line2“); は何⾏出⼒しますか︖
		// 1. １⾏
		// 2. ２⾏

		// 回答：1行 ※ \t ⇒ Tab
		System.out.println("this is line1\tthis line2");

		// \n ⇒ 改行
		System.out.println("this is line1\nthis line2");

		// 質問２︓Stringを⽐較⽅法は︖
		// 1. ==
		// 2. equals
		
		//回答：equals
		
		//※　"==" ⇒ tureの場合、同じ参照先
		//※　"equals" ⇒ tureの場合、値が同じである
		
		String name = "WANG";
		String name2 = new String("WANG");
		
		System.out.println(name.equals(name2));
		System.out.println(name == name2);
		
		// 質問３︓Float値⇒String⽂字列変更する場合、どうなメソッドを利⽤しますか
		// 1. String.valueOf(“1.0F“)
		// 2. 1.0F + ““
		
		//回答：String.valueOf(“1.0F“)
		
		float x = 100;
		String x1 = String.valueOf(x);	
		System.out.println(x1);
		
		// 質問４︓以下式の値を記載してください。
		// 1. 1.0 + 2.0
		// 2. 1.0 + “2.0“
		
		System.out.println(1.0 + 2.0);
		// ""使用する場合、+は“と”の意味である
		System.out.println(1.0 + "2.0");
		
		/*
		質問５︓以下ステートメントの出⼒を記載してください。
		public static void main(String[] args) {
		 int a = 10;
		 System.out.println("a");		
	}

       */
		
		int a = 10;
		// ""使用する場合、""内の内容を表示するのみ
		System.out.println("a");
		System.out.println(a);
		
	}
	
}
		