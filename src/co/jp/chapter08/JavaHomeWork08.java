package co.jp.chapter08;

public class JavaHomeWork08 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題1: 
		/*
		String x = "a";
		String y = "a";
		System.out.println(x == y);   //true.都指向常量池比较的是常量池的地址
		System.out.println(x.equals(y));  //true.equals方法只比较两个字符串的数值
		String empty = "";  //空字符串
		String nullString = null;
//		System.out.println(nullString.equals(empty));   //报错。nullString是一个空对象，不能调用任何方法。
		*/
		//問題2: 
		Employee x1 = new Employee("1234");
		Employee y1= new Employee("1234");
		System.out.println(x1==y1);  //false. x1与y1的内容相同但地址不同。
		System.out.println(x1.equals(y1));  //true. x1和y1的类型和id都相同。
		//問題3: 
		print(new Parent());
		print(new Child());
	}
	public static void print(Child v) {
		v.hello();
	}
	public static void print(Parent v) {
		v.hello();
	}
}