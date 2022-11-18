package co.jp.PetHotel;
public class Cat extends Pet implements Run{
  

    public Cat(String name, int age, String type) {
        super(name, age, type);
    }
    public Cat() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	@Override
    public void run() {
        System.out.println("Cat is running.");
    }
    @Override
	public void eat() {
		System.out.println("Cat is eating");
	}


}
