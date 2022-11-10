package co.jp.chapter09;

public class Bird extends SkyAnimal {

	@Override
	void Speak() {
		System.out.println("It spoke.");
	}
	
	@Override
	void Fly() {
		System.out.println("It flew away...");
	}

}	
