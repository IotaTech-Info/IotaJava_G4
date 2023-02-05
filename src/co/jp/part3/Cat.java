package pethotel;

import java.util.Date;

public class Cat extends Pet implements Toy,Clean{

	public Cat(String card, String name, int age, PetType type, int roomNo, Date startDate, Date endDate,
			boolean isIn, boolean isLeave) {
		super(card, name, age, type, roomNo, startDate, endDate, isIn, isLeave);
// TODO Auto-generated constructor stub
	}
	
	
    private String catFood;
	

	public String getCatFood() {
		return catFood;
	}


	public void setCatFood(String catFood) {
		this.catFood = catFood;
	}


	@Override
	public
	void eat() {
		
	}
	
	// Overload
	void eat(String catFood) {
		System.out.println("キャットフードをあげました。");
	}


	@Override
	public void clean() {
		System.out.println("部屋が掃除されました！");
		// TODO 自動生成されたメソッド・スタブ
		
	}


	@Override
	public void toy() {
		System.out.println("オモチャをあげました！");
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

	

	
	

	
}
