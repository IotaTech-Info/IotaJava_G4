package co.jp.part2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----- 実行開始 -----");

		Room[] hotel = new Room[10];
		for (int i = 0; i < 10; i++)
			hotel[i] = new Room();
		int count = 0;
		String name = "";
		int age = 0;
		String type = "";

		Scanner sc1 = new Scanner(System.in);
		boolean display = false;
		boolean help = true;
		boolean check = false;
		boolean checkout = false;
		boolean search = false;
		boolean action = false;
		boolean pass_command = false;
		int movement=0;//动作
		int money=0;
		int days=0;
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/co/jp/part2/pets.txt"));
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				String[] input_array = line.split(" ");

				String[] inputName = input_array[0].split(":");
				String[] inputAge = input_array[1].split(":");
				String[] inputType = input_array[2].split(":");
				if (inputName.length == 2 && inputAge.length == 2 && inputType.length == 2)
					if (Integer.valueOf(inputAge[1]) > 0 && ("CAT".equals(inputType[1]) || "DOG".equals(inputType[1])
							|| "BIRD".equals(inputType[1]))) {// 入力値の判断

						if ("NAME".equals(inputName[0])) {
							name = inputName[1];
						}

						if ("AGE".equals(inputAge[0])) {
							age = Integer.valueOf(inputAge[1]);
						}

						if ("TYPE".equals(inputType[0])) {
							type = inputType[1];
						}
					}
				count=i%4;
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = simpleDateFormat.format(new Date());
				// input 情報を収集できた時点
				if (type.equals("DOG") || type.equals("CAT") || type.equals("BIRD")) {
					hotel[count].checkin(name, age, type, age, count, dateString);
				} else
					System.out.println("TYPE範囲外のため、異常終了");
			i++; }
			br.close();
			} catch (IOException e) {
			    e.printStackTrace();
			}
		
		
		for (;;) {
			if (movement!=0 && movement%5==0) {
				movement=0;
				days++;
				money-=2500;
			}
			System.out.println("money:"+money+"days:"+days+"步数:"+movement+"/5");

			
			
			if (display == true) {
				display = false;
				for (int i = 0; i < 10; i++) {
					if (hotel[i].n_pets != 0) {
						System.out.println("第" + (i + 1) + "室:");
						hotel[i].view();
					} else {
						System.out.print("第" + (i + 1) + "室:空き室  ");
					}
					if ((i + 1) % 2 == 0) {
						System.out.println();
					}

				}
			}

			System.out.println("----- ループ開始 -----");
			System.out.println("");
			if (help == true) {
				help = false;
				System.out.println("命令：「help」		全部の命令を表示");
				System.out.println("命令：「display」		ホテルの使用情報を表示");
				System.out.println("命令：「check」		チェックイン");
				System.out.println("命令：「checkout」	退却");
				System.out.println("命令：「search」		部屋の状況を表示");
				System.out.println("命令：「action」		Petを外出させる");
				System.out.println("命令：「exit」		プログラムを退出");
			}

			String input = sc1.nextLine().trim();
			if (input.length() == 0) {
				continue;
			}
			if (pass_command == false)
				if ("exit".equals(input)) {
					System.out.println("----- ループ終了 -----");
					break;
				} else if ("display".equals(input)) {
					display = true;
					continue;
				} else if ("help".equals(input)) {
					help = true;
					continue;
				} else if ("check".equals(input)) {
					check = true;
					pass_command = true;
					System.out.println("ペットの情報を入力してください(形式 NAME:金柑 AGE:18 TYPE:DOG)");
					System.out.println("TYPEの範囲は「CAT、DOG、BIRD」");
					System.out.println("入力中断:「q」");
				} else if ("checkout".equals(input)) {
					boolean is_empty = true;
					for (Room a : hotel) {
						if (a.n_pets == 0) {
							is_empty = false;
							break;
						}
					}
					if (is_empty) {
						System.out.println("***********************");
						System.out.println("* 全部の室空いています!! *");
						System.out.println("***********************");

						display = true;

						help = true;
					}

					display = true;
					checkout = true;
					pass_command = true;
					System.out.println("取消するの番号を入力してください(範囲 1-10)");
					System.out.println("入力中断:「q」");
				} else if ("search".equals(input)) {
					search = true;
					pass_command = true;
					System.out.println("取消するの番号を入力してください(範囲 1-10)");
					System.out.println("入力中断:「q」");

				} else if ("action".equals(input)) {
					boolean is_empty = true;
					for (Room a : hotel) {
						if (a.n_pets == 0) {
							is_empty = false;
							break;
						}
					}
					if (is_empty) {
						System.out.println("***********************");
						System.out.println("* 全部の室空いています!! *");
						System.out.println("***********************");

						display = true;

						help = true;
					}

					System.out.println("***<活動するの動物を選んでください>***");
					action = true;
					display = true;
					pass_command = true;
				} else if (check == false && checkout == false && search == false && action == false) {
					// INPUT エラーチェック
					help = true;
					System.out.println("INPUT形式不正のため、異常終了");
					continue;
				}

			if (display == true) {
				display = false;
				for (int i = 0; i < 10; i++) {
					if (hotel[i].n_pets != 0) {
					System.out.println("第" + (i + 1) + "室:");
						hotel[i].view();
					} else {
						System.out.print("第" + (i + 1) + "室:空き室  ");
					}
					if ((i + 1) % 2 == 0) {
						System.out.println();
					}

				}
			}
			if ("q".equals(input)) {
				display = false;
				help = true;
				check = false;
				checkout = false;
				search = false;
				pass_command = false;
			}
			String input2 = sc1.nextLine().trim();

			if ("q".equals(input2)) {
				display = false;
				help = true;
				check = false;
				checkout = false;
				search = false;
				pass_command = false;
			}

			if (action == true) {
				boolean is_empty = true;
				for (Room a : hotel) {
					if (a.n_pets != 0) {
						is_empty = false;
						break;
					}
				}
				if (is_empty) {
					System.out.println("***********************");
					System.out.println("* 全部の室空いています!! *");
					System.out.println("***********************");

					display = true;
					help = true;
					action = false;
					pass_command = false;
					continue;
				}

				int index;// 获得房间号
				try {
					index = Integer.valueOf(input2);
				} catch (NumberFormatException e) {
					System.out.println("エラー:数字を入力してください");
					continue;
				}
				if (index < 0 || index > 10) {
					System.out.println("INPUT形式不正 原因:番号の範囲が間違い(0-10)   " + input2);
					continue;
				} else if (hotel[index - 1] == null) {
					System.out.println("第" + input2 + "室いま空いています 入力直してください");
					continue;
				}
				boolean to_continue=false;
				for (;;) {// 获得宠物序号
					hotel[index - 1].view();
					System.out.println("ペットの番号を入力ください:");
					String actCheck = sc1.nextLine().trim();
					if("q".equals(actCheck)) {
						to_continue=true;
						break;
					}
					int index_pet;
					try {
						index_pet = Integer.valueOf(actCheck);
					} catch (NumberFormatException e) {
						System.out.println("エラー:数字を入力してください");
						continue;
					}
					System.out.println("***<Actionを選んでください (play & eat)>***");
					String act = sc1.nextLine().trim();
					try {
						if ("play".equals(act)) {

							hotel[index - 1].pets[index_pet - 1].active();
							hotel[index - 1].pets[index_pet - 1].getStatus();
							hotel[index - 1].pets[index_pet - 1].getFeed();

							break;
						} else if ("eat".equals(act)) {

							hotel[index - 1].pets[index_pet - 1].eat();
							hotel[index - 1].pets[index_pet - 1].getStatus();
							hotel[index - 1].pets[index_pet - 1].getFeed();
							break;

						} else {
							System.out.println("***<正しいのActionを選んでください (play & eat)>***");

						}
					} catch (NullPointerException e) {
						System.out.print("そんな番号はない");
						continue;
					}
				}
				if(to_continue=true) {
					continue;
				}
				action = false;
				pass_command = false;
				movement++;
				money+=200;
				continue;
			}

			if (check == true) {
				System.out.println("ただいま、満員になりました。");
				name = "";
				age = 0;
				type = "";
				if (Pet.COUNT >= 50) {
					System.out.println("ただいま、満員になりました。");
					check = false;
					pass_command = false;
					continue;
				}
				String[] input_array = input2.split(" ");
				if (input_array.length < 3) {// INPUT エラーチェック
					System.out.println("INPUT形式不正 入力直すください");
					System.out.println("原因:ペットの情報を入力してください(形式 NAME:金柑 AGE:18 TYPE:DOG)");
					continue;
				}

				for (String str : input_array)
					System.out.println(str);

				String[] inputName = input_array[0].split(":");
				String[] inputAge = input_array[1].split(":");
				String[] inputType = input_array[2].split(":");
				try {
					Integer.valueOf(inputAge[1]);
				} catch (NumberFormatException e) {
					System.out.println("エラー:数字を入力してください");
					continue;
				}
				if (inputName.length == 2 && inputAge.length == 2 && inputType.length == 2)
					if (Integer.valueOf(inputAge[1]) > 0 && ("CAT".equals(inputType[1]) || "DOG".equals(inputType[1])
							|| "BIRD".equals(inputType[1]))) {// 入力値の判断

						if ("NAME".equals(inputName[0])) {
							name = inputName[1];
						}

						if ("AGE".equals(inputAge[0])) {
							age = Integer.valueOf(inputAge[1]);
						}

						if ("TYPE".equals(inputType[0])) {
							type = inputType[1];
						}

						check = false;

						pass_command = false;
					}
				System.out.println();
				if (check == true) {
					System.out.println(check);
					System.out.println("INPUT形式不正 入力直すください");
					System.out.println("原因:ペットの情報を入力してください(形式 NAME:金柑 AGE:18 TYPE:DOG)");
					System.out.println("TYPEの範囲は「CAT、DOG、BIRD」");
					continue;
				}

				for (;;) {
					System.out.println("入室したいの番号を入力ください:");
					String inputCheck = sc1.nextLine().trim();
					try {
						count = Integer.valueOf(inputCheck);
					} catch (NumberFormatException e) {
						System.out.println("エラー:数字を入力してください");
						continue;
					}
					break;
				}

				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = simpleDateFormat.format(new Date());
				// input 情報を収集できた時点
				if (type.equals("DOG") || type.equals("CAT") || type.equals("BIRD")) {
					hotel[count - 1].checkin(name, age, type, age, count, dateString);
				} else
					System.out.println("TYPE範囲外のため、異常終了");
				// 初期化
				movement+=2;
				money+=500;
				display = true;
			} // if(check==true)

			if (checkout == true) {
				// 入力検査
				int index;// 获得房间号
				try {
					index = Integer.valueOf(input2);
				} catch (NumberFormatException e) {
					System.out.println("エラー: 数字を入力してください");
					continue;
				}
				if (index < 0 || index > 10) {
					System.out.println("INPUT形式不正 原因:番号の範囲が間違い(0-10)   " + input2);
					continue;
				} else if (hotel[index - 1] == null) {
					System.out.println("第" + input2 + "室いま空いています 入力直してください");
					continue;
				}
				boolean to_continue=false;

				for (;;) {// 获得宠物序号
					hotel[index - 1].view();
					System.out.println("ペットの番号を入力ください:");
					String actCheck = sc1.nextLine().trim();
					if("q".equals(actCheck)) {
						to_continue=true;
						break;
					}
					int index_pet;
					try {
						index_pet = Integer.valueOf(actCheck);
					} catch (NumberFormatException e) {
						System.out.println("エラー:数字を入力してください");
						continue;
					}
					hotel[index - 1].pets[index_pet-1] = null;
					break;
				}

				display = true;
				checkout = false;
				pass_command = false;
				Pet.COUNT--;
				movement+=1;
				continue;
			}

			if (search == true) {
				int index;// 获得房间号
				try {
					index = Integer.valueOf(input2);
				} catch (NumberFormatException e) {
					System.out.println("エラー: 数字を入力してください");
					continue;
				}
				if (index <= 0 || index > 10) {
					System.out.println("INPUT形式不正 原因:番号の範囲が間違い(0-10)   " + input2);
					continue;
				}
				if (hotel[index - 1].n_pets != 0) {
					for (Pet a : hotel[index - 1].pets) {
						System.out.println("第" + (index) + "室:");
						a.view();
					}
				} else {
					System.out.println("第" + (index) + "室:空き室  ");
				}
				search = false;
				pass_command = false;
				continue;
			}
			
		} // for(;;)
	}
}