package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ





//		int a = 0;
//		int b = 1;
//
//		if (a == b) {
//			System.out.println("a=b");
//		} else {
//			System.out.println("a!=b");
//		}

		// loop for

		System.out.println("loop start");

//		int l = 50;
//
//		// 0123456789 10(11番目)
//		for (int i = 0; i < l; i++) {
//			for (int j = 0; j < l; j++) {
////				System.out.print("i=" + i + ": j=" + j + "   ");
//				// <?>
//				if (i == j || i + j == l - 1) {
//					System.out.print("" + i + j + " ");
//				} else {
//					// 処理なし
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}

//		int flg = 0;
//
//		// while
//
//		int index = 0;
//
//		System.out.print("while:");
//		while (index < flg) {
//			System.out.print(index + ",");
//			index++;
//		}
//		System.out.println();
//
//
//
//		int index_2 = 0;
//		System.out.print("for:");
//		for (;index_2 < flg;) {
//			System.out.print(index_2 + ",");
//			index_2++;
//		}
//		System.out.println();
//
//
//		// do while
//		int index_3 = 0;
//		System.out.print("do while:");
//		do {
//			System.out.print(index_3 + ",");
//			index_3++;
//		} while(index_3 < flg);
//		System.out.println();
//

		// break

		int end_flg = 100;
		for (int i = 0; i < end_flg; i++) {

			if (i % 2 > 0) {
				continue;
			}

			System.out.print(i + ",");

			if (i == 50) {
				break;
			}


		}
		System.out.println();

//		for (int i = 10; i >= 0 ; i--) {
//			System.out.println(i);
//		}

//		int index = 0;
//		// dead loop
//		for (;;) {
//			System.out.println(index);
//			index++;// index = index + 1;
//
//			if (index > 10) {
//				break;
//			} else {
//				continue;
//			}
//
////			i++;
//		}

		// dead code

		System.out.println("loop end");

//		// if else
//
////		int a = 1;
////		int b = 1;
////
////		if (a == b) {
////
////			// true
////			System.out.println("a = b");
////
////		} else {
////
////			// false
////			System.out.println("a != b");
////
////		}
//
////
//		int age = 0;
//
//		if (age <= 6) {
//			System.out.println("幼児：無料");
//		} else if (age > 6 && age <= 12) {
//			System.out.println("小学生：100円");
//
//		} else if (age > 12 && age <= 18) {
//			System.out.println("中高生：500円");
//
//		} else {
//			System.out.println("大人：1000円");
//		}
//
//		switch (age) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//			System.out.println("幼児：無料");
//			break;
//		case 7:
//		case 8:
//		case 9:
//		case 10:
//		case 11:
//		case 12:
//			System.out.println("小学生：100円");
//			break;
//		case 13:
//		case 14:
//		case 15:
//		case 16:
//		case 17:
//		case 18:
//			System.out.println("中高生：500円");
//			break;
//		default:
//			System.out.println("大人：1000円");
//		}
//
////
//
////		int x = 6;
////
////		if (x > 0) {
////			x = x + 1;
////			System.out.println(x);
////		}
////
//////		else {
//////			// 処理なし
//////		}
////
////		String sex = "男性";
////		int age = 19;
////
////		if ("男性".equals(sex)) {
////			if (age > 18) {
////				System.out.println("man");
////			} else {
////				System.out.println("boy");
////			}
////		} else {
////			if (age > 18) {
////				System.out.println("woman");
////			} else {
////				System.out.println("girl");
////			}
////		}
//
////		String sex = "男性";
////		int age = 19;
////
////		switch (sex) {
////		case "男性":
////			if (age > 18) {
////				System.out.println("man");
////			} else {
////				System.out.println("boy");
////			}
////			break;
////		default:
////			if (age > 18) {
////				System.out.println("woman");
////			} else {
////				System.out.println("girl");
////			}
////		}

//		String a;
//		String b = null;
//
////		System.out.println(a);
//		System.out.println(b);

	}
}