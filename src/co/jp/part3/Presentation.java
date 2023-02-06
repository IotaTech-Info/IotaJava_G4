package co.jp.part3;

import java.util.Scanner;

import co.jp.part3.Pet.Type;

public class Presentation {

	public static void main(String[] args) {

		// 初期化
		Data.readPetCSVFile("src\\co\\jp\\part3\\Pet.CSV");
		Data.readClientCSVFile("src\\co\\jp\\part3\\Client.CSV");
		Data.readEmployeeCSVFile("src\\co\\jp\\part3\\Employee.CSV");
		Data.readOrderCSVFile("src\\co\\jp\\part3\\Order.CSV");

		Scanner sc1 = new Scanner(System.in);

		// 実行開始
		System.out.println("----- 実行開始 -----");

		System.out.println("-----こんにちは！-----");
		// 身分確認
		// 1-ユーザー //2-ホテルスタッフ
		System.out.println("▶　訪問者別INDEX");
		System.out.println("1-お客様へ");
		System.out.println("2-ホテルスタッフへ");
		System.out.println("-----それ以外の任意のキーで終了-----");
		System.out.print("▶　");
		String input = sc1.next();

		if ("1".equals(input)) {
			UserLoop();// ユーザー
		} else if ("2".equals(input)) {
			EmployeeLoop();// ホテルスタッフ
		} else {
			System.out.println("----- 実行終了 -----");
			sc1.close();
			return;
		}

	}

	public static void UserLoop() {

		System.out.println("-----いらっしゃいませ！お客様！-----");
		for (;;) {

			// 身分確認
			// 1-ユーザー //2-ホテルスタッフ
			System.out.println("お客様番号お持ちしますか？");
			System.out.println("1-はい。");
			System.out.println("2-いいえ。今から登録します。");
			System.out.println("-----それ以外の任意のキーで終了-----");
			System.out.print("▶　");
			Scanner sc2 = new Scanner(System.in);
			String input = sc2.next();
			Client client = null;

			// お客様番号あり 番号検索
			if ("1".equals(input)) {

				while (client == null) {
					try {
						System.out.println("お客様番号(4桁 0001~)を入力してください:");
						System.out.print("▶　");
						input = sc2.next();
						client = Manager.SearchClient(input);

					} catch (NumberFormatException e) {
						System.out.println("無効な入力です");
					} catch (IndexOutOfBoundsException e) {
						System.out.println("番号が見つかりません。有効な番号を入力してください。");
					}
				}

			}
			// お客様番号なし 新しいアカウント作る
			else if ("2".equals(input)) {
				System.out.println("新しいアカウントを作成してください。入力例：名前,電話番号");
				System.out.print("▶　");
				input = sc2.next();
				String[] input_array = null;
				try {
					input_array = input.split(",");
					if (input_array.length != 2) {
						throw new Exception();

					}
					client = Manager.Add(input_array[0], input_array[1]);
					System.out.println("＜お帰りなさい！" + input_array[0] + "　様！＞");
					Data.writeClientCSVFile("src\\co\\jp\\part3\\Client.CSV");
				} catch (Exception e) {
					System.out.println("INPUT形式不正のため、再入力をお願いします");
					continue;
				}
			} else {
				System.out.println("----- 実行終了 -----");

				return;
			}
			while (true) {
				// メニュー
				System.out.println("◆メニュー◆");
				System.out.println("1-ペッド登録");
				System.out.println("2-予約／キャンセル");
				System.out.println("3-チェックイン／チャックアウト");
				System.out.println("4-餌をあげる");

				System.out.print("▶　");
				input = sc2.next();

				switch (input) {
				case "1":
					Manager.ViewMyPet(client);
					if (client.petsCode[2] == 0) {
						System.out.println("ペッド登録 入力例：ペット名前，年齢，種類，健康／病気");
						System.out.print("▶　");
						input = sc2.next();
						String[] input_array = null;
						try {
							input_array = input.split(",");
							
							Boolean health = input_array[3].equals("健康");
							Pet pet =Manager.Add(client.code, input_array[0], Integer.parseInt(input_array[1]),
									Type.valueOf(input_array[2]), health);
							if (pet ==null) {
								throw new Exception();
							}
							for (int i = 0; i < client.petsCode.length; i++) {
								if (client.petsCode[i] == 0) {
									client.petsCode[i] = pet.code;
									break;
								}
							}
							//Manager.View(pet);
							System.out.println(input_array[0] + "ちゃん！登録しました！よろしくお願いします！");
							Data.writePetCSVFile("src\\co\\jp\\part3\\Pet.CSV");
						} catch (Exception e) {
							System.out.println("INPUT形式不正のため、再入力をお願いします");
							continue;
						}
					} else {
						System.out.println("数量が上限に達したため、ペットの情報をもう登録することができません");
					}
					break;
				case "2":
					Book();
					break;
				case "3":
					CheckInOut();
					break;
				case "4":
					System.out.println("ペッドを選んでください。");
					Manager.ViewMyPet(client);
					System.out.print("▶　");
					input = sc2.next();
					int num = Integer.parseInt(input);
					Feed(Data.petList.get(num - 1));
					break;
				default:
					continue;
				}
			}
		}

	}

	public static void EmployeeLoop() {
		Manager.ViewList("Employee");
		Manager.ViewList("Pet");
		Manager.ViewList("Client");
		//Manager.ViewList("Order");
		System.out.println("----- 実行終了 -----");

	}

	public static void CheckInOut() {
		System.out.println("----- チェックイン／チャックアウト　成功-----");
		System.out.println("----- 実行終了 -----");

	}

	public static void Book() {
		System.out.println("ようこそ！スタッフを指名ししてください。");
		Manager.ViewList("Employee");

		Scanner scBook = new Scanner(System.in);
		String code;
		Employee em = null;
		while (em == null) {
			try {
				System.out.println("番号を入力して選択してください");
				System.out.print("▶　");
				code = scBook.next();
				em = Data.employeeList.get(Integer.parseInt(code) - 1);
			

			} catch (NumberFormatException e) {
				System.out.println("無効な入力です");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("番号が見つかりません。有効な番号を入力してください。");
			}
		}

		System.out.println("----- 予約／キャンセル　成功-----");
		System.out.println("----- 実行終了 -----");

	}

	public static void Feed(Pet pet) {
		pet.eat();
		pet.love();

	}

}