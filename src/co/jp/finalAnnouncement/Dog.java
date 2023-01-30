package co.jp.finalAnnouncement;

public class Dog extends Pet implements Run {

	public Dog(String name, String type, String ownerName) {
		super(name, type, ownerName);
	}

	@Override
	public void run() {	
		System.out.println(getName() + " is running like a Supercar!");
	}

	@Override
	void speck() {
		System.out.println(getName() + " says I had a great time!");
	}	

}
