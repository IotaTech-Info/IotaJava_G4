package co.jp.chapter09_2;

public class Animal {
	private int age;
	private String name;
	private String type;
	
	
	public Animal(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	
	
	
	

}
