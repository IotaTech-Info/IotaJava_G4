package co.jp.part3_final;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Presentation {
	static Room[][] hotelRooms = new Room[][] {
		{new Room(ROOM_TYPE.BASIC, 101), new Room(ROOM_TYPE.BASIC, 102), new Room(ROOM_TYPE.BASIC, 103), new Room(ROOM_TYPE.BASIC, 104), new Room(ROOM_TYPE.BASIC, 105)},
		{new Room(ROOM_TYPE.STANDARD, 201), new Room(ROOM_TYPE.STANDARD, 202), new Room(ROOM_TYPE.STANDARD, 203), new Room(ROOM_TYPE.STANDARD, 204), new Room(ROOM_TYPE.STANDARD, 205)},
		{new Room(ROOM_TYPE.SUPERIOR, 301), new Room(ROOM_TYPE.SUPERIOR, 302), new Room(ROOM_TYPE.SUPERIOR, 303), new Room(ROOM_TYPE.SUPERIOR, 304), new Room(ROOM_TYPE.SUPERIOR, 305)}
	};
	static DateManager dateManager;
	static Logger logger;
	static Map<Integer, Room> roomMap = new HashMap<Integer, Room>();
	static {
		for (int i = 0; i < hotelRooms.length; i++) {
			for (int j = 0; j < hotelRooms[i].length; j++) {
				roomMap.put(hotelRooms[i][j].getRoomID(), hotelRooms[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		dateManager = new DateManager();
		logger = new Logger();
		System.out.println("欢迎使用Pet Hotel系统");
		Scanner sc = new Scanner(System.in);

		for (;;) {
			printDate();
			System.out.println ("请选择要执行的任务:");
			System.out.println ("1:办理入住 2:办理退房 3:执行下一天 0:结束程序");
			System.out.print ("请输入操作:");
			String input = sc.nextLine();
			boolean exit = false;
			switch (input) {
				case "0" :
					exit = true;
					break;
				case "1" :
					checkIn(sc);
					break;
				case "2" :
					checkOut(sc);
					break;
				case "3" :
					nextDay();
					break;
				default:
					System.out.println("未知指令,请重新输入");
			}
			if (exit) {
				logger.exit();
				break;
			}

		}
		
		System.out.println("----- 程序结束 -----");
	}
	
	/*
	 * 执行入住操作
	 */
	private static void checkIn(Scanner sc) {
		System.out.println("");
		System.out.println("正在执行入住任务");
		printInfo();
		System.out.println("基础套房:每晚2000円,标准套房:每晚5000円,高级套房:每晚10000円");
		Room room;
		String input;
		for (;;) {
			System.out.print("请输入您希望入住的房间号:");
			input = sc.nextLine();
			if (input.equals("cancel")) {
				return;
			}
			room = roomMap.get(Integer.valueOf(input));
			if (room == null) {
				System.out.println("未找到您想要的这间房间，请重新输入");
			} else if(room.getState() != 0){
				System.out.println("很抱歉，您选择的"+room.getRoomID()+"正处于"+room.getStateExplain()+",请重新输入");
			} else {
				break;
			}
		}
		String name;
		for (;;) {
			System.out.print("请输入宠物的名字:");
			input = sc.nextLine();
			if (input.equals("cancel")) {
				return;
			}
			if (input.length() < 1) {
				System.out.println("宠物不能没有名字，请重新输入");
			} else {
				name = input;
				break;
			}
		}
		String type;
		for (;;) {
			System.out.println("酒店支持宠物种类 1:狗 2:猫 3:鸟");
			System.out.print("请输入宠物种类的的编号:");
			input = sc.nextLine();
			if (input.equals("cancel")) {
				return;
			}
			if (input.equals("1") || input.equals("2") || input.equals("3")) {
				type = input;
				break;
			} else {
				System.out.println("未知宠物种类，只支持以下宠物种类");
			}
		}
		Pet pet = null;
		switch (type) {
			case "1" :
				pet = new Dog(name);
				break;
			case "2" :
				pet = new Cat(name);
				break;
			case "3" :
				pet = new Bird(name);
				break;
		}
		boolean active = false;
		System.out.print("是否要开起代遛服务呢(每天500円)?(Y/n):");
		input = sc.nextLine();
		if (input.equals("cancel")) {
			return;
		}
		if (input.toUpperCase().equals("Y")) {
			active = true;
		}
		System.out.print("确认要让"+ pet.getName() + "入住" + room.getRoomID() + "号房间吗?(Y/n)");
		input = sc.nextLine();
		if (!input.toUpperCase().equals("Y")) {
			checkIn(sc);  // 递归
			return;
		} else {
			room.setPet(pet);
			room.setActive(active);
			System.out.println( pet.getName() + "已入住" + room.getRoomID() + "号房间");
			logger.checkIn(room);
			printInfo();
		}
		
	}
	
	/*
	 * 执行退房操作
	 */
	private static void checkOut(Scanner sc) {
		System.out.println("");
		System.out.println("正在执行退房任务");
		printInfo();
		Room room;
		String input;
		for (;;) {
			System.out.print("请输入您希望退房的房间号:");
			input = sc.nextLine();
			if (input.equals("cancel")) {
				return;
			}
			room = roomMap.get(Integer.valueOf(input));
			if (room == null) {
				System.out.println("未找到您想要的这间房间，请重新输入");
			} else if(room.getState() != 1){
				System.out.println("很抱歉，您选择的"+room.getRoomID()+"似乎没有住客,请重新输入");
			} else {
				break;
			}
		}
		for (;;) {
			System.out.print("为了保证您是宠物的主人,请输入宠物的名字:");
			input = sc.nextLine();
			if (input.equals("cancel")) {
				return;
			}
			if (!input.equals(room.getPet().getName())) {
				System.out.println("名字错误，请重新输入");
			} else {
				break;
			}
		}
		System.out.print("确认要让"+ room.getPet().getName() + "退房" + room.getRoomID() + "号房间吗?(Y/n)");
		input = sc.nextLine();
		if (!input.toUpperCase().equals("Y")) {
			checkOut(sc); // 递归
			return;
		} else {
			System.out.println( room.getPet().getName() + "已退房" + room.getRoomID() + "号房间，您需缴费"+room.getPrice()+"円");
			logger.checkOut(room);
			room.setPet(null);
			printInfo();
		}
	}
	
	private static void nextDay() {
		dateManager.nextDay();
		logger.nextDay();
		for (int i = hotelRooms.length - 1; i>=0; i--) {
			for (int j = 0; j < hotelRooms[i].length; j++) {
				Room room = hotelRooms[i][j];
				room.doDailyTask();
			}
		}
	}
	
	/*
	 * 打印所有房间，以及房间所属状态
	 */
	private static void printInfo() {
		System.out.println("-----房间信息-----");
		for (int i = hotelRooms.length - 1; i>=0; i--) {
			for (int j = 0; j < hotelRooms[i].length; j++) {
				Room room = hotelRooms[i][j];
				System.out.print(room.getRoomType().getName() + room.getRoomID() + "(" + room.getStateExplain() + ") ");
			}
			System.out.println();
		}
		System.out.println("----------------");
	}
	
	/*
	 * 根据房间的ID来匹配Room
	 */
	@Deprecated
	private static Room matchRoom(String roomID) {
		for (int i = 0; i < hotelRooms.length; i++) {
			for (int j = 0; j < hotelRooms[i].length; j++) {
				Room room = hotelRooms[i][j];
				if (room.marchRoomID(roomID)) {
					return room;
				}
			}
		}
		return null;
	}
	
	private static void printDate() {
		System.out.println(String.format("-----现在是: %s-----",dateManager.getDate()));
	}

}
