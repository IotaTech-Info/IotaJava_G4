package co.jp.chapter08;

public class JavaHomeWork08 {
//	public static void print(Child v) {
	public static void print(Parent v) {
		v.hello();
	}


	public static void main(String[] args) {

//		質問1
		String x = "a";
		String y = "a";
		System.out.println(x == y); //true 原因：xとyのメモリアドレス同じ
		
		System.out.println(x.equals(y));//true 原因：xとyの値は同じ
		
		String empty = "";
		String nullString = null;
		System.out.println(empty.equals(nullString)); // false 原因：""には「空白」がある、nullには何もない
		
		
//		質問2
		
		Employee a = new Employee("1234");
		Employee b = new Employee("1234");
		System.out.println(a == b); //false aとbのメモリアドレスが違い
		System.out.println(a.equals(b)); //true 原因：Employeeクラスで型変換し、値も同じ
		
//		質問3
		print(new Parent());
		print(new Child());
		
	}

}
