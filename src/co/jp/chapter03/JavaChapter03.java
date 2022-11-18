package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 100; i++) {
			if(i > 10) {
				break;
			}
			System.out.println(i);
		}
		for(int i = 0; i < 100; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}
}
