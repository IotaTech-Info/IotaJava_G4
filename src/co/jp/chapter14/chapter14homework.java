package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class chapter14homework {
	
	public static void main(String[] args) {
		
		String startDate = "2023-01-01";
		String endDate = "2023-01-28";
		
		List<String> Calendar = new ArrayList<String>();
		Calendar = eachEveryday(startDate,endDate);
		
		System.out.println("Calendar element: "+Calendar.toString());
		
	}
	
	public static List<String> eachEveryday(String startDate,String endDate){
		
		Date start = null;
		Date end = null;
		
		try {
			start = new SimpleDateFormat("yyyy-mm-dd").parse(startDate);
			end = new SimpleDateFormat("yyyy-mm-dd").parse(endDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		List<String> result = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	
		Date date = start;
		Calendar c = Calendar.getInstance();	
		
		while(date.getTime() <= end.getTime()) {
			result.add(sdf.format(date));
			c.setTime(date);
			c.add(Calendar.DATE, 1);
			date = c.getTime();
		}
		
		return result;
		
		
	}

}
