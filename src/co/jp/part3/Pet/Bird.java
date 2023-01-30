package co.jp.part3.Pet;

import co.jp.part3.Pet.Petin.Fly;

public class Bird extends Pet implements Fly{

	public Bird(String name,int age,String type) {
		super.name=name;
		super.age=age;
		super.type=type;
		
	}
	@Override
	public void fly() {
		System.out.println("Bird is flying to hotel");
		
	}

	@Override
	public void eat() {
		System.out.println("ヾ(・Θ・)ノ〃");
	}

}
