package co.jp.pethotel;


public class Hotel extends Pet {
	String name = "";

	int age;

	String type = "";

	public static int COUNT = 0;
	
	int roomnum;
	
	String date = "";

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}



	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRoomnum() {
		return roomnum;
	}

	public void setRoomnum(int roomnum) {
		this.roomnum = roomnum;
	}

	public String toString() {

		return "[" + roomnum + "号室: " + name + " , " + age + "歳, " + type + ",チェックイン時間：" + date +"]";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
