package co.jp.part3;

import java.util.Date;

import co.jp.prat2.Beans;

public class Bird extends Pet implements Beans{
	
	public Bird(int no, String name,int age,PetType type, int status, Date time) {
		super.no = no;
		super.name=name;
		super.age=age;
		super.type=type;
		super.status = status;
		super.time = time;
	}
	
	@Override
	public void eat() {
		System.out.println("小鸟正在进食");
	}
	
	@Override
	public void beans() {
		
		System.out.println("豆類を食べる");
	}

}
