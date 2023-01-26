package co.jp.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HotelSort {
	public static void Sort(Hotel[] hotel) {
		ArrayList<Hotel> Sort = new ArrayList<>();

		for (int i = 0; i < hotel.length; i++) {
			if (hotel[i].status.equals("空")) {
				Sort.add(new Hotel("", 0, "", "空", ""));

			} else if (hotel[i].status.equals("予約")) {
				Sort.add(new Hotel("", 0, "", "予約", ""));
			} else {
				Sort.add(new Hotel(hotel[i].name, hotel[i].age, hotel[i].type, hotel[i].status, hotel[i].data));
			}

		}

		// System.out.println(Sort);
		// Sort.sort((a, b) -> b.age - a.age);

		Collections.sort(Sort, new Comparator<Hotel>() {

			@Override

			public int compare(Hotel o1, Hotel o2) {
				// TODO 自動生成されたメソッド・スタブ
				if ((o1.status.equals("在住")) && o2.status.equals("在住")) {
					return o2.age - o1.age;
				}
				return 0;

			}

		});

		// Object[] Sortkey = Sort.keySet().toArray();
		// Arrays.sort(Sortkey);
		for (int i = 0; i < Sort.size(); i++) {
			hotel[i] = Sort.get(i);
		}
		// System.out.println(Sort);
	}
}
