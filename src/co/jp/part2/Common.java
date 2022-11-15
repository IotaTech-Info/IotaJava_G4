package co.jp.part2;

import java.util.Scanner;

enum TYPE{
	CAT{
		public String getTP() {
			return "CAT";
		}
	},
	DOG{
		public String getTP() {
			return "DOG";
		}
	},
	BIRD{
		public String getTP() {
			return "BIRD";
		}
	};

	public abstract String getTP();
}

public class Common {
	public String name;
	public int age = 0;
	public String type;
	public int room;

	public static Hotel[] hotel = new Hotel[10];
	public int[] setroom = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//	查看当前房间的入住情况
	public void check() {

		System.out.println("今のホテル状況を照合する");
		hotelprint();
	}

//	办理入住手续
	public void checkin() {
		// TODO 自動生成されたメソッド・スタブ

//		System.out.println("hotel: " + Arrays.toString(hotel));
//		System.out.println(hotel[0]);
//		for (int i =0; i < 10; i++) {
//			Arrays.fill(hotel, null);
//		}
		hotelprint();
		System.out.println("----- チェックイン開始 -----");
		

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		for (Hotel.getCOUNT(); Hotel.COUNT < 10; Hotel.COUNT++) {
//		for (;;) {
			System.out.println("戻りたい場合は任意位置に back を入力してください");
			System.out.println("ペットの名前を入力してください：");
			String inname = sc1.nextLine();
			
			int temp = 0;
			
			if ("back".equals(inname)) {
				System.out.println("----- チェックイン終了 -----");
				break;
			}
			name = inname;

			System.out.println("ペットの年齢を入力してください(1以上)：");

			String inage = sc2.nextLine();
			if ("back".equals(inage)) {
				System.out.println("----- チェックイン終了 -----");
				break;
			} else {
				while (true) {
					if (determine_number(inage)) {
						age = Integer.valueOf(inage);
//							age = sc2.nextInt();
						break;
					} else {
						System.out.println("年齢は数字のみ！");
						inage = sc2.next();
						if ("back".equals(inage)) {
							System.out.println("----- チェックイン終了 -----");
							break;
						}
						break;
					}
				}

			}

			System.out.println("ペットの種類を入力してください(DOG、CAT或いはBIRD)：");
			String intype = sc3.nextLine();
			if ("back".equals(intype)) {
				System.out.println("----- チェックイン終了 -----");
				break;
			}
			type = intype;
			
//			从最前面的空房开始入住
			room = Hotel.COUNT + 1;
			for (int i = 0; i < Hotel.COUNT; i++) {
				if (hotel[i] == null) {
					temp = Hotel.COUNT;
					Hotel.COUNT = i;
					room = i;
					break;
				}
			}

			if (!"".equals(name) && age != 0 && !"".equals(type)) {
				// input 情報を収集できた時点
				switch (type) {
				case "DOG":
					// TODO DOG
					Dog dog = new Dog();
					dog.setName(name);
					dog.setAge(age);
					dog.setType(type);
					dog.setRoomnum(room);
					hotel[Hotel.COUNT] = dog;
//					Hotel.COUNT++;
					break;
				case "CAT":
					// TODO CAT
					Cat cat = new Cat();
					cat.setName(name);
					cat.setAge(age);
					cat.setType(type);
					cat.setRoomnum(room);
					hotel[Hotel.COUNT] = cat;
//					Pet.COUNT++;
					break;
				case "BIRD":
					// TODO BIRD
					Bird bird = new Bird();
					bird.setName(name);
					bird.setAge(age);
					bird.setType(type);
					bird.setRoomnum(room);
					hotel[Hotel.COUNT] = bird;
//					Pet.COUNT++;
					break;
				default:
					System.out.println("TYPE範囲外のため、異常終了");
					Hotel.COUNT--;
				}
				room = Hotel.COUNT + 1;//让room的值变为原值
				Hotel.COUNT = temp;
			}

			System.out.println("入力した文字は=" + inname + "," + age + "," + intype);
//			System.out.println(Arrays.toString(hotel));
			hotelprint();
		}

//		System.out.println("----- 実行終了 -----");

	}

//	办理退房手续
	public void checkout() {
		System.out.println("----- チェックアウト開始 -----");
		hotelprint();
		Scanner sc1 = new Scanner(System.in);
		int roomnum = 0;
		while (true) {
			System.out.println("チェックアウトしたいペットの部屋番号を入力してください！(数字のみ)");
			System.out.println("戻りたい場合は back を入力してください");
			String outroom = sc1.nextLine();
			if ("back".equals(outroom)) {
				System.out.println("----- チェックアウト終了 -----");
				break;
			} else {
				while (true) {
					if (determine_number(outroom)) {
						roomnum = Integer.valueOf(outroom);
						for (int i = 0; i < hotel.length; i++) {
							if (hotel[i] != null && hotel[i].roomnum == roomnum) {
								hotel[i] = null;
							}
						}

						System.out.println("入力した部屋番号は" + roomnum + "号室です");
//						System.out.println(Arrays.toString(hotel));
						hotelprint();
						break;
					} else {
						System.out.println("部屋番号は数字のみ！");
						outroom = sc1.next();
//						if ("back".equals(outroom)) {
//							System.out.println("----- チェックアウト終了 -----");
//							break;
//						}
					}
				}
				System.out.println("----- チェックアウト終了 -----");
				break;

			}
//			System.out.println("入力した部屋番号は" + roomnum + "号室です");
////			System.out.println(Arrays.toString(hotel));
//			hotelprint();
		}

	}

//	按宠物類型排序
	public void sort() {
		System.out.println("----- 並び替え開始 -----");
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {

				if (i < 9 && hotel[i] == null && hotel[i + 1] != null) {
					Hotel temp = hotel[i + 1];
					hotel[i + 1] = hotel[i];
					hotel[i] = temp;
					int x = setroom[i + 1];
//					System.out.println(x);
					setroom[i + 1] = setroom[i];
//					System.out.println(setroom[i]);
					setroom[i] = x;
//					System.out.printl

//					int x = a[i];
//					a[i] = hotel[i+1].roomnum;
//					a[i+1] = x;

				}
//				if(i < room -1 &&hotel[i] == null && hotel[j] != null) {
//					Hotel temp = hotel[i];
//					hotel[i] = hotel[j];
//					hotel[j] = temp;
//				}
////					else if (hotel[j] == null){
//					Hotel temp = hotel[j+1];
//					hotel[j+1] = hotel[j];
//					hotel[j] = temp;
//				}

				if (hotel[i] != null && hotel[j] != null && i != j) {
					if (hotel[j].type.compareTo(hotel[i].type) < 0) {
//						Hotel temp = hotel[j];
//					}else {
						Hotel temp = hotel[i];
						hotel[i] = hotel[j];
						hotel[j] = temp;
						int x = setroom[i];
//						System.out.println(x);
						setroom[i] = setroom[j];
//						System.out.println(setroom[i]);
						setroom[j] = x;
//						System.out.println(setroom[j]);

//					}else if() {

					}
				}
//				if(hotel[j].roomnum) {
//					
//				}

			}
		}
//		System.out.println(Arrays.toString(setroom));
//		System.out.println("hotel: " + Arrays.toString(hotel));
		hotelprint();
		System.out.println("----- 並び替え終了 -----");
	}

	public void feed() {
		int roomnum;
//		System.out.println("hotel: " + Arrays.toString(hotel));
		hotelprint();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("全てのペットに餌をあげるには'food'を入力してください");
		System.out.println("指定したペットに餌をあげるには部屋番号を入力してください");

		String feed = sc1.nextLine();

		while (true) {
			if (determine_number(feed)) {
				roomnum = Integer.valueOf(feed);
				peteat(roomnum);
				break;

			} else if (feed.equals("food")) {
				peteat(feed);
				break;
			} else {
				System.out.println("入力は'food'或いは数字のみ!");
				feed = sc1.next();
			}
		}

	}

