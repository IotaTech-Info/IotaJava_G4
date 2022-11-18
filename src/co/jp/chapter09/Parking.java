package co.jp.chapter09;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {

	
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----- 実行開始 -----");

	    car[] Parking = new car[10];
	    
	    
	    
	    
	    		
		String name = "";
		int carnum = 0;
		String type = "";

		Scanner sc1 = new Scanner(System.in);

		boolean if_cancel = false; 

		
		for (;;) {

			System.out.println("Parking: " + Arrays.toString(Parking));

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

				Parking[number - 1] = null;               //取消房间

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

						if ("name".equals(input_name1[0])) {              

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

				String[] input_carnum = sc1.nextLine().split(":"); // 形式：AGE:2

				if (input_carnum.length == 3) {                        // 形式：判断输入AGE是否错误

					if ("carnum".equals(input_carnum[0]) && Integer.valueOf(input_carnum[1]) > 0) {        // 字符串转成int整数，是否为负数

						carnum = Integer.valueOf(input_carnum[1]);                    // 给carnum赋int型整数值
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
							&& ("Kcar".equals(input_type[1]) || "Motor".equals(input_type[1]) || "Motor".equals(input_type[1]))) {

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
						
						if (Parking[number] != null) {
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
			case "Kcar":                                    // 当输入的type为DOG时
				Parking[number] = new Kcar(name, carnum, type);
				break;

			case "Truck":                                    // 当输入的type为CAT时
				Parking[number] = new Motor(name, carnum, type);
				break;

			case "Motor":                                   // 当输入的type为BIRD时
				Parking[number] = new Truck(name, carnum, type);
				break;
			}
			
				name = "";
				carnum = 0;                                   // 避免错误生成obj
				type = "";

				
				if (car.COUNT >= 10) {

					System.out.println("住满");
					break;

				}

			}


			System.out.println("----- 実行終了 -----");
		}

}