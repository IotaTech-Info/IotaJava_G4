package co.jp.mid_pre;

public class Student extends Person implements study {

	@Override
	public void study() {
		// TODO Auto-generated method stub
		 System.out.println("student have to study");
	}

	@Override
	String getName() {
		return gender;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	int getAge(int age1) {
		// TODO Auto-generated method stub
		return age;
	}
	

	//overload
	String getAge(String str) {
		// TODO Auto-generated method stub
		if (str == "privacy" ) {
			return "age can not show";
		} else {
			return  Integer.toString(age);
		}
	}
	
	@Override
	String getGender() {
		return gender;
		// TODO Auto-generated method stubs
		
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
