package co.jp.chapter08;

public class JavaHomeWork08 {
	
	public static void main(String[] args) {
	//質問1：
	String x = "a";
	String y = "a";
	System.out.println(x == y);//true,xとyは類型も値も同じ
	
	System.out.println(x.equals(y));//true,xとyの値が同じ
	
	String empty = "";
	String nullString = null;
	System.out.println(empty.equals(nullString));//false,""は値がある、nullは何もないと意味する
	
	}
	
	//質問2：
	//System.out.println(x == y);/  false,xとyがメモリの中別々のEmployeeがある、アドレスが違う
	//System.out.println(x.equals(y));/ true,xとyの値が同じ
	
	//質問3：
	/***
	public class Kicker {
		public static void print(Child v) {
			v.hello();
		}
	が違った。正解は：
	　　public static void print(Parent v) {
			v.hello();
		
	Override発生する場所はParent
	 ***/
	

}
