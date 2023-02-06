package co.jp.part3_final;

public class Room {
	private final int roomID;
	private int state = 0;
	private final ROOM_TYPE type;
	private Pet pet;
	public boolean active;
	private double price = 0;
	
	public Room(ROOM_TYPE type, int roomID) {
		this.type = type;
		this.roomID = roomID;
	}
	
	public void doDailyTask() {
		switch(state) {
			case 0:
				break;
			case 1:
				price += type.getPrice();
				price += pet.food.price;
				pet.eat();
				if (active) {
					price += 500;
					pet.active();
				}
				break;
			case 2:
				state = 0;
				break;
		}
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
		if (pet == null) {
			state = 2;
			price = 0;
			active = false;
		} else {
			state = 1;
		}
	}
	
	public void setActive(boolean b) {
		this.active = b;
	}
	
	@Deprecated
	public boolean marchRoomID(String roomID) {
		if (roomID.equals(String.valueOf(this.roomID))) {
			return true;
		}
		return false;
	}
	
	public int getRoomID() {
		return roomID;
	}
	
	public int getState() {
		return state;
	}
	
	public String getStateExplain() {
		switch (state) {
			case 0:
				return "空闲中";
			case 1:
				return "有人中";
			case 2:
				return "清扫中";
		}
		return "";
	}
	
	public ROOM_TYPE getRoomType() {
		return type;
	}
	public Pet getPet() {
		return pet;
	}
	public double getPrice() {
		return price;
	}
}
