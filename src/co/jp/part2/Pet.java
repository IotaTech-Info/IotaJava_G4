package co.jp.part2;

public abstract class Pet {

	private String name;

	private int age;

	private String type;

	private Sex sex;
	
	private Status status;
	
	public abstract void eat();

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Sex getSex() {
		return sex;
	}

	public Status getStatus() {
		return status;
	}

	public String getType() {
		return type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + ", type=" + type + ", sex=" + sex + ", status=" + status + "]";
	}
	
	

}
