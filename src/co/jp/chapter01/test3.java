package co.jp.chapter01;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x,y;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("一つ目の整数を入力してください");
		x = scanner.nextInt();
		System.out.println("二つ目の整数を入力してください");
		y = scanner.nextInt();
			if (x >y) {
				System.out.println(x + "は大きい。");
			}else {
				System.out.println(y + "は大きい。");
			}
	}
}
		
	
