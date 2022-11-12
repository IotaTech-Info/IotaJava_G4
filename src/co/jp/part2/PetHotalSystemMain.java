package co.jp.part2;

import java.util.Scanner;

import co.jp.part2.User.Admin;
import co.jp.part2.User.Guest;
import co.jp.part2.User.Hotel;

public class PetHotalSystemMain {
	public static void main(String[] args) {
		
		Hotel[] ho =new Hotel[10];
		Guest gu= new Guest();
		Admin ad= new Admin();
		for(int i=0;i<ho.length;i++) {
			ho[i]=new Hotel();
			
		}
		while (true) {
			System.out.println("**********************************");
			System.out.println("***     ようこそ、ｘｘｘペットホテル    ***");
			System.out.println("*** 1.ゲストさん。                 ***");
			System.out.println("*** 2.管理員。　　　　              ***");
			System.out.println("*** 3.終わり。　                  ***");
			System.out.println("**********************************");
			
			Scanner sc = new Scanner(System.in);
			int a;
			try {
				a = sc.nextInt();
			} catch (Exception e) {

				System.out.println("異常入力のため、やり直してください");
				continue;
			}
			switch (a) {
			case 1:
				gu.Guestenter(ho);
				break;
			case 2:
				ad.AdminEntry(ho);
				break;
			case 3:
				System.out.println("ご利用いただきありがとうございました。");
				return;
			default:
				System.out.println("異常入力のため、やり直してください");
				break;
			}

		}
	}

}
