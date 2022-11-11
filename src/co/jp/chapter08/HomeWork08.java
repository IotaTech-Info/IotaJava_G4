package co.jp.chapter08;

public class HomeWork08 {
//	質問１︓以下コードの出⼒するを回答してください。
//	String x = "a"; 
//	String y = "a"; 
//	System.out.println(x == y); // true ? false? 原因は ? 
//	//ture    
//	//xとyのアドレスが同じです。


//  System.out.println(x.equals(y)); // true ? false? 原因は ? 
//	//ture
//	//equelsメソッドを使うと、、文字列の中の値が同じかどうかを比較できます。
//
//
//	String empty = ""; 
//	String nullString = null; 
//	System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
//	//false
//	//String str = null ; 表示声明一个字符串对象的引用，但指向为null，也就是说还没有指向任何的内存空间；
//	String str = "";    表示声明一个字符串类型的引用，其值为""空字符串，这个str引用指向的是空字符串的内存空间；
//
//
//	質問２︓以下コードの出⼒を回答してください。
//	 // Employee.java 
//	public class Employee { 
//	private String id; 
//	public Employee(String id) { 
//	this.id = id;
//	 } 
//	@Override
//	 public boolean equals(Object another) { 
//	if (another instanceof Employee) {
//	 Employee an = (Employee) another; 
//	return an.id.equals(id); 
//	}
//	 return false; 
//	}
//	 }
//
	// Kicker.java 
//	public class Kicker { 
//	public static void main(String...args) { 
//	Employee x = new Employee("1234"); 
//	Employee y = new Employee("1234"); 
//	System.out.println(x == y); // true ? false? 原因は ? 
//	//False
//	//== 演算子は同じオブジェクトを参照している場合に true となるため、
	//例えば 2 つの文字列が同じ値であっても、参照している文字列のオブジェクトが異なる場合は false となります。
//
//	System.out.println(x.equals(y)); // true ? false? 原因は ? 
//	//ture
//	//文字列の中の値は同じです。
//	}
//	 }
//
//
//
//
//
//	質問３︓以下コンパイルを修正してください。
//	 // Parent.java 
//	public class Parent {
//	 public void hello() { 
//	System.out.println("parent method"); 
//	}
//	 }
//	 // Child.java 
//	public class Child extends Parent { 
//	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
//	 public void hello() { 
//	System.out.println("child method"); 
//	}
//	 } 
//	// Kicker.java
//	 public class Kicker {
//	 public static void print(Parent v) { 
//	v.hello(); 
//	} public static void main(String...args) { 
//	print(new Parent()); 
//	print(new Child());
//	}
//	}
//
}
