package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i=" +i+" +j+ "+"  ");
				if (i==j) {
					System.out.println("" +i+j+" ");
				}else {
					System.out.println("   ");
				}
			}
			System.out.println();
			
		}
		
	}
}
