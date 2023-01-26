//11月18日　gitへアップ用更新
package co.jp.part3;

public abstract class Pet {

	String name;
	int age;
	String type;
	static int COUNT = 0;

	public Pet(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

}
