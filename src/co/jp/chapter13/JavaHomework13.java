package co.jp.chapter13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaHomework13 {
//	ログ分析
	private static Logger log = Logger.getLogger(JavaHomework13.class.toString());
	
	public static void main(String[] args) {
		log.setLevel(Level.INFO);
		log.config("config");
	}
	
//	CSV編集
	public static File CSVFile(List<Object>head,List<List<Object>> dataList,String outPutPath,String filename) {
		
		File csvFile = null;
		BufferedWriter csvWriter = null;
		
		try {
			csvFile = new File(outPutPath + File.separator + filename + ".csv");
			File parent = csvFile.getParentFile();
			if (parent != null && !parent.exists()) {
				parent.mkdirs();
				
			}
			csvFile.createNewFile();
			
			csvWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile),"ZYR"),1024);
			
			writeRow(head,csvWriter);
			
			for(List<Object> row : dataList) {
				writeRow(row,csvWriter);
			}
			csvWriter.flush();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				csvWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return csvFile;
	}
	
	
	private static void writeRow(List<Object> row,BufferedWriter csvWriter)throws IOException{
	
	for(Object data : row) {
		StringBuffer user = new StringBuffer();
		String rowStr = user.append(",").append(",").toString();
	}
	csvWriter.newLine();
	}
}
