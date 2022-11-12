package co.jp.chapter08;

public class Cat extends Animal{
	
	public Cat(String name, int age, int legs, String mao) {
		super(name, age, legs);
		this.mao = mao;
	}
	public String mao;
	void run() {
		System.out.println("cat is running");
	}

}
