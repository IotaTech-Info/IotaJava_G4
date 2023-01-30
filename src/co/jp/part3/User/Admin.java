package co.jp.part3.User;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import co.jp.part2.PetType;
import co.jp.part2.RoomStatus;

public class Admin {
	Map<String, String> userlist;
	
	
	public Map<String, String> getUserlist() {
		return userlist;
	}

	public void setUserlist(Map<String, String> userlist) {
		this.userlist = userlist;
	}

	public void AdminForm(Hotel[] hotel, String user) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
		String dateString;
		String aisatu;
		

		ShowRoom(hotel);
		while (true) {
			dateString = simpleDateFormat.format(new Date());
			String[] time=dateString.split(":");
			int hour=Integer.valueOf(time[0]);
			if(hour>=5&&hour<11) {
				aisatu="おはようございます、";
			}else if(hour>=11&&hour<=18) {
				aisatu="こんにちは、";
			}else {
				aisatu="こんばんは、";
			}
			System.out.println(aisatu+user+"さん:");
			System.out.println("**********************************");
			System.out.println("***    　　　　管理員システム　　　　    ***");
			System.out.println("*** 1.予約受付。                  ***");
			System.out.println("*** 2.給食。  　　　　　            ***");
			System.out.println("*** 3.退室。　　                  ***");
			System.out.println("*** 4.前に戻る。                  ***");
			if("admin".equals(user)) {
				System.out.println("*** 9.新しいユーザー登録             ***");
			}
			System.out.println("***	    		現在時刻"+dateString+"  ***");
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
			case 9:
				if(user.equals("admin")) {
					Adduser();
					break;
				}
			default:
				System.out.println("異常入力のため、やり直してください");
				break;
			}
		}

	}

	private void Adduser() {
		String new_userid;
		String new_psw;
		String pws_check;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("新しいユーザー名を入力してください。");
			new_userid = sc.next();
			if ("".equals(new_userid)) {
				System.out.println("空白は使いません。");
				continue;
			}
			if (userlist.containsKey(new_userid) || "admin".equals(new_userid)) {
				System.out.println("このユーザーが既に存在しています。");
				continue;
			} 
			break;
		}
		
		while (true) {
			System.out.println("パスワードを入力してください。");
			new_psw = sc.next();
			if ("".equals(new_psw)) {
				System.out.println("空白は使いません。");
				continue;
			}
			System.out.println("もう一度入力してください。");
			pws_check = sc.next();
			if(!new_psw.equals(pws_check)) {
				System.out.println("入力は一致しません！やり直してください");
				continue;
			}
			break;
		}
		userlist.put(new_userid, new_psw);
		try {
			 Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\workspace\\IotaJava_G4\\src\\co\\jp\\part2\\userpass.txt"),
			 "UTF-8"));
			 for(Map.Entry<String, String> entry : userlist.entrySet()) {
				 out.write(entry.getKey()+","+entry.getValue()+"\r\n");
			 }
			 out.close();
			} catch (IOException e) {
			 e.printStackTrace();
			}
		System.out.println("処理が完了しました。");
	}

	private void CheckOut(Hotel[] hotel) {
		System.out.println("チェックアウトしたいの部屋番号を選んでください！-1は前画面に戻る");
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
