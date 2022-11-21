package co.jp.chapter09;

public  abstract class Animal {
	
	int age;
	String name;
	String type;
	
	abstract void sayHello();
	
	public String getName() {
		return name;
	}
}