//	喂食 若只输入eat，则喂食所有宠物。
//	若输入房间号，则喂食对应房间号宠物
	public static void peteat(String food) {

		System.out.println("全てのペットに餌をあげました!");

	}

	public static void peteat(int a) {

		for (int i = 0; i < Hotel.COUNT; i++) {
			if (hotel[i] != null && hotel[i].roomnum == a) {
//				System.out.println(hotel[i].roomnum+"号室の"+hotel[a-1].name+
//						"("+hotel[i].type+")"+"に餌をあげました");
				hotel[i].eat();
				break;
			}else{
				System.out.println("空室です！");
				
			}
		}

	}

//	让宠物运动 若只输入play，则让所有的宠物都运动。
//	若输入房间号，则让对应房间号的宠物运动
	public void sport() {

//		
		int roomnum;
//		System.out.println("hotel: " + Arrays.toString(hotel));
		hotelprint();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("全てのペットを運動させるには'play'を入力してください");
		System.out.println("指定したペットを運動させるには部屋番号を入力してください");

		String play = sc1.nextLine();

		while (true) {
			if (determine_number(play)) {
				roomnum = Integer.valueOf(play);
				petsport(roomnum);
				break;

			} else if (play.equals("play")) {
				petsport(play);
				break;
			} else {
				System.out.println("入力は'play'或いは数字のみ!");
				play = sc1.next();
			}
		}
	}

	public static void petsport(String play) {
		for (int i = 0; i < Hotel.COUNT; i++) {
			if (hotel[i].type.equals("CAT")) {
				((Cat) hotel[i]).run();
			} else if (hotel[i].type.equals("DOG")) {
				((Dog) hotel[i]).run();
			} else if (hotel[i].type.equals("BIRD")) {
				((Bird) hotel[i]).fly();
			}
		}
		System.out.println("全てのペットを運動させました！");

	}

	public static void petsport(int a) {

		for (int i = 0; i < Hotel.COUNT; i++) {
			if (hotel[i].roomnum == a && hotel[i].type.equals("CAT")) {
				((Cat) hotel[i]).run();
			} else if (hotel[i].roomnum == a && hotel[i].type.equals("DOG")) {
				((Dog) hotel[i]).run();
			} else if (hotel[i].roomnum == a && hotel[i].type.equals("BIRD")) {
				((Bird) hotel[i]).fly();
			}
		}
	}

