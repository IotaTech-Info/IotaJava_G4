package part2;

import java.util.Scanner;

public class Hotel {
	
	public static void main(String[] args) {

		System.out.println("----- welcome！ -----");

		String[][] hotelRoom = new String[3][8];

		int count = 0;

		Dog myDog = new Dog();
		Cat myCat = new Cat();
		Fish myFish = new Fish();

		Scanner sc_1 = new Scanner(System.in);
		Scanner sc_2 = new Scanner(System.in);
		Scanner sc_3 = new Scanner(System.in);

		for (;;) {
			System.out.println(
					"Enter 1 for Empty room check and check in ,2 for Feed, 3 for Sort, 4 for Service, 5 for Check out，6 for Exit");
			String input_num = sc_1.nextLine();
			
			
			

			if (input_num.equals("1")) {                                               // 空き部屋チェック
				System.out.println("Empty Roon Check Programm");

				System.out.println("Empty Room Number is:");
				for (int i = 0; i < hotelRoom.length; i++) {
					for (int j = 0; j < hotelRoom[i].length; j++) {

						if (hotelRoom[i][j] == null) {
							count++;
							System.out.print(String.valueOf(i + 1) + "0" + String.valueOf(j + 1) + " ");
						} else {
							System.out.print("PET ");
						}
					}
					System.out.println();
				}
				if (count != 0) {
					System.out.println("There are " + count + " rooms left.");
				} else if (count == 0) {
					System.out.println("Sorry,there is no empty room.");
					continue;
				}
				count = 0;

				System.out.println("Check in ?(yes/no); exit for Exit:");                        // check in
				String input_str = sc_2.next();

				if (input_str.equals("yes")) {
					System.out.println("Check In Programm");
					System.out.println("Please enter Pet's Name(example:'snoopy'):");
					String name = sc_1.next();
					System.out.println("Please enter Pet's age(example:'2'):");
					int age = sc_3.nextInt();
					System.out.println("Please enter Pet's type(example:'DOG'):");
					String type = sc_2.next();
					

					if (type.equals("DOG")) {
						myDog.type = "DOG";
						myDog.name = name;
						myDog.age = age;
						
					}

					if (type.equals("CAT")) {
						myCat.type = "CAT";
						myCat.name = name;
						myCat.age = age;
						
					}

					if (type.equals("FISH")) {
						myFish.type = "FISH";
						myFish.name = name;
						myFish.age = age;
					
					}

					System.out.println("Please choose an empty room(101~308):");
					String input_num_2 = sc_2.next();
					String[] input_array = input_num_2.split("");
					hotelRoom[Integer.valueOf(input_array[0]) - 1][Integer.valueOf(input_array[2]) - 1] = "Name:" + name
							+ " " + "Age:" + age + " " + "Type:" + type;

					System.out.println("Check in infomations:" + "Room" + " " + input_num_2 + " "
							+ hotelRoom[Integer.valueOf(input_array[0]) - 1][Integer.valueOf(input_array[2]) - 1]);
					
					System.out.println("Check in finshed.");

				} else if (input_str.equals("no")) {
					continue;
				} else if(input_str.equals("exit")){
					break;
				}

			} else if (input_num.equals("2")) {                                                // feed
				System.out.println("Feed Program");
				System.out.println("Please enter your Pet's room number:");
				String input_num_3 = sc_2.next();
				String[] input_array_2 = input_num_3.split("");

				System.out.println("Please confirm your Pet's infomations:");
				System.out.println(
						hotelRoom[Integer.valueOf(input_array_2[0]) - 1][Integer.valueOf(input_array_2[2]) - 1]);
				System.out.println("Pet's informations are correct?(yes/no):");
				String input_str_1 = sc_1.next();
				if (input_str_1.equals("yes")) {
					System.out.println("Feed your pet?(yes/no); exit for Exit:");
					String input_str_2 = sc_2.next();

					if (input_str_2.equals("yes")) {
						System.out.println("Please enter the pet type for feeding machine(DOG/CAT/FISH):");
						String input_type = sc_1.next();
						if (input_type.equals("DOG")) {
							System.out.println("Choose a food for you pet(DF.No.1/DF.No.2/DF.No.3):");
							String input_food_dog = sc_1.next();
							myDog.setDogFood(input_food_dog);                          
							myDog.feed(myDog.getDogFood());                               
						} else if (input_type.equals("CAT")) {
							System.out.println("Choose a food for you pet(CF.No.1/CF.No.2/CF.No.3):");
							String input_food_cat = sc_1.next();
							myCat.setCatFood(input_food_cat);
							myCat.feed(myCat.getCatFood());
						} else if (input_type.equals("FISH")) {
							System.out.println("Choose a food for you pet(BF.No.1/BF.No.2/BF.No.3):");
							String input_food_bird = sc_1.next();
							myFish.setFishFood(input_food_bird);
							myFish.feed(myFish.getFishFood());
						}

					} else if(input_str_2.equals("no")){
						System.out.println("No feeding");
						continue;
					}else if(input_str_2.equals("exit")) {
						break;
					}
				} else if (input_str_1.equals("no")) {
					System.out.println("Please call the manager for more help!");
					break;
				} else {
					System.out.println("Input ERROR!");
					continue;
				}

			} else if (input_num.equals("3")) {                                                    //sort
				System.out.println("Sort Programm");                                        

				String type_etc_cat = Type.CAT.getEtc();
				String type_kanji_cat = Type.CAT.getKanji();
				String type_kana_cat = Type.CAT.getKana();

				String type_etc_dog = Type.DOG.getEtc();
				String type_kanji_dog = Type.DOG.getKanji();
				String type_kana_dog = Type.DOG.getKana();

				String type_etc_fish = Type.FISH.getEtc();
				String type_kanji_fish = Type.FISH.getKanji();
				String type_kana_fish = Type.FISH.getKana();

				System.out.println("Sort the cats:(Enter Cat/猫/ねこ):");
				String input_sort_cat = sc_2.next();
				System.out.println("Pet cats are:");
				if (input_sort_cat.equals(type_etc_cat) || input_sort_cat.equals(type_kanji_cat)
						|| input_sort_cat.equals(type_kana_cat)) {
					for (int i = 0; i < hotelRoom.length; i++) {
						for (int j = 0; j < hotelRoom[i].length; j++) {
							if (hotelRoom[i][j] != null) {
								boolean flag = hotelRoom[i][j].contains("CAT");
								if (flag) {
									System.out.println("Room:" + String.valueOf(i + 1) + "0" + String.valueOf(j + 1)
											+ " " + hotelRoom[i][j]);
								}
							}
						}
					}
				}

				System.out.println("Sort the dog:(Enter Dog/犬/いぬ):");
				String input_sort_dog = sc_2.next();
				System.out.println("Pet dogs are:");
				if (input_sort_dog.equals(type_etc_dog) || input_sort_dog.equals(type_kanji_dog)
						|| input_sort_dog.equals(type_kana_dog)) {
					for (int i = 0; i < hotelRoom.length; i++) {
						for (int j = 0; j < hotelRoom[i].length; j++) {
							if (hotelRoom[i][j] != null) {
								boolean flag = hotelRoom[i][j].contains("DOG");
								if (flag) {
									System.out.println("Room:" + String.valueOf(i + 1) + "0" + String.valueOf(j + 1)
											+ " " + hotelRoom[i][j]);
								}
							}
						}
					}
				}

				System.out.println("Sort the fish:(Enter Fish/魚/さかな):");
				String input_sort_bird = sc_2.next();
				System.out.println("Pet fishs are:");
				if (input_sort_bird.equals(type_etc_fish) || input_sort_bird.equals(type_kanji_fish)
						|| input_sort_bird.equals(type_kana_fish)) {
					for (int i = 0; i < hotelRoom.length; i++) {
						for (int j = 0; j < hotelRoom[i].length; j++) {
							if (hotelRoom[i][j] != null) {
								boolean flag = hotelRoom[i][j].contains("FISH");
								if (flag) {
									System.out.println("Room:" + String.valueOf(i + 1) + "0" + String.valueOf(j + 1)
											+ " " + hotelRoom[i][j]);
								}
							}
						}
					}
				}

			} else if (input_num.equals("4")) {                                                //サービス
																						
				System.out.println("Service Programm");
				System.out.println("Please your pet's name and type(Example snoopy/DOG):");
				String input_str_3 = sc_2.next();
				String[] input_array_3 = input_str_3.split("/");

				for (;;) {
					if (input_array_3[1].equals("DOG")) {                                
						System.out.println("Choose a Service for your dog(toy/clean); enter exit for Exit:");
						myDog.name = input_array_3[0];
						String input_enter_dog = sc_2.next();

						if (input_enter_dog.equals("toy")) {
							Dog dogToy = new Dog();
							dogToy.toy(myDog.name);
						} else if (input_enter_dog.equals("clean")) {
							Dog dogClean = new Dog();
							dogClean.clean(myDog.name);
						} else if (input_enter_dog.equals("exit")) {
							break;
						}

					} else if (input_array_3[1].equals("CAT")) {                             
						System.out.println("Choose a Service for your cat(toy/clean); enter exit for Exit:");
						myCat.name = input_array_3[0];
						String input_enter_cat = sc_2.next();

						if (input_enter_cat.equals("toy")) {
							Cat catToy = new Cat();
							catToy.toy(myCat.name);
						} else if (input_enter_cat.equals("clean")) {
							Cat catSleep = new Cat();
							catSleep.clean(myCat.name);
						} else if (input_enter_cat.equals("exit")) {
							break;
						}

					} else if (input_array_3[1].equals("FISH")) {							
						System.out.println("Choose a Service for your fish(swim/clean); enter exit for Exit:");
						myFish.name = input_array_3[0];
						String input_enter_fish = sc_2.next();

						if (input_enter_fish.equals("swim")) {
							Fish fishSwim = new Fish();
							fishSwim.swim(myFish.name);
						} else if (input_enter_fish.equals("clean")) {
							Fish fishClean = new Fish();
							fishClean.clean(myCat.name);
						} else if (input_enter_fish.equals("exit")) {
							break;
						}
					}
				}

			} else if (input_num.equals("5")) {													// check out
				System.out.println("Check Out Programm");
				System.out.println("Please enter your Pet's room number:");
				String input_num_4 = sc_2.next();
				String[] input_array_4 = input_num_4.split("");

				System.out.println("Please confirm your Pet's infomations:");
				System.out.println(
						hotelRoom[Integer.valueOf(input_array_4[0]) - 1][Integer.valueOf(input_array_4[2]) - 1]);

				System.out.println("Pet's informations are correct?(yes/no):");
				String input_str_4 = sc_3.next();
				if (input_str_4.equals("yes")) {
					hotelRoom[Integer.valueOf(input_array_4[0]) - 1][Integer.valueOf(input_array_4[2]) - 1] = null;
					System.out.println("Check out finished.");
				} else if (input_str_4.equals("no")) {
					System.out.println("Please call the manager for more help!");
					break;
				} else {
					System.out.println("Input ERROR!");
					continue;
				}
			}else if (input_num.equals("6")) {
				break;			
			} else {
				System.out.println("Input ERROR!");
				continue;
			}
		}

	
}
}
