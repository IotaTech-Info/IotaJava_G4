package co.jp.chapter14;

public class JavaHomeWork14 {

	/*
	package co.jp.chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class JavaChapter14 {

	// 質問１
	// eachEveryDayメソッドを作成
	public static void eachEveryDay(String start, String end) {
		// 日付フォーマットを設定
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 開始日と終了日をDate型に変換
			Date startDate = sdf.parse(start);
			Date endDate = sdf.parse(end);

			// 開始日から終了日まで、1日ずつ増加させる

			// 日付⇒ カレンダーオブジェクト
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(startDate);
			while (calendar.getTime().before(endDate)) {
				System.out.println(sdf.format(calendar.getTime()));
				calendar.add(Calendar.DATE, 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String... args) {
		eachEveryDay("2023-1-1", "2023-1-5");

		// 質問２
		// CSVファイルのパス
		String csvFile = "D:\\iotaworkspace_g4\\IotaJava_G4\\src\\co\\jp\\chapter14\\homework.csv";

		// 今月の総作業時間初期化
		Duration totalWorkTime = Duration.ZERO;
		// 今月の総残業時間初期化
		Duration totalOverTime = Duration.ZERO;

		// CSVファイルを読み込む
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			// ヘッダーを読み飛ばす
			String line = br.readLine();
			// 1行ずつ読み込む
			while ((line = br.readLine()) != null) {
				// カンマで分割
				String[] data = line.split(",");
				// 開始時刻と終了時刻が空欄でない場合
				if (data.length >= 3&&!data[1].isEmpty() && !data[2].isEmpty()&&!data[0].equals("日付")) {
					
					//1:00➡01:00 フォーマットをチェック
					for (int i = 1; i <= 3; i++) {
						if (data[i].length() == 4) {
						data[i] = "0" + data[i];
						}
					}
					// 開始時刻と終了時刻をLocalTime型に変換
				
					LocalTime startTime = LocalTime.parse(data[1]);
					LocalTime endTime = LocalTime.parse(data[2]);

					// 作業時間を計算
					Duration workTime = Duration.between(startTime, endTime);
		
					// 今月の総作業時間に加算
					totalWorkTime = totalWorkTime.plus(workTime);
					// 1.毎日の作業時間を出力
					System.out.println(data[0]+"日の作業時間:" + workTime.toHours() + "時間" + workTime.toMinutes() % 60 + "分");

					// 残業時間を計算
					LocalTime overTimeStart = LocalTime.parse("19:00");
					if (endTime.isAfter(overTimeStart)) {
						Duration overTime = Duration.between(overTimeStart, endTime);
						// 3.毎日の残業時間を出力
						System.out.println(data[0]+"日の残業時間:" + overTime.toHours() + "時間" + overTime.toMinutes() % 60 + "分");
						// 今月の総残業時間に加算
						totalOverTime = totalOverTime.plus(overTime);

					}
				}
			}
			// 2.今月の総作業時間
			System.out.println("今月の総作業時間:" + totalWorkTime.toHours() + "時間" + totalWorkTime.toMinutes() % 60 + "分");
			// 3.19:00以後 今月の総残業時間を出力
			System.out.println("今月の総残業時間: " + totalOverTime.toHours() + "時間" + totalOverTime.toMinutes() % 60 + "分");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

*/
	
	//実行結果：
	/*
2023-01-01
2023-01-02
2023-01-03
2023-01-04
3日の作業時間:10時間15分
3日の残業時間:1時間15分
4日の作業時間:10時間0分
4日の残業時間:1時間0分
5日の作業時間:10時間15分
5日の残業時間:1時間15分
6日の作業時間:10時間0分
6日の残業時間:1時間0分
7日の作業時間:9時間30分
7日の残業時間:0時間30分
10日の作業時間:11時間30分
10日の残業時間:2時間30分
11日の作業時間:11時間0分
11日の残業時間:2時間0分
12日の作業時間:11時間30分
12日の残業時間:2時間30分
13日の作業時間:10時間0分
13日の残業時間:1時間0分
17日の作業時間:10時間0分
17日の残業時間:1時間0分
18日の作業時間:10時間0分
18日の残業時間:1時間0分
20日の作業時間:10時間30分
20日の残業時間:1時間30分
21日の作業時間:11時間0分
21日の残業時間:1時間0分
24日の作業時間:11時間30分
24日の残業時間:2時間30分
25日の作業時間:10時間30分
25日の残業時間:1時間30分
26日の作業時間:11時間0分
26日の残業時間:2時間0分
27日の作業時間:10時間30分
27日の残業時間:1時間30分
28日の作業時間:9時間15分
28日の残業時間:0時間15分
今月の総作業時間:188時間15分
今月の総残業時間: 25時間15分

	 */
}
