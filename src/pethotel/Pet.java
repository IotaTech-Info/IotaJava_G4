package pethotel;

import java.time.LocalTime;

public  class Pet {
	String name;

	int age;

	String type;

	LocalTime checkinTime= LocalTime.now();
	
	static int COUNT = 0;

	void eat() {
	}

	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		
	}
}




