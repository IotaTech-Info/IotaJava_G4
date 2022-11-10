package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {

		Animal an = new Animal("動物", 5, 4);

		an.name = "動物";
		an.speck();

//		System.out.println(an.name);

		Cat cat = new Cat("Macha", 4, 4, "fuafua");

		cat.name = "macha";
		cat.speck();

//		System.out.println(cat.name);

		Bird bird = new Bird("フェニックス", 4, 2, "fly");
//		System.out.println(bird.name);
//		bird.fly();
	}

}
