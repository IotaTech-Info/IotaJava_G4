package co.jp.chapter08;

import co.jp.Leg;

public class Cat extends Animal{
	
	Leg[] leg;
	
	public Cat(String name, int age, int legs, String mao) {
		super(name, age, legs);
		this.mao = mao;
	}

	public String mao;
}
