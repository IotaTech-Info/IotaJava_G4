package co.jp.prat2;

public class Bird extends Pet implements Beans{
	
	public Bird(String name,int age,String type) {
		super.name=name;
		super.age=age;
		super.type=type;
	}
	

	@Override
	public void beans() {
		
		System.out.println("豆類を食べる");
	}

}
