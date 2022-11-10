package co.jp.test;

public class Dog {

	private String Name;
	private int Age;
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public void ShowProfile() {
		System.out.println("名前は："+Name+"です!");
		System.out.println("年齢は："+Age+"才です!");
	}
	
	
}
