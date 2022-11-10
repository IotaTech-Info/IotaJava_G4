package co.jp.chapter08;

public class Kicker { 
	
	public static void print(Parent parent) { 
		parent.hello(); 
	} 
	
	public static void main(String...args) { 
		print(new Parent()); 
		print(new Child()); 
	}
}
