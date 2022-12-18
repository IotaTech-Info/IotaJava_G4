package co.jp.chapter10;

public class Pet {
	public String name;
	public int age;
	public Type type;
	
	Pet(String name, int age, int type_num){
		this.name = name;
		this.age = age;
		if(type_num == 0) {
			this.type = Type.Cat;
		}
		else if(type_num == 1) {
			this.type = Type.Dog;
		}
		else {
			//error
		}
	}
}
