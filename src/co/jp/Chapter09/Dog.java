package co.jp.Chapter09;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void sayHello() {
		System.out.println("ワン");
	}

}
