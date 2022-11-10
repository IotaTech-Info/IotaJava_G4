package co.jp.chapter05;

public class pet {
	
	static int COUNT = 0;
	
	private final String name;
	private final int age;
	private final int legs;
	private final String zhuren_name;

	
	
	public pet (String name, int age, int  legs, String zhuren_name) {
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.zhuren_name = zhuren_name;
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

	public String getZhuren() {
		return zhuren_name;
	}
	
}
