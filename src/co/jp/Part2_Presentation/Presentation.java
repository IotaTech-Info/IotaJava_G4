package co.jp.Part2_Presentation;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		
		Pet[] hotel = new Pet[10];
		
		int count = 0;
		
		
		Dog myDog = new Dog();
		Cat myCat = new Cat();
		
		Scanner sc_1 = new Scanner(System.in);
		Scanner sc_2 = new Scanner(System.in);
		Scanner sc_3 = new Scanner(System.in);

		
		System.out.println("----- いらっしゃいませ。ペットホテルへようこそ。現在の空室状況は -----");
		System.out.println("hotel: " + Arrays.toString(hotel));
		
		for (;;) {
			
			// TODO 機能のループ (Add a "if" loop when input error occurs)

			System.out.println("---ループ開始。0は空室チェック、１はチェックイン、２は給食、３は他サービス、４はチェックアウト、5は退出");
			int input_fn = sc_1.nextInt();


			// room check
			if(input_fn ==0) {
				System.out.println("hotel: " + Arrays.toString(hotel));
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
				}
				if(type.equals("CAT")) {
					myCat.type = "CAT";
					myCat.name = name;
					myCat.age = age;
				}
				Pet myPet = new Pet(name, age, type);
				System.out.println("1から10までの部屋から選べます。入力してください。");
				String input_room = sc_2.nextLine();
				hotel[Integer.valueOf(input_room) -1] = myPet;
				
				System.out.println("チェックイン完了。");
				int i;
				for( i = 0; i < 9; i++); {
					System.out.println(hotel[i].name + "," + hotel[i].type);
					
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
			// Manually exit
			else if (input_fn == 5) {
				System.out.println("----- システム終了 -----");
				break;
			}

			

		}
	}
}
