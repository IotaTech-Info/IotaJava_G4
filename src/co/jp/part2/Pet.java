package co.jp.part2;

public abstract class Pet {



	public String name;

	public int age;

	public String type;
	
	static int COUNT = 0;
	public boolean RoomIsFree = true;

	
	public Pet(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public boolean isRoomIsFree() {
		return RoomIsFree;
	}

	public void setRoomIsFree(boolean roomIsFree) {
		RoomIsFree = roomIsFree;
	}

	abstract void eat();
	
	//

}
