package co.jp.part3_final;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateManager {
	private final Calendar calendar;
	private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
	public DateManager() {
		calendar = Calendar.getInstance();
	}
	
	public String getDate() {
		return simpleDateFormat.format(calendar.getTime());
	}
	
	public void nextDay() {
		calendar.add(Calendar.DATE, 1);
	}
}
