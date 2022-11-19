package co.jp.chapter09;

public abstract class Animal_OOP9 {
	private String name;
	private int age;
	private String type;
	
	
	public Animal_OOP9(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public abstract void sayHello(); 

}
