package co.jp.chapter07;

public class Pet {

	
	static int COUNT = 0;
	
	private String name;
	private int age;
	private int legs;
	private String owner;
	
	
	public Pet(String name, int age, int legs, String owner) {
		super();
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.setOwner(owner);
		
		COUNT++;
	}

	
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
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	
}
