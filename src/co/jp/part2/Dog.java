package co.jp.part2;

public class Dog extends Pet implements Cage {
	
	Dog(String name, int age, SEX sex){
		super(name, age, "dog", sex);
	}
	
	Dog(String name, int age){
		super(name, age, "dog");
	}
	
	@Override
	public void cage() {
		System.out.println("Dog " + this.name + "はCageが必要だ．");
	}
	
	@Override
	public void checkin() {
		System.out.println("Dog " + this.name + "チェックインしました．");
	}
}
