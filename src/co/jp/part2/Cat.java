package co.jp.part2;

public class Cat extends Pet implements Run{
	
	public Cat(String name) {
		super(name, FOOD_TYPE.CAT_FOOD);
	}

	@Override
	public void active() {
		run();
	}

	@Override
	public void run() {
		System.out.println(name + "正在屋顶上跑");
	}

}
