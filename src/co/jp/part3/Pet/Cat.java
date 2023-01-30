package co.jp.part3.Pet;

import co.jp.part3.Pet.Petin.Run;

public class Cat extends Pet implements Run {

	public Cat(String name,int age,String type) {
		super.name=name;
		super.age=age;
		super.type=type;
		
	}
	@Override
	public void run() {
		System.out.println("Cat is running to hotel!");
	}

	@Override
	public void eat() {
		System.out.println("niao~");
		
	}

}
