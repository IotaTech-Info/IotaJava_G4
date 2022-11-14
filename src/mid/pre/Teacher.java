package mid.pre;

public class Teacher extends Person implements teach {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		 System.out.println("teacher have to teaching");

	}

	@Override
	String getName() {
		return gender;
		// TODO Auto-generated method stub
		
	}

	@Override
	int getAge(int age1) {
		
		return age;
		// TODO Auto-generated method stub
		
	}

	@Override
	String getGender() {
		return gender;
		// TODO Auto-generated method stub
		
	}

	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	@Override
	void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;

	}

	@Override
	int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	void setID(int id) {
		// TODO Auto-generated method stub
		this.id = id;
		
	}

}
