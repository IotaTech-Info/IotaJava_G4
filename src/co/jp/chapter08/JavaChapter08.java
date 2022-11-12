package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		//parent class
		Animal animal = new Animal("animal", 5, 4);
		animal.name = "animal";
		System.out.println(animal.name);
		
		//subclass
		Cat cat = new Cat("kitty", 5, 4, "fuafua");
		System.out.println(cat.name);
		
		Bird bird = new Bird("bage", 5, 4, "gugu");
		System.out.println(bird.name);
		System.out.println(bird.legs);
		

	}

}
