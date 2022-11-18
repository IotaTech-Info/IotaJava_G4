package co.jp.PetHotel;
import java.util.Scanner;

public class Hotel {
    public static Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][4];
        int floor = 1;
        int raw = 1;
        for (floor = 1; floor < rooms.length + 1; floor++) {
            for (raw = 1; raw < rooms[0].length + 1; raw++) {
                rooms[floor - 1][raw - 1] = new Room(floor * 100 + raw, new Pet());
            }
        }
    }
// check room condition
    public void CheckHotelEmptyCondition() {
        for (Room[] row : this.rooms) {
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
    //refer input room number out put info
    public static void Refer(int roomnum) {
    	int i = roomnum / 100;
		int j = roomnum % 100;
		if(rooms[i-1][j-1].IsRoomEmpty == false) {
			System.out.println("Room Number: "+rooms[i-1][j-1].roomNumber+"; "+rooms[i-1][j-1].pet.getName()+", "+rooms[i-1][j-1].pet.getAge()+", "+rooms[i-1][j-1].pet.getType());
		}else {
			System.out.println("Room Number: " + rooms[i-1][j-1].roomNumber + " no pets in.");
		}
    }
    //check room
    public static void checkRoom(Hotel hotel) {
    	Scanner sc6 = new Scanner(System.in);
    	System.out.println("Enter '1' for all check, '2' for certain room.");
    	while(true) {
			try {
				int re = sc6.nextInt();
				if(re != 1 && re != 2) {
					System.out.println("Please enter 1 or 2:");
					continue;
				}else if(re == 1){
					hotel.CheckHotelEmptyCondition();;
				}else if(re == 2) {
					Scanner sc61 = new Scanner(System.in);
			    	System.out.println("Enter room number:");
			    	int crn = sc61.nextInt();
			    	Refer(crn);
				}
				
			}catch (Exception e) {
				System.out.println("Please try again:");
				continue;
			}
			break;
		}
		
    }
    //Check Out Method
    public static void Out(Hotel hotel) {
    	Scanner outroom = new Scanner(System.in);
		System.out.println("Please enter the room number:");
		int room;
		int floor;
		int raw;
		while(true) {
			try {
				room = outroom.nextInt();
				floor = room / 100;
				raw = room % 100;
			    boolean x = hotel.rooms[floor-1][raw-1].IsRoomEmpty;
				if(x == true) {
					System.out.println("The room is empty！Please enter again！");
					continue;
				}else {
					hotel.rooms[floor-1][raw-1].CheckOut(room);
				}
			}catch (Exception e) {
				System.out.println("Please try again:");
				continue;
			}
			break;
		}
		System.out.println("Successed to check out.");
		
			
    	
    }
    //Check In Method
    public static void In(Hotel hotel) {
        // print empty rooms
//      hotel.CheckHotelEmptyCondition();
//      Scanner userInfo = new Scanner(System.in); // Create a Scanner object
    	hotel.CheckHotelEmptyCondition();
    	Scanner userInfo = new Scanner(System.in); // Create a Scanner object
    	// Read user input -- Room number
    	
    	int roomNumber;
    	int floor;
        int raw;
        while (true) {
        	try {
        		System.out.println("Please enter the room number:");
        		roomNumber = userInfo.nextInt();
        		floor = roomNumber / 100;
        		raw = roomNumber % 100;	
        		boolean x = hotel.rooms[floor-1][raw-1].IsRoomEmpty;
        		if(x == false) {
        			System.out.println("Full room.");
        			continue;
   
        		}else {
        			System.out.println("FLOOR RAW" + floor + "  " + raw + " is " + x + " empty.");
        		}
        	}catch (Exception e) {
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
 			if (null ==petName||"".equals(petName)) {
 				System.out.println("Please try again:");
 				continue;
 			}
 			break;
 		}
      // Read user input -- Pet age
        while (true) {
        	try {
        		userInfo=new Scanner(System.in);
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
         	
        while (true) {
        	try {
        		System.out.println("Please enter the Pet Type Number, 1.Cat, 2.Dog, 3.Bird ");
 				userInfo=new Scanner(System.in);
 			    pettp = userInfo.nextInt();
 			    switch(pettp) {
	 				case 1:
	 					Cat cat=new Cat(petName,petAge,PetType.getEumn(pettp).type);
	 					hotel.rooms[floor-1][raw-1].CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);
	 					break;
	 				case 2:
	 					Dog dog=new Dog(petName,petAge,PetType.getEumn(pettp).type);
	 					hotel.rooms[floor-1][raw-1].CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);
	 					break;
	 				case 3:
	 					Bird bd=new Bird(petName,petAge,PetType.getEumn(pettp).type);
	 					hotel.rooms[floor-1][raw-1].CheckIn(roomNumber, petName, petAge, PetType.getEumn(pettp).type);
	 					break;
	 				default:
	 					System.out.println("Please try again:");
	 					continue;
	 			}
 			  /* 
 			if (pettp.equalsIgnoreCase("Cat")) {
 		        petType = PetType.CAT;
 		     } else if (pettp.equalsIgnoreCase("Dog")) {
 		        petType = PetType.DOG;
 		     } else if (pettp.equalsIgnoreCase("Bird")) {
 		        petType = PetType.BIRD;
 		      }else {
 		    	  System.out.println("please try again:");
 		          continue;
 		        }*/
 				
 			} catch (Exception e) {
 				System.out.println("Please try again:");
 				continue;
 			}

 			break;
 		}
        System.out.println("Successed to check in.");
    }
    // feed method
    public static void Feed(Room[][] rooms) {
    	Cat pet1 = new Cat();
    	Dog pet2 = new Dog();
    	Bird pet3 = new Bird();
//    	Scanner sc3 = new Scanner(System.in);
//    	System.out.println("Enter'all' or room number:");
//    	String feed = sc3.next();
	    for (Room[] row : rooms) {
	    	for (Room room : row) {
	    		if(room.IsRoomEmpty == false) {
	    			System.out.println("Room Number: " + room.roomNumber);
	    			System.out.print(room.pet.getName()+","+room.pet.getAge()+",");
	    			String tp = room.pet.getType();
	    			if("cat".equals(tp)) {
	    				pet1.eat();
			         }else if("dog".equals(tp)) {
			        	 pet2.eat();
			         }else if("bird".equals(tp)) {
			        	 pet3.eat();
			         }
	    		}
	    	}
	    }
	    System.out.println("Pets are feeded.");			
    }
    //isNumber
    public static boolean isNumber(String str) {  
    	for (int i = str.length();--i>=0;){  
    	       if (!Character.isDigit(str.charAt(i))){
    	           return false;
    	       }
    	   }
    	   return true;
    }
    //play method
    public static void Play(Room[][] rooms) {
    	Cat pet1 = new Cat();
    	Dog pet2 = new Dog();
    	Bird pet3 = new Bird();
    	for (Room[] row : rooms) {
            for (Room room : row) {
            	if(room.IsRoomEmpty == false) {
            		System.out.println("Room Number: " + room.roomNumber);
            		System.out.print(room.pet.getName()+","+room.pet.getAge()+",");
            		String tp = room.pet.getType();
            		if("cat".equals(tp)) {
            			pet1.run();
            		}else if("dog".equals(tp)) {
            			pet2.run();
            		}else if("bird".equals(tp)) {
            			pet3.fly();
            		}
            	}
            }
            
    	}
    	System.out.println("Pets are tired.");
    }
/*
    public static void Sortprint(PetType pettype,Room[][] rooms) {
    	PetType pt = null;
    	for (Room[] row : rooms) {
            for (Room room : row) {
            	System.out.println(room.roomNumber);
            	pt = StringtoPetType(room.pet.getType());
            	System.out.println(pt.equals(pettype));
            	if(pt.equals(pettype)) {
            		System.out.println(room.roomNumber+", "+room.pet.getName()+", "+room.pet.getAge()+", "+room.pet.getType());
            	}
            }
    	}
    	
    }
    public static PetType StringtoPetType(String str) {
    	PetType petType = null;
    	if (str.equalsIgnoreCase("Cat")) {
    		petType = PetType.CAT;
    		System.out.println(petType);
    	} else if (str.equalsIgnoreCase("Dog")) {
    		petType = PetType.DOG;
    		System.out.println(petType);
    	} else if (str.equalsIgnoreCase("Bird")) {
    		petType = PetType.BIRD;
    		System.out.println(petType);
		}else {
			System.out.println("please try again:");
		}
		return petType;
    }
    public static void Sort(Room[][] rooms) {
    	while (true) {
        	try {
        		System.out.println("Please enter the Pet Type, Cat, Dog, Bird :");
        		Scanner sc2 = new Scanner(System.in);
 			    String s = sc2.next();   
 			    System.out.println(s);
 			    PetType petType = StringtoPetType(s);
 			    
 			    switch(petType) {
 		    	case CAT:
 		    		Sortprint(petType,rooms);
 		   			break;
 		   		case DOG:
 		   			Sortprint(petType,rooms);
 		   			break;
 	    		case BIRD:
 	    			Sortprint(petType,rooms);
		    		break;
 		    	default:
 					System.out.println("Please try again:");
 					continue;
 		    	}
	 			break;
	 		}catch (Exception e) {
 		    		System.out.println("Please try again!");
 		    		continue;
	 		}
        }
    	
    }
*/
    public static void main(String[] args) {

        // Intializition
        Hotel hotel = new Hotel();
        while(true) {
        	System.out.println("1:check in, 2:check out, 3:feed, 4:play, 5:check room, 6:exit");
        	Scanner sc = new Scanner(System.in); // Create a Scanner object
        	int a;
        	try {
        		a = sc.nextInt();
        	} catch (Exception e) {

				System.out.println("Please try again:");
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
				Feed(rooms);
				break;
			case 4:
				Play(rooms);
				break;
			case 5:
				checkRoom(hotel);
				break;
			case 6:
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
