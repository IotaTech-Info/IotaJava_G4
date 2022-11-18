package co.jp.part2;

public class Employee {
	String name;

	int cost;//员工价格
	
	int max;//该员工可照顾宠物上限数量
	
	Pet[] pets= new Pet[max];

	Skill skill;//技能
	
	int code;
	
	public enum Skill{
		BASE,//基础
		BEAUTY,//美容师
		DOCTOR,//医生
		DOG_COACH,//训狗师
		MAX
	};
	
	
}
