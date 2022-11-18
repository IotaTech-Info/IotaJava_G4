package co.jp.part2;

public class Bird extends Pet implements Fly{
	public Bird(String name,int age, Sex sex, Status status) {
		super();
		this.setName(name);
		this.setSex(sex);
		this.setStatus(status);
		this.setAge(age);
		this.setType("鳥");
	}

	@Override
	public void eat() {
		System.out.println(this.getType() + ":" + this.getName() + "　に"+getType()+"のフードを分配する。");
	}


	public void fly() {
		System.out.println("鳥を遊ばせる"+getName());

	}
}
