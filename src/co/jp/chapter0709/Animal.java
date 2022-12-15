package co.jp.chapter0709;

public class Animal {
	
	public String name;
	public int age;
	public String type;
	
	public Animal(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void sayHello(){
		System.out.println("miao");
	}

	public String getName() {
		return name;
	}

}
