package co.jp.part2.User;

import java.util.Scanner;

import co.jp.part2.PetType;
import co.jp.part2.RoomStatus;

public class Admin {
	private static final String pwd = "admin";

	public void AdminEntry(Hotel[] hotel) {
		System.out.println("管理員パスワードを入力してください：");
		Scanner sc = new Scanner(System.in);
		String enter = sc.next();
		if (!pwd.equals(enter)) {
			System.out.println("パスワードエラー、前画面に戻ります！");
			return;
		}

		AdminForm(hotel);
	}

	private void AdminForm(Hotel[] hotel) {
		ShowRoom(hotel);
		while (true) {
			System.out.println("**********************************");
			System.out.println("***    　　　　管理員システム　　　　    ***");
			System.out.println("*** 1.予約受付。                  ***");
			System.out.println("*** 2.給食。  　　　　　            ***");
			System.out.println("*** 3.退室。　　                  ***");
			System.out.println("*** 4.前に戻る。                  ***");
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
				ReserveCheck(hotel);
				break;
			case 2:
				Feed(hotel);
				break;
			case 3:
				CheckOut(hotel);
				break;
			case 4:
				return;
			default:
				System.out.println("異常入力のため、やり直してください");
				break;
			}
		}

	}

	private void CheckOut(Hotel[] hotel) {
		System.out.println("チェックアウトしたいの部屋番号を選んでください！-1は全画面に戻る");
		for (int i=0;i<hotel.length;i++) {
			if(hotel[i].getStatus()==RoomStatus.FULL) {
				System.out.println("部屋番号:"+i+".\t名前："+hotel[i].getPet().getName()+"  "+hotel[i].getPet().getAge()+"才  "+PetType.getEumn(hotel[i].getPet().getType()).description);
			}
		}
		int room;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				room = sc.nextInt();
				if(room==-1) {
					return;
				}
				if(hotel[room].getStatus()!=RoomStatus.FULL) {
					System.out.println("この部屋が選べません！やり直してください！");
					continue;
				}
			} catch (Exception e) {
				System.out.println("異常入力のため、やり直してください");
				continue;
			}
			hotel[room].setPet(null);
			hotel[room].setStatus(RoomStatus.EMPTY);
			System.out.println("退室しました！");
			break;
		}
		ShowRoom(hotel);

	}

	private void Feed(Hotel[] hotel) {
		for(Hotel in : hotel) {
			if(in.getStatus()==RoomStatus.FULL) {
				System.out.print(in.getPet().getName()+":");
				in.getPet().eat();
			}
		}
		System.out.println("給食完了！");
	}

	private void ReserveCheck(Hotel[] hotel) {
		for(Hotel in : hotel) {
			if(in.getStatus()==RoomStatus.RESERVE) {
				in.setStatus(RoomStatus.FULL);
				System.out.println(in.getPet().getName()+"が入室した！");
			}
		}
		ShowRoom(hotel);

	}

	// showroom
	private void ShowRoom(Hotel[] hotel) {
		System.out.print("部屋状況は：");
		for (Hotel in : hotel) {
			in.showHetel();
		}
		System.out.println("です！");
	}
}
