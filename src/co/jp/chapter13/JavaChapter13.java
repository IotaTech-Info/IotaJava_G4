package co.jp.chapter13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaChapter13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		input
		File dummy_file = new File("folder/dummy.txt");
		try {
			FileInputStream in = new  FileInputStream(dummy_file);//生成InputStream读取文件 
//			byte[] data = new byte[20];
//			in.read(data);
//			System.out.println(data.toString());
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");//"UTF-8"
			BufferedReader br = new BufferedReader(isr);//读出内容
			
			for(;;){
				String str = br.readLine();//只读取一次
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			br.close();
			isr.close();
			in.close();//读完文件关闭
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
