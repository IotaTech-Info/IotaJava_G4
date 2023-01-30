package co.jp.finalAnnouncement;

public class Cat extends Pet implements Dance{

	public Cat(String name, String type, String ownerName) {
		super(name, type, ownerName);
	}

	@Override
	public void dance() {
		System.out.println(getName() + " is dancing like an Angle!");	
	}

	@Override
	void speck() {
		System.out.println(getName() + " says 哼~It's ok");	
	}
	
	

}
