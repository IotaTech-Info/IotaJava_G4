package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaHomeWork11 {
	public static void main(String[] args) {
		//質問１、２
		Line yamanote=new Line("山手線");
		Station st=new Station();
		List<String> station_name=new ArrayList<String>();
		station_name.add("池袋");
		station_name.add("駒込");
		station_name.add("上野");
		station_name.add("秋葉原");
		station_name.add("東京");
		station_name.add("新橋駅");
		station_name.add("品川");
		station_name.add("目黒");
		station_name.add("渋谷");
		station_name.add("新宿");
		station_name.add("高田馬場");
		List<Station> yamanote_station=new ArrayList<Station>();
		for(String s:station_name) {
			st=new Station();
			st.setName(s);
			yamanote_station.add(st);
		}
		
		yamanote.setStation(yamanote_station);
		
		boolean isyamanote=false;
		for(Station s:yamanote.getStation() ) {
			System.out.println(s.getName());
			if(s.getName().equals("新橋駅")) {
				isyamanote=true;
				break;
			}
		}
		System.out.println("新橋駅は山手線の駅？"+isyamanote);
		
		//質問３
		
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
