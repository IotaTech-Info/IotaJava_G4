package co.jp.part3_PetHotel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Hotel {
//	public static Room[][] rooms;
	List<List<Room>> rooms = new ArrayList<>();

	public Hotel() {
//		rooms = new Room[3][4];
		
		int floor = 1;
		int raw = 1;
		for (floor = 1; floor < 4; floor++) {
			List<Room> columnRooms = new ArrayList<Room>();
			for (raw = 1; raw < 5; raw++) {
				Room temp = new Room(floor * 100 + raw, new Pet());
				columnRooms.add(raw-1, temp);
				
			}
			rooms.add(floor-1, columnRooms);
		}
	}

// check room condition
	public void CheckHotelEmptyCondition() {
		for (List<Room> row : this.rooms) {
			for (Room room : row) {
				System.out.print(room.roomNumber + "   " + "\t");
			}
			System.out.println();
			for (Room room : row) {
				if (room.IsRoomEmpty) {
					System.out.print("Empty" + "\t");
				} else {
					System.out.print(room.pet.getName() + "\t");
				}
			}
			System.out.println();
		}
	}

	// refer input room number out put info
//	public static void Refer(int roomnum) {
//		int i = roomnum / 100;
//		int j = roomnum % 100;
//		
//		if (rooms[i - 1][j - 1].IsRoomEmpty == false) {
//			System.out
//					.println("Room Number: " + rooms[i - 1][j - 1].roomNumber + "; " + rooms[i - 1][j - 1].pet.getName()
//							+ ", " + rooms[i - 1][j - 1].pet.getAge() + ", " + rooms[i - 1][j - 1].pet.getType());
//		} else {
//			System.out.println("Room Number: " + rooms[i - 1][j - 1].roomNumber + " no pets in.");
//		}
//	}

	// check room
	public static void checkRoom(Hotel hotel) {
		Scanner sc6 = new Scanner(System.in);
		
		System.out.println("Enter '1' for all check, '2' for certain room.");
		while (true) {
			try {
				int re = sc6.nextInt();
				if (re != 1 && re != 2) {
					System.out.println("Please enter 1 or 2:");
					continue;
				} else if (re == 1) {
					hotel.CheckHotelEmptyCondition();
					;
				} else if (re == 2) {
					Scanner sc61 = new Scanner(System.in);
					System.out.println("Enter room number:");
					int crn = sc61.nextInt();
					int floor = crn / 100;
					int raw = crn % 100;
					List<Room> temp = hotel.rooms.get(floor-1);
					Room tmp = temp.get(raw-1);
					if (tmp.IsRoomEmpty == false) {
						System.out
								.println("Room Number: " + tmp.roomNumber + "; " + tmp.pet.getName()
										+ ", " + tmp.pet.getAge() + ", " + tmp.pet.getType());
					} else {
						System.out.println("Room Number: " + tmp.roomNumber + " no pets in.");
					}
//					Refer(crn);
				}

			} catch (Exception e) {
				System.out.println("Please try again:");
				continue;
			}
			break;
		}

	}

	// Check Out Method
	public static void Out(Hotel hotel) {
		Scanner outroom = new Scanner(System.in);
		System.out.println("Please enter the room number:");
		int room;
		int floor;
		int raw;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/wangsy/Documents/eclipse/IotaJava_G4/test/dummy_file.txt"),"UTF-8"));
			List<String> list = new ArrayList<String>();
			for(;;) {
				String read_str = br.readLine();
				if(read_str == null) {
					break;
				}
				list.add(read_str);
//				System.out.println(read_str);
				}
			br.close();
//			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/wangsy/Documents/eclipse/IotaJava_G4/test/dummy_file.txt"), "UTF-8")); 
			
			while (true) {
				
				room = outroom.nextInt();
				floor = room / 100;
				raw = room % 100;
					
				List<Room> temp = hotel.rooms.get(floor-1);
				Room tmp = temp.get(raw-1);
	//			String tmp = Arrays.toString(temp.toArray());
					
					
	//			boolean x = hotel.rooms[floor - 1][raw - 1].IsRoomEmpty;
				boolean x = tmp.IsRoomEmpty;
				if (x == true) {
					System.out.println("The room is empty！Please enter again！");
					continue;
				} else {
					tmp.CheckOut(room);
					System.out.println("The check in room number is " + outroom);
			        System.out.println("The Pet Name is " + tmp.pet.getName() + "; Pet Age is " + tmp.pet.getAge() + "; Pet Type is " + tmp.pet.getType().toString());
				}
				break;
			}
//			for(String read_str : list) {
//				out.write(read_str);
//				out.write("\r\n");
//			}
//			out.append(roomNumber + "," + tmp.pet.getName() +  "," + tmp.pet.getAge() + tmp.pet.getType().toString()+ "\r\n");
//			out.close();
			
		} catch (Exception e) {
			System.out.println("Please try again:");
			
		}
		
		System.out.println("Successed to check out.");

	}

	// Check In Method
	public static void In(Hotel hotel) {
		// print empty rooms
//      hotel.CheckHotelEmptyCondition();
//      Scanner userInfo = new Scanner(System.in); // Create a Scanner object
		hotel.CheckHotelEmptyCondition();
		Scanner userInfo = new Scanner(System.in); // Create a Scanner object
		// Read user input -- Room number

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = simpleDateFormat.format(new Date());
		
		int roomNumber;
		int floor;
		int raw;
		System.out.println("Please enter the room number:");
		roomNumber = userInfo.nextInt();
		floor = roomNumber / 100;
		raw = roomNumber % 100;
		List<Room> temp = hotel.rooms.get(floor-1);
		Room tmp = temp.get(raw-1);
		while (true) {
			try {
//				System.out.println("Please enter the room number:");
//				roomNumber = userInfo.nextInt();
//				floor = roomNumber / 100;
//				raw = roomNumber % 100;
//				List<Room> temp = hotel.rooms.get(floor-1);
//				Room tmp = temp.get(raw-1);
				
				boolean x = tmp.IsRoomEmpty;
				if (x == false) {
					System.out.println("Full room.");
					continue;

				} else {
					System.out.println("FLOOR RAW" + floor + "  " + raw + " is " + x + " empty.");
				}
			} catch (Exception e) {
				System.out.println("Please try again:");
				continue;
			}
			break;
		}
		//
		String petName;
		int petAge;
		int pettp;
		// Read user input -- Pet name
		while (true) {
			System.out.println(" Please enter the Pet Name:");
			petName = userInfo.next();
			if (null == petName || "".equals(petName)) {
				System.out.println("Please try again:");
				continue;
			}
			break;
		}
		// Read user input -- Pet age
		while (true) {
			try {
				userInfo = new Scanner(System.in);
				System.out.println("Please enter the Pet Age:");
				petAge = userInfo.nextInt();
			} catch (Exception e) {
				System.out.println("Please try again:");
				continue;
			}
			break;
		}
		// Read user input -- Pet type
//         PetType petType = null;

		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/wangsy/Documents/eclipse/IotaJava_G4/test/dummy_file.txt"),"UTF-8"));
			List<String> list = new ArrayList<String>();
			for(;;) {
				String read_str = br.readLine();
				if(read_str == null) {
					break;
				}
				list.add(read_str);
//				System.out.println(read_str);
				}
			
			br.close();
			
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/wangsy/Documents/eclipse/IotaJava_G4/test/dummy_file.txt"), "UTF-8")); 
			while (true) {
				
				System.out.println("Please enter the Pet Type Number, 1.Cat, 2.Dog, 3.Bird ");
				userInfo = new Scanner(System.in);
				pettp = userInfo.nextInt();
				switch (pettp) {
				case 1:
					Cat cat = new Cat(petName, petAge, PetType.getEumn(pettp).type);
					tmp.CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);
					System.out.println("The check in room number is " + roomNumber);
		        	System.out.println("The Pet Name is " + tmp.pet.getName() + "; Pet Age is " + tmp.pet.getAge() + "; Pet Type is " + tmp.pet.getType().toString());
//		        	out.append(roomNumber + "," + tmp.pet.getName() +  "," + tmp.pet.getAge() + tmp.pet.getType().toString()+ "\r\n"); 
					break;
				case 2:
					Dog dog = new Dog(petName, petAge, PetType.getEumn(pettp).type);
					tmp.CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);
					System.out.println("The check in room number is " + roomNumber);
		        	System.out.println("The Pet Name is " + tmp.pet.getName() + "; Pet Age is " + tmp.pet.getAge() + "; Pet Type is " + tmp.pet.getType().toString());
//		        	out.append(roomNumber + "," + tmp.pet.getName() +  "," + tmp.pet.getAge() + tmp.pet.getType().toString()+ "\r\n");
					break;
				case 3:
					Bird bd = new Bird(petName, petAge, PetType.getEumn(pettp).type);
					tmp.CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);
					System.out.println("The check in room number is " + roomNumber);
		        	System.out.println("The Pet Name is " + tmp.pet.getName() + "; Pet Age is " + tmp.pet.getAge() + "; Pet Type is " + tmp.pet.getType().toString());
