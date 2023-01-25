package co.jp.chapter13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WritedatatoCSV {

	public static boolean writeDataToCsv(String path, String data) {
		File file = new File(path);
		if (!file.exists()) {
			return false;
		}// 检查文件是否存在
	
	try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
		bufferedWriter.write(data);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	return true;
}

}
