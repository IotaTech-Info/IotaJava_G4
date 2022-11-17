package co.jp.part2;

public abstract class Pet {

	
	public String name;
	public int age;
	public String type;
	
	
	
	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	abstract void speck();
	
	void feed() {
		System.out.println(type +" "+name + "was fed.");
	}
}
