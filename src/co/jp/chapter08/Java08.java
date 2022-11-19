package co.jp.chapter08;

public class Java08 {
	
	public static void main(String[] args) {
	
		Animal an = new Animal("dongwu", 5, 4);
		
		System.out.println(an.name);
	
		Cat cat = new Cat("hello",5 ,4, "fuafua");
		
		System.out.println(cat.name);
		System.out.println(cat.mao);
		
		Bird bird = new Bird("pas", 6, 9, "ee");
		
		System.out.println(bird.name);
		System.out.println(bird.niao);
	}

}
