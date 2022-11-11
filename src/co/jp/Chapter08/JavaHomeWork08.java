package co.jp.Chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１︓以下コードの出⼒するを回答してください。
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		String empty = "";
		String nullString = null;
		System.out.println(empty.equals(nullString));
		//System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		
		// 执行的结果为:
		// true : 在这里 "a" 并不是创建了一个新的对象，而是将一个已经在内存中的字符串"a"的地址，分别赋值给了x,y变量
		// 由于是同一个字符串，因此内存是相同的。
		// true ：在这里，是将x,y变量内的地址所指向的对象进行比较，由于二者的地址相同，即对象相同，因此比较的结果为二者相等。
		// false : "" 为一个空的字符串，是一个对象，null 则是一个常量。二者有本质的区别。调用nullString.equals方法会造成编译错误
		// 这是由于null并不是一个String对象，无法调用属于String的方法。
		
//		質問２︓以下コードの出⼒を回答してください。
		// 执行的结果为:
		// false : 连个Employee对象虽然使用了完全一模一样的构造函数的形参输入，但是是两个对象， == 是基于变量内容的比较，此时变量内容为
		// 这两个对象在内存中所在的地址，因此比较的结果为false
		// true ： Employee类默认继承了所有类的父类，"Object"类， 并对Object类的方法"equals"进行了重写。在重写的equals中，先进行了一个
		// if判断，确认其输入值是Employee类的实例，然后对比了输入值的id属性与自身的id属性。在得到二者一致的结果后，最终的结果就为true。
		
//		質問３︓以下コンパイルを修正してください。
		// 修正方法，将Kicker类的静态方法print的形参v的类型从Child转为Parent，这是由于print的目的是，调用了v对象的方法hello，而hello是一个
		// 由父类Parent创建，由子类Child重写的方法。而形参v的类型如果为Parent，则无论输入值为Parent还是Child都能读取。
		
		
	}
}
