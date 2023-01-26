package co.jp.part3;

import java.util.Date;

public class Animal {
	private String card;// 证件号
	private String name;// 姓名
	private int age;// 年龄
	private AnimalType type;// 动物种类
	private int roomNo;// 房间号
	private Date startDate;// 入住时间
	private Date endDate;// 到期时间
	private boolean isIn;// 是否入住,默认false
	private boolean isLeave;// 是否退房，默认false

	public Animal(String card, String name, int age, AnimalType type, int roomNo, Date startDate, Date endDate,
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
		System.out.println("动物正在享用晚餐");
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

	public AnimalType getType() {
		return type;
	}

	public void setType(AnimalType type) {
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
		return "证件号:" + card + ", 姓名:" + name + ", 年龄:" + age + ", 类型" + type + ", 房间号:" + roomNo + ", 入住时间:"
				+ startDate + ", 离店时间:" + endDate + ", 是否入住:" + (isIn ? "是" : "否") + ", 是否退房:" + (isLeave ? "是" : "否");
	}
}
