package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;


public class Admin {
	
	public static void checkin(Pet[] hotel) {
		String name="";
		int age = 0;
		String type ="";
		System.out.println("Input pet info :\nExample:NAME:xxx,AGE:number only,TYPE:dog, cat, bird, only");		
		Scanner sc2 = new Scanner(System.in);
		String input = sc2.nextLine();
		String[] input_array = input.split(",");
		if (input_array.length != 3){
			System.out.println("input date is not true.\n");
			return;
		}
		else {
			for (int i = 0;i<3;i++) {
				String[] input_date = input_array[i].split(":");
				if ("NAME".equals(input_date[0])) {
					 name = input_date[1];
				}
				else if ("AGE".equals(input_date[0])) {
					 try {
						 age = Integer.valueOf(input_date[1]);
					 }catch(NumberFormatException e) {
						 System.out.println("input age is illegal.\n");
						 return;
					 }	 
				}
				else if ("TYPE".equals(input_date[0])) {
					 type = input_date[1];
				}
				else {
					System.out.println("input date is not true.\n");
					return;
				}
			}
			
			switch (type) {
			case "dog":
				//TODO DOG
				break;
			case "cat":
				//TODO CAT
				break;
			case "bird":
				//TODO BIRD
				break;
			default:
				System.out.println("TYPE does not exist.\n");
				return;
			}
			
			if (!"".equals(name) && age != 0 && !"".equals(type)) {
				// input 情報を収集できた時点
				boolean flag = checkroom(hotel);
				if (flag == false) {
					return;
				}
				switch (type) {
				case "dog":
					//TODO DOG
					for(;;) {
					System.out.println("choose your pet room : ");
					String input2 = sc2.nextLine();
					 try {
						 Integer.valueOf(input2);
					 }catch(NumberFormatException e) {
						 System.out.println("input room number is illegal.\n");
						 continue;
					 }
					
					if (Integer.valueOf(input2) >= hotel.length) {
						System.out.println("room can not be chosen! try again.\n");
						continue;
					}
					try {
						if (hotel[Integer.valueOf(input2)].RoomIsFree) {
							Dog dog = new Dog(name,age,type);
							hotel[Integer.valueOf(input2)] = dog;
							hotel[Integer.valueOf(input2)].setRoomIsFree(false);
							System.out.println("room "+input2+" be chosen.");
							break;
						}else {
							System.out.println("room can not be chosen! try again.\n");
						}
					}catch(NullPointerException e) {
						if (hotel[Integer.valueOf(input2)]==null) {
							Dog dog = new Dog(name,age,type);
							hotel[Integer.valueOf(input2)] = dog;
							hotel[Integer.valueOf(input2)].setRoomIsFree(false);
							System.out.println("room "+input2+" be chosen.");
							break;
						}else {
							System.out.println("room can not be chosen! try again.\n");
						}
					}	
					}
					break;
				case "cat":
					//TODO CAT
					for(;;) {
					System.out.println("choose your pet room : ");
					String input2 = sc2.nextLine();
					 try {
						 Integer.valueOf(input2);
					 }catch(NumberFormatException e) {
						 System.out.println("input room number is illegal.\n");
						 continue;
					 }
					if (Integer.valueOf(input2) >= hotel.length) {
						System.out.println("room can not be chosen! try again.\n");
						continue;
					}
					try {
						if (hotel[Integer.valueOf(input2)].RoomIsFree) {
							Cat cat = new Cat(name,age,type);
							hotel[Integer.valueOf(input2)] = cat;
							hotel[Integer.valueOf(input2)].setRoomIsFree(false);
							System.out.println("room "+input2+" be chosen.");
							break;
						}else {
							System.out.println("room can not be chosen! try again.\n");
						}
					}catch(NullPointerException e) {
						if (hotel[Integer.valueOf(input2)]==null) {
							Cat cat = new Cat(name,age,type);
							hotel[Integer.valueOf(input2)] = cat;
							hotel[Integer.valueOf(input2)].setRoomIsFree(false);
							System.out.println("room "+input2+" be chosen.");
							break;
						}else {
							System.out.println("room can not be chosen! try again.\n");
						}
					}
					}
					break;
				case "bird":
					//TODO BIRD
					for(;;) {
					System.out.println("choose your pet room : ");
					String input2 = sc2.nextLine();
					 try {
						 Integer.valueOf(input2);
					 }catch(NumberFormatException e) {
						 System.out.println("input room number is illegal.\n");
						 continue;
					 }
					if (Integer.valueOf(input2) >= hotel.length) {
						System.out.println("room can not be chosen! try again.\n");
						continue;
					}
					 try {
							if (hotel[Integer.valueOf(input2)].RoomIsFree) {
								Bird bird = new Bird(name,age,type);
								hotel[Integer.valueOf(input2)] = bird;
								hotel[Integer.valueOf(input2)].setRoomIsFree(false);
								System.out.println("room "+input2+" be chosen.");
								break;
							}else {
								System.out.println("room can not be chosen! try again.\n");
							}
						}catch(NullPointerException e) {
							if (hotel[Integer.valueOf(input2)]==null) {
								Bird bird = new Bird(name,age,type);
								hotel[Integer.valueOf(input2)] = bird;
								hotel[Integer.valueOf(input2)].setRoomIsFree(false);
								System.out.println("room "+input2+" be chosen.");
								break;
							}else {
								System.out.println("room can not be chosen! try again.\n");
							}
						}
					
					}
					break;
				default:
//					System.out.println("TYPE does not exist.");
					return;
				}

			}

		}
	}
	public static void checkout(Pet[] hotel) {
		int roomnum = room_info(hotel);
		Scanner sc4 = new Scanner(System.in);
		System.out.println(roomnum + " room that you want to check out?    yes/no");
		String input = sc4.nextLine();
		if (input.equals("yes")) {
			hotel[roomnum].name = "";
			hotel[roomnum].age = 0;
			hotel[roomnum].type = "";
			hotel[roomnum].RoomIsFree = true;
			System.out.println("room "+roomnum+" is free now.");
		}else if (input.equals("no")) {
			return;
		}else {
			System.out.println("input date is illegal!\n");
			return;
		}
		return;			
//		System.out.println("NAME\tAGE\tTYPE\n"+hotel[roomnum].name+"\t"+hotel[roomnum].age+"\t"+hotel[roomnum].type);
		//System.out.println(hotel[roomnum].name+"\t"+hotel[roomnum].age+"\t"+hotel[roomnum].type);
	}
	
