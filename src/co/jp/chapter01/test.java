package co.jp.chapter01;
import java.util.Scanner;

class Cat{
	private String Name, Sleep;
	private int Age;
	
	public void SetName(String nm) {
		Name = nm;
	};
	
	public void SetAge(int age) {
		Age = age;
	};

	public void ShowProfile() {
		System.out.println("名前は、"+ Name + "、年齢は、"+ Age + "歳です");
	}	
	public void Sleep(String sleep) {
		Sleep = sleep;
		if (Sleep.equals("Sleep")) {
			System.out.println("スース―");
		}
	}
}

public class test {	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ		
		Cat newcat = new Cat();
		Scanner n = new Scanner(System.in);
	    System.out.println("睡眠時間！");		
	    String Sleep = n.nextLine();
	    newcat.Sleep(Sleep);
	    
	    System.out.println("名前を入力してください：");		
	    String Name = n.nextLine();
	    
	    System.out.println("年齢を入力してください：");		
	    int y = n.nextInt();
	    

	    newcat.SetName(Name);
	    newcat.SetAge(y);
	    newcat.ShowProfile();
	}
}
