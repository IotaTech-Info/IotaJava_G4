//11月18日　gitへアップ用更新
package co.jp.part2;

import java.util.Scanner;

@SuppressWarnings("resource")
public class HotelCheckIn {

	public static void CheckIn(Hotel[] hotel) {

		Scanner sc1 = new Scanner(System.in);
		int age;
		String name;
		String type;

		System.out.println("ペットの種類を入力してください:dog,cat,bird");
		sc1 = new Scanner(System.in);
		type = sc1.nextLine();

		System.out.println("ペットの名前を入力してください");
		sc1 = new Scanner(System.in);
		name = sc1.nextLine();

		System.out.println("ペットの年齢を入力してください");
		sc1 = new Scanner(System.in);
		if (!sc1.hasNextInt()) {
			System.out.println("年齢の入力が間違えています、再入力してください");
			CheckIn(hotel);
		}
		age = sc1.nextInt();

		switch (type) {
		case "dog":
			for (int i = 0; i < hotel.length; i++) {
				if (hotel[i].status.equals("空")) {
					Dog dog = new Dog(name, age, type, i);
					ckin(hotel, dog);
					break;
				}
			}
			break;
		case "cat":
			for (int i = 0; i < hotel.length; i++) {
				if (hotel[i].status.equals("空")) {
					Cat cat = new Cat(name, age, type, i);
					ckin(hotel, cat);
					break;
				}
			}
			break;
		case "bird":
			for (int i = 0; i < hotel.length; i++) {
				if (hotel[i].status.equals("空")) {
					Bird bird = new Bird(name, age, type, i);
					ckin(hotel, bird);
					break;
				}
			}
			break;
		default:
			System.out.println("入力ミスのせいで、再入力してください");
			CheckIn(hotel);
			break;

		}

	}

	static void ckin(Hotel[] hotel, Dog dog) {
		hotel[dog.COUNT] = new Hotel(dog.name, dog.age, dog.type, "在住");
		System.out.println(dog.name + "は" + (dog.COUNT + 1) + "号室に入住しました");

	}

	static void ckin(Hotel[] hotel, Cat cat) {
		hotel[cat.COUNT] = new Hotel(cat.name, cat.age, cat.type, "在住");
		System.out.println(cat.name + "は" + (cat.COUNT + 1) + "号室に入住しました");
	}

	static void ckin(Hotel[] hotel, Bird bird) {
		hotel[bird.COUNT] = new Hotel(bird.name, bird.age, bird.type, "在住");
		System.out.println(bird.name + "は" + (bird.COUNT + 1) + "号室に入住しました");
	}
}
