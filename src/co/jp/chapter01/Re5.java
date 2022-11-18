/**
 * 
 */
package co.jp.chapter01;
import java.util.Scanner;

public class Re5 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
       Scanner input = new Scanner(System.in);
		
		System.out.println("成績を入力してください");
		
		int a = input.nextInt();
		
		while (a<0 || a>100) {
		
			System.out.println("正しい成績を入力してください");
			
			 a = input.nextInt();
			
		}
		if (a>=80) {
			System.out.println("優");
		}
		else if (a>=70) {
			System.out.println("良");
			
		}
		else if (a>=60) {
			System.out.println("可");
		}
		
		
		else {
			System.out.println("不可");
		}
		
		

	}

	private static void elseif(boolean b) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
