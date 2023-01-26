package co.jp.part3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	private static ArrayList<Animal> animals = new ArrayList<>();// 动物入住信息
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Integer> rooms = new ArrayList<Integer>();// 房间

	static {
		rooms.add(1001);
		rooms.add(1002);
		rooms.add(1003);
		rooms.add(2001);
		rooms.add(2002);
		rooms.add(2003);
		rooms.add(3001);
		rooms.add(3002);
		rooms.add(3003);
	}

	/**
	 * 显示主菜单
	 */
	public static void showMenu() {
		System.out.println();
		System.out.println("1:入住");
		System.out.println("2:退房");
		System.out.println("3:空房间检索");
		System.out.println("4:预约房间");
		System.out.println("5:取消预约房间");
		System.out.println("6:餐饮服务");
		System.out.println("7:查询客人信息");
		System.out.println("0:退出系统");

	}

	/**
	 * 入住
	 */
	public static void checkIn() {
		System.out.println("是否已经预约(是/否)?");
		String isBook = input.nextLine();
		if ("是".equals(isBook)) {
			System.out.println("输入证件号:");
			String card = input.nextLine();
			// 证件信息是否存在
			boolean flag = false;
			for (Animal animal : animals) {
				if (animal.getCard().equals(card)) {
					animal.setIn(true);
					flag = true;
					System.out.println("入住成功!");
				}
			}
			if (!flag) {
				System.out.println("该证件号信息不存在!");
			}
		} else {  //填写其他后进入下列代码
			try {
				// 读入信息
				System.out.println("输入证件号:");
				String card = input.nextLine();
				System.out.println("输入姓名:");
				String name = input.nextLine();
				System.out.println("输入年龄:");
				int age = Integer.parseInt(input.nextLine());
				System.out.println("选择动物类型(1:Cat,2:Dog,3:Fish,4:Pig):");
				int numType = Integer.parseInt(input.nextLine());
				AnimalType type = null;
				// 动物类型枚举
				if (numType == 1) {
					type = AnimalType.CAT;
				} else if (numType == 2) {
					type = AnimalType.DOG;
				} else if (numType == 3) {
					type = AnimalType.FISH;
				} else if (numType == 4) {
					type = AnimalType.PIG;
				} else {
					System.out.println("输入有误!");
					return;
				}
				System.out.println("请选择房间:");//增强for循环遍历
				for (Integer room : rooms) {
					System.out.println(room);
				}
				int tempRoom = Integer.parseInt(input.nextLine());
				if (!rooms.contains(tempRoom)) { //不包含则提示错误
					System.out.println("输入有误!");
					return;
				}
				// 选择好的房间从房间中移除
				rooms.remove(Integer.valueOf(tempRoom));
				// 根据入住天数，计算离店时间
				System.out.println("入住天数:");
				int days = Integer.parseInt(input.nextLine());
				Calendar ca = Calendar.getInstance();
				//生成日期，传入当前时间
				ca.setTime(new Date());
				ca.add(Calendar.DATE, days);//增加input的天数
				Date endDate = ca.getTime();//入住结束时间
				
				// 根据动物的类型，生成不同的动物对象并追加到动物列表中
				if (numType == 1) {
					animals.add(new Cat(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				} else if (numType == 2) {
					animals.add(new Dog(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				} else if (numType == 3) {
					animals.add(new Fish(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				} else {
					animals.add(new Pig(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				}
				System.out.println("入住成功!");

			} catch (Exception e) {    //上面代码如果异常，执行下面catch语句
				System.out.println("输入有误！！！");
			}

		}

	}

	/**
	 * 退房
	 */
	public static void checkOut() {
		System.out.println("输入证件号:");
		String card = input.nextLine();
		// 证件信息是否存在
		boolean flag = false;
		Animal animalTemp=null;
		for (Animal animal : animals) {
			if (animal.getCard().equals(card)) {
				flag=true;
				animalTemp=animal;
			}
		}
		if (!flag) {
			System.out.println("该证件号信息不存在!");
		}else {
			if(animalTemp!=null) {
				// 恢复房间
				rooms.add(animalTemp.getRoomNo());
				// 移除客户信息
				animals.remove(animalTemp);
				System.out.println("退房成功!");
			}
		}

	}

	/**
	 * 空房间检索
	 */
	public static void searchRoom() {
		System.out.println("余房间如下:");
		for (Integer room : rooms) {
			System.out.println(room);
		}

	}

	/**
	 * 预约房间
	 */
	public static void bookIn() {
		try {
			// 读入信息
			System.out.println("输入证件号:");
			String card = input.nextLine();
			System.out.println("输入姓名:");
			String name = input.nextLine();
			System.out.println("输入年龄:");
			int age = Integer.parseInt(input.nextLine());
			System.out.println("选择动物类型(1:Cat,2:Dog,3:Fish,4:Pig):");
			int numType = Integer.parseInt(input.nextLine());
			AnimalType type = null;
			// 动物类型枚举
			if (numType == 1) {
				type = AnimalType.CAT;
			} else if (numType == 2) {
				type = AnimalType.DOG;
			} else if (numType == 3) {
				type = AnimalType.FISH;
			} else if (numType == 4) {
				type = AnimalType.PIG;
			} else {
				System.out.println("输入有误!");
				return;
			}
			System.out.println("请选择房间:");
			for (Integer room : rooms) {
				System.out.println(room);
			}
			int tempRoom = Integer.parseInt(input.nextLine());
			if (!rooms.contains(tempRoom)) {
				System.out.println("输入有误!");
				return;
			}
			rooms.remove(Integer.valueOf(tempRoom));
			System.out.println("入住天数:");
			// 根据入住天数，计算离店时间
			int days = Integer.parseInt(input.nextLine());
			Calendar ca = Calendar.getInstance();
			ca.setTime(new Date());
			ca.add(Calendar.DATE, days);
			Date endDate = ca.getTime();
			// 根据动物的类型，生层不同的动物对象并追加到动物列表中
			if (numType == 1) {
				animals.add(new Cat(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			} else if (numType == 2) {
				animals.add(new Dog(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			} else if (numType == 3) {
				animals.add(new Fish(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			} else {
				animals.add(new Pig(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			}
			System.out.println("预约成功!");

		} catch (Exception e) {
			System.out.println("输入有误!");
		}

	}

	/**
	 * 取消预约房间
	 */
	public static void bookOut() {
		System.out.println("输入证件号:");
		String card = input.nextLine();
		// 证件信息是否存在
		boolean flag = false;
		Animal animalTemp=null;
		for (Animal animal : animals) {
			if (animal.getCard().equals(card)) {
				flag=true;
				if(animal.isIn()==true) {
					System.out.println("该动物已入住，无法取消!");
				}else {
					animalTemp=animal;
				}
			}
		}
		if (!flag) {
			System.out.println("该证件号信息不存在!");
		}else {
			if(animalTemp!=null) {
				// 恢复房间
				rooms.add(animalTemp.getRoomNo());
				// 移除预约信息
				animals.remove(animalTemp);
				System.out.println("成功取消预约！");
			}
		}

	}

	/**
	 * 餐饮服务
	 */
	public static void foodService() {
		System.out.println("**********开饭了**********");
		for (Animal animal : animals) {
			animal.eat();
		}

	}

	/**
	 * 查询客人信息
	 */
	public static void searchAnimal() {
		System.out.println("输入证件号:");
		String card = input.nextLine();
		// 证件信息是否存在
		boolean flag = false;
		for (Animal animal : animals) {
			if (animal.getCard().equals(card)) {
				flag=true;
				System.out.println(animal);
			}
		}
		if (!flag) {
			System.out.println("该证件号信息不存在!");
		}

	}

	public static void main(String[] args) {
		System.out.println("----------------実行開始--------------------");
		System.out.println("*************欢迎来到宠物酒店( ＾∀＾)****************");
		boolean flag = false;
		while (true) {
			showMenu();
			System.out.println("请选择:");
			String choose = input.nextLine();
			switch (choose) {
			case "1":
				checkIn();//入住
				break;
			case "2":
				checkOut();// 退房
				break;
			case "3":
				searchRoom();// 查询空余房间
				break;
			case "4":
				bookIn();// 预订房间
				break;
			case "5":
				bookOut();// 取消预定
				break;
			case "6":
				foodService();// 餐饮服务
				break;
			case "7":
				searchAnimal();// 查询动物信息
				break;
			case "0":
				flag = true;
				break;
			default:
				System.out.println("输入有误!");
				break;
			}
			if (flag) {
				System.out.println("系统已退出!");
				break;
			}

		}

	}

}







