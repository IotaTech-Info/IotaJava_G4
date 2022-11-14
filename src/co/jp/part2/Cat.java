package co.jp.part2;

public class Cat extends Pet implements Cage {
	Cat(String name, int age, SEX sex){
		super(name, age, "cat", sex);
	}
	
	Cat(String name, int age){
		super(name, age, "cat");
	}
	@Override
	public void cage() {
		System.out.println("Cat " + this.name + "はCageが必要だ．");
	}
	@Override
	public void checkin() {
		System.out.println("Cat " + this.name + "チェックインしました．");
	}
}
