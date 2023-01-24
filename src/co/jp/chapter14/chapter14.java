package co.jp.chapter14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class chapter14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String date_str = "2023-01-19";
		String date_target = "2030-12-31";
		String[] split_date = date_str.split("-");
		String[] split_target = date_target.split("-");
		int year_diff = Integer.parseInt(split_target[0]) - Integer.parseInt( split_date[0]) ;
		int month_diff = Integer.parseInt(split_target[1]) - Integer.parseInt( split_date[1]) ;
		int day_diff = Integer.parseInt(split_target[2]) - Integer.parseInt( split_date[2]) ;

		
		try {
			Date current = format.parse(date_str);
//			Date target = format.parse(date_target);
			Calendar c = Calendar.getInstance();
			c.setTime(current);
			
			c.add(Calendar.YEAR, year_diff);
			c.add(Calendar.MONTH, month_diff);
			c.add(Calendar.DATE, day_diff);
			
			Date target = c.getTime();
			System.out.println(target);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
