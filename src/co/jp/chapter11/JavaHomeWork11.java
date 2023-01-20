package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork11 {
	public static void main(String[] args) {
		Line line = new Line();
		List<String> yamanote = line.getList();
		yamanote.add("shinjyuku");
		yamanote.add("shinbashi");
		yamanote.add("ikebukuro");
		yamanote.add("akihabara");
		yamanote.add("kannda");

		for (String Station : yamanote) {
			if (Station == "shinbashi") {
				System.out.println("shinbashi は路線内である");
			}

		}

		Station carriage = new Station();
		Integer[][] isu = carriage.getCarriage();

		List<String> hito = new ArrayList();

		int count = 0;
		int kyaku = 31;

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 5; j++) {
				hito.add("乗る人");
				count++;
				if (count == kyaku) {
					System.out.println(hito);
					break;
				}

			}
		}

	}
}
