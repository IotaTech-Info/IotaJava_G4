package co.jp.part2;

public class Cat extends Pet implements Run{
	public Cat(String name,int age, Sex sex, Status status) {
		super();
		this.setName(name);
		this.setSex(sex);
		this.setStatus(status);
		this.setAge(age);
		this.setType("猫");
	}

	@Override
	public void eat() {
		System.out.println(this.getType() + ":" + this.getName() + "　に"+getType()+"のフードを分配する。");

	}

	public void run() {
		System.out.println("猫の散歩:"+getName());
	}

}
