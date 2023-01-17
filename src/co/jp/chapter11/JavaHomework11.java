package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaHomework11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１，２
		List<String> yamanoteLine_station = new ArrayList<String>();
		yamanoteLine_station.add("目黒駅");
		yamanoteLine_station.add("五反田駅");
		yamanoteLine_station.add("大崎駅");
		yamanoteLine_station.add("品川ゲートウェイ");
		yamanoteLine_station.add("品川駅");
		yamanoteLine_station.add("田町駅");
		yamanoteLine_station.add("浜松町");
		yamanoteLine_station.add("新橋駅");
		
		System.out.println(yamanoteLine_station);
		
		yamanoteLine_station.forEach(新橋駅 -> System.out.println("線路内です！"));
	//	質問３
		
		HashMap<String,String> little_line = new HashMap<String,String>();
		
		int carriage = 10;
		int fixed_number = 5;
		int passenger = sc.nextInt();
		
		System.out.println("please entry the number of passenger");
		
		for(int i = 0; i <= 10; i++) {
			if(passenger < carriage * fixed_number) {
				System.out.println(Math.floor(passenger/fixed_number)+"of 10 is full.");
				System.out.println("there are"+passenger % fixed_number+"seats left in the "+(Math.floor(passenger/fixed_number)+1)+"carriage.");
				System.out.println("there are"+(10-(Math.floor(passenger/fixed_number)+1))+"spare carriages left.");
			}
			else {
				System.out.println("the little_line was overloaded.");
			}
		}
		
				
	}

}
