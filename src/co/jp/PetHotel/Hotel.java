package co.jp.PetHotel;

public class Hotel {
	
	Room[][] room;
	
	//Room number/Room type
	public Hotel() {
		room = new Room[3][5];
		//1Dog; 2Cat; 3Bird;
		for(int i = 0; i < room.length; i++) {
			for(int j = 0; j < room[i].length; j++) {
				if(i == 0) {
					room[i][j] = new Room((i + 1) * 100 + j + 1 + "","Standard Room", false);
				}
				if(i == 1) {
					room[i][j] = new Room((i + 1) * 100 + j + 1 + "","Deluxe Room", false);
				}
				if(i == 2) {
					room[i][j] = new Room((i + 1) * 100 + j + 1 + "","Suite", false);
				}
			}
		}
	}
	
	//Room situation
	public void print() {
		for(int i = 0; i < room.length; i++) {
			for(int j = 0; j < room[i].length; j++) {
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Reservation
	public void checkIn(String Id) {
		for(int i = 0; i < room.length; i++) {
			for(int j = 0; j < room[i].length; j++) {
				if(room[i][j].getId().equals(Id)) {
					//Change room situation
					room[i][j].setIsUse(true);
				}
			}
		}
		
	}
	//Checkout
	public void checkOut(String Id) {
		for(int i = 0; i < room.length; i++) {
			for(int j = 0; j < room[i].length; j++) {
				if(room[i][j].getId().equals(Id)) {
					//Change room situation
					room[i][j].setIsUse(false);
				}
			}		
		}			
	}
}
