package co.jp.part3;

public class Employee {
	int code;
	String name;
	int skill;
	int max;
	int cost;
	String[] hold;

	public enum Skill {
		BASE, // 基础
		BEAUTY, // 美容师
		DOCTOR, // 医生
		DOG_COACH, // 训狗师
		MAX
	};

	public Employee() {
		// TODO 自動生成されたコンストラクター・スタブ
	
	}

	public static String getEmployeeTypeString(Employee employee) {
		String position = null;
		switch (Skill.values()[employee.skill]) {
		case BASE:
			position = "一般スタッフ";
			break;
		case BEAUTY:
			position = "美容師";
			break;
		case DOCTOR:
			position = "医者";
			break;
		case DOG_COACH:
			position = "犬の訓練士";
			break;
		default:
			break;

		}
		return position;
	}

	

}
