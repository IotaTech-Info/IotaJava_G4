package co.jp.chapter01;

class Animal{
	public String Name;
	public int Age;
	
	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	public void ShowProfile() {
		System.out.println("名前：" + Name +","+Age+"歳です。");
	}
}
class Cat extends Animal{
	
	public void Sleep() {
		System.out.println("スースー");
	}
}

public class test_9 {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.setName("Haruko");
		myCat.setAge(3);
		myCat.ShowProfile();
		myCat.Sleep();
	}

}
