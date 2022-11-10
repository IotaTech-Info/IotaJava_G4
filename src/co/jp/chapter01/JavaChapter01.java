package co.jp.chapter01;

class Animal{
	public String Name;
	public int Age;
	
	public void ShowProfile() {
		System.out.println("名前は" + Name + "," + Age +"歳です");
	}
}

class Cat extends Animal{
	public void Sleep() {
		System.out.println("スースー");
	}
}

public class JavaChapter01 {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.Name = "wowowow";
		cat1.Age = 1;
		cat1.ShowProfile();
		cat1.Sleep();
	}
}
