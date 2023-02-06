package co.jp.part3_final;

public abstract class Pet {
	protected final String name;
	protected FOOD_TYPE food;
	
	public Pet(String name, FOOD_TYPE food) {
		this.name = name;
		this.food = food;
	}
	
	public void eat() {
		System.out.println(name + " 吃了 " + food.getName() + food.getPrice() + "円");
	}
	
	public abstract void active();
	
	public String getName() {
		return name;
	}
	
	public FOOD_TYPE getFood() {
		return food;
	}
}