	public static boolean checkroom(Pet[] hotel) {
		int room_num = hotel.length;
		boolean flag = false;
		int[] freeroom =new int[room_num];
		
		for (int i = 0;i < room_num;i++) {
			try {
				if(hotel[i].RoomIsFree) {
//					System.out.println("Room "+i+" can be chosen.");
					flag = true;
					freeroom[i]=1;
				}
			}catch(NullPointerException e){
				if(hotel[i]==null) {
//					System.out.println("Room "+i+" can be chosen.");
					flag = true;
					freeroom[i]=1;
				}
			}
		}

		if (flag == false) {
			System.out.println("all room cant be chosen.\n");
		}
		System.out.println("free room info  : "+ Arrays.toString(freeroom));
		return flag;
	}
	
	public static int room_info(Pet[] hotel) {
		checkroom(hotel);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("choose room that you want to check the pet' info:");
		String input = sc3.nextLine();
		try {
			Integer.valueOf(input);
		}catch(NumberFormatException e) {
			System.out.println("date error!\n");
			return 0;
		}
		int roomnum = Integer.valueOf(input);
		if (hotel[roomnum] == null || hotel[roomnum].RoomIsFree==true) {
			System.out.println("This room has no pet!\n");
			return 0;
		}
		System.out.println("pet's info :");
		System.out.println("-----------------------");
		System.out.printf("%-8s|%-8s|%-8s%n", "NAME","AGE","TYPE");
		System.out.println("-----------------------");
		System.out.printf("%-8s|%-8d|%-8s%n", hotel[roomnum].name,hotel[roomnum].age,hotel[roomnum].type);
		System.out.println("-----------------------");
		return roomnum;
	}
	
}
