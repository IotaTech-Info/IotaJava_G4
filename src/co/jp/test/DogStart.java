package co.jp.test;

import java.util.Scanner;

public class DogStart {

	public static void main(String[] args) {
		Dog dog=new Dog();
		String name=new String();
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("犬の名前入れてください");
		name=sc.next();
		System.out.println("年齢は？");
		age=sc.nextInt();
		
		dog.setName(name);
		dog.setAge(age);
		
		dog.ShowProfile();
	}

}
