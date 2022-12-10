package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 質問1：以下コードの出力を回答してください。
		String x = "a";
		String y = "a";
		
		System.out.println(x == y);
		// 输出：true; 
		
		System.out.println(x.equals(y));
		// 输出：true; 
		
		String empty = "";
		String nullString = null;
		System.out.println(empty.equals(nullString));
		// 输出：false; 
		
		// 質問2：以下コードの出力を回答してください。		
		//	Employee.java
		//	public class Employee {
		//		private String  id;
		//		public Employee(String id) {
		//			this.id = id;
		//		}
		//		@Override
		//		public boolean equals(Object another) {
		//			if(another instanceof Employee) {
		//				Employee an = (Employee)another;
		//				return an.id.equals(id);
		//			}
		//			return false;
		//		}
		//	}
		// 	Kicker.java
		//	public class Kicker{
		//		public static void main(String[] args){
		//			Employee x = new Employee("1234");
		//			Employee y = new Employee("1234");
		//			System.out.println(x == y);
		// 输出：false; 
		//			System.out.println(x.equals(y));
		// 输出：true; 
		
		// 質問3：以下コンパイルを修正してください。
		// 修正的代码:
		// 	Parent.java
		//	public class Parent{
		//		public void hello(){
		//			System.out.println("paretn method");
		//		}
		//	}
		//	Child.java
		//	public class Child extends Parent{
		//		@Override
		//		public void hello(){
		//			System.out.println("child method");
		//		}
		//	}
		//	Kicker.java
		//	public class Kicker{
		//		public static void print(Child v){
		//			v.hello();
		//		}
		//		public static void main(String[] args){
		//			new Parent().hello();  // 修正的部分
		//			print(new Child());
		//
		//			错误原因：父类不能调用子类重写方法
		//
		//			修正方法：将print(new Parent());改为new Parent().hello();
		//			或者Parent p = new Parent(); p.hello();			
		//
		//			输出：new Parent().hello()只能调用到父类Parent的hello方法，输出为parent method；
		//			print(new Child());调用子类Child的hello方法，输出为child method。
		//		}
		//	}
	}
}
