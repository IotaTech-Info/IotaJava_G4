package co.jp.kimatu;

import java.util.Scanner;

//import co.jp.part2.Checkin;

public class Kimatu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		Animal an = new Animal();
//		Hotel[] hotel = new Hotel[10];
		Scanner common = new Scanner(System.in);

//		String check = common.nextLine();
		Common in = new Common();

		while (true) {
			System.out.println("操作番号を入力してください(1.check||2.checkin||3.checkout(※使用不可||4.sort||5.feed||6.sport||7.search※)||8.exit||9.load)");
			String check = common.nextLine();
			if (check.equals("1")) {
				in.check();
			} else if (check.equals("2")) {
				in.checkin();
			} else if (check.equals("3")) {
				in.checkout();
			} else if (check.equals("4")) {
				in.sort();
			} else if (check.equals("5")) {
				in.feed();
			} else if (check.equals("6")) {
				in.sport();
			} else if (check.equals("7")) {
				in.search();
			}else if (check.equals("9")) {
				in.load();
			}else if (check.equals("8")) {

				System.out.println("操作終了");
				break;

			} else {

				System.out.println("正しい操作を入力してください");

			}

		}

//		Checkin in = new Checkin();
//		in.checkin();
//		
//		System.out.println("----- 実行開始 -----");
//
//		Hotel[] hotel = new Hotel[10];
//
//		String name = "";
//		int age = 0;
//		String type = "";
//
//		System.out.println("hotel: " + Arrays.toString(hotel));
//
//		Scanner sc1 = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
//		Scanner sc3 = new Scanner(System.in);
//
//		for (Hotel.COUNT = 0; Hotel.COUNT < 10; Hotel.COUNT++) {
////		for (;;) {
//			System.out.println("----- ループ開始 -----");
//			System.out.println("ペットの名前を入力してください：");
//			String inname = sc1.nextLine();
//			if ("exit".equals(inname)) {
//				System.out.println("----- ループ終了 -----");
//				break;
//			}
//			name = inname;
//
//			System.out.println("ペットの年齢を入力してください(1以上)：");
//			String inage = sc2.nextLine();
//			if ("exit".equals(inage)) {
//				System.out.println("----- ループ終了 -----");
//				break;
//			} else {
//				while (true) {
//					if (sc2.hasNextInt()) {
////						age = Integer.valueOf(inage);
//						age = sc2.nextInt();
//						break;
//					} else {
//						System.out.println("年齢は数字のみ！");
//						sc2.next();
//					}
//				}
//
//			}
//
//			System.out.println("ペットの種類を入力してください(DOG、CAT或いはBIRD)：");
//			String intype = sc3.nextLine();
//			if ("exit".equals(intype)) {
//				System.out.println("----- ループ終了 -----");
//				break;
//			}
//			type = intype;
////
////			name = inname;
////			age = Integer.valueOf(inage);
////			type = intype;
//
//			// 形式 NAME:金柑 AGE:18 TYPE:DOG
////			String[] input_array = input.split(":");
//
////			// INPUT エラーチェック
////			if (input_array.length < 2) {
////				System.out.println("INPUT形式不正のため、異常終了");
//////				break;
////			}
////
////			if ("NAME".equals(input_array[0])) {
////				name = input_array[0];
////			}
////
////			if ("AGE".equals(input_array[0])) {
////				age = Integer.valueOf(input_array[1]);
////			}
////
////			if ("TYPE".equals(input_array[0])) {
////				type = input_array[2];
////			}
//
//			if (!"".equals(name) && age != 0 && !"".equals(type)) {
//				// input 情報を収集できた時点
//				switch (type) {
//				case "DOG":
//					// TODO DOG
//					Dog dog = new Dog();
//					dog.name = name;
//					dog.age = age;
//					dog.type = type;
//					hotel[Pet.COUNT] = dog;
////					Hotel.COUNT++;
//					break;
//				case "CAT":
//					// TODO CAT
//					Cat cat = new Cat();
//					cat.name = name;
//					cat.age = age;
//					cat.type = type;
//					hotel[Pet.COUNT] = cat;
////					Pet.COUNT++;
//					break;
//				case "BIRD":
//					// TODO BIRD
//					Bird bird = new Bird();
//					bird.name = name;
//					bird.age = age;
//					bird.type = type;
//					hotel[Pet.COUNT] = bird;
////					Pet.COUNT++;
//					break;
//				default:
//					System.out.println("TYPE範囲外のため、異常終了");
//					Pet.COUNT--;
//				}
//
//			}
//
//			System.out.println("入力した文字は=" + inname + "," + age + "," + intype);
//			System.out.println(Arrays.toString(hotel));
//		}
//
//		System.out.println("----- 実行終了 -----");

	}

}
