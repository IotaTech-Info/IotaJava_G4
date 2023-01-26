//11月18日　gitへアップ用更新
package co.jp.part3;

import java.util.Scanner;

@SuppressWarnings("resource")
public class PetHotel {

	public static void main(String[] args) {
		String command;
		MENU menu = null;

		System.out.println("----- 実行開始 -----");

		/* ======================================================== */
		// ホテルを初期化
		int MaxRoom = 10;
		Hotel[] hotel = new Hotel[MaxRoom];
		for (int i = 0; i < MaxRoom; i++) {
			if (hotel[i] == null) {
				hotel[i] = new Hotel("", 0, "", "空", "");
			}
		}

		for (int i = 0; i < MaxRoom; i++) {
			System.out.println((i + 1) + "号室:" + hotel[i].status);

		}

		/* ======================================================== */

		System.out.println("----- ループ開始 -----");
		/* ======================================================== */

		// 実行ループ
		LOOP: for (;;) {
			// メニューの入力
			for (int i = 0; i < MaxRoom; i++) {
				if (hotel[i].status.equals("在住")) {
					System.out.println((i + 1) + "号室:" + hotel[i].type + " " + hotel[i].name + " " + hotel[i].status
							+ " " + hotel[i].age);
				} else {
					System.out.println((i + 1) + "号室: " + hotel[i].status);
				}

			}
			System.out.println("使いたい機能を入力してください;入住，退室，検索，食事，予約，整列，印刷，退出");
			Scanner sc = new Scanner(System.in);

			command = sc.nextLine();
			String[] input_array = command.split("");
			if (input_array.length != 2) {
				System.out.println("入力ミスのせいで、メニューに戻る");
				continue LOOP;
			}
			menu = MENU.valueOf(command.toUpperCase());

			if ("退出".equals(command)) {
				System.out.println("----- ループ終了 -----");
				break;
			}
			Menu(menu, hotel);
		}
		/* ======================================================== */
		System.out.println("----- 実行終了 -----");
	}

	// メニュー関数
	static void Menu(MENU menu, Hotel[] hotel) {

		switch (menu) {
		case 入住:
			HotelCheckIn.CheckIn(hotel);
			break;

		case 退室:
			HotelCheckOut.CheckOut(hotel);
			break;

		case 検索:
			HotelCheck.Check(hotel);
			break;

		case 食事:
			HotelEat.Eat(hotel);
			break;

		case 予約:
			HotelReserve.Reserve(hotel);
			break;
		case 整列:
			// System.out.println("機能が完成していないので、メニュに戻ります");
			HotelSort.Sort(hotel);
			break;

		case 印刷:
			// System.out.println("機能が完成していないので、メニュに戻ります");
			HotelPrintOut.PrintOut(hotel);
			break;
		default:
			System.out.println("INPUT形式不正のため、異常終了");
			break;

		}
	}

}
