package co.jp.part2;

public enum ROOM_TYPE {
	
	BASIC("基础套房", 2000),
	STANDARD("标准套房", 5000),
	SUPERIOR("高级套房", 10000);
	
	final String name;
	final double price;
	
	ROOM_TYPE (String name, double price) {
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
