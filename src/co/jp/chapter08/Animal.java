package co.jp.chapter08;

public class Animal {
	static int COUNT=0;
	public String name;
	public int age;
	public int legs;
	public Animal(String name, int age, int legs) {
		super();
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
	void speak() {
		System.out.println("Hello world");
	}
}
