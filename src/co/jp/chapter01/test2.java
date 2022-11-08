package co.jp.chapter01;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x,y,z;
		int biggest_1,biggest_2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("一つ目の整数を入力してください");
		x = scanner.nextInt();
		System.out.println("二つ目の整数を入力してください");
		y = scanner.nextInt();
		System.out.println("三つ目の整数を入力してください");
		z = scanner.nextInt();
		
		biggest_1 = biggest(x,y);
		biggest_2 = biggest(biggest_1,z);
		
		System.out.println("大きい方は" + biggest_2);
	}
	
	public static int biggest(int num_1, int num_2) {
		int num = 0;
		if (num_1 >= num_2)
			num = num_1;
		else if(num_1<= num_2)
			num = num_2;
	return num;
		
	}

}