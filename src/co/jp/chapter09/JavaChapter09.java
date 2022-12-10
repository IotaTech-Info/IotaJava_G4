package co.jp.chapter09;

public class JavaChapter09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		SEX sex = SEX.MAN;


		System.out.println(sex.getKanji());
		System.out.println(sex.getCode());
		System.out.println(sex.getEtc());


		String man = SEX.MAN.getKanji();

		System.out.println(man);



		// ①一般
		// Frog imp Run , Swim

		// ②内部クラス
//		InnerClass inc = new InnerClass();
//		inc.run();
//
//		// ③匿名クラス
//		Run obj = new Run() {
//			@Override
//			public void run() {
//				System.out.println("is running");
//
//			}
//		};
//		obj.run();
//
//		Swim obj_2 = new Swim() {
//			@Override
//			public void swim() {
//				System.out.println("is swim");
//
//			}
//		};
//		obj_2.swim();


//		// ④　lambda
//	    Run run_obj = (a, b) -> {
//	    	System.out.println(a + "(lambda)is running!");
//	    	System.out.println("age:" + b);
//	    };
//
//	    run_obj.run2("hello kitty!", 5);


	}

//	static class InnerClass implements Run {
//
//		@Override
//		public void run() {
//			System.out.println("is running");
//
//		}
//
//		static class InnerInnerClass {
//
//		}
//
//	}

}
