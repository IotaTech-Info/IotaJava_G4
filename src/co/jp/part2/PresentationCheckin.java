package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationCheckin {

	public static void main(String[] args) {
		Pet[] hotel = new Pet[10];
		//あるcat: Tom が予約しました．
		Cat tom = new Cat("tom", 1);
		hotel[0] = tom;
		int roomUsed = 1;
		
		//開始
		String name = "" ;
		int age = 0;
		String type = "";
		System.out.println("hotel: " + Arrays.toString(hotel));
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("----- チェックインシステム開始 -----");
		System.out.println("----- 予約した？するなら1を．してないなら0を -----");
		String reserve = sc1.nextLine();
		System.out.println("----- ペットの状況を教えて.-----");
		System.out.println("----- フォマードはname age type(dog, cat, bird)-----");
		//tom 1 cat
		//Jerry 1 bird
		//Ou 1 tiger
		String input = sc1.nextLine();
		String[] input_array = input.split(" ");
		name = input_array[0];
		age = Integer.valueOf(input_array[1]);
		type = input_array[2];
		
		if(reserve.equals("1")) {
			boolean flag = false;
			int i = 0;
			for( ; i < roomUsed; i++) {
				if(hotel[i].name.equals(name) && hotel[i].age == age && hotel[i].type.equals(type)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("予約見つかった");
				hotel[i].checkin();
			}
			else {
				System.out.println("予約見つからない");
				return;
			}
		}
		else if(reserve.equals("0")) {
			switch(type) {
				case "dog":
					Dog DogClient = new Dog(name, age);
					DogClient.checkin();
					hotel[roomUsed] = DogClient;
					break;
				case "cat":
					Cat CatClient =  new Cat(name, age);
					CatClient.checkin();
					hotel[roomUsed] = CatClient;
					break;
				case "bird":
					Bird BirdClient = new Bird(name, age);
					BirdClient.checkin();
					hotel[roomUsed] = BirdClient;
					break;
				default:
					System.out.println("INPUT形式不正のため、異常終了");
					break;
				}
			roomUsed ++;
		}
		else { //reserve入力異常
			return;
		}
	}

}
