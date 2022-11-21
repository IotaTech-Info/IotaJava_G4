package co.jp.PetHotel;

import java.util.Scanner;

public class Presentation {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String id = null;
		Hotel h = new Hotel();
		
		
		//Checkin and Checkout
		for(;;) {
			System.out.println("Welcom to PetHotel!\n");
			h.print();
			System.out.println("");
			
			System.out.println("please input Checkin or Checkout");
			String order = s.next();
			if("Checkin".equals(order)) {
				System.out.println("Which rooms do you prefer");
				id = s.next();
				h.checkIn(id);
				h.print();
				
				String pet_name;
				String ownername;
				String petType;
				String foodType;
				String Service;
				
				//Input pet name
				for(;;) {
					System.out.println("");
					System.out.println("please input your pet name");
					pet_name = s.next();
					System.out.println("It's 「" + pet_name + "」,Am I right?" + " Y/N");
					String order_1 = s.next();
					if("Y".equals(order_1)) {
						break;
					}
					else if("N".equals(order_1)) {
						System.out.println("I'm sorry.I fuck up.Please try again.");
						continue;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
				}
				
				//Input owner's name
				for(;;) {
					System.out.println("please input owner's name");
					ownername = s.next();
					System.out.println("It's 「" + ownername + "」,Am I right?" + " Y/N");
					String order_2 = s.next();
					if("Y".equals(order_2)) {
						break;
					}
					else if("N".equals(order_2)) {
						System.out.println("I'm sorry.I fuck up.Please try again.");
						continue;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
				}
				
				//Pet Type
				for(;;) {
							
					System.out.println("please input pet type" + " " + "(1,Dog 2,Cat 3,Bird)");
					petType = s.next();
					switch(petType) {
						case "1":
							petType = "Dog";
							break;
						case "2":
							petType = "Cat";
							break;
						case "3":
							petType = "Bird";
							break;
						default:
							System.out.println("System broke down.please try again.");
							continue;		
					}	
					
					
					System.out.println("It's 「" + petType + "」,Am I right?" + " Y/N");
					String order_3 = s.next();
					if("Y".equals(order_3)) {
						break;
					}
					else if("N".equals(order_3)) {
						System.out.println("I'm sorry.I fuck up.Please try again.");
						continue;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
				}
				
				//FoodType
				for(;;) {
					
					System.out.println("Do you want any pet food? Y/N");
					foodType = s.next();
					
					if("Y".equals(foodType)) {
						break;
					}
					else if("N".equals(foodType)) {
						break;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
				}
				
				//Service
				for(;;) {
					
					System.out.println("Do you want any extra service Y/N");
					Service = s.next();
					
					if("Y".equals(Service)) {
						break;
					}
					else if("N".equals(Service)) {
						break;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
					
				}
				
				//Room information output
				System.out.print("Thank you for your order.\n");
				System.out.println("Here is your room information.\n");
				System.out.println("------INFO-------\n");
				
				if("Dog".equals(petType) || "Cat".equals(petType) || "Bird".equals(petType)) {
					
					Pet pet = new Pet(pet_name,petType,ownername);
					
					if("Y".equals(foodType) && "Y".equals(Service)) {
						System.out.println("Room number: "+ id);
						System.out.println("Pet Name: " + pet.getName());
						System.out.println("Owner's Name: " +  pet.getOwnerName());
						System.out.println("Pet Type: " + pet.getType());
						System.out.println("Food: Yes");
						System.out.println("extra service: Yes.\n");
					}else if("Y".equals(foodType) && "N".equals(Service)) {
						System.out.println("Room number: "+ id);
						System.out.println("Pet Name: " + pet.getName());
						System.out.println("Owner's Name: " + pet.getOwnerName());
						System.out.println("Pet Type: " + pet.getType());
						System.out.println("Food: Yes");
						System.out.println("extra service: No\n");
					}else if("N".equals(foodType) && "Y".equals(Service)) {
						System.out.println("Room number: "+ id);
						System.out.println("Pet Name: " + pet.getName());
						System.out.println("Owner's Name: " + pet.getOwnerName());
						System.out.println("Pet Type: " + pet.getType());
						System.out.println("Food: No");
						System.out.println("extra service: Yes\n");
					}else if("N".equals(foodType) && "N".equals(Service)) {
						System.out.println("Room number: "+ id);
						System.out.println("Pet Name: " + pet.getName());
						System.out.println("Owner's Name: " + pet.getOwnerName());
						System.out.println("Pet Type: " + pet.getType());
						System.out.println("Food: No");
						System.out.println("extra service: No\n");
					}
				}
				System.out.println("------INFO-------\n");
				
				//Room status
				System.out.println("Would you like to check your pet status? "+"Y/N");
				String status = s.next();
				for(;;) {
					if("Y".equals(status)) {
						System.out.println("------STATUS-------\n");

						MOOD mood_1 = MOOD.SATISFIED;
						MOOD mood_2 = MOOD.FUN;
						MOOD mood_3 = MOOD.BORING;
						MOOD mood_4 = MOOD.STARVING;
						switch(petType) {
							case "Dog":
								Dog dog = new Dog(pet_name,petType,ownername);
								FOOD foodtype_1 = FOOD.DOD_FOOD;
								
								if("Y".equals(foodType) && "Y".equals(Service)) {
									
									System.out.println(pet_name + foodtype_1.getFoodType());
									dog.run();
									System.out.println(pet_name + mood_1.getMood());	
									dog.speck();
									
								}else if("Y".equals(foodType) && "N".equals(Service)) {
									
									System.out.println(pet_name + foodtype_1.getFoodType());
									dog.run();
									System.out.println("But!" + pet_name + mood_3.getMood());
									
								}else if("N".equals(foodType) && "Y".equals(Service)){
									
									System.out.println(pet_name + mood_2.getMood());
									dog.speck();
									System.out.println("But!" + pet_name + mood_4.getMood());
									
								}else if("N".equals(foodType) && "N".equals(Service)){
									
									System.out.println( pet_name + mood_4.getMood()+ " and" + mood_3.getMood());
								}
								break;
							
							case "Cat":
								Cat cat = new Cat(pet_name,petType,ownername);
								FOOD foodtype_2 = FOOD.CAT_FOOD;
								if("Y".equals(foodType) && "Y".equals(Service)) {
									
									System.out.println(pet_name + foodtype_2.getFoodType());
									cat.dance();
									System.out.println(pet_name + mood_1.getMood());	
									cat.speck();
									
								}else if("Y".equals(foodType) && "N".equals(Service)) {
									
									System.out.println(pet_name + foodtype_2.getFoodType());
									cat.dance();
									System.out.println("But!" + pet_name + mood_3.getMood());
									
								}else if("N".equals(foodType) && "Y".equals(Service)){
									
									System.out.println(pet_name + mood_2.getMood());
									cat.speck();
									System.out.println("But!" + pet_name + mood_4.getMood());
									
								}else if("N".equals(foodType) && "N".equals(Service)){
									
									System.out.println( pet_name + mood_4.getMood()+ " and" + mood_3.getMood());
								}
								break;
								
							case "Bird":
								Bird bird = new Bird(pet_name,petType,ownername);
								FOOD foodtype_3 = FOOD.BIRD_FOOD;
								if("Y".equals(foodType) && "Y".equals(Service)) {
									
									System.out.println(pet_name + foodtype_3.getFoodType());
									bird.fly();
									System.out.println(pet_name + mood_1.getMood());	
									bird.speck();
									
								}else if("Y".equals(foodType) && "N".equals(Service)) {
									
									System.out.println(pet_name + foodtype_3.getFoodType());
									bird.fly();
									System.out.println("But!" + pet_name + mood_3.getMood());
									
								}else if("N".equals(foodType) && "Y".equals(Service)){
									
									System.out.println(pet_name + mood_2.getMood());
									bird.speck();
									System.out.println("But!" + pet_name + mood_4.getMood());
									
								}else if("N".equals(foodType) && "N".equals(Service)){
									
									System.out.println(pet_name + mood_4.getMood()+ " and" + mood_3.getMood());
								}
								break;
						}
						System.out.println("");
						System.out.println("------STATUS-------\n");
						break;
					}else if("N".equals(status)) {
						break;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
				}
				
				//恶贯满盈
				for(;;) {
					System.out.println("You really don't need both pet food and extra sevice? "+"Y/N(If you already have both,please input N.)");
					String order_4 = s.next();
					if("Y".equals(order_4)) {
							
							if("Y".equals(foodType) && "Y".equals(Service)) {
								
								System.out.println("Thank you for chosing our hotel,have a nice day.\n");
								break;
								
							}else if("Y".equals(foodType) && "N".equals(Service)) {
								
								System.out.println(pet_name + " is depressed, we've sent him to a mental hospital.\n");
								System.out.println("Automatic check-out is on.\n");
								h.checkOut(id);
								System.out.println("See you around.\n");
								break;
								
							}else if("N".equals(foodType) && "Y".equals(Service)){
								
								System.out.println(pet_name + " is fainted from hunger, we've sent him to a restaurant.\n");
								System.out.println("Automatic check-out is on.\n");
								h.checkOut(id);
								System.out.println("See you around.\n");
								break;
								
							}else if("N".equals(foodType) && "N".equals(Service)){
								System.out.println(pet_name + " is dying, we've sent him to a hospital.\n");
								System.out.println("Automatic check-out is on.\n");
								h.checkOut(id);
								System.out.println("See you around.\n");
								break;
							}	
					}else if("N".equals(order_4)) {
						System.out.println("");
						System.out.println("And here is your pet's new status.\n");
						System.out.println("------STATUS-------\n");
						MOOD mood_1 = MOOD.SATISFIED;
						
						switch(petType) {
							case "Dog":
								Dog dog = new Dog(pet_name,petType,ownername);
								FOOD foodtype_1 = FOOD.DOD_FOOD;
								System.out.println(pet_name + foodtype_1.getFoodType());
								dog.run();
								System.out.println(pet_name + mood_1.getMood());	
								dog.speck();
								break;
									
							case "Cat":
								Cat cat = new Cat(pet_name,petType,ownername);
								FOOD foodtype_2 = FOOD.CAT_FOOD;
								System.out.println(pet_name + foodtype_2.getFoodType());
								cat.dance();
								System.out.println(pet_name + mood_1.getMood());	
								cat.speck();
								break;
									
							case "Bird":
								Bird bird = new Bird(pet_name,petType,ownername);
								FOOD foodtype_3 = FOOD.BIRD_FOOD;
								System.out.println(pet_name + foodtype_3.getFoodType());
								bird.fly();
								System.out.println(pet_name + mood_1.getMood());	
								bird.speck();
								break;
						}
						System.out.println("");
						System.out.println("------STATUS-------\n");
						System.out.println("Thank you for your ordering,have a nice day.\n");
						break;
					}else {
						System.out.println("System broke down.please try again.");
						continue;
					}
				}	
				continue;
			}
			else if("Checkout".equals(order)) {
				System.out.println("Please enter your room number.\n");
				id = s.next();
				h.checkOut(id);
				System.out.println("Thank you for chosing our hotel,have a nice day.\n");
				continue;
			}else {
				System.out.println("System broke down.please try again.\n");
				continue;
			}
			
		}
	}

}
