package co.jp.chapter01;

public class Test {
	public static void main (String[] args) {
		Cat cat = new Cat();
		cat.Name = "小黑";
		cat.Age = 4;
		cat.ShowProfile();
		cat.Sleep();
	}
}

class Animal {
	public String Name;
	public int Age;
	
	public void ShowProfile() {
		System.out.println("名前は、" + Name + "、" + Age + "歳です。");
	}
}

class Cat extends Animal {
	public void Sleep() {
		System.out.println("スース―");
	}
}