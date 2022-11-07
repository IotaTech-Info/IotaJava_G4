package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 1;
		int x = 1;
		while (num < 10) {
			x = x*(num+1);     //x=1*2, x =(1*2)*3. x=(1*2)*3*4
			num=num+1 ;
		}
		System.out.println(x);
	}
}
