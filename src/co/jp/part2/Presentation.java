package co.jp.part2;

import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----- 実行開始 -----");

		Pet[] hotel = new Pet[10];

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

		for (;;) {

			if (display == true) {
				display = false;
				for (int i = 0; i < 10; i++) {
					if (hotel[i] != null) {
						System.out.print("第" + (i + 1) + "室:[" + hotel[i].name + "]ちゃん  ");
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
					continue;
				} else if ("checkout".equals(input)) {
					boolean is_empty=true;
					for(Pet a:hotel) {
						if(a!=null) {is_empty=false;break;}
					}
					if(is_empty) {
						System.out.println("***********************");
						System.out.println("* 全部の室空いています!! *");
						System.out.println("***********************");

						display = true;
						
						help=true;
						continue;
					}
					
					display = true;
					checkout = true;
					pass_command = true;
					System.out.println("取消するの番号を入力してください(範囲 1-10)");
					System.out.println("入力中断:「q」");
					continue;
				} else if ("search".equals(input)) {
					search = true;
					pass_command = true;
					System.out.println("取消するの番号を入力してください(範囲 1-10)");
					System.out.println("入力中断:「q」");
					continue;
					
				} else if("action".equals(input)) {
					boolean is_empty=true;
					for(Pet a:hotel) {
						if(a!=null) {is_empty=false;break;}
					}
					if(is_empty) {
						System.out.println("***********************");
						System.out.println("* 全部の室空いています!! *");
						System.out.println("***********************");

						display = true;
						
						help=true;
						continue;
					}

					 System.out.println("***<活動するの動物を選んでください>***");
					 action = true;
					 display = true;
					 pass_command = true;
					 continue;
				}else if (check == false && checkout == false && search == false && action == false) {
					// INPUT エラーチェック
					help = true;
					System.out.println("INPUT形式不正のため、異常終了");
					continue;
				}

			if ("q".equals(input)) {
				display = false;
				help = true;
				check = false;
				checkout = false;
				search = false;
				pass_command = false;
			}

			if(action==true) {
				

				boolean is_empty=true;
				for(Pet a:hotel) {
					if(a!=null) {is_empty=false;break;}
				}
				if(is_empty) {
					System.out.println("***********************");
					System.out.println("* 全部の室空いています!! *");
					System.out.println("***********************");

					display = true;
					
					help=true;
					

					action=false;
					pass_command=false;
					
					
					continue;
					
					
				}
				

				int index = Integer.valueOf(input);
				
				if (index < 0 || index > 10) {
					System.out.println("INPUT形式不正 原因:番号の範囲が間違い(0-10)   " + input);
					continue;
				}else if(hotel[index - 1] == null) {
					System.out.println("第" + input+"室いま空いています 入力直してください");
					continue;
				}
				
				
				for(;;) {

					System.out.println("***<Actionを選んでください (play & eat)>***");
					String act = sc1.nextLine().trim();
					if("play".equals(act)) {
						
						hotel[index-1].active();
						hotel[index-1].getStatus();
						hotel[index-1].getFeed();
						
						break;
					}else if ("eat".equals(act)) {

						hotel[index-1].eat();
						hotel[index-1].getStatus();
						hotel[index-1].getFeed();
						break;
						
					}else {
						System.out.println("***<正しいのActionを選んでください (play & eat)>***");
						
					}
				}
				action=false;
				pass_command=false;
				continue;
			}
			
			
			
			if (check == true) {
				if(Pet.COUNT>=10) {
					System.out.println("ただいま、満員になりました。");
					check = false;
					pass_command = false;
					continue;
				}
				String[] input_array = input.split(" ");
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

				count = Pet.COUNT;
				for (int i = 0; i < Pet.COUNT; i++) {
					if (hotel[i] == null) {
						count = i;
						Pet.COUNT--;
					}
				}
				// input 情報を収集できた時点
				switch (type) {
				case "DOG":
					hotel[count] = new Dog(name, age,Type.Dog,80,100);
					// TODO DOG
					break;
				case "CAT":
					hotel[count] = new Cat(name, age,Type.Cat,80,100);
					// TODO CAT
					break;
				case "BIRD":
					hotel[count] = new Bird(name, age,Type.Bird,80,100);
					break;
				default:
					System.out.println("TYPE範囲外のため、異常終了");
				}
				// 初期化
				display = true;
				name = "";
				age = 0;
				type = "";
			} // if(check==true)

			if (checkout == true) {
				// 入力検査
				int index = Integer.valueOf(input);
				if (index < 0 || index > 10 ) {
					System.out.println("INPUT形式不正 原因:番号の範囲が間違い(0-10)   " + input);
					continue;
				}else if(hotel[index - 1] == null) {
					System.out.println("第" + input+"室いま空いています 入力直してください");
					continue;
				}
				hotel[index - 1] = null;
				display = true;
				checkout = false;
				pass_command = false;
				Pet.COUNT--;
				continue;
			}

			if (search == true) {
				int index = Integer.valueOf(input);
				if (index <= 0 || index > 10) {
					System.out.println("INPUT形式不正 原因:番号の範囲が間違い(0-10)   " + input);
					continue;
				}
				if (hotel[index - 1] != null) {
					System.out.println(
							"第" + (index) + "室に住む" + hotel[index - 1].type.getType() + "は[" + hotel[index - 1].name + "]  ");
					System.out.println("年齢:" + hotel[index - 1].age + "歳です");
					hotel[index-1].getStatus();
					hotel[index-1].getFeed();
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
