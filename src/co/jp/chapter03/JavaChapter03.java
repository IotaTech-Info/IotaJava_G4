package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int length = 20;
		for (int i=0;i<=20;i++) {
			for (int j=0;j<=20;j++) {
//				if(i- j == 0.5*length||j- i == 0.5*length||j+ i == 0.5*length||j+ i == 1.5*length) {
				int x=i-10;
				int y=j-10;
				if(Math.sqrt(x*x+y*y )<=0.5*length-0.75 && Math.sqrt(x*x+y*y ) >= 0.5*length-1.25) {
					System.out.print(""+i+j+"");
				}else {
					System.out.print("  ");
				}
			}
		System.out.println("");
		}
	}
}
