package co.jp.chapter0709;

public class Cat extends Animal {

	public Cat(String name, int age, String type) {
		super(name, age, type);
	}

	@Override
	public void sayHello() {
		System.out.println("ニャー");
	}

}
