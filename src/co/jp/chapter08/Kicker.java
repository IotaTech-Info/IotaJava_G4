package co.jp.chapter08;

public class Kicker {


	 public static void main(String...args) {
	 Employee x = new Employee("1234");
	 Employee y = new Employee("1234");
	 System.out.println(x == y); // 結果：false 原因：同じ内容ですが、ＲＡＭでのアドレスが違う。
	 System.out.println(x.equals(y)); // 結果：true 原因：idの内容が同じ。
	 }
	 
//	 public static void print(Parent v) {
//		 v.hello();
//		 }
//		 public static void main(String...args) {
//		 print(new Parent());
//	 print(new Child());
//		 }
	 
	 

}