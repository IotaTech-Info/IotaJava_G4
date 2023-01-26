package co.jp.chapter13;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class JavaHomeWork13 {

	
	
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//質問1:ログ分析アプリ作成してください。
		//知らないからごめんなさい	
		
		
		//質問2:CSV編集ツールを作成してください。
//		editCSV("\\in.csv", "\\out.csv", 3, 5,"\"777\"");
		
		//日付 質問1
		eachEveryDay("2018-08-14","2018-08-23");
		//質問2:勤務表の集計。
		//知らないからごめんなさい	

		

	}

	public static void eachEveryDay(String d1, String d2) throws ParseException {
		SimpleDateFormat GS = new SimpleDateFormat("yyyy-MM-dd");
      
  		Date StartDate = GS.parse(d1);
  		Date Update = GS.parse(d2);
  		Date LS=StartDate;
  		Calendar Date =Calendar.getInstance();
  		Date.setTime(StartDate);    
  		while(LS.getTime()<Update.getTime()) {     
   			LS=Date.getTime();     
   			System.out.println(GS.format(LS));     
   			Date.add(Calendar.DAY_OF_MONTH, 1);
  		}
	}

	
	public static void editCSV(String inFile, String outFile, int rowNum, int colNum, String target) {
		String inString = "";
		List<String[]> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(inFile)));
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outFile)));
			while ((inString = reader.readLine()) != null) {
				list.add(inString.split(","));
			}
			reader.close();
			for (int i = 0; i < list.size(); i++) {
				if (i > rowNum) {
					list.get(i)[colNum] = target;
				}
			}
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < list.get(i).length; j++) {
					writer.write(list.get(i)[j].toString() + ",");
					if (j == list.get(i).length - 1) {
						writer.newLine();
					}
				}
			}
			writer.close();
		} catch (FileNotFoundException ex) {
			System.out.println("no such files");
		} catch (IOException ex) {
			System.out.println("errors");
		}
	}
}
