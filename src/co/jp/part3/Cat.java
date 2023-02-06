package co.jp.part3;

import java.util.Date;

import co.jp.prat2.Meat;

public class Cat extends Pet implements Meat {
	
	public Cat(int no, String name, int age,PetType type, int status, Date time) {
		super.no = no;
		super.name=name;
		super.age=age;
		super.type=type;
		super.status = status;
		super.time = time;
	}
	
	@Override
	public void eat() {
		System.out.println("小猫正在进食");
	}
		
	@Override
	public void meat(){
		
		System.out.println("肉を食べる");
		
	}


		

}
