package co.jp.chapter09;

public class Bird extends AnimalSky{

	@Override
	void fly() {
		System.out.println("Bird is fly");
		
	}

	@Override
	void sayHello() {
		System.out.println("hello Earth");		
	}

}
