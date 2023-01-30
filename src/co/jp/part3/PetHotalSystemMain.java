package co.jp.part3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.jp.part2.User.Admin;
import co.jp.part2.User.Guest;
import co.jp.part2.User.Hotel;

public class PetHotalSystemMain {
	private static final String super_pwd = "admin";
	private static final String super_user = "admin";
	static String user;// ユーザーから入力
	static String pwd;// ユーザーから入力
	static Map<String, String> userlist = new HashMap<>();// ファイルから書き込み、ユーザー情報

	public static void main(String[] args) {
		// ホテル、キャラ初期化
		Hotel[] ho = new Hotel[10];
		Guest gu = new Guest();
		Admin ad = new Admin();

		// 日付設置
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = new Date();
		String dateString = simpleDateFormat.format(currentDate);
		// 管理員情報チェック

		for (int i = 0; i < ho.length; i++) {
			ho[i] = new Hotel();

		}
		while (true) {
			System.out.println("**********************************");
			System.out.println("***     ようこそ、ｘｘｘペットホテル    ***");
			System.out.println("*** 1.ゲストさん。                 ***");
			System.out.println("*** 2.管理員。　　　　              ***");
			System.out.println("*** 3.終わり。　                  ***");
			System.out.println("*** 今日は:" + dateString + "            ***");
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
				if (AdminEntry()) {
					if(super_user.equals(user)) {
						ad.setUserlist(userlist);
					}else {
						ad.setUserlist(new HashMap<>());
					}
					ad.AdminForm(ho, user);
				}
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

	/**
	 * 管理人パスワードチェック
	 * 
	 * @return adminまた普通管理者はtrue
	 */
	public static boolean AdminEntry() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("D:\\workspace\\IotaJava_G4\\src\\co\\jp\\part2\\userpass.txt"), "UTF-8"));
			String line;
			userlist=new HashMap<String, String>();
			while ((line = br.readLine()) != null) {
				String s[] = line.split(",");
				userlist.put(s[0], s[1]);
			}
			br.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("管理員IDを入力してください：");
		Scanner sc = new Scanner(System.in);
		user = sc.next();
		System.out.println("管理員pwdを入力してください：");
		pwd = sc.next();
		// adminの場合 そのままtrue
		// そうではない場合に ファイルからチェック
		if (super_pwd.equals(pwd) && super_user.equals(user)) {

			return true;
		} else {
			return datacheck(user, pwd);
		}

	}

	/**
	 * ファイルからIDとパスワードチェック
	 * 
	 * @param user
	 * @param pwd
	 * @return
	 */
	private static boolean datacheck(String user, String pwd) {

		
		for (Map.Entry<String, String> entry : userlist.entrySet()) {
			if (entry.getKey().equals(user) && entry.getValue().equals(pwd)) {
				return true;
			}
		}
		System.out.println("IDまたはpwdエラー、前画面に戻ります！");
		return false;
	}

}
