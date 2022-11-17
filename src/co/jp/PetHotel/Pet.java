package co.jp.PetHotel;

public abstract class Pet {
	
	String name;

	float age;

	String type;
	
	private String owner_name;
	
	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	static int COUNT = 0;

	abstract void eat();

}


