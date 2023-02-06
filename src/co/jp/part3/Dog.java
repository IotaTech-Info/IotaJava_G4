package co.jp.part3;

import java.util.Date;

import co.jp.prat2.Beans;
import co.jp.prat2.Meat;

public class Dog extends Pet implements Meat,Beans {
	
	public Dog(int no, String name,int age,PetType type, int status, Date time) {
		super.no = no;
		super.name=name;
		super.age=age;
		super.type=type;
		super.status = status;
		super.time = time;
	}
	
	@Override
	public void eat() {
		System.out.println("小狗正在进食");
	}
	
	@Override
	public void meat() {
		
		System.out.println("肉を食べる");

	}

	@Override
	public void beans() {
		
		System.out.println("豆類を食べる");
		
	}


}
