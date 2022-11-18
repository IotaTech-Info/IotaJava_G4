//11月18日　gitへアップ用更新
package co.jp.part2;

import java.util.Scanner;

@SuppressWarnings("resource")
public class HotelCheckOut {
	public static void CheckOut(Hotel[] hotel) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1から" + hotel.length + "まで退却したい部屋番号を教えてください");

		int ckout = sc1.nextInt();
		if (ckout > hotel.length) {
			System.out.println("入力ミスのせいで、メニューに戻る");
			CheckOut(hotel);
		} else {
			if (hotel[ckout - 1].status == "在住") {
				hotel[ckout - 1] = new Hotel("", 0, "", "空");
				System.out.println(ckout + "号室をチェックアウトしました。");
			} else {
				System.out.println(ckout + "号室はチェックアウト必要がない。");
			}

		}

	}

}
