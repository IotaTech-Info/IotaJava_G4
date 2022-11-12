package co.jp.chapter08;

public class Animal {
	public String name;
	public int age;
	public int legs;
//	Animal(){
//  }
	
	void speak() {
		System.out.println("hello");
	}


	public Animal(String name, int age, int legs) {
		super();
		this.name = name;
		this.age = age;
		this.legs = legs;
	}


}
