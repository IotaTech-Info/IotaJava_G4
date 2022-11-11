package co.jp.chapter08;

public class JavaHomeWork08 {

	/*質問１︓以下コードの出⼒するを回答してください。
	String x = "a";
	String y = "a";
	System.out.println(x == y); // true ? false? 原因は ?
	System.out.println(x == y); // true  false? 原因は ?
	String empty = "";
	String nullString = null;
	System.out.println(x == y); // true  // true ? false? 原因は ?
	*/
	
//	答え：System.out.println(x == y); // true  数値は同じaであるため
//	      System.out.println(x == y); // true オブジェクトの内容は同じので
//	      System.out.println(x == y); // 実行エラー 。　アドレス違うため、多分false
	
	/*
	質問２︓以下コードの出⼒を回答してください

	// Employee.java
	public class Employee {
	 private String id;
	 public Employee(String id) {
	 this.id = id;
	 }
	 @Override
	 public boolean equals(Object another) {
	 if (another instanceof Employee) {
	 Employee an = (Employee) another;
	 return an.id.equals(id);
	 }
	 return false;
	 }
	}
	// Kicker.java
	public class Kicker {
	 public static void main(String...args) {
	 Employee x = new Employee("1234");
	 Employee y = new Employee("1234");
	 System.out.println(x == y); // true ? false? 原因は ?
	 System.out.println(x.equals(y)); // true ? false? 原因は ?
	 }
	}
	
	*/
	//答え；
	///   false アドレスが違うので。
	//    true 数値は同じ。
	/*
	
	質問３︓以下コンパイルを修正してください。
	
	// Parent.java
	public class Parent {
	 public void hello() {
	 System.out.println("parent method");
	 }
	}
	// Child.java
	public class Child extends Parent {
	 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
	 public void hello() {
	 System.out.println("child method");
	 }
	}
	// Kicker.java
	public class Kicker {
	 public static void print(Child v) {
	 v.hello();
	 }
	 public static void main(String...args) {
	 print(new Parent());
	 
	 print(new Child());
	 }
	}
	
	
	
	
	答え：
	１６列
	public static void print(Child v) {
	を
	public static void print(parent v) {
	に直す
	
	*/	
	
	
	
	
}
