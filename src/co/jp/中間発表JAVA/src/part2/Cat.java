package part2;

public class Cat extends Pet implements Toy,Clean{
	private String catFood;
	

	public String getCatFood() {
		return catFood;
	}


	public void setCatFood(String catFood) {
		this.catFood = catFood;
	}


	@Override
	void feed() {
		
	}
	
	// Overload
	void feed(String catFood) {
		System.out.println("Your cat is feeded " + catFood);
	}

	@Override
	public void clean(String name) {
		System.out.println(name + "'s room is cleaned!");
		// TODO 自動生成されたメソッド・スタブ
		
	}

	



	@Override
	public void toy(String name) {
		System.out.println(name + " is enjoying toy time!");
		// TODO 自動生成されたメソッド・スタブ
		
	}



	

}
