package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 5;
		int b = 4;
		
		System.out.println("足し算："+sum(a,b));
		System.out.println("引き算："+minus(a,b));
		
	}
	
	static int sum (int item1,int item2)
	{
		return item1 + item2;
	}
	
	static int minus (int item1,int item2)
	{
		return item1 - item2;
	}
	

}
