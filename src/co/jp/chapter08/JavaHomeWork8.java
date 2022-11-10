package co.jp.chapter08;

public class JavaHomeWork8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問1:以下コードの出力するを回答してください
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true, "==" is compare the memory address of a and b.
		System.out.println(x.equals(y)); // true, "equals" is compare the own value of a and b.
		String empty = "";
		String nullString = null ;
		System.out.println(nullString.equals(empty)); //showing "NullPointerException", because "null" is not point to any memory space.
		
		
//		質問2:以下コードの出力を回答してください。
//		System.out.println(x == y); //false, x and y are point to different memory space
//		System.out.println(x.equals(y)); // true,  x and y have the same value. 

		
		//質問３︓以下コンパイルを修正してください。
//		public class Kicker { 
//	
//			public static void print(Parent parent) { 
//				parent.hello(); 
//			} 
//	
//			public static void main(String...args) { 
//				print(new Parent()); 
//				print(new Child()); 
//			}
//		}

	}
	
	
}