package co.jp.pethotel;

public abstract class Pet {
	String name;

	int age;

	String type;

	static int COUNT = 0;

	abstract void eat();

	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

}