//		        	out.append(roomNumber + "," + tmp.pet.getName() +  "," + tmp.pet.getAge() + tmp.pet.getType().toString() + "\r\n");
					break;
				default:
					System.out.println("Please try again:");
					continue;
				}
				/*
				 * if (pettp.equalsIgnoreCase("Cat")) { petType = PetType.CAT; } else if
				 * (pettp.equalsIgnoreCase("Dog")) { petType = PetType.DOG; } else if
				 * (pettp.equalsIgnoreCase("Bird")) { petType = PetType.BIRD; }else {
				 * System.out.println("please try again:"); continue; }
				 */
				
				break;
			}
			for(String read_str : list) {
				out.write(read_str);
				out.write("\r\n");
			}
			out.append(roomNumber + "," + tmp.pet.getName() +  "," + tmp.pet.getAge() + tmp.pet.getType().toString()+ "\r\n");
			out.close();
			
		} catch (Exception e) {
			System.out.println("Please try again:");
			
		} 
//		catch (IOException e) {
//			System.out.println("IOException Please try again:");
//			continue;
//		}
		System.out.println("Successed to check in." + dateString);
	}
	

	// feed method
	public static void Feed(Hotel hotel) {
		Cat pet1 = new Cat();
		Dog pet2 = new Dog();
		Bird pet3 = new Bird();
//    	Scanner sc3 = new Scanner(System.in);
//    	System.out.println("Enter'all' or room number:");
//    	String feed = sc3.next();
		for (List<Room> row : hotel.rooms) {
			for (Room room : row) {
				if (room.IsRoomEmpty == false) {
					System.out.println("Room Number: " + room.roomNumber);
					System.out.print(room.pet.getName() + "," + room.pet.getAge() + ",");
					String tp = room.pet.getType();
					if ("cat".equals(tp)) {
						pet1.eat();
					} else if ("dog".equals(tp)) {
						pet2.eat();
					} else if ("bird".equals(tp)) {
						pet3.eat();
					}
				}
			}
		}
		System.out.println("Pets are feeded.");
	}

	// isNumber
	public static boolean isNumber(String str) {
		for (int i = str.length(); --i >= 0;) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	// play method
	public static void Play(Hotel hotel) {
		Cat pet1 = new Cat();
		Dog pet2 = new Dog();
		Bird pet3 = new Bird();
		for (List<Room> row : hotel.rooms) {
			for (Room room : row) {
				if (room.IsRoomEmpty == false) {
					System.out.println("Room Number: " + room.roomNumber);
					System.out.print(room.pet.getName() + "," + room.pet.getAge() + ",");
					String tp = room.pet.getType();
					if ("cat".equals(tp)) {
						pet1.run();
					} else if ("dog".equals(tp)) {
						pet2.run();
					} else if ("bird".equals(tp)) {
						pet3.fly();
					}
				}
			}

		}
		System.out.println("Pets are tired.");
	}

	/*
	 * public static void Sortprint(PetType pettype,Room[][] rooms) { PetType pt =
	 * null; for (Room[] row : rooms) { for (Room room : row) {
	 * System.out.println(room.roomNumber); pt =
	 * StringtoPetType(room.pet.getType()); System.out.println(pt.equals(pettype));
	 * if(pt.equals(pettype)) {
	 * System.out.println(room.roomNumber+", "+room.pet.getName()+", "+room.pet.
	 * getAge()+", "+room.pet.getType()); } } }
	 * 
	 * } public static PetType StringtoPetType(String str) { PetType petType = null;
	 * if (str.equalsIgnoreCase("Cat")) { petType = PetType.CAT;
	 * System.out.println(petType); } else if (str.equalsIgnoreCase("Dog")) {
	 * petType = PetType.DOG; System.out.println(petType); } else if
	 * (str.equalsIgnoreCase("Bird")) { petType = PetType.BIRD;
	 * System.out.println(petType); }else { System.out.println("please try again:");
	 * } return petType; }
	 */
	public static void Sort(Hotel hotel) {
		while (true) {
			System.out.println("Please enter animal type( 1/cat; 2/dog; 3/bird): ");
			Scanner scs = new Scanner(System.in);
			int insort;
			String y;
			if (scs.hasNextInt()) {

				try {

//	        		System.out.println("Please conform:!");
//	        		scs = new Scanner(System.in); 
					insort = scs.nextInt();
					if (PetType.getEumn(insort) != null) {
						String tp = PetType.getEumn(insort).type;
						for (List<Room> row : hotel.rooms) {
							for (Room room : row) {
								if (tp.equalsIgnoreCase(room.pet.getType())) {
									System.out.println("Room Number: " + room.roomNumber + "; " + room.pet.getName()
											+ ", " + room.pet.getAge() + ", " + room.pet.getType());
								}
							}
						}
						System.out.println("finish");
						break;
					} else {
						System.out.println("Please enter 1/2/3!");
						continue;
					}
				} catch (Exception e) {
					System.out.println("Please try again:");
					continue;
				}

			} else if (scs.hasNext()) {

				try {
//        			System.out.println("Please conform: ");
//        			scs = new Scanner(System.in); 
					y = scs.next();
					if (PetType.getEumn(y) != null) {
						String tp = PetType.getEumn(y).type;
						for (List<Room> row : hotel.rooms) {
							for (Room room : row) {
								if (tp.equalsIgnoreCase(room.pet.getType())) {
									System.out.println("Room Number: " + room.roomNumber + "; " + room.pet.getName()
											+ ", " + room.pet.getAge() + ", " + room.pet.getType());
								}
							}
						}
						System.out.println("finish");
						break;
					} else {
						System.out.println("Please enter cat; dog; bird");
						continue;
					}
				} catch (Exception e) {
					System.out.println("Please try again:");
					continue;
				}

			}

		}

	}

	public static void main(String[] args) {

		// Intializition
		Hotel hotel = new Hotel();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = simpleDateFormat.format(new Date());
		System.out.println("Date : " + dateString);
		while (true) {
			System.out.println("1:check in, 2:check out, 3:feed, 4:play, 5:check room, 6:sort, 7:exit");
			Scanner sc = new Scanner(System.in); // Create a Scanner object
			int a;
			try {
				a = sc.nextInt();
			} catch (Exception e) {

				System.out.println("Please try again!");
				continue;
			}
			switch (a) {
			case 1:
				In(hotel);
				break;
			case 2:
				Out(hotel);
				break;
			case 3:
				Feed(hotel);
				break;
			case 4:
				Play(hotel);
				break;
			case 5:
				checkRoom(hotel);
				break;
			case 6:
				Sort(hotel);
				break;
			case 7:
				System.out.println("Thank you for your intrest.");
				return;
			default:
				System.out.println("Please try again:");
				break;
			}

		}

		// Check in
//        hotel.rooms[floor][raw].CheckIn(roomNumber, petName, petAge, petType);
//        hotel.rooms[floor][raw].CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);

	}

}
