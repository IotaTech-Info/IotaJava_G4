package co.jp.part3;

import java.util.Date;

public class Pig extends Animal {
	public Pig(String card, String name, int age, AnimalType type, int roomNo, Date startDate, Date endDate,
			boolean isIn, boolean isLeave) {
		super(card, name, age, type, roomNo, startDate, endDate, isIn, isLeave);
	}

	@Override
	public void eat() {
		System.out.println("小猫正在吃饲料");
	}
}