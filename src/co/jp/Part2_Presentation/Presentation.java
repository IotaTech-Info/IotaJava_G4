package co.jp.Part2_Presentation;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		System.out.println("----- いらっしゃいませ。ペットホテルへようこそ。現在の空室状況は -----");

		Pet[] hotel = new Pet[10];


		
		String name = "";
		int age = 0;
		String type = "";



		Scanner sc1 = new Scanner(System.in);
		boolean checkout = false;

		for(;;) {
			System.out.println("hotel: " + Arrays.toString(hotel));
			// TODO 機能のループ (Add a "if" loop when input error occurs)

			System.out.println("---ループ開始。１はチェックイン、２は給食、３は他サービス、４はチェックアウト");
			String input = sc1.nextLine();

			// Manually exit
			if ("exit".equals(input)) {
				System.out.println("----- ループ終了 -----");
				break;
			}
			
			
			// check in
			if ("1".equals(input)) {
				System.out.println("---名前、年齢、タイプを入力してください。---");
				
				
			}
			//feed
			if("2".equals(input)) {

			}
			
			//extra service
			if("3".equals(input)) {
				
			}
			
			//check out
			if ("4".equals(input)) {
				checkout = true;
				continue;
		
			}
			if(checkout ==true) {
				System.out.println("请输入要退出的房间号");
				checkout = false;
				int number = Integer.valueOf(input);  //输入退出的房间号
				hotel[number - 1] = null;
				continue;
			}
			
			// 形式   NAME:金柑  ⇒ AGE:18 ⇒ TYPE:DOG
			//name input
			String[] input_name = input.split(":");


			if ("NAME".equals(input_name[0])) {
				name = input_name[1];
				break;
			}
		
		}
		//age input

		for(;;) {
			String[] input_age = sc1.nextLine().split(":");
			if ("AGE".equals(input_age[0])) {
				age = Integer.valueOf(input_age[1]);
				break;
			}
		}
		
		// TYPE input
		for(;;) {
			String[] input_type = sc1.nextLine().split(":");
			if ("TYPE".equals(input_type[0])) {
				type = input_type[1];
				break;
			}
		// room number input
			int number = 0;
			for(;;){
				String[]input_number = sc1.nextLine().split(":");
				number = Integer.valueOf(input_number[1]); // 将输入值转化为integer
				break;
			}
			
			
			if (!"".equals(name) && age != 0 && !"".equals(type)) {
				// input 情報を収集できた時点
				switch (type) {
				case "1":
	
					//TODO DOG
					hotel[number] = new Dog(name, age, type);  //情况1，type为dog时，加入数组。猫同。
					break;
				case "2":
					//TODO CAT
					hotel[number] = new Cat(name, age, type);
					break;

				default:
					System.out.println("TYPE範囲外のため、異常終了");
				}
			}
			



		System.out.println("----- 実行終了 -----");
	
		}
	}	
}

