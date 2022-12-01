package co.jp.Part2_Presentation;

public class Dog extends Pet implements Walk, Trim_Bath{




	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Feeding " + name + "dog food.");
	}

	@Override
	public void walk() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Walking " + name);
	}
	@Override
	public void trim_bath() {
		System.out.println("Trimming/bathing " + name);
	}

}
