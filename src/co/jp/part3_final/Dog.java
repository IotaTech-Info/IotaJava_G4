package co.jp.part3_final;

public class Dog extends Pet implements Run{
	
	public Dog(String name) {
		super(name, FOOD_TYPE.DOG_FOOD);
	}

	@Override
	public void active() {
		run();
	}

	@Override
	public void run() {
		System.out.println(name + "正在花园里跑");
	}
	
}
