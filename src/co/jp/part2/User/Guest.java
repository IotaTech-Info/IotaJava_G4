package co.jp.part2.User;

import java.util.Scanner;

import co.jp.part2.PetType;
import co.jp.part2.RoomStatus;
import co.jp.part2.Pet.Bird;
import co.jp.part2.Pet.Cat;
import co.jp.part2.Pet.Dog;

public class Guest {

	// guest window
	public void Guestenter(Hotel[] hotel) {

		while (true) {
			System.out.println("**********************************");
			System.out.println("***     いらっしゃいませ、ゲストさん    ***");
			System.out.println("*** 1.空室予約。                  ***");
			System.out.println("*** 2.予約キャンセル。              ***");
			System.out.println("*** 3.前に戻る。                  ***");
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
				Reserve(hotel);
				break;
			case 2:
				Cancel(hotel);
				break;
			case 3:
				return;
			default:
				System.out.println("異常入力のため、やり直してください");
				break;
			}

		}

	}

	// 予約メソッド
	private void Reserve(Hotel[] hotel) {
		if (!ShowRoom(hotel)) {
			System.out.println("部屋が一杯です、予約ができません");
			return;
		}
		String name;
		int age;
		int type_code;
		int room_num=0;
		room_num=findEmptyRoom(hotel);
		if(room_num==-1) {
			System.out.println("予想外なエラーが発生、管理員さんにご連絡ください。");
			return;
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("空室があります。まずは情報を入力してください");
		while (true) {
			System.out.println("お名前:");
			name = sc.next();
			if (null ==name||"".equals(name)) {
				System.out.println("名前を入力してください");
				continue;
			}
			break;
		}
		while (true) {
			try {
				sc=new Scanner(System.in);
				System.out.println("年齢:");
				age = sc.nextInt();
			} catch (Exception e) {
				System.out.println("異常入力のため、やり直してください");
				continue;
			}
			break;
		}
		while (true) {
			try {
				System.out.println("種類は？");
				System.out.println("１．猫　２．犬　３．鳥");
				sc=new Scanner(System.in);
				type_code = sc.nextInt();
				
				switch(type_code) {
					case 1:
						Cat cat=new Cat(name,age,PetType.getEumn(type_code).type);
						hotel[room_num].setPet(cat);
						cat.run();
						break;
					case 2:
						Dog dog=new Dog(name,age,PetType.getEumn(type_code).type);
						hotel[room_num].setPet(dog);
						dog.run();
						break;
					case 3:
						Bird bd=new Bird(name,age,PetType.getEumn(type_code).type);
						hotel[room_num].setPet(bd);
						bd.fly();
						break;
					default:
						System.out.println("異常入力のため、やり直してください");
						continue;
				
				}
				
			} catch (Exception e) {
				System.out.println("異常入力のため、やり直してください");
				continue;
			}

			break;
		}
		hotel[room_num].setStatus(RoomStatus.RESERVE);
		System.out.println("予約成功、ご利用ありがとうございます。");

	}

	//次の空室を探す,ない場合は-1
	private int findEmptyRoom(Hotel[] hotel) {
		for (int i=0;i<hotel.length;i++) {
			if(hotel[i].getStatus()==RoomStatus.EMPTY) {
				return i;
			}
		}
		return -1;
	}

	// キャンセル
	private void Cancel(Hotel[] hotel) {
		System.out.println("キャンセルしたいペットの部屋番号を選んでください！-1は前画面に戻る");
		for (int i=0;i<hotel.length;i++) {
			if(hotel[i].getStatus()==RoomStatus.RESERVE) {
				System.out.println("部屋番号:"+i+".\t名前："+hotel[i].getPet().getName()+"  "+hotel[i].getPet().getAge()+"才  "+PetType.getEumn(hotel[i].getPet().getType()).description);
			}
		}
		int cancel_num;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				cancel_num = sc.nextInt();
				if(cancel_num==-1) {
					return;
				}
				if(hotel[cancel_num].getStatus()!=RoomStatus.RESERVE) {
					System.out.println("この部屋が選べません！やり直してください！");
					continue;
				}
			} catch (Exception e) {
				System.out.println("異常入力のため、やり直してください");
				continue;
			}
			hotel[cancel_num].setPet(null);
			hotel[cancel_num].setStatus(RoomStatus.EMPTY);
			System.out.println("キャンセルしました！");
			break;
		}
	}

	// showroom
	// returnは空室状況 trueは空室あり、falseは無し
	private boolean ShowRoom(Hotel[] hotel) {
		boolean isEmpty = false;
		System.out.print("部屋状況は：");
		for (Hotel in : hotel) {
			in.showHetel();
			if (in.getStatus() == RoomStatus.EMPTY) {
				isEmpty = true;
			}
		}
		System.out.println("です！");
		return isEmpty;
	}
}
