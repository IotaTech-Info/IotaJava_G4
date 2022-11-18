package co.jp.chapter01;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
		
		System.out.println("整数を入力してください");
		
		int a = input.nextInt();
				
	
		
		if (a%2 == 1) {
			
			System.out.println("奇数");
			
		}else {
			System.out.println("偶数");
		}
		

	}

}
