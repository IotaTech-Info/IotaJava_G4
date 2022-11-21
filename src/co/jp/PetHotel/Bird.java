package co.jp.PetHotel;

public class Bird extends Pet implements Fly{

	public Bird(String name, String type, String ownerName) {
		super(name, type, ownerName);
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying like a Jet!");	
	}

	@Override
	void speck() {
		System.out.println(getName() + " says Wow! That was a wonderfer garden!");		
	}

	

}
