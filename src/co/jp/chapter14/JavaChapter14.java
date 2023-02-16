package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaChapter14 {

	public static void main(String[] args) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = simpleDateFormat.format(new Date());
		System.out.println("Date => String:" + dateString);
		
		String date_yyyymmdd_1 = "2023-01-19"; 
		try {
			Date date_str = simpleDateFormat.parse(date_yyyymmdd_1);
			System.out.println("String => date:" + date_str);
			
			Calendar c = Calendar.getInstance();
			c.setTime(date_str);
			
			c.add(Calendar.YEAR, -1);
			c.add(Calendar.MONTH, 1);
			c.add(Calendar.DATE, 10);
			
			Date currentDatePlusOne = c.getTime();
			System.out.println(currentDatePlusOne);
			
			String currentDatePlusOne_str = simpleDateFormat.format(currentDatePlusOne);
			System.out.println(currentDatePlusOne_str);
			
			
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
	}
}
