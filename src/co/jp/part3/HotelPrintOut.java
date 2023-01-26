package co.jp.part3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class HotelPrintOut {
	public static void PrintOut(Hotel[] hotel) {
		try {
			// File file = new File("./HotelPrintOut/HotelStatus.txt");
			File file = new File("./bin/co/jp/part3/HotelStatus.txt");

			if (file.exists()) {
				Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
				for (int i = 0; i < hotel.length; i++) {
					if (hotel[i].status.equals("空")) {
						out.write((i + 1) + "号室：空き" + "\r\n");
						out.write("\r\n");
					} else if (hotel[i].status.equals("予約")) {
						out.write((i + 1) + "号室：予約済" + "\r\n");
						out.write("\r\n");
					} else {
						out.write((i + 1) + "号室：ペット情報" + "\r\n");
						out.write("ペットの名前は：" + hotel[i].name + "\r\n");
						out.write("ペットの年齢：" + hotel[i].age + "\r\n");
						out.write("ペットのタイプ：" + hotel[i].type + "\r\n");
						out.write("入住時間：" + hotel[i].data + "\r\n");
						out.write("\r\n");
					}

				}
				out.close();
				System.out.println("\r\n" + "部屋の情報をプリントアウトしました" + "\r\n");
			} else {
				file.createNewFile();
				System.out.println("ファイルを作成しました。");
			}
		} catch (IOException ex) {
			System.out.println("エラーが発生しました");
		}
	}
}
