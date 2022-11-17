package co.jp.part2;

import java.util.Scanner;

public class PetHotel {
	public Room[][]rooms;
	Scanner sc = new Scanner(System.in);
	public PetHotel () {
//		String str ="abc";
//		Room r101 =new Room(1,0,"land"); 
//		
		//ROOM情報を出力します
		rooms= new Room[2][10];
		for(int i=0;i<rooms.length;i++) {
			for(int j = 0; j<rooms[i].length;j++) {
				int roomNumber = 0;
				if(i==0) {
					roomNumber = (i+1)*100+j+1;
					rooms[i][j] =new Room(roomNumber,"land",true);
					System.out.println("For room land-"+roomNumber +", isEmpty: "+rooms[i][j].status);
				}else if(i==1) {
					roomNumber = (i+1)*100+j+1;
				rooms[i][j] =new Room(roomNumber,"fly",true);
				System.out.println("For room fly-"+roomNumber+", isEmpty: "+rooms[i][j].status);
				}
				
				
			}
		}
		
	}
	
	//booking room
	public void order() {
		
		String name ="", type = "";
		int age = 0, roomNo = 0;

		System.out.println("please enter the information of your pet,(split by comma'name, age, type, roomNo')");
		String info = sc.next()+",";
		

		int flag = 0;
		String temp ="";

		for(int i = 0; i < info.length();i++) {
			char cur = info.charAt(i);
			if (cur!=','){
				temp = temp + cur;
			}else {
				if(flag == 0) {
					name = temp;
				}else if (flag ==1) {
					age = Integer.parseInt(temp);
				}else if(flag ==2) {
					type = temp;
				} else if (flag == 3) {
					roomNo = Integer.parseInt(temp);
				}
				temp = "";
				flag++;
			}
		}
		

		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		if(room.isStatus()== true) {
		Pet myPet = null;
		if (type.equalsIgnoreCase("cat") ) {
			myPet = new Cat(name, age, "cat");
		} else if (type.equalsIgnoreCase("dog")) {
			myPet = new Dog(name, age, "dog");
		} else if (type.equalsIgnoreCase("bird")) {
			myPet = new Bird(name, age, "bird");
		}
		room.pet = myPet;
		room.setStatus(false);
		System.out.println("部屋"+roomNo+"予約しました");
		print();
		}else {
			room.setStatus(false);
			System.out.println("この部屋が予約されました");
			
		}

		
	}
	
	//cancel
	public void cancel() {
		System.out.println("please enter the room number");
		int roomNo = sc.nextInt();
		String name ="", type = "";
		int age = 0;

		System.out.println("please enter the information of your pet,(split by comma'name, age, type,roomNo')");
		String info = sc.next()+",";
		

		int flag = 0;
		String temp ="";

		for(int i = 0; i < info.length();i++) {
			char cur = info.charAt(i);
			if (cur!=','){
				temp = temp + cur;
			}else {
				if(flag == 0) {
					name = temp;
				}else if (flag ==1) {
					age = Integer.parseInt(temp);
				}else if(flag ==2) {
					type = temp;
				}
				temp = "";
				flag++;
			}
		}
		
		
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		if(room.pet.name.equals(name)&&room.pet.age == (age)&&room.pet.type.equals(type)){
		room.pet = null;
		room.setStatus(true);
		System.out.println("部屋"+roomNo+"の予約が取消しました");
		}else {
			System.out.println("入力が間違いました");
		
		}
	}
	//checkin
	public void checkin() {
		System.out.println("ご予約がされてますか?　1.ある。2.なし");
		int re = sc.nextInt();
		if(re == 1) {
		
			String name ="", type = "";
			int age = 0,roomNo=0;
		
			System.out.println("please enter the information of your pet,(split by comma'name, age, type')");
			String info = sc.next();
		
			int flag = 0;
			String temp ="";

			for(int i = 0; i < info.length();i++) {
				char cur = info.charAt(i);
				if (cur!=','){
					temp = temp + cur;
				}else {
					if(flag == 0) {
						name = temp;
					}else if (flag ==1) {
						age = Integer.parseInt(temp);
					}else if(flag ==2) {
						type = temp;
					}
					temp = "";
					flag++;
				}
			}
			Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
			if(room.no == roomNo&&room.pet.name.equals(name)&&room.pet.age == (age)&&room.pet.type.equals(type)) {
					System.out.println("チェックインができました");
			}else {
				System.out.println("入力が間違いました");
			}	
		}else if( re == 2){
			System.out.println("先にご予約をお願いします。");
		}
		
		
	}
	//checkout
	public void checkout() {
		System.out.println("please enter the room number");
		int roomNo = sc.nextInt();
		String name ="", type = "";
		int age = 0;

		System.out.println("please enter the information of your pet,(split by comma'name, age, type')");
		String info = sc.next()+",";
		

		int flag = 0;
		String temp ="";

		for(int i = 0; i < info.length();i++) {
			char cur = info.charAt(i);
			if (cur!=','){
				temp = temp + cur;
			}else {
				if(flag == 0) {
					name = temp;
				}else if (flag ==1) {
					age = Integer.parseInt(temp);
				}else if(flag ==2) {
					type = temp;
				}
				temp = "";
				flag++;
			}
		}
		
		
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		if(room.pet.name.equals(name)&&room.pet.age == (age)&&room.pet.type.equals(type)){
		room.pet = null;
		room.setStatus(true);
		System.out.println("チェックアウトできました");
		}else {
			System.out.println("入力が間違いました");
		
		}
	}

	public void feed() {
		System.out.println("please enter the information of your pet,(split by comma'name, age, type,roomNo')");
		String info = sc.next()+",";
		
		String name ="", type = "";
		int age = 0,roomNo = 0;
		
		int flag = 0;
		String temp ="";

		for(int i = 0; i < info.length();i++) {
			char cur = info.charAt(i);
			if (cur!=','){
				temp = temp + cur;
			}else {
				if(flag == 0) {
					name = temp;
				}else if (flag ==1) {
					age = Integer.parseInt(temp);
				}else if(flag ==2) {
					type = temp;
				}
				temp = "";
				flag++;
			}
		}
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		if(room.no == roomNo&&room.pet.name.equals(name)&&room.pet.age == (age)&&room.pet.type.equals(type)){
			System.out.print("御飯を挙げますか? 1.はい、2．いいえ");
		}
		int re2 = sc.nextInt();
		if( re2 == 1) {
			if(room.pet.type ==("cat")) {
				room.pet.feed();
				System.out.println("ニヤー、食べました");
			}else if(room.pet.type.equals("dog")) {
				room.pet.feed();
				System.out.println("ワン、食べました");
			}else if(room.pet.type.equals("bird")) {
				room.pet.feed();
				System.out.println("ジュー、食べました");
			}
		}
	}

	public void print() {
		
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0;i<rooms.length;i++) {
			for(int j = 0;j<rooms[i].length;j++) {
				System.out.print(rooms[i][j]);
			}
		 System.out.println();
		}
		
	}
	
//	public void print() {
//		for(int i = 0;i<rooms.length;i++) {
//			for(int j = 0;j<rooms[i].length;j++) {
//				System.out.print(rooms);
//			}
//			System.out.println();
		
	}
 
 

	

