package pethotel;

import java.util.Date;

public  class Pet {
	private String card;// ID番号
	private String name;// 名前
	private int age;//　年齢
	private PetType type;// 種類
	private int roomNo;// 部屋番号
	private Date startDate;// チェックイン時間
	private Date endDate;// チェックアウト時間
	private boolean isIn;// チェックインしましたか？デフォルトfalse
	private boolean isLeave;// チェックアウトしましたか？デフォルトfalse

	public Pet(String card, String name, int age, PetType type, int roomNo, Date startDate, Date endDate,
			boolean isIn, boolean isLeave) {
		super();
		this.card = card;
		this.name = name;
		this.age = age;
		this.type = type;
		this.roomNo = roomNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isIn = isIn;
		this.isLeave = isLeave;
	}


	public void eat() {
		
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
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

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isIn() {
		return isIn;
	}

	public void setIn(boolean isIn) {
		this.isIn = isIn;
	}

	public boolean isLeave() {
		return isLeave;
	}

	public void setLeave(boolean isLeave) {
		this.isLeave = isLeave;
	}

	@Override
	public String toString() {
		return "ID番号:" + card + "　　名前:" + name + "　　年齢:" + age + "　　種類" + type + "　　部屋番号:" + roomNo + "　　チェックイン時間:"
				+ startDate + "　　チェックアウト時間:" + endDate + "　　チェックインしましたか？:" + (isIn ? "はい" : "いいえ") + "　　チェックアウトしましたか？:" + (isLeave ? "はい" : "いいえ");
	}
}
