package co.jp.prat2;

import java.util.Scanner;

public class Mainmenu {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("受け開始");	
		System.out.println("機能：1入住、2退却、3予約、4キャンセル、5給食、6終わり");
		System.out.println("機能番号");
		
		while(true) {
			int a;
			try {
				a = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("era");
				return;
			}
			switch(a) {
			case 1:
				h.pri();
				System.out.println("ルーム番号");
				int no = sc.nextInt();
				h.checkin(no);
				System.out.println("main menu戻る");
				break;
			case 2:
				h.pri();
				System.out.println("ルーム番号");
				int no2 = sc.nextInt();
				h.checkout(no2);
				System.out.println("main menu戻る");
				break;
			case 3:
				h.pri();
				System.out.println("ルーム番号");
				int no3 = sc.nextInt();
				h.reserve(no3);
				System.out.println("main menu戻る");
				break;
			case 4:
				h.pri();
				System.out.println("ルーム番号");
				int no4 = sc.nextInt();
				h.cancel(no4);
				System.out.println("main menu戻る");
				break;
			case 5:
				System.out.println("petの名前を入力");
				String name = sc.next();
				h.feed(name);
				System.out.println("main menu戻る");
				break;
			case 6:
				System.out.println("受け終了");
				return;
			default:
				System.out.println("?");
				break;
			}
		}
	}
}
