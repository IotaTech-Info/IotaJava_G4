package co.jp.part3_final;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Logger {
	private DateManager dateManager;
	
	public Logger() {
		dateManager = Presentation.dateManager;
	}
	private void write(String s) {
		try {
			 Writer out = new FileWriter(new File("src\\co\\jp\\part3_final\\log.txt"),true);
			 out.write(s);
			 out.write("\n");
			 out.close();
		} catch (IOException e) {
			 e.printStackTrace();
		}

	}
	
	private void log(String s) {
		write("["+dateManager.getDate()+"] " + s);
	}
	
	public void checkIn(Room room) {
		Pet pet = room.getPet();
		log("宠物"+pet.getName()+"入住了"+room.getRoomType().getName()+room.getRoomID()+",每日食用"+pet.getFood().getName()+","+(room.active ? "开启" : "不开启")+"代遛服务");
	}
	public void nextDay() {
		log("新的一天开始了");
	}
	public void checkOut(Room room) {
		Pet pet = room.getPet();
		log("宠物"+pet.getName()+"退房了"+room.getRoomType().getName()+room.getRoomID()+",共缴费"+room.getPrice()+"円");
	}
	public void exit() {
		log("程序结束");
	}
}
