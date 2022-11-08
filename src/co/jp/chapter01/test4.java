package co.jp.chapter01;


class Animal
{
	public String Name;
	public int Age;
	
	public void ShowProfile()
	{
		System.out.println("名前は" + Name + "、" + Age + "歳です。");
	}
}

class Cat extends Animal{
	public void Sleep() {
		System.out.println("スース―");
	}
}

public class test4
{
	public static void main( String[] args )
	{
		Cat MyCat = new Cat();
		
		MyCat.Name = "モカ";
		MyCat.Age = 3;
		MyCat.ShowProfile();
		MyCat.Sleep();
	}
}

