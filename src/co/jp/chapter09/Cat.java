package co.jp.chapter09;

public class Cat extends Animal {
	
	Cat(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("ニャー");
	}
}
