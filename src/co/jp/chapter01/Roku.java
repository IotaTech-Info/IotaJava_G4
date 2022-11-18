package co.jp.chapter01;
import java.util.Scanner;

public class Roku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner input = new Scanner(System.in);
		
		System.out.println("x = ?");
		double x = input.nextDouble();
		
		System.out.println("y = ?");
		double y = input.nextDouble();
		
		if (x>y) {
			
			System.out.println("x はy より大きい");
			
		}
		

	}

}
