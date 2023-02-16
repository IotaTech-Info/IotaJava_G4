package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaHomeWork14 {


	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Calendar start_date = new GregorianCalendar();
			Calendar end_date = new GregorianCalendar();
			Date start = sdf.parse("2023-2-11");
			Date end = sdf.parse("2023-2-15");
//			Calendar c = Calendar.getInstance();
			start_date.setTime(start);
			end_date.setTime(end);
			int month = start_date.get(Calendar.MONTH)+1;
			
			for( ; (start_date.compareTo(end_date)) <= 0; ) {
				System.out.println(start_date.get(Calendar.YEAR) +"-"+ month +"-"+ start_date.get(Calendar.DATE) + "\n");
				start_date.add(Calendar.DAY_OF_YEAR, 1);
			}
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
//			Logger.getLogger(FileStreamSample.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		}
		

		



	}
//	public static int eachEveryday(Date start,Date end){
//		
//	}

}
