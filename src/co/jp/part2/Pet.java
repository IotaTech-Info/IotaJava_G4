package co.jp.presentation;

public abstract class Pet extends AnimalHotelTest  {
	static int COUNT = 0;
	
	private String name;
	
	private String type;
	
    private int age;
	
    
 //　PETの食べる機能
	abstract void eat();
	
	
	
	public Pet(String name,String type,int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		COUNT++;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

	
	

}
