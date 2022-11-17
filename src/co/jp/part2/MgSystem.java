package co.jp.part2;

import java.util.Scanner;

public class MgSystem {
	static Scanner sc = new Scanner(System.in);
	static PetHotel myPetHotel = new PetHotel();
	public static void main(String[] args) {
		
		
	
//		PetHotel pethotel= new PetHotel();
		while(true) {
         System.out.println("Pleas give instruction,0:check the room, 1:order,2:cancel,3:checkin,4:checkout,5:1feed");
         //
         int instruction = sc.nextInt();
         switch(instruction) {
            case 0:
            	
            	myPetHotel.print();
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
	}
	
}
