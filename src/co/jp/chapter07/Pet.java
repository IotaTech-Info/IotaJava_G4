package co.jp.chapter07;

public class Pet {
	static int COUNT=0;
	private final String name;
	private final int age;
	private final int legs;
	private final String master;
	public Pet(String name,int age,int legs,String master) {
		this.name=name;
		this.age=age;
		this.legs=legs;
		this.master=master;
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
	public String getMaster() {
		return master;
	}
}
