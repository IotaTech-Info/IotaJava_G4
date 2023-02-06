package co.jp.Part3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class petHotel_2 {

	public static void main(String[] args) {

		System.out.println("----- いらっしゃいませ！ -----");

		String[][] hotelRoom = new String[3][8];

		int count = 0;
		Float age = 0.0f;
		String roomNum_in;
		String roomNum_out;

		Dog myDog = new Dog();
		Cat myCat = new Cat();
		Bird myBird = new Bird();

		Scanner sc_1 = new Scanner(System.in);
		Scanner sc_2 = new Scanner(System.in);
		Scanner sc_3 = new Scanner(System.in);

		File CheckinInfomation_file = new File("F:\\Iotaworkspace_g4\\test\\checkin_Information.txt");
		File CheckoutInfomation_file = new File("F:\\Iotaworkspace_g4\\test\\checkout_Information.txt");

		for (;;) {
			System.out.println(
					"Enter 1 for Empty room check and check in ,2 for Feed, 3 for Sort, 4 for Entertainment, 5 for Check out，6 for Exit");
			int input_num = sc_1.nextInt();

			if (input_num == 1) { // 空房间检测
				System.out.println("-----Empty Room Check Programm-----");

				System.out.println("Empty Room Number is:");
				for (int i = 0; i < hotelRoom.length; i++) {
					for (int j = 0; j < hotelRoom[i].length; j++) {

						if (hotelRoom[i][j] == null) {
							count++;
							System.out.print(String.valueOf(i + 1) + "0" + String.valueOf(j + 1) + " ");
						} else {
							System.out.print("    ");
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

				System.out.println("Check in ?(yes/no); exit for Exit:"); // 入住check in
				String input_str = sc_2.nextLine();

				if (input_str.equals("yes")) {
					System.out.println("-----Check In Programm-----");
					System.out.println("Please enter Pet's Name(example:'snoopy'):");
					String name = sc_2.nextLine();
					System.out.println("Please enter Pet's age(example:'2.5'):");
					while (true) { // 抓取年龄输入异常
						try {
							age = getAge();
							if (!age.getClass().toString().equals("class java.lang.Float")) {
								throw new InputMismatchException();
							} else if (age <= 0) {
								throw new IOException();
							} else {
								break;
							}
						} catch (IOException | InputMismatchException e) {
							System.out.println("Type of age Error, Please enter again(example:'2.5'):");
						}
					}
					System.out.println("Please enter Pet's type(example:'DOG'):");
					String type = sc_2.nextLine();
					System.out.println("Please sign your name:");
					String owner_name_in = sc_2.nextLine();

					if (type.toUpperCase().equals("DOG")) {
						myDog.type = "DOG";
						myDog.name = name;
						myDog.age = age;
						myDog.setOwner_name(owner_name_in);
					}

					if (type.toUpperCase().equals("CAT")) {
						myCat.type = "CAT";
						myCat.name = name;
						myCat.age = age;
						myCat.setOwner_name(owner_name_in);
					}

					if (type.toUpperCase().equals("BIRD")) {
						myBird.type = "BIRD";
						myBird.name = name;
						myBird.age = age;
						myBird.setOwner_name(owner_name_in);
					}

					System.out.println("Please choose an empty room(101~308):");
					while (true) {// 抓取房间下标越界异常
						try {
							roomNum_in = getRoom_in();
							String[] room_arr_in = roomNum_in.split("");
							if (Integer.valueOf(room_arr_in[0]) > 3 || Integer.valueOf(room_arr_in[2]) > 8) {
								throw new ArrayIndexOutOfBoundsException();
							} else {
								break;
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("No such room number, Please enter again(101~308):");
						}
					}
					String[] input_array = roomNum_in.split("");
					String Type = type.toUpperCase();
					hotelRoom[Integer.valueOf(input_array[0]) - 1][Integer.valueOf(input_array[2]) - 1] = "Name:" + name
							+ " " + "Age:" + age + " " + "Type:" + Type;

					System.out.print("Check in informations:");
					List<String> checkin_infor_list = new ArrayList<String>();
					checkin_infor_list.add("Room:" + roomNum_in);
					checkin_infor_list
							.add(hotelRoom[Integer.valueOf(input_array[0]) - 1][Integer.valueOf(input_array[2]) - 1]);
					checkin_infor_list.add("Owner name:" + owner_name_in);
					System.out.println(checkin_infor_list);

					try {
						FileOutputStream checkin = new FileOutputStream(CheckinInfomation_file, true);
						BufferedWriter checkin_infor = new BufferedWriter(new OutputStreamWriter(checkin));

						for (String str : checkin_infor_list) {
							checkin_infor.write(str);
							checkin_infor.write("\r\n");
						}
						SimpleDateFormat checkin_dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
						checkin_infor.write("Check in time:" + checkin_dateFormat.format(System.currentTimeMillis()));
						checkin_infor.write("\r\n");
						checkin_infor.write("");
						checkin_infor.write("\r\n");

						checkin_infor.close();
						checkin.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					System.out.println("Check in finshed.");

				} else if (input_str.equals("no")) {
					continue;
				} else if (input_str.equals("exit")) {
					break;
				}

			} else if (input_num == 2) { // 喂食功能
				System.out.println("-----Feed Program-----");
				System.out.println("Please enter your Pet's room number:");
				String input_num_3 = sc_2.nextLine();
				String[] input_array_2 = input_num_3.split("");

				System.out.println("Please confirm your Pet's infomations:");
				System.out.println(
						hotelRoom[Integer.valueOf(input_array_2[0]) - 1][Integer.valueOf(input_array_2[2]) - 1]);
				System.out.println("Pet's informations are correct?(yes/no):");
				String input_str_1 = sc_1.nextLine();
				if (input_str_1.equals("yes")) {
					System.out.println("Feed your pet?(yes/no); exit for Exit:");
					String input_str_2 = sc_2.nextLine();

					if (input_str_2.equals("yes")) {
						System.out.println("Please enter the pet type for feeding machine(DOG/CAT/BIRD):");
						String input_type = sc_2.nextLine();
						if (input_type.equals("DOG")) {
							System.out.println("Choose a food for you pet(DF.No.1/DF.No.2/DF.No.3):");
							String input_food_dog = sc_2.nextLine();
							myDog.setDogFood(input_food_dog);
							myDog.eat(myDog.getDogFood()); // 利用子类Cat，Dog，Bird对父类Pet里eat方法重写后的重载
						} else if (input_type.equals("CAT")) {
							System.out.println("Choose a food for you pet(CF.No.1/CF.No.2/CF.No.3):");
							String input_food_cat = sc_2.nextLine();
							myCat.setCatFood(input_food_cat);
							myCat.eat(myCat.getCatFood());
						} else if (input_type.equals("BIRD")) {
							System.out.println("Choose a food for you pet(BF.No.1/BF.No.2/BF.No.3):");
							String input_food_bird = sc_2.nextLine();
							myBird.setBirdFood(input_food_bird);
							myBird.eat(myBird.getBirdFood());
						}

					} else if (input_str_2.equals("no")) {
						System.out.println("No feeding");
						continue;
					} else if (input_str_2.equals("exit")) {
						break;
					}
				} else if (input_str_1.equals("no")) {
					System.out.println("Please call the manager for more help!");
					break;
				} else {
					System.out.println("Input ERROR!");
					continue;
				}

			} else if (input_num == 3) { // 动物排序功能
				System.out.println("-----Sort Programm-----"); // 利用枚举，分别对猫，狗，鸟三种动物按照房间顺序排序

				String type_etc_cat = Type.CAT.getEtc();
				String type_kanji_cat = Type.CAT.getKanji();
				String type_kana_cat = Type.CAT.getKana();

				String type_etc_dog = Type.DOG.getEtc();
				String type_kanji_dog = Type.DOG.getKanji();
				String type_kana_dog = Type.DOG.getKana();

				String type_etc_bird = Type.BIRD.getEtc();
				String type_kanji_bird = Type.BIRD.getKanji();
				String type_kana_bird = Type.BIRD.getKana();

				System.out.println("Sort the cats:(Enter Cat/猫/ねこ):");
				String input_sort_cat = sc_2.nextLine();
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
				String input_sort_dog = sc_2.nextLine();
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

				System.out.println("Sort the bird:(Enter Bird/鳥/とり):");
				String input_sort_bird = sc_2.nextLine();
				System.out.println("Pet birds are:");
				if (input_sort_bird.equals(type_etc_bird) || input_sort_bird.equals(type_kanji_bird)
						|| input_sort_bird.equals(type_kana_bird)) {
					for (int i = 0; i < hotelRoom.length; i++) {
						for (int j = 0; j < hotelRoom[i].length; j++) {
							if (hotelRoom[i][j] != null) {
								boolean flag = hotelRoom[i][j].contains("BIRD");
								if (flag) {
									System.out.println("Room:" + String.valueOf(i + 1) + "0" + String.valueOf(j + 1)
											+ " " + hotelRoom[i][j]);
								}
							}
						}
					}
				}

			} else if (input_num == 4) { // 娱乐功能

				System.out.println("-----Entertainment Programm-----");
				System.out.println("Please your pet's name and type(Example snoopy/DOG):");
				String input_str_3 = sc_2.nextLine();
				String[] input_array_3 = input_str_3.split("/");

				for (;;) {
					if (input_array_3[1].equals("DOG")) { // 子类Dog通过lambda表达式方法实现接口run和sleep
						System.out.println("Choose an Entertainment for your dog(run/sleep); enter exit for Exit:");
						myDog.name = input_array_3[0];
						String input_enter_dog = sc_2.nextLine();

						if (input_enter_dog.equals("run")) {
							Run dogRun = (dog_name) -> {
								System.out.println(dog_name + " is running !");
								for (int i = 0; i <= 10; i++) {
									System.out.println(i * 10 + "%");
									try {
										Thread.currentThread().sleep(1000);
									} catch (Exception e) {
										// TODO: handle exception
									}
								}
							};
							dogRun.run(myDog.name);
						} else if (input_enter_dog.equals("sleep")) {
							Sleep dogSleep = (dog_name) -> {
								System.out.println(dog_name + " is sleeping!");
								for (int i = 0; i <= 3; i++) {
									System.out.println(i * 10 + "分");
									try {
										Thread.currentThread().sleep(1000);
									} catch (Exception e) {
										// TODO: handle exception
									}
								}
							};
							dogSleep.sleep(myDog.name);
						} else if (input_enter_dog.equals("exit")) {
							break;
						}

					} else if (input_array_3[1].equals("CAT")) { // 子类Cat通过基础implements方法实现接口run和sleep
						System.out.println("Choose an Entertainment for your cat(run/sleep); enter exit for Exit:");
						myCat.name = input_array_3[0];
						String input_enter_cat = sc_2.nextLine();

						if (input_enter_cat.equals("run")) {
							Cat catRun = new Cat();
							catRun.run(myCat.name);
						} else if (input_enter_cat.equals("sleep")) {
							Cat catSleep = new Cat();
							catSleep.sleep(myCat.name);
						} else if (input_enter_cat.equals("exit")) {
							break;
						}

					} else if (input_array_3[1].equals("BIRD")) { // 子类Bird通过匿名class方法实现接口fly和sleep
						System.out.println("Choose an Entertainment for your bird(fly/sleep); enter exit for Exit:");
						myBird.name = input_array_3[0];
						String input_enter_bird = sc_2.nextLine();

						if (input_enter_bird.equals("fly")) {
							Fly birdFly = new Fly() {
								@Override
								public void fly(String name) {
									System.out.println(name + " is flying!");
									for (int i = 0; i <= 10; i++) {
										System.out.println(i * 10 + "%");
										try {
											Thread.currentThread().sleep(1000);
										} catch (Exception e) {
											// TODO: handle exception
										}
									}
								}
							};
							birdFly.fly(myBird.name);
						} else if (input_enter_bird.equals("sleep")) {
							Sleep birdFly = new Sleep() {
								@Override
								public void sleep(String name) {
									System.out.println(name + " is sleeping!");
									for (int i = 0; i <= 3; i++) {
										System.out.println(i * 10 + "分");
										try {
											Thread.currentThread().sleep(1000);
										} catch (Exception e) {
											// TODO: handle exception
										}
									}
								}
							};
							birdFly.sleep(myBird.name);
						} else if (input_enter_bird.equals("exit")) {
							break;
						}
					}
				}

			} else if (input_num == 5) { // check out功能
				System.out.println("-----Check Out Programm-----");
				System.out.println("Please enter your Pet's room number:");
				while (true) {
					try {
						roomNum_out = getRoom_out();
						String[] room_arr_out = roomNum_out.split("");
						if (Integer.valueOf(room_arr_out[0]) > 3 || Integer.valueOf(room_arr_out[2]) > 8) {
							throw new ArrayIndexOutOfBoundsException();
						} else {
							break;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("No such room number, Please enter again(101~308):");
					}
				}
				String[] input_array_4 = roomNum_out.split("");
				System.out.println("Please confirm your Pet's infomations:");
				System.out.println(
						hotelRoom[Integer.valueOf(input_array_4[0]) - 1][Integer.valueOf(input_array_4[2]) - 1]);
				System.out.println("Pet's informations are correct?(yes/no):");
				String input_str_4 = sc_2.nextLine();

				if (input_str_4.equals("yes")) {
					System.out.println("Please sign your name:");
					String owner_name_out = sc_2.nextLine();

					List<String> checkout_infor_list = new ArrayList<String>();
					checkout_infor_list.add("Room:" + roomNum_out);
					checkout_infor_list.add(
							hotelRoom[Integer.valueOf(input_array_4[0]) - 1][Integer.valueOf(input_array_4[2]) - 1]);
					checkout_infor_list.add("Owner name:" + owner_name_out);

					try {
						FileOutputStream checkout = new FileOutputStream(CheckoutInfomation_file, true);
						BufferedWriter checkout_infor = new BufferedWriter(new OutputStreamWriter(checkout));

						for (String str : checkout_infor_list) {
							checkout_infor.write(str);
							checkout_infor.write("\r\n");
						}
						SimpleDateFormat checkout_dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
						checkout_infor
								.write("Check out time:" + checkout_dateFormat.format(System.currentTimeMillis()));
						checkout_infor.write("\r\n");
						checkout_infor.write("");
						checkout_infor.write("\r\n");

						checkout_infor.close();
						checkout.close();

					} catch (IOException e) {
						e.printStackTrace();
					}

					hotelRoom[Integer.valueOf(input_array_4[0]) - 1][Integer.valueOf(input_array_4[2]) - 1] = null;
					System.out.println("Check out finished.");
				} else if (input_str_4.equals("no")) {
					System.out.println("Please call the manager for more help!");
					break;
				} else {
					System.out.println("Input ERROR!");
					continue;
				}
			} else if (input_num == 6) {
				break;
			} else {
				System.out.println("Input ERROR!");
				continue;
			}
		}

	}

	public static Float getAge() {
		Scanner sc_4 = new Scanner(System.in);
		Float Name = sc_4.nextFloat();
		return Name;
	}

	public static String getRoom_in() {
		Scanner sc_5 = new Scanner(System.in);
		String Room_in = sc_5.nextLine();
		return Room_in;
	}

	public static String getRoom_out() {
		Scanner sc_6 = new Scanner(System.in);
		String Room_out = sc_6.nextLine();
		return Room_out;
	}
}
