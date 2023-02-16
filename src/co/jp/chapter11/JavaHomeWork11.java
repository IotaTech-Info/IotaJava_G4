package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaHomeWork11 {


	public static void main(String[] args) {
		
		// 質問０１
		Line yamanote = new Line("山手線");
		Station sta = new Station();
		List<String> station_name = new ArrayList<String>();
		station_name.add("渋谷");
		station_name.add("原宿");
		station_name.add("代々木");
		station_name.add("新宿");
		station_name.add("新大久保");
		station_name.add("高田馬場");
		station_name.add("目白");
		station_name.add("池袋");
		station_name.add("秋葉原");
		station_name.add("神田");
		station_name.add("東京");
		station_name.add("有楽町");
		station_name.add("新橋");
		System.out.println(station_name);
		
		List<Station> yamanote_sta_name = new ArrayList<Station>();
		for(String a : station_name) {
			sta = new Station();
			sta.setName(a);
			yamanote_sta_name.add(sta);
		}
		yamanote.setStation(yamanote_sta_name);
		for(Station a : yamanote.getStation()) {
			if(a.getName().equals("新橋")){
				System.out.println("新橋駅は路線内である。");
			}
		}
		
		Map<String, String> train = new HashMap<>();
		int ppl = 31;
		int each_train = 5;
		for(int i = 1; i <= 10; i++) {
			if (ppl >= each_train) {
				train.put(i + "号車", each_train + "人");
				ppl -= each_train;
			} else {
				train.put(i + "号車", ppl + "人");
				ppl -= ppl;
			}
		}
		for (Map.Entry<String, String> entry : train.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
