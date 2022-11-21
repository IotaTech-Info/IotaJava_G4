package co.jp.part2;

import java.util.Scanner;

import co.jp.part2.Employee.Skill;
import co.jp.part2.Pet.Type;

public class Presentation {

	public static Manager manager=new Manager();
	public static Client client;
	
	public static void main(String[] args) {

		//初期化
		Client c1=manager.Add("TAI","1388888888");
		Client c2=manager.Add("HUANG","12588888");
		Client c3=manager.Add("JUJU","1444588888");
		c1.pets[0]=manager.Add(c1.name,"MOMO",12,Type.BIRD,false);
		c2.pets[0]=manager.Add(c2.name,"COCO",1,Type.DOG,true);
		c3.pets[0]=manager.Add(c3.name,"KK",3,Type.CAT,true);
		c3.pets[1]=manager.Add(c3.name,"BB",3,Type.DOG,true);
	
		
		Employee e1=manager.Add("Tony", 200,3,Skill.BASE);//基础
		Employee e2=manager.Add("Kelly", 500,2,Skill.BEAUTY);//美容师
		Employee e3=manager.Add("Dr.Sam", 800,2,Skill.DOCTOR);//医生
		Employee e4=manager.Add("Bob", 1200,1,Skill.DOG_COACH);//训狗师
	
		Scanner sc1 = new Scanner(System.in);
		
		//実行開始
		System.out.println("----- 実行開始 -----");

		System.out.println("-----こんにちは！-----");
		// 身分確認
		//1-ユーザー　//2-ホテルスタッフ
		System.out.println("▶　訪問者別INDEX");
		System.out.println("1-お客様へ");
		System.out.println("2-ホテルスタッフへ");
		System.out.println("-----それ以外の任意のキーで終了-----");
		System.out.print("▶　");
		String input = sc1.next();

		if ("1".equals(input)) {
			UserLoop();//ユーザー
		}
		else if("2".equals(input))
		{
			EmployeeLoop();//ホテルスタッフ
		}
		else {
			System.out.println("----- 実行終了 -----");
			return;
		}
		
	}
	
	 public static void UserLoop() {
		 
		
		 System.out.println("-----いらっしゃいませ！お客様！-----");
		for (;;) {
			
			// 身分確認
			//1-ユーザー　//2-ホテルスタッフ
			System.out.println("お客様番号お持ちしますか？");
			System.out.println("1-はい。");
			System.out.println("2-いいえ。今から登録します。");
			System.out.println("-----それ以外の任意のキーで終了-----");
			System.out.print("▶　");
			Scanner sc2 = new Scanner(System.in);
			String input = sc2.next();
			
			//お客様番号あり　番号検索
			if ("1".equals(input)) {
				Boolean check=false;
				
				//check
				while(!check)
				{
					
					System.out.println("お客様番号(4桁 1000~)を入力してください:");
					System.out.print("▶　");
					input = sc2.next();
					check=isNumeric(input)&&Integer.parseInt(input)>0&&Integer.parseInt(input)-1000<manager.clientList.size();
					if(check)
					{
						 client=manager.SearchClient(Integer.parseInt(input));
					}
					else
					{
						System.out.println("エラーです。もう一度入力してください。");
					}
				}	
	
			}
			//お客様番号なし　新しいアカウント作る
			else if("2".equals(input))
			{
				System.out.println("新しいアカウントを作成してください。入力例：名前,電話番号");
				System.out.print("▶　");
				input = sc2.next();
				String[] input_array = input.split(",");
				if (input_array.length !=2) {
					System.out.println("INPUT形式不正のため、異常終了");
					break;
				}
				else
				{
					Client client=manager.Add(input_array[0],input_array[1]);
					System.out.println("＜お帰りなさい！"+input_array[0]+"　様！＞");
				}

			}
			else {
				System.out.println("----- 実行終了 -----");
				return;
			}
			while(true)
			{
				//メニュー
				System.out.println("◆メニュー◆");
				System.out.println("1-ペッド登録");
				System.out.println("2-予約／キャンセル");
				System.out.println("3-チェックイン／チャックアウト");
				System.out.println("4-餌をあげる");
		
				System.out.print("▶　");
				input = sc2.next();
			
				switch(input)
				{
					case "1":
						manager.ViewMyPet(client);
						break;
					case "2":
						Book();
						break;
					case "3":
						CheckInOut();
						break;
					case "4":
						System.out.println("ペッドを選んでください。");
						manager.ViewMyPet(client);
						System.out.print("▶　");
						input = sc2.next();
						int num=Integer.parseInt(input);
						Feed(client.pets[num]);
						break;
					default:
						return;
				}
			}
		}
		System.out.println("----- 実行終了 -----");
	}
	 
	 
	public static void EmployeeLoop() {
		manager.ViewList("Employee");
		manager.ViewList("Pet");
		manager.ViewList("Client");
		System.out.println("----- 実行終了 -----");
		
		
		
	}
	public static void CheckInOut()
	{
		System.out.println("----- チェックイン／チャックアウト　成功-----");
		System.out.println("----- 実行終了 -----");
		
		
	}
	public static void Book()
	{
		System.out.println("----- 予約／キャンセル　成功-----");
		System.out.println("----- 実行終了 -----");
		
	}
	public static void Feed(Pet pet)
	{
		pet.eat();
		System.out.println("----- 餌をあげる　成功-----");
		System.out.println("----- 実行終了 -----");
		
		
	}
	
	public static boolean isNumeric(String str){
	    for(int i=str.length();--i>=0;){
	        int chr=str.charAt(i);
	        if(chr<48 || chr>57)
	            return false;
	    }
	   return true;
	}

}