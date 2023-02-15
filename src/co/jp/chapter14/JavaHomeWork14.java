package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaHomeWork14 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = time.parse("2023-01-21 20:00:10");
		Date d2 = time.parse("2023-01-27 16:00:10");
		System.out.println("相差天数为"+eachEveryDay(d1, d2));
		
	
		
	}

	public static int eachEveryDay(Date start, Date end) throws ParseException {
SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");
start = time.parse(time.format(start));
end = time.parse(time.format(end));
Calendar cal = Calendar.getInstance();
cal.setTime(start);
long time1 = cal.getTimeInMillis();
cal.setTime(end);
long time2 = cal.getTimeInMillis();
long between_days = (time2-time1)/(1000*3600*24);
return Integer.parseInt(String.valueOf(between_days));

	}
}
