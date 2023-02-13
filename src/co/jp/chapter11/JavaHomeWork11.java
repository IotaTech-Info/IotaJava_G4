package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JavaHomeWork11 {

	static int num;

	public static void main(String[] args) {

		Line yamanote = new Line("yamanote");
		
		Station sta = new Station();
		
		List<String> yamanote_eki = new ArrayList<String>();
		yamanote_eki.add("東京駅");
		yamanote_eki.add("神田駅");
		yamanote_eki.add("秋葉原駅");
		yamanote_eki.add("御徒町駅");
		yamanote_eki.add("上野駅");
		yamanote_eki.add("鶯谷駅");
		yamanote_eki.add("日暮里駅");
		yamanote_eki.add("西日暮里駅");
		yamanote_eki.add("田端駅");
		yamanote_eki.add("駒込駅");
		yamanote_eki.add("巣鴨駅");
		yamanote_eki.add("大塚駅");
		yamanote_eki.add("池袋駅");
		yamanote_eki.add("目白駅");
		yamanote_eki.add("高田馬場駅");
		yamanote_eki.add("新大久保駅");
		yamanote_eki.add("新宿駅");
		yamanote_eki.add("代々木駅");
		yamanote_eki.add("原宿駅");
		yamanote_eki.add("渋谷駅");
		yamanote_eki.add("恵比寿駅");
		yamanote_eki.add("目黒駅");
		yamanote_eki.add("五反田駅");
		yamanote_eki.add("大崎駅");
		yamanote_eki.add("品川駅");
		yamanote_eki.add("高輪ゲートウェイ駅");
		yamanote_eki.add("田町駅");
		yamanote_eki.add("浜松町駅");
		yamanote_eki.add("新橋駅");
		yamanote_eki.add("有楽町駅");
		
		
		List<Station> yamanote_station = new ArrayList<Station>();
		for(String s : yamanote_eki) {
			sta = new Station();
			sta.setName(s);
			yamanote_station.add(sta);
		}
		
		yamanote.setStation(yamanote_station);
		
		for(Station s : yamanote.getStation()) {
			if(s.getName().equals("新橋駅")){
				System.out.println("新橋駅は山手線の駅である。");
			}
		}
		
		//質問3
		Map<String, String> train = new HashMap<>();
		int all = 31;
		int each = 5;
		for(int i = 1; i <= 10; i++) {
			if(all > each) {
				train.put(i+"号車", each+"人");
				all -= each;
//				System.out.println(all);
			}else {
				train.put(i+"号車", all+"人");
				all-=all;
			}
		}
		
		Iterator<Map.Entry<String, String>> it = train.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) it
					.next();
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}

	}

}
