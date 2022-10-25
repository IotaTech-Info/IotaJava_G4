package co.jp.chapter01;



import java.util.Scanner;

public class JavaChapter01 {
	public static void main(String[] args) {
		
		String Dog_Name;
		int Dog_Age;
		
		Dog MyDog = new Dog();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ワンちゃんの名前を入力してください");
		Dog_Name = scanner.next();
		
		System.out.println("ワンちゃんの年齢を入力してください");
		Dog_Age = scanner.nextInt();
		
		MyDog.SetName(Dog_Name);
		MyDog.SetAge(Dog_Age);
		MyDog.ShowProfile();
		
	}
}
		
		
	class Dog
	{
		private String Name;
		private int Age;
		
		public void SetName( String nm )
		{
			Name = nm;
		}
		public void SetAge(int age) {
			Age = age;
		}
		
		public void ShowProfile()
		{
			System.out.println("名前は、" + Name + "です。");
			System.out.println("年齢は" + Age + "歳です。");
		}
	}




