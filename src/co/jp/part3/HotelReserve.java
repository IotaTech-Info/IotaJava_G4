//11月18日　gitへアップ用更新
package co.jp.part3;

import java.util.Scanner;

@SuppressWarnings("resource")
public class HotelReserve {
	public static void Reserve(Hotel[] hotel) {

		for (int i = 0; i < hotel.length; i++) {
			if (hotel[i].status == "空") {
				System.out.println((i + 1) + "号室は予約できます");
			}
		}

		System.out.println("１；部屋を予約。２：予約キャンセル。３:退出");
		Scanner remenu = new Scanner(System.in);
		if (!remenu.hasNextInt()) {
			System.out.println("入力ミスのせいで、メニューに戻る");
			Reserve(hotel);
		}
		int re = remenu.nextInt();
		if (re == 1) {
			System.out.println("1から" + hotel.length + "まで、予約したい部屋番後を入力してください");
			remenu = new Scanner(System.in);

			re = remenu.nextInt();
			try {
				SystemInCheck.SystemIn(re, hotel);
				if (hotel[re - 1].status.equals("空")) {

					hotel[re - 1].status = "予約";
					System.out.println(re + "号室を予約しました。");

				} else {
					System.out.println("この部屋は予約できない他の部屋を入力してください");
					Reserve(hotel);

				}
			} catch (SystemInCheck e) {
				// TODO 自動生成された catch ブロック
				System.out.println("入力ミスのせいで、メニューに戻る");
				Reserve(hotel);
			}

		} else if (re == 2) {

			for (int i = 0; i < hotel.length; i++) {
				if (hotel[i].status == "予約") {
					System.out.println((i + 1) + "号室は予約しています");
				}
			}

			System.out.println("予約をキャンセルしたい部屋番後を入力してください");
			remenu = new Scanner(System.in);

			re = remenu.nextInt();
			try {
				SystemInCheck.SystemIn(re, hotel);
				if (hotel[re - 1].status.equals("予約")) {
					hotel[re - 1].status = "空";

					System.out.println(re + "号室の予約をキャンセルしました。");
				} else {
					System.out.println("この部屋は予約していない");
					Reserve(hotel);
				}
			} catch (SystemInCheck e) {
				// TODO 自動生成された catch ブロック
				System.out.println("入力ミスのせいで、メニューに戻る");
				Reserve(hotel);

			}
		}

		else if (re == 3) {

		} else {
			System.out.println("入力ミスのせいで、メニューに戻る");
			Reserve(hotel);
		}

	}
}
