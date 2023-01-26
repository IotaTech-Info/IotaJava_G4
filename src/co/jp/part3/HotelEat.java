//11月18日　gitへアップ用更新
package co.jp.part3;

import java.util.Scanner;

@SuppressWarnings("resource")
public class HotelEat {
	public static void Eat(Hotel[] hotel) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("餌をあげたい部屋を入力してください");
		int ckout = sc1.nextInt();
		try {
			SystemInCheck.SystemIn(ckout, hotel);
			if (hotel[ckout - 1].status == "在住") {
				if (hotel[ckout - 1].type.equals("dog")) {
					Dog dog = new Dog(hotel[ckout - 1].name, hotel[ckout - 1].age, hotel[ckout - 1].type, (ckout - 1));
					dog.Eat();
				} else if (hotel[ckout - 1].type.equals("cat")) {
					Cat cat = new Cat(hotel[ckout - 1].name, hotel[ckout - 1].age, hotel[ckout - 1].type, (ckout - 1));
					cat.Eat();
				} else if (hotel[ckout - 1].type.equals("bird")) {
					Bird bird = new Bird(hotel[ckout - 1].name, hotel[ckout - 1].age, hotel[ckout - 1].type,
							(ckout - 1));
					bird.Eat();
				}
			} else {
				System.out.println(ckout + "号室はペットがいない。");
			}

		} catch (SystemInCheck e) {
			// TODO 自動生成された catch ブロック
			System.out.println("入力ミスのせいで、メニューに戻る");
			Eat(hotel);
		}

	}
}
