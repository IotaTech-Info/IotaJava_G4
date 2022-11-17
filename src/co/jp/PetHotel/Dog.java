package co.jp.PetHotel;

public class Dog extends Pet{

	private String dogFood;
	
	public String getDogFood() {
		return dogFood;
	}

	public void setDogFood(String dogFood) {
		this.dogFood = dogFood;
	}

	@Override
	void eat() {
		
	}
	
	// Overload
	void eat(String dogFood) {
		System.out.println("Your dog is eating " + dogFood);
		for(int i = 0; i <=10; i++) {
			System.out.println(i * 10 + "%");
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println("Eating is over!");
	}


}
