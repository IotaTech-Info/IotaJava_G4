package co.jp.chapter09;

public class Dog extends Animal {

	public Dog(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name=string;
	}

	@Override
	void sayHello() {
		System.out.println("ワン");
	}
}
