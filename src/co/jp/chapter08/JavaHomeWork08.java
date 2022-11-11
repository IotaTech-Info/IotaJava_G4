package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１︓以下コードの出⼒するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true
		System.out.println(x.equals(y)); // true 
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // false? 原因はわかりません。
		
		//質問２︓以下コードの出⼒を回答してください。

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
		 System.out.println(x == y); // false
		 System.out.println(x.equals(y)); // false
		
		 }
		}
		
		//質問３︓以下コンパイルを修正してください。
		// Parent.java
		class Parent {
		 public void hello() {
		 System.out.println("parent method");
		 }
		}
		// Child.java
		class Child extends Parent {
		 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
		 public void hello() {
		 System.out.println("child method");
		 }
		}
		// Kicker.java
		class Kicker1 {
		 public static void print(Child v) {
		 v.hello();
		 }
		 public static void main(String...args) {
		 print(new Parent());
		 print(new Child());
		 }
		}

	}
}
			
			
			
	
	
			
			
			
			

			
	

