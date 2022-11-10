package co.jp.chapter08;

public class Bird extends Animal{

	
	public Bird(String name, int age, int legs, String chibang) {
		super(name, age, legs);
		this.chibang = chibang;
	}
	public String chibang;
	void fly() {
		System.out.println("Bird is flying");
	}
	@Override
	void speak() {
		super.speak();
		System.out.println("jijizhazha");
	}
	
}
