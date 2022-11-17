package co.jp.chapter09;

public class Dog extends Animal{

	public Dog(String name) {
		super.name=name;
	}
	public String getName(){
		return super.name;
	}
	@Override
	void sayHello() {
		System.out.println("ワン");
		
	}

}
