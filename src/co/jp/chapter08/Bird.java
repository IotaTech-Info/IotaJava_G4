package co.jp.chapter08;

public class Bird extends Animal {
	public String wings;

	public Bird(String name, int age, int legs, String wings) {
		super(name, age, legs);
		this.wings = wings;
	}

	
	void fly() {
		System.out.println("I am flying");
	}

}