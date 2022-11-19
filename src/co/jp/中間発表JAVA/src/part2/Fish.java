package part2;

public class Fish extends Pet implements Clean,Swim {
    private String fishFood;
	

	public String getFishFood() {
		return fishFood;
	}


	public void setFishFood(String fishFood) {
		this.fishFood = fishFood;
	}

	@Override
	public void swim(String name) {
		
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + " is swimming!");
		
	}

	@Override
	public void clean(String name) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "'s room is cleaned!");
		
	}

	@Override
	void feed() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	// Overload
	void feed(String dogFood) {
		System.out.println("Your fish is feeded " + fishFood);
	}

	

}
