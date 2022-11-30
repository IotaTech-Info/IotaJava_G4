package co.jp.chapter09;

public class Cat extends Animal {

	public Cat(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name=string;
	}

	@Override
	void sayHello() {
		System.out.println("ニャー");
	}
	
	

}	
