package co.jp.Part2_Presentation;

public abstract class Pet {

	String name;
	int age;
	String type;

	static int COUNT = 0;

	abstract void eat();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int count) {
		COUNT = count;
	}

	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public enum DC {
		DOG,
		CAT
	}

}
