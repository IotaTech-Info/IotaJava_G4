package co.jp.part2;

public abstract class Pet {

	
	
	String name;

	int age;

	String type;

	public static int COUNT = 0;



	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		COUNT++;
	}

	
	
	
}
