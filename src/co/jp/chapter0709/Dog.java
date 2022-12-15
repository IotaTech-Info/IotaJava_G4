package co.jp.chapter0709;

public class Dog extends Animal{

	public Dog(String name, int age, String type) {
		super(name, age, type);
	}

	@Override
	public void sayHello() {
		System.out.println("ワン");
	}

	
}
