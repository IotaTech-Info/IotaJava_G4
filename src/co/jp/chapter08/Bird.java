package co.jp.chapter08;

public class Bird extends Animal {
	public String mouse;
	public Bird(String name, int age, int legs, String mouse) {
		super(name, age, legs);
		this.mouse = mouse;
	}
	public void speck() {
		System.out.println("ououou");
	}
}
