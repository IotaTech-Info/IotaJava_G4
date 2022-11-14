package mid.pre;

public abstract class Person {

	String name;

	int age;

	String gender;
	
	int id;
	
	
	
	abstract int getID();
	abstract String getName();
	abstract int getAge(int age);
	abstract String getGender();
	
	abstract void setID(int id);
	abstract void setName(String name);
	abstract void setAge(int age);
	abstract void setGender(String name);
	
	
	

}
