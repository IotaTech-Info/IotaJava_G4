package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chapter14Homework {

	
	//質問１︓以下共通メソッドを作成してください。
	
	public static void eachEveryDay() {
		
	String d1 = "2020-01-01";
	String d2 = "2023-02-02";
	
	
	try {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date date1 = simpleDateFormat.parse(d1);
		 System.out.println(date1);
		} catch (ParseException ex) {
		 System.out.println("error");
		}
	try {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date date2 = simpleDateFormat.parse(d2);
		 System.out.println(date2);
		} catch (ParseException ex) {
		 System.out.println("error");
		}
	
	try {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date eacheveryday = simpleDateFormat.parse("0000-00-00");
		 System.out.println(eacheveryday);
		} catch (ParseException ex) {
		 System.out.println("error");
		}
		
	
//eacheveryday.add(Calendar.Year, date1.Year - date2.Year);
//eacheveryday.add(Calendar.Month, date1.Month - date2.Month);
//eacheveryday.add(Calendar.Day, date1.Day - date2.Day);


		}
	
	
	
	//質問２︓勤務表の集計。以下CSVファイルは「2019年06⽉度」の勤務期間です。集計してください。
	


	}


