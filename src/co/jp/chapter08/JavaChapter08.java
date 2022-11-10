package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		Animal an=new Animal("猫",3,4);
		
		
		Bird bird= new Bird("Bird1",5,2,"Big");
		System.out.println(bird.name);
		bird.speak();
	}
}
