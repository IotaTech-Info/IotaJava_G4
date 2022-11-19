package co.jp.prat2;

public class Dog extends Pet implements Meat,Beans {
	
	public Dog(String name,int age,String type) {
		super.name=name;
		super.age=age;
		super.type=type;
	}
	

	@Override
	public void meat() {
		
		System.out.println("肉を食べる");

	}

	@Override
	public void beans() {
		
		System.out.println("豆類を食べる");
		
	}


}
