package co.jp.part3;

public abstract class Pet {
	String name;
	
	int masterCode;

	int age;
	
	Type type;
	
	Boolean health;
	
	int code;

	abstract void eat();
	abstract void love();
	
	public enum Type{
		DOG,
		CAT,
		BIRD,
		MAX
	};


}
