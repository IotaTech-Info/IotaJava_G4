package co.jp.PetHotel;

public class Cat extends Pet implements Run,Sleep{
	
	private String catFood;
	

	public String getCatFood() {
		return catFood;
	}


	public void setCatFood(String catFood) {
		this.catFood = catFood;
	}


	@Override
	void eat() {
		
	}
	
	// Overload
	void eat(String catFood) {
		System.out.println("Your cat is eating " + catFood);
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


	@Override
	public void sleep(String name) {
		System.out.println(name + " is sleeping!");
		for (int i = 0; i <= 3; i++) {
			System.out.println(i * 10 + "分");
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}


	@Override
	public void run(String name) {
		System.out.println(name + " is running!");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i * 10 + "%");
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		
	}
	

}
