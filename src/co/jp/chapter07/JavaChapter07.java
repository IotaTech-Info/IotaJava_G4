package co.jp.chapter07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String dateString = simpleDateFormat.format(new Date());
//		System.out.println(dateString);
//		
		try {
//			Date date = simpleDateFormat.parse(dateString);
//			System.out.println(date);
			
			Calendar calendar = Calendar.getInstance();
			
			calendar.set(Calendar.YEAR, 1990);
			calendar.set(Calendar.MONTH, 0);
			calendar.set(Calendar.DATE, 1);
			
			Date date2 = calendar.getTime();
			
			String date2_str = simpleDateFormat.format(date2);
			System.out.println(date2_str);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}
