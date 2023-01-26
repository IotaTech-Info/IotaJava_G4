package co.jp.part3;

import java.util.Date;

public class Cat extends Animal {

	public Cat(String card, String name, int age, AnimalType type, int roomNo, Date startDate, Date endDate,
			boolean isIn, boolean isLeave) {
		super(card, name, age, type, roomNo, startDate, endDate, isIn, isLeave);
// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("小猫正在吃鱼");
	}
}