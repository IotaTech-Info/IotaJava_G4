package co.jp.part2;

import java.util.Scanner;

public class Animalhotel {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("-----------------------");
//		System.out.printf("%-8s|%-8s|%-8s%n", "NAME","AGE","TYPE");
//		System.out.println("-----------------------");
//		System.out.printf("%-8s|%-8s|%-8s%n", "abc","11","dog");
//		System.out.println("-----------------------");
		Pet[] hotel = new Pet[10];
		for(;;) {
			System.out.println("choose func you want :");
			System.out.println("1:check in , 2:check out , 3:find free room , 4.pet's info , 5:exit.");
			Scanner sc1 = new Scanner(System.in);
			String input = sc1.nextLine();
			try {
				Integer.valueOf(input);
			}catch(NumberFormatException e) {
				System.out.println("data error!");
				continue;
			}
			if (Integer.valueOf(input) <= 0 || Integer.valueOf(input) > 5){
				System.out.println("data error, back to func.");
			}else {
				if (Integer.valueOf(input) == 1) {
					Admin.checkin(hotel);
					continue;
				}
				if (Integer.valueOf(input) == 2) {
				Admin.checkout(hotel);
					continue;
				}
				if (Integer.valueOf(input) == 3) {
					Admin.checkroom(hotel);
					continue;
				}
				if (Integer.valueOf(input) == 4) {
					Admin.room_info(hotel);
					continue;
				}
				if (Integer.valueOf(input) == 5) {
					
					break;
				}
			
			}
//			admin.checkin(hotel);
			
			
		}
//		System.out.println("hotel: " + Arrays.toString(hotel));
//		NAME:a,AGE:1,TYPE:dog
	}

}
