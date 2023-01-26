package co.jp.part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import co.jp.presentation.Hotel;

public class AnimalHotelTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("----- 実行開始 -----");

		File file = new File("hotelDate");
		System.out.println("文件所在位置：" + file.getAbsolutePath());

		// 检测是否有同名文件存在
		if (file.exists()) {
			System.out.println("文件已存在！有覆盖数据风险");
			System.exit(0);
		}

		PrintWriter output = new PrintWriter(file);

		Hotel h = new Hotel();

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);

		Dog dog = new Dog(null, null, 0);
		Cat cat = new Cat(null, null, 0);
		Bird bird = new Bird(null, null, 0);

		// 日期时间
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		String dateString_1 = simpleDateFormat.format(new Date());
		Date d = new Date();
		Calendar c = Calendar.getInstance();

		// 数据收集(房间号,个人信息)
		Map<Integer, String> data = new TreeMap<>();

		for (;;) {
			System.out.println("現在の時間は：" + dateString_1);
			System.out.println(
					"===========動物ホテルへようこそ============\n1:部屋の空室状態\n 2:チェックイン機能（餌やり機能）\n 3:チェックアウト機能\n 4:部屋に住んでいる動物数とペット情報の表示\n 5:退出");
			System.out.println("番号を入力してください。");
			int input_num = sc1.nextInt();
			// 機能1:部屋の空室状態
			if (input_num == 1) {
				// 显示全部房间状态
				h.check();
				// 显示空房数
				h.empty();

				continue;
			}

			// 機能2:チェックイン機能
			else if (input_num == 2) {
				// 時間
				String dateString_2 = simpleDateFormat.format(new Date());

				System.out.println("ペットの情報を入力してください。形式:名前,年齢,タイプ（例：はな,13,DOG （タイプは：大文字の英単語、ひらがな、漢字、いずれも対応可能）");
				String input_data = sc3.nextLine();

				// 形式 名前,年齢,タイプ（DOG ,CAT,BIRDいずれかを入力してください。） 例えば：はな,13,DOG
				String[] input_array = input_data.split(",");

				// エラーチェック
				if (input_array.length < 3) {
					System.out.println("入力された内容は形式不正のため、異常終了");
					continue;
				}
				try {

					String name = input_array[0];
					int age = Integer.valueOf(input_array[1]);
					String type = input_array[2];

					if (age < 0) {
						throw new RuntimeException();
					}

					// 利用枚举，识别中日英三种type的写法
					String dog_eg = Type.DOG.getValue_eg();
					String dog_kanji = Type.DOG.getValue_kanji();
					String dog_kana = Type.DOG.getValue_kana();

					String cat_eg = Type.CAT.getValue_eg();
					String cat_kanji = Type.CAT.getValue_kanji();
					String cat_kana = Type.CAT.getValue_kana();

					String bird_eg = Type.BIRD.getValue_eg();
					String bird_kanji = Type.BIRD.getValue_kanji();
					String bird_kana = Type.BIRD.getValue_kana();

					// エラーチェック

					if (!"".equals(name) && age >= 0 && !"".equals(type)) {

						// 宠物类型为狗的情况
						if (type.equals(dog_eg) || type.equals(dog_kanji) || type.equals(dog_kana)) {
							dog.setType("犬");
							dog.setName(name);
							dog.setAge(age);
							System.out.println("101-105の部屋にチェックインしてください。");
							System.out.println("部屋番号を入力してください。");
							String roomId = sc2.next();
							int id = Integer.valueOf(roomId);

							// 判断输入房间号是否在对应宠物种类的房间范围内
							if (id >= 101 && id <= 105) {
								// 判断房间是否被占用
								if (data.get(id) != null && data.get(id) != "") {
									System.out.println("部屋は占用されているため、やり直してください！");
									continue;
								}
								h.order(roomId);
								System.out.println("入力した文字は:" + name + "," + age + "," + type);
								System.out.println(
										"ペットの情報は：名前：" + name + " 年齢：" + age + "　タイプ: " + type + " 入住房间号:" + roomId);

								// 退房时间的输入
								System.out.println("宿泊時間（日数)を入力してください。");
								int stayTime = sc1.nextInt();
								c.add(Calendar.DATE, stayTime);
								Date stayTimePlus = c.getTime();
								String stayTimePlus_str = simpleDateFormat.format(stayTimePlus);
								System.out.println("请在" + stayTimePlus_str + "之前退房");

								System.out.println("チェックイン完了しました。");

								// 利用treehmap收集信息
								data.put(id, "名前：" + name + " タイプ：" + type + " 年齢:" + input_array[1] + " 入住时间:"
										+ dateString_2);
								output.println(data.get(id) + "!!!请在" + stayTimePlus_str + "之前退房!!!");
							} else {
								System.out.println("入力された部屋番号はDOGの部屋番号ではない、あるいは範囲外のため、最初からやり直してください！");
								continue;
							}
						}

						// 宠物类型为猫的情况
						if (type.equals(cat_eg) || type.equals(cat_kanji) || type.equals(cat_kana)) {
							cat.setType("猫");
							cat.setName(name);
							cat.setAge(age);
							System.out.println("201-205の部屋にチェックインしてください。");
							System.out.println("部屋番号を入力してください。");
							String roomId = sc2.next();
							int id = Integer.valueOf(roomId);

							// 判断输入房间号是否在对应宠物种类的房间范围内
							if (id >= 201 && id <= 205) {
								// 判断房间是否被占用
								if (data.get(id) != null && data.get(id) != "") {
									System.out.println("部屋は占用されているため、やり直してください！");
									continue;
								}

								h.order(roomId);

								System.out.println("入力した文字は:" + name + "," + age + "," + type);
								System.out.println(
										"ペットの情報は：名前：" + name + " 年齢：" + age + "　タイプ: " + type + " 入住房间号:" + roomId);
								// 退房时间
								System.out.println("宿泊時間を入力してください。");
								int stayTime = sc1.nextInt();
								c.add(Calendar.DATE, stayTime);
								Date stayTimePlus = c.getTime();
								String stayTimePlus_str = simpleDateFormat.format(stayTimePlus);
								System.out.println("请在" + stayTimePlus_str + "之前退房");

								System.out.println("チェックイン完了しました。");

								// 利用treehmap收集信息
								data.put(id, "名前：" + name + " タイプ：" + type + " 年齢:" + input_array[1] + " 入住时间:"
										+ dateString_2);
								output.println(data.get(id) + "!!!请在" + stayTimePlus_str + "之前退房!!!");

							} else {
								System.out.println("入力された部屋番号はCATの部屋番号ではない、あるいは範囲外のため、最初からやり直してください！");
								continue;
							}
						}

						// 宠物类型为鸟的情况
						if (type.equals(bird_eg) || type.equals(bird_kanji) || type.equals(bird_kana)) {
							bird.setType("鳥");
							bird.setName(name);
							bird.setAge(age);
							System.out.println("301-305の部屋にチェックインしてください。");
							System.out.println("部屋番号を入力してください。");
							String roomId = sc2.next();
							int id = Integer.valueOf(roomId);

							// 判断输入房间号是否在对应宠物种类的房间范围内
							if (id >= 301 && id <= 305) {
								// 判断房间是否被占用
								if (data.get(id) != null && data.get(id) != "") {
									System.out.println("部屋は占用されているため、やり直してください！");
									continue;
								}

								h.order(roomId);

								System.out.println("入力した文字は:" + name + "," + age + "," + type);
								System.out.println(
										"ペットの情報は：名前：" + name + " 年齢：" + age + "　タイプ: " + type + " 入住房间号:" + roomId);

								// 退房时间
								System.out.println("宿泊時間を入力してください。");
								int stayTime = sc1.nextInt();
								c.add(Calendar.DATE, stayTime);
								Date stayTimePlus = c.getTime();
								String stayTimePlus_str = simpleDateFormat.format(stayTimePlus);
								System.out.println("!!!请在" + stayTimePlus_str + "之前退房!!!");

								System.out.println("チェックイン完了しました。");

								// 利用treehmap收集信息
								data.put(id, "名前：" + name + " タイプ：" + type + " 年齢:" + input_array[1] + " 入住时间:"
										+ dateString_2);
								output.println(data.get(id) + "!!!请在" + stayTimePlus_str + "之前退房!!!");

							} else {
								System.out.println("入力された部屋番号はBIRDの部屋番号ではない、あるいは範囲外のため、最初からやり直してください！");
								continue;
							}
						}
					}

					// サブ機能：餌やり機能
					System.out.println("ペットに餌をあげますか？(はい・いいえ)");
					String eat = sc4.nextLine();
					if ("はい".equals(eat)) {
						if ("CAT".equals(type)) {

							cat.eat();
						}
						if ("DOG".equals(type)) {

							dog.eat();
						}
						if ("BIRD".equals(type)) {

							bird.eat();
						}
					}
					if ("いいえ".equals(eat)) {
						continue;
					}
				} catch (RuntimeException e) {
					System.out.println("年龄不可小于0！请重新输入！");
				}

			}
			// 機能3:チェックアウト機能
			else if (input_num == 3) {
				System.out.println("部屋番号を入力してください。");
				String roomId = sc5.nextLine();
				h.checkOut(roomId);
				System.out.println("チェックアウト完了しました。");

				// hashtree，记录退房数据
				int id = Integer.valueOf(roomId);
				String dateString_3 = simpleDateFormat.format(new Date());

				// 更新treemap信息，然后将退房房间信息转换为字符串，然后添加到List当中，作为数据保存
				String data2 = data.get(id) + "退室時間：" + dateString_3;
				System.out.println(data2);
				List<String> data3 = new ArrayList<>();
				data3.add(data2);

				// 写入文件
				for (int i = 0; i < data3.size(); i++) {
					output.println(data3.get(i));
				}

				data.remove(id);

			}

			// 機能4:部屋に住んでいる動物数とペット情報の表示
			if (input_num == 4) {
				h.sum();

				// 显示目前入住客人信息
				System.out.println("現時点で住んでいるペットの情報：");
				for (Entry<Integer, String> entry : data.entrySet()) {
					System.out.println("房间号:" + entry.getKey() + " 房客信息：" + entry.getValue() + " ");
				}
			}

			// 機能5:退出"
			if (input_num == 5) {
				h.sum();
				h.empty();

				System.out.println("データの書き込みが完了！");
				// 关闭文件
				output.close();
				System.out.println("");
				System.out.println("ありがとうございました。");

				System.out.println("----- ループ終了 -----");
				break;
			}
			//如果输入的启动功能的数字在1～5之外，则重新开始
			if (input_num > 5 || input_num < 1) {
				System.out.println("入力された番号に誤りがありますので、やり直してください！");
				continue;
			}
		}

	}

}
