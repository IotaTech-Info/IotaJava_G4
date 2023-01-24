package co.jp.part3;

public abstract class Pet {
	public String name;
	public int age;
	public String type;
	public SEX sex;
	public static int COUNT = 0 ;
	public String checktime;
	
	Pet(String name, int age, String type, SEX sex){
		this.name = name;
		this.age = age;
		this.type = type;
		this.sex = sex;
		COUNT++;
	}
	Pet(String name, int age, String type){
		this.name = name;
		this.age = age;
		this.type = type;
		this.sex = SEX.NONE;
		COUNT++;
	}
	
	public abstract void checkin() ;
}
