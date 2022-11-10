package co.jp.animal;

import java.util.Scanner;

public class AnimalStart {
	public static void main(String[] args) {
		Cat cat=new Cat();
		String name=new String();
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("猫の名前入れてください");
		name=sc.next();
		System.out.println("年齢は？");
		age=sc.nextInt();
		
		cat.name=name;
		cat.age=age;
		
		cat.ShowProfile();
		cat.Sleep();
	}
}
