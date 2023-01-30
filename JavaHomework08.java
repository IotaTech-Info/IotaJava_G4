package co.jp.chapter08;

public class JavaHomework08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１︓以下コードの出⼒するを回答してください。
				//1 String x = "a";
				//2 String y = "a";
				//3 System.out.println(x == y); // true? false? 原因は?           
		//回答：true，==比较的是地址，2个a在常量池内是同一个地址
				
		//4 System.out.println(x.equals(y)); 
		// true?false? 原因は?        
		//回答：true，equals比较的是字符串内的内容
				
		//5 
		//6 String empty = "";
		//7 String nullString = null;
		//8 System.out.println(nullString.equals(empty)); // true ? false? 原因は ?  
		//　回答:false,""是空字符串，占内存，null表示什么都没有。
		
		
		//質問２︓以下コードの出⼒を回答してください。
				// // Employee.java
				//public class Employee {
				// private String id;
				// public Employee(String id) {
				// this.id = id;
				// }
				// @Override
				// public boolean equals(Object another) {
				// if (another instanceof Employee) {
				// Employee an = (Employee) another;
				// return an.id.equals(id);
				// }
				// return false;
				// }
				//}
				// //Kicker.java
				//public class Kicker {
				// public static void main(String...args) {
				// Employee x = new Employee("1234");
				// Employee y = new Employee("1234");
				// System.out.println(x == y); // true ? false? 原因は ?       
		//回答：false,双等号比较的是地址区域，x和y的值相同，地址不同
				
		// System.out.println(x.equals(y)); // true ? false? 原因は ?　　
		
	}
	

}
