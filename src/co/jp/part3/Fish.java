package pethotel;

import java.util.Date;

public class Fish extends Pet implements Clean,Swim{
	public Fish(String card, String name, int age, PetType type, int roomNo, Date startDate, Date endDate,
			boolean isIn, boolean isLeave) {
		super(card, name, age, type, roomNo, startDate, endDate, isIn, isLeave);

	}
    private String fishFood;
	

	public String getFishFood() {
		return fishFood;
	}


	public void setFishFood(String fishFood) {
		this.fishFood = fishFood;
	}
	@Override
	public
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	// Overload
	void eat(String fishFood) {
		System.out.println("フィッシュフードをあげました。");
	}


	@Override
	public void swim() {
		System.out.println("元気に泳いでいます！");
		// TODO 自動生成されたメソッド・スタブ
		
	}


	@Override
	public void clean() {
		System.out.println("水槽が掃除されました！");
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
