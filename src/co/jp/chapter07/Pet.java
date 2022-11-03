package co.jp.chapter07;

public class Pet {
	static int COUNT = 0;
	
	private final String name;
	private final int age;
	private final int legs;
	private final String master_name;
	
	public Pet(String name, int age, int legs, String master_name) {
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.master_name = master_name;
		COUNT++;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public int getLegs() {
		return legs;
	}
	
	public String getMasterName() {
		return master_name;
	}
}
