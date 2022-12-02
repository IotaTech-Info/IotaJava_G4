package co.jp.Part2_Presentation;

public class Cat extends Pet implements Trim_Bath{

public String hair;

	@Override
	public void trim_bath() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Trimming/Bathing " + name);
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Feeding " + name);
	}

	
}
