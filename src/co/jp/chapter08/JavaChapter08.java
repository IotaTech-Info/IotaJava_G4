package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//new class
		Animal an = new Animal("hello kit", 5, 4);
		
		an.name = "動物";
		
		System.out.println(an.name);
		
		// sub class
		Cat cat = new Cat("hello", 5, 4, "fuwafuwa");
		
		cat.name = "hellokitty";
		
		cat.mao = "fuafua";
		
		cat.run();
		
		cat.speck();
		
		//sub class bird
		Bird bird = new Bird("hawk", 1, 2, "big wings");
		System.out.println(bird.wing);
	}
	
}
