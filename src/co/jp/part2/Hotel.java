package co.jp.part2t;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
	void speck() {

	}

	public static void main(String[] args) {
		System.out.print("----- 実行開始 -----");
		//	String name = "";
		//	int age = 0;
		//	String type = "";
		String[] hotel = new String[10];
		String[] src = { "空", "空", "空", "空", "空", "空", "空", "空", "空", "空" };
		Scanner sc1 = new Scanner(System.in);
		System.arraycopy(src, 0, hotel, 0, 10);
		for (int i = 0; i < hotel.length; i++) {
			//name2[i] = values[i];
			//System.out.print(hotel[i] + ",");

		}

		for (;;) {

			String input = sc1.nextLine();
			String[] input_array = input.split(":");
			while (true) {

				if ("check".equals(input)) {

					System.out.println("部屋状況: " + Arrays.toString(hotel));
					break;
					//main(args);
					//if ("AGE".equals(input_array[0])) {		
				}

				///入住
				
				if ("check in".equals(input)) {

					System.out.println("名前を入力してください");
					Scanner sc2 = new Scanner(System.in);

					String name = sc2.nextLine();
					String[] values = name.split(" ", 0);

					System.out.println("部屋番号を入力してください");
					Scanner sc3 = new Scanner(System.in);
					String h = sc3.next();

					int num = Integer.parseInt(h); //string をintに変換

					if (num <= hotel.length) {
						System.arraycopy(values, 0, hotel, num, 1);
					} else {
						System.out.println("部屋番号を間違います、もう一度入力してください");
					
						break;
					}
					for (int i = 0; i < hotel.length; i++) {
						//name2[i] = values[i];		
					}

					System.out.println("部屋状況: " + Arrays.toString(hotel));
					//System.out.print(hotel[num] + ",");

					break;
					//System.out.println("ruzhucheng");
					//main(args); // mainメソッドの最初に戻る
				}

				///退室
				
				if ("check out".equals(input)) {
					System.out.println("退却の部屋番号を入力してください");
					Scanner sc4 = new Scanner(System.in);

					String j = sc4.next();
					int num1 = Integer.parseInt(j);

					//dataをコピーして、入れる
					String[] checkout = { "空" };

					System.arraycopy(checkout, 0, hotel, num1, 1);
					for (int i = 0; i < hotel.length; i++) {
						//name2[i] = values[i];
						System.out.print(hotel[i] + ",");

					}
					//main(args);

				}

				///予約

				if ("reserve".equals(input)) {

					System.out.println("名前を入力してください");
					Scanner yoyaku = new Scanner(System.in);

					String yoyakuname = yoyaku.nextLine();
					String[] values = yoyakuname.split(" ", 0);

					System.out.println("部屋番号を入力してください");
					Scanner rn = new Scanner(System.in);
					String r = rn.next();

					int num = Integer.parseInt(r); //string をintに変換

					if ("空".equals(hotel[num]) && num <= hotel.length) {
						System.arraycopy(values, 0, hotel, num, 1);

						// データコピー

					} else {
						System.out.println("部屋が空いてないまたは番号を間違いました、もう一度入力してください");
						
					}
					for (int i = 0; i < hotel.length; i++) {
						//name2[i] = values[i];

					}
					
					System.out.println("部屋状況: " + Arrays.toString(hotel));
					break;
				}
				
					
					//System.out.println("ruzhucheng");
					//main(args); // mainメソッドの最初に戻る
				

				if ("reserveCh".equals(input)) {
					System.out.println("キャンセルの部屋番号を入力してください");
					Scanner ch = new Scanner(System.in);

					String ch2 = ch.next();
					int ch1 = Integer.parseInt(ch2);

					//dataをコピーして、入れる
					String[] checkout = { "空" };

					System.arraycopy(checkout, 0, hotel, ch1, 1);
					for (int i = 0; i < hotel.length; i++) {
						//name2[i] = values[i];
						System.out.print(hotel[i] + ",");

					}
				}

				if ("over".equals(input)) {

					System.out.println("----- 実行終了 -----");
					break;
				} //ループ終了

				//pet食べる機能

				Cat cat = new Cat();
				Dog dog = new Dog();
				Bird bird = new Bird();

				if ("food".equals(input)) {

					System.out.println("餌を与える動物を選択してください");
					System.out.println("犬、猫、鳥");
					Scanner f = new Scanner(System.in);
					String f1 = f.next();

					switch (f1) {

					case "犬":
						Dog.food();
						break;
					case "猫":
						cat.food();
						break;
					case "鳥":
						Bird.food();
						break;
					default:
						System.out.println("異常のため、再入力してください");
						break;
					}
					break;

				}

				if (input_array.length < 1) {
					System.out.println("指令が正しくないため、もう一度入力してください");
					break;
				}
				sc1.close();
			}
		}

	}
}
