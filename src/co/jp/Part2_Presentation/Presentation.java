package co.jp.Part2_Presentation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Presentation {
		
	static Pet[] hotel = new Pet[10];
	

	
	public static void main(String[] args) {
	
			 
		 Dog myDog = new Dog();
		 Cat myCat = new Cat();
		 
		 
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		
		List<String> vip = new ArrayList<>();
		 
//		 String name = "";
//		 int age = 0;
//		 String type = "";
		
		 Scanner sc_1 = new Scanner(System.in);
		 Scanner sc_2 = new Scanner(System.in);
		 Scanner sc_3 = new Scanner(System.in);
		
		
		System.out.println("----- いらっしゃいませ。ペットホテルへようこそ。現在の空室状況は -----");
		System.out.println("hotel: " + Arrays.toString(hotel));
		
		for (;;) {
		

			System.out.println("---ループ開始。0は空室チェック、１はチェックイン、２は給食、３は他サービス、４はチェックアウト、5は意見を書く、6会員になる、7は退出");
			int input_fn = sc_1.nextInt();


			// room check
			if(input_fn ==0) {
				int i;
				for (i = 0; i < hotel.length-1; i++)
					{
					if (hotel[i] != null) {
						System.out.println(hotel[i].name + "," + hotel[i].type);
					} 
				else {
						System.out.println("空室");
					}

				}

			}
			
			

			// check in
			else if (input_fn ==1) {
				System.out.println("---名前、年齢、タイプを入力してください。---");
				System.out.println("まずはペットの名前（例：Snoopy）");
				String name = sc_2.nextLine();
				System.out.println("ペットの年齢（例：2）");
				int age = sc_3.nextInt();
				System.out.println("ペットは犬か、それとも猫か。(DOG/CAT）");
				String type = sc_2.nextLine();
				if (type.equals("DOG")) {
					myDog.type = "DOG";
					myDog.name = name;
					myDog.age = age;			
					System.out.println("1から10までの部屋から選べます。入力してください。");
					String input_room = sc_2.nextLine();
					Pet myPet = myDog;
					hotel[Integer.valueOf(input_room) - 1] = myPet;	
					}
				else if (type.equals("CAT")) {
					myCat.type = "CAT";
					myCat.name = name;
					myCat.age = age;					
					System.out.println("1から10までの部屋から選べます。入力してください。");
					String input_room = sc_2.nextLine();
					Pet myPet = myCat;
					hotel[Integer.valueOf(input_room) - 1] = myPet;
				}
				System.out.println("チェックイン完了。");
				//Print Room Information
				int i;
				for (i = 0; i < hotel.length-1; i++){
					if (hotel[i] != null) {
						System.out.println(hotel[i].name + "," + hotel[i].type);
					} 
				else {
						System.out.println("空室");
					}

				}

			}
			// feed
			else if (input_fn == 2) {
				System.out.println("給食を始めます。部屋番号を入力してください。");
				int input_room = sc_2.nextInt();
				if (hotel[input_room - 1] != null){
					if (hotel[input_room - 1].type == "DOG") {
						myDog.setName(hotel[input_room - 1].name);
						myDog.eat();
					}
					else {
						myCat.setName(hotel[input_room - 1].name);
						myCat.eat();
					}
					}
				}

			

			// extra service
			else if (input_fn == 3) {
				System.out.println("エクストラサービスを始めます。部屋番号を入力してください。");
				int input_room = sc_2.nextInt();
				if(hotel[input_room - 1] != null) {
					System.out.println("何サービスがほしいですか。犬、猫が風呂、トリミングが１、犬の散歩は２。");
					int input_service = sc_1.nextInt();
					if (input_service == 1) {
						if(hotel[input_service - 1].type =="DOG") {
							myDog.setName(hotel[input_room - 1].name);
							myDog.trim_bath();
						}
						else {
							myCat.setName(hotel[input_room - 1].name);
							myCat.trim_bath();
						}
					}
					if (input_service ==2) {
						myDog.walk();
					}
					;
				}
			}

			// check out
			else if (input_fn == 4) {
				System.out.println("部屋番号を入力してください。");
				int input_room = sc_2.nextInt();
				hotel[Integer.valueOf(input_room) -1] = null;
				System.out.println("チェックアウト完了");

			}
			//意見
			else if (input_fn == 5) {
				System.out.println("意見を入力してください。");
				try {
					 Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Dolly\\Documents\\Workspace\\IotaJava_G4\\src\\co\\jp\\Part2_Presentation\\claim.txt"),
					 "UTF-8"));
					 String  input_claim= sc_3.nextLine();
					 out.write(input_claim + c.getTime());
					 out.close();
					} catch (IOException e) {
					 e.printStackTrace();
					}
			}
			else if (input_fn == 6) {
				System.out.println("----- 名前を書いてください。 -----");
				String input_vipname = sc_3.nextLine();
				vip.add(input_vipname);
				System.out.println("会員リスト" + vip);
			}
			
			// Manually exit
			else if (input_fn == 7) {
				System.out.println("----- システム終了 -----");
				break;
			}

			

		
			
		}
	}
}


