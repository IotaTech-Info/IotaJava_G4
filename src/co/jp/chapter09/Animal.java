package co.jp.chapter09;

public class Animal {
	public int age;
	private String name;
	public String type;
	Animal(String name){
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	public String getName() {
		return name;
	}
	
}
