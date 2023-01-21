package co.jp.part3;


import java.util.Scanner;

public class MgSystem {
	
	static Scanner sc = new Scanner(System.in);
	static PetHotel myPetHotel = new PetHotel();
	public static void main(String[] args) {
	
	int statusNumber = sc.nextInt();
	if(statusNumber == 1) {
		
	
//		PetHotel pethotel= new PetHotel();
		while(true) {
         System.out.println("Pleas give instruction,0:check the room, 1:order,2:cancel,3:checkin,4:checkout,5:feed");
         //
         int instruction = sc.nextInt();
         switch(instruction) {
            case 0:
            	
            	myPetHotel.petHotel();
            	break;
         	case 1:
         		
         		myPetHotel.order();
         		break;
         	case 2:
         		myPetHotel.cancel();
         		break;
         	case 3:
         		myPetHotel.checkin();
         		break;
         	case 4:
         		 myPetHotel.checkout();
				 break;
         	case 5:
				 myPetHotel.feed();
         		break;
         	
         	default:
         		System.out.println("error");
         		break;
         	}
         
		}
		
	} else if (statusNumber == 2) {
		String passWord = "AdminZYR";
		System.out.println("please enter password.");
		String password = sc.next();
		
		if(password == passWord) {
			
			while(true) {
				System.out.println("select the option. 1.enter the pet'message.2.print the message list.");
				
				int instruction = sc.nextInt();
		         switch(instruction) {
		            case 0:
		            	
		            	myPetHotel.print();
		            	break;
		         	case 1:
		         		
		         		myPetHotel.enter();
		         		break;
		         		
		         	default:
		         		System.out.println("error");
		         		break;
				}
			}
		} else {
		System.out.println("error.");
		}
	}
	
}
}
