package part2;

public class Dog extends Pet implements  Toy,Clean {
    private String dogFood;
	

	public String getDogFood() {
		return dogFood;
	}


	public void setDogFood(String dogFood) {
		this.dogFood = dogFood;
	}

	@Override
	public void clean(String name) {
		System.out.println(name + "'s room is cleaned!");
		// TODO 自動生成されたメソッド・スタブ
		
	}

	

	@Override
	void feed() {
		
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	// Overload
	void feed(String dogFood) {
		System.out.println("Your dog is feeded " + dogFood);
	}


	@Override
	public void toy(String name) {
		
		System.out.println(name + " is enjoying toy time!");
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

	




	

}
