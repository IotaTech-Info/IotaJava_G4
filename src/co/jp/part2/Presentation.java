package co.jp.part2;

import java.util.Scanner;

import co.jp.part2.Pet.Cat;
import co.jp.part2.Pet.Pet;
import co.jp.part2.User.Guest;
import co.jp.part2.User.Hotel;

public class Presentation {

	//空室状況パラメータ 0空室、１満室、２予約済
	public static final int EMPTY=0;
	public static final int FULL=1;
	public static final int RESERVE=2;
		
	static final String type_Cat="Cat";
	static final String type_Dog="Dog";
	static final String type_Bird="Bird";
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		System.out.println("----- 実行開始 -----");

		Pet[] hotel = new Pet[10];

		String name = "";
		int age = 0;
		String type = "";
				
//		System.out.print("hotel: ");
		Cat cat=new Cat("miao",9,type_Cat);
		Hotel[] ho =new Hotel[10];
		for(int i=0;i<ho.length;i++) {
			ho[i]=new Hotel();
			
		}
		ho[0].setPet(cat);
		ho[0].setStatus(FULL);

		Guest gu=new Guest();
		gu.Guestenter(ho);
		
		Cat catrun=(Cat) ho[0].getPet();
		catrun.run();
		System.out.println();
		Scanner sc1 = new Scanner(System.in);


		for (;;) {
			System.out.println("----- ループ開始 -----");
			String input = sc1.nextLine();

			if ("exit".equals(input)) {
				System.out.println("----- ループ終了 -----");
				break;
			}

			// 形式   NAME:金柑  AGE:18  TYPE:DOG
			String[] input_array = input.split(":");

			// INPUT エラーチェック
			if (input_array.length < 2) {
				System.out.println("INPUT形式不正のため、異常終了");
				break;
			}

			if ("NAME".equals(input_array[0])) {
				name = input_array[0];
			}

			if ("AGE".equals(input_array[0])) {
				age = Integer.valueOf(input_array[0]);
			}

			if ("TYPE".equals(input_array[0])) {
				type = input_array[0];
			}

			if (!"".equals(name) && age != 0 && !"".equals(type)) {
				// input 情報を収集できた時点
				switch (type) {
				case "1":
					//TODO DOG
					break;
				case "2":
					//TODO CAT
					break;
				case "3":
					//TODO BIRD
					break;
				default:
					System.out.println("TYPE範囲外のため、異常終了");
				}
			}

			System.out.println("入力した文字は=" + input);

		}

		System.out.println("----- 実行終了 -----");
	}

}
