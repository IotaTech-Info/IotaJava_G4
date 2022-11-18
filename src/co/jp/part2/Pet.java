package co.jp.part2;

public abstract class Pet {
	String name;
	
	String master;

	int age;

	int size;
	
	Type type;
	
	Boolean health;
	
	int code;

	abstract void eat();
	
	public enum Type{
		DOG,
		CAT,
		BIRD,
		MAX
	};

}
