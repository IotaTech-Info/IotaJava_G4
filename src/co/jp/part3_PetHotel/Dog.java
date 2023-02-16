package co.jp.part3_PetHotel;

public class Dog extends Pet implements Run{

    public Dog() {
    }

    public Dog(String name, int age, String type) {
        super(name, age, type);
    }
    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
    @Override
	public void eat() {
		System.out.println("Dog is eating");
	}

   
}
