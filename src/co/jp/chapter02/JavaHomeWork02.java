package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		int l = 11;
		
		for(int i = 0;i < l;i++) {
			for(int j = 0;j<l;j++) {
				if(i==j||i+j == 10 ||i==5||j==5) {
					System.out.print(""+i+j+"  ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}
