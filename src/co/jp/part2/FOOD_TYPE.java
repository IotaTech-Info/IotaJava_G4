package co.jp.part2;

public enum FOOD_TYPE {
	DOG_FOOD("狗粮", 500),
	CAT_FOOD("猫粮", 300),
	BIRD_FOOD("小米", 100);
	
	final String name;
	final double price;
	
	FOOD_TYPE (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
}
