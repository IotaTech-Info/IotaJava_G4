package co.jp.chapter08;

public class Bird extends Animal{
	public String tubasa;
	
	public Bird(String name, int age, int legs, String tubasa) {
		super(name, age, legs);
		this.tubasa = tubasa;
	}

	void fly() {
		System.out.println("bird is flying");
	}
}
