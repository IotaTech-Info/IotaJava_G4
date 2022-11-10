package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 質問1：以下コードの出力を回答してください。
		String x = "a";
		String y = "a";
		
		System.out.println(x == y);
		// 输出：true; 原因：使用 == 比较时，并不是在比较字符串内容，而是比较两个引用是否指向同一个对象，
		// 这里x和y都指向常量池中的a，所以输出是true。
		
		System.out.println(x.equals(y));
		// 输出：true; 原因：使用.equal()比较时是直接比较字符串内容是否一样，
		// 这里x和y的内容都是a，所以输出是true。
		
		String empty = "";
		String nullString = null;
		System.out.println(empty.equals(nullString));
		// 输出：false; 原因：null不指向任何对象且不分配内存空间，相当于没有任何的值；而空字符串""代表一个长度为0的字符串而且会分配内存空间，
		// 这里用.equals()比较时empty和nullString的内容是不一致的，所以输出是false。
		
		
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
		// 输出：false; 原因：用Employee方法生成a和b两个对象时，会想对应生成两个不同的内存空间，不同内存空间的地址不一样
		// 所以这里用 == 比较时，输出是false。
		//			System.out.println(x.equals(y));
		// 输出：true; 原因：在Employee类中进行了对.equals()方法的重写，先要判断another是不是Employee类的一个实例，再执行后续代码，
		// 由于a和b都是Employee类的实例，所以a对b调用equals方法的时候，将输入的Object型变量another变为Employee型并给an，最后返回an.id.euqals(id)的值
		// 因为a和b的内容都是1234，所以返回的true。
		
		
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
		//			错误原因：由于print方法的引数是子类Child的对象，子类Child对父类的hello方法进行了重写，可以调用到该方法
		//			但是print(new Parent());中输入的是父类Parent的对象，不适用于方法print
		//
		//			修正方法：将print(new Parent());改为new Parent().hello();
		//			或者Parent p = new Parent(); p.hello();			
		//
		//			最终输出：new Parent().hello()只能调用到父类Parent的hello方法，输出为parent method；
		//			print(new Child());调用子类Child的hello方法，输出为child method。
		//		}
		//	}
	}
}
