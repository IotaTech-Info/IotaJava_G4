package co.jp.PetHotel;

public class Bird extends Pet{

	private String birdFood;
	
	
	public String getBirdFood() {
		return birdFood;
	}


	public void setBirdFood(String birdFood) {
		this.birdFood = birdFood;
	}


	@Override
	void eat() {
		
	}
	
	// Overload
	void eat(String birdFood) {
		System.out.println("Your bird is eating " + birdFood);
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
