package co.jp.part2;

public class Bird extends Pet implements Birdcage {
	Bird(String name, int age, SEX sex){
		super(name, age, "bird", sex);
	}
	
	Bird(String name, int age){
		super(name, age, "bird");
	}
	@Override
	public void cage() {
		System.out.println("Bird " + this.name + "はBirdcageが必要だ．");
	}
	@Override
	public void checkin() {
		System.out.println("Bird " + this.name + "チェックインしました．");
	}
}
