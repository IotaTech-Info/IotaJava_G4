package co.jp.part3.Pet;

import co.jp.part3.Pet.Petin.Run;

public class Dog extends Pet implements Run {

	public Dog(String name,int age,String type) {
		super.name=name;
		super.age=age;
		super.type=type;
		
	}
	@Override
	public void eat() {
		System.out.println("Wang!");

	}

	@Override
	public void run() {
		System.out.println("Dog is running to hotel!");

	}

}
