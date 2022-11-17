package co.jp.OOPrensyu;

public class Animal {
	String name;
	int age;
	String type;
//	public Animal(String name) {
//		// TODO 自動生成されたコンストラクター・スタブ
//		this.name = name;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}
