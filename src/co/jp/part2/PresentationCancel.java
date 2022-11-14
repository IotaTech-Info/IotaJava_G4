package co.jp.part2;

import java.util.Scanner;

public class PresentationCancel {
	public static void main(String[] args) {
		Pet[] hotel = new Pet[10];
		//あるcat: Tom が予約しました．
		Cat tom = new Cat("tom", 1);
		hotel[0] = tom;
		//開始
		Scanner sc1 = new Scanner(System.in);
		System.out.println("----- 予約キャンセルシステム開始 -----");
		System.out.println("----- 予約のペットの状況を教えて.-----");
		System.out.println("----- フォマードはname age type(dog, cat, bird))-----");
		//tom 1 cat
		//tom 1 dog
		String input = sc1.nextLine();
		
		String[] input_array = input.split(" ");
		String name = input_array[0];
		int age = Integer.valueOf(input_array[1]);
		String type = input_array[2];
		
		boolean flag = false;
		for(int i = 0 ; i < hotel.length; i++) {
			if(hotel[i] != null && hotel[i].name.equals(name) && hotel[i].age == age && hotel[i].type.equals(type)) {
				flag = true;
				hotel[i] = null;
				break;
			}
		}
		if(flag) System.out.println("予約キャンセルした");
		else System.out.println("予約見つからない");
	}

}
