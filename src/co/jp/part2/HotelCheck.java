package co.jp.part2;

import java.util.Scanner;

@SuppressWarnings("resource")
public class HotelCheck {
//検索
	public static void Check(Hotel[] hotel) {
//どのような検索したい
		System.out.println("１；すべての部屋を確認。２：一つの部屋を確認。３：退出");
		Scanner ckmenu = new Scanner(System.in);
		int ck = ckmenu.nextInt();
		if (ck == 1) {

			System.out.println("すべての部屋を確認");
			for (int i = 0; i < hotel.length; i++) {

				if (hotel[i].status.equals("空")) {
					System.out.println((i + 1) + "号室：空き");

				} else if (hotel[i].status.equals("予約")) {
					System.out.println((i + 1) + "号室：予約済");

				} else {
					System.out.println((i + 1) + "号室：ペット情報");
					System.out.println("ペットの名前は" + hotel[i].name);
					System.out.println("ペットの年齢" + hotel[i].age);
					System.out.println("ペットのタイプ" + hotel[i].type);

				}
			}

		} else if (ck == 2) {

			System.out.println("1から" + hotel.length + "まで、確認したい部屋番後を入力してください");
			ckmenu = new Scanner(System.in);

			ck = ckmenu.nextInt();
			if (ck > hotel.length) {
				System.out.println("入力ミスのせいで、メニューに戻る");
				Check(hotel);

			} else if (hotel[ck - 1].status.equals("空")) {
				System.out.println(ck + "号室：空き");

			} else if (hotel[ck - 1].status.equals("予約")) {
				System.out.println(ck + "号室：予約済");

			} else {
				System.out.println(ck + "号室：ペット情報");
				System.out.println("ペットの名前は" + hotel[ck - 1].name);
				System.out.println("ペットの年齢" + hotel[ck - 1].age);
				System.out.println("ペットのタイプ" + hotel[ck - 1].type);

			}

		} else if (ck == 3) {
		} else {
			System.out.println("入力ミスのせいで、メニューに戻る");
			Check(hotel);
		}

	}
}
