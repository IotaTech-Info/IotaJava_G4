package co.jp.chapter09;


public class JavaChapter09 {

	public static void main(String[] args) {
		
//		Cat cat = new Cat();
		
//		一般：Frog imp Run , Swim
//		内部class
//		InnerClass inc = new InnerClass();
//		inc.run();
		
//		匿名class      class name is a number
//		Run obj = new Run() {
//			@Override
//			public void run() {
//				System.out.println("is running");
//			}
//		};     // };
//		obj.run();
//	}
//	内部class
//	static class InnerClass implements Run{
//		@Override
//		public void run() {
//			System.out.println("is running");
//		}
		
		SEX sex = SEX.MAN;
		System.out.println(sex.getKanji());
		
		String man = SEX.MAN.getCode();
		System.out.println(man);
		for(SEX s : SEX.values()) {
			System.out.println(s);
			System.out.println(s.name()); //get Enum's name
		}
		SEX s = SEX.valueOf("MAN"); // Enum value to name
		System.out.println(s.name());
	
	}

}
