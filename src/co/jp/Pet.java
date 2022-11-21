package co.jp.part2;

public class Pet {


	    private String type;
	    private int age;
	    private String petName;


	    public Pet() {
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

	    public String getPetName() {
	        return petName;
	    }

	    public void setPetName(String petName) {
	        this.petName = petName;
	    }

	    public Pet(String type, int age, String petName) {
	        this.type = type;
	        this.age = age;
	        this.petName = petName;
	    }

	    @Override
	    public String toString() {
	        return "Pet{" +
	                "type='" + type + '\'' +
	                ", age=" + age +
	                ", petName=" + petName +
	                '}';
	    }
	}
