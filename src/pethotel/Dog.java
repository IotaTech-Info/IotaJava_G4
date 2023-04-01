package pethotel;

public class Dog extends Pet implements Run {

	
	public Dog(String name, int age, String type) {
		super(name, age, type);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	@Override
	void eat() {
		System.out.println("吃狗粮");
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

	}

}