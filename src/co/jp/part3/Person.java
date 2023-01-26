package co.jp.part3;

public abstract class Person {

	String name;

	int age;

	String gender;
	
	int id;
	//Data
	String checkInData;
	abstract String getCheckInData();
	abstract void SetCheckInData(String checkInData);

	
	abstract int getID();
	abstract String getName();
	abstract int getAge(int age);
	abstract String getGender();
	
	abstract void setID(int id);
	abstract void setName(String name);
	abstract void setAge(int age);
	abstract void setGender(String name);
	
	
	

}
