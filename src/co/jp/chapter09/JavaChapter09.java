package co.jp.chapter09;


public class JavaChapter09 {

	public static void main(String[] args) {
		
//		Cat cat = new Cat();
		
//		一般：Frog imp Run , Swim
//		内部class
		InnerClass inc = new InnerClass();
		inc.run();
		
//		匿名class      class name is a number
		Run obj = new Run() {
			@Override
			public void run() {
				System.out.println("is running");
			}
		};     // };
		obj.run();
	}
//	内部class
	static class InnerClass implements Run{
		@Override
		public void run() {
			System.out.println("is running");
		}
	}

}
