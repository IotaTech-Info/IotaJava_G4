package co.jp.part3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormt {
	public static String SimpleData() {
		SimpleDateFormat simpleDateFormt = new SimpleDateFormat("yyyy/MM/DD hh:mm:ss");
		String dateString = simpleDateFormt.format(new Date());
		return dateString;

	}
}
