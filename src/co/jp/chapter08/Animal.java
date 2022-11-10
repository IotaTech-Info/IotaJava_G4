package co.jp.chapter08;

public class Animal {
	protected String name;
	protected int age;
	protected int legs;
	
	
	public Animal(String name, int age, int legs) {
		super();
		this.name = name;
		this.age = age;
		this.legs = legs;
	}


	public void speck() {
		System.out.println("Hello world");
	}
	
}