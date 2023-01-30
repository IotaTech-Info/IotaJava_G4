package co.jp.part3;

public abstract class Pet {

	
	
	String name;

	int age;

	String type;
	
	String date;

	public static int COUNT = 0;



	public Pet(String name, int age, String type,String date) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		this.date = date;
		COUNT++;
		
	
		
	}

	
	
	
}

