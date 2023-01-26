package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaHomeWork11 {
	/*
	 * //質問１︓駅クラス（Station）、路線クラス（Line）を作成して。 //路線をインスタンス化し てオブジェクト「⼭⼿線」を作成してください。
	 * //「⼭⼿線」に各駅情報を追加してくださ い。 質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内である かを判断する。
	 * 質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログ ラミングしてください。（for⽂で旅客作成しても構わない）
	 */

	public static void main(String[] args) {
		Line yamanote = new Line("山手線");
		Station sn = new Station();
		List<String> station_name = new ArrayList<String>();
		station_name.add("大崎");
		station_name.add("五反田");
		station_name.add("目黒");
		station_name.add("恵比寿");
		station_name.add("渋谷");
		station_name.add("原宿");
		station_name.add("代々木");
		station_name.add("新宿");
		station_name.add("新大久保");
		station_name.add("高田馬場");
		station_name.add("目白");
		station_name.add("池袋");
		station_name.add("大塚");
		station_name.add("巣鴨");
		station_name.add("駒込");
		station_name.add("田端");
		station_name.add("西日暮里");
		station_name.add("日暮里");
		station_name.add("鶯谷");
		station_name.add("上野");
		station_name.add("御徒町");
		station_name.add("秋葉原");
		station_name.add("神田");
		station_name.add("東京");
		station_name.add("有楽町");
		station_name.add("新橋");
		station_name.add("浜松町");
		station_name.add("田町");
		station_name.add("高輪ゲートウェイ");
		station_name.add("品川");
		
		List<Station> yamanote_station = new ArrayList<Station>();

		for (String a : station_name) {
			sn = new Station();
			sn.setName(a);
			yamanote_station.add(sn);
		}

		yamanote.setStation(yamanote_station);

		for (Station a : yamanote.getStation()) {
			System.out.println(a.getName());
			if (a.getName().equals("新橋")) {
				System.out.println("新橋は山手にある。");
			}
		}
		
		Map<String, String> train = new HashMap<>();
		int countmer =32;
		int countmerEach=5;
		for(int i=1;i<=10;i++) {
			if(countmer>=countmerEach) {
				train.put(i+"号車",countmerEach+"人");
				countmer-=countmerEach;
			}else {
				
				train.put(i+"号車",countmer+"人");
				countmer-=countmer;
			}
			
		}
		for (Map.Entry<String, String> entry : train.entrySet()) {
			 System.out.println(entry.getKey() + ":" + entry.getValue());
			 }
	}
	

}