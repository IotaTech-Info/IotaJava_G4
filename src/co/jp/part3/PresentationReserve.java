package co.jp.part3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PresentationReserve {

	public static void main(String[] args) {
		List<Pet> hotel = new ArrayList<>();
		String name = "" ;
		int age = 0;
		String type = "";
		SEX sex = SEX.NONE;

		System.out.println("----- 予約システム開始 -----");
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			boolean flag = false;
			System.out.println("----- 性別の対応が必要ですか？必要なら1を．必要ではないなら0を -----");
			String sexNeeded = sc1.nextLine();
			System.out.println("----- 予約のペットの状況を教えて.-----");
			System.out.println("----- フォマードはname age type(dog, cat, bird) sex(if needed, MALE or FEMALE)-----");
			String input = sc1.nextLine();
			//Tom 3 cat MALE
			//Je 1 dog 
			String[] input_array = input.split(" ");
			switch(sexNeeded) {
				case "1":
					if(input_array.length != 4) {
						System.out.println("INPUT形式不正のため、やり直してください");
						flag = true;
						break;
					}
					name = input_array[0];
					age = Integer.valueOf(input_array[1]);
					type = input_array[2];
					sex = SEX.valueOf(input_array[3]);
					break;
				case "0":
					if(input_array.length != 3) {
						System.out.println("INPUT形式不正のため、やり直してください");
						flag = true;
						break;
					}
					name = input_array[0];
					age = Integer.valueOf(input_array[1]);
					type = input_array[2];
					break;
			}
			if(flag)  continue;
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
					hotel.add(DogClient);
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
					hotel.add(CatClient);
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
					hotel.add(BirdClient);
					break;
				default:
					System.out.println("INPUT形式不正のため、やり直してください");
					flag = true;
					break;
			}
			if(flag) continue;
			System.out.println("----- もう一匹？必要なら1を．必要ではないなら0を -----");
			String inp_ = sc1.nextLine();
			if(inp_.equals("0")) break;
			else if(inp_.equals("1")) continue;
		}
		System.out.println("----- 予約システム終わり -----");
		try {
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Downloads\\pleiades\\workspace\\IotaJava_G4\\src\\co\\jp\\part3\\guest.txt"),
					 "UTF-8"));
			for(int i = 0; i < hotel.size(); i++) {
				String infomation = hotel.get(i).name + " " + String.valueOf(hotel.get(i).age) + " " + hotel.get(i).type + " " + String.valueOf(hotel.get(i).sex);
				out.write(infomation);
				out.write("\n");
			}
			out.close();
			System.out.println("----- データを入れました. -----");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
