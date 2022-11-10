package co.jp.chapter08;

public class Cat extends Animal{
	
	Leg[] leg;

	public String mao;
	
	public Cat(String name, int age, int legs, String mao) {
		super(name, age, legs);
		this.mao = mao;
	}

	void run(){
		System.out.println("cat is running");
	}
	
	@Override
	void speck() {
		super.speck();
		System.out.println("nya");
	}
}
