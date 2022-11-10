package co.jp.chapter09;

public class Bird extends SkyAnimal{
	
	@Override
	void fly() {
		System.out.println("fly!");
		
	}
	
	
	@Override
	void speak() {
		System.out.println("gugu!");
	}

}
