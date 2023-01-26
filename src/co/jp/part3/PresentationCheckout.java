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

public class PresentationCheckout {

	public static void main(String[] args)  {
		List<Pet> hotel = new ArrayList<>();
		String name = "" ;
		int age = 0;
		String type = "";
		String checktime = "";
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Downloads\\pleiades\\workspace\\IotaJava_G4\\src\\co\\jp\\part3\\checkinfo.txt"),"UTF-8"));
			String line;
			while ((line = br.readLine()) != null) {
				String[] line_array = line.split(" ");
					name = line_array[0];
					age = Integer.valueOf(line_array[1]);
					type = line_array[2];
					checktime = line_array[ line_array.length - 1];
					
				switch(type) {
				case "dog":
					Dog DogClient = new Dog(name, age);
					hotel.add(DogClient);
					hotel.get(hotel.indexOf(DogClient)).checktime = checktime;
					break;
				case "cat":
					Cat CatClient =  new Cat(name, age);
					hotel.add(CatClient);
					hotel.get(hotel.indexOf(CatClient)).checktime = checktime;
					break;
				case "bird":
					Bird BirdClient = new Bird(name, age);
					hotel.add(BirdClient);
					hotel.get(hotel.indexOf(BirdClient)).checktime = checktime;
					break;
			}
			}
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//開始
		Scanner sc1 = new Scanner(System.in);
		System.out.println("----- チェックアウトシステム開始 -----");
		System.out.println("----- 予約のペットの状況を教えて.-----");
		System.out.println("----- フォマードはname age type(dog, cat, bird))-----");

		String input = sc1.nextLine();
		
		String[] input_array = input.split(" ");
		name = input_array[0];
		age = Integer.valueOf(input_array[1]);
		type = input_array[2];
		int i = 0;
		while(true) {
			boolean flag = false;
			for( ; i < hotel.size(); i++) {
				if(hotel.get(i) != null && hotel.get(i).name.equals(name) && hotel.get(i).age == age && hotel.get(i).type.equals(type)) {
					flag = true;
					break;
				}
			}
			if(flag) break;
			else System.out.println("このペットのroomは見つからない、やり直してください");
		}
		try {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date checkday = simpleDateFormat.parse(hotel.get(i).checktime);
		Date today = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
		long daydiff = (today.getTime() - checkday.getTime()) / 86400000;
		System.out.println(hotel.get(i).name + "は" + daydiff + "日間滞在しました");
		hotel.remove(i);
		System.out.println("チェックアウトしました");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Downloads\\pleiades\\workspace\\IotaJava_G4\\src\\co\\jp\\part3\\checkinfo.txt"),
					 "UTF-8"));
			for(i = 0; i < hotel.size(); i++) {
				String infomation = hotel.get(i).name + " " + String.valueOf(hotel.get(i).age) + " " + hotel.get(i).type + " " + String.valueOf(hotel.get(i).sex) + " " + hotel.get(i).checktime;
				out.write(infomation);
				out.write("\n");
			}
			out.close();
			System.out.println("----- 情報が更新されました. -----");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
