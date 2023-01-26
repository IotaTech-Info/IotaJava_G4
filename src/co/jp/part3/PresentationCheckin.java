package co.jp.part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class PresentationCheckin {

	public static void main(String[] args) {
		List<Pet> hotel_guest = new ArrayList<>();
		List<Pet> hotel = new ArrayList<>();
		String name = "" ;
		int age = 0;
		String type = "";
		SEX sex = SEX.NONE;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Downloads\\pleiades\\workspace\\IotaJava_G4\\src\\co\\jp\\part3\\guest.txt"),"UTF-8"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] line_array = line.split(" ");
				if(line_array.length == 4) {
					name = line_array[0];
					age = Integer.valueOf(line_array[1]);
					type = line_array[2];
					sex = SEX.valueOf(line_array[3]);
				}
				else {
					name = line_array[0];
					age = Integer.valueOf(line_array[1]);
					type = line_array[2];
				}
				switch(type) {
				case "dog":
					Dog DogClient = null;
					if (line_array.length == 4) {
						DogClient = new Dog(name, age, sex);
					}
					else {
						DogClient = new Dog(name, age);
					}
					hotel_guest.add(DogClient);
					break;
				case "cat":
					Cat CatClient = null;
					if (line_array.length == 4) {
						CatClient = new Cat(name, age, sex);
					}
					else {
						CatClient =  new Cat(name, age);
					}
					hotel_guest.add(CatClient);
					break;
				case "bird":
					Bird BirdClient = null;
					if (line_array.length == 4) {
						BirdClient = new Bird(name, age, sex);
					}
					else {
						BirdClient = new Bird(name, age);
					}
					hotel_guest.add(BirdClient);
					break;
			}
			 }
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//開始
		System.out.println("----- チェックインシステム開始 -----");
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.println("----- 予約した？するなら1を．してないなら0を -----");
			String reserve = sc1.nextLine();
			System.out.println("----- ペットの状況を教えて.-----");
			System.out.println("----- フォマードはname age type(dog, cat, bird)-----");
			String input = sc1.nextLine();
			String[] input_array = input.split(" ");
			name = input_array[0];
			age = Integer.valueOf(input_array[1]);
			type = input_array[2];
			
			if(reserve.equals("1")) {
				boolean flag = false;
				int i = 0;
				for( ; i < hotel_guest.size(); i++) {
					System.out.println(hotel_guest.get(i).name);
					if(hotel_guest.get(i).name.equals(name) && hotel_guest.get(i).age == age && hotel_guest.get(i).type.equals(type)) {
						flag = true;
						hotel.add(hotel_guest.get(i));
						break;
					}
				}
				if(flag) {
					System.out.println("予約見つかった");
					hotel_guest.get(i).checkin();
					break;
				}
				else {
					System.out.println("予約見つからない 、やり直してください");
					continue;
				}
			}
			else if(reserve.equals("0")) {
				switch(type) {
					case "dog":
						Dog DogClient = new Dog(name, age);
						DogClient.checkin();
						hotel.add(DogClient) ;
						break;
					case "cat":
						Cat CatClient =  new Cat(name, age);
						CatClient.checkin();
						hotel.add(CatClient);
						break;
					case "bird":
						Bird BirdClient = new Bird(name, age);
						BirdClient.checkin();
						hotel.add(BirdClient);
						break;
				}
				break;
			}
			else { //reserve入力異常
				return;
			}
		}
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Downloads\\pleiades\\workspace\\IotaJava_G4\\src\\co\\jp\\part3\\checkinfo.txt"),"UTF-8"));
			String line1;
			String result = "";
			while ((line1 = br1.readLine()) != null) {
				result += line1;
				result += '\n';
			}
			br1.close();
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Downloads\\pleiades\\workspace\\IotaJava_G4\\src\\co\\jp\\part3\\checkinfo.txt"),
					 "UTF-8"));
			for(int i = 0; i < hotel.size(); i++) {
				Date date = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				hotel.get(i).checktime =simpleDateFormat.format(date);
				String infomation = hotel.get(i).name + " " + String.valueOf(hotel.get(i).age) + " " + hotel.get(i).type + " " + String.valueOf(hotel.get(i).sex) + " " + hotel.get(i).checktime;
				out.write(result);
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
