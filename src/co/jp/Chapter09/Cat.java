package co.jp.Chapter09;


public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void sayHello() {
		System.out.println("ニャー");
	}

}
