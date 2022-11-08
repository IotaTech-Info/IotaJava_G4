package co.jp.chapter09;

public class Bird extends SkyAnimal{

	@Override
void speak() {
		System.out.println("chirl");
	}
	@Override
void fly() {
		System.out.println("flying");
	}
}
