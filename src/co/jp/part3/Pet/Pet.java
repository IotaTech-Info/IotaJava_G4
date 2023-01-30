package co.jp.part3.Pet;

public abstract class Pet {

	String name;

	int age;

	String type;
	
	public abstract void eat();


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}
	
}
