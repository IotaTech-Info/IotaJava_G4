package co.jp.Part2_Presentation;

public abstract class Pet {

	public String name;
	public int age;
	public String type;

	public static int COUNT = 0;

	
	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Pet() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}


	void eat() {
	}


}
