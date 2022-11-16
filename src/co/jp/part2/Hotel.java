package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----- 実行開始 -----");

	    Pet[] hotel = new Pet[10];
	    
	    
	    
	    
	    		
		String name = "";
		int age = 0;
		String type = "";

		Scanner sc1 = new Scanner(System.in);

		boolean if_cancel = false; 

		
		for (;;) {

			System.out.println("hotel: " + Arrays.toString(hotel));

			System.out.println("----- ループ開始 -----");
			String input = sc1.nextLine(); // 输入信息

			if ("exit".equals(input)) {
				System.out.println("----- ループ終了 -----");
				break; 
			}

			if ("cancel".equals(input)) {                    // 退房，输入cancel，

				if_cancel = true;

				continue;

			}

			if (if_cancel == true) {                    // 输入取消几号房间

				if_cancel = false;

				int number = Integer.valueOf(input);

				hotel[number - 1] = null;               //取消房间

				continue;

			}

			
			

			
			String[] input_name = input.split(":");    // 形式：NAME:A

			if (input_name.length == 2 && "NAME".equals(input_name[0])) {      //判断是否输入完整且是否输入”NAME“

				name = input_name[1];                                        

			} else {                                                         

				System.out.println("输入错误，请输入NAME");                   

				for (;;) {

					String[] input_name1 = sc1.nextLine().split(":");      

					if (input_name1.length == 2) {                         

						if ("NAME".equals(input_name1[0])) {              

							name = input_name1[1];                       

						} else {                                          

							System.out.println("输入错误，请重新输入NAME");   
							continue;

						}

					} else {                                              

						System.out.println("格式错误，请重新输入NAME");    
						continue;
					}

				}
			}

			for (;;) {

				String[] input_age = sc1.nextLine().split(":"); // 形式：AGE:2

				if (input_age.length == 2) {                        // 形式：判断输入AGE是否错误

					if ("AGE".equals(input_age[0]) && Integer.valueOf(input_age[1]) > 0) {        // 字符串转成int整数，是否为负数

						age = Integer.valueOf(input_age[1]);                    // 给age赋int型整数值
						break;
						
						
					} else {

						System.out.println("输入错误，请重新输入AGE");
						continue;

					}

				} else {

					System.out.println("格式错误，请重新输入AGE");
					continue;
				}
				
			}

			for (;;) {

				String[] input_type = sc1.nextLine().split(":"); // 形式：TYPE:CAT

				if (input_type.length == 2) {                    // 输入TYPE是否错误

					if ("TYPE".equals(input_type[0])
							&& ("CAT".equals(input_type[1]) || "DOG".equals(input_type[1]) || "BIRD".equals(input_type[1]))) {

						type = input_type[1];
						
						break;

					} else {

						System.out.println("输入错误，请重新输入TYPE");
						continue;

					}

				} else {

					System.out.println("格式错误，请重新输入TYPE");
					continue;
				}
			}

			
			int number ;
			

			for (;;) {

				String[] input_number = sc1.nextLine().split(":"); // 形式：NUMBER:3

				if (input_number.length == 2) {                        // 判断输入NUMBER是否错误

					if ("NUMBER".equals(input_number[0]) && Integer.valueOf(input_number[1]) > 0
							&& Integer.valueOf(input_number[1]) < 10) {                   // 字符串转成整数，是否符合条件

						number = Integer.valueOf(input_number[1]);                // 给number赋int型整数值
					    
						number = number - 1;
						
						if (hotel[number] != null) {
							System.out.println("房间使用中，请重新选择NUMBER");
							continue;

						}
						break;
						
					} else {

						System.out.println("输入错误，请重新输入NUMBER");
						continue;

					}

				} else {

					System.out.println("格式错误，请重新输入NUMBER");
					continue;
				}
			}

			switch (type) {
			case "DOG":                                    // 当输入的type为DOG时
				hotel[number] = new Dog(name, age, type);
				break;

			case "CAT":                                    // 当输入的type为CAT时
				hotel[number] = new Cat(name, age, type);
				break;

			case "BIRD":                                   // 当输入的type为BIRD时
				hotel[number] = new Bird(name, age, type);
				break;
			}
			
				name = "";
				age = 0;                                   // 避免错误生成obj
				type = "";

				
				if (Pet.COUNT >= 10) {

					System.out.println("住满");
					break;

				}

			}


			System.out.println("----- 実行終了 -----");
		}

	}

