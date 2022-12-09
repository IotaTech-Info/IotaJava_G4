package co.jp.Chapter09;

public class Animal {
	private int age;
	private String name;
	private String type;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("hello");
	}
	public String getName() {
		return name;
	}
}
