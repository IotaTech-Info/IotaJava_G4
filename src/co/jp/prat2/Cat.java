package co.jp.prat2;

public class Cat extends Pet implements Meat {
	
	public Cat(String name,int age,String type) {
		super.name=name;
		super.age=age;
		super.type=type;
		
	}
	
	
		
	@Override
	public void meat(){
		
		System.out.println("肉を食べる");
		
	}


		

}
