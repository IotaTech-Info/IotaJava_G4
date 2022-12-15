package co.jp.chapter08;

public class JavaHomework08 {
	public static void main(String[] args) {
		
		/*質問１
	
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true  xとýのJVMにあるアドレスを比較するため。
		System.out.println(x.equals(y)); // true xとýの値を比較するため。
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); 
		// エラー 定義されていない変数の属性あるいはその変数を含むメゾットを引用することができないため。
		*/
		
		/*質問２
		
		System.out.println(x == y); //false アドレスが異なるため
 		System.out.println(x.equals(y)); // true  IDは同じため。
		//
		*/
		
		/*質問３
	
	public static void print(Parent v) {
		 v.hello();
	 }
	
	public static void main(String...args) {
		 
		print(new Parent());
		print(new Child());
		
	}
		*/
	}
}
