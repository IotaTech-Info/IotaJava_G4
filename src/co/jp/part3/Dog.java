package pethotel;

import java.util.Date;

public class Dog extends Pet implements Toy,Clean{
	public Dog(String card, String name, int age, PetType type, int roomNo, Date startDate, Date endDate,
			boolean isIn, boolean isLeave) {
		super(card, name, age, type, roomNo, startDate, endDate, isIn, isLeave);
	}
private String dogFood;
	

	public String getDogFood() {
		return dogFood;
	}


	public void setDogFood(String dogFood) {
		this.dogFood = dogFood;
	}


	@Override
	public
	void eat() {
		
	}
	
	// Overload
	void eat(String dogFood) {
		System.out.println("ドッグフードをあげました。 ");
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
