package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問1
		String x = "a";
		String y = "a";
		System.out.println(x == y); //  true 原因："a"のアドレスは同じ。
		System.out.println(x.equals(y)); //  true 原因：true if the given object represents a Stringequivalent to this string, false otherwise
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // 結果：エラー Cannot invoke "String.equals(Object)" because "nullString" is null。

		
//		質問2

//		// Kicker.java
//		public class Kicker {
//		 public static void main(String...args) {
//		 Employee x = new Employee("1234");
//		 Employee y = new Employee("1234");
//		 System.out.println(x == y); // false 原因：同じ内容ですが、ＲＡＭでのアドレスが違う。
//		 System.out.println(x.equals(y)); // true 原因：idの内容が同じ。

		
//		質問３︓以下コンパイルを修正してください。

//		 public static void print(Parent v) {         // Child vをParent vに変更
//		 v.hello();
//		 }
//		 public static void main(String...args) {
//		 print(new Parent());
//	 print(new Child());
//		 }

	}
}
