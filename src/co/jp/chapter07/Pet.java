package co.jp.chapter07;

public class Pet {
	private final String name;
	private final int age;
	private final String zhurenname;
	
	public Pet(String name, int age, String zhurenname) {
		this.name = name;
		this.age = age;
		this.zhurenname = zhurenname;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getZhurenname() {
		return zhurenname;
	}
	
	

}
