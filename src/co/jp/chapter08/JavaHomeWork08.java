package co.jp.chapter08;

public class JavaHomeWork08 {

	//質問１︓以下コードの出力するを回答してください。
	/*
	String x = "a";
	String y = "a";
	System.out.println(x == y); // true ? false? 原因は ?
	//trueです。stringはnewしなかったのでメモリアクセスは同じですから
	
	System.out.println(x.equals(y)); // true ? false? 原因は ?
	//trueです。xとyの文字列は同じですから
	 
	String empty = "";
	String nullString = null;
		
	System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
	//nullであるnullStringからequalsメソッドを呼び出そうとすると、
	//NullPointerExceptionという例外が発生してしまいました。
	//nullからメソッドを呼び出してしまったので
	 */

	//質問２︓以下コードの出力を回答してください。
	/*
	 		...
 			System.out.println(x == y); // true ? false? 原因は ?
 			//false ==はメモリアクセスを比較するので、newで新しいアクセスで Employee
 			 を作りましたので、メモリアクセスが違います。
 			
 			System.out.println(x.equals(y)); // true ? false? 原因は ?
 			//true equalsは文字列を比較するので、xとyの文字列は同じなので、trueになる
 		}
	}

	 */
	
	//質問３︓以下コンパイルを修正してください。
	
	/*
	...
	// Kicker.java
	public class Kicker {
	 	public static void print(Child v) { //<-------Child v をParent vにする
	 		v.hello();
	 	}
	...	 	
*/
	
}
