package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {
	final static int ROOMCOUNT = 5; //房间总数
	static int currentPetCount = 0;//宠物入住房间
	static Pet[] hotel = new Pet[ROOMCOUNT];//房间数组

	public static void main(String[] args) {

		System.out.println("----- 実行開始 -----");
		
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("-1:空スペース検索 2:予約 3:チェックイン 4:エサやりと運動 5:チェックアウト/予約キャンセル 6:exit退出-");
			String input = sc.nextLine().trim();//客户输入的菜单选项

			if ("6".equals(input)) {
				System.out.println("----- ループ終了 -----");
				break;
			}

			switch (input) {
			case "1": {
				queryRooms();
				break;
			}
			case "2": {
				reserve(sc);
				break;
			}
			case "3": {
				checkin(sc);
				break;
			}
			case "4": {
				feedPlay();
				break;
			}
			case "5": {
				checkout(sc);
				break;
			}
			default:
				System.out.println("入力範囲外のため、異常終了");
			}
			
			System.out.println();

		}

		System.out.println("----- 実行終了 -----");
	}
	
	static void queryRooms() {
		System.out.println("----- 空室状況 -----");
		System.out.println(Arrays.toString(hotel));//在pet已重写tostring
		
		System.out.println("----- ペット ソート-----");
		if(currentPetCount > 0) {
			Pet[] pets = new Pet[currentPetCount];
			int i = 0;
			for(Pet pet: hotel) {
				if(pet != null) {
					pets[i] = pet;
					i++;
				}
			}
			sort(pets);
		}
	}
	
	static void sort(Pet[] pets) {
		for(int i = 0; i< pets.length; i++) {
			for(int j = i; j< pets.length; j++) {
				if(pets[i] != null && pets[j] != null && pets[i].getAge() < pets[j].getAge()) {
					Pet pet = pets[i];
					pets[i] = pets[j];
					pets[j] = pet;
				}
			}
		}
		
		System.out.println(Arrays.toString(pets));
	}
	
	static void reserve(Scanner sc) {
		if(currentPetCount < ROOMCOUNT) {
			System.out.println("------ 名前/年齢/性別('f','m')/タイプ('bird','cat','dog') ----");
			String input = sc.nextLine().trim();
			String[] arrays = input.split("/");
			if (arrays.length != 4) {
				System.out.println("入力情報の個数不正のため、異常終了");
				return;
			}
			
			String name = arrays[0];
			int age = Integer.valueOf(arrays[1]);
			Sex sex;
			switch (arrays[2]) {
			case "f": {
				sex = Sex.FEMALE;
				break;
			}
			case "m": {
				sex = Sex.MALE;
				break;
			}
			default:
				System.out.println("入力性別形式不正のため、異常終了");
				return;
			}
			
			Pet pet;
			switch (arrays[3]) {
			case "bird":
				pet = new Bird(name, age, sex, Status.RESERVED);
				break;
			case "dog":
				pet = new Dog(name, age, sex, Status.RESERVED);
				break;
			case "cat":
				pet = new Cat(name, age, sex, Status.RESERVED);
				break;
			default:
				System.out.println("入力タイプ形式不正のため、異常終了");
				return;
			}
			
			for(int i = 0; i<ROOMCOUNT; i++) {
				if(hotel[i] == null) {
					hotel[i] = pet;
					System.out.println("予約成功、ルームNo." + i);
					currentPetCount++;
					return;
				}
			}
		} else {
			System.out.println("空室なし、予約できない");
		}
	}
	
	static void checkin(Scanner sc) {
		System.out.println("------ 名前/ルームNo. ----");
		String input = sc.nextLine().trim();
		String[] arrays = input.split("/");
		if (arrays.length != 2) {
			System.out.println("入力情報の個数不正のため、異常終了");
			return;
		}
		String name = arrays[0];
		int room = Integer.valueOf(arrays[1]);
		if(room < 0 || room >= ROOMCOUNT) {
			System.out.println("ルームNo.入力不正");
			return;
		}
		
		if(hotel[room] == null) {
			System.out.println("予約されていない");
			return;
		}
		
		if(hotel[room] != null && !hotel[room].getName().equals(name)) {
			System.out.println("名前入力不正");
			return;
		}
		
		if(hotel[room] != null && hotel[room].getName().equals(name)) {
			hotel[room].setStatus(Status.CHECKIN);
			System.out.println("チェックイン成功しました。");
		}
	}
	
	static void feedPlay() {
		for(Pet pet: hotel) {
			if(pet != null && pet.getStatus() == Status.CHECKIN) {
				pet.eat();
				if(pet instanceof Fly) {
					((Fly) pet).fly();
				}
				if(pet instanceof Run) {
					((Run) pet).run();
				}
			}			
		}
	}
	
	static void checkout(Scanner sc) {
		System.out.println("------ 名前/ルームNo. ----");
		String input = sc.nextLine().trim();
		String[] arrays = input.split("/");
		if (arrays.length != 2) {
			System.out.println("入力情報の個数不正のため、異常終了");
			return;
		}
		String name =arrays[0];
		int room = Integer.valueOf(arrays[1]);
		if(room < 0 || room >= ROOMCOUNT) {
			System.out.println("ルームNo.入力不正");
			return;
		}
				
		if(hotel[room] == null) {
			System.out.println("予約されていない");
			return;
		}
		
		if(hotel[room] != null && !hotel[room].getName().equals(name)) {
			System.out.println("名前入力不正");
			return;
		}
		if(hotel[room] != null && hotel[room].getName().equals(name)) {
			if(hotel[room].getStatus() == Status.RESERVED) {
				System.out.println("予約をキャンセルしました。");
			} else {
				System.out.println("チェックアウト成功しました。");
			}
			hotel[room] = null;			
			currentPetCount--;
		}
	}

}
