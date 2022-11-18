package co.jp.chapter09;

public class Cat extends Animal {

	public Cat(String name) {
		super.name = name;
	}

	public String getName() {
		return super.name;
	}

	@Override
	void sayHello() {
		System.out.println("ニャー");

	}
}
