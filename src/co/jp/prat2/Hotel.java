package co.jp.prat2;

import java.util.Scanner;

public class Hotel {
	
	Room[] rooms;
	
	public Hotel() {
		
		rooms = new Room[10];
		
		for(int i = 0; i < rooms.length; i++) {
				rooms[i] = new Room();
				rooms[i].setNo(i+1);
                rooms[i].setName(null);
                rooms[i].setAge(0);
                rooms[i].setType(null);
                rooms[i].setChe(true);
                rooms[i].setRes(true);
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	PetType cate = PetType.Cat;
	PetType doge = PetType.Dog;
	PetType birde = PetType.Bird;
	
	public void pri() {
		for(int i = 0; i < rooms.length; i++) {
			System.out.println(rooms[i]);
		}
		System.out.println();
	}
	
	public void checkin(int no) {
		if(rooms[no-1].isChe()==false || rooms[no-1].isRes()==false) {
            System.out.println("ルームは空室ではない");
        }
		else if(rooms[no-1].isChe()==true) {
	    	System.out.println("info input");	
	    	while(true) {
	    		System.out.println("pet情報入力");
	    		System.out.println("名前：");
	    		String name = sc.next();
	    		System.out.println("年齢：");
	    		int age = sc.nextInt();
	    		System.out.println("分類：");
	    		int type = sc.nextInt();
	    		System.out.println("名前："+ name);
	    		System.out.println("年齢："+ age);
	    		if(type == 1) {
	    			System.out.println("分類："+ cate.getType());
	    		}
	    		if(type == 2) {
	    			System.out.println("分類："+ doge.getType());
	    		}
	    		if(type == 3) {
	    			System.out.println("分類："+ birde.getType());
	    		}
	    		System.out.println("確認しますか1yes2no");
			
	    		int confim = sc.nextInt();
	    		switch(confim) {
	    		case 1 :
	    			rooms[no-1].setChe(false);
	    			rooms[no-1].setName(name);
	    			rooms[no-1].setAge(age);
	    			if(type == 1) {
	    				rooms[no-1].setType(cate.getType());
		    		}
		    		if(type == 2) {
		    			rooms[no-1].setType(doge.getType());
		    		}
		    		if(type == 3) {
		    			rooms[no-1].setType(birde.getType());
		    		}
	    			System.out.println("チェックイン完了");
	    			return;
	    		case 2 :
	    			break;
	    		default:
					System.out.println("入力間違");
					break;
	    		}
	    	}
						
        }
	}
	

	public void checkout(int no2) {
		if(rooms[no2-1].isChe()==true) {
			System.out.println("ルームは空室です");
		}		
		else if(rooms[no2-1].isChe()==false) {
			System.out.println(rooms[no2-1]);
			System.out.println("確認しますか1yes2no");
			int confim = sc.nextInt();
	    	switch(confim) {
	    	case 1 :
	    		rooms[no2-1].setRes(true);
	    		rooms[no2-1].setName(null);
	    		rooms[no2-1].setAge(0);
    			rooms[no2-1].setType(null);	
	    		System.out.println("キャンセル完了");
	    		return;
	    	case 2 :
	    		return;
	    	default:
				System.out.println("入力間違");
				break;
	    		
			}
		}
	}
	
	public void reserve(int no3) {
	    if(rooms[no3-1].isChe()==false || rooms[no3-1].isRes()==false) {
            System.out.println("ルームは空室ではない");
        }
	    else if(rooms[no3-1].isRes()==true) {
	    	System.out.println("info input");	
	    	while(true) {
	    		System.out.println("pet情報入力");
	    		System.out.println("名前：");
	    		String name = sc.next();
	    		System.out.println("年齢：");
	    		int age = sc.nextInt();
	    		System.out.println("分類：");
	    		int type = sc.nextInt();
	    		System.out.println("名前："+ name);
	    		System.out.println("年齢："+ age);
	    		if(type == 1) {
	    			System.out.println("分類："+ cate.getType());
	    		}
	    		if(type == 2) {
	    			System.out.println("分類："+ doge.getType());
	    		}
	    		if(type == 3) {
	    			System.out.println("分類："+ birde.getType());
	    		}
	    		System.out.println("確認しますか1yes2no");
			
	    		int confim = sc.nextInt();
	    		switch(confim) {
	    		case 1 :
	    			rooms[no3-1].setRes(false);
	    			rooms[no3-1].setName(name);
	    			rooms[no3-1].setAge(age);
	    			if(type == 1) {
	    				rooms[no3-1].setType(cate.getType());
		    		}
		    		if(type == 2) {
		    			rooms[no3-1].setType(doge.getType());
		    		}
		    		if(type == 3) {
		    			rooms[no3-1].setType(birde.getType());
		    		}
	    			System.out.println("予約完了");
	    			return;
	    		case 2 :
	    			break;
	    		default:
					System.out.println("入力間違");
					break;
	    		}
	    	}
						
        }
	}
	
	public void cancel(int no4) {	
		if(rooms[no4-1].isRes()==true) {
            System.out.println("ルームは予約していません");
        }
		else if(rooms[no4-1].isRes()==false) {
			System.out.println(rooms[no4-1]);
			System.out.println("確認しますか1yes2no");
			int confim = sc.nextInt();

	    	switch(confim) {
	    	case 1 :
	    		rooms[no4-1].setRes(true);
	    		rooms[no4-1].setName(null);
	    		rooms[no4-1].setAge(0);
    			rooms[no4-1].setType(null);	
	    		System.out.println("キャンセル完了");
	    		return;
	    	case 2 :
	    		return;
	    	default:
				System.out.println("入力間違");
				break;
	    	}
		}
		
	}
	
	public void feed(String name) {
		for(int i = 0; i < rooms.length; i++) {
			if(name.equals(rooms[i].getName())){
				System.out.println(rooms[i]);
				System.out.println("給食しますか1yes2no");
				int confim = sc.nextInt();
				while(true) {
					switch(confim) {
			    	case 1 :
			    		Cat cat = new Cat(rooms[i].getName(), rooms[i].getAge(),rooms[i].getType());
			    		if(cate.getType().equals(rooms[i].getType())) {
							cat.meat();
			    		}
			    		Dog dog = new Dog(rooms[i].getName(), rooms[i].getAge(),rooms[i].getType());
			    		if(doge.getType().equals(rooms[i].getType())) {
			    			dog.meat();
			    			dog.beans();
			    		}
			    		Bird bird = new Bird(rooms[i].getName(), rooms[i].getAge(),rooms[i].getType());
			    		if(birde.getType().equals(rooms[i].getType())) {
			    			bird.beans();
			    		}
			    		System.out.println("給食完了");
			     		return;
			    	case 2 :
			    		return;
			    	default:
						System.out.println("入力間違");
						break;
					}

				}

			}
		

		}
	
	}
	
	
}
