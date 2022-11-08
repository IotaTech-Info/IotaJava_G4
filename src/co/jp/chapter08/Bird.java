package co.jp.chapter08;

public class Bird extends Animal {
	public String wing;
	
	public Bird(String name, int age, int legs, String wing) {
		super(name, age, legs);
		this.wing = wing;
	}

	void fly() {
		System.out.println("bird is flying");
	}
}