//	检索
	public void search() {
		System.out.println("空部屋を検索したい場合は room を入力してください");
		System.out.println("自分のペットのいる部屋を検索したい場合は 部屋番号 を入力してください");
		Scanner sc1 = new Scanner(System.in);
		while (true) {
			String check = sc1.nextLine();
			if (check.equals("room")) {
				System.out.println("空いている部屋は");
				for (int i = 0; i < hotel.length; i++) {
					if (i == 9 && hotel[i] == null) {
						System.out.print(setroom[i] + "号室");
						break;
					} else if (hotel[i] == null) {
						System.out.print(setroom[i] + "号室,");
					}
					
				}
				System.out.println();
//			} else if (check.equals("type")) {
			} else if (determine_number(check)) {
				int type = Integer.valueOf(check) - 1;
//				System.out.println(hotel[setroom[type]]);
				if(hotel[setroom[type]-1] != null ) {
					String a = hotel[setroom[type]-1].getType();
					if("CAT".equals(a)) {
						TYPE tp = TYPE.CAT;
					System.out.println(tp.getTP());
					}else if ("DOG".equals(a)) {
						TYPE tp = TYPE.DOG;
					}else {
						TYPE tp = TYPE.BIRD;
					}
					
					
					
					
				}
//				String petname = null;
//				System.out.println("ペットの名前を入力してください");
//				String name = sc1.nextLine();
//				for (int i = 0; i < hotel.length; i++) {
//					
//					if (hotel[i] != null) {
//						petname = hotel[i].name;
//						if (petname.equals(name)) {
//							System.out.println(hotel[i]);
//						}
//						
//						break;
//					}
//				}
			}
			break;

		}

	}

//	判断输入的内容是字符串或是数值
	public static boolean determine_number(String str) {
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;//字符串
			}
		}
		return true; //数字
	}

//	打印房间信息
	public void hotelprint() {
//		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < 10; i++) {
			

			if (hotel[i] != null) {
				System.out.print(hotel[i] + ", ");
			} else if (i == 0) {
				System.out.print("[" + setroom[i] + "号室:空室, ");

			} else if (i == 9) {
				System.out.print(setroom[i] + "号室:空室]");
			} else {
//								 i + 1
				System.out.print(setroom[i] + "号室:空室, ");
			}
//			System.out.println("hotel: " + Arrays.toString(hotel));
		}
		System.out.println("");
	}
}
