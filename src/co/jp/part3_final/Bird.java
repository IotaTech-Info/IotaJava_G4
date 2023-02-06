package co.jp.part3_final;

public class Bird extends Pet implements Fly{
	public Bird(String name) {
		super(name, FOOD_TYPE.BIRD_FOOD);
	}

	@Override
	public void active() {
		fly();
	}

	@Override
	public void fly() {
		System.out.println(name + "正在天上飞");
	}
}
