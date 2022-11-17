package co.jp.chapter09_2;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("huahua");
		Dog dog = new Dog("caocao");

		System.out.println("猫の名前は：" + cat.getName());
		
		cat.sayHello();
		
		System.out.println("犬の名前は" + dog.getName());
		
		dog.sayHello();
		
	
		
		
	
	}


}
