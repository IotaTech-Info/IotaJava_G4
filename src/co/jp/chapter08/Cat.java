package co.jp.chapter08;

public class Cat extends Animal{
	
	private String mao;
	
	
	public Cat(String name, int age, int legs, String mao) {
		super(name, age, legs);
		this.mao = mao;
	}
	
	public void run() {
		System.out.println("cat is running~~");
	}
	public void speck() {
		System.out.println("miao~~");
	}

}
