package co.jp.Chapter07;

public class Chapter07 {
	//class以下method
	//执行Java时必须有method
	public static void main(String[] args) {
		
		//String str_0 = "abcd";
		//String str = new String("efgh");
		
		pet pet = new pet("Vegetable Chicken",99,10,"Law");
		
		//System.out.println(pet.getName());
		
		pet pet2 = new pet("caiji",100,4,"Bai");
		
		System.out.println(pet.getHost_name());
		System.out.println(pet2.getHost_name());
		
		
		
	//class以下可以放变数		
	int a = 10;
	
	
	
	
	}

}
