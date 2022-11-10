package co.jp.chapter08;

public class Bird extends Animal{

	private String wing;

	public String getWing() {
		return wing;
	}

	public Bird(String name, int age, int legs, String wing) {
		super(name, age, legs);
		this.wing = wing;
	}
	
}
