package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class PresentationReserve {

	public static void main(String[] args) {
		Pet[] hotel = new Pet[10];
		String name = "" ;
		int age = 0;
		String type = "";
		SEX sex = SEX.NONE;
		System.out.println("hotel: " + Arrays.toString(hotel));
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("----- 予約システム開始 -----");
		System.out.println("----- 性別の対応が必要ですか？必要なら1を．必要ではないなら0を -----");
		String sexNeeded = sc1.nextLine();
		System.out.println("----- 予約のペットの状況を教えて.-----");
		System.out.println("----- フォマードはname age type(dog, cat, bird) sex(if needed, MALE or FEMALE)-----");
		String input = sc1.nextLine();
		//Tom 3 cat MALE
		//心 1 dog 
		String[] input_array = input.split(" ");
		switch(sexNeeded) {
			case "1":
				if(input_array.length != 4) {
					System.out.println("INPUT形式不正のため、異常終了");
					return;
				}
				name = input_array[0];
				age = Integer.valueOf(input_array[1]);
				type = input_array[2];
				sex = SEX.valueOf(input_array[3]);
				break;
			case "0":
				if(input_array.length != 3) {
					System.out.println("INPUT形式不正のため、異常終了");
					return;
				}
				name = input_array[0];
				age = Integer.valueOf(input_array[1]);
				type = input_array[2];
				break;
		}
		switch(type) {
			case "dog":
				Dog DogClient = null;
				if (sexNeeded.equals("1")) {
					DogClient = new Dog(name, age, sex);
				}
				else {
					DogClient = new Dog(name, age);
				}
				DogClient.cage();
				hotel[0] = DogClient;
				break;
			case "cat":
				Cat CatClient = null;
				if (sexNeeded.equals("1")) {
					CatClient = new Cat(name, age, sex);
				}
				else {
					CatClient =  new Cat(name, age);
				}
				CatClient.cage();
				hotel[0] = CatClient;
				break;
			case "bird":
				Bird BirdClient = null;
				if (sexNeeded.equals("1")) {
					BirdClient = new Bird(name, age, sex);
				}
				else {
					BirdClient = new Bird(name, age);
				}
				BirdClient.cage();
				hotel[0] = BirdClient;
				break;
			default:
				System.out.println("INPUT形式不正のため、異常終了");
				break;
		}
		System.out.println("----- 予約システム終わり -----");
		System.out.println("hotel: " + Arrays.toString(hotel));
	}
}
