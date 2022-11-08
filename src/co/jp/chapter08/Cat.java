package co.jp.chapter08;

public class Cat extends Animal{ //“继承（extend）”要写在子类

	public String mao;

	
	public Cat(String name, int age, int legs, String mao) {
	super(name, age, legs);
	this.mao = mao;
	//必须把子类（新的属性）放在父类（super）的下面
}

	void run() {
		System.out.println("cat is running!");
	}
	
	//利用Override来继承speck
	@Override
	void speck() {
		super.speck();
		System.out.println("Mewo");
}
	
	
}
