package pethotel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hotel {
	private static ArrayList<Pet> pets = new ArrayList<>();// check in 情報
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Integer> rooms = new ArrayList<Integer>();// 部屋
	
	static Dog myDog = new Dog(null, null, 0, null, 0, null, null, false, false);
	static Cat myCat = new Cat(null, null, 0, null, 0, null, null, false, false);
	static Fish myFish = new Fish(null, null, 0, null, 0, null, null, false, false);


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
	 * menu
	 */
	public static void showMenu() {
		System.out.println();
		System.out.println("1: check in");
		System.out.println("2: check out");
		System.out.println("3:　空き部屋検索");
		System.out.println("4:　予約");
		System.out.println("5:　予約取り消し");
		System.out.println("6:　ペットフードをあげる");
		System.out.println("7:　入居者情報検索");
		System.out.println("8:　オプション");
		System.out.println("0:　exit");

	}

	/**
	 * check in
	 */
	public static void checkIn() {
		System.out.println("予約しましたか(yes/no)?");
		String isBook = input.nextLine();
		if ("yes".equals(isBook)) {
			System.out.println("ID番号を入力してください:");
			String card = input.nextLine();
			// 情報を検索
			boolean flag = false;
			for (Pet pet : pets) {
				if (pet.getCard().equals(card)) {
					pet.setIn(true);
					flag = true;
					System.out.println("チェックインしました!");
				}
			}
			if (!flag) {
				System.out.println("情報が存在しません！");
			}
		} else { 
			
			
				
			try {
				
				System.out.println("ID番号を入力:");
				String card = input.nextLine();
				
				for (Pet pet : pets) {
					if (pet.getCard().equals(card)) {
						
						if(pet.isIn()==true) {
							System.out.println("このペットはチェックイン済みです。再チェックインはできません!");
						return;
						}
						
						
					
						
					}
				}
				System.out.println("名前を入力:");
				String name = input.nextLine();
				System.out.println("年齢を入力:");
				int age = Integer.parseInt(input.nextLine());
				System.out.println("ペットの種類を選択(1:Cat,2:Dog,3:Fish):");
				int numType = Integer.parseInt(input.nextLine());
				PetType type = null;
				// 種類
				if (numType == 1) {
					type = PetType.CAT;
				} else if (numType == 2) {
					type = PetType.DOG;
				} else if (numType == 3) {
					type = PetType.FISH;
				
				} else {
					System.out.println("入力ミスです!");
					return;
				}
				System.out.println("部屋を選択してください:");//for循环
				for (Integer room : rooms) {
					System.out.println(room);
				}
				int tempRoom = Integer.parseInt(input.nextLine());
				if (!rooms.contains(tempRoom)) { 
					System.out.println("入力ミスです!");
					return;
				}
				// 移除
				rooms.remove(Integer.valueOf(tempRoom));
				// 计算离店时间
				System.out.println("宿泊日数:");
				int days = Integer.parseInt(input.nextLine());
				Calendar ca = Calendar.getInstance();
				//当前时间
				ca.setTime(new Date());
				ca.add(Calendar.DATE, days);//增加天数
				Date endDate = ca.getTime();//入住结束时间
				
				// 追加动物列表中
				if (numType == 1) {
					pets.add(new Cat(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				} else if (numType == 2) {
					pets.add(new Dog(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				} else if (numType == 3) {
					pets.add(new Fish(card, name, age, type, tempRoom, new Date(), endDate, true, false));
				
				}
				System.out.println("チェックインしました!");

			} catch (Exception e) {    //try　catch
				System.out.println("入力ミスです！！！");
			}

		}

	}

	/**
	 * check out
	 */
	public static void checkOut() {
		System.out.println("ID番号を入力:");
		String card = input.nextLine();
		// 是否存在
		boolean flag = false;
		Pet petTemp=null;
		for (Pet pet : pets) {
			if (pet.getCard().equals(card)) {
				flag=true;
				petTemp=pet;
			}
		}
		if (!flag) {
			System.out.println("このID番号は存在しません!");
		}else {
			if(petTemp!=null) {
				// 恢复房间
				rooms.add(petTemp.getRoomNo());
				// 移除客户信息
				pets.remove(petTemp);
				System.out.println("チェックアウトしました!");
			}
		}

	}

	/**
	 * 空き部屋検索
	 */
	public static void searchRoom() {
		System.out.println("空き部屋は:");
		for (Integer room : rooms) {
			System.out.println(room);
		}

	}

	/**
	 * 预约
	 */
	public static void bookIn() {
		try {
			// 读入信息
			System.out.println("ID番号を入力:");
			String card = input.nextLine();
			System.out.println("名前を入力:");
			String name = input.nextLine();
			System.out.println("年齢を入力:");
			int age = Integer.parseInt(input.nextLine());
			System.out.println("ペットの種類を選択(1:Cat,2:Dog,3:Fish):");
			int numType = Integer.parseInt(input.nextLine());
			PetType type = null;
			// 动物类型枚举
			if (numType == 1) {
				type = PetType.CAT;
			} else if (numType == 2) {
				type = PetType.DOG;
			} else if (numType == 3) {
				type = PetType.FISH;
		
			} else {
				System.out.println("入力ミスです!");
				return;
			}
			System.out.println("部屋を選択:");
			for (Integer room : rooms) {
				System.out.println(room);
			}
			int tempRoom = Integer.parseInt(input.nextLine());
			if (!rooms.contains(tempRoom)) {
				System.out.println("入力ミスです!");
				return;
			}
			rooms.remove(Integer.valueOf(tempRoom));
			System.out.println("宿泊日数:");
			// 计算离店时间
			int days = Integer.parseInt(input.nextLine());
			Calendar ca = Calendar.getInstance();
			ca.setTime(new Date());
			ca.add(Calendar.DATE, days);
			Date endDate = ca.getTime();
			// 追加动物列表
			if (numType == 1) {
				pets.add(new Cat(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			} else if (numType == 2) {
				pets.add(new Dog(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			} else if (numType == 3) {
				pets.add(new Fish(card, name, age, type, tempRoom, new Date(), endDate, false, false));
			
			}
			System.out.println("予約しました!");

		} catch (Exception e) {
			System.out.println("入力ミスです!");
		}

	}

	/**
	 * 取消预约
	 */
	public static void bookOut() {
		System.out.println("ID番号を入力:");
		String card = input.nextLine();
		// 是否预约
		boolean flag = false;
		Pet petTemp=null;
		for (Pet pet : pets) {
			if (pet.getCard().equals(card)) {
				flag=true;
				if(pet.isIn()==true) {
					System.out.println("このペットはチェックイン済みです。予約取り消しはできません!");
				}else {
					petTemp=pet;
				}
			}
		}
		if (!flag) {
			System.out.println("ID番号は存在しません!");
		}else {
			if(petTemp!=null) {
				// 恢复房间
				rooms.add(petTemp.getRoomNo());
				// 移除预约信息
				pets.remove(petTemp);
				System.out.println("予約をキャンセルしました！");
			}
		}

	}

	/**
	 * 餐饮服务
	 */
	public static void foodService() {
		System.out.println("--------ご飯の時間です-------");
		try {
		System.out.println("ID番号を入力:");
		String card = input.nextLine();
		
		boolean flag = false;
		for (Pet pet : pets) {
			if (pet.getCard().equals(card)) {
				flag=true;
				System.out.println("ペットの情報見つかりました！"+pet);
			}
		}
		if (!flag) {
			System.out.println("このID番号は存在しません!");
		}
		System.out.println("ペットの種類を入力(DOG/CAT/FISH):");
		String pettype = input.nextLine();
		if (pettype.equals("DOG")) {
			System.out.println("えさを選んでくだしい(DF.No.1/DF.No.2/DF.No.3):");
			String input_food_dog = input.nextLine();
			myDog.setDogFood(input_food_dog);                          
			myDog.eat(myDog.getDogFood());
			                             
		} else if (pettype.equals("CAT")) {
			System.out.println("えさを選んでくだしい(CF.No.1/CF.No.2/CF.No.3):");
			String input_food_cat = input.nextLine();
			myCat.setCatFood(input_food_cat);
			myCat.eat(myCat.getCatFood());
			
		} else if (pettype.equals("FISH")) {
			System.out.println("えさを選んでくだしい(BF.No.1/BF.No.2/BF.No.3):");
			String input_food_bird =input.nextLine();
			myFish.setFishFood(input_food_bird);
			myFish.eat(myFish.getFishFood());
		}
		}catch (Exception e) {
			System.out.println("入力ミスです!");
		}
		
		
		

	}

	/**
	 * 查询客人信息
	 */
	public static void searchAnimal() {
		System.out.println("ID番号を入力:");
		String card = input.nextLine();
		// 证件信息是否存在
		boolean flag = false;
		for (Pet pet : pets) {
			if (pet.getCard().equals(card)) {
				flag=true;
				System.out.println(pet);
			}
		}
		if (!flag) {
			System.out.println("このID番号は存在しません!");
		}

	}
	
	/**
	 * 其他服务
	 */
	public static void otherService() {
		System.out.println("--------オプション-------");
		try {
		System.out.println("ID番号を入力:");
		String card = input.nextLine();
		
		boolean flag = false;
		for (Pet pet : pets) {
			if (pet.getCard().equals(card)) {
				flag=true;
				System.out.println("ペットの情報見つかりました！"+pet);
			}
		}
		if (!flag) {
			System.out.println("このID番号は存在しません!");
		}
		
		System.out.println("ペットの種類を入力(DOG/CAT/FISH):");
		String pettype = input.nextLine();
		
		for (;;) {
		if (pettype.equals("DOG")) {
			System.out.println("オプションを選択してください(toy/clean);退出：exit");
			String input_enter_dog = input.nextLine();
			if (input_enter_dog.equals("toy")) {
			
				Dog dogToy= new Dog(input_enter_dog, input_enter_dog, 0, null, 0, null, null, false, false);
				dogToy.toy();
			} else if (input_enter_dog.equals("clean")) {
				Dog dogClean=new Dog(input_enter_dog, input_enter_dog, 0, null, 0, null, null, false, false);
				dogClean.clean();
			} else if (input_enter_dog.equals("exit")) {
				break;
			}
		} else if (pettype.equals("CAT")) {  
			System.out.println("オプションを選択してください(toy/clean);退出：exit");
			String input_enter_cat = input.nextLine();
			if (input_enter_cat.equals("toy")) {
			
				Cat catToy= new Cat(input_enter_cat, input_enter_cat, 0, null, 0, null, null, false, false);
				catToy.toy();
			} else if (input_enter_cat.equals("clean")) {
				Cat catClean=new Cat(input_enter_cat, input_enter_cat, 0, null, 0, null, null, false, false);
				catClean.clean();
			} else if (input_enter_cat.equals("exit")) {
				break;
			}
		} else if (pettype.equals("FISH")) {  
			System.out.println("オプションを選択してください(swim/clean);退出：exit");
			String input_enter_fish = input.nextLine();
			if (input_enter_fish.equals("swim")) {
				
				Fish fishSwim= new Fish(input_enter_fish, input_enter_fish, 0, null, 0, null, null, false, false);
				fishSwim.swim();
			} else if (input_enter_fish.equals("clean")) {
				Fish fishClean=new Fish(input_enter_fish, input_enter_fish, 0, null, 0, null, null, false, false);
				fishClean.clean();
			} else if (input_enter_fish.equals("exit")) {
				break;
			}
		}
		}
		}catch (Exception e) {
			System.out.println("入力ミスです!");
		}
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("----------------実行開始--------------------");
		System.out.println("------------いらっしゃいませ-----------------");
		boolean flag = false;
		while (true) {
			showMenu();
			System.out.println("選択してください:");
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
				
			case "8":
				otherService();
				break;
				
			case "0":
				flag = true;
				break;
			default:
				System.out.println("入力ミスです!");
				break;
			}
			if (flag) {
				System.out.println("システムがログアウトしました!");
				break;
			}

		}

	}

}
