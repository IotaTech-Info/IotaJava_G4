package co.jp.part3_PetHotel;


public class Bird extends Pet implements Fly{

    public Bird() {
    }

    public Bird(String name, int age, String type) {
        super(name, age, type);
    }
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
    @Override
	public void eat() {
		System.out.println("Bird is eating");
	}

}
