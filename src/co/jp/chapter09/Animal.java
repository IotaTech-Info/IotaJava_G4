package co.jp.chapter09;

public class Animal {
	
	static String name;
	public int age;
	public String breed;
	
	public Animal(String name) {
		
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	void speck() {
		System.out.println("hello world");
	}
	
	void sayHello() {
		System.out.println("hello world");
	}
	
	String getName() {
		return this.name;
	}
	
	
}
