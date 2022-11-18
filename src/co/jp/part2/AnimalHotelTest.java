package co.jp.presentation;

import java.util.Scanner;

public class AnimalHotelTest {
	public static void main(String[] args) {
		System.out.println("----- 実行開始 -----");

		Hotel h = new Hotel();

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);

		Dog dog = new Dog(null, null, 0);
		Cat cat = new Cat(null, null, 0);
		Bird bird = new Bird(null, null, 0);

		System.out.println("動物ホテルへようこそ");

		for (;;) {
			System.out.println("1:部屋の空室状態(ture:空室　false:占用されている)　2:チェックイン機能（餌やり機能）　3:チェックアウト機能　4:部屋に住んでいる動物数の表示　5:退出");
			int input_num = sc1.nextInt();
			// 1:部屋の空室状態
			if (input_num == 1) {
				// 显示全部房间状态
				h.check();
				// 显示空房数
				h.empty();

				continue;
			}

			// 2:チェックイン機能
			else if (input_num == 2) {

				System.out.println("ペットの情報を入力してください。例：はな,13,DOG");
				String input_message = sc3.nextLine();

				// 形式 名前,年齢,タイプ（DOG ,CAT,BIRDいずれかを入力してください） 例えば：はな,13,DOG
				String[] input_array = input_message.split(",");

				// エラーチェック
				if (input_array.length < 3) {
					System.out.println("INPUT形式不正のため、異常終了");
					continue;
				}
				 
				String name = input_array[0];
				int age = Integer.valueOf(input_array[1]);
				String type = input_array[2];
				
				//エラーチェック
				if (!"".equals(name) && age >= 0 && !"".equals(type)) {

				if (type.equals("DOG")) {
					dog.setType("DOG");
					dog.setName(name);
					dog.setAge(age);
					System.out.println("101-105の部屋にチェックインしてください。");
					System.out.println("部屋番号を入力してください。");
					String roomId = sc2.next();
					int id = Integer.valueOf(roomId);
					if (id >= 101 && id <= 105) {
						h.order(roomId);

						System.out.println("入力した文字は:" + name + "," + age + "," + type);
						System.out.println("ペットの情報は：名前：" + name + " 年齢：" + age + "　タイプ: " + type + " 入住房间号:" + roomId);
						System.out.println("チェックイン完了しました。");
						// 显示全部房间状态
						h.check();
						// 显示空房数
						h.empty();
					} else {
						System.out.println("入力した部屋番号はDOGの部屋ではない、あるいは範囲外");
						continue;
					}

				}

				if (type.equals("CAT")) {
					cat.setType("CAT");
					cat.setName(name);
					cat.setAge(age);
					System.out.println("201-205の部屋にチェックインしてください。");
					System.out.println("部屋番号を入力してください。");
					String roomId = sc2.next();
					int id = Integer.valueOf(roomId);
					if (id >= 201 && id <= 205) {
						h.order(roomId);

						System.out.println("入力した文字は:" + name + "," + age + "," + type);
						System.out.println("ペットの情報は：名前：" + name + " 年齢：" + age + "　タイプ: " + type + " 入住房间号:" + roomId);
						System.out.println("チェックイン完了しました。");
						// 显示全部房间状态
						h.check();
						// 显示空房数
						h.empty();
					} else {
						System.out.println("入力した部屋番号はCATの部屋ではない、あるいは範囲外");
						continue;
					}
				}

				if (type.equals("BIRD")) {
					bird.setType("BIRD");
					bird.setName(name);
					bird.setAge(age);
					System.out.println("301-305の部屋にチェックインしてください。");
					System.out.println("部屋番号を入力してください。");
					String roomId = sc2.next();
					int id = Integer.valueOf(roomId);
					if (id >= 301 && id <= 305) {
						h.order(roomId);

						System.out.println("入力した文字は:" + name + "," + age + "," + type);
						System.out.println("ペットの情報は：名前：" + name + " 年齢：" + age + "　タイプ: " + type + " 入住房间号:" + roomId);
						System.out.println("チェックイン完了しました。");
						// 显示全部房间状态
						h.check();
						// 显示空房数
						h.empty();
					} else {
						System.out.println("入力した部屋番号はBIRDの部屋ではない、あるいは範囲外");
						continue;
					}
				}
				}else {
					System.out.println("INPUT形式不正のため、異常終了");
					continue;
				}

				// 餌やり機能
				System.out.println("ペットに餌をあげますか？(はい・いいえ)");
				String eat = sc4.nextLine();
				if ("はい".equals(eat)) {
					if ("CAT".equals(type)) {

						cat.eat();
					}
					if ("DOG".equals(type)) {

						dog.eat();
					}
					if ("BIRD".equals(type)) {

						bird.eat();
					}
				}
				if ("いいえ".equals(eat)) {
					continue;
				}

			}

			// 3:チェックアウト機能
			else if (input_num == 3) {
				System.out.println("部屋番号を入力してください。");
				String roomId = sc5.nextLine();
				h.checkOut(roomId);
				System.out.println("チェックアウト完了しました。");
				// 显示全部房间状态
				h.check();
				// 显示空房数
				h.empty();

			}

			// 4:部屋に住んでいる動物数
			if (input_num == 4) {
				h.sum();
			}

			// 5:退出"
			if (input_num == 5) {
				h.sum();
				h.empty();
				System.out.println("ありがとうございました。");
				System.out.println("----- ループ終了 -----");
				break;
			}
		}

	}

}
