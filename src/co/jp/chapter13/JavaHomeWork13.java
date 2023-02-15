package co.jp.chapter13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaHomeWork13 {
	// ログ
	public static void main(String[] args) throws IOException {
		Logger myLogger = Logger.getLogger("co.jp.chapter13");
		myLogger.setLevel(Level.INFO);
		myLogger.info("logTest1");
		myLogger.warning("logTest2");

		// CSV編集
		File writeFile = new File("/Users/takui/Desktop/workplace/IotaJava_G4/HomeWork13.csv");
		try {
			// 通过BufferReader类创建一个使用默认大小输出缓冲区的缓冲自负输出流
			BufferedWriter writeText = new BufferedWriter(new FileWriter(writeFile));

			// 换行
			writeText.newLine();
			// 调用write的方法，将字符串写到流中
			writeText.write("用户1" + ",18," + "男");

			// 使用缓冲区的刷新方法将数据刷到目的地中
			writeText.flush();
			// close()方法关闭的是被缓存的流对象
			writeText.close();

		} catch (FileNotFoundException e) {
			System.out.println("没有找到指定文件");
		} catch (IOException e) {
			System.out.println("文件读写出错");
		}

	}

}
