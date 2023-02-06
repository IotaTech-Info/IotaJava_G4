package co.jp.part3;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hotel {
	public static ArrayList<Pet> pets = new ArrayList<>();// 动物入住信息
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> rooms = new ArrayList<Integer>();// 房间

	static {
		rooms.add(1);
		rooms.add(2);
		rooms.add(3);
		rooms.add(4);
		rooms.add(5);
		rooms.add(6);
		rooms.add(7);
		rooms.add(8);
		rooms.add(9);
	}
	
	//入住
	public static void checkIn() {
		System.out.println("是否已经预约(yes/no)?");
		String isBook = sc.nextLine();
		if("yes".equals(isBook)) {
			System.out.println("输入房间:");
			int no = Integer.parseInt(sc.nextLine());
			for (Pet pet : pets) {
				if (no == pet.getNo()) {
					pet.setStatus(1);
					System.out.println("入住成功!");
				}else {
					System.out.println("无预约信息");
				}
			}
		}else{
			System.out.println(rooms);
			try {			
				System.out.println("输入姓名:");
				String name = sc.nextLine();
				System.out.println("输入年龄:");
				int age = Integer.parseInt(sc.nextLine());
				System.out.println("选择动物类型(1:Cat,2:Dog,3:Bird):");
				int numType = Integer.parseInt(sc.nextLine());
				PetType type = null;
			
				if (numType == 1) {
					type = PetType.Cat;
				} else if (numType == 2) {
					type = PetType.Dog;
				} else if (numType == 3) {
					type = PetType.Bird;
				} else {
					System.out.println("输入有误!");
					return;
				}
				System.out.println("请选择房间:");
				int no = Integer.parseInt(sc.nextLine());
				if (!rooms.contains(no)) {
					System.out.println("非空房");
					return;
				}
				rooms.remove(Integer.valueOf(no));
				//日期
				System.out.println("入住天数:");
				int days = Integer.parseInt(sc.nextLine());
				Calendar ca = Calendar.getInstance();
				ca.setTime(new Date());
				ca.add(Calendar.DATE, days);
				Date endDate = ca.getTime();
				//增加宠物列表
				if (numType == 1) {
					pets.add(new Cat(no, name, age, type, 1, endDate));
				} else if (numType == 2) {
					pets.add(new Dog(no, name, age, type, 1, endDate));
				} else if (numType == 3) {
					pets.add(new Bird(no, name, age, type, 1, endDate));
				}
				System.out.println("入住成功!");
			} catch (Exception e) {
				System.out.println("输入有误!");
			}
		}
	}
	
	//退房
	public static void checkout() {
		System.out.println("输入房间:");
		int no = Integer.parseInt(sc.nextLine());
		
		for(Pet pet : pets) {
			if(pet.getNo() == no){
				System.out.println(pet);
				rooms.add(no);
				pets.remove(pet);
				System.out.println("成功取消预约！");
			}else {
				System.out.println("输入正确的房间");
			}
		}
	}
	
	//预约
	public static void reserve(){
		System.out.println(rooms);
		try {
			System.out.println("输入姓名:");
			String name = sc.nextLine();
			System.out.println("输入年龄:");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("选择动物类型(1:Cat,2:Dog,3:Bird):");
			int numType = Integer.parseInt(sc.nextLine());
			PetType type = null;
		
			if (numType == 1) {
				type = PetType.Cat;
			} else if (numType == 2) {
				type = PetType.Dog;
			} else if (numType == 3) {
				type = PetType.Bird;
			} else {
				System.out.println("输入有误!");
				return;
			}
			System.out.println("请选择房间:");
			int no = Integer.parseInt(sc.nextLine());
			if (!rooms.contains(no)) {
				System.out.println("非空房");
				return;
			}
			rooms.remove(Integer.valueOf(no));
			
			//日期
			System.out.println("入住天数:");
			int days = Integer.parseInt(sc.nextLine());
			Calendar ca = Calendar.getInstance();
			ca.setTime(new Date());
			ca.add(Calendar.DATE, days);
			Date endDate = ca.getTime();
		
			if (numType == 1) {
				pets.add(new Cat(no ,name, age, type, -1, endDate));
			} else if (numType == 2) {
				pets.add(new Dog(no ,name, age, type, -1, endDate));
			} else if (numType == 3) {
				pets.add(new Bird(no ,name, age, type, -1, endDate));
			}
			System.out.println("预约成功!");

		} catch (Exception e) {
			System.out.println("输入有误!");
		}
	}
	
	//预约取消
	public static void cancel() {
		System.out.println("输入房间:");
		int no = Integer.parseInt(sc.nextLine());
		for(Pet pet : pets) {
			if(pet.getNo() == no){
				System.out.println(pet.getNo());
				rooms.add(no);
				pets.remove(pet);
				System.out.println("成功取消预约！");
			}else {
				System.out.println("输入正确的房间");
			}
				
		}
		
	}
	
	
	//打印信息
	public static void print() {
		
		String filePath = "e:/JS/info.txt";
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(filePath);
			
			System.out.println("输入房间:");
			int no = Integer.parseInt(sc.nextLine());
			for(Pet pet : pets) {
				if(pet.getNo() == no){
					System.out.println(pet);
					String info = pet.name + pet.age + pet.type + pet.no + pet.time;
					
					fileOutputStream.write(info.getBytes());
				}
			}	
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		
	}

	public static void feed() {
		for (Pet pet : pets) {
			pet.eat();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("欢迎光临");	
		System.out.println("业务：1入住、2退房、3预约、4预约取消、5給食、6喂食、7结束系统");

		while (true) {
			System.out.println("业务序号：");
			String a = sc.nextLine();
			switch (a) {
			case "1":
				checkIn();
				System.out.println("返回主菜单");
				break;
			case "2":
				checkout();
				System.out.println("返回主菜单");
				break;
			case "3":
				reserve();
				System.out.println("返回主菜单");
				break;
			case "4":
				cancel();
				System.out.println("返回主菜单");
				break;
			case "5":
				print();
				System.out.println("返回主菜单");
			case "6":
				feed();
				System.out.println("返回主菜单");
			case "7":
				System.out.println("结束");
				return;
			default:
				System.out.println("输入有误!");
				break;
			}
		}
	}
		

}